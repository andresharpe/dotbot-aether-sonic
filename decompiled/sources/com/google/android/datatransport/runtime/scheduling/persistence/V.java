package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class V extends SQLiteOpenHelper {

    /* renamed from: G, reason: collision with root package name */
    static final String f27624G = "com.google.android.datatransport.events";

    /* renamed from: H, reason: collision with root package name */
    private static final String f27625H = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";

    /* renamed from: I, reason: collision with root package name */
    private static final String f27626I = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";

    /* renamed from: J, reason: collision with root package name */
    private static final String f27627J = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";

    /* renamed from: K, reason: collision with root package name */
    private static final String f27628K = "CREATE INDEX events_backend_id on events(context_id)";

    /* renamed from: L, reason: collision with root package name */
    private static final String f27629L = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";

    /* renamed from: M, reason: collision with root package name */
    private static final String f27630M = "DROP TABLE events";

    /* renamed from: N, reason: collision with root package name */
    private static final String f27631N = "DROP TABLE event_metadata";

    /* renamed from: O, reason: collision with root package name */
    private static final String f27632O = "DROP TABLE transport_contexts";

    /* renamed from: P, reason: collision with root package name */
    private static final String f27633P = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";

    /* renamed from: Q, reason: collision with root package name */
    private static final String f27634Q = "DROP TABLE IF EXISTS event_payloads";

    /* renamed from: R, reason: collision with root package name */
    private static final String f27635R = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";

    /* renamed from: S, reason: collision with root package name */
    private static final String f27636S = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";

    /* renamed from: U, reason: collision with root package name */
    private static final String f27638U = "DROP TABLE IF EXISTS log_event_dropped";

    /* renamed from: V, reason: collision with root package name */
    private static final String f27639V = "DROP TABLE IF EXISTS global_log_event_state";

    /* renamed from: X, reason: collision with root package name */
    private static final a f27641X;

    /* renamed from: Y, reason: collision with root package name */
    private static final a f27642Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final a f27643Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final a f27644a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final a f27645b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final List<a> f27646c0;

    /* renamed from: E, reason: collision with root package name */
    private final int f27647E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f27648F;

    /* renamed from: T, reason: collision with root package name */
    private static final String f27637T = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: W, reason: collision with root package name */
    static int f27640W = 5;

    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.P
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.V.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                V.i(sQLiteDatabase);
            }
        };
        f27641X = aVar;
        a aVar2 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.Q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.V.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                V.j(sQLiteDatabase);
            }
        };
        f27642Y = aVar2;
        a aVar3 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.S
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.V.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f27643Z = aVar3;
        a aVar4 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.T
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.V.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                V.m(sQLiteDatabase);
            }
        };
        f27644a0 = aVar4;
        a aVar5 = new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.U
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.V.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                V.n(sQLiteDatabase);
            }
        };
        f27645b0 = aVar5;
        f27646c0 = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public V(Context context, @O2.b("SQLITE_DB_NAME") String str, @O2.b("SCHEMA_VERSION") int i4) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i4);
        this.f27648F = false;
        this.f27647E = i4;
    }

    private void h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f27648F) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f27625H);
        sQLiteDatabase.execSQL(f27626I);
        sQLiteDatabase.execSQL(f27627J);
        sQLiteDatabase.execSQL(f27628K);
        sQLiteDatabase.execSQL(f27629L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(f27634Q);
        sQLiteDatabase.execSQL(f27633P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f27638U);
        sQLiteDatabase.execSQL(f27639V);
        sQLiteDatabase.execSQL(f27635R);
        sQLiteDatabase.execSQL(f27636S);
        sQLiteDatabase.execSQL(f27637T);
    }

    private void p(SQLiteDatabase sQLiteDatabase, int i4) {
        h(sQLiteDatabase);
        t(sQLiteDatabase, 0, i4);
    }

    private void t(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        List<a> list = f27646c0;
        if (i5 <= list.size()) {
            while (i4 < i5) {
                f27646c0.get(i4).a(sQLiteDatabase);
                i4++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i4 + " to " + i5 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f27648F = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        p(sQLiteDatabase, this.f27647E);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        sQLiteDatabase.execSQL(f27630M);
        sQLiteDatabase.execSQL(f27631N);
        sQLiteDatabase.execSQL(f27632O);
        sQLiteDatabase.execSQL(f27634Q);
        sQLiteDatabase.execSQL(f27638U);
        sQLiteDatabase.execSQL(f27639V);
        p(sQLiteDatabase, i5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        h(sQLiteDatabase);
        t(sQLiteDatabase, i4, i5);
    }
}

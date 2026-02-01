package com.google.android.datatransport.runtime.scheduling.persistence;

import B0.a;
import N0.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.annotation.j0;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.a;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import z0.C2447a;

@O2.f
@j0
/* loaded from: classes.dex */
public class N implements InterfaceC1134d, B0.a, InterfaceC1133c {

    /* renamed from: J, reason: collision with root package name */
    private static final String f27608J = "SQLiteEventStore";

    /* renamed from: K, reason: collision with root package name */
    static final int f27609K = 16;

    /* renamed from: L, reason: collision with root package name */
    private static final int f27610L = 50;

    /* renamed from: M, reason: collision with root package name */
    private static final com.google.android.datatransport.c f27611M = com.google.android.datatransport.c.b("proto");

    /* renamed from: E, reason: collision with root package name */
    private final V f27612E;

    /* renamed from: F, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27613F;

    /* renamed from: G, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f27614G;

    /* renamed from: H, reason: collision with root package name */
    private final AbstractC1135e f27615H;

    /* renamed from: I, reason: collision with root package name */
    private final x0.e<String> f27616I;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f27617a;

        /* renamed from: b, reason: collision with root package name */
        final String f27618b;

        private c(String str, String str2) {
            this.f27617a = str;
            this.f27618b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @O2.a
    public N(@com.google.android.datatransport.runtime.time.h com.google.android.datatransport.runtime.time.a aVar, @com.google.android.datatransport.runtime.time.b com.google.android.datatransport.runtime.time.a aVar2, AbstractC1135e abstractC1135e, V v3, @O2.b("PACKAGE_NAME") x0.e<String> eVar) {
        this.f27612E = v3;
        this.f27613F = aVar;
        this.f27614G = aVar2;
        this.f27615H = abstractC1135e;
        this.f27616I = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List A1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.q.a().b(cursor.getString(1)).d(C0.a.b(cursor.getInt(2))).c(Q1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List B1(com.google.android.datatransport.runtime.q qVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC1141k> O12 = O1(sQLiteDatabase, qVar);
        return n1(O12, P1(sQLiteDatabase, O12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a C1(Map map, a.C0257a c0257a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason E02 = E0(cursor.getInt(1));
            long j4 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.d().c(E02).b(j4).a());
        }
        R1(c0257a, map);
        c0257a.f(j1());
        c0257a.d(f1());
        c0257a.c(this.f27616I.get());
        return c0257a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.a D1(String str, final Map map, final a.C0257a c0257a, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.a) W1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a C12;
                C12 = N.this.C1(map, c0257a, (Cursor) obj);
                return C12;
            }
        });
    }

    private LogEventDropped.Reason E0(int i4) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i4 == reason.b()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i4 == reason2.b()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i4 == reason3.b()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i4 == reason4.b()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i4 == reason5.b()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i4 == reason6.b()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i4 == reason7.b()) {
            return reason7;
        }
        C2447a.c(f27608J, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i4));
        return reason;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object E1(List list, com.google.android.datatransport.runtime.q qVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z3 = false;
            long j4 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z3 = true;
            }
            j.a k4 = com.google.android.datatransport.runtime.j.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z3) {
                k4.h(new com.google.android.datatransport.runtime.i(U1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k4.h(new com.google.android.datatransport.runtime.i(U1(cursor.getString(4)), S1(j4)));
            }
            if (!cursor.isNull(6)) {
                k4.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1141k.a(j4, qVar, k4.d()));
        }
        return null;
    }

    private void F0(final SQLiteDatabase sQLiteDatabase) {
        T1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.F
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.d
            public final Object a() {
                Object r12;
                r12 = N.r1(sQLiteDatabase);
                return r12;
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.G
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object s12;
                s12 = N.s1((Throwable) obj);
                return s12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object F1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j4 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j4));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j4), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long G1(com.google.android.datatransport.runtime.j jVar, com.google.android.datatransport.runtime.q qVar, SQLiteDatabase sQLiteDatabase) {
        boolean z3;
        byte[] bArr;
        if (m1()) {
            d(1L, LogEventDropped.Reason.CACHE_FULL, jVar.l());
            return -1L;
        }
        long M02 = M0(sQLiteDatabase, qVar);
        int e4 = this.f27615H.e();
        byte[] a4 = jVar.e().a();
        if (a4.length <= e4) {
            z3 = true;
        } else {
            z3 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(M02));
        contentValues.put("transport_name", jVar.l());
        contentValues.put("timestamp_ms", Long.valueOf(jVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(jVar.m()));
        contentValues.put("payload_encoding", jVar.e().b().a());
        contentValues.put(com.spotify.sdk.android.auth.a.f48965k, jVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z3));
        if (z3) {
            bArr = a4;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z3) {
            int ceil = (int) Math.ceil(a4.length / e4);
            for (int i4 = 1; i4 <= ceil; i4++) {
                byte[] copyOfRange = Arrays.copyOfRange(a4, (i4 - 1) * e4, Math.min(i4 * e4, a4.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i4));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : jVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(a.C0015a.f1688b, entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] H1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i4 += blob.length;
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            byte[] bArr2 = (byte[]) arrayList.get(i6);
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object I1(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object J1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        W1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.M
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object I12;
                I12 = N.this.I1((Cursor) obj);
                return I12;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean K1(Cursor cursor) {
        boolean z3;
        if (cursor.getCount() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object L1(String str, LogEventDropped.Reason reason, long j4, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) W1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.b())}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Boolean K12;
                K12 = N.K1((Cursor) obj);
                return K12;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.b()));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.b())});
        }
        return null;
    }

    private long M0(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.q qVar) {
        Long k12 = k1(sQLiteDatabase, qVar);
        if (k12 != null) {
            return k12.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", qVar.b());
        contentValues.put("priority", Integer.valueOf(C0.a.a(qVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (qVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(qVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object M1(long j4, com.google.android.datatransport.runtime.q qVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j4));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{qVar.b(), String.valueOf(C0.a.a(qVar.d()))}) < 1) {
            contentValues.put("backend_name", qVar.b());
            contentValues.put("priority", Integer.valueOf(C0.a.a(qVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object N1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f27613F.a()).execute();
        return null;
    }

    private List<AbstractC1141k> O1(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.q qVar) {
        final ArrayList arrayList = new ArrayList();
        Long k12 = k1(sQLiteDatabase, qVar);
        if (k12 == null) {
            return arrayList;
        }
        W1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", com.spotify.sdk.android.auth.a.f48965k, "inline"}, "context_id = ?", new String[]{k12.toString()}, null, null, null, String.valueOf(this.f27615H.d())), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object E12;
                E12 = N.this.E1(arrayList, qVar, (Cursor) obj);
                return E12;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> P1(SQLiteDatabase sQLiteDatabase, List<AbstractC1141k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(list.get(i4).c());
            if (i4 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        W1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", a.C0015a.f1688b, "value"}, sb.toString(), null, null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object F12;
                F12 = N.F1(hashMap, (Cursor) obj);
                return F12;
            }
        });
        return hashMap;
    }

    private static byte[] Q1(@androidx.annotation.P String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void R1(a.C0257a c0257a, Map<String, List<LogEventDropped>> map) {
        for (Map.Entry<String, List<LogEventDropped>> entry : map.entrySet()) {
            c0257a.a(com.google.android.datatransport.runtime.firebase.transport.c.d().d(entry.getKey()).c(entry.getValue()).b());
        }
    }

    private byte[] S1(long j4) {
        return (byte[]) W1(a1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num"), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                byte[] H12;
                H12 = N.H1((Cursor) obj);
                return H12;
            }
        });
    }

    private <T> T T1(d<T> dVar, b<Throwable, T> bVar) {
        long a4 = this.f27614G.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e4) {
                if (this.f27614G.a() >= this.f27615H.b() + a4) {
                    return bVar.apply(e4);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static com.google.android.datatransport.c U1(@androidx.annotation.P String str) {
        if (str == null) {
            return f27611M;
        }
        return com.google.android.datatransport.c.b(str);
    }

    private static String V1(Iterable<AbstractC1141k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC1141k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @i0
    static <T> T W1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private com.google.android.datatransport.runtime.firebase.transport.b f1() {
        return com.google.android.datatransport.runtime.firebase.transport.b.d().b(com.google.android.datatransport.runtime.firebase.transport.d.d().b(Y0()).c(AbstractC1135e.f27670f.f()).a()).a();
    }

    private long h1() {
        return a1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long i1() {
        return a1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private com.google.android.datatransport.runtime.firebase.transport.e j1() {
        final long a4 = this.f27613F.a();
        return (com.google.android.datatransport.runtime.firebase.transport.e) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.B
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.e w12;
                w12 = N.w1(a4, (SQLiteDatabase) obj);
                return w12;
            }
        });
    }

    @androidx.annotation.P
    private Long k1(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.q qVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qVar.b(), String.valueOf(C0.a.a(qVar.d()))));
        if (qVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(qVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) W1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Long x12;
                x12 = N.x1((Cursor) obj);
                return x12;
            }
        });
    }

    private boolean m1() {
        if (h1() * i1() >= this.f27615H.f()) {
            return true;
        }
        return false;
    }

    private List<AbstractC1141k> n1(List<AbstractC1141k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC1141k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1141k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                j.a n4 = next.b().n();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    n4.c(cVar.f27617a, cVar.f27618b);
                }
                listIterator.set(AbstractC1141k.a(next.c(), next.d(), n4.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o1(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer p1(long j4, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j4)};
        W1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.E
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object o12;
                o12 = N.this.o1((Cursor) obj);
                return o12;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object s1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase t1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long u1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.e v1(long j4, Cursor cursor) {
        cursor.moveToNext();
        return com.google.android.datatransport.runtime.firebase.transport.e.d().c(cursor.getLong(0)).b(j4).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.android.datatransport.runtime.firebase.transport.e w1(final long j4, SQLiteDatabase sQLiteDatabase) {
        return (com.google.android.datatransport.runtime.firebase.transport.e) W1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.D
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.e v12;
                v12 = N.v1(j4, (Cursor) obj);
                return v12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long x1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean y1(com.google.android.datatransport.runtime.q qVar, SQLiteDatabase sQLiteDatabase) {
        Long k12 = k1(sQLiteDatabase, qVar);
        if (k12 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) W1(a1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{k12.toString()}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.H
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List z1(SQLiteDatabase sQLiteDatabase) {
        return (List) W1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                List A12;
                A12 = N.A1((Cursor) obj);
                return A12;
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void B0() {
        l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.I
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object q12;
                q12 = N.q1((SQLiteDatabase) obj);
                return q12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public Iterable<AbstractC1141k> C(final com.google.android.datatransport.runtime.q qVar) {
        return (Iterable) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.J
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                List B12;
                B12 = N.this.B1(qVar, (SQLiteDatabase) obj);
                return B12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    @androidx.annotation.P
    public AbstractC1141k I0(final com.google.android.datatransport.runtime.q qVar, final com.google.android.datatransport.runtime.j jVar) {
        C2447a.e(f27608J, "Storing event with priority=%s, name=%s for destination %s", qVar.d(), jVar.l(), qVar.b());
        long longValue = ((Long) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Long G12;
                G12 = N.this.G1(jVar, qVar, (SQLiteDatabase) obj);
                return G12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC1141k.a(longValue, qVar, jVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public void J(final com.google.android.datatransport.runtime.q qVar, final long j4) {
        l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object M12;
                M12 = N.M1(j4, qVar, (SQLiteDatabase) obj);
                return M12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public long O0(com.google.android.datatransport.runtime.q qVar) {
        return ((Long) W1(a1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{qVar.b(), String.valueOf(C0.a.a(qVar.d()))}), new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.C
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Long u12;
                u12 = N.u1((Cursor) obj);
                return u12;
            }
        })).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public Iterable<com.google.android.datatransport.runtime.q> Q() {
        return (Iterable) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.A
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                List z12;
                z12 = N.z1((SQLiteDatabase) obj);
                return z12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public boolean S0(final com.google.android.datatransport.runtime.q qVar) {
        return ((Boolean) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Boolean y12;
                y12 = N.this.y1(qVar, (SQLiteDatabase) obj);
                return y12;
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public void T0(Iterable<AbstractC1141k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + V1(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object J12;
                J12 = N.this.J1(str, str2, (SQLiteDatabase) obj);
                return J12;
            }
        });
    }

    @i0
    long Y0() {
        return h1() * i1();
    }

    @Override // B0.a
    public <T> T a(a.InterfaceC0001a<T> interfaceC0001a) {
        SQLiteDatabase a12 = a1();
        F0(a12);
        try {
            T a4 = interfaceC0001a.a();
            a12.setTransactionSuccessful();
            return a4;
        } finally {
            a12.endTransaction();
        }
    }

    @i0
    SQLiteDatabase a1() {
        final V v3 = this.f27612E;
        Objects.requireNonNull(v3);
        return (SQLiteDatabase) T1(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.K
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.d
            public final Object a() {
                return V.this.getWritableDatabase();
            }
        }, new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.L
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                SQLiteDatabase t12;
                t12 = N.t1((Throwable) obj);
                return t12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1133c
    public void b() {
        l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object N12;
                N12 = N.this.N1((SQLiteDatabase) obj);
                return N12;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1133c
    public com.google.android.datatransport.runtime.firebase.transport.a c() {
        final a.C0257a h4 = com.google.android.datatransport.runtime.firebase.transport.a.h();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (com.google.android.datatransport.runtime.firebase.transport.a) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                com.google.android.datatransport.runtime.firebase.transport.a D12;
                D12 = N.this.D1(str, hashMap, h4, (SQLiteDatabase) obj);
                return D12;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27612E.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1133c
    public void d(final long j4, final LogEventDropped.Reason reason, final String str) {
        l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Object L12;
                L12 = N.L1(str, reason, j4, (SQLiteDatabase) obj);
                return L12;
            }
        });
    }

    @i0
    <T> T l1(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase a12 = a1();
        a12.beginTransaction();
        try {
            T apply = bVar.apply(a12);
            a12.setTransactionSuccessful();
            return apply;
        } finally {
            a12.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public int o() {
        final long a4 = this.f27613F.a() - this.f27615H.c();
        return ((Integer) l1(new b() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.N.b
            public final Object apply(Object obj) {
                Integer p12;
                p12 = N.this.p1(a4, (SQLiteDatabase) obj);
                return p12;
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC1134d
    public void r(Iterable<AbstractC1141k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        a1().compileStatement("DELETE FROM events WHERE _id in " + V1(iterable)).execute();
    }
}

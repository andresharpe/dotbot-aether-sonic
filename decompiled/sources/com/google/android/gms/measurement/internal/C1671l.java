package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1671l extends SQLiteOpenHelper {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1677m f30836E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671l(C1677m c1677m, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f30836E = c1677m;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final SQLiteDatabase getWritableDatabase() {
        C1735v4 c1735v4;
        C1735v4 c1735v42;
        C1735v4 c1735v43;
        C1677m c1677m = this.f30836E;
        c1735v4 = c1677m.f30857e;
        c1677m.f31060a.x();
        if (c1735v4.c(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                c1735v42 = this.f30836E.f30857e;
                c1735v42.b();
                this.f30836E.f31060a.b().p().a("Opening the database failed, dropping and recreating it");
                this.f30836E.f31060a.x();
                if (!this.f30836E.f31060a.d().getDatabasePath("google_app_measurement.db").delete()) {
                    this.f30836E.f31060a.b().p().b("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    c1735v43 = this.f30836E.f30857e;
                    c1735v43.a();
                    return writableDatabase;
                } catch (SQLiteException e4) {
                    this.f30836E.f31060a.b().p().b("Failed to open freshly created database", e4);
                    throw e4;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1683n.b(this.f30836E.f31060a.b(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        C1720t1 b4 = this.f30836E.f31060a.b();
        strArr = C1677m.f30848f;
        C1683n.a(b4, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C1720t1 b5 = this.f30836E.f31060a.b();
        strArr2 = C1677m.f30849g;
        C1683n.a(b5, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        C1720t1 b6 = this.f30836E.f31060a.b();
        strArr3 = C1677m.f30850h;
        C1683n.a(b6, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        C1720t1 b7 = this.f30836E.f31060a.b();
        strArr4 = C1677m.f30852j;
        C1683n.a(b7, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C1720t1 b8 = this.f30836E.f31060a.b();
        strArr5 = C1677m.f30851i;
        C1683n.a(b8, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        C1720t1 b9 = this.f30836E.f31060a.b();
        strArr6 = C1677m.f30853k;
        C1683n.a(b9, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        C1720t1 b10 = this.f30836E.f31060a.b();
        strArr7 = C1677m.f30854l;
        C1683n.a(b10, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C1720t1 b11 = this.f30836E.f31060a.b();
        strArr8 = C1677m.f30855m;
        C1683n.a(b11, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C1683n.a(this.f30836E.f31060a.b(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}

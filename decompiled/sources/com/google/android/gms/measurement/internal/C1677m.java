package com.google.android.gms.measurement.internal;

import N0.a;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1414i2;
import com.google.android.gms.internal.measurement.C1422j2;
import com.google.android.gms.internal.measurement.D6;
import com.google.android.gms.internal.measurement.V5;
import com.google.firebase.messaging.C1821f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1677m extends AbstractC1759z4 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f30848f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f30849g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f30850h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f30851i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f30852j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f30853k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f30854l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f30855m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    private final C1671l f30856d;

    /* renamed from: e, reason: collision with root package name */
    private final C1735v4 f30857e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1677m(L4 l4) {
        super(l4);
        this.f30857e = new C1735v4(this.f31060a.zzav());
        this.f31060a.x();
        this.f30856d = new C1671l(this, this.f31060a.d(), "google_app_measurement.db");
    }

    @androidx.annotation.j0
    static final void F(ContentValues contentValues, String str, Object obj) {
        C1285y.h("value");
        C1285y.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @androidx.annotation.j0
    private final long G(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = N().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j4 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j4;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e4) {
                this.f31060a.b().p().c("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @androidx.annotation.j0
    private final long I(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = N().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j5 = cursor.getLong(0);
                    cursor.close();
                    return j5;
                }
                cursor.close();
                return j4;
            } catch (SQLiteException e4) {
                this.f31060a.b().p().c("Database error", str, e4);
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x007c: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:125), block:B:108:0x007c */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void E(String str, long j4, long j5, I4 i4) {
        ?? r4;
        Cursor cursor;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr2;
        String[] strArr3;
        C1285y.l(i4);
        f();
        g();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase N3 = N();
                r4 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r4 != 0) {
                        if (j5 != -1) {
                            strArr3 = new String[]{String.valueOf(j5), String.valueOf(j4)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j4)};
                        }
                        if (j5 != -1) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = N3.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        if (j5 != -1) {
                            strArr = new String[]{null, String.valueOf(j5)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (j5 != -1) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = N3.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        String str6 = str5;
                        Cursor query = N3.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f31060a.b().p().b("Raw event metadata record is missing. appId", C1720t1.x(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C1422j2 c1422j2 = (C1422j2) ((C1414i2) O4.A(C1422j2.L1(), query.getBlob(0))).q();
                                    if (query.moveToNext()) {
                                        this.f31060a.b().u().b("Get multiple raw event metadata records, expected one. appId", C1720t1.x(str3));
                                    }
                                    query.close();
                                    C1285y.l(c1422j2);
                                    i4.f30241a = c1422j2;
                                    if (j5 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str3, str6, String.valueOf(j5)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str3, str6};
                                    }
                                    Cursor query2 = N3.query("raw_events", new String[]{"rowid", a.C0015a.f1688b, "timestamp", C1821f.C0339f.a.f37006R}, str2, strArr2, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f31060a.b().u().b("Raw event data disappeared while in transaction. appId", C1720t1.x(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j6 = query2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.X1 x12 = (com.google.android.gms.internal.measurement.X1) O4.A(com.google.android.gms.internal.measurement.Y1.E(), query2.getBlob(3));
                                            x12.D(query2.getString(1));
                                            x12.H(query2.getLong(2));
                                            if (!i4.a(j6, (com.google.android.gms.internal.measurement.Y1) x12.q())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e4) {
                                            this.f31060a.b().p().c("Data loss. Failed to merge raw event. appId", C1720t1.x(str3), e4);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (IOException e5) {
                                    this.f31060a.b().p().c("Data loss. Failed to merge raw event metadata. appId", C1720t1.x(str3), e5);
                                    query.close();
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                r4 = str6;
                                this.f31060a.b().p().c("Data loss. Error selecting raw event. appId", C1720t1.x(str3), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str6;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            str6 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str6 = query;
                        }
                    } catch (SQLiteException e8) {
                        e = e8;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e9) {
                    e = e9;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e10) {
            e = e10;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @androidx.annotation.j0
    public final int H(String str, String str2) {
        C1285y.h(str);
        C1285y.h(str2);
        f();
        g();
        try {
            return N().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            this.f31060a.b().p().d("Error deleting conditional property", C1720t1.x(str), this.f31060a.B().f(str2), e4);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final long J(String str, String str2) {
        SQLiteException e4;
        long j4;
        ContentValues contentValues;
        C1285y.h(str);
        C1285y.h("first_open_count");
        f();
        g();
        SQLiteDatabase N3 = N();
        N3.beginTransaction();
        try {
            try {
                j4 = I("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j4 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (N3.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f31060a.b().p().c("Failed to insert column (got -1). appId", C1720t1.x(str), "first_open_count");
                        return -1L;
                    }
                    j4 = 0;
                }
            } catch (SQLiteException e5) {
                e4 = e5;
                j4 = 0;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", Long.valueOf(1 + j4));
            } catch (SQLiteException e6) {
                e4 = e6;
                this.f31060a.b().p().d("Error inserting column. appId", C1720t1.x(str), "first_open_count", e4);
                return j4;
            }
            if (N3.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f31060a.b().p().c("Failed to update column (got 0). appId", C1720t1.x(str), "first_open_count");
                return -1L;
            }
            N3.setTransactionSuccessful();
            return j4;
        } finally {
            N3.endTransaction();
        }
    }

    @androidx.annotation.j0
    public final long K() {
        return I("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @androidx.annotation.j0
    public final long L() {
        return I("select max(timestamp) from raw_events", null, 0L);
    }

    public final long M(String str) {
        C1285y.h(str);
        return I("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final SQLiteDatabase N() {
        f();
        try {
            return this.f30856d.getWritableDatabase();
        } catch (SQLiteException e4) {
            this.f31060a.b().u().b("Error opening database", e4);
            throw e4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle O(java.lang.String r8) {
        /*
            r7 = this;
            r7.f()
            r7.g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.N()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String[] r2 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r3 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r3, r2)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.f2 r8 = r7.f31060a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.t1 r8 = r8.b()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.r1 r8 = r8.t()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        L2e:
            r8 = move-exception
            goto Lbf
        L31:
            r8 = move-exception
            goto Lc5
        L34:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.X1 r3 = com.google.android.gms.internal.measurement.Y1.E()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.O4 r2 = com.google.android.gms.measurement.internal.O4.A(r3, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.X1 r2 = (com.google.android.gms.internal.measurement.X1) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.l4 r2 = r2.q()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.internal.measurement.Y1 r2 = (com.google.android.gms.internal.measurement.Y1) r2     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31 java.io.IOException -> La7
            com.google.android.gms.measurement.internal.L4 r8 = r7.f31057b     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r8.e0()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.List r8 = r2.I()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
        L5b:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r3 == 0) goto La3
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.internal.measurement.c2 r3 = (com.google.android.gms.internal.measurement.C1366c2) r3     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = r3.G()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            boolean r5 = r3.T()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L79
            double r5 = r3.A()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L79:
            boolean r5 = r3.U()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L87
            float r3 = r3.B()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L87:
            boolean r5 = r3.X()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L95
            java.lang.String r3 = r3.H()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        L95:
            boolean r5 = r3.V()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 == 0) goto L5b
            long r5 = r3.D()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            goto L5b
        La3:
            r1.close()
            return r2
        La7:
            r2 = move-exception
            com.google.android.gms.measurement.internal.f2 r3 = r7.f31060a     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.t1 r3 = r3.b()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            com.google.android.gms.measurement.internal.r1 r3 = r3.p()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1720t1.x(r8)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r3.c(r4, r8, r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r1.close()
            return r0
        Lbf:
            r0 = r1
            goto Lda
        Lc1:
            r8 = move-exception
            goto Lda
        Lc3:
            r8 = move-exception
            r1 = r0
        Lc5:
            com.google.android.gms.measurement.internal.f2 r2 = r7.f31060a     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.t1 r2 = r2.b()     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.measurement.internal.r1 r2 = r2.p()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Ld9
            r1.close()
        Ld9:
            return r0
        Lda:
            if (r0 == 0) goto Ldf
            r0.close()
        Ldf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.O(java.lang.String):android.os.Bundle");
    }

    @androidx.annotation.j0
    public final I2 P(String str) {
        Cursor cursor;
        boolean z3;
        long j4;
        long j5;
        C1285y.h(str);
        f();
        g();
        Cursor cursor2 = null;
        try {
            boolean z4 = false;
            cursor = N().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    try {
                        I2 i22 = new I2(this.f31057b.a0(), str);
                        i22.h(cursor.getString(0));
                        i22.w(cursor.getString(1));
                        i22.F(cursor.getString(2));
                        i22.B(cursor.getLong(3));
                        i22.C(cursor.getLong(4));
                        i22.z(cursor.getLong(5));
                        i22.j(cursor.getString(6));
                        i22.i(cursor.getString(7));
                        i22.x(cursor.getLong(8));
                        i22.s(cursor.getLong(9));
                        if (cursor.isNull(10) || cursor.getInt(10) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i22.D(z3);
                        i22.r(cursor.getLong(11));
                        i22.p(cursor.getLong(12));
                        i22.o(cursor.getLong(13));
                        i22.m(cursor.getLong(14));
                        i22.l(cursor.getLong(15));
                        i22.u(cursor.getLong(16));
                        if (cursor.isNull(17)) {
                            j4 = -2147483648L;
                        } else {
                            j4 = cursor.getInt(17);
                        }
                        i22.k(j4);
                        i22.v(cursor.getString(18));
                        i22.n(cursor.getLong(19));
                        i22.q(cursor.getLong(20));
                        i22.y(cursor.getString(21));
                        if (cursor.isNull(23) || cursor.getInt(23) != 0) {
                            z4 = true;
                        }
                        i22.g(z4);
                        i22.f(cursor.getString(24));
                        if (cursor.isNull(25)) {
                            j5 = 0;
                        } else {
                            j5 = cursor.getLong(25);
                        }
                        i22.t(j5);
                        if (!cursor.isNull(26)) {
                            i22.G(Arrays.asList(cursor.getString(26).split(",", -1)));
                        }
                        D6.b();
                        if (this.f31060a.x().z(null, C1643g1.f30737t0)) {
                            i22.H(cursor.getString(28));
                        }
                        i22.d();
                        if (cursor.moveToNext()) {
                            this.f31060a.b().p().b("Got multiple records for app, expected one. appId", C1720t1.x(str));
                        }
                        cursor.close();
                        return i22;
                    } catch (SQLiteException e4) {
                        e = e4;
                        this.f31060a.b().p().c("Error querying app. appId", C1720t1.x(str), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x012e: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:303), block:B:33:0x012e */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0159  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1623d Q(java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.Q(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    @androidx.annotation.j0
    public final C1665k R(long j4, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return S(j4, str, 1L, false, false, z5, false, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1665k S(long r24, java.lang.String r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.S(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.k");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C1712s T(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.T(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.s");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:123), block:B:27:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.R4 V(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            r1 = r14
            com.google.android.gms.common.internal.C1285y.h(r15)
            com.google.android.gms.common.internal.C1285y.h(r16)
            r14.f()
            r14.g()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r14.N()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r0 = "set_timestamp"
            r11 = 0
            r5[r11] = r0     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r0 = "value"
            r12 = 1
            r5[r12] = r0     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r0 = "origin"
            r13 = 2
            r5[r13] = r0     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String[] r7 = new java.lang.String[]{r15, r16}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            java.lang.String r4 = "user_attributes"
            java.lang.String r6 = "app_id=? and name=?"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7e
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            if (r0 != 0) goto L3d
            r3.close()
            return r2
        L3d:
            long r8 = r3.getLong(r11)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.Object r10 = r14.W(r3, r12)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            if (r10 != 0) goto L4b
            r3.close()
            return r2
        L4b:
            java.lang.String r6 = r3.getString(r13)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            com.google.android.gms.measurement.internal.R4 r0 = new com.google.android.gms.measurement.internal.R4     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r4 = r0
            r5 = r15
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            if (r4 == 0) goto L76
            com.google.android.gms.measurement.internal.f2 r4 = r1.f31060a     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            com.google.android.gms.measurement.internal.r1 r4 = r4.p()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            java.lang.String r5 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1720t1.x(r15)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            r4.b(r5, r6)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteException -> L74
            goto L76
        L72:
            r0 = move-exception
            goto L7a
        L74:
            r0 = move-exception
            goto L80
        L76:
            r3.close()
            return r0
        L7a:
            r2 = r3
            goto La5
        L7c:
            r0 = move-exception
            goto La5
        L7e:
            r0 = move-exception
            r3 = r2
        L80:
            com.google.android.gms.measurement.internal.f2 r4 = r1.f31060a     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.measurement.internal.t1 r4 = r4.b()     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.measurement.internal.r1 r4 = r4.p()     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C1720t1.x(r15)     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.measurement.internal.f2 r7 = r1.f31060a     // Catch: java.lang.Throwable -> L72
            com.google.android.gms.measurement.internal.o1 r7 = r7.B()     // Catch: java.lang.Throwable -> L72
            r8 = r16
            java.lang.String r7 = r7.f(r8)     // Catch: java.lang.Throwable -> L72
            r4.d(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto La4
            r3.close()
        La4:
            return r2
        La5:
            if (r2 == 0) goto Laa
            r2.close()
        Laa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.R4");
    }

    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    final Object W(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f31060a.b().p().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f31060a.b().p().a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i4);
                }
                return Double.valueOf(cursor.getDouble(i4));
            }
            return Long.valueOf(cursor.getLong(i4));
        }
        this.f31060a.b().p().a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String X() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.N()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L40
        L26:
            r0 = move-exception
            goto L40
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.f2 r3 = r6.f31060a     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.t1 r3 = r3.b()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.r1 r3 = r3.p()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            return r1
        L40:
            if (r1 == 0) goto L45
            r1.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.X():java.lang.String");
    }

    @androidx.annotation.j0
    public final List Y(String str, String str2, String str3) {
        C1285y.h(str);
        f();
        g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return Z(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r3 = r41.f31060a.b().p();
        r41.f31060a.x();
        r3.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Z(java.lang.String r42, java.lang.String[] r43) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.Z(java.lang.String, java.lang.String[]):java.util.List");
    }

    @androidx.annotation.j0
    public final List a0(String str) {
        C1285y.h(str);
        f();
        g();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase N3 = N();
                String[] strArr = {a.C0015a.f1688b, "origin", "set_timestamp", "value"};
                this.f31060a.x();
                cursor = N3.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j4 = cursor.getLong(2);
                    Object W3 = W(cursor, 3);
                    if (W3 == null) {
                        this.f31060a.b().p().b("Read invalid user property value, ignoring it. appId", C1720t1.x(str));
                    } else {
                        arrayList.add(new R4(str, str2, string, j4, W3));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e4) {
                this.f31060a.b().p().c("Error querying user properties. appId", C1720t1.x(str), e4);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        r0 = r20.f31060a.b().p();
        r20.f31060a.x();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b0(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.b0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @androidx.annotation.j0
    public final void c0() {
        g();
        N().beginTransaction();
    }

    @androidx.annotation.j0
    public final void d0() {
        g();
        N().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final void e0(List list) {
        f();
        g();
        C1285y.l(list);
        C1285y.n(list.size());
        if (!s()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (G("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.f31060a.b().u().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            N().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e4) {
            this.f31060a.b().p().b("Error incrementing retry count. error", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void f0() {
        f();
        g();
        if (s()) {
            long a4 = this.f31057b.c0().f30658e.a();
            long c4 = this.f31060a.zzav().c();
            long abs = Math.abs(c4 - a4);
            this.f31060a.x();
            if (abs > ((Long) C1643g1.f30748z.a(null)).longValue()) {
                this.f31057b.c0().f30658e.b(c4);
                f();
                g();
                if (s()) {
                    SQLiteDatabase N3 = N();
                    String valueOf = String.valueOf(this.f31060a.zzav().a());
                    this.f31060a.x();
                    int delete = N3.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C1647h.g())});
                    if (delete > 0) {
                        this.f31060a.b().t().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    @androidx.annotation.j0
    public final void k(String str, String str2) {
        C1285y.h(str);
        C1285y.h(str2);
        f();
        g();
        try {
            N().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            this.f31060a.b().p().d("Error deleting user property. appId", C1720t1.x(str), this.f31060a.B().f(str2), e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.f31060a.b().u();
        r9 = com.google.android.gms.measurement.internal.C1720t1.x(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r12.O() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.C1532x1) r0.next();
        g();
        f();
        com.google.android.gms.common.internal.C1285y.h(r24);
        com.google.android.gms.common.internal.C1285y.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.E().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f3, code lost:
    
        r7 = r3.k();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030a, code lost:
    
        if (r3.J() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030c, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0316, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0328, code lost:
    
        if (r3.K() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032a, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.I());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0334, code lost:
    
        r11.put("session_scoped", r0);
        r11.put(com.google.firebase.messaging.C1821f.C0339f.a.f37006R, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0348, code lost:
    
        if (N().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0360, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034a, code lost:
    
        r23.f31060a.b().p().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C1720t1.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0364, code lost:
    
        r23.f31060a.b().p().c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C1720t1.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0333, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0315, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.f31060a.b().u();
        r8 = com.google.android.gms.measurement.internal.C1720t1.x(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.J() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ea, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r11 = r0.H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r11.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.C1532x1) r11.next()).J() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.f31060a.b().u().c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C1720t1.x(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r11 = r0.G().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r11.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.C1461o1) r11.next();
        g();
        f();
        com.google.android.gms.common.internal.C1285y.h(r24);
        com.google.android.gms.common.internal.C1285y.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r12.G().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r12.k();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r12.O() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r9 = java.lang.Integer.valueOf(r12.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r9);
        r7.put("event_name", r12.G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r12.P() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r9 = java.lang.Boolean.valueOf(r12.M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r9);
        r7.put(com.google.firebase.messaging.C1821f.C0339f.a.f37006R, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (N().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.f31060a.b().p().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C1720t1.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.f31060a.b().p().c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C1720t1.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0377, code lost:
    
        g();
        f();
        com.google.android.gms.common.internal.C1285y.h(r24);
        r0 = N();
        r9 = r17;
        r0.delete("property_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a7, code lost:
    
        r7 = r21;
     */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1677m.l(java.lang.String, java.util.List):void");
    }

    @androidx.annotation.j0
    public final void m() {
        g();
        N().setTransactionSuccessful();
    }

    @androidx.annotation.j0
    public final void n(I2 i22) {
        C1285y.l(i22);
        f();
        g();
        String d02 = i22.d0();
        C1285y.l(d02);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", d02);
        contentValues.put("app_instance_id", i22.e0());
        contentValues.put("gmp_app_id", i22.i0());
        contentValues.put("resettable_device_id_hash", i22.a());
        contentValues.put("last_bundle_index", Long.valueOf(i22.Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i22.Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i22.X()));
        contentValues.put("app_version", i22.g0());
        contentValues.put("app_store", i22.f0());
        contentValues.put("gmp_version", Long.valueOf(i22.W()));
        contentValues.put("dev_cert_hash", Long.valueOf(i22.T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i22.J()));
        contentValues.put("day", Long.valueOf(i22.S()));
        contentValues.put("daily_public_events_count", Long.valueOf(i22.Q()));
        contentValues.put("daily_events_count", Long.valueOf(i22.P()));
        contentValues.put("daily_conversions_count", Long.valueOf(i22.N()));
        contentValues.put("config_fetched_time", Long.valueOf(i22.M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i22.V()));
        contentValues.put("app_version_int", Long.valueOf(i22.L()));
        contentValues.put("firebase_instance_id", i22.h0());
        contentValues.put("daily_error_events_count", Long.valueOf(i22.O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i22.R()));
        contentValues.put("health_monitor_sample", i22.j0());
        i22.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i22.I()));
        contentValues.put("admob_app_id", i22.b0());
        contentValues.put("dynamite_version", Long.valueOf(i22.U()));
        contentValues.put("session_stitching_token", i22.b());
        List c4 = i22.c();
        if (c4 != null) {
            if (c4.isEmpty()) {
                this.f31060a.b().u().b("Safelisted events should not be an empty list. appId", d02);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", c4));
            }
        }
        V5.b();
        if (this.f31060a.x().z(null, C1643g1.f30719k0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase N3 = N();
            if (N3.update("apps", contentValues, "app_id = ?", new String[]{d02}) == 0 && N3.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f31060a.b().p().b("Failed to insert/update app (got -1). appId", C1720t1.x(d02));
            }
        } catch (SQLiteException e4) {
            this.f31060a.b().p().c("Error storing app. appId", C1720t1.x(d02), e4);
        }
    }

    @androidx.annotation.j0
    public final void o(C1712s c1712s) {
        Long l4;
        C1285y.l(c1712s);
        f();
        g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c1712s.f30949a);
        contentValues.put(a.C0015a.f1688b, c1712s.f30950b);
        contentValues.put("lifetime_count", Long.valueOf(c1712s.f30951c));
        contentValues.put("current_bundle_count", Long.valueOf(c1712s.f30952d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1712s.f30954f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1712s.f30955g));
        contentValues.put("last_bundled_day", c1712s.f30956h);
        contentValues.put("last_sampled_complex_event_id", c1712s.f30957i);
        contentValues.put("last_sampling_rate", c1712s.f30958j);
        contentValues.put("current_session_count", Long.valueOf(c1712s.f30953e));
        Boolean bool = c1712s.f30959k;
        if (bool != null && bool.booleanValue()) {
            l4 = 1L;
        } else {
            l4 = null;
        }
        contentValues.put("last_exempt_from_sampling", l4);
        try {
            if (N().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f31060a.b().p().b("Failed to insert/update event aggregates (got -1). appId", C1720t1.x(c1712s.f30949a));
            }
        } catch (SQLiteException e4) {
            this.f31060a.b().p().c("Error storing event aggregates. appId", C1720t1.x(c1712s.f30949a), e4);
        }
    }

    public final boolean p() {
        if (G("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (G("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (G("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    @com.google.android.gms.common.util.D
    protected final boolean s() {
        Context d4 = this.f31060a.d();
        this.f31060a.x();
        return d4.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean t(String str, Long l4, long j4, com.google.android.gms.internal.measurement.Y1 y12) {
        f();
        g();
        C1285y.l(y12);
        C1285y.h(str);
        C1285y.l(l4);
        byte[] k4 = y12.k();
        this.f31060a.b().t().c("Saving complex main event, appId, data size", this.f31060a.B().d(str), Integer.valueOf(k4.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l4);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", k4);
        try {
            if (N().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f31060a.b().p().b("Failed to insert complex main event (got -1). appId", C1720t1.x(str));
                return false;
            }
            return true;
        } catch (SQLiteException e4) {
            this.f31060a.b().p().c("Error storing complex main event. appId", C1720t1.x(str), e4);
            return false;
        }
    }

    @androidx.annotation.j0
    public final boolean u(C1623d c1623d) {
        C1285y.l(c1623d);
        f();
        g();
        String str = c1623d.f30573E;
        C1285y.l(str);
        if (V(str, c1623d.f30575G.f30366F) == null) {
            long G3 = G("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f31060a.x();
            if (G3 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c1623d.f30574F);
        contentValues.put(a.C0015a.f1688b, c1623d.f30575G.f30366F);
        F(contentValues, "value", C1285y.l(c1623d.f30575G.c0()));
        contentValues.put(a.C0015a.f1700n, Boolean.valueOf(c1623d.f30577I));
        contentValues.put(a.C0015a.f1690d, c1623d.f30578J);
        contentValues.put(a.C0015a.f1691e, Long.valueOf(c1623d.f30580L));
        contentValues.put("timed_out_event", this.f31060a.L().a0(c1623d.f30579K));
        contentValues.put(a.C0015a.f1699m, Long.valueOf(c1623d.f30576H));
        contentValues.put("triggered_event", this.f31060a.L().a0(c1623d.f30581M));
        contentValues.put(a.C0015a.f1701o, Long.valueOf(c1623d.f30575G.f30367G));
        contentValues.put(a.C0015a.f1696j, Long.valueOf(c1623d.f30582N));
        contentValues.put("expired_event", this.f31060a.L().a0(c1623d.f30583O));
        try {
            if (N().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f31060a.b().p().b("Failed to insert/update conditional user property (got -1)", C1720t1.x(str));
                return true;
            }
            return true;
        } catch (SQLiteException e4) {
            this.f31060a.b().p().c("Error storing conditional user property", C1720t1.x(str), e4);
            return true;
        }
    }

    @androidx.annotation.j0
    public final boolean v(R4 r4) {
        C1285y.l(r4);
        f();
        g();
        if (V(r4.f30394a, r4.f30396c) == null) {
            if (U4.V(r4.f30396c)) {
                if (G("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{r4.f30394a}) >= this.f31060a.x().n(r4.f30394a, C1643g1.f30679H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(r4.f30396c)) {
                long G3 = G("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{r4.f30394a, r4.f30395b});
                this.f31060a.x();
                if (G3 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", r4.f30394a);
        contentValues.put("origin", r4.f30395b);
        contentValues.put(a.C0015a.f1688b, r4.f30396c);
        contentValues.put("set_timestamp", Long.valueOf(r4.f30397d));
        F(contentValues, "value", r4.f30398e);
        try {
            if (N().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f31060a.b().p().b("Failed to insert/update user property (got -1). appId", C1720t1.x(r4.f30394a));
                return true;
            }
            return true;
        } catch (SQLiteException e4) {
            this.f31060a.b().p().c("Error storing user property. appId", C1720t1.x(r4.f30394a), e4);
            return true;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.measurement.internal.m1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1679m1 extends F1 {

    /* renamed from: c, reason: collision with root package name */
    private final C1673l1 f30859c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f30860d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1679m1(C1638f2 c1638f2) {
        super(c1638f2);
        Context d4 = this.f31060a.d();
        this.f31060a.x();
        this.f30859c = new C1673l1(this, d4, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @androidx.annotation.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean v(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1679m1.v(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.F1
    protected final boolean l() {
        return false;
    }

    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    final SQLiteDatabase m() throws SQLiteException {
        if (this.f30860d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f30859c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f30860d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List n(int r24) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1679m1.n(int):java.util.List");
    }

    @androidx.annotation.j0
    public final void o() {
        int delete;
        f();
        try {
            SQLiteDatabase m4 = m();
            if (m4 != null && (delete = m4.delete("messages", null, null)) > 0) {
                this.f31060a.b().t().b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e4) {
            this.f31060a.b().p().b("Error resetting local analytics data. error", e4);
        }
    }

    @androidx.annotation.j0
    public final boolean p() {
        return v(3, new byte[0]);
    }

    @com.google.android.gms.common.util.D
    final boolean q() {
        Context d4 = this.f31060a.d();
        this.f31060a.x();
        return d4.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @androidx.annotation.j0
    public final boolean r() {
        f();
        if (!this.f30860d && q()) {
            int i4 = 5;
            for (int i5 = 0; i5 < 5; i5++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase m4 = m();
                            if (m4 == null) {
                                this.f30860d = true;
                                return false;
                            }
                            m4.beginTransaction();
                            m4.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            m4.setTransactionSuccessful();
                            m4.endTransaction();
                            m4.close();
                            return true;
                        } catch (SQLiteException e4) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f31060a.b().p().b("Error deleting app launch break from local database", e4);
                            this.f30860d = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i4);
                        i4 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e5) {
                    this.f31060a.b().p().b("Error deleting app launch break from local database", e5);
                    this.f30860d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            this.f31060a.b().u().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean s(C1623d c1623d) {
        byte[] a02 = this.f31060a.L().a0(c1623d);
        if (a02.length > 131072) {
            this.f31060a.b().r().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return v(2, a02);
    }

    public final boolean t(C1736w c1736w) {
        Parcel obtain = Parcel.obtain();
        C1742x.a(c1736w, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f31060a.b().r().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return v(0, marshall);
    }

    public final boolean u(P4 p4) {
        Parcel obtain = Parcel.obtain();
        Q4.a(p4, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f31060a.b().r().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return v(1, marshall);
    }
}

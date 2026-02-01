package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: Access modifiers changed from: package-private */
@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.measurement.internal.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1673l1 extends SQLiteOpenHelper {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1679m1 f30838E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673l1(C1679m1 c1679m1, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f30838E = c1679m1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e4) {
            throw e4;
        } catch (SQLiteException unused) {
            this.f30838E.f31060a.b().p().a("Opening the local database failed, dropping and recreating it");
            this.f30838E.f31060a.x();
            if (!this.f30838E.f31060a.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f30838E.f31060a.b().p().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e5) {
                this.f30838E.f31060a.b().p().b("Failed to open local database. Events will bypass local storage", e5);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1683n.b(this.f30838E.f31060a.b(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C1683n.a(this.f30838E.f31060a.b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @androidx.annotation.j0
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}

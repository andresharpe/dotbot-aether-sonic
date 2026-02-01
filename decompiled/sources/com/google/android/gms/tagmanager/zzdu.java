package com.google.android.gms.tagmanager;

import N0.a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzdu extends SQLiteOpenHelper {
    final /* synthetic */ zzdv zza;
    private boolean zzb;
    private long zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdv zzdvVar, Context context, String str) {
        super(context, "gtm_urls.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzdvVar;
        this.zzc = 0L;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        InterfaceC1306g interfaceC1306g;
        Context context;
        String str;
        SQLiteDatabase sQLiteDatabase;
        InterfaceC1306g interfaceC1306g2;
        if (this.zzb) {
            long j4 = this.zzc + 3600000;
            interfaceC1306g2 = this.zza.zzg;
            if (j4 > interfaceC1306g2.a()) {
                throw new SQLiteException("Database creation failed");
            }
        }
        this.zzb = true;
        interfaceC1306g = this.zza.zzg;
        this.zzc = interfaceC1306g.a();
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdv zzdvVar = this.zza;
            context = zzdvVar.zzd;
            str = zzdvVar.zze;
            context.getDatabasePath(str).delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            sQLiteDatabase = super.getWritableDatabase();
        }
        this.zzb = false;
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbu.zza(sQLiteDatabase.getPath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        int i4;
        Cursor query;
        Cursor cursor = null;
        try {
            try {
                query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{a.C0015a.f1688b}, "name=?", new String[]{"gtm_hits"}, null, null, null);
            } catch (SQLiteException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean moveToFirst = query.moveToFirst();
            query.close();
            if (moveToFirst) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
                HashSet hashSet = new HashSet();
                try {
                    for (String str2 : rawQuery.getColumnNames()) {
                        hashSet.add(str2);
                    }
                    rawQuery.close();
                    if (hashSet.remove("hit_id") && hashSet.remove("hit_url") && hashSet.remove("hit_time") && hashSet.remove("hit_first_send_time")) {
                        if (hashSet.isEmpty()) {
                            return;
                        } else {
                            throw new SQLiteException("Database has extra columns");
                        }
                    }
                    throw new SQLiteException("Database column missing");
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            }
        } catch (SQLiteException unused2) {
            cursor = query;
            Log.w("GoogleTagManager", "Error querying for table gtm_hits");
            if (cursor != null) {
                cursor.close();
            }
            str = zzdv.zza;
            sQLiteDatabase.execSQL(str);
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        str = zzdv.zza;
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}

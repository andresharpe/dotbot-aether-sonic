package com.google.android.gms.internal.gtm;

import N0.a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.gms.common.util.D;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes.dex */
public final class zzcf extends SQLiteOpenHelper {
    final /* synthetic */ zzcg zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(zzcg zzcgVar, Context context, String str) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzcgVar;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{a.C0015a.f1688b}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e4) {
                this.zza.zzS("Error querying for table", str, e4);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static final Set zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        zzfq zzfqVar;
        zzfq zzfqVar2;
        String zzad;
        zzfq zzfqVar3;
        zzfqVar = this.zza.zze;
        if (zzfqVar.zzc(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzfqVar2 = this.zza.zze;
                zzfqVar2.zzb();
                this.zza.zzI("Opening the database failed, dropping the table and recreating it");
                zzad = this.zza.zzad();
                this.zza.zzo().getDatabasePath(zzad).delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    zzfqVar3 = this.zza.zze;
                    zzfqVar3.zza();
                    return writableDatabase;
                } catch (SQLiteException e4) {
                    this.zza.zzJ("Failed to open freshly created database", e4);
                    throw e4;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException unused) {
            zzfc.zzb("Invalid version number", Build.VERSION.SDK);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        if (!zza(sQLiteDatabase, "hits2")) {
            str = zzcg.zza;
            sQLiteDatabase.execSQL(str);
        } else {
            Set zzb = zzb(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i4 = 0; i4 < 4; i4++) {
                String str2 = strArr[i4];
                if (!zzb.remove(str2)) {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str2)));
                }
            }
            boolean z3 = !zzb.remove("hit_app_id");
            if (zzb.isEmpty()) {
                if (z3) {
                    sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
                }
            } else {
                throw new SQLiteException("Database hits2 has extra columns");
            }
        }
        if (zza(sQLiteDatabase, "properties")) {
            Set zzb2 = zzb(sQLiteDatabase, "properties");
            String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
            for (int i5 = 0; i5 < 6; i5++) {
                String str3 = strArr2[i5];
                if (!zzb2.remove(str3)) {
                    throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str3)));
                }
            }
            if (zzb2.isEmpty()) {
                return;
            } else {
                throw new SQLiteException("Database properties table has extra columns");
            }
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }
}

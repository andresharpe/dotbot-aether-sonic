package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzdv implements zzcc {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time");
    private final zzdu zzb;
    private volatile zzbj zzc;
    private final Context zzd;
    private final String zze;
    private long zzf;
    private final InterfaceC1306g zzg;
    private final int zzh;
    private final zzey zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdv(zzey zzeyVar, Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        this.zze = "gtm_urls.db";
        this.zzi = zzeyVar;
        this.zzg = k.e();
        this.zzb = new zzdu(this, applicationContext, "gtm_urls.db");
        this.zzc = new zzfi(applicationContext, new zzdt(this));
        this.zzf = 0L;
        this.zzh = 2000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzdv zzdvVar, long j4, long j5) {
        SQLiteDatabase zzk = zzdvVar.zzk("Error opening database for getNumStoredHits.");
        if (zzk == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j5));
        try {
            zzk.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j4)});
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + j4);
            zzdvVar.zzl(j4);
        }
    }

    private final SQLiteDatabase zzk(String str) {
        try {
            return this.zzb.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(long j4) {
        zzj(new String[]{String.valueOf(j4)});
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f A[Catch: all -> 0x00e5, TryCatch #2 {all -> 0x00e5, blocks: (B:59:0x00c2, B:62:0x00c9, B:64:0x00d6, B:65:0x0107, B:69:0x00ea, B:74:0x0127, B:75:0x0149, B:77:0x014f, B:82:0x0163), top: B:53:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016f  */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zza():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r2.moveToFirst() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        r8.add(java.lang.String.valueOf(r2.getLong(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r2.moveToNext() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r2 == 0) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.database.Cursor] */
    @Override // com.google.android.gms.tagmanager.zzcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(long r20, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzdv.zzb(long, java.lang.String):void");
    }

    final int zzc() {
        SQLiteDatabase zzk = zzk("Error opening database for getNumStoredHits.");
        int i4 = 0;
        if (zzk == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = zzk.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                if (cursor.moveToFirst()) {
                    i4 = (int) cursor.getLong(0);
                }
                cursor.close();
                return i4;
            } catch (SQLiteException unused) {
                Log.w("GoogleTagManager", "Error getting numStoredHits");
                if (cursor == null) {
                    return 0;
                }
                cursor.close();
                return 0;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    final void zzj(String[] strArr) {
        int length;
        SQLiteDatabase zzk;
        boolean z3;
        if (strArr == null || (length = strArr.length) == 0 || (zzk = zzk("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            zzk.delete("gtm_hits", String.format("HIT_ID in (%s)", TextUtils.join(",", Collections.nCopies(length, "?"))), strArr);
            zzey zzeyVar = this.zzi;
            if (zzc() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            zzeyVar.zza(z3);
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting hits");
        }
    }
}

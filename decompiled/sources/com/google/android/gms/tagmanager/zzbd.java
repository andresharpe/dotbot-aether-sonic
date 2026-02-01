package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import com.google.android.gms.internal.gtm.zzgb;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbd implements zzaw {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    private final Executor zzb;
    private final Context zzc;
    private final zzbb zzd;
    private final InterfaceC1306g zze;

    public zzbd(Context context) {
        InterfaceC1306g e4 = k.e();
        ExecutorService zza2 = zzgb.zza().zza(2);
        this.zzc = context;
        this.zze = e4;
        this.zzb = zza2;
        this.zzd = new zzbb(this, context, "google_tagmanager.db");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ List zzf(zzbd zzbdVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbdVar.zzk(zzbdVar.zze.a());
            SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbc> arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
                while (query.moveToNext()) {
                    try {
                        arrayList.add(new zzbc(query.getString(0), query.getBlob(1)));
                    } finally {
                        query.close();
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbc zzbcVar : arrayList) {
                String str = zzbcVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbcVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        obj = objectInputStream.readObject();
                        try {
                            objectInputStream.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (ClassNotFoundException unused3) {
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        arrayList2.add(new zzat(str, obj));
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        if (objectInputStream2 != null) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException unused4) {
                                throw th;
                            }
                        }
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (IOException unused5) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused6) {
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                byteArrayInputStream.close();
                arrayList2.add(new zzat(str, obj));
            }
            return arrayList2;
        } finally {
            zzbdVar.zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzbd zzbdVar, String str) {
        SQLiteDatabase zzi = zzbdVar.zzi("Error opening database for clearKeysWithPrefix.");
        if (zzi == null) {
            return;
        }
        try {
            zzdg.zzb.zzd("Cleared " + zzi.delete("datalayer", "key = ? OR key LIKE ?", new String[]{str, str + ".%"}) + " items");
        } catch (SQLiteException e4) {
            Log.w("GoogleTagManager", "Error deleting entries with key prefix: " + str + " (" + e4.toString() + ").");
        } finally {
            zzbdVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j4) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            zzdg.zzb.zzd("Deleted " + zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j4)}) + " expired items");
        } catch (SQLiteException unused) {
            Log.w("GoogleTagManager", "Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r8.moveToFirst() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        r4.add(java.lang.String.valueOf(r8.getLong(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r8.moveToNext() != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if (r8 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #6 {all -> 0x0035, blocks: (B:4:0x0003, B:8:0x004c, B:10:0x0051, B:14:0x00d0, B:16:0x00f9, B:19:0x00fd, B:21:0x0105, B:23:0x0120, B:25:0x0126, B:43:0x00a1, B:51:0x013c, B:52:0x013f, B:63:0x0140, B:69:0x014b, B:70:0x014f, B:72:0x0155, B:81:0x0031, B:92:0x0186, B:93:0x0189, B:87:0x0048), top: B:3:0x0003, outer: #0, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[Catch: all -> 0x0035, TryCatch #6 {all -> 0x0035, blocks: (B:4:0x0003, B:8:0x004c, B:10:0x0051, B:14:0x00d0, B:16:0x00f9, B:19:0x00fd, B:21:0x0105, B:23:0x0120, B:25:0x0126, B:43:0x00a1, B:51:0x013c, B:52:0x013f, B:63:0x0140, B:69:0x014b, B:70:0x014f, B:72:0x0155, B:81:0x0031, B:92:0x0186, B:93:0x0189, B:87:0x0048), top: B:3:0x0003, outer: #0, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b A[Catch: all -> 0x0035, TryCatch #6 {all -> 0x0035, blocks: (B:4:0x0003, B:8:0x004c, B:10:0x0051, B:14:0x00d0, B:16:0x00f9, B:19:0x00fd, B:21:0x0105, B:23:0x0120, B:25:0x0126, B:43:0x00a1, B:51:0x013c, B:52:0x013f, B:63:0x0140, B:69:0x014b, B:70:0x014f, B:72:0x0155, B:81:0x0031, B:92:0x0186, B:93:0x0189, B:87:0x0048), top: B:3:0x0003, outer: #0, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0186 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #6 {all -> 0x0035, blocks: (B:4:0x0003, B:8:0x004c, B:10:0x0051, B:14:0x00d0, B:16:0x00f9, B:19:0x00fd, B:21:0x0105, B:23:0x0120, B:25:0x0126, B:43:0x00a1, B:51:0x013c, B:52:0x013f, B:63:0x0140, B:69:0x014b, B:70:0x014f, B:72:0x0155, B:81:0x0031, B:92:0x0186, B:93:0x0189, B:87:0x0048), top: B:3:0x0003, outer: #0, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzl(java.util.List r18, long r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzl(java.util.List, long):void");
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zza(String str) {
        this.zzb.execute(new zzba(this, str));
    }

    @Override // com.google.android.gms.tagmanager.zzaw
    public final void zzb(zzav zzavVar) {
        this.zzb.execute(new zzaz(this, zzavVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r6 == null) goto L9;
     */
    @Override // com.google.android.gms.tagmanager.zzaw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(java.util.List r8, long r9) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r8.next()
            com.google.android.gms.tagmanager.zzat r1 = (com.google.android.gms.tagmanager.zzat) r1
            com.google.android.gms.tagmanager.zzbc r2 = new com.google.android.gms.tagmanager.zzbc
            java.lang.String r3 = r1.zza
            java.lang.Object r1 = r1.zzb
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L41
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L41
            r6.writeObject(r1)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L42
            byte[] r5 = r4.toByteArray()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L42
        L2d:
            r6.close()     // Catch: java.io.IOException -> L45
        L30:
            r4.close()     // Catch: java.io.IOException -> L45
            goto L45
        L34:
            r8 = move-exception
            r5 = r6
            goto L38
        L37:
            r8 = move-exception
        L38:
            if (r5 == 0) goto L3d
            r5.close()     // Catch: java.io.IOException -> L40
        L3d:
            r4.close()     // Catch: java.io.IOException -> L40
        L40:
            throw r8
        L41:
            r6 = r5
        L42:
            if (r6 == 0) goto L30
            goto L2d
        L45:
            r2.<init>(r3, r5)
            r0.add(r2)
            goto L9
        L4c:
            java.util.concurrent.Executor r8 = r7.zzb
            com.google.android.gms.tagmanager.zzay r1 = new com.google.android.gms.tagmanager.zzay
            r1.<init>(r7, r0, r9)
            r8.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzbd.zzc(java.util.List, long):void");
    }
}

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.util.D;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfi implements zzbj {
    private final String zza;
    private final Context zzb;
    private final zzfh zzc;
    private final zzfg zzd = new zzfg();

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public zzfi(Context context, zzfh zzfhVar) {
        String sb;
        this.zzb = context.getApplicationContext();
        this.zzc = zzfhVar;
        String str = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb2.append("-");
                sb2.append(locale.getCountry().toLowerCase());
            }
            sb = sb2.toString();
        }
        this.zza = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleTagManager", "4.00", str, sb, Build.MODEL, Build.ID);
    }

    @D
    static final URL zzc(zzbz zzbzVar) {
        try {
            return new URL(zzbzVar.zzc());
        } catch (MalformedURLException unused) {
            Log.e("GoogleTagManager", "Error trying to parse the GTM url.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.tagmanager.zzbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.util.List r12) {
        /*
            r11 = this;
            int r0 = r12.size()
            r1 = 40
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 1
            r2 = 0
            r4 = r1
            r3 = r2
        Le:
            if (r3 >= r0) goto Ldd
            java.lang.Object r5 = r12.get(r3)
            com.google.android.gms.tagmanager.zzbz r5 = (com.google.android.gms.tagmanager.zzbz) r5
            java.net.URL r6 = zzc(r5)
            java.lang.String r7 = "GoogleTagManager"
            if (r6 != 0) goto L4c
            java.lang.String r6 = "No destination: discarding hit."
            android.util.Log.w(r7, r6)
            com.google.android.gms.tagmanager.zzfh r6 = r11.zzc
            com.google.android.gms.tagmanager.zzdt r6 = (com.google.android.gms.tagmanager.zzdt) r6
            com.google.android.gms.tagmanager.zzdv r6 = r6.zza
            long r7 = r5.zzb()
            com.google.android.gms.tagmanager.zzdv.zzh(r6, r7)
            long r5 = r5.zzb()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Permanent failure dispatching hitId: "
            r7.append(r8)
            r7.append(r5)
            com.google.android.gms.tagmanager.zzbf r5 = com.google.android.gms.tagmanager.zzdg.zzb
            java.lang.String r6 = r7.toString()
            r5.zzd(r6)
            goto Ld9
        L4c:
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.io.IOException -> Lb8
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.io.IOException -> Lb8
            r8 = 0
            if (r4 == 0) goto L5f
            android.content.Context r4 = r11.zzb     // Catch: java.lang.Throwable -> L5b
            com.google.android.gms.tagmanager.zzdj.zza(r4)     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r4 = move-exception
            r9 = r8
            r8 = r1
            goto Lac
        L5f:
            java.lang.String r4 = "User-Agent"
            java.lang.String r9 = r11.zza     // Catch: java.lang.Throwable -> L8c
            r6.setRequestProperty(r4, r9)     // Catch: java.lang.Throwable -> L8c
            int r4 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L8c
            java.io.InputStream r8 = r6.getInputStream()     // Catch: java.lang.Throwable -> L8c
            r9 = 200(0xc8, float:2.8E-43)
            if (r4 == r9) goto L8e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8c
            r9.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r10 = "Bad response: "
            r9.append(r10)     // Catch: java.lang.Throwable -> L8c
            r9.append(r4)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L8c
            android.util.Log.w(r7, r4)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.tagmanager.zzfh r4 = r11.zzc     // Catch: java.lang.Throwable -> L8c
            r4.zza(r5)     // Catch: java.lang.Throwable -> L8c
            goto L9b
        L8c:
            r4 = move-exception
            goto Laa
        L8e:
            com.google.android.gms.tagmanager.zzfh r4 = r11.zzc     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.tagmanager.zzdt r4 = (com.google.android.gms.tagmanager.zzdt) r4     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.tagmanager.zzdv r4 = r4.zza     // Catch: java.lang.Throwable -> L8c
            long r9 = r5.zzb()     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.tagmanager.zzdv.zzh(r4, r9)     // Catch: java.lang.Throwable -> L8c
        L9b:
            if (r8 == 0) goto La3
            r8.close()     // Catch: java.io.IOException -> La1
            goto La3
        La1:
            r4 = move-exception
            goto La8
        La3:
            r6.disconnect()     // Catch: java.io.IOException -> La1
            r4 = r2
            goto Ld9
        La8:
            r8 = r2
            goto Lbb
        Laa:
            r9 = r8
            r8 = r2
        Lac:
            if (r9 == 0) goto Lb4
            r9.close()     // Catch: java.io.IOException -> Lb2
            goto Lb4
        Lb2:
            r4 = move-exception
            goto Lbb
        Lb4:
            r6.disconnect()     // Catch: java.io.IOException -> Lb2
            throw r4     // Catch: java.io.IOException -> Lb2
        Lb8:
            r6 = move-exception
            r8 = r4
            r4 = r6
        Lbb:
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r9 = "Exception sending hit: "
            java.lang.String r6 = r9.concat(r6)
            android.util.Log.w(r7, r6)
            java.lang.String r4 = r4.getMessage()
            android.util.Log.w(r7, r4)
            com.google.android.gms.tagmanager.zzfh r4 = r11.zzc
            r4.zza(r5)
            r4 = r8
        Ld9:
            int r3 = r3 + 1
            goto Le
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfi.zza(java.util.List):void");
    }

    @Override // com.google.android.gms.tagmanager.zzbj
    public final boolean zzb() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzdg.zzb.zzd("...no network connectivity");
        return false;
    }
}

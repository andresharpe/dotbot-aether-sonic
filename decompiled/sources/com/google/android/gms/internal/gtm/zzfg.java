package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.amazonaws.http.h;
import com.google.android.gms.analytics.A;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import kotlin.text.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfg extends zzbu {
    private static final byte[] zza = "\n".getBytes();
    private final String zzb;
    private final zzfq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfg(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzb = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", zzbv.zza, Build.VERSION.RELEASE, zzfu.zzd(Locale.getDefault()), Build.MODEL, Build.ID);
        this.zzc = new zzfq(zzbxVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(java.net.URL r5, byte[] r6, int r7) {
        /*
            r4 = this;
            java.lang.String r7 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.C1285y.l(r5)
            com.google.android.gms.common.internal.C1285y.l(r6)
            int r0 = r6.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "POST bytes, url"
            r4.zzG(r2, r1, r5)
            boolean r1 = com.google.android.gms.internal.gtm.zzbt.zzU()
            if (r1 == 0) goto L22
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r2 = "Post payload\n"
            r4.zzO(r2, r1)
        L22:
            r1 = 0
            java.net.HttpURLConnection r5 = r4.zzb(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6c
            r2 = 1
            r5.setDoOutput(r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r5.setFixedLengthStreamingMode(r0)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r5.connect()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.OutputStream r1 = r5.getOutputStream()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r1.write(r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.zzk(r5)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            int r6 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L50
            com.google.android.gms.internal.gtm.zzbs r6 = r4.zzs()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r6.zzi()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r6 = r0
            goto L50
        L4c:
            r6 = move-exception
            goto L88
        L4e:
            r6 = move-exception
            goto L65
        L50:
            java.lang.String r0 = "POST status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.zzF(r0, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r1.close()     // Catch: java.io.IOException -> L5d
            goto L61
        L5d:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L61:
            r5.disconnect()
            return r6
        L65:
            r3 = r1
            r1 = r5
            r5 = r3
            goto L6e
        L69:
            r6 = move-exception
            r5 = r1
            goto L88
        L6c:
            r6 = move-exception
            r5 = r1
        L6e:
            java.lang.String r0 = "Network POST connection error"
            r4.zzR(r0, r6)     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L7d
            r5.close()     // Catch: java.io.IOException -> L79
            goto L7d
        L79:
            r5 = move-exception
            r4.zzJ(r7, r5)
        L7d:
            if (r1 == 0) goto L82
            r1.disconnect()
        L82:
            r5 = 0
            return r5
        L84:
            r6 = move-exception
            r3 = r1
            r1 = r5
            r5 = r3
        L88:
            if (r1 == 0) goto L92
            r1.close()     // Catch: java.io.IOException -> L8e
            goto L92
        L8e:
            r0 = move-exception
            r4.zzJ(r7, r0)
        L92:
            if (r5 == 0) goto L97
            r5.disconnect()
        L97:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzg(java.net.URL, byte[], int):int");
    }

    private final URL zzh() {
        zzw();
        String zzi = zzcv.zzi();
        zzw();
        try {
            return new URL(zzi.concat((String) zzew.zzt.zzb()));
        } catch (MalformedURLException e4) {
            zzJ("Error trying to parse the hardcoded host url", e4);
            return null;
        }
    }

    private final URL zzi(zzez zzezVar) {
        String concat;
        if (zzezVar.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            concat = zzi.concat(zzcv.zzj());
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            concat = zzk.concat(zzcv.zzj());
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e4) {
            zzJ("Error trying to parse the hardcoded host url", e4);
            return null;
        }
    }

    private final URL zzj(zzez zzezVar, String str) {
        String str2;
        if (zzezVar.zzh()) {
            zzw();
            String zzi = zzcv.zzi();
            zzw();
            str2 = zzi + zzcv.zzj() + "?" + str;
        } else {
            zzw();
            String zzk = zzcv.zzk();
            zzw();
            str2 = zzk + zzcv.zzj() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e4) {
            zzJ("Error trying to parse the hardcoded host url", e4);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0015, code lost:
    
        zzJ("Error closing http connection input stream", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0018, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(java.net.HttpURLConnection r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1b
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L19
        La:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L19
            if (r2 > 0) goto La
            r4.close()     // Catch: java.io.IOException -> L14
            return
        L14:
            r4 = move-exception
            r3.zzJ(r0, r4)
            return
        L19:
            r1 = move-exception
            goto L1d
        L1b:
            r1 = move-exception
            r4 = 0
        L1d:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L23
            goto L27
        L23:
            r4 = move-exception
            r3.zzJ(r0, r4)
        L27:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzk(java.net.HttpURLConnection):void");
    }

    private static final void zzl(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append(F.f52748d);
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final String zza(zzez zzezVar, boolean z3) {
        String valueOf;
        C1285y.l(zzezVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : zzezVar.zzg().entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    zzl(sb, str, (String) entry.getValue());
                }
            }
            zzl(sb, "ht", String.valueOf(zzezVar.zzd()));
            zzl(sb, "qt", String.valueOf(zzC().a() - zzezVar.zzd()));
            zzw();
            if (z3) {
                long zzc = zzezVar.zzc();
                if (zzc != 0) {
                    valueOf = String.valueOf(zzc);
                } else {
                    valueOf = String.valueOf(zzezVar.zzb());
                }
                zzl(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e4) {
            zzJ("Failed to encode name or value", e4);
            return null;
        }
    }

    @D
    final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzw();
            httpURLConnection.setConnectTimeout(((Integer) zzew.zzE.zzb()).intValue());
            zzw();
            httpURLConnection.setReadTimeout(((Integer) zzew.zzF.zzb()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty(h.f23650i, this.zzb);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0331 A[EDGE_INSN: B:118:0x0331->B:119:0x0331 BREAK  A[LOOP:1: B:110:0x023a->B:120:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[LOOP:1: B:110:0x023a->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzc(java.util.List r20) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfg.zzc(java.util.List):java.util.List");
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        NetworkInfo networkInfo;
        A.h();
        zzV();
        try {
            networkInfo = ((ConnectivityManager) zzo().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzN("No network connectivity");
        return false;
    }
}

package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfu;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spotify.sdk.android.auth.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public class i extends zzbu {

    /* renamed from: E */
    private boolean f27794E;

    /* renamed from: F */
    private final Map f27795F;

    /* renamed from: G */
    private final Map f27796G;

    /* renamed from: H */
    private final zzfb f27797H;

    /* renamed from: I */
    private final E f27798I;

    /* renamed from: J */
    @P
    private C1156d f27799J;

    /* renamed from: K */
    @P
    private zzft f27800K;

    public i(zzbx zzbxVar, @P String str, @P zzfb zzfbVar) {
        super(zzbxVar);
        HashMap hashMap = new HashMap();
        this.f27795F = hashMap;
        this.f27796G = new HashMap();
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.f27797H = new zzfb(60, 2000L, "tracking", zzC());
        this.f27798I = new E(this, zzbxVar);
    }

    public static /* bridge */ /* synthetic */ zzft j1(i iVar) {
        return iVar.f27800K;
    }

    @P
    private static String l1(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (str.startsWith("&") && str.length() >= 2) {
            return ((String) entry.getKey()).substring(1);
        }
        return null;
    }

    private static void y0(@P Map map, Map map2) {
        C1285y.l(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String l12 = l1(entry);
            if (l12 != null) {
                map2.put(l12, (String) entry.getValue());
            }
        }
    }

    public static /* bridge */ /* synthetic */ E z0(i iVar) {
        return iVar.f27798I;
    }

    public void A(@N String str) {
        i("&dh", str);
    }

    public void D(@N String str) {
        i("&ul", str);
    }

    public void F(@N String str) {
        i("&dl", str);
    }

    public void G(@N String str) {
        i("&dp", str);
    }

    public void H(@N String str) {
        i("&dr", str);
    }

    public void P(double d4) {
        i("&sf", Double.toString(d4));
    }

    public void V(@N String str) {
        i("&sd", str);
    }

    public void a0(@P String str) {
        i("&cd", str);
    }

    public void b(boolean z3) {
        this.f27794E = z3;
    }

    public void c(boolean z3) {
        this.f27798I.d(z3);
    }

    public void c0(int i4, int i5) {
        if (i4 < 0 && i5 < 0) {
            zzQ("Invalid width or height. The values should be non-negative.");
            return;
        }
        i("&sr", i4 + "x" + i5);
    }

    public void d(boolean z3) {
        boolean z4;
        synchronized (this) {
            try {
                C1156d c1156d = this.f27799J;
                if (c1156d == null) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 == z3) {
                    return;
                }
                if (z3) {
                    C1156d c1156d2 = new C1156d(this, Thread.getDefaultUncaughtExceptionHandler(), zzo());
                    this.f27799J = c1156d2;
                    Thread.setDefaultUncaughtExceptionHandler(c1156d2);
                    zzN("Uncaught exceptions will be reported to Google Analytics");
                } else {
                    Thread.setDefaultUncaughtExceptionHandler(c1156d.c());
                    zzN("Uncaught exceptions will not be reported to Google Analytics");
                }
            } finally {
            }
        }
    }

    public void e0(long j4) {
        this.f27798I.f(j4 * 1000);
    }

    @P
    public String f(@P String str) {
        zzV();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f27795F.containsKey(str)) {
            return (String) this.f27795F.get(str);
        }
        if (str.equals("&ul")) {
            return zzfu.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (!str.equals("&aiid")) {
            return null;
        }
        return zzu().zza().zze();
    }

    public void h(@N Map<String, String> map) {
        boolean z3;
        long a4 = zzC().a();
        if (zzp().j()) {
            zzE("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        boolean m4 = zzp().m();
        HashMap hashMap = new HashMap();
        y0(this.f27795F, hashMap);
        y0(map, hashMap);
        String str = (String) this.f27795F.get("useSecure");
        int i4 = 1;
        if (str == null || str.equalsIgnoreCase(L1.a.f1650s3) || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1") || (!str.equalsIgnoreCase(L1.a.t3) && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase(com.harman.jbl.partybox.ui.effectlab.a.f43472q))) {
            z3 = true;
        } else {
            z3 = false;
        }
        Map map2 = this.f27796G;
        C1285y.l(hashMap);
        for (Map.Entry entry : map2.entrySet()) {
            String l12 = l1(entry);
            if (l12 != null && !hashMap.containsKey(l12)) {
                hashMap.put(l12, (String) entry.getValue());
            }
        }
        this.f27796G.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            zzz().zzc(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (!TextUtils.isEmpty(str3)) {
            boolean z4 = this.f27794E;
            synchronized (this) {
                try {
                    if (!"screenview".equalsIgnoreCase(str2)) {
                        if (!"pageview".equalsIgnoreCase(str2)) {
                            if (!"appview".equalsIgnoreCase(str2)) {
                                if (TextUtils.isEmpty(str2)) {
                                }
                            }
                        }
                    }
                    String str4 = (String) this.f27795F.get("&a");
                    C1285y.l(str4);
                    int parseInt = Integer.parseInt(str4) + 1;
                    if (parseInt < Integer.MAX_VALUE) {
                        i4 = parseInt;
                    }
                    this.f27795F.put("&a", Integer.toString(i4));
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzq().i(new D(this, hashMap, z4, str2, a4, m4, z3, str3));
            return;
        }
        zzz().zzc(hashMap, "Missing tracking id parameter");
    }

    public void i(@N String str, @P String str2) {
        C1285y.m(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f27795F.put(str, str2);
    }

    public void i0(@N String str) {
        i("&dt", str);
    }

    public void j(boolean z3) {
        i("&aip", zzfu.zzc(z3));
    }

    public void k(@N String str) {
        i("&aid", str);
    }

    public final void k1(zzft zzftVar) {
        boolean z3;
        boolean z4;
        zzN("Loading Tracker config values");
        this.f27800K = zzftVar;
        String str = zzftVar.zza;
        if (str != null) {
            i("&tid", str);
            zzO("trackingId loaded", str);
        }
        double d4 = zzftVar.zzb;
        if (d4 >= com.google.firebase.remoteconfig.l.f37524n) {
            String d5 = Double.toString(d4);
            i("&sf", d5);
            zzO("Sample frequency loaded", d5);
        }
        int i4 = zzftVar.zzc;
        if (i4 >= 0) {
            e0(i4);
            zzO("Session timeout loaded", Integer.valueOf(i4));
        }
        int i5 = zzftVar.zzd;
        boolean z5 = false;
        if (i5 != -1) {
            if (1 != i5) {
                z4 = false;
            } else {
                z4 = true;
            }
            c(z4);
            zzO("Auto activity tracking loaded", Boolean.valueOf(z4));
        }
        int i6 = zzftVar.zze;
        if (i6 != -1) {
            if (i6 != 0) {
                i("&aip", "1");
            }
            if (1 != i6) {
                z3 = false;
            } else {
                z3 = true;
            }
            zzO("Anonymize ip loaded", Boolean.valueOf(z3));
        }
        if (zzftVar.zzf == 1) {
            z5 = true;
        }
        d(z5);
    }

    public void m(@N String str) {
        i("&aiid", str);
    }

    public void n(@N String str) {
        i("&an", str);
    }

    public void p(@N String str) {
        i("&av", str);
    }

    public void t(@P Uri uri) {
        if (uri != null && !uri.isOpaque()) {
            String queryParameter = uri.getQueryParameter(b.c.f48987b);
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            Uri parse = Uri.parse("http://hostname/?".concat(String.valueOf(queryParameter)));
            String queryParameter2 = parse.getQueryParameter("utm_id");
            if (queryParameter2 != null) {
                this.f27796G.put("&ci", queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("anid");
            if (queryParameter3 != null) {
                this.f27796G.put("&anid", queryParameter3);
            }
            String queryParameter4 = parse.getQueryParameter("utm_campaign");
            if (queryParameter4 != null) {
                this.f27796G.put("&cn", queryParameter4);
            }
            String queryParameter5 = parse.getQueryParameter("utm_content");
            if (queryParameter5 != null) {
                this.f27796G.put("&cc", queryParameter5);
            }
            String queryParameter6 = parse.getQueryParameter("utm_medium");
            if (queryParameter6 != null) {
                this.f27796G.put("&cm", queryParameter6);
            }
            String queryParameter7 = parse.getQueryParameter("utm_source");
            if (queryParameter7 != null) {
                this.f27796G.put("&cs", queryParameter7);
            }
            String queryParameter8 = parse.getQueryParameter("utm_term");
            if (queryParameter8 != null) {
                this.f27796G.put("&ck", queryParameter8);
            }
            String queryParameter9 = parse.getQueryParameter("dclid");
            if (queryParameter9 != null) {
                this.f27796G.put("&dclid", queryParameter9);
            }
            String queryParameter10 = parse.getQueryParameter("gclid");
            if (queryParameter10 != null) {
                this.f27796G.put("&gclid", queryParameter10);
            }
            String queryParameter11 = parse.getQueryParameter(FirebaseAnalytics.b.f34770Q);
            if (queryParameter11 != null) {
                this.f27796G.put("&aclid", queryParameter11);
            }
        }
    }

    public void u0(boolean z3) {
        i("useSecure", zzfu.zzc(z3));
    }

    public void v(@N String str) {
        i("&cid", str);
    }

    public void x0(@N String str) {
        i("&vp", str);
    }

    public void z(@N String str) {
        i("&de", str);
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        this.f27798I.zzW();
        String zza = zzB().zza();
        if (zza != null) {
            i("&an", zza);
        }
        String zzb = zzB().zzb();
        if (zzb != null) {
            i("&av", zzb);
        }
    }
}

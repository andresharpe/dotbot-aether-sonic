package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfu;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends zzbt implements C {

    /* renamed from: H, reason: collision with root package name */
    private static DecimalFormat f27803H;

    /* renamed from: E, reason: collision with root package name */
    private final zzbx f27804E;

    /* renamed from: F, reason: collision with root package name */
    private final String f27805F;

    /* renamed from: G, reason: collision with root package name */
    private final Uri f27806G;

    public k(zzbx zzbxVar, String str) {
        super(zzbxVar);
        C1285y.h(str);
        this.f27804E = zzbxVar;
        this.f27805F = str;
        this.f27806G = b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri b(String str) {
        C1285y.h(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    static String c(double d4) {
        if (f27803H == null) {
            f27803H = new DecimalFormat("0.######");
        }
        return f27803H.format(d4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[SYNTHETIC] */
    @com.google.android.gms.common.util.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map d(com.google.android.gms.analytics.q r10) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.k.d(com.google.android.gms.analytics.q):java.util.Map");
    }

    private static void f(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    private static void h(Map map, String str, boolean z3) {
        if (z3) {
            map.put(str, "1");
        }
    }

    @Override // com.google.android.gms.analytics.C
    public final void a(q qVar) {
        C1285y.l(qVar);
        C1285y.b(qVar.m(), "Can't deliver not submitted measurement");
        C1285y.k("deliver should be called on worker thread");
        q qVar2 = new q(qVar);
        zzbg zzbgVar = (zzbg) qVar2.b(zzbg.class);
        if (TextUtils.isEmpty(zzbgVar.zzf())) {
            zzz().zzc(d(qVar2), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(zzbgVar.zze())) {
            zzz().zzc(d(qVar2), "Ignoring measurement without client id");
            return;
        }
        if (!this.f27804E.zzc().j()) {
            if (zzfu.zzj(com.google.firebase.remoteconfig.l.f37524n, zzbgVar.zze())) {
                zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(com.google.firebase.remoteconfig.l.f37524n));
                return;
            }
            Map d4 = d(qVar2);
            d4.put("v", "1");
            d4.put("_v", zzbv.zzb);
            d4.put("tid", this.f27805F);
            if (this.f27804E.zzc().m()) {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry entry : d4.entrySet()) {
                    if (sb.length() != 0) {
                        sb.append(", ");
                    }
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                }
                zzM("Dry run is enabled. GoogleAnalytics would have sent", sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            zzfu.zzg(hashMap, "uid", zzbgVar.zzg());
            zzax zzaxVar = (zzax) qVar.c(zzax.class);
            if (zzaxVar != null) {
                zzfu.zzg(hashMap, "an", zzaxVar.zzf());
                zzfu.zzg(hashMap, "aid", zzaxVar.zzd());
                zzfu.zzg(hashMap, "av", zzaxVar.zzg());
                zzfu.zzg(hashMap, "aiid", zzaxVar.zze());
            }
            d4.put("_s", String.valueOf(zzs().zza(new zzbz(0L, zzbgVar.zze(), this.f27805F, !TextUtils.isEmpty(zzbgVar.zzd()), 0L, hashMap))));
            zzs().zzh(new zzez(zzz(), d4, qVar.a(), true));
        }
    }

    @Override // com.google.android.gms.analytics.C
    public final Uri zzb() {
        return this.f27806G;
    }
}

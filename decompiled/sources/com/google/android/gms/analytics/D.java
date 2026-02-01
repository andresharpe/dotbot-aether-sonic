package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbz;
import com.google.android.gms.internal.gtm.zzch;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfu;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class D implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Map f27744E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ boolean f27745F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ String f27746G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ long f27747H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ boolean f27748I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ boolean f27749J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ String f27750K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ i f27751L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(i iVar, Map map, boolean z3, String str, long j4, boolean z4, boolean z5, String str2) {
        this.f27751L = iVar;
        this.f27744E = map;
        this.f27745F = z3;
        this.f27746G = str;
        this.f27747H = j4;
        this.f27748I = z4;
        this.f27749J = z5;
        this.f27750K = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e4;
        double d4;
        zzbk zzr;
        zzch zzu;
        zzcz zzx;
        zzcz zzx2;
        zzbs zzs;
        zzbs zzs2;
        zzfd zzz;
        zzfb zzfbVar;
        zzfd zzz2;
        String str;
        e4 = this.f27751L.f27798I;
        if (e4.zzf()) {
            this.f27744E.put("sc", "start");
        }
        Map map = this.f27744E;
        C1157e zzp = this.f27751L.zzp();
        C1285y.k("getClientId can not be called from the main thread");
        String zzb = zzp.e().zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str2 = (String) this.f27744E.get("sf");
        if (str2 != null) {
            try {
                d4 = Double.parseDouble(str2);
            } catch (NumberFormatException unused) {
                d4 = 100.0d;
            }
            if (zzfu.zzj(d4, (String) this.f27744E.get("cid"))) {
                this.f27751L.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d4));
                return;
            }
        }
        zzr = this.f27751L.zzr();
        if (this.f27745F) {
            Map map2 = this.f27744E;
            boolean zzb2 = zzr.zzb();
            if (!map2.containsKey("ate")) {
                if (true == zzb2) {
                    str = "1";
                } else {
                    str = com.harman.jbl.partybox.ui.effectlab.a.f43472q;
                }
                map2.put("ate", str);
            }
            zzfu.zzg(this.f27744E, "adid", zzr.zza());
        } else {
            this.f27744E.remove("ate");
            this.f27744E.remove("adid");
        }
        zzu = this.f27751L.zzu();
        zzax zza = zzu.zza();
        zzfu.zzg(this.f27744E, "an", zza.zzf());
        zzfu.zzg(this.f27744E, "av", zza.zzg());
        zzfu.zzg(this.f27744E, "aid", zza.zzd());
        zzfu.zzg(this.f27744E, "aiid", zza.zze());
        this.f27744E.put("v", "1");
        this.f27744E.put("_v", zzbv.zzb);
        Map map3 = this.f27744E;
        zzx = this.f27751L.zzx();
        zzfu.zzg(map3, "ul", zzx.zza().zzd());
        Map map4 = this.f27744E;
        zzx2 = this.f27751L.zzx();
        zzfu.zzg(map4, "sr", zzx2.zzb());
        if (!this.f27746G.equals("transaction") && !this.f27746G.equals("item")) {
            zzfbVar = this.f27751L.f27797H;
            if (!zzfbVar.zza()) {
                zzz2 = this.f27751L.zzz();
                zzz2.zzc(this.f27744E, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
        }
        long zza2 = zzfu.zza((String) this.f27744E.get("ht"));
        if (zza2 == 0) {
            zza2 = this.f27747H;
        }
        long j4 = zza2;
        if (this.f27748I) {
            zzez zzezVar = new zzez(this.f27751L, this.f27744E, j4, this.f27749J);
            zzz = this.f27751L.zzz();
            zzz.zzM("Dry run enabled. Would have sent hit", zzezVar);
            return;
        }
        String str3 = (String) this.f27744E.get("cid");
        HashMap hashMap = new HashMap();
        zzfu.zzh(hashMap, "uid", this.f27744E);
        zzfu.zzh(hashMap, "an", this.f27744E);
        zzfu.zzh(hashMap, "aid", this.f27744E);
        zzfu.zzh(hashMap, "av", this.f27744E);
        zzfu.zzh(hashMap, "aiid", this.f27744E);
        C1285y.l(str3);
        zzbz zzbzVar = new zzbz(0L, str3, this.f27750K, !TextUtils.isEmpty((CharSequence) this.f27744E.get("adid")), 0L, hashMap);
        zzs = this.f27751L.zzs();
        this.f27744E.put("_s", String.valueOf(zzs.zza(zzbzVar)));
        zzez zzezVar2 = new zzez(this.f27751L, this.f27744E, j4, this.f27749J);
        zzs2 = this.f27751L.zzs();
        zzs2.zzh(zzezVar2);
    }
}

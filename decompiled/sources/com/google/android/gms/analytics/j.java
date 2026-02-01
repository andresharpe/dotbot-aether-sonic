package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.gtm.zzbx;
import java.util.ListIterator;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public class j extends t {

    /* renamed from: d, reason: collision with root package name */
    private final zzbx f27801d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27802e;

    @com.google.android.gms.common.util.D
    public j(zzbx zzbxVar) {
        super(zzbxVar.zzd(), zzbxVar.zzr());
        this.f27801d = zzbxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.analytics.t
    public final void a(q qVar) {
        zzbg zzbgVar = (zzbg) qVar.b(zzbg.class);
        if (TextUtils.isEmpty(zzbgVar.zze())) {
            zzbgVar.zzj(this.f27801d.zzi().zzb());
        }
        if (this.f27802e && TextUtils.isEmpty(zzbgVar.zzd())) {
            zzbk zze = this.f27801d.zze();
            zzbgVar.zzi(zze.zza());
            zzbgVar.zzh(zze.zzb());
        }
    }

    public final q d() {
        q qVar = new q(this.f27823b);
        qVar.g(this.f27801d.zzh().zza());
        qVar.g(this.f27801d.zzk().zza());
        c(qVar);
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final zzbx e() {
        return this.f27801d;
    }

    public final void f(String str) {
        C1285y.h(str);
        Uri b4 = k.b(str);
        ListIterator listIterator = this.f27823b.f().listIterator();
        while (listIterator.hasNext()) {
            if (b4.equals(((C) listIterator.next()).zzb())) {
                listIterator.remove();
            }
        }
        this.f27823b.f().add(new k(this.f27801d, str));
    }

    public final void g(boolean z3) {
        this.f27802e = z3;
    }
}

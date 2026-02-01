package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzft;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class E extends zzbu {

    /* renamed from: E, reason: collision with root package name */
    private boolean f27752E;

    /* renamed from: F, reason: collision with root package name */
    private int f27753F;

    /* renamed from: G, reason: collision with root package name */
    private long f27754G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f27755H;

    /* renamed from: I, reason: collision with root package name */
    private long f27756I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ i f27757J;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(i iVar, zzbx zzbxVar) {
        super(zzbxVar);
        this.f27757J = iVar;
        this.f27754G = -1L;
    }

    private final void zzg() {
        if (this.f27754G < 0 && !this.f27752E) {
            zzp().B(i.z0(this.f27757J));
        } else {
            zzp().A(i.z0(this.f27757J));
        }
    }

    public final void b(Activity activity) {
        String canonicalName;
        if (this.f27753F == 0 && zzC().c() >= this.f27756I + Math.max(1000L, this.f27754G)) {
            this.f27755H = true;
        }
        this.f27753F++;
        if (this.f27752E) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.f27757J.t(intent.getData());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("&t", "screenview");
            i iVar = this.f27757J;
            if (i.j1(iVar) != null) {
                zzft j12 = i.j1(iVar);
                canonicalName = activity.getClass().getCanonicalName();
                String str = (String) j12.zzg.get(canonicalName);
                if (str != null) {
                    canonicalName = str;
                }
            } else {
                canonicalName = activity.getClass().getCanonicalName();
            }
            iVar.i("&cd", canonicalName);
            if (TextUtils.isEmpty((CharSequence) hashMap.get("&dr"))) {
                C1285y.l(activity);
                Intent intent2 = activity.getIntent();
                String str2 = null;
                if (intent2 != null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        str2 = stringExtra;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("&dr", str2);
                }
            }
            this.f27757J.h(hashMap);
        }
    }

    public final void c(Activity activity) {
        int i4 = this.f27753F - 1;
        this.f27753F = i4;
        int max = Math.max(0, i4);
        this.f27753F = max;
        if (max == 0) {
            this.f27756I = zzC().c();
        }
    }

    public final void d(boolean z3) {
        this.f27752E = z3;
        zzg();
    }

    public final void f(long j4) {
        this.f27754G = j4;
        zzg();
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
    }

    public final synchronized boolean zzf() {
        boolean z3;
        z3 = this.f27755H;
        this.f27755H = false;
        return z3;
    }
}

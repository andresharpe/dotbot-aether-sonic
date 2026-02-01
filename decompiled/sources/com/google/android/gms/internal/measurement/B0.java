package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class B0 extends X0 {

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ String f29266I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ String f29267J;

    /* renamed from: K, reason: collision with root package name */
    final /* synthetic */ Context f29268K;

    /* renamed from: L, reason: collision with root package name */
    final /* synthetic */ Bundle f29269L;

    /* renamed from: M, reason: collision with root package name */
    final /* synthetic */ C1421j1 f29270M;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C1421j1 c1421j1, String str, String str2, Context context, Bundle bundle) {
        super(c1421j1, true);
        this.f29270M = c1421j1;
        this.f29266I = str;
        this.f29267J = str2;
        this.f29268K = context;
        this.f29269L = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.X0
    public final void a() {
        boolean v3;
        String str;
        String str2;
        String str3;
        InterfaceC1396g0 interfaceC1396g0;
        boolean z3;
        InterfaceC1396g0 interfaceC1396g02;
        String str4;
        String str5;
        try {
            C1421j1 c1421j1 = this.f29270M;
            v3 = C1421j1.v(this.f29266I, this.f29267J);
            if (v3) {
                String str6 = this.f29267J;
                String str7 = this.f29266I;
                str5 = this.f29270M.f29677a;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C1285y.l(this.f29268K);
            C1421j1 c1421j12 = this.f29270M;
            c1421j12.f29685i = c1421j12.B(this.f29268K, true);
            interfaceC1396g0 = this.f29270M.f29685i;
            if (interfaceC1396g0 == null) {
                str4 = this.f29270M.f29677a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int a4 = DynamiteModule.a(this.f29268K, ModuleDescriptor.MODULE_ID);
            int c4 = DynamiteModule.c(this.f29268K, ModuleDescriptor.MODULE_ID);
            int max = Math.max(a4, c4);
            if (c4 < a4) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1468p0 c1468p0 = new C1468p0(73000L, max, z3, str, str2, str3, this.f29269L, com.google.android.gms.measurement.internal.X1.a(this.f29268K));
            interfaceC1396g02 = this.f29270M.f29685i;
            ((InterfaceC1396g0) C1285y.l(interfaceC1396g02)).initialize(com.google.android.gms.dynamic.f.O0(this.f29268K), c1468p0, this.f29546E);
        } catch (Exception e4) {
            this.f29270M.s(e4, true, false);
        }
    }
}

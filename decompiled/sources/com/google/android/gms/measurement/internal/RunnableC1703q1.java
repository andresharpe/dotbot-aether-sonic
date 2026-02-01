package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1703q1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ int f30920E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ String f30921F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Object f30922G;

    /* renamed from: H, reason: collision with root package name */
    final /* synthetic */ Object f30923H;

    /* renamed from: I, reason: collision with root package name */
    final /* synthetic */ Object f30924I;

    /* renamed from: J, reason: collision with root package name */
    final /* synthetic */ C1720t1 f30925J;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1703q1(C1720t1 c1720t1, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.f30925J = c1720t1;
        this.f30920E = i4;
        this.f30921F = str;
        this.f30922G = obj;
        this.f30923H = obj2;
        this.f30924I = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        long j4;
        char c5;
        long j5;
        J1 D3 = this.f30925J.f31060a.D();
        if (D3.l()) {
            C1720t1 c1720t1 = this.f30925J;
            c4 = c1720t1.f30972c;
            if (c4 == 0) {
                if (c1720t1.f31060a.x().F()) {
                    C1720t1 c1720t12 = this.f30925J;
                    c1720t12.f31060a.zzaw();
                    c1720t12.f30972c = 'C';
                } else {
                    C1720t1 c1720t13 = this.f30925J;
                    c1720t13.f31060a.zzaw();
                    c1720t13.f30972c = 'c';
                }
            }
            C1720t1 c1720t14 = this.f30925J;
            j4 = c1720t14.f30973d;
            if (j4 < 0) {
                c1720t14.f31060a.x().o();
                c1720t14.f30973d = 73000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f30920E);
            C1720t1 c1720t15 = this.f30925J;
            c5 = c1720t15.f30972c;
            j5 = c1720t15.f30973d;
            String str = "2" + charAt + c5 + j5 + ":" + C1720t1.y(true, this.f30921F, this.f30922G, this.f30923H, this.f30924I);
            if (str.length() > 1024) {
                str = this.f30921F.substring(0, 1024);
            }
            H1 h12 = D3.f30250d;
            if (h12 != null) {
                h12.b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f30925J.A(), "Persisted config not initialized. Not logging error/warn");
    }
}

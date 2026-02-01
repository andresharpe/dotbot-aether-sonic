package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    private final t1 f28430E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ w1 f28431F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(w1 w1Var, t1 t1Var) {
        this.f28431F = w1Var;
        this.f28430E = t1Var;
    }

    @Override // java.lang.Runnable
    @androidx.annotation.K
    public final void run() {
        if (!this.f28431F.f28445F) {
            return;
        }
        C1231c b4 = this.f28430E.b();
        if (b4.u0()) {
            w1 w1Var = this.f28431F;
            w1Var.f28187E.startActivityForResult(GoogleApiActivity.a(w1Var.b(), (PendingIntent) C1285y.l(b4.i0()), this.f28430E.a(), false), 1);
            return;
        }
        w1 w1Var2 = this.f28431F;
        if (w1Var2.f28448I.e(w1Var2.b(), b4.c0(), null) != null) {
            w1 w1Var3 = this.f28431F;
            w1Var3.f28448I.K(w1Var3.b(), this.f28431F.f28187E, b4.c0(), 2, this.f28431F);
        } else {
            if (b4.c0() != 18) {
                this.f28431F.m(b4, this.f28430E.a());
                return;
            }
            w1 w1Var4 = this.f28431F;
            Dialog F3 = w1Var4.f28448I.F(w1Var4.b(), this.f28431F);
            w1 w1Var5 = this.f28431F;
            w1Var5.f28448I.G(w1Var5.b().getApplicationContext(), new u1(this, F3));
        }
    }
}

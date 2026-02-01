package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class w1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: F, reason: collision with root package name */
    protected volatile boolean f28445F;

    /* renamed from: G, reason: collision with root package name */
    protected final AtomicReference<t1> f28446G;

    /* renamed from: H, reason: collision with root package name */
    private final Handler f28447H;

    /* renamed from: I, reason: collision with root package name */
    protected final C1236h f28448I;

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public w1(InterfaceC1203m interfaceC1203m, C1236h c1236h) {
        super(interfaceC1203m);
        this.f28446G = new AtomicReference<>(null);
        this.f28447H = new com.google.android.gms.internal.base.q(Looper.getMainLooper());
        this.f28448I = c1236h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(C1231c c1231c, int i4) {
        this.f28446G.set(null);
        n(c1231c, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        this.f28446G.set(null);
        o();
    }

    private static final int q(@androidx.annotation.P t1 t1Var) {
        if (t1Var == null) {
            return -1;
        }
        return t1Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(int i4, int i5, Intent intent) {
        t1 t1Var = this.f28446G.get();
        if (i4 != 1) {
            if (i4 == 2) {
                int j4 = this.f28448I.j(b());
                if (j4 == 0) {
                    p();
                    return;
                } else {
                    if (t1Var == null) {
                        return;
                    }
                    if (t1Var.b().c0() == 18 && j4 == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i5 == -1) {
                p();
                return;
            }
            if (i5 == 0) {
                if (t1Var == null) {
                    return;
                }
                int i6 = 13;
                if (intent != null) {
                    i6 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m(new C1231c(i6, null, t1Var.b().toString()), q(t1Var));
                return;
            }
        }
        if (t1Var != null) {
            m(t1Var.b(), t1Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g(@androidx.annotation.P Bundle bundle) {
        t1 t1Var;
        super.g(bundle);
        if (bundle != null) {
            AtomicReference<t1> atomicReference = this.f28446G;
            if (bundle.getBoolean("resolving_error", false)) {
                t1Var = new t1(new C1231c(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                t1Var = null;
            }
            atomicReference.set(t1Var);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j(Bundle bundle) {
        super.j(bundle);
        t1 t1Var = this.f28446G.get();
        if (t1Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", t1Var.a());
        bundle.putInt("failed_status", t1Var.b().c0());
        bundle.putParcelable("failed_resolution", t1Var.b().i0());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f28445F = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void l() {
        super.l();
        this.f28445F = false;
    }

    protected abstract void n(C1231c c1231c, int i4);

    protected abstract void o();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m(new C1231c(13, null), q(this.f28446G.get()));
    }

    public final void t(C1231c c1231c, int i4) {
        t1 t1Var = new t1(c1231c, i4);
        if (androidx.lifecycle.B.a(this.f28446G, null, t1Var)) {
            this.f28447H.post(new v1(this, t1Var));
        }
    }
}

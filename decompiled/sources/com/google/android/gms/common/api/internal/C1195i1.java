package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.C1285y;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195i1<R extends com.google.android.gms.common.api.q> extends com.google.android.gms.common.api.u<R> implements com.google.android.gms.common.api.r<R> {

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<com.google.android.gms.common.api.i> f28312g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerC1189g1 f28313h;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private com.google.android.gms.common.api.t<? super R, ? extends com.google.android.gms.common.api.q> f28306a = null;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private C1195i1<? extends com.google.android.gms.common.api.q> f28307b = null;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private volatile com.google.android.gms.common.api.s<? super R> f28308c = null;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private com.google.android.gms.common.api.l<R> f28309d = null;

    /* renamed from: e, reason: collision with root package name */
    private final Object f28310e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.P
    private Status f28311f = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f28314i = false;

    public C1195i1(WeakReference<com.google.android.gms.common.api.i> weakReference) {
        Looper mainLooper;
        C1285y.m(weakReference, "GoogleApiClient reference must not be null");
        this.f28312g = weakReference;
        com.google.android.gms.common.api.i iVar = weakReference.get();
        if (iVar != null) {
            mainLooper = iVar.r();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f28313h = new HandlerC1189g1(this, mainLooper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Status status) {
        synchronized (this.f28310e) {
            this.f28311f = status;
            o(status);
        }
    }

    @GuardedBy("mSyncToken")
    private final void n() {
        if (this.f28306a == null && this.f28308c == null) {
            return;
        }
        com.google.android.gms.common.api.i iVar = this.f28312g.get();
        if (!this.f28314i && this.f28306a != null && iVar != null) {
            iVar.H(this);
            this.f28314i = true;
        }
        Status status = this.f28311f;
        if (status != null) {
            o(status);
            return;
        }
        com.google.android.gms.common.api.l<R> lVar = this.f28309d;
        if (lVar != null) {
            lVar.setResultCallback(this);
        }
    }

    private final void o(Status status) {
        synchronized (this.f28310e) {
            try {
                com.google.android.gms.common.api.t<? super R, ? extends com.google.android.gms.common.api.q> tVar = this.f28306a;
                if (tVar != null) {
                    ((C1195i1) C1285y.l(this.f28307b)).m((Status) C1285y.m(tVar.b(status), "onFailure must not return null"));
                } else if (p()) {
                    ((com.google.android.gms.common.api.s) C1285y.l(this.f28308c)).b(status);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("mSyncToken")
    private final boolean p() {
        com.google.android.gms.common.api.i iVar = this.f28312g.get();
        if (this.f28308c != null && iVar != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof com.google.android.gms.common.api.n) {
            try {
                ((com.google.android.gms.common.api.n) qVar).release();
            } catch (RuntimeException e4) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(qVar)), e4);
            }
        }
    }

    @Override // com.google.android.gms.common.api.r
    public final void a(R r4) {
        synchronized (this.f28310e) {
            try {
                if (r4.getStatus().B0()) {
                    if (this.f28306a != null) {
                        V0.a().submit(new RunnableC1186f1(this, r4));
                    } else if (p()) {
                        ((com.google.android.gms.common.api.s) C1285y.l(this.f28308c)).c(r4);
                    }
                } else {
                    m(r4.getStatus());
                    q(r4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.u
    public final void b(@androidx.annotation.N com.google.android.gms.common.api.s<? super R> sVar) {
        boolean z3;
        synchronized (this.f28310e) {
            boolean z4 = false;
            if (this.f28308c == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.s(z3, "Cannot call andFinally() twice.");
            if (this.f28306a == null) {
                z4 = true;
            }
            C1285y.s(z4, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f28308c = sVar;
            n();
        }
    }

    @Override // com.google.android.gms.common.api.u
    @androidx.annotation.N
    public final <S extends com.google.android.gms.common.api.q> com.google.android.gms.common.api.u<S> c(@androidx.annotation.N com.google.android.gms.common.api.t<? super R, ? extends S> tVar) {
        boolean z3;
        C1195i1<? extends com.google.android.gms.common.api.q> c1195i1;
        synchronized (this.f28310e) {
            boolean z4 = false;
            if (this.f28306a == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.s(z3, "Cannot call then() twice.");
            if (this.f28308c == null) {
                z4 = true;
            }
            C1285y.s(z4, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f28306a = tVar;
            c1195i1 = new C1195i1<>(this.f28312g);
            this.f28307b = c1195i1;
            n();
        }
        return c1195i1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.f28308c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(com.google.android.gms.common.api.l<?> lVar) {
        synchronized (this.f28310e) {
            this.f28309d = lVar;
            n();
        }
    }
}

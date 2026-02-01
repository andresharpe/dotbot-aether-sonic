package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.InterfaceC1270q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@I0.a
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.q> extends com.google.android.gms.common.api.l<R> {
    static final ThreadLocal<Boolean> zaa = new x1();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private z1 mResultGuardian;

    @androidx.annotation.N
    protected final a<R> zab;

    @androidx.annotation.N
    protected final WeakReference<com.google.android.gms.common.api.i> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<l.a> zag;

    @androidx.annotation.P
    private com.google.android.gms.common.api.r<? super R> zah;
    private final AtomicReference<C1198j1> zai;

    @androidx.annotation.P
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @androidx.annotation.P
    private InterfaceC1270q zao;
    private volatile C1195i1<R> zap;
    private boolean zaq;

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(Looper.getMainLooper());
        this.zac = new WeakReference<>(null);
    }

    private final R c() {
        R r4;
        synchronized (this.zae) {
            C1285y.s(!this.zal, "Result has already been consumed.");
            C1285y.s(isReady(), "Result is not ready.");
            r4 = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        C1198j1 andSet = this.zai.getAndSet(null);
        if (andSet != null) {
            andSet.f28322a.f28348a.remove(this);
        }
        return (R) C1285y.l(r4);
    }

    private final void d(R r4) {
        this.zaj = r4;
        this.zak = r4.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.r<? super R> rVar = this.zah;
            if (rVar == null) {
                if (this.zaj instanceof com.google.android.gms.common.api.n) {
                    this.mResultGuardian = new z1(this, null);
                }
            } else {
                this.zab.removeMessages(2);
                this.zab.a(rVar, c());
            }
        }
        ArrayList<l.a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.get(i4).a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(@androidx.annotation.P com.google.android.gms.common.api.q qVar) {
        if (qVar instanceof com.google.android.gms.common.api.n) {
            try {
                ((com.google.android.gms.common.api.n) qVar).release();
            } catch (RuntimeException e4) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(qVar)), e4);
            }
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final void addStatusListener(@androidx.annotation.N l.a aVar) {
        boolean z3;
        if (aVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final R await() {
        C1285y.k("await must not be called on the UI thread");
        C1285y.s(!this.zal, "Result has already been consumed");
        C1285y.s(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f28026L);
        }
        C1285y.s(isReady(), "Result is not ready.");
        return c();
    }

    @Override // com.google.android.gms.common.api.l
    @I0.a
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                InterfaceC1270q interfaceC1270q = this.zao;
                if (interfaceC1270q != null) {
                    try {
                        interfaceC1270q.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                d(createFailedResult(Status.f28029O));
            }
        }
    }

    @I0.a
    @androidx.annotation.N
    public abstract R createFailedResult(@androidx.annotation.N Status status);

    @I0.a
    @Deprecated
    public final void forceFailureUnlessReady(@androidx.annotation.N Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.l
    public final boolean isCanceled() {
        boolean z3;
        synchronized (this.zae) {
            z3 = this.zam;
        }
        return z3;
    }

    @I0.a
    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    @I0.a
    protected final void setCancelToken(@androidx.annotation.N InterfaceC1270q interfaceC1270q) {
        synchronized (this.zae) {
            this.zao = interfaceC1270q;
        }
    }

    @I0.a
    public final void setResult(@androidx.annotation.N R r4) {
        synchronized (this.zae) {
            try {
                if (!this.zan && !this.zam) {
                    isReady();
                    C1285y.s(!isReady(), "Results have already been set");
                    C1285y.s(!this.zal, "Result has already been consumed");
                    d(r4);
                    return;
                }
                zal(r4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.l
    @I0.a
    public final void setResultCallback(@androidx.annotation.P com.google.android.gms.common.api.r<? super R> rVar) {
        synchronized (this.zae) {
            try {
                if (rVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z3 = true;
                C1285y.s(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z3 = false;
                }
                C1285y.s(z3, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(rVar, c());
                } else {
                    this.zah = rVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final <S extends com.google.android.gms.common.api.q> com.google.android.gms.common.api.u<S> then(@androidx.annotation.N com.google.android.gms.common.api.t<? super R, ? extends S> tVar) {
        boolean z3;
        com.google.android.gms.common.api.u<S> c4;
        C1285y.s(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                boolean z4 = false;
                if (this.zap == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1285y.s(z3, "Cannot call then() twice.");
                if (this.zah == null) {
                    z4 = true;
                }
                C1285y.s(z4, "Cannot call then() if callbacks are set.");
                C1285y.s(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new C1195i1<>(this.zac);
                c4 = this.zap.c(tVar);
                if (isReady()) {
                    this.zab.a(this.zap, c());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4;
    }

    public final void zak() {
        boolean z3 = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z3 = false;
        }
        this.zaq = z3;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (this.zac.get() != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(@androidx.annotation.P C1198j1 c1198j1) {
        this.zai.set(c1198j1);
    }

    @com.google.android.gms.common.util.D
    /* loaded from: classes.dex */
    public static class a<R extends com.google.android.gms.common.api.q> extends com.google.android.gms.internal.base.q {
        public a() {
            super(Looper.getMainLooper());
        }

        public final void a(@androidx.annotation.N com.google.android.gms.common.api.r<? super R> rVar, @androidx.annotation.N R r4) {
            int i4 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.r) C1285y.l(rVar), r4)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@androidx.annotation.N Message message) {
            int i4 = message.what;
            if (i4 != 1) {
                if (i4 != 2) {
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i4);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f28028N);
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) pair.first;
            com.google.android.gms.common.api.q qVar = (com.google.android.gms.common.api.q) pair.second;
            try {
                rVar.a(qVar);
            } catch (RuntimeException e4) {
                BasePendingResult.zal(qVar);
                throw e4;
            }
        }

        public a(@androidx.annotation.N Looper looper) {
            super(looper);
        }
    }

    @I0.a
    @Deprecated
    public BasePendingResult(@androidx.annotation.N Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(looper);
        this.zac = new WeakReference<>(null);
    }

    @Override // com.google.android.gms.common.api.l
    @androidx.annotation.N
    public final R await(long j4, @androidx.annotation.N TimeUnit timeUnit) {
        if (j4 > 0) {
            C1285y.k("await must not be called on the UI thread when time is greater than zero.");
        }
        C1285y.s(!this.zal, "Result has already been consumed.");
        C1285y.s(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j4, timeUnit)) {
                forceFailureUnlessReady(Status.f28028N);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f28026L);
        }
        C1285y.s(isReady(), "Result is not ready.");
        return c();
    }

    @Override // com.google.android.gms.common.api.l
    @I0.a
    public final void setResultCallback(@androidx.annotation.N com.google.android.gms.common.api.r<? super R> rVar, long j4, @androidx.annotation.N TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (rVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z3 = true;
                C1285y.s(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z3 = false;
                }
                C1285y.s(z3, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(rVar, c());
                } else {
                    this.zah = rVar;
                    a<R> aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public BasePendingResult(@androidx.annotation.P com.google.android.gms.common.api.i iVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new a<>(iVar != null ? iVar.r() : Looper.getMainLooper());
        this.zac = new WeakReference<>(iVar);
    }

    @I0.a
    @com.google.android.gms.common.util.D
    public BasePendingResult(@androidx.annotation.N a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = (a) C1285y.m(aVar, "CallbackHandler must not be null");
        this.zac = new WeakReference<>(null);
    }
}

package com.bumptech.glide.request;

import androidx.annotation.B;
import androidx.annotation.P;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes.dex */
public class k implements RequestCoordinator, e {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final RequestCoordinator f26827a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f26828b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f26829c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f26830d;

    /* renamed from: e, reason: collision with root package name */
    @B("requestLock")
    private RequestCoordinator.RequestState f26831e;

    /* renamed from: f, reason: collision with root package name */
    @B("requestLock")
    private RequestCoordinator.RequestState f26832f;

    /* renamed from: g, reason: collision with root package name */
    @B("requestLock")
    private boolean f26833g;

    public k(Object obj, @P RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f26831e = requestState;
        this.f26832f = requestState;
        this.f26828b = obj;
        this.f26827a = requestCoordinator;
    }

    @B("requestLock")
    private boolean m() {
        RequestCoordinator requestCoordinator = this.f26827a;
        if (requestCoordinator != null && !requestCoordinator.l(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean n() {
        RequestCoordinator requestCoordinator = this.f26827a;
        if (requestCoordinator != null && !requestCoordinator.f(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean o() {
        RequestCoordinator requestCoordinator = this.f26827a;
        if (requestCoordinator != null && !requestCoordinator.h(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void a(e eVar) {
        synchronized (this.f26828b) {
            try {
                if (!eVar.equals(this.f26829c)) {
                    this.f26832f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f26831e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f26827a;
                if (requestCoordinator != null) {
                    requestCoordinator.a(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void b() {
        synchronized (this.f26828b) {
            try {
                if (!this.f26832f.b()) {
                    this.f26832f = RequestCoordinator.RequestState.PAUSED;
                    this.f26830d.b();
                }
                if (!this.f26831e.b()) {
                    this.f26831e = RequestCoordinator.RequestState.PAUSED;
                    this.f26829c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean c() {
        boolean z3;
        synchronized (this.f26828b) {
            try {
                if (!this.f26830d.c() && !this.f26829c.c()) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f26828b) {
            this.f26833g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f26831e = requestState;
            this.f26832f = requestState;
            this.f26830d.clear();
            this.f26829c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator d() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f26828b) {
            try {
                RequestCoordinator requestCoordinator2 = this.f26827a;
                if (requestCoordinator2 != null) {
                    requestCoordinator = requestCoordinator2.d();
                } else {
                    requestCoordinator = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return requestCoordinator;
    }

    @Override // com.bumptech.glide.request.e
    public boolean e(e eVar) {
        if (!(eVar instanceof k)) {
            return false;
        }
        k kVar = (k) eVar;
        if (this.f26829c == null) {
            if (kVar.f26829c != null) {
                return false;
            }
        } else if (!this.f26829c.e(kVar.f26829c)) {
            return false;
        }
        if (this.f26830d == null) {
            if (kVar.f26830d != null) {
                return false;
            }
        } else if (!this.f26830d.e(kVar.f26830d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(e eVar) {
        boolean z3;
        synchronized (this.f26828b) {
            try {
                if (n() && eVar.equals(this.f26829c) && !c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g() {
        boolean z3;
        synchronized (this.f26828b) {
            if (this.f26831e == RequestCoordinator.RequestState.CLEARED) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean h(e eVar) {
        boolean z3;
        synchronized (this.f26828b) {
            try {
                if (!o() || (!eVar.equals(this.f26829c) && this.f26831e == RequestCoordinator.RequestState.SUCCESS)) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f26828b) {
            try {
                this.f26833g = true;
                try {
                    if (this.f26831e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f26832f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f26832f = requestState2;
                            this.f26830d.i();
                        }
                    }
                    if (this.f26833g) {
                        RequestCoordinator.RequestState requestState3 = this.f26831e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f26831e = requestState4;
                            this.f26829c.i();
                        }
                    }
                    this.f26833g = false;
                } catch (Throwable th) {
                    this.f26833g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f26828b) {
            if (this.f26831e == RequestCoordinator.RequestState.RUNNING) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(e eVar) {
        synchronized (this.f26828b) {
            try {
                if (eVar.equals(this.f26830d)) {
                    this.f26832f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f26831e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f26827a;
                if (requestCoordinator != null) {
                    requestCoordinator.j(this);
                }
                if (!this.f26832f.b()) {
                    this.f26830d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean k() {
        boolean z3;
        synchronized (this.f26828b) {
            if (this.f26831e == RequestCoordinator.RequestState.SUCCESS) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean l(e eVar) {
        boolean z3;
        synchronized (this.f26828b) {
            try {
                if (m() && eVar.equals(this.f26829c) && this.f26831e != RequestCoordinator.RequestState.PAUSED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    public void p(e eVar, e eVar2) {
        this.f26829c = eVar;
        this.f26830d = eVar2;
    }
}

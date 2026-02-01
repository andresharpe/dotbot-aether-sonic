package com.bumptech.glide.request;

import androidx.annotation.B;
import androidx.annotation.P;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes.dex */
public final class b implements RequestCoordinator, e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26770a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final RequestCoordinator f26771b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f26772c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f26773d;

    /* renamed from: e, reason: collision with root package name */
    @B("requestLock")
    private RequestCoordinator.RequestState f26774e;

    /* renamed from: f, reason: collision with root package name */
    @B("requestLock")
    private RequestCoordinator.RequestState f26775f;

    public b(Object obj, @P RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f26774e = requestState;
        this.f26775f = requestState;
        this.f26770a = obj;
        this.f26771b = requestCoordinator;
    }

    @B("requestLock")
    private boolean m(e eVar) {
        if (!eVar.equals(this.f26772c) && (this.f26774e != RequestCoordinator.RequestState.FAILED || !eVar.equals(this.f26773d))) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean n() {
        RequestCoordinator requestCoordinator = this.f26771b;
        if (requestCoordinator != null && !requestCoordinator.l(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean o() {
        RequestCoordinator requestCoordinator = this.f26771b;
        if (requestCoordinator != null && !requestCoordinator.f(this)) {
            return false;
        }
        return true;
    }

    @B("requestLock")
    private boolean p() {
        RequestCoordinator requestCoordinator = this.f26771b;
        if (requestCoordinator != null && !requestCoordinator.h(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void a(e eVar) {
        synchronized (this.f26770a) {
            try {
                if (!eVar.equals(this.f26773d)) {
                    this.f26774e = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator.RequestState requestState = this.f26775f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f26775f = requestState2;
                        this.f26773d.i();
                    }
                    return;
                }
                this.f26775f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f26771b;
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
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = this.f26774e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f26774e = RequestCoordinator.RequestState.PAUSED;
                    this.f26772c.b();
                }
                if (this.f26775f == requestState2) {
                    this.f26775f = RequestCoordinator.RequestState.PAUSED;
                    this.f26773d.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean c() {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                if (!this.f26772c.c() && !this.f26773d.c()) {
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
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f26774e = requestState;
                this.f26772c.clear();
                if (this.f26775f != requestState) {
                    this.f26775f = requestState;
                    this.f26773d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator d() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f26770a) {
            try {
                RequestCoordinator requestCoordinator2 = this.f26771b;
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
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        if (!this.f26772c.e(bVar.f26772c) || !this.f26773d.e(bVar.f26773d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(e eVar) {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                if (o() && m(eVar)) {
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
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = this.f26774e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                if (requestState == requestState2 && this.f26775f == requestState2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean h(e eVar) {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                if (p() && m(eVar)) {
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
    public void i() {
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = this.f26774e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f26774e = requestState2;
                    this.f26772c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = this.f26774e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2 && this.f26775f != requestState2) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(e eVar) {
        synchronized (this.f26770a) {
            try {
                if (eVar.equals(this.f26772c)) {
                    this.f26774e = RequestCoordinator.RequestState.SUCCESS;
                } else if (eVar.equals(this.f26773d)) {
                    this.f26775f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f26771b;
                if (requestCoordinator != null) {
                    requestCoordinator.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean k() {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                RequestCoordinator.RequestState requestState = this.f26774e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                if (requestState != requestState2 && this.f26775f != requestState2) {
                    z3 = false;
                }
                z3 = true;
            } finally {
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean l(e eVar) {
        boolean z3;
        synchronized (this.f26770a) {
            try {
                if (n() && m(eVar)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } finally {
            }
        }
        return z3;
    }

    public void q(e eVar, e eVar2) {
        this.f26772c = eVar;
        this.f26773d = eVar2;
    }
}

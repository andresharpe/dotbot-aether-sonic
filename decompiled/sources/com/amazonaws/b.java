package com.amazonaws;

import com.amazonaws.auth.InterfaceC1029g;

/* loaded from: classes.dex */
public abstract class b implements Cloneable {

    /* renamed from: E, reason: collision with root package name */
    private com.amazonaws.event.b f23531E;

    /* renamed from: F, reason: collision with root package name */
    private final RequestClientOptions f23532F = new RequestClientOptions();

    /* renamed from: G, reason: collision with root package name */
    @Deprecated
    private com.amazonaws.metrics.g f23533G;

    /* renamed from: H, reason: collision with root package name */
    private InterfaceC1029g f23534H;

    /* renamed from: I, reason: collision with root package name */
    private b f23535I;

    private void j(b bVar) {
        this.f23535I = bVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.j(this);
            return bVar;
        } catch (CloneNotSupportedException e4) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e4);
        }
    }

    protected final <T extends b> T b(T t3) {
        t3.k(this.f23531E);
        t3.n(this.f23533G);
        return t3;
    }

    public b d() {
        b bVar = this.f23535I;
        if (bVar != null) {
            while (bVar.e() != null) {
                bVar = bVar.e();
            }
        }
        return bVar;
    }

    public b e() {
        return this.f23535I;
    }

    public com.amazonaws.event.b f() {
        return this.f23531E;
    }

    public RequestClientOptions g() {
        return this.f23532F;
    }

    public InterfaceC1029g h() {
        return this.f23534H;
    }

    @Deprecated
    public com.amazonaws.metrics.g i() {
        return this.f23533G;
    }

    public void k(com.amazonaws.event.b bVar) {
        this.f23531E = bVar;
    }

    public void l(InterfaceC1029g interfaceC1029g) {
        this.f23534H = interfaceC1029g;
    }

    @Deprecated
    public void n(com.amazonaws.metrics.g gVar) {
        this.f23533G = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends b> T o(com.amazonaws.event.b bVar) {
        k(bVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public <T extends b> T p(com.amazonaws.metrics.g gVar) {
        n(gVar);
        return this;
    }
}

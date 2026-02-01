package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1771l<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Q f31181a = new Q();

    public C1771l() {
    }

    @androidx.annotation.N
    public AbstractC1770k<TResult> a() {
        return this.f31181a;
    }

    public void b(@androidx.annotation.N Exception exc) {
        this.f31181a.y(exc);
    }

    public void c(@androidx.annotation.P TResult tresult) {
        this.f31181a.z(tresult);
    }

    public boolean d(@androidx.annotation.N Exception exc) {
        return this.f31181a.B(exc);
    }

    public boolean e(@androidx.annotation.P TResult tresult) {
        return this.f31181a.C(tresult);
    }

    public C1771l(@androidx.annotation.N AbstractC1760a abstractC1760a) {
        abstractC1760a.b(new M(this));
    }
}

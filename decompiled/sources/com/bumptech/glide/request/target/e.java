package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public abstract class e<T> implements p<T> {

    /* renamed from: E, reason: collision with root package name */
    private final int f26840E;

    /* renamed from: F, reason: collision with root package name */
    private final int f26841F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private com.bumptech.glide.request.e f26842G;

    public e() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.manager.m
    public void a() {
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void c(@N o oVar) {
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void l(@P com.bumptech.glide.request.e eVar) {
        this.f26842G = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void m(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @P
    public final com.bumptech.glide.request.e q() {
        return this.f26842G;
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@N o oVar) {
        oVar.f(this.f26840E, this.f26841F);
    }

    public e(int i4, int i5) {
        if (com.bumptech.glide.util.n.w(i4, i5)) {
            this.f26840E = i4;
            this.f26841F = i5;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i4 + " and height: " + i5);
    }
}

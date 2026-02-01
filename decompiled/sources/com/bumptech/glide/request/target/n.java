package com.bumptech.glide.request.target;

import androidx.annotation.N;

@Deprecated
/* loaded from: classes.dex */
public abstract class n<Z> extends b<Z> {

    /* renamed from: F, reason: collision with root package name */
    private final int f26877F;

    /* renamed from: G, reason: collision with root package name */
    private final int f26878G;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.p
    public void c(@N o oVar) {
    }

    @Override // com.bumptech.glide.request.target.p
    public final void s(@N o oVar) {
        if (com.bumptech.glide.util.n.w(this.f26877F, this.f26878G)) {
            oVar.f(this.f26877F, this.f26878G);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f26877F + " and height: " + this.f26878G + ", either provide dimensions in the constructor or call override()");
    }

    public n(int i4, int i5) {
        this.f26877F = i4;
        this.f26878G = i5;
    }
}

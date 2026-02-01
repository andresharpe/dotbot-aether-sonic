package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.P;

@Deprecated
/* loaded from: classes.dex */
public abstract class b<Z> implements p<Z> {

    /* renamed from: E, reason: collision with root package name */
    private com.bumptech.glide.request.e f26839E;

    @Override // com.bumptech.glide.manager.m
    public void a() {
    }

    @Override // com.bumptech.glide.manager.m
    public void b() {
    }

    @Override // com.bumptech.glide.manager.m
    public void d() {
    }

    @Override // com.bumptech.glide.request.target.p
    public void l(@P com.bumptech.glide.request.e eVar) {
        this.f26839E = eVar;
    }

    @Override // com.bumptech.glide.request.target.p
    public void m(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void p(@P Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    @P
    public com.bumptech.glide.request.e q() {
        return this.f26839E;
    }

    @Override // com.bumptech.glide.request.target.p
    public void r(@P Drawable drawable) {
    }
}

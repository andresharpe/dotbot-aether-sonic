package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.N;
import androidx.annotation.W;

@W(18)
/* loaded from: classes2.dex */
class z implements A {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f32733a;

    z(@N ViewGroup viewGroup) {
        this.f32733a = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.D
    public void a(@N Drawable drawable) {
        this.f32733a.add(drawable);
    }

    @Override // com.google.android.material.internal.D
    public void b(@N Drawable drawable) {
        this.f32733a.remove(drawable);
    }

    @Override // com.google.android.material.internal.A
    public void c(@N View view) {
        this.f32733a.add(view);
    }

    @Override // com.google.android.material.internal.A
    public void d(@N View view) {
        this.f32733a.remove(view);
    }
}

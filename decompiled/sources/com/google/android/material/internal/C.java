package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.N;
import androidx.annotation.W;

@W(18)
/* loaded from: classes2.dex */
class C implements D {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f32501a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(@N View view) {
        this.f32501a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.D
    public void a(@N Drawable drawable) {
        this.f32501a.add(drawable);
    }

    @Override // com.google.android.material.internal.D
    public void b(@N Drawable drawable) {
        this.f32501a.remove(drawable);
    }
}

package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;
import androidx.annotation.P;

/* loaded from: classes.dex */
final class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f29104a;

    /* renamed from: b, reason: collision with root package name */
    int f29105b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(@P h hVar) {
        if (hVar != null) {
            this.f29104a = hVar.f29104a;
            this.f29105b = hVar.f29105b;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f29104a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new i(this);
    }
}

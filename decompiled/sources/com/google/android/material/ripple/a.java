package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.k;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class a extends Drawable implements s, k {

    /* renamed from: E, reason: collision with root package name */
    private b f33037E;

    @Override // android.graphics.drawable.Drawable
    @N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f33037E = new b(this.f33037E);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f33037E;
        if (bVar.f33039b) {
            bVar.f33038a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public Drawable.ConstantState getConstantState() {
        return this.f33037E;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f33037E.f33038a.getOpacity();
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return this.f33037E.f33038a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@N Rect rect) {
        super.onBoundsChange(rect);
        this.f33037E.f33038a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@N int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f33037E.f33038a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e4 = com.google.android.material.ripple.b.e(iArr);
        b bVar = this.f33037E;
        if (bVar.f33039b != e4) {
            bVar.f33039b = e4;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f33037E.f33038a.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f33037E.f33038a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        this.f33037E.f33038a.setShapeAppearanceModel(oVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(@InterfaceC0569l int i4) {
        this.f33037E.f33038a.setTint(i4);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@P ColorStateList colorStateList) {
        this.f33037E.f33038a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@P PorterDuff.Mode mode) {
        this.f33037E.f33038a.setTintMode(mode);
    }

    public a(o oVar) {
        this(new b(new j(oVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @N
        j f33038a;

        /* renamed from: b, reason: collision with root package name */
        boolean f33039b;

        public b(j jVar) {
            this.f33038a = jVar;
            this.f33039b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@N b bVar) {
            this.f33038a = (j) bVar.f33038a.getConstantState().newDrawable();
            this.f33039b = bVar.f33039b;
        }
    }

    private a(b bVar) {
        this.f33037E = bVar;
    }
}

package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.material.circularreveal.g;

/* loaded from: classes2.dex */
public class f extends RelativeLayout implements g {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final d f31911E;

    public f(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f31911E.a();
    }

    @Override // com.google.android.material.circularreveal.g
    public void b() {
        this.f31911E.b();
    }

    @Override // com.google.android.material.circularreveal.d.a
    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.d.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public void draw(@N Canvas canvas) {
        d dVar = this.f31911E;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f31911E.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f31911E.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public g.e getRevealInfo() {
        return this.f31911E.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f31911E;
        if (dVar != null) {
            return dVar.l();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@P Drawable drawable) {
        this.f31911E.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@InterfaceC0569l int i4) {
        this.f31911E.n(i4);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@P g.e eVar) {
        this.f31911E.o(eVar);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31911E = new d(this);
    }
}

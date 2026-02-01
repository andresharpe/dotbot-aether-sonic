package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.material.circularreveal.g;

/* loaded from: classes2.dex */
public class b extends FrameLayout implements g {

    /* renamed from: E, reason: collision with root package name */
    @N
    private final d f31893E;

    public b(@N Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.g
    public void a() {
        this.f31893E.a();
    }

    @Override // com.google.android.material.circularreveal.g
    public void b() {
        this.f31893E.b();
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
    @SuppressLint({"MissingSuperCall"})
    public void draw(@N Canvas canvas) {
        d dVar = this.f31893E;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f31893E.g();
    }

    @Override // com.google.android.material.circularreveal.g
    public int getCircularRevealScrimColor() {
        return this.f31893E.h();
    }

    @Override // com.google.android.material.circularreveal.g
    @P
    public g.e getRevealInfo() {
        return this.f31893E.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.g
    public boolean isOpaque() {
        d dVar = this.f31893E;
        if (dVar != null) {
            return dVar.l();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealOverlayDrawable(@P Drawable drawable) {
        this.f31893E.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setCircularRevealScrimColor(@InterfaceC0569l int i4) {
        this.f31893E.n(i4);
    }

    @Override // com.google.android.material.circularreveal.g
    public void setRevealInfo(@P g.e eVar) {
        this.f31893E.o(eVar);
    }

    public b(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31893E = new d(this);
    }
}

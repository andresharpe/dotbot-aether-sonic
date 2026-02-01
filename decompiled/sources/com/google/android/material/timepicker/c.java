package com.google.android.material.timepicker;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0823k0;
import com.google.android.material.shape.m;

/* loaded from: classes2.dex */
class c extends ConstraintLayout {

    /* renamed from: s0, reason: collision with root package name */
    private static final String f33918s0 = "skip";

    /* renamed from: p0, reason: collision with root package name */
    private final Runnable f33919p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f33920q0;

    /* renamed from: r0, reason: collision with root package name */
    private com.google.android.material.shape.j f33921r0;

    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.P();
        }
    }

    public c(@N Context context) {
        this(context, null);
    }

    private Drawable L() {
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        this.f33921r0 = jVar;
        jVar.l0(new m(0.5f));
        this.f33921r0.o0(ColorStateList.valueOf(-1));
        return this.f33921r0;
    }

    private static boolean O(View view) {
        return f33918s0.equals(view.getTag());
    }

    private void Q() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f33919p0);
            handler.post(this.f33919p0);
        }
    }

    @r
    public int M() {
        return this.f33920q0;
    }

    public void N(@r int i4) {
        this.f33920q0 = i4;
        P();
    }

    protected void P() {
        int childCount = getChildCount();
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (O(getChildAt(i5))) {
                i4++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.H(this);
        float f4 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() != a.h.f2684O0 && !O(childAt)) {
                dVar.M(childAt.getId(), a.h.f2684O0, this.f33920q0, f4);
                f4 += 360.0f / (childCount - i4);
            }
        }
        dVar.r(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            view.setId(C0823k0.D());
        }
        Q();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Q();
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC0569l int i4) {
        this.f33921r0.o0(ColorStateList.valueOf(i4));
    }

    public c(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater.from(context).inflate(a.k.f2980d0, this);
        C0823k0.I1(this, L());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.iq, i4, 0);
        this.f33920q0 = obtainStyledAttributes.getDimensionPixelSize(a.o.jq, 0);
        this.f33919p0 = new a();
        obtainStyledAttributes.recycle();
    }
}

package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class ProgressLayout extends ConstraintLayout {

    /* renamed from: p0, reason: collision with root package name */
    private View f45854p0;

    /* renamed from: q0, reason: collision with root package name */
    private ImageView f45855q0;

    /* renamed from: r0, reason: collision with root package name */
    private TickProgressView f45856r0;

    /* renamed from: s0, reason: collision with root package name */
    private TickView f45857s0;

    /* renamed from: t0, reason: collision with root package name */
    private View f45858t0;

    public ProgressLayout(@N Context context) {
        this(context, null);
    }

    private void O(Context context, AttributeSet attributeSet) {
        ImageView imageView;
        View inflate = LayoutInflater.from(context).inflate(j.i.f41373B2, this);
        this.f45854p0 = inflate;
        this.f45855q0 = (ImageView) inflate.findViewById(j.h.c7);
        this.f45856r0 = (TickProgressView) this.f45854p0.findViewById(j.h.Pg);
        this.f45857s0 = (TickView) this.f45854p0.findViewById(j.h.Qg);
        ImageView imageView2 = (ImageView) this.f45854p0.findViewById(j.h.u7);
        this.f45854p0 = imageView2;
        this.f45858t0 = imageView2;
        this.f45857s0.setVisibility(8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41958a0);
        Drawable drawable = obtainStyledAttributes.getDrawable(j.o.f41973f0);
        if (drawable != null && (imageView = this.f45855q0) != null) {
            imageView.setImageDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    protected int L(int i4) {
        return (int) TypedValue.applyDimension(1, i4, getResources().getDisplayMetrics());
    }

    public void M() {
        if (this.f45856r0 != null) {
            this.f45858t0.setVisibility(0);
            this.f45856r0.c();
        }
    }

    public void N() {
        TickProgressView tickProgressView = this.f45856r0;
        if (tickProgressView != null) {
            tickProgressView.setVisibility(0);
            this.f45856r0.d();
        }
        TickView tickView = this.f45857s0;
        if (tickView != null) {
            tickView.setVisibility(0);
            this.f45857s0.c();
        }
    }

    public void P() {
        TickProgressView tickProgressView = this.f45856r0;
        if (tickProgressView != null) {
            tickProgressView.setVisibility(0);
            this.f45856r0.e();
        }
        TickView tickView = this.f45857s0;
        if (tickView != null) {
            tickView.setVisibility(8);
        }
    }

    public void Q() {
        TickProgressView tickProgressView = this.f45856r0;
        if (tickProgressView != null) {
            tickProgressView.setVisibility(0);
            this.f45856r0.f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TickView tickView = this.f45857s0;
        if (tickView != null) {
            tickView.d();
        }
        TickProgressView tickProgressView = this.f45856r0;
        if (tickProgressView != null) {
            tickProgressView.f();
        }
    }

    public void setCenterImage(int i4) {
        ImageView imageView = this.f45855q0;
        if (imageView != null) {
            imageView.setImageResource(i4);
        }
    }

    public void setCenterView(Drawable drawable) {
        ImageView imageView;
        if (drawable != null && (imageView = this.f45855q0) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setProgress(int i4) {
        TickProgressView tickProgressView = this.f45856r0;
        if (tickProgressView != null) {
            tickProgressView.setVisibility(0);
            this.f45856r0.setProgress(i4);
        }
    }

    public ProgressLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        O(context, attributeSet);
    }
}

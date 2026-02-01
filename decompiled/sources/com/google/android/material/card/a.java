package com.google.android.material.card;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import com.google.firebase.remoteconfig.l;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class a extends CardView implements Checkable, s {

    /* renamed from: S, reason: collision with root package name */
    private static final int[] f31731S = {R.attr.state_checkable};

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f31732T = {R.attr.state_checked};

    /* renamed from: U, reason: collision with root package name */
    private static final int[] f31733U = {a.c.Ce};

    /* renamed from: V, reason: collision with root package name */
    private static final int f31734V = a.n.yh;

    /* renamed from: W, reason: collision with root package name */
    private static final String f31735W = "MaterialCardView";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f31736a0 = "androidx.cardview.widget.CardView";

    /* renamed from: b0, reason: collision with root package name */
    public static final int f31737b0 = 8388659;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f31738c0 = 8388691;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f31739d0 = 8388661;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f31740e0 = 8388693;

    /* renamed from: N, reason: collision with root package name */
    @N
    private final com.google.android.material.card.b f31741N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31742O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31743P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f31744Q;

    /* renamed from: R, reason: collision with root package name */
    private b f31745R;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.card.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public @interface InterfaceC0279a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(a aVar, boolean z3);
    }

    public a(Context context) {
        this(context, null);
    }

    @N
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f31741N.j().getBounds());
        return rectF;
    }

    private void j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f31741N.i();
        }
    }

    @Override // androidx.cardview.widget.CardView
    @N
    public ColorStateList getCardBackgroundColor() {
        return this.f31741N.k();
    }

    @N
    public ColorStateList getCardForegroundColor() {
        return this.f31741N.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    @P
    public Drawable getCheckedIcon() {
        return this.f31741N.m();
    }

    public int getCheckedIconGravity() {
        return this.f31741N.n();
    }

    @r
    public int getCheckedIconMargin() {
        return this.f31741N.o();
    }

    @r
    public int getCheckedIconSize() {
        return this.f31741N.p();
    }

    @P
    public ColorStateList getCheckedIconTint() {
        return this.f31741N.q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f31741N.A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f31741N.A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f31741N.A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f31741N.A().top;
    }

    @InterfaceC0580x(from = l.f37524n, to = 1.0d)
    public float getProgress() {
        return this.f31741N.u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f31741N.s();
    }

    public ColorStateList getRippleColor() {
        return this.f31741N.v();
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return this.f31741N.w();
    }

    @InterfaceC0569l
    @Deprecated
    public int getStrokeColor() {
        return this.f31741N.x();
    }

    @P
    public ColorStateList getStrokeColorStateList() {
        return this.f31741N.y();
    }

    @r
    public int getStrokeWidth() {
        return this.f31741N.z();
    }

    @Override // androidx.cardview.widget.CardView
    public void h(int i4, int i5, int i6, int i7) {
        this.f31741N.Y(i4, i5, i6, i7);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f31743P;
    }

    public boolean k() {
        com.google.android.material.card.b bVar = this.f31741N;
        if (bVar != null && bVar.D()) {
            return true;
        }
        return false;
    }

    public boolean l() {
        return this.f31744Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(int i4, int i5, int i6, int i7) {
        super.h(i4, i5, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f31741N.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 3);
        if (k()) {
            View.mergeDrawableStates(onCreateDrawableState, f31731S);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31732T);
        }
        if (l()) {
            View.mergeDrawableStates(onCreateDrawableState, f31733U);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f31736a0);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f31736a0);
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f31741N.H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f31742O) {
            if (!this.f31741N.C()) {
                Log.i(f31735W, "Setting a custom background is not supported.");
                this.f31741N.I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@InterfaceC0569l int i4) {
        this.f31741N.J(ColorStateList.valueOf(i4));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f4) {
        super.setCardElevation(f4);
        this.f31741N.d0();
    }

    public void setCardForegroundColor(@P ColorStateList colorStateList) {
        this.f31741N.K(colorStateList);
    }

    public void setCheckable(boolean z3) {
        this.f31741N.L(z3);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (this.f31743P != z3) {
            toggle();
        }
    }

    public void setCheckedIcon(@P Drawable drawable) {
        this.f31741N.N(drawable);
    }

    public void setCheckedIconGravity(int i4) {
        if (this.f31741N.n() != i4) {
            this.f31741N.O(i4);
        }
    }

    public void setCheckedIconMargin(@r int i4) {
        this.f31741N.P(i4);
    }

    public void setCheckedIconMarginResource(@InterfaceC0574q int i4) {
        if (i4 != -1) {
            this.f31741N.P(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCheckedIconResource(@InterfaceC0578v int i4) {
        this.f31741N.N(C2046a.b(getContext(), i4));
    }

    public void setCheckedIconSize(@r int i4) {
        this.f31741N.Q(i4);
    }

    public void setCheckedIconSizeResource(@InterfaceC0574q int i4) {
        if (i4 != 0) {
            this.f31741N.Q(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCheckedIconTint(@P ColorStateList colorStateList) {
        this.f31741N.R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z3) {
        super.setClickable(z3);
        com.google.android.material.card.b bVar = this.f31741N;
        if (bVar != null) {
            bVar.b0();
        }
    }

    public void setDragged(boolean z3) {
        if (this.f31744Q != z3) {
            this.f31744Q = z3;
            refreshDrawableState();
            j();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f4) {
        super.setMaxCardElevation(f4);
        this.f31741N.f0();
    }

    public void setOnCheckedChangeListener(@P b bVar) {
        this.f31745R = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z3) {
        super.setPreventCornerOverlap(z3);
        this.f31741N.f0();
        this.f31741N.c0();
    }

    public void setProgress(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f31741N.T(f4);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f4) {
        super.setRadius(f4);
        this.f31741N.S(f4);
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        this.f31741N.U(colorStateList);
    }

    public void setRippleColorResource(@InterfaceC0571n int i4) {
        this.f31741N.U(C2046a.a(getContext(), i4));
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        setClipToOutline(oVar.u(getBoundsAsRectF()));
        this.f31741N.V(oVar);
    }

    public void setStrokeColor(@InterfaceC0569l int i4) {
        setStrokeColor(ColorStateList.valueOf(i4));
    }

    public void setStrokeWidth(@r int i4) {
        this.f31741N.X(i4);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z3) {
        super.setUseCompatPadding(z3);
        this.f31741N.f0();
        this.f31741N.c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (k() && isEnabled()) {
            this.f31743P = !this.f31743P;
            refreshDrawableState();
            j();
            this.f31741N.M(this.f31743P);
            b bVar = this.f31745R;
            if (bVar != null) {
                bVar.a(this, this.f31743P);
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.eb);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@P ColorStateList colorStateList) {
        this.f31741N.J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f31741N.W(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.a.f31734V
            android.content.Context r8 = d1.C2044a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f31743P = r8
            r7.f31744Q = r8
            r0 = 1
            r7.f31742O = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = T0.a.o.Vl
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.b r0 = new com.google.android.material.card.b
            r0.<init>(r7, r9, r10, r6)
            r7.f31741N = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.Y(r9, r10, r1, r2)
            r0.G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

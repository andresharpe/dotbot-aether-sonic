package com.google.android.material.chip;

import T0.a;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.InterfaceC0565h;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.appcompat.widget.C0595h;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.animation.h;
import com.google.android.material.chip.a;
import com.google.android.material.internal.E;
import com.google.android.material.internal.j;
import com.google.android.material.internal.w;
import com.google.android.material.resources.f;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import java.util.List;

/* loaded from: classes2.dex */
public class Chip extends C0595h implements a.InterfaceC0280a, s, j<Chip> {

    /* renamed from: e0, reason: collision with root package name */
    private static final String f31777e0 = "Chip";

    /* renamed from: g0, reason: collision with root package name */
    private static final int f31779g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    private static final int f31780h0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    private static final String f31784l0 = "http://schemas.android.com/apk/res/android";

    /* renamed from: m0, reason: collision with root package name */
    private static final int f31785m0 = 48;

    /* renamed from: n0, reason: collision with root package name */
    private static final String f31786n0 = "android.widget.Button";

    /* renamed from: o0, reason: collision with root package name */
    private static final String f31787o0 = "android.widget.CompoundButton";

    /* renamed from: p0, reason: collision with root package name */
    private static final String f31788p0 = "android.widget.RadioButton";

    /* renamed from: q0, reason: collision with root package name */
    private static final String f31789q0 = "android.view.View";

    /* renamed from: I, reason: collision with root package name */
    @P
    private com.google.android.material.chip.a f31790I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private InsetDrawable f31791J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private RippleDrawable f31792K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private View.OnClickListener f31793L;

    /* renamed from: M, reason: collision with root package name */
    @P
    private CompoundButton.OnCheckedChangeListener f31794M;

    /* renamed from: N, reason: collision with root package name */
    @P
    private j.a<Chip> f31795N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f31796O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f31797P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f31798Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f31799R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f31800S;

    /* renamed from: T, reason: collision with root package name */
    private int f31801T;

    /* renamed from: U, reason: collision with root package name */
    @r(unit = 1)
    private int f31802U;

    /* renamed from: V, reason: collision with root package name */
    @P
    private CharSequence f31803V;

    /* renamed from: W, reason: collision with root package name */
    @N
    private final d f31804W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f31805a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Rect f31806b0;

    /* renamed from: c0, reason: collision with root package name */
    private final RectF f31807c0;

    /* renamed from: d0, reason: collision with root package name */
    private final f f31808d0;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f31778f0 = a.n.Bh;

    /* renamed from: i0, reason: collision with root package name */
    private static final Rect f31781i0 = new Rect();

    /* renamed from: j0, reason: collision with root package name */
    private static final int[] f31782j0 = {R.attr.state_selected};

    /* renamed from: k0, reason: collision with root package name */
    private static final int[] f31783k0 = {R.attr.state_checkable};

    /* loaded from: classes2.dex */
    class a extends f {
        a() {
        }

        @Override // com.google.android.material.resources.f
        public void a(int i4) {
        }

        @Override // com.google.android.material.resources.f
        public void b(@N Typeface typeface, boolean z3) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.f31790I.K3()) {
                text = Chip.this.f31790I.P1();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (Chip.this.f31795N != null) {
                Chip.this.f31795N.a(Chip.this, z3);
            }
            if (Chip.this.f31794M != null) {
                Chip.this.f31794M.onCheckedChanged(compoundButton, z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends ViewOutlineProvider {
        c() {
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, @N Outline outline) {
            if (Chip.this.f31790I != null) {
                Chip.this.f31790I.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class d extends androidx.customview.widget.a {
        d(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.a
        protected int C(float f4, float f5) {
            if (Chip.this.p() && Chip.this.getCloseIconTouchBounds().contains(f4, f5)) {
                return 1;
            }
            return 0;
        }

        @Override // androidx.customview.widget.a
        protected void D(@N List<Integer> list) {
            list.add(0);
            if (Chip.this.p() && Chip.this.z() && Chip.this.f31793L != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.a
        protected boolean N(int i4, int i5, Bundle bundle) {
            if (i5 == 16) {
                if (i4 == 0) {
                    return Chip.this.performClick();
                }
                if (i4 == 1) {
                    return Chip.this.A();
                }
                return false;
            }
            return false;
        }

        @Override // androidx.customview.widget.a
        protected void Q(@N M m4) {
            m4.X0(Chip.this.t());
            m4.a1(Chip.this.isClickable());
            m4.Z0(Chip.this.getAccessibilityClassName());
            m4.O1(Chip.this.getText());
        }

        @Override // androidx.customview.widget.a
        protected void R(int i4, @N M m4) {
            CharSequence charSequence = "";
            if (i4 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    m4.d1(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i5 = a.m.f3040B0;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    m4.d1(context.getString(i5, objArr).trim());
                }
                m4.U0(Chip.this.getCloseIconTouchBoundsInt());
                m4.b(M.a.f13375j);
                m4.j1(Chip.this.isEnabled());
                return;
            }
            m4.d1("");
            m4.U0(Chip.f31781i0);
        }

        @Override // androidx.customview.widget.a
        protected void S(int i4, boolean z3) {
            if (i4 == 1) {
                Chip.this.f31799R = z3;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void B() {
        if (this.f31791J != null) {
            this.f31791J = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            F();
        }
    }

    private void D(@P com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.k3(null);
        }
    }

    private void E() {
        if (p() && z() && this.f31793L != null) {
            C0823k0.B1(this, this.f31804W);
            this.f31805a0 = true;
        } else {
            C0823k0.B1(this, null);
            this.f31805a0 = false;
        }
    }

    private void F() {
        if (com.google.android.material.ripple.b.f33040a) {
            G();
            return;
        }
        this.f31790I.J3(true);
        C0823k0.I1(this, getBackgroundDrawable());
        H();
        o();
    }

    private void G() {
        this.f31792K = new RippleDrawable(com.google.android.material.ripple.b.d(this.f31790I.N1()), getBackgroundDrawable(), null);
        this.f31790I.J3(false);
        C0823k0.I1(this, this.f31792K);
        H();
    }

    private void H() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f31790I) != null) {
            int p12 = (int) (aVar.p1() + this.f31790I.R1() + this.f31790I.V0());
            int u12 = (int) (this.f31790I.u1() + this.f31790I.S1() + this.f31790I.R0());
            if (this.f31791J != null) {
                Rect rect = new Rect();
                this.f31791J.getPadding(rect);
                u12 += rect.left;
                p12 += rect.right;
            }
            C0823k0.d2(this, u12, getPaddingTop(), p12, getPaddingBottom());
        }
    }

    private void I() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        com.google.android.material.resources.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f31808d0);
        }
    }

    private void J(@P AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(f31784l0, "background") != null) {
            Log.w(f31777e0, "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue(f31784l0, "drawableLeft") == null) {
            if (attributeSet.getAttributeValue(f31784l0, "drawableStart") == null) {
                if (attributeSet.getAttributeValue(f31784l0, "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue(f31784l0, "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue(f31784l0, "singleLine", true) && attributeSet.getAttributeIntValue(f31784l0, "lines", 1) == 1 && attributeSet.getAttributeIntValue(f31784l0, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(f31784l0, "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue(f31784l0, "gravity", 8388627) != 8388627) {
                                Log.w(f31777e0, "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public RectF getCloseIconTouchBounds() {
        this.f31807c0.setEmpty();
        if (p() && this.f31793L != null) {
            this.f31790I.F1(this.f31807c0);
        }
        return this.f31807c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @N
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f31806b0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f31806b0;
    }

    @P
    private com.google.android.material.resources.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.Q1();
        }
        return null;
    }

    private void l(@N com.google.android.material.chip.a aVar) {
        aVar.k3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    @N
    private int[] m() {
        ?? isEnabled = isEnabled();
        int i4 = isEnabled;
        if (this.f31799R) {
            i4 = isEnabled + 1;
        }
        int i5 = i4;
        if (this.f31798Q) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (this.f31797P) {
            i6 = i5 + 1;
        }
        int i7 = i6;
        if (isChecked()) {
            i7 = i6 + 1;
        }
        int[] iArr = new int[i7];
        int i8 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i8 = 1;
        }
        if (this.f31799R) {
            iArr[i8] = 16842908;
            i8++;
        }
        if (this.f31798Q) {
            iArr[i8] = 16843623;
            i8++;
        }
        if (this.f31797P) {
            iArr[i8] = 16842919;
            i8++;
        }
        if (isChecked()) {
            iArr[i8] = 16842913;
        }
        return iArr;
    }

    private void o() {
        if (getBackgroundDrawable() == this.f31791J && this.f31790I.getCallback() == null) {
            this.f31790I.setCallback(this.f31791J);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.y1() != null) {
            return true;
        }
        return false;
    }

    private void q(Context context, @P AttributeSet attributeSet, int i4) {
        TypedArray j4 = w.j(context, attributeSet, a.o.w5, i4, f31778f0, new int[0]);
        this.f31800S = j4.getBoolean(a.o.d6, false);
        this.f31802U = (int) Math.ceil(j4.getDimension(a.o.R5, (float) Math.ceil(E.e(getContext(), 48))));
        j4.recycle();
    }

    private void r() {
        setOutlineProvider(new c());
    }

    private void s(int i4, int i5, int i6, int i7) {
        this.f31791J = new InsetDrawable((Drawable) this.f31790I, i4, i5, i6, i7);
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f31798Q != z3) {
            this.f31798Q = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f31797P != z3) {
            this.f31797P = z3;
            refreshDrawableState();
        }
    }

    @InterfaceC0566i
    public boolean A() {
        boolean z3 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f31793L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z3 = true;
        }
        if (this.f31805a0) {
            this.f31804W.Y(1, 1);
        }
        return z3;
    }

    public boolean C() {
        return this.f31800S;
    }

    @Override // com.google.android.material.chip.a.InterfaceC0280a
    public void a() {
        n(this.f31802U);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@N MotionEvent motionEvent) {
        if (!this.f31805a0) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f31804W.v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f31805a0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f31804W.w(keyEvent) && this.f31804W.B() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0595h, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.c2() && this.f31790I.f3(m())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @N
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f31803V)) {
            return this.f31803V;
        }
        if (t()) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).k()) {
                return f31788p0;
            }
            return f31787o0;
        }
        if (isClickable()) {
            return f31786n0;
        }
        return f31789q0;
    }

    @P
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f31791J;
        if (insetDrawable == null) {
            return this.f31790I;
        }
        return insetDrawable;
    }

    @P
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.l1();
        }
        return null;
    }

    @P
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.m1();
        }
        return null;
    }

    @P
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, aVar.o1());
    }

    public Drawable getChipDrawable() {
        return this.f31790I;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.p1();
        }
        return 0.0f;
    }

    @P
    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.q1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.r1();
        }
        return 0.0f;
    }

    @P
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.s1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.t1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.u1();
        }
        return 0.0f;
    }

    @P
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.v1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.w1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @P
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.y1();
        }
        return null;
    }

    @P
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.A1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    @P
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.E1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @P
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.I1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@N Rect rect) {
        if (this.f31805a0 && (this.f31804W.B() == 1 || this.f31804W.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @P
    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.J1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.K1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.L1();
        }
        return 0.0f;
    }

    @P
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.N1();
        }
        return null;
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return this.f31790I.getShapeAppearanceModel();
    }

    @P
    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.O1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.R1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            return aVar.S1();
        }
        return 0.0f;
    }

    public boolean n(@r int i4) {
        int i5;
        this.f31802U = i4;
        int i6 = 0;
        if (!C()) {
            if (this.f31791J != null) {
                B();
            } else {
                F();
            }
            return false;
        }
        int max = Math.max(0, i4 - this.f31790I.getIntrinsicHeight());
        int max2 = Math.max(0, i4 - this.f31790I.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f31791J != null) {
                B();
            } else {
                F();
            }
            return false;
        }
        if (max2 > 0) {
            i5 = max2 / 2;
        } else {
            i5 = 0;
        }
        if (max > 0) {
            i6 = max / 2;
        }
        if (this.f31791J != null) {
            Rect rect = new Rect();
            this.f31791J.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                F();
                return true;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        s(i5, i6, i5, i6);
        F();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f(this, this.f31790I);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31782j0);
        }
        if (t()) {
            View.mergeDrawableStates(onCreateDrawableState, f31783k0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (this.f31805a0) {
            this.f31804W.M(z3, i4, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@N MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(t());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            M c22 = M.c2(accessibilityNodeInfo);
            if (chipGroup.c()) {
                i4 = chipGroup.i(this);
            } else {
                i4 = -1;
            }
            c22.c1(M.d.h(chipGroup.b(this), 1, i4, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @P
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@N MotionEvent motionEvent, int i4) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f31801T != i4) {
            this.f31801T = i4;
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.N android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.f31797P
            if (r0 == 0) goto L41
            if (r1 != 0) goto L49
            r5.setCloseIconPressed(r3)
            goto L49
        L2b:
            boolean r0 = r5.f31797P
            if (r0 == 0) goto L34
            r5.A()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            if (r0 != 0) goto L49
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.setCloseIconPressed(r2)
            goto L49
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
            goto L49
        L48:
            r2 = r3
        L49:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@P CharSequence charSequence) {
        this.f31803V = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f31792K) {
            Log.w(f31777e0, "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w(f31777e0, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0595h, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f31792K) {
            Log.w(f31777e0, "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0595h, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w(f31777e0, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
        Log.w(f31777e0, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
        Log.w(f31777e0, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.l2(z3);
        }
    }

    public void setCheckableResource(@InterfaceC0565h int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.m2(i4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar == null) {
            this.f31796O = z3;
        } else if (aVar.W1()) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(@P Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.n2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@InterfaceC0565h int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(@InterfaceC0578v int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.q2(i4);
        }
    }

    public void setCheckedIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.r2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.s2(i4);
        }
    }

    public void setCheckedIconVisible(@InterfaceC0565h int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.t2(i4);
        }
    }

    public void setChipBackgroundColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.v2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.w2(i4);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.x2(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.y2(i4);
        }
    }

    public void setChipDrawable(@N com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f31790I;
        if (aVar2 != aVar) {
            D(aVar2);
            this.f31790I = aVar;
            aVar.v3(false);
            l(this.f31790I);
            n(this.f31802U);
        }
    }

    public void setChipEndPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.z2(f4);
        }
    }

    public void setChipEndPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.A2(i4);
        }
    }

    public void setChipIcon(@P Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.B2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(@InterfaceC0565h int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(@InterfaceC0578v int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.E2(i4);
        }
    }

    public void setChipIconSize(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.F2(f4);
        }
    }

    public void setChipIconSizeResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.G2(i4);
        }
    }

    public void setChipIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.H2(colorStateList);
        }
    }

    public void setChipIconTintResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.I2(i4);
        }
    }

    public void setChipIconVisible(@InterfaceC0565h int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.J2(i4);
        }
    }

    public void setChipMinHeight(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.L2(f4);
        }
    }

    public void setChipMinHeightResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.M2(i4);
        }
    }

    public void setChipStartPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.N2(f4);
        }
    }

    public void setChipStartPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.O2(i4);
        }
    }

    public void setChipStrokeColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.P2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.Q2(i4);
        }
    }

    public void setChipStrokeWidth(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.R2(f4);
        }
    }

    public void setChipStrokeWidthResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.S2(i4);
        }
    }

    @Deprecated
    public void setChipText(@P CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@c0 int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(@P Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.U2(drawable);
        }
        E();
    }

    public void setCloseIconContentDescription(@P CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.V2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@InterfaceC0565h int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.Y2(f4);
        }
    }

    public void setCloseIconEndPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.Z2(i4);
        }
    }

    public void setCloseIconResource(@InterfaceC0578v int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.a3(i4);
        }
        E();
    }

    public void setCloseIconSize(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.b3(f4);
        }
    }

    public void setCloseIconSizeResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.c3(i4);
        }
    }

    public void setCloseIconStartPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.d3(f4);
        }
    }

    public void setCloseIconStartPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.e3(i4);
        }
    }

    public void setCloseIconTint(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.g3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.h3(i4);
        }
    }

    public void setCloseIconVisible(@InterfaceC0565h int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    @Override // androidx.appcompat.widget.C0595h, android.widget.TextView
    public void setCompoundDrawables(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.C0595h, android.widget.TextView
    public void setCompoundDrawablesRelative(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.n0(f4);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f31790I == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f31790I;
            if (aVar != null) {
                aVar.l3(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f31800S = z3;
        n(this.f31802U);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w(f31777e0, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(@P h hVar) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.m3(hVar);
        }
    }

    public void setHideMotionSpecResource(@InterfaceC0559b int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.n3(i4);
        }
    }

    public void setIconEndPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.o3(f4);
        }
    }

    public void setIconEndPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.p3(i4);
        }
    }

    public void setIconStartPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.q3(f4);
        }
    }

    public void setIconStartPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.r3(i4);
        }
    }

    @Override // com.google.android.material.internal.j
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@P j.a<Chip> aVar) {
        this.f31795N = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f31790I == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 <= 1) {
            super.setLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 <= 1) {
            super.setMaxLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@U int i4) {
        super.setMaxWidth(i4);
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.s3(i4);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 <= 1) {
            super.setMinLines(i4);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@P CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f31794M = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f31793L = onClickListener;
        E();
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.t3(colorStateList);
        }
        if (!this.f31790I.U1()) {
            G();
        }
    }

    public void setRippleColorResource(@InterfaceC0571n int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.u3(i4);
            if (!this.f31790I.U1()) {
                G();
            }
        }
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        this.f31790I.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(@P h hVar) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.w3(hVar);
        }
    }

    public void setShowMotionSpecResource(@InterfaceC0559b int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.x3(i4);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (z3) {
            super.setSingleLine(z3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.K3()) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f31790I;
        if (aVar2 != null) {
            aVar2.y3(charSequence);
        }
    }

    public void setTextAppearance(@P com.google.android.material.resources.d dVar) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.z3(dVar);
        }
        I();
    }

    public void setTextAppearanceResource(@d0 int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.D3(f4);
        }
    }

    public void setTextEndPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.E3(i4);
        }
    }

    public void setTextStartPadding(float f4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.H3(f4);
        }
    }

    public void setTextStartPaddingResource(@InterfaceC0574q int i4) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.I3(i4);
        }
    }

    public boolean t() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.W1()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean u() {
        return v();
    }

    public boolean v() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.Y1()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean w() {
        return x();
    }

    public boolean x() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.a2()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean y() {
        return z();
    }

    public boolean z() {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null && aVar.d2()) {
            return true;
        }
        return false;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1928e2);
    }

    public void setCloseIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.j3(z3);
        }
        E();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f31778f0
            android.content.Context r7 = d1.C2044a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f31806b0 = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f31807c0 = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f31808d0 = r7
            android.content.Context r0 = r6.getContext()
            r6.J(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.a1(r0, r8, r9, r4)
            r6.q(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.C0823k0.R(r6)
            r7.n0(r1)
            int[] r2 = T0.a.o.w5
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r9 = T0.a.o.i6
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$d r8 = new com.google.android.material.chip.Chip$d
            r8.<init>(r6)
            r6.f31804W = r8
            r6.E()
            if (r9 != 0) goto L59
            r6.r()
        L59:
            boolean r8 = r6.f31796O
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.P1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.I1()
            r6.setEllipsize(r7)
            r6.I()
            com.google.android.material.chip.a r7 = r6.f31790I
            boolean r7 = r7.K3()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.H()
            boolean r7 = r6.C()
            if (r7 == 0) goto L92
            int r7 = r6.f31802U
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.C0823k0.Z(r6)
            r6.f31801T = r7
            com.google.android.material.chip.Chip$b r7 = new com.google.android.material.chip.Chip$b
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.u2(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.K2(z3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@P Drawable drawable, @P Drawable drawable2, @P Drawable drawable3, @P Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.A3(i4);
        }
        I();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        com.google.android.material.chip.a aVar = this.f31790I;
        if (aVar != null) {
            aVar.A3(i4);
        }
        I();
    }
}

package com.google.android.material.button;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.W;
import androidx.appcompat.widget.C0594g;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.core.widget.r;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.s;
import e.C2046a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends C0594g implements Checkable, s {

    /* renamed from: W, reason: collision with root package name */
    public static final int f31668W = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f31669a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f31670b0 = 3;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f31671c0 = 4;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f31672d0 = 16;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f31673e0 = 32;

    /* renamed from: f0, reason: collision with root package name */
    private static final String f31674f0 = "MaterialButton";

    /* renamed from: H, reason: collision with root package name */
    @N
    private final com.google.android.material.button.a f31676H;

    /* renamed from: I, reason: collision with root package name */
    @N
    private final LinkedHashSet<b> f31677I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private c f31678J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private PorterDuff.Mode f31679K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private ColorStateList f31680L;

    /* renamed from: M, reason: collision with root package name */
    @P
    private Drawable f31681M;

    /* renamed from: N, reason: collision with root package name */
    @U
    private int f31682N;

    /* renamed from: O, reason: collision with root package name */
    @U
    private int f31683O;

    /* renamed from: P, reason: collision with root package name */
    @U
    private int f31684P;

    /* renamed from: Q, reason: collision with root package name */
    @U
    private int f31685Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f31686R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f31687S;

    /* renamed from: T, reason: collision with root package name */
    private int f31688T;

    /* renamed from: U, reason: collision with root package name */
    private static final int[] f31666U = {R.attr.state_checkable};

    /* renamed from: V, reason: collision with root package name */
    private static final int[] f31667V = {R.attr.state_checked};

    /* renamed from: g0, reason: collision with root package name */
    private static final int f31675g0 = a.n.mh;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z3);
    }

    /* loaded from: classes2.dex */
    interface c {
        void a(MaterialButton materialButton, boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class d extends androidx.customview.view.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        boolean f31689G;

        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@N Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@N Parcel parcel) {
            boolean z3 = true;
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            this.f31689G = z3;
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f31689G ? 1 : 0);
        }

        public d(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(@N Context context) {
        this(context, null);
    }

    private boolean e() {
        int i4 = this.f31688T;
        if (i4 != 3 && i4 != 4) {
            return false;
        }
        return true;
    }

    private boolean f() {
        int i4 = this.f31688T;
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        return false;
    }

    private boolean g() {
        int i4 = this.f31688T;
        if (i4 != 16 && i4 != 32) {
            return false;
        }
        return true;
    }

    @N
    private String getA11yClassName() {
        Class cls;
        if (d()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & C.f13103d;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean h() {
        if (C0823k0.Z(this) == 1) {
            return true;
        }
        return false;
    }

    private boolean i() {
        com.google.android.material.button.a aVar = this.f31676H;
        if (aVar != null && !aVar.o()) {
            return true;
        }
        return false;
    }

    private void k() {
        if (f()) {
            r.w(this, this.f31681M, null, null, null);
        } else if (e()) {
            r.w(this, null, null, this.f31681M, null);
        } else if (g()) {
            r.w(this, null, this.f31681M, null, null);
        }
    }

    private void l(boolean z3) {
        Drawable drawable = this.f31681M;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.d.r(drawable).mutate();
            this.f31681M = mutate;
            androidx.core.graphics.drawable.d.o(mutate, this.f31680L);
            PorterDuff.Mode mode = this.f31679K;
            if (mode != null) {
                androidx.core.graphics.drawable.d.p(this.f31681M, mode);
            }
            int i4 = this.f31682N;
            if (i4 == 0) {
                i4 = this.f31681M.getIntrinsicWidth();
            }
            int i5 = this.f31682N;
            if (i5 == 0) {
                i5 = this.f31681M.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f31681M;
            int i6 = this.f31683O;
            int i7 = this.f31684P;
            drawable2.setBounds(i6, i7, i4 + i6, i5 + i7);
            this.f31681M.setVisible(true, z3);
        }
        if (z3) {
            k();
            return;
        }
        Drawable[] h4 = r.h(this);
        Drawable drawable3 = h4[0];
        Drawable drawable4 = h4[1];
        Drawable drawable5 = h4[2];
        if ((f() && drawable3 != this.f31681M) || ((e() && drawable5 != this.f31681M) || (g() && drawable4 != this.f31681M))) {
            k();
        }
    }

    private void m(int i4, int i5) {
        if (this.f31681M != null && getLayout() != null) {
            if (!f() && !e()) {
                if (g()) {
                    this.f31683O = 0;
                    if (this.f31688T == 16) {
                        this.f31684P = 0;
                        l(false);
                        return;
                    }
                    int i6 = this.f31682N;
                    if (i6 == 0) {
                        i6 = this.f31681M.getIntrinsicHeight();
                    }
                    int textHeight = (((((i5 - getTextHeight()) - getPaddingTop()) - i6) - this.f31685Q) - getPaddingBottom()) / 2;
                    if (this.f31684P != textHeight) {
                        this.f31684P = textHeight;
                        l(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f31684P = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i7 = this.f31688T;
            boolean z3 = true;
            if (i7 != 1 && i7 != 3 && ((i7 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i7 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i8 = this.f31682N;
                if (i8 == 0) {
                    i8 = this.f31681M.getIntrinsicWidth();
                }
                int textWidth = ((((i4 - getTextWidth()) - C0823k0.j0(this)) - i8) - this.f31685Q) - C0823k0.k0(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean h4 = h();
                if (this.f31688T != 4) {
                    z3 = false;
                }
                if (h4 != z3) {
                    textWidth = -textWidth;
                }
                if (this.f31683O != textWidth) {
                    this.f31683O = textWidth;
                    l(false);
                    return;
                }
                return;
            }
            this.f31683O = 0;
            l(false);
        }
    }

    public void a(@N b bVar) {
        this.f31677I.add(bVar);
    }

    public void c() {
        this.f31677I.clear();
    }

    public boolean d() {
        com.google.android.material.button.a aVar = this.f31676H;
        if (aVar != null && aVar.p()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    @P
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @P
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @U
    public int getCornerRadius() {
        if (i()) {
            return this.f31676H.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f31681M;
    }

    public int getIconGravity() {
        return this.f31688T;
    }

    @U
    public int getIconPadding() {
        return this.f31685Q;
    }

    @U
    public int getIconSize() {
        return this.f31682N;
    }

    public ColorStateList getIconTint() {
        return this.f31680L;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f31679K;
    }

    @androidx.annotation.r
    public int getInsetBottom() {
        return this.f31676H.c();
    }

    @androidx.annotation.r
    public int getInsetTop() {
        return this.f31676H.d();
    }

    @P
    public ColorStateList getRippleColor() {
        if (i()) {
            return this.f31676H.h();
        }
        return null;
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        if (i()) {
            return this.f31676H.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (i()) {
            return this.f31676H.j();
        }
        return null;
    }

    @U
    public int getStrokeWidth() {
        if (i()) {
            return this.f31676H.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0594g, androidx.core.view.InterfaceC0814h0
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (i()) {
            return this.f31676H.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0594g, androidx.core.view.InterfaceC0814h0
    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (i()) {
            return this.f31676H.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f31686R;
    }

    public void j(@N b bVar) {
        this.f31677I.remove(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            k.f(this, this.f31676H.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f31666U);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f31667V);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0594g, android.view.View
    public void onInitializeAccessibilityEvent(@N AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0594g, android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0594g, android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        setChecked(dVar.f31689G);
    }

    @Override // android.widget.TextView, android.view.View
    @N
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f31689G = this.f31686R;
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0594g, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f31681M != null) {
            if (this.f31681M.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@N Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC0569l int i4) {
        if (i()) {
            this.f31676H.r(i4);
        } else {
            super.setBackgroundColor(i4);
        }
    }

    @Override // androidx.appcompat.widget.C0594g, android.view.View
    public void setBackgroundDrawable(@N Drawable drawable) {
        if (i()) {
            if (drawable != getBackground()) {
                Log.w(f31674f0, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f31676H.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0594g, android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C2046a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@P ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@P PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (i()) {
            this.f31676H.t(z3);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (d() && isEnabled() && this.f31686R != z3) {
            this.f31686R = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).p(this, this.f31686R);
            }
            if (this.f31687S) {
                return;
            }
            this.f31687S = true;
            Iterator<b> it = this.f31677I.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f31686R);
            }
            this.f31687S = false;
        }
    }

    public void setCornerRadius(@U int i4) {
        if (i()) {
            this.f31676H.u(i4);
        }
    }

    public void setCornerRadiusResource(@InterfaceC0574q int i4) {
        if (i()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // android.view.View
    @W(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        if (i()) {
            this.f31676H.f().n0(f4);
        }
    }

    public void setIcon(@P Drawable drawable) {
        if (this.f31681M != drawable) {
            this.f31681M = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f31688T != i4) {
            this.f31688T = i4;
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@U int i4) {
        if (this.f31685Q != i4) {
            this.f31685Q = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(@InterfaceC0578v int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C2046a.b(getContext(), i4);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(@U int i4) {
        if (i4 >= 0) {
            if (this.f31682N != i4) {
                this.f31682N = i4;
                l(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@P ColorStateList colorStateList) {
        if (this.f31680L != colorStateList) {
            this.f31680L = colorStateList;
            l(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f31679K != mode) {
            this.f31679K = mode;
            l(false);
        }
    }

    public void setIconTintResource(@InterfaceC0571n int i4) {
        setIconTint(C2046a.a(getContext(), i4));
    }

    public void setInsetBottom(@androidx.annotation.r int i4) {
        this.f31676H.v(i4);
    }

    public void setInsetTop(@androidx.annotation.r int i4) {
        this.f31676H.w(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(@P c cVar) {
        this.f31678J = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        c cVar = this.f31678J;
        if (cVar != null) {
            cVar.a(this, z3);
        }
        super.setPressed(z3);
    }

    public void setRippleColor(@P ColorStateList colorStateList) {
        if (i()) {
            this.f31676H.x(colorStateList);
        }
    }

    public void setRippleColorResource(@InterfaceC0571n int i4) {
        if (i()) {
            setRippleColor(C2046a.a(getContext(), i4));
        }
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        if (i()) {
            this.f31676H.y(oVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (i()) {
            this.f31676H.z(z3);
        }
    }

    public void setStrokeColor(@P ColorStateList colorStateList) {
        if (i()) {
            this.f31676H.A(colorStateList);
        }
    }

    public void setStrokeColorResource(@InterfaceC0571n int i4) {
        if (i()) {
            setStrokeColor(C2046a.a(getContext(), i4));
        }
    }

    public void setStrokeWidth(@U int i4) {
        if (i()) {
            this.f31676H.B(i4);
        }
    }

    public void setStrokeWidthResource(@InterfaceC0574q int i4) {
        if (i()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // androidx.appcompat.widget.C0594g, androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@P ColorStateList colorStateList) {
        if (i()) {
            this.f31676H.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0594g, androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@P PorterDuff.Mode mode) {
        if (i()) {
            this.f31676H.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @W(17)
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f31686R);
    }

    public MaterialButton(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Ka);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.N android.content.Context r9, @androidx.annotation.P android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f31675g0
            android.content.Context r9 = d1.C2044a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f31677I = r9
            r9 = 0
            r8.f31686R = r9
            r8.f31687S = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = T0.a.o.Zk
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r1 = T0.a.o.ml
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f31685Q = r1
            int r1 = T0.a.o.pl
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.E.l(r1, r2)
            r8.f31679K = r1
            android.content.Context r1 = r8.getContext()
            int r2 = T0.a.o.ol
            android.content.res.ColorStateList r1 = com.google.android.material.resources.c.a(r1, r0, r2)
            r8.f31680L = r1
            android.content.Context r1 = r8.getContext()
            int r2 = T0.a.o.kl
            android.graphics.drawable.Drawable r1 = com.google.android.material.resources.c.e(r1, r0, r2)
            r8.f31681M = r1
            int r1 = T0.a.o.ll
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f31688T = r1
            int r1 = T0.a.o.nl
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f31682N = r1
            com.google.android.material.shape.o$b r10 = com.google.android.material.shape.o.e(r7, r10, r11, r6)
            com.google.android.material.shape.o r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f31676H = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.f31685Q
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f31681M
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.l(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

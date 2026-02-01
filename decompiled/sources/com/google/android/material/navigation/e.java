package com.google.android.material.navigation;

import T0.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.g0;
import androidx.core.view.C0823k0;
import com.google.android.material.internal.w;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import d1.C2044a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class e extends FrameLayout {

    /* renamed from: L, reason: collision with root package name */
    public static final int f32815L = -1;

    /* renamed from: M, reason: collision with root package name */
    public static final int f32816M = 0;

    /* renamed from: N, reason: collision with root package name */
    public static final int f32817N = 1;

    /* renamed from: O, reason: collision with root package name */
    public static final int f32818O = 2;

    /* renamed from: P, reason: collision with root package name */
    private static final int f32819P = 1;

    /* renamed from: E, reason: collision with root package name */
    @N
    private final com.google.android.material.navigation.b f32820E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final com.google.android.material.navigation.c f32821F;

    /* renamed from: G, reason: collision with root package name */
    @N
    private final com.google.android.material.navigation.d f32822G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private ColorStateList f32823H;

    /* renamed from: I, reason: collision with root package name */
    private MenuInflater f32824I;

    /* renamed from: J, reason: collision with root package name */
    private d f32825J;

    /* renamed from: K, reason: collision with root package name */
    private c f32826K;

    /* loaded from: classes2.dex */
    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, @N MenuItem menuItem) {
            if (e.this.f32826K != null && menuItem.getItemId() == e.this.getSelectedItemId()) {
                e.this.f32826K.a(menuItem);
                return true;
            }
            if (e.this.f32825J != null && !e.this.f32825J.a(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(@N MenuItem menuItem);
    }

    /* loaded from: classes2.dex */
    public interface d {
        boolean a(@N MenuItem menuItem);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.navigation.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0292e extends androidx.customview.view.a {
        public static final Parcelable.Creator<C0292e> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        @P
        Bundle f32828G;

        /* renamed from: com.google.android.material.navigation.e$e$a */
        /* loaded from: classes2.dex */
        class a implements Parcelable.ClassLoaderCreator<C0292e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @P
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0292e createFromParcel(@N Parcel parcel) {
                return new C0292e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0292e createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new C0292e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0292e[] newArray(int i4) {
                return new C0292e[i4];
            }
        }

        public C0292e(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@N Parcel parcel, ClassLoader classLoader) {
            this.f32828G = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeBundle(this.f32828G);
        }

        public C0292e(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public e(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        super(C2044a.c(context, attributeSet, i4, i5), attributeSet, i4);
        com.google.android.material.navigation.d dVar = new com.google.android.material.navigation.d();
        this.f32822G = dVar;
        Context context2 = getContext();
        g0 k4 = w.k(context2, attributeSet, a.o.uo, i4, i5, a.o.Fo, a.o.Eo);
        com.google.android.material.navigation.b bVar = new com.google.android.material.navigation.b(context2, getClass(), getMaxItemCount());
        this.f32820E = bVar;
        com.google.android.material.navigation.c d4 = d(context2);
        this.f32821F = d4;
        dVar.c(d4);
        dVar.a(1);
        d4.setPresenter(dVar);
        bVar.b(dVar);
        dVar.i(getContext(), bVar);
        if (k4.C(a.o.Ao)) {
            d4.setIconTintList(k4.d(a.o.Ao));
        } else {
            d4.setIconTintList(d4.d(R.attr.textColorSecondary));
        }
        setItemIconSize(k4.g(a.o.zo, getResources().getDimensionPixelSize(a.f.o8)));
        if (k4.C(a.o.Fo)) {
            setItemTextAppearanceInactive(k4.u(a.o.Fo, 0));
        }
        if (k4.C(a.o.Eo)) {
            setItemTextAppearanceActive(k4.u(a.o.Eo, 0));
        }
        if (k4.C(a.o.Go)) {
            setItemTextColor(k4.d(a.o.Go));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0823k0.I1(this, c(context2));
        }
        if (k4.C(a.o.Co)) {
            setItemPaddingTop(k4.g(a.o.Co, 0));
        }
        if (k4.C(a.o.Bo)) {
            setItemPaddingBottom(k4.g(a.o.Bo, 0));
        }
        if (k4.C(a.o.wo)) {
            setElevation(k4.g(a.o.wo, 0));
        }
        androidx.core.graphics.drawable.d.o(getBackground().mutate(), com.google.android.material.resources.c.b(context2, k4, a.o.vo));
        setLabelVisibilityMode(k4.p(a.o.Ho, -1));
        int u3 = k4.u(a.o.yo, 0);
        if (u3 != 0) {
            d4.setItemBackgroundRes(u3);
        } else {
            setItemRippleColor(com.google.android.material.resources.c.b(context2, k4, a.o.Do));
        }
        int u4 = k4.u(a.o.xo, 0);
        if (u4 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(u4, a.o.oo);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(a.o.qo, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(a.o.po, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(a.o.so, 0));
            setItemActiveIndicatorColor(com.google.android.material.resources.c.a(context2, obtainStyledAttributes, a.o.ro));
            setItemActiveIndicatorShapeAppearance(o.b(context2, obtainStyledAttributes.getResourceId(a.o.to, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        if (k4.C(a.o.Io)) {
            g(k4.u(a.o.Io, 0));
        }
        k4.I();
        addView(d4);
        bVar.X(new a());
    }

    @N
    private j c(Context context) {
        j jVar = new j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.o0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.Z(context);
        return jVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f32824I == null) {
            this.f32824I = new androidx.appcompat.view.g(getContext());
        }
        return this.f32824I;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract com.google.android.material.navigation.c d(@N Context context);

    @P
    public com.google.android.material.badge.a e(int i4) {
        return this.f32821F.i(i4);
    }

    @N
    public com.google.android.material.badge.a f(int i4) {
        return this.f32821F.j(i4);
    }

    public void g(int i4) {
        this.f32822G.k(true);
        getMenuInflater().inflate(i4, this.f32820E);
        this.f32822G.k(false);
        this.f32822G.d(true);
    }

    @P
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f32821F.getItemActiveIndicatorColor();
    }

    @U
    public int getItemActiveIndicatorHeight() {
        return this.f32821F.getItemActiveIndicatorHeight();
    }

    @U
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f32821F.getItemActiveIndicatorMarginHorizontal();
    }

    @P
    public o getItemActiveIndicatorShapeAppearance() {
        return this.f32821F.getItemActiveIndicatorShapeAppearance();
    }

    @U
    public int getItemActiveIndicatorWidth() {
        return this.f32821F.getItemActiveIndicatorWidth();
    }

    @P
    public Drawable getItemBackground() {
        return this.f32821F.getItemBackground();
    }

    @InterfaceC0578v
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f32821F.getItemBackgroundRes();
    }

    @r
    public int getItemIconSize() {
        return this.f32821F.getItemIconSize();
    }

    @P
    public ColorStateList getItemIconTintList() {
        return this.f32821F.getIconTintList();
    }

    @U
    public int getItemPaddingBottom() {
        return this.f32821F.getItemPaddingBottom();
    }

    @U
    public int getItemPaddingTop() {
        return this.f32821F.getItemPaddingTop();
    }

    @P
    public ColorStateList getItemRippleColor() {
        return this.f32823H;
    }

    @d0
    public int getItemTextAppearanceActive() {
        return this.f32821F.getItemTextAppearanceActive();
    }

    @d0
    public int getItemTextAppearanceInactive() {
        return this.f32821F.getItemTextAppearanceInactive();
    }

    @P
    public ColorStateList getItemTextColor() {
        return this.f32821F.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f32821F.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @N
    public Menu getMenu() {
        return this.f32820E;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.appcompat.view.menu.o getMenuView() {
        return this.f32821F;
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.navigation.d getPresenter() {
        return this.f32822G;
    }

    @D
    public int getSelectedItemId() {
        return this.f32821F.getSelectedItemId();
    }

    public boolean h() {
        return this.f32821F.getItemActiveIndicatorEnabled();
    }

    public void i(int i4) {
        this.f32821F.n(i4);
    }

    public void j(int i4, @P View.OnTouchListener onTouchListener) {
        this.f32821F.q(i4, onTouchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@P Parcelable parcelable) {
        if (!(parcelable instanceof C0292e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0292e c0292e = (C0292e) parcelable;
        super.onRestoreInstanceState(c0292e.a());
        this.f32820E.U(c0292e.f32828G);
    }

    @Override // android.view.View
    @N
    protected Parcelable onSaveInstanceState() {
        C0292e c0292e = new C0292e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c0292e.f32828G = bundle;
        this.f32820E.W(bundle);
        return c0292e;
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    public void setItemActiveIndicatorColor(@P ColorStateList colorStateList) {
        this.f32821F.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.f32821F.setItemActiveIndicatorEnabled(z3);
    }

    public void setItemActiveIndicatorHeight(@U int i4) {
        this.f32821F.setItemActiveIndicatorHeight(i4);
    }

    public void setItemActiveIndicatorMarginHorizontal(@U int i4) {
        this.f32821F.setItemActiveIndicatorMarginHorizontal(i4);
    }

    public void setItemActiveIndicatorShapeAppearance(@P o oVar) {
        this.f32821F.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(@U int i4) {
        this.f32821F.setItemActiveIndicatorWidth(i4);
    }

    public void setItemBackground(@P Drawable drawable) {
        this.f32821F.setItemBackground(drawable);
        this.f32823H = null;
    }

    public void setItemBackgroundResource(@InterfaceC0578v int i4) {
        this.f32821F.setItemBackgroundRes(i4);
        this.f32823H = null;
    }

    public void setItemIconSize(@r int i4) {
        this.f32821F.setItemIconSize(i4);
    }

    public void setItemIconSizeRes(@InterfaceC0574q int i4) {
        setItemIconSize(getResources().getDimensionPixelSize(i4));
    }

    public void setItemIconTintList(@P ColorStateList colorStateList) {
        this.f32821F.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@U int i4) {
        this.f32821F.setItemPaddingBottom(i4);
    }

    public void setItemPaddingTop(@U int i4) {
        this.f32821F.setItemPaddingTop(i4);
    }

    public void setItemRippleColor(@P ColorStateList colorStateList) {
        if (this.f32823H == colorStateList) {
            if (colorStateList == null && this.f32821F.getItemBackground() != null) {
                this.f32821F.setItemBackground(null);
                return;
            }
            return;
        }
        this.f32823H = colorStateList;
        if (colorStateList == null) {
            this.f32821F.setItemBackground(null);
        } else {
            this.f32821F.setItemBackground(new RippleDrawable(com.google.android.material.ripple.b.a(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(@d0 int i4) {
        this.f32821F.setItemTextAppearanceActive(i4);
    }

    public void setItemTextAppearanceInactive(@d0 int i4) {
        this.f32821F.setItemTextAppearanceInactive(i4);
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        this.f32821F.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.f32821F.getLabelVisibilityMode() != i4) {
            this.f32821F.setLabelVisibilityMode(i4);
            this.f32822G.d(false);
        }
    }

    public void setOnItemReselectedListener(@P c cVar) {
        this.f32826K = cVar;
    }

    public void setOnItemSelectedListener(@P d dVar) {
        this.f32825J = dVar;
    }

    public void setSelectedItemId(@D int i4) {
        MenuItem findItem = this.f32820E.findItem(i4);
        if (findItem != null && !this.f32820E.P(findItem, this.f32822G, 0)) {
            findItem.setChecked(true);
        }
    }
}

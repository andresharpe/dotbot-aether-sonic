package com.google.android.material.navigation;

import T0.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.core.util.t;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import androidx.transition.C0969c;
import androidx.transition.O;
import c1.C1007a;
import com.google.android.material.internal.u;
import d.C2042a;
import e.C2046a;
import java.util.HashSet;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public abstract class c extends ViewGroup implements o {

    /* renamed from: j0, reason: collision with root package name */
    private static final int f32776j0 = 5;

    /* renamed from: k0, reason: collision with root package name */
    private static final int f32777k0 = -1;

    /* renamed from: l0, reason: collision with root package name */
    private static final int[] f32778l0 = {R.attr.state_checked};

    /* renamed from: m0, reason: collision with root package name */
    private static final int[] f32779m0 = {-16842910};

    /* renamed from: E, reason: collision with root package name */
    @P
    private final O f32780E;

    /* renamed from: F, reason: collision with root package name */
    @N
    private final View.OnClickListener f32781F;

    /* renamed from: G, reason: collision with root package name */
    private final t.a<com.google.android.material.navigation.a> f32782G;

    /* renamed from: H, reason: collision with root package name */
    @N
    private final SparseArray<View.OnTouchListener> f32783H;

    /* renamed from: I, reason: collision with root package name */
    private int f32784I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private com.google.android.material.navigation.a[] f32785J;

    /* renamed from: K, reason: collision with root package name */
    private int f32786K;

    /* renamed from: L, reason: collision with root package name */
    private int f32787L;

    /* renamed from: M, reason: collision with root package name */
    @P
    private ColorStateList f32788M;

    /* renamed from: N, reason: collision with root package name */
    @r
    private int f32789N;

    /* renamed from: O, reason: collision with root package name */
    private ColorStateList f32790O;

    /* renamed from: P, reason: collision with root package name */
    @P
    private final ColorStateList f32791P;

    /* renamed from: Q, reason: collision with root package name */
    @d0
    private int f32792Q;

    /* renamed from: R, reason: collision with root package name */
    @d0
    private int f32793R;

    /* renamed from: S, reason: collision with root package name */
    private Drawable f32794S;

    /* renamed from: T, reason: collision with root package name */
    private int f32795T;

    /* renamed from: U, reason: collision with root package name */
    @N
    private final SparseArray<com.google.android.material.badge.a> f32796U;

    /* renamed from: V, reason: collision with root package name */
    private int f32797V;

    /* renamed from: W, reason: collision with root package name */
    private int f32798W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f32799a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f32800b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f32801c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f32802d0;

    /* renamed from: e0, reason: collision with root package name */
    private com.google.android.material.shape.o f32803e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f32804f0;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f32805g0;

    /* renamed from: h0, reason: collision with root package name */
    private d f32806h0;

    /* renamed from: i0, reason: collision with root package name */
    private g f32807i0;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j itemData = ((com.google.android.material.navigation.a) view).getItemData();
            if (!c.this.f32807i0.P(itemData, c.this.f32806h0, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public c(@N Context context) {
        super(context);
        this.f32782G = new t.c(5);
        this.f32783H = new SparseArray<>(5);
        this.f32786K = 0;
        this.f32787L = 0;
        this.f32796U = new SparseArray<>(5);
        this.f32797V = -1;
        this.f32798W = -1;
        this.f32804f0 = false;
        this.f32791P = d(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f32780E = null;
        } else {
            C0969c c0969c = new C0969c();
            this.f32780E = c0969c;
            c0969c.W0(0);
            c0969c.v0(C1007a.d(getContext(), a.c.Mb, getResources().getInteger(a.i.f2859F)));
            c0969c.x0(C1007a.e(getContext(), a.c.Wb, com.google.android.material.animation.a.f31208b));
            c0969c.J0(new u());
        }
        this.f32781F = new a();
        C0823k0.R1(this, 1);
    }

    @P
    private Drawable f() {
        if (this.f32803e0 != null && this.f32805g0 != null) {
            com.google.android.material.shape.j jVar = new com.google.android.material.shape.j(this.f32803e0);
            jVar.o0(this.f32805g0);
            return jVar;
        }
        return null;
    }

    private com.google.android.material.navigation.a getNewItem() {
        com.google.android.material.navigation.a b4 = this.f32782G.b();
        if (b4 == null) {
            return g(getContext());
        }
        return b4;
    }

    private boolean m(int i4) {
        return i4 != -1;
    }

    private void o() {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < this.f32807i0.size(); i4++) {
            hashSet.add(Integer.valueOf(this.f32807i0.getItem(i4).getItemId()));
        }
        for (int i5 = 0; i5 < this.f32796U.size(); i5++) {
            int keyAt = this.f32796U.keyAt(i5);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f32796U.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(@N com.google.android.material.navigation.a aVar) {
        com.google.android.material.badge.a aVar2;
        int id = aVar.getId();
        if (m(id) && (aVar2 = this.f32796U.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    private void t(int i4) {
        if (m(i4)) {
            return;
        }
        throw new IllegalArgumentException(i4 + " is not a valid view id");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c() {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f32782G.a(aVar);
                    aVar.j();
                }
            }
        }
        if (this.f32807i0.size() == 0) {
            this.f32786K = 0;
            this.f32787L = 0;
            this.f32785J = null;
            return;
        }
        o();
        this.f32785J = new com.google.android.material.navigation.a[this.f32807i0.size()];
        boolean l4 = l(this.f32784I, this.f32807i0.H().size());
        for (int i4 = 0; i4 < this.f32807i0.size(); i4++) {
            this.f32806h0.k(true);
            this.f32807i0.getItem(i4).setCheckable(true);
            this.f32806h0.k(false);
            com.google.android.material.navigation.a newItem = getNewItem();
            this.f32785J[i4] = newItem;
            newItem.setIconTintList(this.f32788M);
            newItem.setIconSize(this.f32789N);
            newItem.setTextColor(this.f32791P);
            newItem.setTextAppearanceInactive(this.f32792Q);
            newItem.setTextAppearanceActive(this.f32793R);
            newItem.setTextColor(this.f32790O);
            int i5 = this.f32797V;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.f32798W;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            newItem.setActiveIndicatorWidth(this.f32800b0);
            newItem.setActiveIndicatorHeight(this.f32801c0);
            newItem.setActiveIndicatorMarginHorizontal(this.f32802d0);
            newItem.setActiveIndicatorDrawable(f());
            newItem.setActiveIndicatorResizeable(this.f32804f0);
            newItem.setActiveIndicatorEnabled(this.f32799a0);
            Drawable drawable = this.f32794S;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f32795T);
            }
            newItem.setShifting(l4);
            newItem.setLabelVisibilityMode(this.f32784I);
            j jVar = (j) this.f32807i0.getItem(i4);
            newItem.h(jVar, 0);
            newItem.setItemPosition(i4);
            int itemId = jVar.getItemId();
            newItem.setOnTouchListener(this.f32783H.get(itemId));
            newItem.setOnClickListener(this.f32781F);
            int i7 = this.f32786K;
            if (i7 != 0 && itemId == i7) {
                this.f32787L = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f32807i0.size() - 1, this.f32787L);
        this.f32787L = min;
        this.f32807i0.getItem(min).setChecked(true);
    }

    @P
    public ColorStateList d(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList a4 = C2046a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C2042a.b.f49128J0, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = a4.getDefaultColor();
        int[] iArr = f32779m0;
        return new ColorStateList(new int[][]{iArr, f32778l0, ViewGroup.EMPTY_STATE_SET}, new int[]{a4.getColorForState(iArr, defaultColor), i5, defaultColor});
    }

    @Override // androidx.appcompat.view.menu.o
    public void e(@N g gVar) {
        this.f32807i0 = gVar;
    }

    @N
    protected abstract com.google.android.material.navigation.a g(@N Context context);

    /* JADX INFO: Access modifiers changed from: package-private */
    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f32796U;
    }

    @P
    public ColorStateList getIconTintList() {
        return this.f32788M;
    }

    @P
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f32805g0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f32799a0;
    }

    @U
    public int getItemActiveIndicatorHeight() {
        return this.f32801c0;
    }

    @U
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f32802d0;
    }

    @P
    public com.google.android.material.shape.o getItemActiveIndicatorShapeAppearance() {
        return this.f32803e0;
    }

    @U
    public int getItemActiveIndicatorWidth() {
        return this.f32800b0;
    }

    @P
    public Drawable getItemBackground() {
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null && aVarArr.length > 0) {
            return aVarArr[0].getBackground();
        }
        return this.f32794S;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f32795T;
    }

    @r
    public int getItemIconSize() {
        return this.f32789N;
    }

    @U
    public int getItemPaddingBottom() {
        return this.f32798W;
    }

    @U
    public int getItemPaddingTop() {
        return this.f32797V;
    }

    @d0
    public int getItemTextAppearanceActive() {
        return this.f32793R;
    }

    @d0
    public int getItemTextAppearanceInactive() {
        return this.f32792Q;
    }

    @P
    public ColorStateList getItemTextColor() {
        return this.f32790O;
    }

    public int getLabelVisibilityMode() {
        return this.f32784I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @P
    public g getMenu() {
        return this.f32807i0;
    }

    public int getSelectedItemId() {
        return this.f32786K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getSelectedItemPosition() {
        return this.f32787L;
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return 0;
    }

    @P
    public com.google.android.material.navigation.a h(int i4) {
        t(i4);
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.getId() == i4) {
                    return aVar;
                }
            }
            return null;
        }
        return null;
    }

    @P
    public com.google.android.material.badge.a i(int i4) {
        return this.f32796U.get(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.badge.a j(int i4) {
        t(i4);
        com.google.android.material.badge.a aVar = this.f32796U.get(i4);
        if (aVar == null) {
            aVar = com.google.android.material.badge.a.d(getContext());
            this.f32796U.put(i4, aVar);
        }
        com.google.android.material.navigation.a h4 = h(i4);
        if (h4 != null) {
            h4.setBadge(aVar);
        }
        return aVar;
    }

    protected boolean k() {
        return this.f32804f0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(int i4, int i5) {
        if (i4 == -1) {
            if (i5 <= 3) {
                return false;
            }
        } else if (i4 != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i4) {
        t(i4);
        com.google.android.material.badge.a aVar = this.f32796U.get(i4);
        com.google.android.material.navigation.a h4 = h(i4);
        if (h4 != null) {
            h4.p();
        }
        if (aVar != null) {
            this.f32796U.remove(i4);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        M.c2(accessibilityNodeInfo).b1(M.c.f(1, this.f32807i0.H().size(), false, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(SparseArray<com.google.android.material.badge.a> sparseArray) {
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            int keyAt = sparseArray.keyAt(i4);
            if (this.f32796U.indexOfKey(keyAt) < 0) {
                this.f32796U.append(keyAt, sparseArray.get(keyAt));
            }
        }
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setBadge(this.f32796U.get(aVar.getId()));
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void q(int i4, @P View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f32783H.remove(i4);
        } else {
            this.f32783H.put(i4, onTouchListener);
        }
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.getItemData().getItemId() == i4) {
                    aVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i4) {
        int size = this.f32807i0.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = this.f32807i0.getItem(i5);
            if (i4 == item.getItemId()) {
                this.f32786K = i4;
                this.f32787L = i5;
                item.setChecked(true);
                return;
            }
        }
    }

    public void s() {
        O o4;
        g gVar = this.f32807i0;
        if (gVar != null && this.f32785J != null) {
            int size = gVar.size();
            if (size != this.f32785J.length) {
                c();
                return;
            }
            int i4 = this.f32786K;
            for (int i5 = 0; i5 < size; i5++) {
                MenuItem item = this.f32807i0.getItem(i5);
                if (item.isChecked()) {
                    this.f32786K = item.getItemId();
                    this.f32787L = i5;
                }
            }
            if (i4 != this.f32786K && (o4 = this.f32780E) != null) {
                androidx.transition.M.b(this, o4);
            }
            boolean l4 = l(this.f32784I, this.f32807i0.H().size());
            for (int i6 = 0; i6 < size; i6++) {
                this.f32806h0.k(true);
                this.f32785J[i6].setLabelVisibilityMode(this.f32784I);
                this.f32785J[i6].setShifting(l4);
                this.f32785J[i6].h((j) this.f32807i0.getItem(i6), 0);
                this.f32806h0.k(false);
            }
        }
    }

    public void setIconTintList(@P ColorStateList colorStateList) {
        this.f32788M = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@P ColorStateList colorStateList) {
        this.f32805g0 = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z3) {
        this.f32799a0 = z3;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z3);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@U int i4) {
        this.f32801c0 = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i4);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@U int i4) {
        this.f32802d0 = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemActiveIndicatorResizeable(boolean z3) {
        this.f32804f0 = z3;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z3);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@P com.google.android.material.shape.o oVar) {
        this.f32803e0 = oVar;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(f());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@U int i4) {
        this.f32800b0 = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i4);
            }
        }
    }

    public void setItemBackground(@P Drawable drawable) {
        this.f32794S = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i4) {
        this.f32795T = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemBackground(i4);
            }
        }
    }

    public void setItemIconSize(@r int i4) {
        this.f32789N = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setIconSize(i4);
            }
        }
    }

    public void setItemPaddingBottom(@U int i4) {
        this.f32798W = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i4);
            }
        }
    }

    public void setItemPaddingTop(@U int i4) {
        this.f32797V = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i4);
            }
        }
    }

    public void setItemTextAppearanceActive(@d0 int i4) {
        this.f32793R = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i4);
                ColorStateList colorStateList = this.f32790O;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@d0 int i4) {
        this.f32792Q = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i4);
                ColorStateList colorStateList = this.f32790O;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        this.f32790O = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f32785J;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i4) {
        this.f32784I = i4;
    }

    public void setPresenter(@N d dVar) {
        this.f32806h0 = dVar;
    }
}

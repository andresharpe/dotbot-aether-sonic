package com.google.android.material.chip;

import T0.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0565h;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.r;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.internal.C1780a;
import com.google.android.material.internal.C1786g;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class ChipGroup extends C1786g {

    /* renamed from: O, reason: collision with root package name */
    private static final int f31813O = a.n.Ah;

    /* renamed from: I, reason: collision with root package name */
    @r
    private int f31814I;

    /* renamed from: J, reason: collision with root package name */
    @r
    private int f31815J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private e f31816K;

    /* renamed from: L, reason: collision with root package name */
    private final C1780a<Chip> f31817L;

    /* renamed from: M, reason: collision with root package name */
    private final int f31818M;

    /* renamed from: N, reason: collision with root package name */
    @N
    private final f f31819N;

    /* loaded from: classes2.dex */
    class a implements C1780a.b {
        a() {
        }

        @Override // com.google.android.material.internal.C1780a.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.f31816K != null) {
                e eVar = ChipGroup.this.f31816K;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f31817L.j(ChipGroup.this));
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f31821a;

        b(d dVar) {
            this.f31821a = dVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(@N ChipGroup chipGroup, @N List<Integer> list) {
            if (!ChipGroup.this.f31817L.m()) {
                return;
            }
            this.f31821a.a(chipGroup, ChipGroup.this.getCheckedChipId());
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface d {
        void a(@N ChipGroup chipGroup, @D int i4);
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(@N ChipGroup chipGroup, @N List<Integer> list);
    }

    /* loaded from: classes2.dex */
    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f31823a;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C0823k0.D());
                }
                ChipGroup.this.f31817L.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f31823a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f31817L.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f31823a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                i4++;
            }
        }
        return i4;
    }

    @Override // com.google.android.material.internal.C1786g
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof c)) {
            return true;
        }
        return false;
    }

    public void g(@D int i4) {
        this.f31817L.f(i4);
    }

    @Override // android.view.ViewGroup
    @N
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @N
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @D
    public int getCheckedChipId() {
        return this.f31817L.k();
    }

    @N
    public List<Integer> getCheckedChipIds() {
        return this.f31817L.j(this);
    }

    @r
    public int getChipSpacingHorizontal() {
        return this.f31814I;
    }

    @r
    public int getChipSpacingVertical() {
        return this.f31815J;
    }

    public void h() {
        this.f31817L.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(@P View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                if (((Chip) getChildAt(i5)) == view) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public boolean j() {
        return this.f31817L.l();
    }

    public boolean k() {
        return this.f31817L.m();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f31818M;
        if (i4 != -1) {
            this.f31817L.f(i4);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        int i5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        M c22 = M.c2(accessibilityNodeInfo);
        if (c()) {
            i4 = getChipCount();
        } else {
            i4 = -1;
        }
        int rowCount = getRowCount();
        if (k()) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        c22.b1(M.c.f(rowCount, i4, false, i5));
    }

    public void setChipSpacing(@r int i4) {
        setChipSpacingHorizontal(i4);
        setChipSpacingVertical(i4);
    }

    public void setChipSpacingHorizontal(@r int i4) {
        if (this.f31814I != i4) {
            this.f31814I = i4;
            setItemSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@InterfaceC0574q int i4) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingResource(@InterfaceC0574q int i4) {
        setChipSpacing(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingVertical(@r int i4) {
        if (this.f31815J != i4) {
            this.f31815J = i4;
            setLineSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@InterfaceC0574q int i4) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@P Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i4) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@P d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@P e eVar) {
        this.f31816K = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f31819N.f31823a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z3) {
        this.f31817L.q(z3);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C1786g
    public void setSingleLine(boolean z3) {
        super.setSingleLine(z3);
    }

    public void setSingleSelection(boolean z3) {
        this.f31817L.r(z3);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1863P1);
    }

    @Override // android.view.ViewGroup
    @N
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(@InterfaceC0565h int i4) {
        setSingleLine(getResources().getBoolean(i4));
    }

    public void setSingleSelection(@InterfaceC0565h int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f31813O
            android.content.Context r9 = d1.C2044a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f31817L = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f31819N = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = T0.a.o.n6
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r11 = T0.a.o.p6
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = T0.a.o.q6
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = T0.a.o.r6
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = T0.a.o.t6
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = T0.a.o.u6
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = T0.a.o.s6
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = T0.a.o.o6
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f31818M = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.p(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C0823k0.R1(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

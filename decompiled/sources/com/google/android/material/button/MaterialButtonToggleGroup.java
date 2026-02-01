package com.google.android.material.button;

import T0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.D;
import androidx.annotation.InterfaceC0565h;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.H;
import androidx.core.view.accessibility.M;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.E;
import com.google.android.material.shape.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: O, reason: collision with root package name */
    private static final String f31690O = "MaterialButtonToggleGroup";

    /* renamed from: P, reason: collision with root package name */
    private static final int f31691P = a.n.Sh;

    /* renamed from: E, reason: collision with root package name */
    private final List<c> f31692E;

    /* renamed from: F, reason: collision with root package name */
    private final e f31693F;

    /* renamed from: G, reason: collision with root package name */
    private final LinkedHashSet<d> f31694G;

    /* renamed from: H, reason: collision with root package name */
    private final Comparator<MaterialButton> f31695H;

    /* renamed from: I, reason: collision with root package name */
    private Integer[] f31696I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f31697J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f31698K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31699L;

    /* renamed from: M, reason: collision with root package name */
    @D
    private final int f31700M;

    /* renamed from: N, reason: collision with root package name */
    private Set<Integer> f31701N;

    /* loaded from: classes2.dex */
    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes2.dex */
    class b extends C0771a {
        b() {
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.c1(M.d.h(0, 1, MaterialButtonToggleGroup.this.k(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.android.material.shape.d f31704e = new com.google.android.material.shape.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        com.google.android.material.shape.d f31705a;

        /* renamed from: b, reason: collision with root package name */
        com.google.android.material.shape.d f31706b;

        /* renamed from: c, reason: collision with root package name */
        com.google.android.material.shape.d f31707c;

        /* renamed from: d, reason: collision with root package name */
        com.google.android.material.shape.d f31708d;

        c(com.google.android.material.shape.d dVar, com.google.android.material.shape.d dVar2, com.google.android.material.shape.d dVar3, com.google.android.material.shape.d dVar4) {
            this.f31705a = dVar;
            this.f31706b = dVar3;
            this.f31707c = dVar4;
            this.f31708d = dVar2;
        }

        public static c a(c cVar) {
            com.google.android.material.shape.d dVar = f31704e;
            return new c(dVar, cVar.f31708d, dVar, cVar.f31707c);
        }

        public static c b(c cVar, View view) {
            if (E.k(view)) {
                return c(cVar);
            }
            return d(cVar);
        }

        public static c c(c cVar) {
            com.google.android.material.shape.d dVar = cVar.f31705a;
            com.google.android.material.shape.d dVar2 = cVar.f31708d;
            com.google.android.material.shape.d dVar3 = f31704e;
            return new c(dVar, dVar2, dVar3, dVar3);
        }

        public static c d(c cVar) {
            com.google.android.material.shape.d dVar = f31704e;
            return new c(dVar, dVar, cVar.f31706b, cVar.f31707c);
        }

        public static c e(c cVar, View view) {
            if (E.k(view)) {
                return d(cVar);
            }
            return c(cVar);
        }

        public static c f(c cVar) {
            com.google.android.material.shape.d dVar = cVar.f31705a;
            com.google.android.material.shape.d dVar2 = f31704e;
            return new c(dVar, dVar2, cVar.f31706b, dVar2);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @D int i4, boolean z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e implements MaterialButton.c {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@N MaterialButton materialButton, boolean z3) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@N Context context) {
        this(context, null);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            MaterialButton j4 = j(i4);
            int min = Math.min(j4.getStrokeWidth(), j(i4 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d4 = d(j4);
            if (getOrientation() == 0) {
                H.g(d4, 0);
                H.h(d4, -min);
                d4.topMargin = 0;
            } else {
                d4.bottomMargin = 0;
                d4.topMargin = -min;
                H.h(d4, 0);
            }
            j4.setLayoutParams(d4);
        }
        r(firstVisibleChildIndex);
    }

    @N
    private LinearLayout.LayoutParams d(@N View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void f(@D int i4, boolean z3) {
        if (i4 == -1) {
            Log.e(f31690O, "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f31701N);
        if (z3 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f31698K && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else if (!z3 && hashSet.contains(Integer.valueOf(i4))) {
            if (!this.f31699L || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        } else {
            return;
        }
        v(hashSet);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (m(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && m(i5)) {
                i4++;
            }
        }
        return i4;
    }

    private void i(@D int i4, boolean z3) {
        Iterator<d> it = this.f31694G.iterator();
        while (it.hasNext()) {
            it.next().a(this, i4, z3);
        }
    }

    private MaterialButton j(int i4) {
        return (MaterialButton) getChildAt(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k(@P View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == view) {
                return i4;
            }
            if ((getChildAt(i5) instanceof MaterialButton) && m(i5)) {
                i4++;
            }
        }
        return -1;
    }

    @P
    private c l(int i4, int i5, int i6) {
        boolean z3;
        c cVar = this.f31692E.get(i4);
        if (i5 == i6) {
            return cVar;
        }
        if (getOrientation() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i4 == i5) {
            if (z3) {
                return c.e(cVar, this);
            }
            return c.f(cVar);
        }
        if (i4 == i6) {
            if (z3) {
                return c.b(cVar, this);
            }
            return c.a(cVar);
        }
        return null;
    }

    private boolean m(int i4) {
        if (getChildAt(i4).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void r(int i4) {
        if (getChildCount() != 0 && i4 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) j(i4).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            } else {
                H.g(layoutParams, 0);
                H.h(layoutParams, 0);
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
            }
        }
    }

    private void s(@D int i4, boolean z3) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof MaterialButton) {
            this.f31697J = true;
            ((MaterialButton) findViewById).setChecked(z3);
            this.f31697J = false;
        }
    }

    private void setGeneratedIdIfNeeded(@N MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C0823k0.D());
        }
    }

    private void setupButtonChild(@N MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f31693F);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void u(o.b bVar, @P c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(cVar.f31705a).y(cVar.f31708d).Q(cVar.f31706b).D(cVar.f31707c);
        }
    }

    private void v(Set<Integer> set) {
        Set<Integer> set2 = this.f31701N;
        this.f31701N = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = j(i4).getId();
            s(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                i(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void w() {
        TreeMap treeMap = new TreeMap(this.f31695H);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put(j(i4), Integer.valueOf(i4));
        }
        this.f31696I = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f31690O, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.isChecked());
        o shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f31692E.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        C0823k0.B1(materialButton, new b());
    }

    public void b(@N d dVar) {
        this.f31694G.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@N Canvas canvas) {
        w();
        super.dispatchDraw(canvas);
    }

    public void e(@D int i4) {
        f(i4, true);
    }

    public void g() {
        v(new HashSet());
    }

    @D
    public int getCheckedButtonId() {
        if (this.f31698K && !this.f31701N.isEmpty()) {
            return this.f31701N.iterator().next().intValue();
        }
        return -1;
    }

    @N
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = j(i4).getId();
            if (this.f31701N.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f31696I;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w(f31690O, "Child order wasn't updated");
        return i5;
    }

    public void h() {
        this.f31694G.clear();
    }

    public boolean n() {
        return this.f31699L;
    }

    public boolean o() {
        return this.f31698K;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f31700M;
        if (i4 != -1) {
            v(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        M c22 = M.c2(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (o()) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        c22.b1(M.c.f(1, visibleButtonCount, false, i4));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        x();
        c();
        super.onMeasure(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f31692E.remove(indexOfChild);
        }
        x();
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(@N MaterialButton materialButton, boolean z3) {
        if (this.f31697J) {
            return;
        }
        f(materialButton.getId(), z3);
    }

    public void q(@N d dVar) {
        this.f31694G.remove(dVar);
    }

    public void setSelectionRequired(boolean z3) {
        this.f31699L = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f31698K != z3) {
            this.f31698K = z3;
            g();
        }
    }

    public void t(@D int i4) {
        f(i4, false);
    }

    @i0
    void x() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton j4 = j(i4);
            if (j4.getVisibility() != 8) {
                o.b v3 = j4.getShapeAppearanceModel().v();
                u(v3, l(i4, firstVisibleChildIndex, lastVisibleChildIndex));
                j4.setShapeAppearanceModel(v3.m());
            }
        }
    }

    public MaterialButtonToggleGroup(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.La);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(@androidx.annotation.N android.content.Context r7, @androidx.annotation.P android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f31691P
            android.content.Context r7 = d1.C2044a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f31692E = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f31693F = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f31694G = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f31695H = r7
            r7 = 0
            r6.f31697J = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f31701N = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = T0.a.o.vl
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.w.j(r0, r1, r2, r3, r4, r5)
            int r9 = T0.a.o.yl
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = T0.a.o.wl
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f31700M = r9
            int r9 = T0.a.o.xl
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f31699L = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C0823k0.R1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(@InterfaceC0565h int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}

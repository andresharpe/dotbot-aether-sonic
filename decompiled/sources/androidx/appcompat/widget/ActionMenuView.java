package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements g.b, androidx.appcompat.view.menu.o {

    /* renamed from: u0, reason: collision with root package name */
    private static final String f5545u0 = "ActionMenuView";

    /* renamed from: v0, reason: collision with root package name */
    static final int f5546v0 = 56;

    /* renamed from: w0, reason: collision with root package name */
    static final int f5547w0 = 4;

    /* renamed from: i0, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f5548i0;

    /* renamed from: j0, reason: collision with root package name */
    private Context f5549j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f5550k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f5551l0;

    /* renamed from: m0, reason: collision with root package name */
    private C0590c f5552m0;

    /* renamed from: n0, reason: collision with root package name */
    private n.a f5553n0;

    /* renamed from: o0, reason: collision with root package name */
    g.a f5554o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f5555p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f5556q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f5557r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f5558s0;

    /* renamed from: t0, reason: collision with root package name */
    e f5559t0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements n.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@androidx.annotation.N androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.b {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f5560a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f5561b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f5562c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f5563d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f5564e;

        /* renamed from: f, reason: collision with root package name */
        boolean f5565f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f5560a = cVar.f5560a;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f5560a = false;
        }

        c(int i4, int i5, boolean z3) {
            super(i4, i5);
            this.f5560a = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, @androidx.annotation.N MenuItem menuItem) {
            e eVar = ActionMenuView.this.f5559t0;
            if (eVar != null && eVar.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.N androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f5554o0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int P(View view, int i4, int i5, int i6, int i7) {
        ActionMenuItemView actionMenuItemView;
        boolean z3;
        int i8;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z4 = false;
        if (actionMenuItemView != null && actionMenuItemView.u()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i5 > 0) {
            i8 = 2;
            if (!z3 || i5 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i9 = measuredWidth / i4;
                if (measuredWidth % i4 != 0) {
                    i9++;
                }
                if (!z3 || i9 >= 2) {
                    i8 = i9;
                }
                if (!cVar.f5560a && z3) {
                    z4 = true;
                }
                cVar.f5563d = z4;
                cVar.f5561b = i8;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
                return i8;
            }
        }
        i8 = 0;
        if (!cVar.f5560a) {
            z4 = true;
        }
        cVar.f5563d = z4;
        cVar.f5561b = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
        return i8;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void Q(int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        int i10;
        int i11;
        boolean z7;
        int i12;
        ?? r14;
        boolean z8;
        int i13;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f5557r0;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        boolean z9 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j4 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i24 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z10 = childAt instanceof ActionMenuItemView;
                int i25 = i21 + 1;
                if (z10) {
                    int i26 = this.f5558s0;
                    i12 = i25;
                    r14 = 0;
                    childAt.setPadding(i26, 0, i26, 0);
                } else {
                    i12 = i25;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f5565f = r14;
                cVar.f5562c = r14;
                cVar.f5561b = r14;
                cVar.f5563d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                if (z10 && ((ActionMenuItemView) childAt).u()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                cVar.f5564e = z8;
                if (cVar.f5560a) {
                    i13 = 1;
                } else {
                    i13 = i16;
                }
                int P3 = P(childAt, i18, i13, childMeasureSpec, paddingTop);
                i22 = Math.max(i22, P3);
                if (cVar.f5563d) {
                    i23++;
                }
                if (cVar.f5560a) {
                    z9 = true;
                }
                i16 -= P3;
                i19 = Math.max(i19, childAt.getMeasuredHeight());
                if (P3 == 1) {
                    j4 |= 1 << i20;
                    i19 = i19;
                }
                i21 = i12;
            }
            i20++;
            size2 = i24;
        }
        int i27 = size2;
        if (z9 && i21 == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z11 = false;
        while (i23 > 0 && i16 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j5 = 0;
            while (i30 < childCount) {
                boolean z12 = z11;
                c cVar2 = (c) getChildAt(i30).getLayoutParams();
                int i31 = i19;
                if (cVar2.f5563d) {
                    int i32 = cVar2.f5561b;
                    if (i32 < i28) {
                        j5 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        i29++;
                        j5 |= 1 << i30;
                    }
                }
                i30++;
                i19 = i31;
                z11 = z12;
            }
            z4 = z11;
            i8 = i19;
            j4 |= j5;
            if (i29 > i16) {
                i6 = mode;
                i7 = i14;
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i35 = i14;
                int i36 = mode;
                long j6 = 1 << i34;
                if ((j5 & j6) == 0) {
                    if (cVar3.f5561b == i33) {
                        j4 |= j6;
                    }
                    z7 = z3;
                } else {
                    if (z3 && cVar3.f5564e && i16 == 1) {
                        int i37 = this.f5558s0;
                        z7 = z3;
                        childAt2.setPadding(i37 + i18, 0, i37, 0);
                    } else {
                        z7 = z3;
                    }
                    cVar3.f5561b++;
                    cVar3.f5565f = true;
                    i16--;
                }
                i34++;
                mode = i36;
                i14 = i35;
                z3 = z7;
            }
            i19 = i8;
            z11 = true;
        }
        i6 = mode;
        i7 = i14;
        z4 = z11;
        i8 = i19;
        if (!z9 && i21 == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i16 <= 0 || j4 == 0 || (i16 >= i21 - 1 && !z5 && i22 <= 1)) {
            i9 = 0;
            z6 = z4;
        } else {
            float bitCount = Long.bitCount(j4);
            if (!z5) {
                i9 = 0;
                if ((j4 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f5564e) {
                    bitCount -= 0.5f;
                }
                int i38 = childCount - 1;
                if ((j4 & (1 << i38)) != 0 && !((c) getChildAt(i38).getLayoutParams()).f5564e) {
                    bitCount -= 0.5f;
                }
            } else {
                i9 = 0;
            }
            if (bitCount > 0.0f) {
                i11 = (int) ((i16 * i18) / bitCount);
            } else {
                i11 = i9;
            }
            z6 = z4;
            for (int i39 = i9; i39 < childCount; i39++) {
                if ((j4 & (1 << i39)) != 0) {
                    View childAt3 = getChildAt(i39);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f5562c = i11;
                        cVar4.f5565f = true;
                        if (i39 == 0 && !cVar4.f5564e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i11) / 2;
                        }
                        z6 = true;
                    } else if (cVar4.f5560a) {
                        cVar4.f5562c = i11;
                        cVar4.f5565f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i11) / 2;
                        z6 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i11 / 2;
                        }
                        if (i39 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i11 / 2;
                        }
                    }
                }
            }
        }
        if (z6) {
            for (int i40 = i9; i40 < childCount; i40++) {
                View childAt4 = getChildAt(i40);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f5565f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f5561b * i18) + cVar5.f5562c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i6 != 1073741824) {
            i10 = i8;
        } else {
            i10 = i27;
        }
        setMeasuredDimension(i7, i10);
    }

    public void F() {
        C0590c c0590c = this.f5552m0;
        if (c0590c != null) {
            c0590c.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public c J() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f5560a = true;
        return generateDefaultLayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected boolean K(int i4) {
        boolean z3 = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            z3 = ((a) childAt).a();
        }
        if (i4 > 0 && (childAt2 instanceof a)) {
            return z3 | ((a) childAt2).d();
        }
        return z3;
    }

    public boolean L() {
        C0590c c0590c = this.f5552m0;
        if (c0590c != null && c0590c.E()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean M() {
        C0590c c0590c = this.f5552m0;
        if (c0590c != null && c0590c.G()) {
            return true;
        }
        return false;
    }

    public boolean N() {
        C0590c c0590c = this.f5552m0;
        if (c0590c != null && c0590c.H()) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean O() {
        return this.f5551l0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g R() {
        return this.f5548i0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void S(n.a aVar, g.a aVar2) {
        this.f5553n0 = aVar;
        this.f5554o0 = aVar2;
    }

    public boolean T() {
        C0590c c0590c = this.f5552m0;
        if (c0590c != null && c0590c.Q()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean a(androidx.appcompat.view.menu.j jVar) {
        return this.f5548i0.O(jVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void e(androidx.appcompat.view.menu.g gVar) {
        this.f5548i0 = gVar;
    }

    public Menu getMenu() {
        if (this.f5548i0 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f5548i0 = gVar;
            gVar.X(new d());
            C0590c c0590c = new C0590c(context);
            this.f5552m0 = c0590c;
            c0590c.O(true);
            C0590c c0590c2 = this.f5552m0;
            n.a aVar = this.f5553n0;
            if (aVar == null) {
                aVar = new b();
            }
            c0590c2.h(aVar);
            this.f5548i0.c(this.f5552m0, this.f5549j0);
            this.f5552m0.M(this);
        }
        return this.f5548i0;
    }

    @androidx.annotation.P
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f5552m0.D();
    }

    public int getPopupTheme() {
        return this.f5550k0;
    }

    @Override // androidx.appcompat.view.menu.o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0590c c0590c = this.f5552m0;
        if (c0590c != null) {
            c0590c.d(false);
            if (this.f5552m0.H()) {
                this.f5552m0.E();
                this.f5552m0.Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        if (!this.f5555p0) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i6 - i4;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean b4 = q0.b(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f5560a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (K(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b4) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    K(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i8 = paddingRight / i18;
        } else {
            i8 = 0;
        }
        int max = Math.max(0, i8);
        if (b4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f5560a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f5560a) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = i23 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i4, int i5) {
        boolean z3;
        androidx.appcompat.view.menu.g gVar;
        boolean z4 = this.f5555p0;
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f5555p0 = z3;
        if (z4 != z3) {
            this.f5556q0 = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f5555p0 && (gVar = this.f5548i0) != null && size != this.f5556q0) {
            this.f5556q0 = size;
            gVar.N(true);
        }
        int childCount = getChildCount();
        if (this.f5555p0 && childCount > 0) {
            Q(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            c cVar = (c) getChildAt(i6).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f5552m0.K(z3);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f5559t0 = eVar;
    }

    public void setOverflowIcon(@androidx.annotation.P Drawable drawable) {
        getMenu();
        this.f5552m0.N(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z3) {
        this.f5551l0 = z3;
    }

    public void setPopupTheme(@androidx.annotation.d0 int i4) {
        if (this.f5550k0 != i4) {
            this.f5550k0 = i4;
            if (i4 == 0) {
                this.f5549j0 = getContext();
            } else {
                this.f5549j0 = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(C0590c c0590c) {
        this.f5552m0 = c0590c;
        c0590c.M(this);
    }

    public ActionMenuView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f5557r0 = (int) (56.0f * f4);
        this.f5558s0 = (int) (f4 * 4.0f);
        this.f5549j0 = context;
        this.f5550k0 = 0;
    }
}

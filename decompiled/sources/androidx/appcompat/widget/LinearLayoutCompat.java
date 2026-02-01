package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: T, reason: collision with root package name */
    public static final int f5668T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static final int f5669U = 1;

    /* renamed from: V, reason: collision with root package name */
    public static final int f5670V = 0;

    /* renamed from: W, reason: collision with root package name */
    public static final int f5671W = 1;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f5672a0 = 2;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f5673b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    private static final int f5674c0 = 4;

    /* renamed from: d0, reason: collision with root package name */
    private static final int f5675d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    private static final int f5676e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    private static final int f5677f0 = 2;

    /* renamed from: g0, reason: collision with root package name */
    private static final int f5678g0 = 3;

    /* renamed from: h0, reason: collision with root package name */
    private static final String f5679h0 = "androidx.appcompat.widget.LinearLayoutCompat";

    /* renamed from: E, reason: collision with root package name */
    private boolean f5680E;

    /* renamed from: F, reason: collision with root package name */
    private int f5681F;

    /* renamed from: G, reason: collision with root package name */
    private int f5682G;

    /* renamed from: H, reason: collision with root package name */
    private int f5683H;

    /* renamed from: I, reason: collision with root package name */
    private int f5684I;

    /* renamed from: J, reason: collision with root package name */
    private int f5685J;

    /* renamed from: K, reason: collision with root package name */
    private float f5686K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f5687L;

    /* renamed from: M, reason: collision with root package name */
    private int[] f5688M;

    /* renamed from: N, reason: collision with root package name */
    private int[] f5689N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f5690O;

    /* renamed from: P, reason: collision with root package name */
    private int f5691P;

    /* renamed from: Q, reason: collision with root package name */
    private int f5692Q;

    /* renamed from: R, reason: collision with root package name */
    private int f5693R;

    /* renamed from: S, reason: collision with root package name */
    private int f5694S;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface a {
    }

    /* loaded from: classes.dex */
    public static class b extends LinearLayout.LayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i4, int i5) {
            super(i4, i5);
        }

        public b(int i4, int i5, float f4) {
            super(i4, i5, f4);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface c {
    }

    public LinearLayoutCompat(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private void E(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    private void m(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View u3 = u(i6);
            if (u3.getVisibility() != 8) {
                b bVar = (b) u3.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).height == -1) {
                    int i7 = ((LinearLayout.LayoutParams) bVar).width;
                    ((LinearLayout.LayoutParams) bVar).width = u3.getMeasuredWidth();
                    measureChildWithMargins(u3, i5, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) bVar).width = i7;
                }
            }
        }
    }

    private void n(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View u3 = u(i6);
            if (u3.getVisibility() != 8) {
                b bVar = (b) u3.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = u3.getMeasuredHeight();
                    measureChildWithMargins(u3, makeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i7;
                }
            }
        }
    }

    void A(View view, int i4, int i5, int i6, int i7, int i8) {
        measureChildWithMargins(view, i5, i6, i7, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void B(int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.B(int, int):void");
    }

    int C(int i4) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x031c, code lost:
    
        if (((android.widget.LinearLayout.LayoutParams) r14).width == (-1)) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void D(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.D(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f5681F < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f5681F;
        if (childCount > i5) {
            View childAt = getChildAt(i5);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f5681F == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i6 = this.f5682G;
            if (this.f5683H == 1 && (i4 = this.f5684I & 112) != 48) {
                if (i4 != 16) {
                    if (i4 == 80) {
                        i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5685J;
                    }
                } else {
                    i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5685J) / 2;
                }
            }
            return i6 + ((LinearLayout.LayoutParams) ((b) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5681F;
    }

    public Drawable getDividerDrawable() {
        return this.f5690O;
    }

    public int getDividerPadding() {
        return this.f5694S;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f5691P;
    }

    @androidx.annotation.A
    public int getGravity() {
        return this.f5684I;
    }

    public int getOrientation() {
        return this.f5683H;
    }

    public int getShowDividers() {
        return this.f5693R;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5686K;
    }

    void i(Canvas canvas) {
        int right;
        int left;
        int i4;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean b4 = q0.b(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View u3 = u(i5);
            if (u3 != null && u3.getVisibility() != 8 && v(i5)) {
                b bVar = (b) u3.getLayoutParams();
                if (b4) {
                    left2 = u3.getRight() + ((LinearLayout.LayoutParams) bVar).rightMargin;
                } else {
                    left2 = (u3.getLeft() - ((LinearLayout.LayoutParams) bVar).leftMargin) - this.f5691P;
                }
                l(canvas, left2);
            }
        }
        if (v(virtualChildCount)) {
            View u4 = u(virtualChildCount - 1);
            if (u4 == null) {
                if (b4) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i4 = this.f5691P;
                    right = left - i4;
                }
            } else {
                b bVar2 = (b) u4.getLayoutParams();
                if (b4) {
                    left = u4.getLeft() - ((LinearLayout.LayoutParams) bVar2).leftMargin;
                    i4 = this.f5691P;
                    right = left - i4;
                } else {
                    right = u4.getRight() + ((LinearLayout.LayoutParams) bVar2).rightMargin;
                }
            }
            l(canvas, right);
        }
    }

    void j(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View u3 = u(i4);
            if (u3 != null && u3.getVisibility() != 8 && v(i4)) {
                k(canvas, (u3.getTop() - ((LinearLayout.LayoutParams) ((b) u3.getLayoutParams())).topMargin) - this.f5692Q);
            }
        }
        if (v(virtualChildCount)) {
            View u4 = u(virtualChildCount - 1);
            if (u4 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f5692Q;
            } else {
                bottom = u4.getBottom() + ((LinearLayout.LayoutParams) ((b) u4.getLayoutParams())).bottomMargin;
            }
            k(canvas, bottom);
        }
    }

    void k(Canvas canvas, int i4) {
        this.f5690O.setBounds(getPaddingLeft() + this.f5694S, i4, (getWidth() - getPaddingRight()) - this.f5694S, this.f5692Q + i4);
        this.f5690O.draw(canvas);
    }

    void l(Canvas canvas, int i4) {
        this.f5690O.setBounds(i4, getPaddingTop() + this.f5694S, this.f5691P + i4, (getHeight() - getPaddingBottom()) - this.f5694S);
        this.f5690O.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        int i4 = this.f5683H;
        if (i4 == 0) {
            return new b(-2, -2);
        }
        if (i4 == 1) {
            return new b(-1, -2);
        }
        return null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f5690O == null) {
            return;
        }
        if (this.f5683H == 1) {
            j(canvas);
        } else {
            i(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f5679h0);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f5679h0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (this.f5683H == 1) {
            z(i4, i5, i6, i7);
        } else {
            y(i4, i5, i6, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f5683H == 1) {
            D(i4, i5);
        } else {
            B(i4, i5);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    int r(View view, int i4) {
        return 0;
    }

    int s(View view) {
        return 0;
    }

    public void setBaselineAligned(boolean z3) {
        this.f5680E = z3;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f5681F = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5690O) {
            return;
        }
        this.f5690O = drawable;
        boolean z3 = false;
        if (drawable != null) {
            this.f5691P = drawable.getIntrinsicWidth();
            this.f5692Q = drawable.getIntrinsicHeight();
        } else {
            this.f5691P = 0;
            this.f5692Q = 0;
        }
        if (drawable == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f5694S = i4;
    }

    public void setGravity(@androidx.annotation.A int i4) {
        if (this.f5684I != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= androidx.core.view.C.f13101b;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f5684I = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & androidx.core.view.C.f13103d;
        int i6 = this.f5684I;
        if ((8388615 & i6) != i5) {
            this.f5684I = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f5687L = z3;
    }

    public void setOrientation(int i4) {
        if (this.f5683H != i4) {
            this.f5683H = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f5693R) {
            requestLayout();
        }
        this.f5693R = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f5684I;
        if ((i6 & 112) != i5) {
            this.f5684I = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f4) {
        this.f5686K = Math.max(0.0f, f4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    int t(View view) {
        return 0;
    }

    View u(int i4) {
        return getChildAt(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean v(int i4) {
        if (i4 == 0) {
            if ((this.f5693R & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i4 == getChildCount()) {
            if ((this.f5693R & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f5693R & 2) == 0) {
            return false;
        }
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean w() {
        return this.f5680E;
    }

    public boolean x() {
        return this.f5687L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void y(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.y(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void z(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f5684I
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f5685J
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f5685J
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lcb
            android.view.View r13 = r6.u(r12)
            r14 = 1
            if (r13 != 0) goto L5a
            int r1 = r6.C(r12)
            int r0 = r0 + r1
        L57:
            r1 = r14
            goto Lc8
        L5a:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto L57
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.LinearLayoutCompat$b r5 = (androidx.appcompat.widget.LinearLayoutCompat.b) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L76
            r1 = r11
        L76:
            int r2 = androidx.core.view.C0823k0.Z(r17)
            int r1 = androidx.core.view.C.d(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L90
            r2 = 5
            if (r1 == r2) goto L8a
            int r1 = r5.leftMargin
            int r1 = r1 + r7
        L88:
            r2 = r1
            goto L9b
        L8a:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
        L8e:
            int r1 = r1 - r2
            goto L88
        L90:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
            goto L8e
        L9b:
            boolean r1 = r6.v(r12)
            if (r1 == 0) goto La4
            int r1 = r6.f5692Q
            int r0 = r0 + r1
        La4:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.s(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.E(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.t(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.r(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
        Lc8:
            int r12 = r12 + r1
            goto L49
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.z(int, int, int, int):void");
    }

    public LinearLayoutCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5680E = true;
        this.f5681F = -1;
        this.f5682G = 0;
        this.f5684I = 8388659;
        g0 G3 = g0.G(context, attributeSet, C2042a.m.L3, i4, 0);
        C0823k0.z1(this, context, C2042a.m.L3, attributeSet, G3.B(), i4, 0);
        int o4 = G3.o(C2042a.m.N3, -1);
        if (o4 >= 0) {
            setOrientation(o4);
        }
        int o5 = G3.o(C2042a.m.M3, -1);
        if (o5 >= 0) {
            setGravity(o5);
        }
        boolean a4 = G3.a(C2042a.m.O3, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f5686K = G3.j(C2042a.m.Q3, -1.0f);
        this.f5681F = G3.o(C2042a.m.P3, -1);
        this.f5687L = G3.a(C2042a.m.T3, false);
        setDividerDrawable(G3.h(C2042a.m.R3));
        this.f5693R = G3.o(C2042a.m.U3, 0);
        this.f5694S = G3.g(C2042a.m.S3, 0);
        G3.I();
    }
}

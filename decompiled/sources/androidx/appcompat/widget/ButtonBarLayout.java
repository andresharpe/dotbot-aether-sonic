package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: H, reason: collision with root package name */
    private static final int f5642H = 16;

    /* renamed from: E, reason: collision with root package name */
    private boolean f5643E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f5644F;

    /* renamed from: G, reason: collision with root package name */
    private int f5645G;

    public ButtonBarLayout(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5645G = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.f50154q3);
        C0823k0.z1(this, context, C2042a.m.f50154q3, attributeSet, obtainStyledAttributes, 0, 0);
        this.f5643E = obtainStyledAttributes.getBoolean(C2042a.m.f50159r3, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f5643E);
        }
    }

    private int a(int i4) {
        int childCount = getChildCount();
        while (i4 < childCount) {
            if (getChildAt(i4).getVisibility() == 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private boolean b() {
        return this.f5644F;
    }

    private void setStacked(boolean z3) {
        int i4;
        int i5;
        if (this.f5644F != z3) {
            if (!z3 || this.f5643E) {
                this.f5644F = z3;
                setOrientation(z3 ? 1 : 0);
                if (z3) {
                    i4 = androidx.core.view.C.f13102c;
                } else {
                    i4 = 80;
                }
                setGravity(i4);
                View findViewById = findViewById(C2042a.g.f49633i0);
                if (findViewById != null) {
                    if (z3) {
                        i5 = 8;
                    } else {
                        i5 = 4;
                    }
                    findViewById.setVisibility(i5);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f5643E
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.f5645G
            if (r0 <= r1) goto L16
            boolean r1 = r5.b()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.f5645G = r0
        L18:
            boolean r1 = r5.b()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L31
        L2f:
            r0 = r6
            r1 = r2
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f5643E
            if (r0 == 0) goto L4d
            boolean r0 = r5.b()
            if (r0 != 0) goto L4d
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4d
            r5.setStacked(r3)
            goto L4f
        L4d:
            if (r1 == 0) goto L52
        L4f:
            super.onMeasure(r6, r7)
        L52:
            int r0 = r5.a(r2)
            if (r0 < 0) goto L9e
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r4 = r5.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.topMargin
            int r4 = r4 + r1
            int r1 = r2.bottomMargin
            int r4 = r4 + r1
            boolean r1 = r5.b()
            if (r1 == 0) goto L98
            int r0 = r0 + r3
            int r0 = r5.a(r0)
            if (r0 < 0) goto L96
            android.view.View r0 = r5.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = r0 + r1
            int r4 = r4 + r0
        L96:
            r2 = r4
            goto L9e
        L98:
            int r0 = r5.getPaddingBottom()
            int r2 = r4 + r0
        L9e:
            int r0 = androidx.core.view.C0823k0.e0(r5)
            if (r0 == r2) goto Lac
            r5.setMinimumHeight(r2)
            if (r7 != 0) goto Lac
            super.onMeasure(r6, r7)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    public void setAllowStacking(boolean z3) {
        if (this.f5643E != z3) {
            this.f5643E = z3;
            if (!z3 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

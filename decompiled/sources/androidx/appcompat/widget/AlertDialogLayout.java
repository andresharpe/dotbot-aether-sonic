package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@androidx.annotation.P Context context) {
        super(context);
    }

    private void E(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    private static int F(View view) {
        int e02 = C0823k0.e0(view);
        if (e02 > 0) {
            return e02;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return F(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean G(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C2042a.g.f49659v0) {
                    view = childAt;
                } else if (id == C2042a.g.f49648q) {
                    view2 = childAt;
                } else {
                    if ((id != C2042a.g.f49656u && id != C2042a.g.f49660w) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i4, 0);
            paddingTop += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            i7 = F(view2);
            i8 = view2.getMeasuredHeight() - i7;
            paddingTop += i7;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i4, makeMeasureSpec);
            i9 = view3.getMeasuredHeight();
            paddingTop += i9;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i9 = 0;
        }
        int i11 = size - paddingTop;
        if (view2 != null) {
            int i12 = paddingTop - i7;
            int min = Math.min(i11, i8);
            if (min > 0) {
                i11 -= min;
                i7 += min;
            }
            view2.measure(i4, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingTop = i12 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i4, View.MeasureSpec.makeMeasureSpec(i9 + i11, mode));
            paddingTop = (paddingTop - i9) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i4, i6), View.resolveSizeAndState(paddingTop, i5, 0));
        if (mode2 != 1073741824) {
            n(childCount, i5);
            return true;
        }
        return true;
    }

    private void n(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i7;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.getGravity()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            if (r2 == r1) goto L40
            r1 = 80
            if (r2 == r1) goto L35
            int r0 = r17.getPaddingTop()
            goto L4b
        L35:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L40:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r0 = r1 + r2
        L4b:
            android.graphics.drawable.Drawable r1 = r17.getDividerDrawable()
            r2 = 0
            if (r1 != 0) goto L54
            r12 = r2
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r12 = r1
        L59:
            r13 = r2
        L5a:
            if (r13 >= r10) goto Lc0
            android.view.View r1 = r6.getChildAt(r13)
            if (r1 == 0) goto Lbd
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lbd
            int r4 = r1.getMeasuredWidth()
            int r14 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r15 = r2
            androidx.appcompat.widget.LinearLayoutCompat$b r15 = (androidx.appcompat.widget.LinearLayoutCompat.b) r15
            int r2 = r15.gravity
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = androidx.core.view.C0823k0.Z(r17)
            int r2 = androidx.core.view.C.d(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L98
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r15.leftMargin
            int r2 = r2 + r7
            goto La3
        L92:
            int r2 = r8 - r4
            int r3 = r15.rightMargin
        L96:
            int r2 = r2 - r3
            goto La3
        L98:
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r7
            int r3 = r15.leftMargin
            int r2 = r2 + r3
            int r3 = r15.rightMargin
            goto L96
        La3:
            boolean r3 = r6.v(r13)
            if (r3 == 0) goto Laa
            int r0 = r0 + r12
        Laa:
            int r3 = r15.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r5 = r14
            r0.E(r1, r2, r3, r4, r5)
            int r0 = r15.bottomMargin
            int r14 = r14 + r0
            int r16 = r16 + r14
            r0 = r16
        Lbd:
            int r13 = r13 + 1
            goto L5a
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i4, int i5) {
        if (!G(i4, i5)) {
            super.onMeasure(i4, i5);
        }
    }

    public AlertDialogLayout(@androidx.annotation.P Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

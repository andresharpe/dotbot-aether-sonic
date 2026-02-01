package androidx.core.view;

import android.view.View;

/* loaded from: classes.dex */
public interface Y {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.N View view, float f4, float f5, boolean z3);

    boolean onNestedPreFling(@androidx.annotation.N View view, float f4, float f5);

    void onNestedPreScroll(@androidx.annotation.N View view, int i4, int i5, @androidx.annotation.N int[] iArr);

    void onNestedScroll(@androidx.annotation.N View view, int i4, int i5, int i6, int i7);

    void onNestedScrollAccepted(@androidx.annotation.N View view, @androidx.annotation.N View view2, int i4);

    boolean onStartNestedScroll(@androidx.annotation.N View view, @androidx.annotation.N View view2, int i4);

    void onStopNestedScroll(@androidx.annotation.N View view);
}

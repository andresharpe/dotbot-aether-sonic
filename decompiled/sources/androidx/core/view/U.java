package androidx.core.view;

/* loaded from: classes.dex */
public interface U {
    boolean dispatchNestedFling(float f4, float f5, boolean z3);

    boolean dispatchNestedPreFling(float f4, float f5);

    boolean dispatchNestedPreScroll(int i4, int i5, @androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2);

    boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @androidx.annotation.P int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z3);

    boolean startNestedScroll(int i4);

    void stopNestedScroll();
}

package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f20685b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f20686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0187a implements Comparator<int[]> {
        C0187a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f20685b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(@N LinearLayoutManager linearLayoutManager) {
        this.f20686a = linearLayoutManager;
    }

    private boolean a() {
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i4;
        int bottom;
        int i5;
        int Q3 = this.f20686a.Q();
        if (Q3 == 0) {
            return true;
        }
        if (this.f20686a.M2() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Q3, 2);
        for (int i6 = 0; i6 < Q3; i6++) {
            View P3 = this.f20686a.P(i6);
            if (P3 != null) {
                ViewGroup.LayoutParams layoutParams = P3.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f20685b;
                }
                int[] iArr2 = iArr[i6];
                if (z3) {
                    top = P3.getLeft();
                    i4 = marginLayoutParams.leftMargin;
                } else {
                    top = P3.getTop();
                    i4 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i4;
                int[] iArr3 = iArr[i6];
                if (z3) {
                    bottom = P3.getRight();
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    bottom = P3.getBottom();
                    i5 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i5;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C0187a());
        for (int i7 = 1; i7 < Q3; i7++) {
            if (iArr[i7 - 1][1] != iArr[i7][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i8 = iArr4[1];
        int i9 = iArr4[0];
        int i10 = i8 - i9;
        if (i9 <= 0 && iArr[Q3 - 1][1] >= i10) {
            return true;
        }
        return false;
    }

    private boolean b() {
        int Q3 = this.f20686a.Q();
        for (int i4 = 0; i4 < Q3; i4++) {
            if (c(this.f20686a.P(i4))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (c(viewGroup.getChildAt(i4))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        if ((!a() || this.f20686a.Q() <= 1) && b()) {
            return true;
        }
        return false;
    }
}

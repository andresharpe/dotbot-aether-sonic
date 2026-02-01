package androidx.transition;

import android.view.View;

/* loaded from: classes.dex */
public abstract class u0 extends N {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20187a = "android:visibilityPropagation:visibility";

    /* renamed from: b, reason: collision with root package name */
    private static final String f20188b = "android:visibilityPropagation:center";

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f20189c = {f20187a, f20188b};

    private static int d(S s4, int i4) {
        int[] iArr;
        if (s4 == null || (iArr = (int[]) s4.f19959a.get(f20188b)) == null) {
            return -1;
        }
        return iArr[i4];
    }

    @Override // androidx.transition.N
    public void a(S s4) {
        View view = s4.f19960b;
        Integer num = (Integer) s4.f19959a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        s4.f19959a.put(f20187a, num);
        view.getLocationOnScreen(r2);
        int round = r2[0] + Math.round(view.getTranslationX());
        int[] iArr = {round};
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        s4.f19959a.put(f20188b, iArr);
    }

    @Override // androidx.transition.N
    public String[] b() {
        return f20189c;
    }

    public int e(S s4) {
        Integer num;
        if (s4 == null || (num = (Integer) s4.f19959a.get(f20187a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(S s4) {
        return d(s4, 0);
    }

    public int g(S s4) {
        return d(s4, 1);
    }
}

package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static k f14110a = new DataBinderMapperImpl();

    /* renamed from: b, reason: collision with root package name */
    private static l f14111b = null;

    private m() {
    }

    @P
    public static <T extends ViewDataBinding> T a(@N View view) {
        return (T) b(view, f14111b);
    }

    @P
    public static <T extends ViewDataBinding> T b(@N View view, l lVar) {
        T t3 = (T) h(view);
        if (t3 != null) {
            return t3;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int e4 = f14110a.e((String) tag);
            if (e4 != 0) {
                return (T) f14110a.c(lVar, view, e4);
            }
            throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends ViewDataBinding> T c(l lVar, View view, int i4) {
        return (T) f14110a.c(lVar, view, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends ViewDataBinding> T d(l lVar, View[] viewArr, int i4) {
        return (T) f14110a.d(lVar, viewArr, i4);
    }

    private static <T extends ViewDataBinding> T e(l lVar, ViewGroup viewGroup, int i4, int i5) {
        int childCount = viewGroup.getChildCount();
        int i6 = childCount - i4;
        if (i6 == 1) {
            return (T) c(lVar, viewGroup.getChildAt(childCount - 1), i5);
        }
        View[] viewArr = new View[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            viewArr[i7] = viewGroup.getChildAt(i7 + i4);
        }
        return (T) d(lVar, viewArr, i5);
    }

    @P
    public static String f(int i4) {
        return f14110a.b(i4);
    }

    @P
    public static <T extends ViewDataBinding> T g(@N View view) {
        while (view != null) {
            T t3 = (T) ViewDataBinding.E(view);
            if (t3 != null) {
                return t3;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char charAt = str.charAt(6);
                    int indexOf = str.indexOf(47, 7);
                    if (charAt == '/') {
                        if (indexOf == -1) {
                            return null;
                        }
                    } else if (charAt == '-' && indexOf != -1 && str.indexOf(47, indexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    @P
    public static <T extends ViewDataBinding> T h(@N View view) {
        return (T) ViewDataBinding.E(view);
    }

    @P
    public static l i() {
        return f14111b;
    }

    public static <T extends ViewDataBinding> T j(@N LayoutInflater layoutInflater, int i4, @P ViewGroup viewGroup, boolean z3) {
        return (T) k(layoutInflater, i4, viewGroup, z3, f14111b);
    }

    public static <T extends ViewDataBinding> T k(@N LayoutInflater layoutInflater, int i4, @P ViewGroup viewGroup, boolean z3, @P l lVar) {
        boolean z4;
        int i5 = 0;
        if (viewGroup != null && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i5 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i4, viewGroup, z3);
        if (z4) {
            return (T) e(lVar, viewGroup, i5, i4);
        }
        return (T) c(lVar, inflate, i4);
    }

    public static <T extends ViewDataBinding> T l(@N Activity activity, int i4) {
        return (T) m(activity, i4, f14111b);
    }

    public static <T extends ViewDataBinding> T m(@N Activity activity, int i4, @P l lVar) {
        activity.setContentView(i4);
        return (T) e(lVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i4);
    }

    public static void n(@P l lVar) {
        f14111b = lVar;
    }
}

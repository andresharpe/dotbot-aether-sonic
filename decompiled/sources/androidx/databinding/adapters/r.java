package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> f14061a = new SparseArray<>();

    public static <T> T a(View view, int i4) {
        return (T) view.getTag(i4);
    }

    public static <T> T b(View view, T t3, int i4) {
        T t4 = (T) view.getTag(i4);
        view.setTag(i4, t3);
        return t4;
    }
}

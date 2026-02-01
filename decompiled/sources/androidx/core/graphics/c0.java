package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
@androidx.annotation.W(21)
/* loaded from: classes.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12469a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12470b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12471c = "nativeCreateFromTypeface";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12472d = "nativeCreateWeightAlias";

    /* renamed from: e, reason: collision with root package name */
    private static final Field f12473e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f12474f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f12475g;

    /* renamed from: h, reason: collision with root package name */
    private static final Constructor<Typeface> f12476h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.B("sWeightCacheLock")
    private static final androidx.collection.h<SparseArray<Typeface>> f12477i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f12478j;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField(f12470b);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod(f12471c, cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod(f12472d, cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e4) {
            Log.e(f12469a, e4.getClass().getName(), e4);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f12473e = field;
        f12474f = method;
        f12475g = method2;
        f12476h = constructor;
        f12477i = new androidx.collection.h<>(3);
        f12478j = new Object();
    }

    private c0() {
    }

    @androidx.annotation.P
    private static Typeface a(long j4) {
        try {
            return f12476h.newInstance(Long.valueOf(j4));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static Typeface b(@androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        Typeface a4;
        if (!d()) {
            return null;
        }
        int i5 = (i4 << 1) | (z3 ? 1 : 0);
        synchronized (f12478j) {
            try {
                long c4 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f12477i;
                SparseArray<Typeface> i6 = hVar.i(c4);
                if (i6 == null) {
                    i6 = new SparseArray<>(4);
                    hVar.p(c4, i6);
                } else {
                    Typeface typeface2 = i6.get(i5);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z3 == typeface.isItalic()) {
                    a4 = a(f(c4, i4));
                } else {
                    a4 = a(e(c4, i4, z3));
                }
                i6.put(i5, a4);
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(@androidx.annotation.N Typeface typeface) {
        try {
            return f12473e.getLong(typeface);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        if (f12473e != null) {
            return true;
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j4, int i4, boolean z3) {
        int i5;
        if (z3) {
            i5 = 2;
        } else {
            i5 = 0;
        }
        try {
            return ((Long) f12475g.invoke(null, Long.valueOf(((Long) f12474f.invoke(null, Long.valueOf(j4), Integer.valueOf(i5))).longValue()), Integer.valueOf(i4))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long f(long j4, int i4) {
        try {
            return ((Long) f12475g.invoke(null, Long.valueOf(j4), Integer.valueOf(i4))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }
}

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
@androidx.annotation.W(26)
/* loaded from: classes.dex */
final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12479a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12480b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12481c = "nativeCreateFromTypefaceWithExactStyle";

    /* renamed from: d, reason: collision with root package name */
    private static final Field f12482d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f12483e;

    /* renamed from: f, reason: collision with root package name */
    private static final Constructor<Typeface> f12484f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.B("sWeightCacheLock")
    private static final androidx.collection.h<SparseArray<Typeface>> f12485g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f12486h;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        try {
            field = Typeface.class.getDeclaredField(f12480b);
            Class cls = Long.TYPE;
            method = Typeface.class.getDeclaredMethod(f12481c, cls, Integer.TYPE, Boolean.TYPE);
            method.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e4) {
            Log.e(f12479a, e4.getClass().getName(), e4);
            field = null;
            constructor = null;
            method = null;
        }
        f12482d = field;
        f12483e = method;
        f12484f = constructor;
        f12485g = new androidx.collection.h<>(3);
        f12486h = new Object();
    }

    private d0() {
    }

    @androidx.annotation.P
    private static Typeface a(long j4) {
        try {
            return f12484f.newInstance(Long.valueOf(j4));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static Typeface b(@androidx.annotation.N Typeface typeface, int i4, boolean z3) {
        if (!d()) {
            return null;
        }
        int i5 = (i4 << 1) | (z3 ? 1 : 0);
        synchronized (f12486h) {
            try {
                long c4 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f12485g;
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
                Typeface a4 = a(e(c4, i4, z3));
                i6.put(i5, a4);
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long c(@androidx.annotation.N Typeface typeface) {
        try {
            return f12482d.getLong(typeface);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        if (f12482d != null) {
            return true;
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long e(long j4, int i4, boolean z3) {
        try {
            return ((Long) f12483e.invoke(null, Long.valueOf(j4), Integer.valueOf(i4), Boolean.valueOf(z3))).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }
}

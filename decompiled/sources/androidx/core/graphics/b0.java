package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.f;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12464a = "WeightTypeface";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12465b = "native_instance";

    /* renamed from: c, reason: collision with root package name */
    private static final Field f12466c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.B("sWeightCacheLock")
    private static final androidx.collection.h<SparseArray<Typeface>> f12467d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f12468e;

    static {
        Field field;
        try {
            field = Typeface.class.getDeclaredField(f12465b);
            field.setAccessible(true);
        } catch (Exception e4) {
            Log.e(f12464a, e4.getClass().getName(), e4);
            field = null;
        }
        f12466c = field;
        f12467d = new androidx.collection.h<>(3);
        f12468e = new Object();
    }

    private b0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static Typeface a(@androidx.annotation.N Z z3, @androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z4) {
        if (!d()) {
            return null;
        }
        int i5 = (i4 << 1) | (z4 ? 1 : 0);
        synchronized (f12468e) {
            try {
                long c4 = c(typeface);
                androidx.collection.h<SparseArray<Typeface>> hVar = f12467d;
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
                Typeface b4 = b(z3, context, typeface, i4, z4);
                if (b4 == null) {
                    b4 = e(typeface, i4, z4);
                }
                i6.put(i5, b4);
                return b4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.P
    private static Typeface b(@androidx.annotation.N Z z3, @androidx.annotation.N Context context, @androidx.annotation.N Typeface typeface, int i4, boolean z4) {
        f.d m4 = z3.m(typeface);
        if (m4 == null) {
            return null;
        }
        return z3.c(context, m4, context.getResources(), i4, z4);
    }

    private static long c(@androidx.annotation.N Typeface typeface) {
        try {
            return ((Number) f12466c.get(typeface)).longValue();
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static boolean d() {
        if (f12466c != null) {
            return true;
        }
        return false;
    }

    private static Typeface e(Typeface typeface, int i4, boolean z3) {
        boolean z4;
        int i5 = 0;
        if (i4 >= 600) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || z3) {
            if (!z4) {
                i5 = 2;
            } else if (!z3) {
                i5 = 1;
            } else {
                i5 = 3;
            }
        }
        return Typeface.create(typeface, i5);
    }
}

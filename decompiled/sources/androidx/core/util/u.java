package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class u {
    private u() {
    }

    public static void a(boolean z3) {
        if (z3) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3, @N Object obj) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z3, @N String str, @N Object... objArr) {
        if (z3) {
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f4, @N String str) {
        if (!Float.isNaN(f4)) {
            if (!Float.isInfinite(f4)) {
                return f4;
            }
            throw new IllegalArgumentException(str + " must not be infinite");
        }
        throw new IllegalArgumentException(str + " must not be NaN");
    }

    public static double e(double d4, double d5, double d6, @N String str) {
        if (d4 >= d5) {
            if (d4 <= d6) {
                return d4;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d5), Double.valueOf(d6)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d5), Double.valueOf(d6)));
    }

    public static float f(float f4, float f5, float f6, @N String str) {
        if (f4 >= f5) {
            if (f4 <= f6) {
                return f4;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f5), Float.valueOf(f6)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f5), Float.valueOf(f6)));
    }

    public static int g(int i4, int i5, int i6, @N String str) {
        if (i4 >= i5) {
            if (i4 <= i6) {
                return i4;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    public static long h(long j4, long j5, long j6, @N String str) {
        if (j4 >= j5) {
            if (j4 <= j6) {
                return j4;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j5), Long.valueOf(j6)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j5), Long.valueOf(j6)));
    }

    @androidx.annotation.F(from = 0)
    public static int i(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    @androidx.annotation.F(from = 0)
    public static int j(int i4, @P String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    @N
    public static <T> T l(@P T t3) {
        t3.getClass();
        return t3;
    }

    @N
    public static <T> T m(@P T t3, @N Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z3) {
        o(z3, null);
    }

    public static void o(boolean z3, @P String str) {
        if (z3) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    @N
    public static <T extends CharSequence> T p(@P T t3) {
        if (!TextUtils.isEmpty(t3)) {
            return t3;
        }
        throw new IllegalArgumentException();
    }

    @N
    public static <T extends CharSequence> T q(@P T t3, @N Object obj) {
        if (!TextUtils.isEmpty(t3)) {
            return t3;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @N
    public static <T extends CharSequence> T r(@P T t3, @N String str, @N Object... objArr) {
        if (!TextUtils.isEmpty(t3)) {
            return t3;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}

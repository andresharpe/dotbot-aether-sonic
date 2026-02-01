package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.N;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static final String f18592a = "Trace";

    /* renamed from: b, reason: collision with root package name */
    private static long f18593b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f18594c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f18595d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f18596e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f18597f;

    private c() {
    }

    @SuppressLint({"NewApi"})
    public static void a(@N String str, int i4) {
        try {
            if (f18595d == null) {
                e.a(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i4);
    }

    private static void b(@N String str, int i4) {
        try {
            if (f18595d == null) {
                f18595d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f18595d.invoke(null, Long.valueOf(f18593b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceBegin", e4);
        }
    }

    public static void c(@N String str) {
        d.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@N String str, int i4) {
        try {
            if (f18596e == null) {
                e.b(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i4);
    }

    private static void e(@N String str, int i4) {
        try {
            if (f18596e == null) {
                f18596e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f18596e.invoke(null, Long.valueOf(f18593b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceEnd", e4);
        }
    }

    public static void f() {
        d.b();
    }

    private static void g(@N String str, @N Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v(f18592a, "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        boolean isEnabled;
        try {
            if (f18594c == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f18594c == null) {
                f18593b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f18594c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f18594c.invoke(null, Long.valueOf(f18593b))).booleanValue();
        } catch (Exception e4) {
            g("isTagEnabled", e4);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@N String str, int i4) {
        try {
            if (f18597f == null) {
                e.c(str, i4);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i4);
    }

    private static void k(@N String str, int i4) {
        try {
            if (f18597f == null) {
                f18597f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f18597f.invoke(null, Long.valueOf(f18593b), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("traceCounter", e4);
        }
    }
}

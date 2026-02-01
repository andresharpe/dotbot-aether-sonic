package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12722a = "TraceCompat";

    /* renamed from: b, reason: collision with root package name */
    private static long f12723b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f12724c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f12725d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f12726e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f12727f;

    @W(18)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(String str) {
            Trace.beginSection(str);
        }

        @InterfaceC0577u
        static void b() {
            Trace.endSection();
        }
    }

    @W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(String str, int i4) {
            Trace.beginAsyncSection(str, i4);
        }

        @InterfaceC0577u
        static void b(String str, int i4) {
            Trace.endAsyncSection(str, i4);
        }

        @InterfaceC0577u
        static boolean c() {
            return Trace.isEnabled();
        }

        @InterfaceC0577u
        static void d(String str, long j4) {
            Trace.setCounter(str, j4);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f12723b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f12724c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f12725d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f12726e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f12727f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i(f12722a, "Unable to initialize via reflection.", e4);
            }
        }
    }

    private L() {
    }

    public static void a(@androidx.annotation.N String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i4);
            return;
        }
        try {
            f12725d.invoke(null, Long.valueOf(f12723b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f12722a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(@androidx.annotation.N String str) {
        a.a(str);
    }

    public static void c(@androidx.annotation.N String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i4);
            return;
        }
        try {
            f12726e.invoke(null, Long.valueOf(f12723b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f12722a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        a.b();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) f12724c.invoke(null, Long.valueOf(f12723b))).booleanValue();
        } catch (Exception unused) {
            Log.v(f12722a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(@androidx.annotation.N String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i4);
            return;
        }
        try {
            f12727f.invoke(null, Long.valueOf(f12723b), str, Integer.valueOf(i4));
        } catch (Exception unused) {
            Log.v(f12722a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}

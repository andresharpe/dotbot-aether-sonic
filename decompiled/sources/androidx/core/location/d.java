package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12623a = "mockLocation";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12624b = "verticalAccuracy";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12625c = "speedAccuracy";

    /* renamed from: d, reason: collision with root package name */
    public static final String f12626d = "bearingAccuracy";

    /* renamed from: e, reason: collision with root package name */
    public static final String f12627e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f12628f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* renamed from: g, reason: collision with root package name */
    @P
    private static Method f12629g;

    @W(17)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        @InterfaceC0577u
        static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    @W(18)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @InterfaceC0577u
        static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    private static class c {
        private c() {
        }

        @InterfaceC0577u
        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @InterfaceC0577u
        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @InterfaceC0577u
        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @InterfaceC0577u
        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @InterfaceC0577u
        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @InterfaceC0577u
        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @InterfaceC0577u
        static void g(Location location, float f4) {
            location.setBearingAccuracyDegrees(f4);
        }

        @InterfaceC0577u
        static void h(Location location, float f4) {
            location.setSpeedAccuracyMetersPerSecond(f4);
        }

        @InterfaceC0577u
        static void i(Location location, float f4) {
            location.setVerticalAccuracyMeters(f4);
        }
    }

    private d() {
    }

    private static boolean a(@N Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey(str)) {
            return true;
        }
        return false;
    }

    public static float b(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f12626d, 0.0f);
    }

    public static long c(@N Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long d(@N Location location) {
        return a.a(location);
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n)
    public static float e(@N Location location) {
        androidx.core.util.u.o(m(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return g(location).getFloat(f12628f);
    }

    public static double f(@N Location location) {
        androidx.core.util.u.o(l(location), "The Mean Sea Level altitude of the location is not set.");
        return g(location).getDouble(f12627e);
    }

    private static Bundle g(@N Location location) {
        Bundle extras = location.getExtras();
        if (extras == null) {
            location.setExtras(new Bundle());
            return location.getExtras();
        }
        return extras;
    }

    private static Method h() throws NoSuchMethodException {
        if (f12629g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f12629g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f12629g;
    }

    public static float i(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f12625c, 0.0f);
    }

    public static float j(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static boolean k(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.d(location);
        }
        return a(location, f12626d);
    }

    public static boolean l(@N Location location) {
        return a(location, f12627e);
    }

    public static boolean m(@N Location location) {
        return a(location, f12628f);
    }

    public static boolean n(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.e(location);
        }
        return a(location, f12625c);
    }

    public static boolean o(@N Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.f(location);
        }
        return a(location, "verticalAccuracy");
    }

    public static boolean p(@N Location location) {
        return b.a(location);
    }

    private static void q(@N Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void r(@N Location location) {
        q(location, f12627e);
    }

    public static void s(@N Location location) {
        q(location, f12628f);
    }

    public static void t(@N Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.g(location, f4);
        } else {
            g(location).putFloat(f12626d, f4);
        }
    }

    public static void u(@N Location location, boolean z3) {
        try {
            h().invoke(location, Boolean.valueOf(z3));
        } catch (IllegalAccessException e4) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e4);
            throw illegalAccessError;
        } catch (NoSuchMethodException e5) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e5);
            throw noSuchMethodError;
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void v(@N Location location, @InterfaceC0580x(from = 0.0d) float f4) {
        g(location).putFloat(f12628f, f4);
    }

    public static void w(@N Location location, double d4) {
        g(location).putDouble(f12627e, d4);
    }

    public static void x(@N Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.h(location, f4);
        } else {
            g(location).putFloat(f12625c, f4);
        }
    }

    public static void y(@N Location location, float f4) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.i(location, f4);
        } else {
            g(location).putFloat("verticalAccuracy", f4);
        }
    }
}

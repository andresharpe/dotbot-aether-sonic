package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851u {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13652a = 3840;

    /* renamed from: b, reason: collision with root package name */
    private static final int f13653b = 2160;

    @androidx.annotation.W(17)
    /* renamed from: androidx.core.view.u$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(23)
    /* renamed from: androidx.core.view.u$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @androidx.annotation.N
        static c a(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
            Display.Mode mode = display.getMode();
            Point a4 = C0851u.a(context, display);
            if (a4 != null && !d(mode, a4)) {
                return new c(mode, a4);
            }
            return new c(mode, true);
        }

        @androidx.annotation.N
        @SuppressLint({"ArrayReturn"})
        public static c[] b(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
            c cVar;
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a4 = C0851u.a(context, display);
            if (a4 != null && !d(mode, a4)) {
                for (int i4 = 0; i4 < supportedModes.length; i4++) {
                    if (e(supportedModes[i4], mode)) {
                        cVar = new c(supportedModes[i4], a4);
                    } else {
                        cVar = new c(supportedModes[i4], false);
                    }
                    cVarArr[i4] = cVar;
                }
            } else {
                for (int i5 = 0; i5 < supportedModes.length; i5++) {
                    cVarArr[i5] = new c(supportedModes[i5], e(supportedModes[i5], mode));
                }
            }
            return cVarArr;
        }

        static boolean c(@androidx.annotation.N Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean d(Display.Mode mode, Point point) {
            if ((mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x)) {
                return true;
            }
            return false;
        }

        static boolean e(Display.Mode mode, Display.Mode mode2) {
            if (mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight()) {
                return true;
            }
            return false;
        }
    }

    private C0851u() {
    }

    static Point a(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
        Point j4;
        if (Build.VERSION.SDK_INT < 28) {
            j4 = j("sys.display-size", display);
        } else {
            j4 = j("vendor.display-size", display);
        }
        if (j4 != null) {
            return j4;
        }
        if (!g(context) || !f(display)) {
            return null;
        }
        return new Point(f13652a, f13653b);
    }

    @androidx.annotation.N
    private static Point b(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
        Point a4 = a(context, display);
        if (a4 != null) {
            return a4;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @androidx.annotation.N
    public static c c(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
        return b.a(context, display);
    }

    @androidx.annotation.N
    @SuppressLint({"ArrayReturn"})
    public static c[] d(@androidx.annotation.N Context context, @androidx.annotation.N Display display) {
        return b.b(context, display);
    }

    @androidx.annotation.P
    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean f(@androidx.annotation.N Display display) {
        return b.c(display);
    }

    private static boolean g(@androidx.annotation.N Context context) {
        if (h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
            return true;
        }
        return false;
    }

    private static boolean h(@androidx.annotation.N Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    private static Point i(@androidx.annotation.N String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @androidx.annotation.P
    private static Point j(@androidx.annotation.N String str, @androidx.annotation.N Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e4 = e(str);
        if (!TextUtils.isEmpty(e4) && e4 != null) {
            try {
                return i(e4);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: androidx.core.view.u$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Display.Mode f13654a;

        /* renamed from: b, reason: collision with root package name */
        private final Point f13655b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f13656c;

        @androidx.annotation.W(23)
        /* renamed from: androidx.core.view.u$c$a */
        /* loaded from: classes.dex */
        static class a {
            private a() {
            }

            @InterfaceC0577u
            static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @InterfaceC0577u
            static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        c(@androidx.annotation.N Point point) {
            androidx.core.util.u.m(point, "physicalSize == null");
            this.f13655b = point;
            this.f13654a = null;
            this.f13656c = true;
        }

        public int a() {
            return this.f13655b.y;
        }

        public int b() {
            return this.f13655b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f13656c;
        }

        @androidx.annotation.P
        @androidx.annotation.W(23)
        public Display.Mode d() {
            return this.f13654a;
        }

        @androidx.annotation.W(23)
        c(@androidx.annotation.N Display.Mode mode, boolean z3) {
            androidx.core.util.u.m(mode, "mode == null, can't wrap a null reference");
            this.f13655b = new Point(a.b(mode), a.a(mode));
            this.f13654a = mode;
            this.f13656c = z3;
        }

        @androidx.annotation.W(23)
        c(@androidx.annotation.N Display.Mode mode, @androidx.annotation.N Point point) {
            androidx.core.util.u.m(mode, "mode == null, can't wrap a null reference");
            androidx.core.util.u.m(point, "physicalSize == null");
            this.f13655b = point;
            this.f13654a = mode;
            this.f13656c = true;
        }
    }
}

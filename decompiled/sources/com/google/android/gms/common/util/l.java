package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1290k;

@I0.a
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @P
    private static Boolean f28997a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private static Boolean f28998b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private static Boolean f28999c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private static Boolean f29000d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private static Boolean f29001e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private static Boolean f29002f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private static Boolean f29003g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private static Boolean f29004h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private static Boolean f29005i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private static Boolean f29006j;

    /* renamed from: k, reason: collision with root package name */
    @P
    private static Boolean f29007k;

    /* renamed from: l, reason: collision with root package name */
    @P
    private static Boolean f29008l;

    private l() {
    }

    @I0.a
    public static boolean a(@N Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f29005i == null) {
            boolean z3 = false;
            if (v.n() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z3 = true;
            }
            f29005i = Boolean.valueOf(z3);
        }
        return f29005i.booleanValue();
    }

    @I0.a
    public static boolean b(@N Context context) {
        if (f29008l == null) {
            boolean z3 = false;
            if (v.q() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z3 = true;
            }
            f29008l = Boolean.valueOf(z3);
        }
        return f29008l.booleanValue();
    }

    @I0.a
    public static boolean c(@N Context context) {
        if (f29002f == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z3 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z3 = true;
            }
            f29002f = Boolean.valueOf(z3);
        }
        return f29002f.booleanValue();
    }

    @I0.a
    public static boolean d(@N Context context) {
        if (f28997a == null) {
            boolean z3 = false;
            if (!g(context) && !k(context) && !n(context)) {
                if (f29004h == null) {
                    f29004h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!f29004h.booleanValue() && !a(context) && !i(context)) {
                    if (f29007k == null) {
                        f29007k = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!f29007k.booleanValue() && !b(context)) {
                        z3 = true;
                    }
                }
            }
            f28997a = Boolean.valueOf(z3);
        }
        return f28997a.booleanValue();
    }

    @I0.a
    public static boolean e(@N Context context) {
        return o(context.getResources());
    }

    @I0.a
    @TargetApi(21)
    public static boolean f(@N Context context) {
        return m(context);
    }

    @I0.a
    public static boolean g(@N Context context) {
        return h(context.getResources());
    }

    @I0.a
    public static boolean h(@N Resources resources) {
        boolean z3 = false;
        if (resources == null) {
            return false;
        }
        if (f28998b == null) {
            if ((resources.getConfiguration().screenLayout & 15) > 3 || o(resources)) {
                z3 = true;
            }
            f28998b = Boolean.valueOf(z3);
        }
        return f28998b.booleanValue();
    }

    @I0.a
    public static boolean i(@N Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f29006j == null) {
            boolean z3 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z3 = false;
            }
            f29006j = Boolean.valueOf(z3);
        }
        return f29006j.booleanValue();
    }

    @I0.a
    public static boolean j() {
        int i4 = C1290k.f28840a;
        return "user".equals(Build.TYPE);
    }

    @I0.a
    @TargetApi(20)
    public static boolean k(@N Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f29000d == null) {
            boolean z3 = false;
            if (v.i() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z3 = true;
            }
            f29000d = Boolean.valueOf(z3);
        }
        return f29000d.booleanValue();
    }

    @I0.a
    @TargetApi(26)
    public static boolean l(@N Context context) {
        if (!k(context) || v.m()) {
            if (m(context)) {
                if (!v.n() || v.q()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static boolean m(@N Context context) {
        if (f29001e == null) {
            boolean z3 = false;
            if (v.j() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z3 = true;
            }
            f29001e = Boolean.valueOf(z3);
        }
        return f29001e.booleanValue();
    }

    public static boolean n(@N Context context) {
        if (f29003g == null) {
            boolean z3 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z3 = false;
            }
            f29003g = Boolean.valueOf(z3);
        }
        return f29003g.booleanValue();
    }

    public static boolean o(@N Resources resources) {
        boolean z3 = false;
        if (resources == null) {
            return false;
        }
        if (f28999c == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z3 = true;
            }
            f28999c = Boolean.valueOf(z3);
        }
        return f28999c.booleanValue();
    }
}

package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.i0;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: g, reason: collision with root package name */
    private static final String f26398g = "HardwareConfig";

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f26399h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f26400i;

    /* renamed from: j, reason: collision with root package name */
    @i0
    static final int f26401j = 128;

    /* renamed from: k, reason: collision with root package name */
    private static final int f26402k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final File f26403l;

    /* renamed from: m, reason: collision with root package name */
    private static final int f26404m = 50;

    /* renamed from: n, reason: collision with root package name */
    private static final int f26405n = 700;

    /* renamed from: o, reason: collision with root package name */
    private static final int f26406o = 20000;

    /* renamed from: p, reason: collision with root package name */
    public static final int f26407p = -1;

    /* renamed from: q, reason: collision with root package name */
    private static volatile A f26408q;

    /* renamed from: r, reason: collision with root package name */
    private static volatile int f26409r;

    /* renamed from: b, reason: collision with root package name */
    private final int f26411b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26412c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.B("this")
    private int f26413d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.B("this")
    private boolean f26414e = true;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f26415f = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26410a = h();

    static {
        boolean z3;
        int i4 = Build.VERSION.SDK_INT;
        boolean z4 = true;
        if (i4 < 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        f26399h = z3;
        if (i4 < 26) {
            z4 = false;
        }
        f26400i = z4;
        f26403l = new File("/proc/self/fd");
        f26409r = -1;
    }

    @i0
    A() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26411b = 20000;
            this.f26412c = 0;
        } else {
            this.f26411b = 700;
            this.f26412c = 128;
        }
    }

    private boolean b() {
        if (f26399h && !this.f26415f.get()) {
            return true;
        }
        return false;
    }

    public static A d() {
        if (f26408q == null) {
            synchronized (A.class) {
                try {
                    if (f26408q == null) {
                        f26408q = new A();
                    }
                } finally {
                }
            }
        }
        return f26408q;
    }

    private int e() {
        if (f26409r != -1) {
            return f26409r;
        }
        return this.f26411b;
    }

    private synchronized boolean f() {
        try {
            boolean z3 = true;
            int i4 = this.f26413d + 1;
            this.f26413d = i4;
            if (i4 >= 50) {
                this.f26413d = 0;
                int length = f26403l.list().length;
                long e4 = e();
                if (length >= e4) {
                    z3 = false;
                }
                this.f26414e = z3;
                if (!z3 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + e4);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26414e;
    }

    private static boolean h() {
        if (!i() && !j()) {
            return true;
        }
        return false;
    }

    private static boolean i() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    public boolean a() {
        com.bumptech.glide.util.n.b();
        return !this.f26415f.get();
    }

    public void c() {
        com.bumptech.glide.util.n.b();
        this.f26415f.set(false);
    }

    public boolean g(int i4, int i5, boolean z3, boolean z4) {
        if (!z3) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.f26410a) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!f26400i) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (b()) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z4) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        int i6 = this.f26412c;
        if (i4 < i6) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (i5 < i6) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed because height is too small");
            }
            return false;
        }
        if (!f()) {
            if (Log.isLoggable(f26398g, 2)) {
                Log.v(f26398g, "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean k(int i4, int i5, BitmapFactory.Options options, boolean z3, boolean z4) {
        Bitmap.Config config;
        boolean g4 = g(i4, i5, z3, z4);
        if (g4) {
            config = Bitmap.Config.HARDWARE;
            options.inPreferredConfig = config;
            options.inMutable = false;
        }
        return g4;
    }

    public void l() {
        com.bumptech.glide.util.n.b();
        this.f26415f.set(true);
    }
}

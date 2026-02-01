package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static final String f25979e = "MemorySizeCalculator";

    /* renamed from: f, reason: collision with root package name */
    @i0
    static final int f25980f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f25981g = 2;

    /* renamed from: a, reason: collision with root package name */
    private final int f25982a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25983b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f25984c;

    /* renamed from: d, reason: collision with root package name */
    private final int f25985d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @i0
        static final int f25986i = 2;

        /* renamed from: j, reason: collision with root package name */
        static final int f25987j;

        /* renamed from: k, reason: collision with root package name */
        static final float f25988k = 0.4f;

        /* renamed from: l, reason: collision with root package name */
        static final float f25989l = 0.33f;

        /* renamed from: m, reason: collision with root package name */
        static final int f25990m = 4194304;

        /* renamed from: a, reason: collision with root package name */
        final Context f25991a;

        /* renamed from: b, reason: collision with root package name */
        ActivityManager f25992b;

        /* renamed from: c, reason: collision with root package name */
        c f25993c;

        /* renamed from: e, reason: collision with root package name */
        float f25995e;

        /* renamed from: d, reason: collision with root package name */
        float f25994d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        float f25996f = f25988k;

        /* renamed from: g, reason: collision with root package name */
        float f25997g = f25989l;

        /* renamed from: h, reason: collision with root package name */
        int f25998h = 4194304;

        static {
            int i4;
            if (Build.VERSION.SDK_INT < 26) {
                i4 = 4;
            } else {
                i4 = 1;
            }
            f25987j = i4;
        }

        public a(Context context) {
            this.f25995e = f25987j;
            this.f25991a = context;
            this.f25992b = (ActivityManager) context.getSystemService("activity");
            this.f25993c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && l.e(this.f25992b)) {
                this.f25995e = 0.0f;
            }
        }

        public l a() {
            return new l(this);
        }

        @i0
        a b(ActivityManager activityManager) {
            this.f25992b = activityManager;
            return this;
        }

        public a c(int i4) {
            this.f25998h = i4;
            return this;
        }

        public a d(float f4) {
            boolean z3;
            if (f4 >= 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.bumptech.glide.util.l.a(z3, "Bitmap pool screens must be greater than or equal to 0");
            this.f25995e = f4;
            return this;
        }

        public a e(float f4) {
            boolean z3;
            if (f4 >= 0.0f && f4 <= 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.bumptech.glide.util.l.a(z3, "Low memory max size multiplier must be between 0 and 1");
            this.f25997g = f4;
            return this;
        }

        public a f(float f4) {
            boolean z3;
            if (f4 >= 0.0f && f4 <= 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.bumptech.glide.util.l.a(z3, "Size multiplier must be between 0 and 1");
            this.f25996f = f4;
            return this;
        }

        public a g(float f4) {
            boolean z3;
            if (f4 >= 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.bumptech.glide.util.l.a(z3, "Memory cache screens must be greater than or equal to 0");
            this.f25994d = f4;
            return this;
        }

        @i0
        a h(c cVar) {
            this.f25993c = cVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f25999a;

        b(DisplayMetrics displayMetrics) {
            this.f25999a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int a() {
            return this.f25999a.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.l.c
        public int b() {
            return this.f25999a.widthPixels;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        int a();

        int b();
    }

    l(a aVar) {
        int i4;
        boolean z3;
        this.f25984c = aVar.f25991a;
        if (e(aVar.f25992b)) {
            i4 = aVar.f25998h / 2;
        } else {
            i4 = aVar.f25998h;
        }
        this.f25985d = i4;
        int c4 = c(aVar.f25992b, aVar.f25996f, aVar.f25997g);
        float b4 = aVar.f25993c.b() * aVar.f25993c.a() * 4;
        int round = Math.round(aVar.f25995e * b4);
        int round2 = Math.round(b4 * aVar.f25994d);
        int i5 = c4 - i4;
        int i6 = round2 + round;
        if (i6 <= i5) {
            this.f25983b = round2;
            this.f25982a = round;
        } else {
            float f4 = i5;
            float f5 = aVar.f25995e;
            float f6 = aVar.f25994d;
            float f7 = f4 / (f5 + f6);
            this.f25983b = Math.round(f6 * f7);
            this.f25982a = Math.round(f7 * aVar.f25995e);
        }
        if (Log.isLoggable(f25979e, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f25983b));
            sb.append(", pool size: ");
            sb.append(f(this.f25982a));
            sb.append(", byte array size: ");
            sb.append(f(i4));
            sb.append(", memory class limited? ");
            if (i6 > c4) {
                z3 = true;
            } else {
                z3 = false;
            }
            sb.append(z3);
            sb.append(", max size: ");
            sb.append(f(c4));
            sb.append(", memoryClass: ");
            sb.append(aVar.f25992b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f25992b));
            Log.d(f25979e, sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f4, float f5) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f4 = f5;
        }
        return Math.round(memoryClass * f4);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i4) {
        return Formatter.formatFileSize(this.f25984c, i4);
    }

    public int a() {
        return this.f25985d;
    }

    public int b() {
        return this.f25982a;
    }

    public int d() {
        return this.f25983b;
    }
}

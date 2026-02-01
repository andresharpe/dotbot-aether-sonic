package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.os.L;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21417a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final String f21418b = "LOTTIE";

    /* renamed from: c, reason: collision with root package name */
    private static final int f21419c = 20;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f21420d = false;

    /* renamed from: e, reason: collision with root package name */
    private static String[] f21421e;

    /* renamed from: f, reason: collision with root package name */
    private static long[] f21422f;

    /* renamed from: g, reason: collision with root package name */
    private static int f21423g;

    /* renamed from: h, reason: collision with root package name */
    private static int f21424h;

    /* renamed from: i, reason: collision with root package name */
    private static com.airbnb.lottie.network.e f21425i;

    /* renamed from: j, reason: collision with root package name */
    private static com.airbnb.lottie.network.d f21426j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.g f21427k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile com.airbnb.lottie.network.f f21428l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements com.airbnb.lottie.network.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21429a;

        a(Context context) {
            this.f21429a = context;
        }

        @Override // com.airbnb.lottie.network.d
        @N
        public File a() {
            return new File(this.f21429a.getCacheDir(), "lottie_network_cache");
        }
    }

    private e() {
    }

    public static void a(String str) {
        if (!f21420d) {
            return;
        }
        int i4 = f21423g;
        if (i4 == 20) {
            f21424h++;
            return;
        }
        f21421e[i4] = str;
        f21422f[i4] = System.nanoTime();
        L.b(str);
        f21423g++;
    }

    public static float b(String str) {
        int i4 = f21424h;
        if (i4 > 0) {
            f21424h = i4 - 1;
            return 0.0f;
        }
        if (!f21420d) {
            return 0.0f;
        }
        int i5 = f21423g - 1;
        f21423g = i5;
        if (i5 != -1) {
            if (str.equals(f21421e[i5])) {
                L.d();
                return ((float) (System.nanoTime() - f21422f[f21423g])) / 1000000.0f;
            }
            throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f21421e[f21423g] + ".");
        }
        throw new IllegalStateException("Can't end trace section. There are none.");
    }

    @N
    public static com.airbnb.lottie.network.f c(@N Context context) {
        Context applicationContext = context.getApplicationContext();
        com.airbnb.lottie.network.f fVar = f21428l;
        if (fVar == null) {
            synchronized (com.airbnb.lottie.network.f.class) {
                try {
                    fVar = f21428l;
                    if (fVar == null) {
                        com.airbnb.lottie.network.d dVar = f21426j;
                        if (dVar == null) {
                            dVar = new a(applicationContext);
                        }
                        fVar = new com.airbnb.lottie.network.f(dVar);
                        f21428l = fVar;
                    }
                } finally {
                }
            }
        }
        return fVar;
    }

    @N
    public static com.airbnb.lottie.network.g d(@N Context context) {
        com.airbnb.lottie.network.g gVar = f21427k;
        if (gVar == null) {
            synchronized (com.airbnb.lottie.network.g.class) {
                try {
                    gVar = f21427k;
                    if (gVar == null) {
                        com.airbnb.lottie.network.f c4 = c(context);
                        com.airbnb.lottie.network.e eVar = f21425i;
                        if (eVar == null) {
                            eVar = new com.airbnb.lottie.network.b();
                        }
                        gVar = new com.airbnb.lottie.network.g(c4, eVar);
                        f21427k = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    public static void e(com.airbnb.lottie.network.d dVar) {
        f21426j = dVar;
    }

    public static void f(com.airbnb.lottie.network.e eVar) {
        f21425i = eVar;
    }

    public static void g(boolean z3) {
        if (f21420d == z3) {
            return;
        }
        f21420d = z3;
        if (z3) {
            f21421e = new String[20];
            f21422f = new long[20];
        }
    }
}

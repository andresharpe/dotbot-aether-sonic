package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int f26961a = 31;

    /* renamed from: b, reason: collision with root package name */
    private static final int f26962b = 17;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f26963c = "0123456789abcdef".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f26964d = new char[64];

    /* renamed from: e, reason: collision with root package name */
    @P
    private static volatile Handler f26965e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26966a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f26966a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26966a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26966a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f26966a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26966a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private n() {
    }

    public static void a() {
        if (t()) {
        } else {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (u()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@P Object obj, @P Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        if (obj instanceof com.bumptech.glide.load.model.l) {
            return ((com.bumptech.glide.load.model.l) obj).a(obj2);
        }
        return obj.equals(obj2);
    }

    public static boolean d(@P Object obj, @P Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @N
    private static String e(@N byte[] bArr, @N char[] cArr) {
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f26963c;
            cArr[i5] = cArr2[(b4 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    @N
    public static <T> Queue<T> f(int i4) {
        return new ArrayDeque(i4);
    }

    public static int g(int i4, int i5, @P Bitmap.Config config) {
        return i4 * i5 * i(config);
    }

    @TargetApi(19)
    public static int h(@N Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int i(@P Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = a.f26966a[config.ordinal()];
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2 || i4 == 3) {
            return 2;
        }
        if (i4 != 4) {
            return 4;
        }
        return 8;
    }

    @Deprecated
    public static int j(@N Bitmap bitmap) {
        return h(bitmap);
    }

    @N
    public static <T> List<T> k(@N Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t3 : collection) {
            if (t3 != null) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (f26965e == null) {
            synchronized (n.class) {
                try {
                    if (f26965e == null) {
                        f26965e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f26965e;
    }

    public static int m(float f4) {
        return n(f4, 17);
    }

    public static int n(float f4, int i4) {
        return p(Float.floatToIntBits(f4), i4);
    }

    public static int o(int i4) {
        return p(i4, 17);
    }

    public static int p(int i4, int i5) {
        return (i5 * 31) + i4;
    }

    public static int q(@P Object obj, int i4) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return p(hashCode, i4);
    }

    public static int r(boolean z3) {
        return s(z3, 17);
    }

    public static int s(boolean z3, int i4) {
        return p(z3 ? 1 : 0, i4);
    }

    public static boolean t() {
        return !u();
    }

    public static boolean u() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    private static boolean v(int i4) {
        return i4 > 0 || i4 == Integer.MIN_VALUE;
    }

    public static boolean w(int i4, int i5) {
        if (v(i4) && v(i5)) {
            return true;
        }
        return false;
    }

    public static void x(Runnable runnable) {
        l().post(runnable);
    }

    public static void y(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @N
    public static String z(@N byte[] bArr) {
        String e4;
        char[] cArr = f26964d;
        synchronized (cArr) {
            e4 = e(bArr, cArr);
        }
        return e4;
    }
}

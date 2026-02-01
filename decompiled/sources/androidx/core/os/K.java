package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.UserHandle;
import androidx.annotation.W;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class K {

    @W(16)
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f12716a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Method f12717b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f12718c;

        private a() {
        }

        @SuppressLint({"PrivateApi"})
        static boolean a(int i4) {
            try {
                synchronized (f12716a) {
                    try {
                        if (!f12718c) {
                            f12718c = true;
                            f12717b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f12717b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i4));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    @W(17)
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Object f12719a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private static Method f12720b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f12721c;

        private b() {
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        static boolean a(int i4) {
            try {
                synchronized (f12719a) {
                    try {
                        if (!f12721c) {
                            f12721c = true;
                            f12720b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                        }
                    } finally {
                    }
                }
                Method method = f12720b;
                if (method != null) {
                    Boolean bool = (Boolean) method.invoke(null, Integer.valueOf(i4));
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                    throw new NullPointerException();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return true;
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        static boolean a(int i4) {
            return Process.isApplicationUid(i4);
        }
    }

    private K() {
    }

    public static boolean a(int i4) {
        return c.a(i4);
    }
}

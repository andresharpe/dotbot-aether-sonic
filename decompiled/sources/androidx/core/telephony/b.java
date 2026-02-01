package androidx.core.telephony;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.Y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f12854a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f12855b;

    @W(23)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        @P
        @Y("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @InterfaceC0577u
        static String a(TelephonyManager telephonyManager, int i4) {
            return telephonyManager.getDeviceId(i4);
        }
    }

    @W(26)
    /* renamed from: androidx.core.telephony.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0098b {
        private C0098b() {
        }

        @P
        @Y("android.permission.READ_PHONE_STATE")
        @SuppressLint({"MissingPermission"})
        @InterfaceC0577u
        static String a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(30)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static int a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private b() {
    }

    @P
    @Y("android.permission.READ_PHONE_STATE")
    @SuppressLint({"MissingPermission"})
    public static String a(@N TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0098b.a(telephonyManager);
        }
        int b4 = b(telephonyManager);
        if (b4 != Integer.MAX_VALUE && b4 != -1) {
            return a.a(telephonyManager, androidx.core.telephony.a.a(b4));
        }
        return telephonyManager.getDeviceId();
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static int b(@N TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c.a(telephonyManager);
        }
        try {
            if (f12855b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", new Class[0]);
                f12855b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f12855b.invoke(telephonyManager, new Object[0]);
            if (num != null && num.intValue() != -1) {
                return num.intValue();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}

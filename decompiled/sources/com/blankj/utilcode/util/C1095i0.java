package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* renamed from: com.blankj.utilcode.util.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095i0 {
    private C1095i0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.Y("android.permission.CALL_PHONE")
    public static void a(@androidx.annotation.N String str) {
        E0.a().startActivity(H0.M(str));
    }

    public static void b(@androidx.annotation.N String str) {
        E0.a().startActivity(H0.O(str));
    }

    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String c() {
        String imei;
        String meid;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            return "";
        }
        TelephonyManager n4 = n();
        String deviceId = n4.getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        if (i4 >= 26) {
            imei = n4.getImei();
            if (TextUtils.isEmpty(imei)) {
                meid = n4.getMeid();
                if (TextUtils.isEmpty(meid)) {
                    return "";
                }
                return meid;
            }
            return imei;
        }
        return "";
    }

    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    public static String d() {
        return f(true);
    }

    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String e() {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                n().getSubscriberId();
            } catch (SecurityException e4) {
                e4.printStackTrace();
                return "";
            }
        }
        return n().getSubscriberId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r1.length() < 15) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
    
        if (r1.length() == 14) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(boolean r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            java.lang.String r2 = ""
            if (r0 < r1) goto L9
            return r2
        L9:
            android.telephony.TelephonyManager r1 = n()
            r3 = 26
            r4 = 1
            r5 = 0
            if (r0 < r3) goto L2f
            if (r10 == 0) goto L22
            java.lang.String r10 = com.blankj.utilcode.util.C1091g0.a(r1, r5)
            java.lang.String r0 = com.blankj.utilcode.util.C1091g0.a(r1, r4)
            java.lang.String r10 = h(r10, r0)
            return r10
        L22:
            java.lang.String r10 = com.blankj.utilcode.util.C1093h0.a(r1, r5)
            java.lang.String r0 = com.blankj.utilcode.util.C1093h0.a(r1, r4)
            java.lang.String r10 = h(r10, r0)
            return r10
        L2f:
            if (r10 == 0) goto L34
            java.lang.String r0 = "ril.gsm.imei"
            goto L36
        L34:
            java.lang.String r0 = "ril.cdma.meid"
        L36:
            java.lang.String r0 = m(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r6 = 2
            if (r3 != 0) goto L56
            java.lang.String r10 = ","
            java.lang.String[] r10 = r0.split(r10)
            int r0 = r10.length
            if (r0 != r6) goto L53
            r0 = r10[r5]
            r10 = r10[r4]
            java.lang.String r10 = h(r0, r10)
            return r10
        L53:
            r10 = r10[r5]
            return r10
        L56:
            java.lang.String r0 = r1.getDeviceId()
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r7 = "getDeviceId"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            r8[r5] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.reflect.Method r3 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            if (r10 == 0) goto L6f
            goto L70
        L6f:
            r4 = r6
        L70:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            r7[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object r1 = r3.invoke(r1, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            goto L8f
        L7d:
            r1 = move-exception
            goto L83
        L7f:
            r1 = move-exception
            goto L87
        L81:
            r1 = move-exception
            goto L8b
        L83:
            r1.printStackTrace()
            goto L8e
        L87:
            r1.printStackTrace()
            goto L8e
        L8b:
            r1.printStackTrace()
        L8e:
            r1 = r2
        L8f:
            if (r10 == 0) goto La7
            r10 = 15
            if (r0 == 0) goto L9c
            int r3 = r0.length()
            if (r3 >= r10) goto L9c
            r0 = r2
        L9c:
            if (r1 == 0) goto La5
            int r3 = r1.length()
            if (r3 >= r10) goto La5
            goto Lba
        La5:
            r2 = r1
            goto Lba
        La7:
            r10 = 14
            if (r0 == 0) goto Lb2
            int r3 = r0.length()
            if (r3 != r10) goto Lb2
            r0 = r2
        Lb2:
            if (r1 == 0) goto La5
            int r3 = r1.length()
            if (r3 != r10) goto La5
        Lba:
            java.lang.String r10 = h(r0, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.C1095i0.f(boolean):java.lang.String");
    }

    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    public static String g() {
        return f(false);
    }

    private static String h(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return "";
        }
        if (!isEmpty && !isEmpty2) {
            if (str.compareTo(str2) <= 0) {
                return str;
            }
            return str2;
        }
        if (!isEmpty) {
            return str;
        }
        return str2;
    }

    public static int i() {
        return n().getPhoneType();
    }

    @androidx.annotation.Y("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String j() {
        String serial;
        String serial2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            try {
                serial = Build.getSerial();
                return serial;
            } catch (SecurityException e4) {
                e4.printStackTrace();
                return "";
            }
        }
        if (i4 >= 26) {
            serial2 = Build.getSerial();
            return serial2;
        }
        return Build.SERIAL;
    }

    public static String k() {
        String simOperator = n().getSimOperator();
        if (simOperator == null) {
            return "";
        }
        char c4 = 65535;
        switch (simOperator.hashCode()) {
            case 49679470:
                if (simOperator.equals("46000")) {
                    c4 = 0;
                    break;
                }
                break;
            case 49679471:
                if (simOperator.equals("46001")) {
                    c4 = 1;
                    break;
                }
                break;
            case 49679472:
                if (simOperator.equals("46002")) {
                    c4 = 2;
                    break;
                }
                break;
            case 49679473:
                if (simOperator.equals("46003")) {
                    c4 = 3;
                    break;
                }
                break;
            case 49679475:
                if (simOperator.equals("46005")) {
                    c4 = 4;
                    break;
                }
                break;
            case 49679476:
                if (simOperator.equals("46006")) {
                    c4 = 5;
                    break;
                }
                break;
            case 49679477:
                if (simOperator.equals("46007")) {
                    c4 = 6;
                    break;
                }
                break;
            case 49679479:
                if (simOperator.equals("46009")) {
                    c4 = 7;
                    break;
                }
                break;
            case 49679502:
                if (simOperator.equals("46011")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 49679532:
                if (simOperator.equals("46020")) {
                    c4 = '\t';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
            case 2:
            case 6:
            case '\t':
                return "中国移动";
            case 1:
            case 5:
            case 7:
                return "中国联通";
            case 3:
            case 4:
            case '\b':
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String l() {
        return n().getSimOperatorName();
    }

    private static String m(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static TelephonyManager n() {
        return (TelephonyManager) E0.a().getSystemService("phone");
    }

    public static boolean o() {
        if (n().getPhoneType() != 0) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        if (n().getSimState() == 5) {
            return true;
        }
        return false;
    }

    public static void q(@androidx.annotation.N String str, String str2) {
        E0.a().startActivity(H0.c0(str, str2));
    }
}

package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.blankj.utilcode.util.t0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24739a = "KEY_UDID";

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f24740b;

    private C() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.INTERNET", "android.permission.CHANGE_WIFI_STATE"})
    public static boolean A(String str) {
        if (TextUtils.isEmpty(str) && str.length() < 33) {
            return false;
        }
        if (str.equals(f24740b) || str.equals(H0.d0().r(f24739a, null))) {
            return true;
        }
        int length = str.length();
        int i4 = length - 33;
        int i5 = length - 32;
        String substring = str.substring(i4, i5);
        if (substring.startsWith("1")) {
            String d4 = d();
            if (d4.equals("")) {
                return false;
            }
            return str.substring(i5).equals(n("", d4));
        }
        if (!substring.startsWith("2")) {
            return false;
        }
        String b4 = b();
        if (TextUtils.isEmpty(b4)) {
            return false;
        }
        return str.substring(i5).equals(n("", b4));
    }

    public static boolean B() {
        if ((Resources.getSystem().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    private static String C() {
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), "utf-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    return sb.toString().toLowerCase();
                }
            }
        } catch (IOException unused) {
            return "";
        }
    }

    private static String D(String str, String str2) {
        f24740b = n(str, str2);
        H0.d0().B(f24739a, f24740b);
        return f24740b;
    }

    @androidx.annotation.Y("android.permission.CHANGE_WIFI_STATE")
    private static void E(boolean z3) {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null || z3 == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z3);
    }

    public static String[] a() {
        return Build.SUPPORTED_ABIS;
    }

    @SuppressLint({"HardwareIds"})
    public static String b() {
        String string = Settings.Secure.getString(E0.a().getContentResolver(), "android_id");
        if ("9774d56d682e549c".equals(string) || string == null) {
            return "";
        }
        return string;
    }

    private static InetAddress c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && nextElement2.getHostAddress().indexOf(58) < 0) {
                            return nextElement2;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"})
    public static String d() {
        String e4 = e(null);
        if (TextUtils.isEmpty(e4) && !t()) {
            E(true);
            E(false);
            return e(null);
        }
        return e4;
    }

    @androidx.annotation.Y(allOf = {"android.permission.ACCESS_WIFI_STATE"})
    public static String e(String... strArr) {
        String h4 = h();
        if (v(h4, strArr)) {
            return h4;
        }
        String g4 = g();
        if (v(g4, strArr)) {
            return g4;
        }
        String i4 = i();
        if (v(i4, strArr)) {
            return i4;
        }
        String f4 = f();
        if (v(f4, strArr)) {
            return f4;
        }
        return "";
    }

    private static String f() {
        String str;
        String str2;
        t0.b B3 = H0.B("getprop wifi.interface", false);
        if (B3.f25181a == 0 && (str = B3.f25182b) != null) {
            t0.b B4 = H0.B("cat /sys/class/net/" + str + "/address", false);
            if (B4.f25181a == 0 && (str2 = B4.f25182b) != null && str2.length() > 0) {
                return str2;
            }
            return "02:00:00:00:00:00";
        }
        return "02:00:00:00:00:00";
    }

    private static String g() {
        NetworkInterface byInetAddress;
        byte[] hardwareAddress;
        try {
            InetAddress c4 = c();
            if (c4 != null && (byInetAddress = NetworkInterface.getByInetAddress(c4)) != null && (hardwareAddress = byInetAddress.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (byte b4 : hardwareAddress) {
                    sb.append(String.format("%02x:", Byte.valueOf(b4)));
                }
                return sb.substring(0, sb.length() - 1);
            }
            return "02:00:00:00:00:00";
        } catch (Exception e4) {
            e4.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String h() {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null && nextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = nextElement.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b4 : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b4)));
                    }
                    return sb.substring(0, sb.length() - 1);
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e4) {
            e4.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    @androidx.annotation.Y("android.permission.ACCESS_WIFI_STATE")
    private static String i() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) E0.a().getApplicationContext().getSystemService("wifi");
            if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                String macAddress = connectionInfo.getMacAddress();
                if (!TextUtils.isEmpty(macAddress)) {
                    return macAddress;
                }
                return "02:00:00:00:00:00";
            }
            return "02:00:00:00:00:00";
        } catch (Exception e4) {
            e4.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    public static String j() {
        return Build.MANUFACTURER;
    }

    public static String k() {
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        return str.trim().replaceAll("\\s*", "");
    }

    public static int l() {
        return Build.VERSION.SDK_INT;
    }

    public static String m() {
        return Build.VERSION.RELEASE;
    }

    private static String n(String str, String str2) {
        if (str2.equals("")) {
            return str + UUID.randomUUID().toString().replace("-", "");
        }
        return str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace("-", "");
    }

    public static String o() {
        return q("", true);
    }

    public static String p(String str) {
        return q(str, true);
    }

    public static String q(String str, boolean z3) {
        if (!z3) {
            return s(str);
        }
        if (f24740b == null) {
            synchronized (C.class) {
                try {
                    if (f24740b == null) {
                        String r4 = H0.d0().r(f24739a, null);
                        if (r4 != null) {
                            f24740b = r4;
                            return f24740b;
                        }
                        return s(str);
                    }
                } finally {
                }
            }
        }
        return f24740b;
    }

    public static String r(boolean z3) {
        return q("", z3);
    }

    private static String s(String str) {
        try {
            String b4 = b();
            if (!TextUtils.isEmpty(b4)) {
                return D(str + 2, b4);
            }
        } catch (Exception unused) {
        }
        return D(str + 9, "");
    }

    private static boolean t() {
        WifiManager wifiManager = (WifiManager) E0.a().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    @androidx.annotation.W(api = 17)
    public static boolean u() {
        if (Settings.Secure.getInt(E0.a().getContentResolver(), "adb_enabled", 0) <= 0) {
            return false;
        }
        return true;
    }

    private static boolean v(String str, String... strArr) {
        if (TextUtils.isEmpty(str) || "02:00:00:00:00:00".equals(str)) {
            return false;
        }
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (str2 != null && str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @androidx.annotation.W(api = 17)
    public static boolean w() {
        if (Settings.Global.getInt(E0.a().getContentResolver(), "development_settings_enabled", 0) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean x() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/", "/system/sbin/", "/usr/bin/", "/vendor/bin/"};
        for (int i4 = 0; i4 < 11; i4++) {
            if (new File(strArr[i4] + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean y() {
        String str;
        String str2 = Build.FINGERPRINT;
        if (!str2.startsWith("generic") && !str2.toLowerCase().contains("vbox") && !str2.toLowerCase().contains("test-keys")) {
            String str3 = Build.MODEL;
            if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                TelephonyManager telephonyManager = (TelephonyManager) E0.a().getSystemService("phone");
                if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                    str = "";
                }
                if (str.toLowerCase().equals("android")) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setData(Uri.parse("tel:123456"));
                intent.setAction("android.intent.action.DIAL");
                if (intent.resolveActivity(E0.a().getPackageManager()) == null || z()) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    private static boolean z() {
        String C3 = C();
        if (!C3.contains("intel") && !C3.contains("amd")) {
            return false;
        }
        return true;
    }
}

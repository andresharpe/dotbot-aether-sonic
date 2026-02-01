package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.blankj.utilcode.util.E0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092h {

    /* renamed from: com.blankj.utilcode.util.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25015a;

        /* renamed from: b, reason: collision with root package name */
        private String f25016b;

        /* renamed from: c, reason: collision with root package name */
        private Drawable f25017c;

        /* renamed from: d, reason: collision with root package name */
        private String f25018d;

        /* renamed from: e, reason: collision with root package name */
        private String f25019e;

        /* renamed from: f, reason: collision with root package name */
        private int f25020f;

        /* renamed from: g, reason: collision with root package name */
        private int f25021g;

        /* renamed from: h, reason: collision with root package name */
        private int f25022h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f25023i;

        public a(String str, String str2, Drawable drawable, String str3, String str4, int i4, int i5, int i6, boolean z3) {
            l(str2);
            j(drawable);
            m(str);
            n(str3);
            r(str4);
            q(i4);
            k(i5);
            p(i6);
            o(z3);
        }

        public Drawable a() {
            return this.f25017c;
        }

        public int b() {
            return this.f25021g;
        }

        public String c() {
            return this.f25016b;
        }

        public String d() {
            return this.f25015a;
        }

        public String e() {
            return this.f25018d;
        }

        public int f() {
            return this.f25022h;
        }

        public int g() {
            return this.f25020f;
        }

        public String h() {
            return this.f25019e;
        }

        public boolean i() {
            return this.f25023i;
        }

        public void j(Drawable drawable) {
            this.f25017c = drawable;
        }

        public void k(int i4) {
            this.f25021g = i4;
        }

        public void l(String str) {
            this.f25016b = str;
        }

        public void m(String str) {
            this.f25015a = str;
        }

        public void n(String str) {
            this.f25018d = str;
        }

        public void o(boolean z3) {
            this.f25023i = z3;
        }

        public void p(int i4) {
            this.f25022h = i4;
        }

        public void q(int i4) {
            this.f25020f = i4;
        }

        public void r(String str) {
            this.f25019e = str;
        }

        @androidx.annotation.N
        public String toString() {
            return "{\n    pkg name: " + d() + "\n    app icon: " + a() + "\n    app name: " + c() + "\n    app path: " + e() + "\n    app v name: " + h() + "\n    app v code: " + g() + "\n    app v min: " + b() + "\n    app v target: " + f() + "\n    is system: " + i() + "\n}";
        }
    }

    private C1092h() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int A() {
        return B(E0.a().getPackageName());
    }

    public static int B(String str) {
        ApplicationInfo applicationInfo;
        if (H0.D0(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                return applicationInfo.targetSdkVersion;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int C() {
        return D(E0.a().getPackageName());
    }

    public static int D(String str) {
        try {
            return E0.a().getPackageManager().getApplicationInfo(str, 0).uid;
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int E() {
        return F(E0.a().getPackageName());
    }

    public static int F(String str) {
        if (H0.D0(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    @androidx.annotation.N
    public static String G() {
        return H(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static String H(String str) {
        if (H0.D0(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return "";
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @androidx.annotation.N
    public static List<a> I() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = E0.a().getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            a J3 = J(packageManager, it.next());
            if (J3 != null) {
                arrayList.add(J3);
            }
        }
        return arrayList;
    }

    private static a J(PackageManager packageManager, PackageInfo packageInfo) {
        boolean z3;
        if (packageInfo == null) {
            return null;
        }
        String str = packageInfo.versionName;
        int i4 = packageInfo.versionCode;
        String str2 = packageInfo.packageName;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return new a(str2, "", null, "", str, i4, -1, -1, false);
        }
        String charSequence = applicationInfo.loadLabel(packageManager).toString();
        Drawable loadIcon = applicationInfo.loadIcon(packageManager);
        String str3 = applicationInfo.sourceDir;
        int i5 = applicationInfo.minSdkVersion;
        int i6 = applicationInfo.targetSdkVersion;
        if ((applicationInfo.flags & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new a(str2, charSequence, loadIcon, str3, str, i4, i5, i6, z3);
    }

    public static void K(Uri uri) {
        Intent V3 = H0.V(uri);
        if (V3 == null) {
            return;
        }
        E0.a().startActivity(V3);
    }

    public static void L(File file) {
        Intent W3 = H0.W(file);
        if (W3 == null) {
            return;
        }
        E0.a().startActivity(W3);
    }

    public static void M(String str) {
        L(H0.P(str));
    }

    public static boolean N() {
        return O(E0.a().getPackageName());
    }

    public static boolean O(String str) {
        if (H0.D0(str)) {
            return false;
        }
        try {
            if ((E0.a().getPackageManager().getApplicationInfo(str, 0).flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean P() {
        return H0.r0();
    }

    public static boolean Q(@androidx.annotation.N String str) {
        if (!H0.D0(str) && str.equals(H0.Q())) {
            return true;
        }
        return false;
    }

    public static boolean R(String str) {
        if (H0.D0(str)) {
            return false;
        }
        try {
            return E0.a().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean S() {
        if (H0.B("echo root", true).f25181a == 0) {
            return true;
        }
        return false;
    }

    public static boolean T(String str) {
        ActivityManager activityManager;
        ComponentName componentName;
        ComponentName componentName2;
        if (!H0.D0(str) && (activityManager = (ActivityManager) E0.a().getSystemService("activity")) != null) {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE);
            if (runningTasks != null && runningTasks.size() > 0) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    componentName = runningTaskInfo.baseActivity;
                    if (componentName != null) {
                        componentName2 = runningTaskInfo.baseActivity;
                        if (str.equals(componentName2.getPackageName())) {
                            return true;
                        }
                    }
                }
            }
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() > 0) {
                Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().service.getPackageName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean U() {
        return V(E0.a().getPackageName());
    }

    public static boolean V(String str) {
        if (H0.D0(str)) {
            return false;
        }
        try {
            if ((E0.a().getPackageManager().getApplicationInfo(str, 0).flags & 1) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static boolean W() {
        try {
            if (E0.a().getPackageManager().getPackageInfo(n(), 0).firstInstallTime == E0.a().getPackageManager().getPackageInfo(n(), 0).lastUpdateTime) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean X() {
        try {
            if (E0.a().getPackageManager().getPackageInfo(n(), 0).firstInstallTime != E0.a().getPackageManager().getPackageInfo(n(), 0).lastUpdateTime) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean Y() {
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(E0.a().getPackageName(), 0);
            if (packageInfo.firstInstallTime == packageInfo.lastUpdateTime) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return true;
        }
    }

    public static void Z(String str) {
        if (H0.D0(str)) {
            return;
        }
        Intent Y3 = H0.Y(str);
        if (Y3 == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
        } else {
            E0.a().startActivity(Y3);
        }
    }

    public static void a() {
        H0.D();
        System.exit(0);
    }

    public static void a0() {
        d0(E0.a().getPackageName());
    }

    @androidx.annotation.P
    public static a b(File file) {
        if (file != null && file.isFile() && file.exists()) {
            return c(file.getAbsolutePath());
        }
        return null;
    }

    public static void b0(Activity activity, int i4) {
        c0(activity, i4, E0.a().getPackageName());
    }

    @androidx.annotation.P
    public static a c(String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (H0.D0(str) || (packageManager = E0.a().getPackageManager()) == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0)) == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        return J(packageManager, packageArchiveInfo);
    }

    public static void c0(Activity activity, int i4, String str) {
        if (activity != null && !H0.D0(str)) {
            Intent X3 = H0.X(str, false);
            if (!H0.x0(X3)) {
                return;
            }
            activity.startActivityForResult(X3, i4);
        }
    }

    @androidx.annotation.P
    public static Drawable d() {
        return e(E0.a().getPackageName());
    }

    public static void d0(String str) {
        if (H0.D0(str)) {
            return;
        }
        Intent X3 = H0.X(str, true);
        if (!H0.x0(X3)) {
            return;
        }
        E0.a().startActivity(X3);
    }

    @androidx.annotation.P
    public static Drawable e(String str) {
        if (H0.D0(str)) {
            return null;
        }
        try {
            PackageManager packageManager = E0.a().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static void e0(@androidx.annotation.N E0.d dVar) {
        H0.c(dVar);
    }

    public static int f() {
        return g(E0.a().getPackageName());
    }

    public static void f0() {
        g0(false);
    }

    public static int g(String str) {
        if (H0.D0(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public static void g0(boolean z3) {
        Intent Y3 = H0.Y(E0.a().getPackageName());
        if (Y3 == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
            return;
        }
        Y3.addFlags(335577088);
        E0.a().startActivity(Y3);
        if (!z3) {
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    @androidx.annotation.P
    public static a h() {
        return i(E0.a().getPackageName());
    }

    public static void h0(String str) {
        if (H0.D0(str)) {
            return;
        }
        E0.a().startActivity(H0.i0(str));
    }

    @androidx.annotation.P
    public static a i(String str) {
        try {
            PackageManager packageManager = E0.a().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return J(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static void i0(@androidx.annotation.N E0.d dVar) {
        H0.U0(dVar);
    }

    public static int j() {
        return k(E0.a().getPackageName());
    }

    public static int k(String str) {
        ApplicationInfo applicationInfo;
        if (H0.D0(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
                return applicationInfo.minSdkVersion;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    @androidx.annotation.N
    public static String l() {
        return m(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static String m(String str) {
        if (H0.D0(str)) {
            return "";
        }
        try {
            PackageManager packageManager = E0.a().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return "";
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @androidx.annotation.N
    public static String n() {
        return E0.a().getPackageName();
    }

    @androidx.annotation.N
    public static String o() {
        return p(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static String p(String str) {
        if (H0.D0(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = E0.a().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return "";
            }
            return packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    @androidx.annotation.P
    public static Signature[] q() {
        return s(E0.a().getPackageName());
    }

    @androidx.annotation.P
    public static Signature[] r(File file) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        if (file == null) {
            return null;
        }
        PackageManager packageManager = E0.a().getPackageManager();
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 134217728);
            if (packageArchiveInfo == null) {
                return null;
            }
            signingInfo = packageArchiveInfo.signingInfo;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
                return apkContentsSigners;
            }
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }
        PackageInfo packageArchiveInfo2 = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 64);
        if (packageArchiveInfo2 == null) {
            return null;
        }
        return packageArchiveInfo2.signatures;
    }

    @androidx.annotation.P
    public static Signature[] s(String str) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        if (H0.D0(str)) {
            return null;
        }
        try {
            PackageManager packageManager = E0.a().getPackageManager();
            if (Build.VERSION.SDK_INT >= 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
                if (packageInfo != null) {
                    signingInfo = packageInfo.signingInfo;
                    hasMultipleSigners = signingInfo.hasMultipleSigners();
                    if (hasMultipleSigners) {
                        apkContentsSigners = signingInfo.getApkContentsSigners();
                        return apkContentsSigners;
                    }
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    return signingCertificateHistory;
                }
                return null;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            if (packageInfo2 == null) {
                return null;
            }
            return packageInfo2.signatures;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static List<String> t(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (H0.D0(str)) {
            return arrayList;
        }
        Signature[] s4 = s(str);
        if (s4 != null && s4.length > 0) {
            for (Signature signature : s4) {
                arrayList.add(H0.l(H0.j0(signature.toByteArray(), str2)).replaceAll("(?<=[0-9A-F]{2})[0-9A-F]{2}", ":$0"));
            }
        }
        return arrayList;
    }

    @androidx.annotation.N
    public static List<String> u() {
        return v(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static List<String> v(String str) {
        return t(str, "MD5");
    }

    @androidx.annotation.N
    public static List<String> w() {
        return x(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static List<String> x(String str) {
        return t(str, "SHA1");
    }

    @androidx.annotation.N
    public static List<String> y() {
        return z(E0.a().getPackageName());
    }

    @androidx.annotation.N
    public static List<String> z(String str) {
        return t(str, "SHA256");
    }
}

package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* renamed from: com.blankj.utilcode.util.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1103m0 {

    /* renamed from: A, reason: collision with root package name */
    private static final String f25031A = "ro.build.MiFavor_version";

    /* renamed from: B, reason: collision with root package name */
    private static final String f25032B = "ro.rom.version";

    /* renamed from: C, reason: collision with root package name */
    private static final String f25033C = "ro.build.rom.id";

    /* renamed from: D, reason: collision with root package name */
    private static final String f25034D = "unknown";

    /* renamed from: u, reason: collision with root package name */
    private static final String f25056u = "ro.build.version.emui";

    /* renamed from: v, reason: collision with root package name */
    private static final String f25057v = "ro.vivo.os.build.display.id";

    /* renamed from: w, reason: collision with root package name */
    private static final String f25058w = "ro.build.version.incremental";

    /* renamed from: x, reason: collision with root package name */
    private static final String f25059x = "ro.build.version.opporom";

    /* renamed from: y, reason: collision with root package name */
    private static final String f25060y = "ro.letv.release.version";

    /* renamed from: z, reason: collision with root package name */
    private static final String f25061z = "ro.build.uiversion";

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f25036a = {"huawei"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f25037b = {"vivo"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f25038c = {"xiaomi"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f25039d = {"oppo"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f25040e = {"leeco", "letv"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f25041f = {"360", "qiku"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f25042g = {"zte"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f25043h = {"oneplus"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f25044i = {"nubia"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f25045j = {"coolpad", "yulong"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f25046k = {"lg", "lge"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f25047l = {"google"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f25048m = {"samsung"};

    /* renamed from: n, reason: collision with root package name */
    private static final String[] f25049n = {"meizu"};

    /* renamed from: o, reason: collision with root package name */
    private static final String[] f25050o = {"lenovo"};

    /* renamed from: p, reason: collision with root package name */
    private static final String[] f25051p = {"smartisan", "deltainno"};

    /* renamed from: q, reason: collision with root package name */
    private static final String[] f25052q = {"htc"};

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f25053r = {"sony"};

    /* renamed from: s, reason: collision with root package name */
    private static final String[] f25054s = {"gionee", "amigo"};

    /* renamed from: t, reason: collision with root package name */
    private static final String[] f25055t = {"motorola"};

    /* renamed from: E, reason: collision with root package name */
    private static a f25035E = null;

    /* renamed from: com.blankj.utilcode.util.m0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25062a;

        /* renamed from: b, reason: collision with root package name */
        private String f25063b;

        public String d() {
            return this.f25062a;
        }

        public String e() {
            return this.f25063b;
        }

        public String toString() {
            return "RomInfo{name=" + this.f25062a + ", version=" + this.f25063b + "}";
        }
    }

    private C1103m0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean A() {
        return f25037b[0].equals(c().f25062a);
    }

    public static boolean B() {
        return f25038c[0].equals(c().f25062a);
    }

    public static boolean C() {
        return f25042g[0].equals(c().f25062a);
    }

    private static String a() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private static String b() {
        try {
            String str = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str)) {
                return str.toLowerCase();
            }
            return "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static a c() {
        a aVar = f25035E;
        if (aVar != null) {
            return aVar;
        }
        f25035E = new a();
        String a4 = a();
        String b4 = b();
        String[] strArr = f25036a;
        if (w(a4, b4, strArr)) {
            f25035E.f25062a = strArr[0];
            String d4 = d(f25056u);
            String[] split = d4.split("_");
            if (split.length <= 1) {
                f25035E.f25063b = d4;
            } else {
                f25035E.f25063b = split[1];
            }
            return f25035E;
        }
        String[] strArr2 = f25037b;
        if (w(a4, b4, strArr2)) {
            f25035E.f25062a = strArr2[0];
            f25035E.f25063b = d(f25057v);
            return f25035E;
        }
        String[] strArr3 = f25038c;
        if (w(a4, b4, strArr3)) {
            f25035E.f25062a = strArr3[0];
            f25035E.f25063b = d(f25058w);
            return f25035E;
        }
        String[] strArr4 = f25039d;
        if (w(a4, b4, strArr4)) {
            f25035E.f25062a = strArr4[0];
            f25035E.f25063b = d(f25059x);
            return f25035E;
        }
        String[] strArr5 = f25040e;
        if (w(a4, b4, strArr5)) {
            f25035E.f25062a = strArr5[0];
            f25035E.f25063b = d(f25060y);
            return f25035E;
        }
        String[] strArr6 = f25041f;
        if (w(a4, b4, strArr6)) {
            f25035E.f25062a = strArr6[0];
            f25035E.f25063b = d(f25061z);
            return f25035E;
        }
        String[] strArr7 = f25042g;
        if (w(a4, b4, strArr7)) {
            f25035E.f25062a = strArr7[0];
            f25035E.f25063b = d(f25031A);
            return f25035E;
        }
        String[] strArr8 = f25043h;
        if (w(a4, b4, strArr8)) {
            f25035E.f25062a = strArr8[0];
            f25035E.f25063b = d(f25032B);
            return f25035E;
        }
        String[] strArr9 = f25044i;
        if (w(a4, b4, strArr9)) {
            f25035E.f25062a = strArr9[0];
            f25035E.f25063b = d(f25033C);
            return f25035E;
        }
        String[] strArr10 = f25045j;
        if (w(a4, b4, strArr10)) {
            f25035E.f25062a = strArr10[0];
        } else {
            String[] strArr11 = f25046k;
            if (w(a4, b4, strArr11)) {
                f25035E.f25062a = strArr11[0];
            } else {
                String[] strArr12 = f25047l;
                if (w(a4, b4, strArr12)) {
                    f25035E.f25062a = strArr12[0];
                } else {
                    String[] strArr13 = f25048m;
                    if (w(a4, b4, strArr13)) {
                        f25035E.f25062a = strArr13[0];
                    } else {
                        String[] strArr14 = f25049n;
                        if (w(a4, b4, strArr14)) {
                            f25035E.f25062a = strArr14[0];
                        } else {
                            String[] strArr15 = f25050o;
                            if (w(a4, b4, strArr15)) {
                                f25035E.f25062a = strArr15[0];
                            } else {
                                String[] strArr16 = f25051p;
                                if (w(a4, b4, strArr16)) {
                                    f25035E.f25062a = strArr16[0];
                                } else {
                                    String[] strArr17 = f25052q;
                                    if (w(a4, b4, strArr17)) {
                                        f25035E.f25062a = strArr17[0];
                                    } else {
                                        String[] strArr18 = f25053r;
                                        if (w(a4, b4, strArr18)) {
                                            f25035E.f25062a = strArr18[0];
                                        } else {
                                            String[] strArr19 = f25054s;
                                            if (w(a4, b4, strArr19)) {
                                                f25035E.f25062a = strArr19[0];
                                            } else {
                                                String[] strArr20 = f25055t;
                                                if (!w(a4, b4, strArr20)) {
                                                    f25035E.f25062a = b4;
                                                } else {
                                                    f25035E.f25062a = strArr20[0];
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        f25035E.f25063b = d("");
        return f25035E;
    }

    private static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = e(str);
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2) || str2.equals("unknown")) {
            try {
                String str3 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return "unknown";
        }
        return str2;
    }

    private static String e(String str) {
        String g4 = g(str);
        if (!TextUtils.isEmpty(g4)) {
            return g4;
        }
        String h4 = h(str);
        if (!TextUtils.isEmpty(h4)) {
            return h4;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return f(str);
        }
        return h4;
    }

    private static String f(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            } catch (IOException unused) {
                return "";
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
                return "";
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    private static String h(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean i() {
        return f25041f[0].equals(c().f25062a);
    }

    public static boolean j() {
        return f25045j[0].equals(c().f25062a);
    }

    public static boolean k() {
        return f25054s[0].equals(c().f25062a);
    }

    public static boolean l() {
        return f25047l[0].equals(c().f25062a);
    }

    public static boolean m() {
        return f25052q[0].equals(c().f25062a);
    }

    public static boolean n() {
        return f25036a[0].equals(c().f25062a);
    }

    public static boolean o() {
        return f25040e[0].equals(c().f25062a);
    }

    public static boolean p() {
        return f25050o[0].equals(c().f25062a);
    }

    public static boolean q() {
        return f25046k[0].equals(c().f25062a);
    }

    public static boolean r() {
        return f25049n[0].equals(c().f25062a);
    }

    public static boolean s() {
        return f25055t[0].equals(c().f25062a);
    }

    public static boolean t() {
        return f25044i[0].equals(c().f25062a);
    }

    public static boolean u() {
        return f25043h[0].equals(c().f25062a);
    }

    public static boolean v() {
        return f25039d[0].equals(c().f25062a);
    }

    private static boolean w(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean x() {
        return f25048m[0].equals(c().f25062a);
    }

    public static boolean y() {
        return f25051p[0].equals(c().f25062a);
    }

    public static boolean z() {
        return f25053r[0].equals(c().f25062a);
    }
}

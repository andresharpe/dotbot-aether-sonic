package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24254a = 128;

    /* renamed from: b, reason: collision with root package name */
    private static volatile String f24255b = "2.16.13";

    /* renamed from: c, reason: collision with root package name */
    private static volatile String f24256c = "android";

    /* renamed from: d, reason: collision with root package name */
    private static volatile String f24257d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.amazonaws.logging.c f24258e = LogFactory.c(B.class);

    public static String a() {
        return f24256c;
    }

    public static String b() {
        if (f24257d == null) {
            synchronized (B.class) {
                try {
                    if (f24257d == null) {
                        d();
                    }
                } finally {
                }
            }
        }
        return f24257d;
    }

    public static String c() {
        return f24255b;
    }

    private static void d() {
        f24257d = f();
    }

    private static String e(String str) {
        return str.replace(' ', '_');
    }

    static String f() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("aws-sdk-");
        sb.append(w.n(a()));
        sb.append("/");
        sb.append(c());
        sb.append(" ");
        sb.append(e(System.getProperty("os.name")));
        sb.append("/");
        sb.append(e(System.getProperty("os.version")));
        sb.append(" ");
        sb.append(e(System.getProperty("java.vm.name")));
        sb.append("/");
        sb.append(e(System.getProperty("java.vm.version")));
        sb.append("/");
        sb.append(e(System.getProperty("java.version")));
        String property = System.getProperty("user.language");
        String property2 = System.getProperty("user.region");
        if (property != null && property2 != null) {
            sb.append(" ");
            sb.append(e(property));
            sb.append("_");
            sb.append(e(property2));
        }
        return sb.toString();
    }
}

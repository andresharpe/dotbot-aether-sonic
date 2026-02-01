package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: com.google.firebase.crashlytics.internal.common.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1799g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f35047a = "SHA-1";

    /* renamed from: b, reason: collision with root package name */
    private static final String f35048b = "goldfish";

    /* renamed from: c, reason: collision with root package name */
    private static final String f35049c = "ranchu";

    /* renamed from: d, reason: collision with root package name */
    private static final String f35050d = "sdk";

    /* renamed from: e, reason: collision with root package name */
    public static final String f35051e = "com.google.firebase.crashlytics";

    /* renamed from: f, reason: collision with root package name */
    public static final String f35052f = "com.crashlytics.prefs";

    /* renamed from: h, reason: collision with root package name */
    static final String f35054h = "com.google.firebase.crashlytics.mapping_file_id";

    /* renamed from: i, reason: collision with root package name */
    static final String f35055i = "com.crashlytics.android.build_id";

    /* renamed from: j, reason: collision with root package name */
    private static final String f35056j = "com.google.firebase.crashlytics.unity_version";

    /* renamed from: k, reason: collision with root package name */
    private static final long f35057k = -1;

    /* renamed from: l, reason: collision with root package name */
    static final int f35058l = 1073741824;

    /* renamed from: m, reason: collision with root package name */
    static final int f35059m = 1048576;

    /* renamed from: n, reason: collision with root package name */
    static final int f35060n = 1024;

    /* renamed from: p, reason: collision with root package name */
    public static final int f35062p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f35063q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f35064r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f35065s = 8;

    /* renamed from: t, reason: collision with root package name */
    public static final int f35066t = 16;

    /* renamed from: u, reason: collision with root package name */
    public static final int f35067u = 32;

    /* renamed from: g, reason: collision with root package name */
    private static final char[] f35053g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: o, reason: collision with root package name */
    private static long f35061o = -1;

    /* renamed from: com.google.firebase.crashlytics.internal.common.g$a */
    /* loaded from: classes2.dex */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map<String, a> matcher;

        static {
            a aVar = X86_32;
            a aVar2 = ARMV6;
            a aVar3 = ARMV7;
            a aVar4 = ARM64;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        static a b() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                com.google.firebase.crashlytics.internal.f.f().k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            if (aVar == null) {
                return UNKNOWN;
            }
            return aVar;
        }
    }

    public static boolean A(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (!Build.PRODUCT.contains(f35050d)) {
            String str = Build.HARDWARE;
            if (!str.contains(f35048b) && !str.contains(f35049c) && string != null) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public static boolean B(Context context) {
        return false;
    }

    public static boolean C(Context context) {
        boolean A3 = A(context);
        String str = Build.TAGS;
        if ((!A3 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!A3 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String D(int i4) {
        if (i4 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i4)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String E(Context context) {
        int r4 = r(context, f35056j, v.b.f7403e);
        if (r4 != 0) {
            String string = context.getResources().getString(r4);
            com.google.firebase.crashlytics.internal.f.f().k("Unity Editor version is: " + string);
            return string;
        }
        return null;
    }

    public static String F(String str) {
        return v(str, f35047a);
    }

    public static String G(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long b(String str) {
        long blockSize = new StatFs(str).getBlockSize();
        return (r0.getBlockCount() * blockSize) - (blockSize * r0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean c(Context context) {
        if (!d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e4) {
                com.google.firebase.crashlytics.internal.f.f().e(str, e4);
            }
        }
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    static long g(String str, String str2, int i4) {
        return Long.parseLong(str.split(str2)[0].trim()) * i4;
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        if (sb2.length() <= 0) {
            return null;
        }
        return F(sb2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r2 = r3[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L60
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r3 == 0) goto L3b
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            int r4 = r3.length     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            boolean r4 = r4.equals(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            if (r4 == 0) goto L15
            r2 = r3[r5]     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L3b
        L36:
            r6 = move-exception
            r2 = r1
            goto L5c
        L39:
            r7 = move-exception
            goto L43
        L3b:
            e(r1, r0)
            goto L60
        L3f:
            r6 = move-exception
            goto L5c
        L41:
            r7 = move-exception
            r1 = r2
        L43:
            com.google.firebase.crashlytics.internal.f r3 = com.google.firebase.crashlytics.internal.f.f()     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r4.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch: java.lang.Throwable -> L36
            r4.append(r6)     // Catch: java.lang.Throwable -> L36
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L36
            r3.e(r6, r7)     // Catch: java.lang.Throwable -> L36
            goto L3b
        L5c:
            e(r2, r0)
            throw r6
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C1799g.i(java.io.File, java.lang.String):java.lang.String");
    }

    public static ActivityManager.RunningAppProcessInfo j(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    public static boolean k(Context context, String str, boolean z3) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int r4 = r(context, str, "bool");
            if (r4 > 0) {
                return resources.getBoolean(r4);
            }
            int r5 = r(context, str, v.b.f7403e);
            if (r5 > 0) {
                return Boolean.parseBoolean(context.getString(r5));
            }
        }
        return z3;
    }

    public static int l() {
        return a.b().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int m(Context context) {
        boolean A3 = A(context);
        ?? r02 = A3;
        if (C(context)) {
            r02 = (A3 ? 1 : 0) | 2;
        }
        if (z()) {
            return r02 | 4;
        }
        return r02;
    }

    public static SharedPreferences n(Context context) {
        return context.getSharedPreferences(f35052f, 0);
    }

    public static String o(Context context) {
        int r4 = r(context, f35054h, v.b.f7403e);
        if (r4 == 0) {
            r4 = r(context, f35055i, v.b.f7403e);
        }
        if (r4 != 0) {
            return context.getResources().getString(r4);
        }
        return null;
    }

    public static boolean p(Context context) {
        if (A(context) || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            return false;
        }
        return true;
    }

    public static String q(Context context) {
        int i4 = context.getApplicationContext().getApplicationInfo().icon;
        if (i4 > 0) {
            try {
                String resourcePackageName = context.getResources().getResourcePackageName(i4);
                if ("android".equals(resourcePackageName)) {
                    return context.getPackageName();
                }
                return resourcePackageName;
            } catch (Resources.NotFoundException unused) {
                return context.getPackageName();
            }
        }
        return context.getPackageName();
    }

    public static int r(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, q(context));
    }

    public static SharedPreferences s(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static String t(Context context, String str) {
        int r4 = r(context, str, v.b.f7403e);
        if (r4 > 0) {
            return context.getString(r4);
        }
        return "";
    }

    public static synchronized long u() {
        long j4;
        synchronized (C1799g.class) {
            try {
                if (f35061o == -1) {
                    String i4 = i(new File("/proc/meminfo"), "MemTotal");
                    long j5 = 0;
                    if (!TextUtils.isEmpty(i4)) {
                        String upperCase = i4.toUpperCase(Locale.US);
                        try {
                            if (upperCase.endsWith("KB")) {
                                j5 = g(upperCase, "KB", 1024);
                            } else if (upperCase.endsWith("MB")) {
                                j5 = g(upperCase, "MB", 1048576);
                            } else if (upperCase.endsWith("GB")) {
                                j5 = g(upperCase, "GB", 1073741824);
                            } else {
                                com.google.firebase.crashlytics.internal.f.f().m("Unexpected meminfo format while computing RAM: " + upperCase);
                            }
                        } catch (NumberFormatException e4) {
                            com.google.firebase.crashlytics.internal.f.f().e("Unexpected meminfo format while computing RAM: " + upperCase, e4);
                        }
                    }
                    f35061o = j5;
                }
                j4 = f35061o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j4;
    }

    private static String v(String str, String str2) {
        return w(str.getBytes(), str2);
    }

    private static String w(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return x(messageDigest.digest());
        } catch (NoSuchAlgorithmException e4) {
            com.google.firebase.crashlytics.internal.f.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e4);
            return "";
        }
    }

    public static String x(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            int i5 = i4 * 2;
            char[] cArr2 = f35053g;
            cArr[i5] = cArr2[(b4 & 255) >>> 4];
            cArr[i5 + 1] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public static boolean y(Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean z() {
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            return false;
        }
        return true;
    }
}

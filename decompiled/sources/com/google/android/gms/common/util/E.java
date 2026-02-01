package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@I0.a
/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static final int f28977a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    private static final Method f28978b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f28979c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f28980d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f28981e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f28982f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f28983g;

    /* renamed from: h, reason: collision with root package name */
    private static final Method f28984h;

    /* renamed from: i, reason: collision with root package name */
    private static final Method f28985i;

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(2:2|3)|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.E.f28977a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            com.google.android.gms.common.util.E.f28978b = r5
            boolean r5 = com.google.android.gms.common.util.v.g()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            com.google.android.gms.common.util.E.f28979c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            com.google.android.gms.common.util.E.f28980d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r0[r3] = r5     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            com.google.android.gms.common.util.E.f28981e = r0
            boolean r0 = com.google.android.gms.common.util.v.g()
            if (r0 == 0) goto L63
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r0[r3] = r5     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            com.google.android.gms.common.util.E.f28982f = r0
            boolean r0 = com.google.android.gms.common.util.v.o()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L7d:
            r0 = r4
        L7e:
            com.google.android.gms.common.util.E.f28983g = r0
            boolean r0 = com.google.android.gms.common.util.v.o()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r7[r3] = r8     // Catch: java.lang.Exception -> L9b
            r7[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La1:
            r0 = r4
        La2:
            com.google.android.gms.common.util.E.f28984h = r0
            boolean r0 = com.google.android.gms.common.util.v.o()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb5
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb5
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lb5
        Lb5:
            com.google.android.gms.common.util.E.f28985i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.E.<clinit>():void");
    }

    private E() {
    }

    @I0.a
    public static void a(@N WorkSource workSource, int i4, @N String str) {
        Method method = f28979c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i4), str);
                return;
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return;
            }
        }
        Method method2 = f28978b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i4));
            } catch (Exception e5) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e5);
            }
        }
    }

    @I0.a
    @N
    public static WorkSource b(@N Context context, @N String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo c4 = com.google.android.gms.common.wrappers.e.a(context).c(str, 0);
                if (c4 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i4 = c4.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i4, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    @I0.a
    @N
    public static WorkSource c(@N Context context, @N String str, @N String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i4 = -1;
            try {
                ApplicationInfo c4 = com.google.android.gms.common.wrappers.e.a(context).c(str, 0);
                if (c4 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i4 = c4.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i4 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = f28983g;
            if (method2 != null && (method = f28984h) != null) {
                try {
                    Object invoke = method2.invoke(workSource, new Object[0]);
                    int i5 = f28977a;
                    if (i4 != i5) {
                        method.invoke(invoke, Integer.valueOf(i4), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i5), str2);
                } catch (Exception e4) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e4);
                }
            } else {
                a(workSource, i4, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    @I0.a
    public static int d(@N WorkSource workSource, int i4) {
        Method method = f28981e;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i4));
                C1285y.l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            }
        }
        return 0;
    }

    @I0.a
    @N
    public static String e(@N WorkSource workSource, int i4) {
        Method method = f28982f;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
                return null;
            }
        }
        return null;
    }

    @I0.a
    @N
    public static List<String> f(@N WorkSource workSource) {
        int i4;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            i4 = 0;
        } else {
            i4 = i(workSource);
        }
        if (i4 != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                String e4 = e(workSource, i5);
                if (!B.b(e4)) {
                    C1285y.l(e4);
                    arrayList.add(e4);
                }
            }
        }
        return arrayList;
    }

    @I0.a
    public static boolean g(@N Context context) {
        if (context == null || context.getPackageManager() == null || com.google.android.gms.common.wrappers.e.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    @I0.a
    public static boolean h(@N WorkSource workSource) {
        Method method = f28985i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C1285y.l(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e4) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e4);
            }
        }
        if (i(workSource) != 0) {
            return false;
        }
        return true;
    }

    @I0.a
    public static int i(@N WorkSource workSource) {
        Method method = f28980d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C1285y.l(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            }
        }
        return 0;
    }
}

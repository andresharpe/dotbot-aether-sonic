package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1237i;
import com.google.android.gms.common.internal.C1281w;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

@I0.a
/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: b, reason: collision with root package name */
    @I0.a
    public static final int f29064b = -1;

    /* renamed from: c, reason: collision with root package name */
    @I0.a
    public static final int f29065c = 1;

    /* renamed from: d, reason: collision with root package name */
    @I0.a
    public static final int f29066d = 0;

    /* renamed from: e, reason: collision with root package name */
    @I0.a
    public static final int f29067e = 0;

    /* renamed from: l, reason: collision with root package name */
    @P
    @GuardedBy("DynamiteModule.class")
    private static Boolean f29074l = null;

    /* renamed from: m, reason: collision with root package name */
    @P
    @GuardedBy("DynamiteModule.class")
    private static String f29075m = null;

    /* renamed from: n, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static boolean f29076n = false;

    /* renamed from: o, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    private static int f29077o = -1;

    /* renamed from: p, reason: collision with root package name */
    @P
    @GuardedBy("DynamiteModule.class")
    private static Boolean f29078p;

    /* renamed from: u, reason: collision with root package name */
    @P
    @GuardedBy("DynamiteModule.class")
    private static s f29083u;

    /* renamed from: v, reason: collision with root package name */
    @P
    @GuardedBy("DynamiteModule.class")
    private static t f29084v;

    /* renamed from: a, reason: collision with root package name */
    private final Context f29085a;

    /* renamed from: q, reason: collision with root package name */
    private static final ThreadLocal f29079q = new ThreadLocal();

    /* renamed from: r, reason: collision with root package name */
    private static final ThreadLocal f29080r = new f();

    /* renamed from: s, reason: collision with root package name */
    private static final a.InterfaceC0272a f29081s = new g();

    /* renamed from: f, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29068f = new h();

    /* renamed from: g, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29069g = new i();

    /* renamed from: h, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29070h = new j();

    /* renamed from: i, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29071i = new k();

    /* renamed from: j, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29072j = new l();

    /* renamed from: k, reason: collision with root package name */
    @I0.a
    @N
    public static final a f29073k = new m();

    /* renamed from: t, reason: collision with root package name */
    @N
    public static final a f29082t = new n();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {

        @P
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @I0.a
    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, r rVar) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, r rVar) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface a {

        @I0.a
        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0272a {
            int a(@N Context context, @N String str, boolean z3) throws LoadingException;

            int b(@N Context context, @N String str);
        }

        @I0.a
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            @I0.a
            public int f29086a = 0;

            /* renamed from: b, reason: collision with root package name */
            @I0.a
            public int f29087b = 0;

            /* renamed from: c, reason: collision with root package name */
            @I0.a
            public int f29088c = 0;
        }

        @I0.a
        @N
        b a(@N Context context, @N String str, @N InterfaceC0272a interfaceC0272a) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        C1285y.l(context);
        this.f29085a = context;
    }

    @I0.a
    public static int a(@N Context context, @N String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!C1281w.b(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    @I0.a
    public static int c(@N Context context, @N String str) {
        return f(context, str, false);
    }

    @I0.a
    @N
    public static DynamiteModule e(@N Context context, @N a aVar, @N String str) throws LoadingException {
        long j4;
        Boolean bool;
        com.google.android.gms.dynamic.d Q12;
        DynamiteModule dynamiteModule;
        t tVar;
        Boolean valueOf;
        com.google.android.gms.dynamic.d N12;
        ThreadLocal threadLocal = f29079q;
        p pVar = (p) threadLocal.get();
        p pVar2 = new p(null);
        threadLocal.set(pVar2);
        ThreadLocal threadLocal2 = f29080r;
        long longValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a4 = aVar.a(context, str, f29081s);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + a4.f29086a + " and remote module " + str + ":" + a4.f29087b);
            int i4 = a4.f29088c;
            if (i4 != 0) {
                if (i4 == -1) {
                    try {
                        if (a4.f29086a != 0) {
                            i4 = -1;
                        }
                    } catch (Throwable th) {
                        th = th;
                        j4 = 0;
                        if (longValue == j4) {
                            f29080r.remove();
                        } else {
                            f29080r.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = pVar2.f29091a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f29079q.set(pVar);
                        throw th;
                    }
                }
                if (i4 != 1 || a4.f29087b != 0) {
                    if (i4 == -1) {
                        DynamiteModule h4 = h(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor2 = pVar2.f29091a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(pVar);
                        return h4;
                    }
                    if (i4 == 1) {
                        try {
                            int i5 = a4.f29087b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (k(context)) {
                                        bool = f29074l;
                                    } else {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                        synchronized (DynamiteModule.class) {
                                            tVar = f29084v;
                                        }
                                        if (tVar != null) {
                                            p pVar3 = (p) threadLocal.get();
                                            if (pVar3 != null && pVar3.f29091a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor3 = pVar3.f29091a;
                                                com.google.android.gms.dynamic.f.O0(null);
                                                synchronized (DynamiteModule.class) {
                                                    valueOf = Boolean.valueOf(f29077o >= 2);
                                                }
                                                if (valueOf.booleanValue()) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    N12 = tVar.O1(com.google.android.gms.dynamic.f.O0(applicationContext), str, i5, com.google.android.gms.dynamic.f.O0(cursor3));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    N12 = tVar.N1(com.google.android.gms.dynamic.f.O0(applicationContext), str, i5, com.google.android.gms.dynamic.f.O0(cursor3));
                                                }
                                                Context context2 = (Context) com.google.android.gms.dynamic.f.G(N12);
                                                if (context2 != null) {
                                                    dynamiteModule = new DynamiteModule(context2);
                                                } else {
                                                    throw new LoadingException("Failed to get module context", null);
                                                }
                                            } else {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i5);
                                        s l4 = l(context);
                                        if (l4 != null) {
                                            int N13 = l4.N1();
                                            if (N13 >= 3) {
                                                p pVar4 = (p) threadLocal.get();
                                                if (pVar4 != null) {
                                                    Q12 = l4.R1(com.google.android.gms.dynamic.f.O0(context), str, i5, com.google.android.gms.dynamic.f.O0(pVar4.f29091a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                            } else if (N13 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                Q12 = l4.S1(com.google.android.gms.dynamic.f.O0(context), str, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                Q12 = l4.Q1(com.google.android.gms.dynamic.f.O0(context), str, i5);
                                            }
                                            Object G3 = com.google.android.gms.dynamic.f.G(Q12);
                                            if (G3 != null) {
                                                dynamiteModule = new DynamiteModule((Context) G3);
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor4 = pVar2.f29091a;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    threadLocal.set(pVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", null);
                            } catch (RemoteException e4) {
                                throw new LoadingException("Failed to load remote module.", e4, null);
                            } catch (LoadingException e5) {
                                throw e5;
                            } catch (Throwable th2) {
                                com.google.android.gms.common.util.i.a(context, th2);
                                throw new LoadingException("Failed to load remote module.", th2, null);
                            }
                        } catch (LoadingException e6) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e6.getMessage());
                            int i6 = a4.f29086a;
                            if (i6 != 0 && aVar.a(context, str, new q(i6, 0)).f29088c == -1) {
                                DynamiteModule h5 = h(context, str);
                                if (longValue == 0) {
                                    f29080r.remove();
                                } else {
                                    f29080r.set(Long.valueOf(longValue));
                                }
                                Cursor cursor5 = pVar2.f29091a;
                                if (cursor5 != null) {
                                    cursor5.close();
                                }
                                f29079q.set(pVar);
                                return h5;
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e6, null);
                        }
                    }
                    throw new LoadingException("VersionPolicy returned invalid code:" + i4, null);
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + a4.f29086a + " and remote version is " + a4.f29087b + ".", null);
        } catch (Throwable th3) {
            th = th3;
            j4 = 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01bf -> B:24:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c1 -> B:24:0x01c4). Please report as a decompilation issue!!! */
    public static int f(@N Context context, @N String str, boolean z3) {
        Field declaredField;
        Throwable th;
        RemoteException e4;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f29074l;
                Cursor cursor2 = null;
                int i4 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e5.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!k(context)) {
                                return 0;
                            }
                            if (!f29076n) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g4 = g(context, str, z3, true);
                                        String str2 = f29075m;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a4 = d.a();
                                            if (a4 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    b.a();
                                                    String str3 = f29075m;
                                                    C1285y.l(str3);
                                                    a4 = com.google.android.gms.dynamite.a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f29075m;
                                                    C1285y.l(str4);
                                                    a4 = new e(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a4);
                                            declaredField.set(null, a4);
                                            f29074l = bool2;
                                            return g4;
                                        }
                                        return g4;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f29074l = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z3, false);
                    } catch (LoadingException e6) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e6.getMessage());
                        return 0;
                    }
                }
                s l4 = l(context);
                try {
                    if (l4 != null) {
                        try {
                            int N12 = l4.N1();
                            if (N12 >= 3) {
                                p pVar = (p) f29079q.get();
                                if (pVar != null && (cursor = pVar.f29091a) != null) {
                                    i4 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) com.google.android.gms.dynamic.f.G(l4.T1(com.google.android.gms.dynamic.f.O0(context), str, z3, ((Long) f29080r.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i5 = cursor3.getInt(0);
                                                if (i5 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i4 = i5;
                                            }
                                        } catch (RemoteException e7) {
                                            e4 = e7;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i4;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (N12 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i4 = l4.P1(com.google.android.gms.dynamic.f.O0(context), str, z3);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i4 = l4.O1(com.google.android.gms.dynamic.f.O0(context), str, z3);
                            }
                        } catch (RemoteException e8) {
                            e4 = e8;
                        }
                    }
                    return i4;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            com.google.android.gms.common.util.i.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r10.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r10, java.lang.String r11, boolean r12, boolean r13) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void i(ClassLoader classLoader) throws LoadingException {
        t tVar;
        r rVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                tVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof t) {
                    tVar = (t) queryLocalInterface;
                } else {
                    tVar = new t(iBinder);
                }
            }
            f29084v = tVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, rVar);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, rVar);
        } catch (InstantiationException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, rVar);
        } catch (NoSuchMethodException e7) {
            e = e7;
            throw new LoadingException("Failed to instantiate dynamite loader", e, rVar);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new LoadingException("Failed to instantiate dynamite loader", e, rVar);
        }
    }

    private static boolean j(Cursor cursor) {
        p pVar = (p) f29079q.get();
        if (pVar != null && pVar.f29091a == null) {
            pVar.f29091a = cursor;
            return true;
        }
        return false;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f29078p)) {
            return true;
        }
        boolean z3 = false;
        if (f29078p == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1237i.i().k(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            Boolean valueOf = Boolean.valueOf(z3);
            f29078p = valueOf;
            z3 = valueOf.booleanValue();
            if (z3 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f29076n = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    @P
    private static s l(Context context) {
        s sVar;
        synchronized (DynamiteModule.class) {
            s sVar2 = f29083u;
            if (sVar2 != null) {
                return sVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    sVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof s) {
                        sVar = (s) queryLocalInterface;
                    } else {
                        sVar = new s(iBinder);
                    }
                }
                if (sVar != null) {
                    f29083u = sVar;
                    return sVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    @I0.a
    @N
    public Context b() {
        return this.f29085a;
    }

    @I0.a
    @N
    public IBinder d(@N String str) throws LoadingException {
        try {
            return (IBinder) this.f29085a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, null);
        }
    }
}

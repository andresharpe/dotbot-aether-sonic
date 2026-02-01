package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.startup.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18452d = "Startup";

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f18453e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f18454f = new Object();

    /* renamed from: c, reason: collision with root package name */
    @N
    final Context f18457c;

    /* renamed from: b, reason: collision with root package name */
    @N
    final Set<Class<? extends b<?>>> f18456b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @N
    final Map<Class<?>, Object> f18455a = new HashMap();

    a(@N Context context) {
        this.f18457c = context.getApplicationContext();
    }

    @N
    private <T> T d(@N Class<? extends b<?>> cls, @N Set<Class<?>> set) {
        T t3;
        if (androidx.tracing.c.h()) {
            try {
                androidx.tracing.c.c(cls.getSimpleName());
            } catch (Throwable th) {
                androidx.tracing.c.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f18455a.containsKey(cls)) {
                set.add(cls);
                try {
                    b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> dependencies = newInstance.dependencies();
                    if (!dependencies.isEmpty()) {
                        for (Class<? extends b<?>> cls2 : dependencies) {
                            if (!this.f18455a.containsKey(cls2)) {
                                d(cls2, set);
                            }
                        }
                    }
                    t3 = (T) newInstance.a(this.f18457c);
                    set.remove(cls);
                    this.f18455a.put(cls, t3);
                } catch (Throwable th2) {
                    throw new StartupException(th2);
                }
            } else {
                t3 = (T) this.f18455a.get(cls);
            }
            androidx.tracing.c.f();
            return t3;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    @N
    public static a e(@N Context context) {
        if (f18453e == null) {
            synchronized (f18454f) {
                try {
                    if (f18453e == null) {
                        f18453e = new a(context);
                    }
                } finally {
                }
            }
        }
        return f18453e;
    }

    static void h(@N a aVar) {
        synchronized (f18454f) {
            f18453e = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            try {
                androidx.tracing.c.c(f18452d);
                b(this.f18457c.getPackageManager().getProviderInfo(new ComponentName(this.f18457c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e4) {
                throw new StartupException(e4);
            }
        } finally {
            androidx.tracing.c.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b(@P Bundle bundle) {
        String string = this.f18457c.getString(c.a.f18458a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f18456b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f18456b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e4) {
                throw new StartupException(e4);
            }
        }
    }

    @N
    <T> T c(@N Class<? extends b<?>> cls) {
        T t3;
        synchronized (f18454f) {
            try {
                t3 = (T) this.f18455a.get(cls);
                if (t3 == null) {
                    t3 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t3;
    }

    @N
    public <T> T f(@N Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@N Class<? extends b<?>> cls) {
        return this.f18456b.contains(cls);
    }
}

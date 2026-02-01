package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1178d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: I, reason: collision with root package name */
    private static final ComponentCallbacks2C1178d f28260I = new ComponentCallbacks2C1178d();

    /* renamed from: E, reason: collision with root package name */
    private final AtomicBoolean f28261E = new AtomicBoolean();

    /* renamed from: F, reason: collision with root package name */
    private final AtomicBoolean f28262F = new AtomicBoolean();

    /* renamed from: G, reason: collision with root package name */
    @GuardedBy("sInstance")
    private final ArrayList f28263G = new ArrayList();

    /* renamed from: H, reason: collision with root package name */
    @GuardedBy("sInstance")
    private boolean f28264H = false;

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: classes.dex */
    public interface a {
        @I0.a
        void a(boolean z3);
    }

    @I0.a
    private ComponentCallbacks2C1178d() {
    }

    @I0.a
    @androidx.annotation.N
    public static ComponentCallbacks2C1178d b() {
        return f28260I;
    }

    @I0.a
    public static void c(@androidx.annotation.N Application application) {
        ComponentCallbacks2C1178d componentCallbacks2C1178d = f28260I;
        synchronized (componentCallbacks2C1178d) {
            try {
                if (!componentCallbacks2C1178d.f28264H) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1178d);
                    application.registerComponentCallbacks(componentCallbacks2C1178d);
                    componentCallbacks2C1178d.f28264H = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z3) {
        synchronized (f28260I) {
            try {
                Iterator it = this.f28263G.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @I0.a
    public void a(@androidx.annotation.N a aVar) {
        synchronized (f28260I) {
            this.f28263G.add(aVar);
        }
    }

    @I0.a
    public boolean d() {
        return this.f28261E.get();
    }

    @I0.a
    @TargetApi(16)
    public boolean e(boolean z3) {
        if (!this.f28262F.get()) {
            if (com.google.android.gms.common.util.v.e()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f28262F.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f28261E.set(true);
                }
            } else {
                return z3;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@androidx.annotation.N Activity activity, @androidx.annotation.P Bundle bundle) {
        boolean compareAndSet = this.f28261E.compareAndSet(true, false);
        this.f28262F.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@androidx.annotation.N Activity activity) {
        boolean compareAndSet = this.f28261E.compareAndSet(true, false);
        this.f28262F.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@androidx.annotation.N Activity activity, @androidx.annotation.N Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@androidx.annotation.N Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@androidx.annotation.N Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@androidx.annotation.N Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f28261E.compareAndSet(false, true)) {
            this.f28262F.set(true);
            f(true);
        }
    }
}

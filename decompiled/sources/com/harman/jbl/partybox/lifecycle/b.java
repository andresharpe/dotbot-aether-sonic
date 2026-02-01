package com.harman.jbl.partybox.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Stack;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: F, reason: collision with root package name */
    private static volatile b f42026F;

    /* renamed from: E, reason: collision with root package name */
    private final Stack<Activity> f42027E = new Stack<>();

    private b() {
    }

    @N
    public static b e() {
        if (f42026F == null) {
            synchronized (b.class) {
                try {
                    if (f42026F == null) {
                        f42026F = new b();
                    }
                } finally {
                }
            }
        }
        return f42026F;
    }

    public void a() {
        this.f42027E.clear();
    }

    @P
    public Activity b(int i4) {
        if (this.f42027E.size() < 1) {
            return null;
        }
        return this.f42027E.get(i4);
    }

    public int c() {
        return this.f42027E.size();
    }

    @P
    public Activity d() {
        if (this.f42027E.isEmpty()) {
            return null;
        }
        return this.f42027E.lastElement();
    }

    @P
    public Activity f() {
        if (this.f42027E.size() >= 2) {
            Stack<Activity> stack = this.f42027E;
            return stack.get(stack.size() - 2);
        }
        return null;
    }

    public void g(@N Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    public void h(@P Activity activity) {
        this.f42027E.remove(activity);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@N Activity activity, @P Bundle bundle) {
        this.f42027E.add(activity);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@N Activity activity) {
        if (this.f42027E.contains(activity)) {
            this.f42027E.remove(activity);
        }
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityPaused(@P Activity activity) {
        super.onActivityPaused(activity);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityResumed(@P Activity activity) {
        super.onActivityResumed(activity);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivitySaveInstanceState(@P Activity activity, @P Bundle bundle) {
        super.onActivitySaveInstanceState(activity, bundle);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityStarted(@P Activity activity) {
        super.onActivityStarted(activity);
    }

    @Override // com.harman.jbl.partybox.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public /* bridge */ /* synthetic */ void onActivityStopped(@P Activity activity) {
        super.onActivityStopped(activity);
    }
}

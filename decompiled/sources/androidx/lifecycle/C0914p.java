package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0914p implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l3.d Activity activity, @l3.d Bundle outState) {
        kotlin.jvm.internal.F.p(activity, "activity");
        kotlin.jvm.internal.F.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
    }
}

package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923z {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0923z f15745a = new C0923z();

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final AtomicBoolean f15746b = new AtomicBoolean(false);

    @androidx.annotation.i0
    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: classes.dex */
    public static final class a extends C0914p {
        @Override // androidx.lifecycle.C0914p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@l3.d Activity activity, @l3.e Bundle bundle) {
            kotlin.jvm.internal.F.p(activity, "activity");
            X.f15548F.d(activity);
        }
    }

    private C0923z() {
    }

    @W2.n
    public static final void a(@l3.d Context context) {
        kotlin.jvm.internal.F.p(context, "context");
        if (f15746b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.F.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}

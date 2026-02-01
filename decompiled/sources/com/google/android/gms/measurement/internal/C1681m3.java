package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.sdk.android.auth.b;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
@androidx.annotation.K
/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1681m3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ C1687n3 f30865E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1681m3(C1687n3 c1687n3, C1675l3 c1675l3) {
        this.f30865E = c1687n3;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1638f2 c1638f2;
        String str;
        boolean z3;
        try {
            try {
                this.f30865E.f31060a.b().t().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c1638f2 = this.f30865E.f31060a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f30865E.f31060a.L();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = kotlinx.coroutines.W.f52989c;
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter(b.c.f48987b);
                        if (bundle == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f30865E.f31060a.a().x(new RunnableC1669k3(this, z3, data, str2, queryParameter));
                        c1638f2 = this.f30865E.f31060a;
                    }
                    c1638f2 = this.f30865E.f31060a;
                }
            } catch (RuntimeException e4) {
                this.f30865E.f31060a.b().p().b("Throwable caught in onActivityCreated", e4);
                c1638f2 = this.f30865E.f31060a;
            }
            c1638f2.I().w(activity, bundle);
        } catch (Throwable th) {
            this.f30865E.f31060a.I().w(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f30865E.f31060a.I().x(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.K
    public final void onActivityPaused(Activity activity) {
        this.f30865E.f31060a.I().y(activity);
        C1729u4 K3 = this.f30865E.f31060a.K();
        K3.f31060a.a().x(new RunnableC1688n4(K3, K3.f31060a.zzav().c()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @androidx.annotation.K
    public final void onActivityResumed(Activity activity) {
        C1729u4 K3 = this.f30865E.f31060a.K();
        K3.f31060a.a().x(new RunnableC1682m4(K3, K3.f31060a.zzav().c()));
        this.f30865E.f31060a.I().z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f30865E.f31060a.I().A(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

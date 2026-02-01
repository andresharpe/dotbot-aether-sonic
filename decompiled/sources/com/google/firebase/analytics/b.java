package com.google.firebase.analytics;

import androidx.annotation.P;
import com.google.android.gms.internal.measurement.C1421j1;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f34821a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FirebaseAnalytics firebaseAnalytics) {
        this.f34821a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    @P
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C1421j1 c1421j1;
        c1421j1 = this.f34821a.f34717a;
        return c1421j1.G();
    }
}

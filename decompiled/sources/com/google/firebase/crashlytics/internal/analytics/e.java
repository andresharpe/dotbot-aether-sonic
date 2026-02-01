package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    static final String f34989b = "clx";

    /* renamed from: a, reason: collision with root package name */
    @N
    private final com.google.firebase.analytics.connector.a f34990a;

    public e(@N com.google.firebase.analytics.connector.a aVar) {
        this.f34990a = aVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@N String str, @P Bundle bundle) {
        this.f34990a.c(f34989b, str, bundle);
    }
}

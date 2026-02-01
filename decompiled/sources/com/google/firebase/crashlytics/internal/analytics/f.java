package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes2.dex */
public class f implements a {
    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@N String str, @P Bundle bundle) {
        com.google.firebase.crashlytics.internal.f.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}

package com.google.firebase.crashlytics.internal.common;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

@AutoValue
/* loaded from: classes2.dex */
public abstract class r {
    @androidx.annotation.N
    public static r a(CrashlyticsReport crashlyticsReport, String str) {
        return new C1794b(crashlyticsReport, str);
    }

    public abstract CrashlyticsReport b();

    public abstract String c();
}

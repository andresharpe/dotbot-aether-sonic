package com.google.firebase.remoteconfig;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37775a = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {

        /* renamed from: T, reason: collision with root package name */
        public static final String f37776T = "experimentId";

        /* renamed from: U, reason: collision with root package name */
        public static final String f37777U = "variantId";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {

        /* renamed from: V, reason: collision with root package name */
        public static final String f37778V = "appInstanceId";

        /* renamed from: W, reason: collision with root package name */
        public static final String f37779W = "appInstanceIdToken";

        /* renamed from: X, reason: collision with root package name */
        public static final String f37780X = "appId";

        /* renamed from: Y, reason: collision with root package name */
        public static final String f37781Y = "countryCode";

        /* renamed from: Z, reason: collision with root package name */
        public static final String f37782Z = "languageCode";

        /* renamed from: a0, reason: collision with root package name */
        public static final String f37783a0 = "platformVersion";

        /* renamed from: b0, reason: collision with root package name */
        public static final String f37784b0 = "timeZone";

        /* renamed from: c0, reason: collision with root package name */
        public static final String f37785c0 = "appVersion";

        /* renamed from: d0, reason: collision with root package name */
        public static final String f37786d0 = "appBuild";

        /* renamed from: e0, reason: collision with root package name */
        public static final String f37787e0 = "packageName";

        /* renamed from: f0, reason: collision with root package name */
        public static final String f37788f0 = "sdkVersion";

        /* renamed from: g0, reason: collision with root package name */
        public static final String f37789g0 = "analyticsUserProperties";

        /* renamed from: h0, reason: collision with root package name */
        public static final String f37790h0 = "firstOpenTime";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {

        /* renamed from: i0, reason: collision with root package name */
        public static final String f37791i0 = "entries";

        /* renamed from: j0, reason: collision with root package name */
        public static final String f37792j0 = "experimentDescriptions";

        /* renamed from: k0, reason: collision with root package name */
        public static final String f37793k0 = "personalizationMetadata";

        /* renamed from: l0, reason: collision with root package name */
        public static final String f37794l0 = "state";
    }

    private u() {
    }
}

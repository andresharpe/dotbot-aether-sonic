package com.amazonaws;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23714a = "com.amazonaws.sdk.disableCertChecking";

    /* renamed from: b, reason: collision with root package name */
    public static final String f23715b = "com.amazonaws.sdk.enableDefaultMetrics";

    /* renamed from: c, reason: collision with root package name */
    public static final String f23716c = "aws.accessKeyId";

    /* renamed from: d, reason: collision with root package name */
    public static final String f23717d = "aws.secretKey";

    /* renamed from: e, reason: collision with root package name */
    public static final String f23718e = "com.amazonaws.sdk.ec2MetadataServiceEndpointOverride";

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final String f23719f = "com.amazonaws.regions.RegionUtils.fileOverride";

    /* renamed from: g, reason: collision with root package name */
    public static final String f23720g = "com.amazonaws.regions.RegionUtils.disableRemote";

    /* renamed from: h, reason: collision with root package name */
    public static final String f23721h = "com.amazonaws.sdk.s3.defaultStreamBufferSize";

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final String f23722i = "com.amazonaws.sdk.enableRuntimeProfiling";

    /* renamed from: j, reason: collision with root package name */
    public static final String f23723j = "AWS_ACCESS_KEY_ID";

    /* renamed from: k, reason: collision with root package name */
    public static final String f23724k = "AWS_ACCESS_KEY";

    /* renamed from: l, reason: collision with root package name */
    public static final String f23725l = "AWS_SECRET_KEY";

    /* renamed from: m, reason: collision with root package name */
    public static final String f23726m = "AWS_SECRET_ACCESS_KEY";

    /* renamed from: n, reason: collision with root package name */
    public static final String f23727n = "AWS_SESSION_TOKEN";

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicInteger f23728o = new AtomicInteger(0);

    public static int a() {
        return f23728o.get();
    }

    public static void b(int i4) {
        f23728o.set(i4);
    }
}

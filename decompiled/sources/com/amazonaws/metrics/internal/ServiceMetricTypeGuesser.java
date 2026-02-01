package com.amazonaws.metrics.internal;

import com.amazonaws.f;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.n;
import com.amazonaws.metrics.o;

/* loaded from: classes.dex */
public enum ServiceMetricTypeGuesser {
    ;

    public static o b(f<?> fVar, String str, String str2) {
        if (!AwsSdkMetrics.x() || !fVar.k().getClass().getName().startsWith("com.amazonaws.services.s3")) {
            return null;
        }
        return new n("S3" + str, fVar.b(), "S3" + str2);
    }
}

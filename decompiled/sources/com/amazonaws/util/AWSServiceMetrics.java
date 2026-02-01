package com.amazonaws.util;

@Deprecated
/* loaded from: classes.dex */
public enum AWSServiceMetrics implements com.amazonaws.metrics.k {
    HttpClientGetConnectionTime("HttpClient");

    private final String serviceName;

    AWSServiceMetrics(String str) {
        this.serviceName = str;
    }

    @Override // com.amazonaws.metrics.k
    public String b() {
        return this.serviceName;
    }
}

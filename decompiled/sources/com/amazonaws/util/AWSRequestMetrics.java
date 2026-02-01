package com.amazonaws.util;

import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class AWSRequestMetrics {

    /* renamed from: a, reason: collision with root package name */
    protected final x f24253a;

    /* loaded from: classes.dex */
    public enum Field implements com.amazonaws.metrics.h {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        HttpClientPoolAvailableCount,
        HttpClientPoolLeasedCount,
        HttpClientPoolPendingCount,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        this.f24253a = x.E();
    }

    public void a(com.amazonaws.metrics.f fVar, Object obj) {
    }

    public void b(String str, Object obj) {
    }

    public void c(com.amazonaws.metrics.f fVar) {
    }

    public void d(String str) {
    }

    public List<Object> e(com.amazonaws.metrics.f fVar) {
        return Collections.emptyList();
    }

    public List<Object> f(String str) {
        return Collections.emptyList();
    }

    public final x g() {
        return this.f24253a;
    }

    public void h(com.amazonaws.metrics.f fVar) {
    }

    public void i(String str) {
    }

    public boolean j() {
        return false;
    }

    public void k() {
    }

    public void l(com.amazonaws.metrics.f fVar, long j4) {
    }

    public void m(String str, long j4) {
    }

    public void n(com.amazonaws.metrics.f fVar) {
    }

    public void o(String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AWSRequestMetrics(x xVar) {
        this.f24253a = xVar;
    }
}

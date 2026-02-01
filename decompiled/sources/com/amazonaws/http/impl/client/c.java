package com.amazonaws.http.impl.client;

import com.amazonaws.util.AWSRequestMetrics;
import java.io.IOException;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public final class c extends DefaultHttpRequestRetryHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23662a = new c();

    private c() {
    }

    @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler, org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i4, HttpContext httpContext) {
        AWSRequestMetrics aWSRequestMetrics;
        boolean retryRequest = super.retryRequest(iOException, i4, httpContext);
        if (retryRequest && (aWSRequestMetrics = (AWSRequestMetrics) httpContext.getAttribute(AWSRequestMetrics.class.getSimpleName())) != null) {
            aWSRequestMetrics.h(AWSRequestMetrics.Field.HttpClientRetryCount);
        }
        return retryRequest;
    }
}

package com.amazonaws.http.impl.client;

import java.io.IOException;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes.dex */
public final class a extends DefaultHttpRequestRetryHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23661a = new a();

    private a() {
    }

    @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler, org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i4, HttpContext httpContext) {
        return false;
    }
}

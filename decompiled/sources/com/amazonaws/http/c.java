package com.amazonaws.http;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23626a = 80;

    /* renamed from: b, reason: collision with root package name */
    private static final int f23627b = 443;

    c() {
    }

    public static ThreadSafeClientConnManager a(com.amazonaws.d dVar, HttpParams httpParams) {
        ConnManagerParams.setMaxConnectionsPerRoute(httpParams, new ConnPerRouteBean(dVar.c()));
        ConnManagerParams.setMaxTotalConnections(httpParams, dVar.c());
        SSLSocketFactory socketFactory = SSLSocketFactory.getSocketFactory();
        socketFactory.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), f23626a));
        schemeRegistry.register(new Scheme("https", socketFactory, f23627b));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(httpParams, schemeRegistry);
        if (dVar.P()) {
            n.b(threadSafeClientConnManager);
        }
        return threadSafeClientConnManager;
    }
}

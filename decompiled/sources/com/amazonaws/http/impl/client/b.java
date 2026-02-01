package com.amazonaws.http.impl.client;

import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpRequestExecutor;

/* loaded from: classes.dex */
public class b extends DefaultHttpClient {
    public b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(com.amazonaws.http.conn.a.b(clientConnectionManager), httpParams);
    }

    @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
    protected HttpRequestExecutor createRequestExecutor() {
        return new com.amazonaws.http.protocol.a();
    }
}

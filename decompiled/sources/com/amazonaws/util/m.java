package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.HttpClient;

/* loaded from: classes.dex */
class m extends com.amazonaws.internal.i {

    /* renamed from: E, reason: collision with root package name */
    private final HttpClient f24336E;

    public m(HttpClient httpClient, InputStream inputStream) {
        super(inputStream);
        this.f24336E = httpClient;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            this.f24336E.getConnectionManager().shutdown();
        }
    }
}

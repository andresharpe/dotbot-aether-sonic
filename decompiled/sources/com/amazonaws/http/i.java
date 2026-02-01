package com.amazonaws.http;

import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.AbortableHttpRequest;

/* loaded from: classes.dex */
public class i extends com.amazonaws.internal.k {

    /* renamed from: I, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23656I = LogFactory.c(i.class);

    /* renamed from: E, reason: collision with root package name */
    private InputStream f23657E;

    /* renamed from: F, reason: collision with root package name */
    private HttpEntityEnclosingRequest f23658F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f23659G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f23660H;

    public i(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        this.f23658F = httpEntityEnclosingRequest;
        try {
            this.f23657E = httpEntityEnclosingRequest.getEntity().getContent();
        } catch (IOException e4) {
            com.amazonaws.logging.c cVar = f23656I;
            if (cVar.d()) {
                cVar.j("Unable to obtain HttpMethod's response data stream", e4);
            }
            try {
                httpEntityEnclosingRequest.getEntity().getContent().close();
            } catch (Exception unused) {
            }
            this.f23657E = new ByteArrayInputStream(new byte[0]);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f23657E.available();
        } catch (IOException e4) {
            h();
            com.amazonaws.logging.c cVar = f23656I;
            if (cVar.f()) {
                cVar.b("Released HttpMethod as its response data stream threw an exception", e4);
            }
            throw e4;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f23659G) {
            h();
            com.amazonaws.logging.c cVar = f23656I;
            if (cVar.f()) {
                cVar.a("Released HttpMethod as its response data stream is closed");
            }
        }
        this.f23657E.close();
    }

    @Override // com.amazonaws.internal.k
    protected InputStream d() {
        return this.f23657E;
    }

    public HttpEntityEnclosingRequest f() {
        return this.f23658F;
    }

    protected void finalize() throws Throwable {
        if (!this.f23659G) {
            com.amazonaws.logging.c cVar = f23656I;
            if (cVar.d()) {
                cVar.m("Attempting to release HttpMethod in finalize() as its response data stream has gone out of scope. This attempt will not always succeed and cannot be relied upon! Please ensure S3 response data streams are always fully consumed or closed to avoid HTTP connection starvation.");
            }
            h();
            if (cVar.d()) {
                cVar.m("Successfully released HttpMethod in finalize(). You were lucky this time... Please ensure S3 response data streams are always fully consumed or closed.");
            }
        }
        super.finalize();
    }

    protected void h() throws IOException {
        if (!this.f23659G) {
            if (!this.f23660H) {
                HttpEntityEnclosingRequest httpEntityEnclosingRequest = this.f23658F;
                if (httpEntityEnclosingRequest instanceof AbortableHttpRequest) {
                    ((AbortableHttpRequest) httpEntityEnclosingRequest).abort();
                }
            }
            this.f23657E.close();
            this.f23659G = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f23657E.read();
            if (read == -1) {
                this.f23660H = true;
                if (!this.f23659G) {
                    h();
                    com.amazonaws.logging.c cVar = f23656I;
                    if (cVar.f()) {
                        cVar.a("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e4) {
            h();
            com.amazonaws.logging.c cVar2 = f23656I;
            if (cVar2.f()) {
                cVar2.b("Released HttpMethod as its response data stream threw an exception", e4);
            }
            throw e4;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        try {
            int read = this.f23657E.read(bArr, i4, i5);
            if (read == -1) {
                this.f23660H = true;
                if (!this.f23659G) {
                    h();
                    com.amazonaws.logging.c cVar = f23656I;
                    if (cVar.f()) {
                        cVar.a("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e4) {
            h();
            com.amazonaws.logging.c cVar2 = f23656I;
            if (cVar2.f()) {
                cVar2.b("Released HttpMethod as its response data stream threw an exception", e4);
            }
            throw e4;
        }
    }
}

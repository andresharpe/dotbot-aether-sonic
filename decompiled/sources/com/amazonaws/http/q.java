package com.amazonaws.http;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.internal.ServiceMetricTypeGuesser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.InputStreamEntity;

/* loaded from: classes.dex */
class q extends BasicHttpEntity {

    /* renamed from: e, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23694e = LogFactory.c(a.class);

    /* renamed from: a, reason: collision with root package name */
    private boolean f23695a = true;

    /* renamed from: b, reason: collision with root package name */
    private InputStreamEntity f23696b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f23697c;

    /* renamed from: d, reason: collision with root package name */
    private IOException f23698d;

    q(com.amazonaws.f<?> fVar) {
        setChunked(false);
        long j4 = -1;
        try {
            String str = fVar.a().get(h.f23644c);
            if (str != null) {
                j4 = Long.parseLong(str);
            }
        } catch (NumberFormatException unused) {
            f23694e.m("Unable to parse content length from request.  Buffering contents in memory.");
        }
        String str2 = fVar.a().get("Content-Type");
        com.amazonaws.metrics.o b4 = ServiceMetricTypeGuesser.b(fVar, com.amazonaws.metrics.k.f23831b, com.amazonaws.metrics.k.f23832c);
        if (b4 == null) {
            this.f23696b = new InputStreamEntity(fVar.getContent(), j4);
        } else {
            this.f23696b = new com.amazonaws.metrics.e(b4, fVar.getContent(), j4);
        }
        this.f23696b.setContentType(str2);
        InputStream content = fVar.getContent();
        this.f23697c = content;
        setContent(content);
        setContentType(str2);
        setContentLength(j4);
    }

    @Override // org.apache.http.entity.AbstractHttpEntity, org.apache.http.HttpEntity
    public boolean isChunked() {
        return false;
    }

    @Override // org.apache.http.entity.BasicHttpEntity, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        if (!this.f23697c.markSupported() && !this.f23696b.isRepeatable()) {
            return false;
        }
        return true;
    }

    @Override // org.apache.http.entity.BasicHttpEntity, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        try {
            if (!this.f23695a && isRepeatable()) {
                this.f23697c.reset();
            }
            this.f23695a = false;
            this.f23696b.writeTo(outputStream);
        } catch (IOException e4) {
            if (this.f23698d == null) {
                this.f23698d = e4;
            }
            throw this.f23698d;
        }
    }
}

package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.http.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final l f23858a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(l lVar) {
        this.f23858a = lVar;
    }

    public InputStream a() throws IOException {
        return this.f23858a.b();
    }

    public Map<String, String> b() {
        return this.f23858a.c();
    }

    public InputStream c() throws IOException {
        return this.f23858a.d();
    }

    public int d() {
        return this.f23858a.e();
    }

    public String e() {
        return this.f23858a.f();
    }
}

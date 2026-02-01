package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.e;
import com.amazonaws.f;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final f<d> f23857a;

    public c(String str) {
        this.f23857a = new e(str);
    }

    public c a(String str, String str2) {
        this.f23857a.addHeader(str, str2);
        return this;
    }

    public Map<String, String> b() {
        return this.f23857a.a();
    }

    public HttpMethodName c() {
        return this.f23857a.l();
    }

    public Map<String, String> d() {
        return this.f23857a.e();
    }

    public String e() {
        return this.f23857a.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f<d> f() {
        return this.f23857a;
    }

    public c g(InputStream inputStream) {
        this.f23857a.f(inputStream);
        return this;
    }

    public c h(String str) {
        this.f23857a.f(new ByteArrayInputStream(str.getBytes(w.f24366b)));
        return this;
    }

    public c i(byte[] bArr) {
        this.f23857a.f(new ByteArrayInputStream(bArr));
        return this;
    }

    public c j(Map<String, String> map) {
        this.f23857a.u(map);
        return this;
    }

    public c k(HttpMethodName httpMethodName) {
        this.f23857a.n(httpMethodName);
        return this;
    }

    public c l(String str, String str2) {
        this.f23857a.o(str, str2);
        return this;
    }

    public c m(Map<String, String> map) {
        this.f23857a.r(map);
        return this;
    }

    public c n(String str) {
        this.f23857a.h(str);
        return this;
    }

    public c() {
        this.f23857a = new e("");
    }
}

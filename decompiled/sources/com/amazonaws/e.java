package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private String f23566a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23567b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f23568c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f23569d;

    /* renamed from: e, reason: collision with root package name */
    private URI f23570e;

    /* renamed from: f, reason: collision with root package name */
    private String f23571f;

    /* renamed from: g, reason: collision with root package name */
    private final b f23572g;

    /* renamed from: h, reason: collision with root package name */
    private HttpMethodName f23573h;

    /* renamed from: i, reason: collision with root package name */
    private InputStream f23574i;

    /* renamed from: j, reason: collision with root package name */
    private int f23575j;

    /* renamed from: k, reason: collision with root package name */
    private AWSRequestMetrics f23576k;

    public e(b bVar, String str) {
        this.f23567b = false;
        this.f23568c = new LinkedHashMap();
        this.f23569d = new HashMap();
        this.f23573h = HttpMethodName.POST;
        this.f23571f = str;
        this.f23572g = bVar;
    }

    @Override // com.amazonaws.f
    public Map<String, String> a() {
        return this.f23569d;
    }

    @Override // com.amazonaws.f
    public void addHeader(String str, String str2) {
        this.f23569d.put(str, str2);
    }

    @Override // com.amazonaws.f
    public String b() {
        return this.f23571f;
    }

    @Override // com.amazonaws.f
    public Map<String, String> e() {
        return this.f23568c;
    }

    @Override // com.amazonaws.f
    public void f(InputStream inputStream) {
        this.f23574i = inputStream;
    }

    @Override // com.amazonaws.f
    @Deprecated
    public AWSRequestMetrics g() {
        return this.f23576k;
    }

    @Override // com.amazonaws.f
    public InputStream getContent() {
        return this.f23574i;
    }

    @Override // com.amazonaws.f
    public void h(String str) {
        this.f23566a = str;
    }

    @Override // com.amazonaws.f
    public void i(int i4) {
        this.f23575j = i4;
    }

    @Override // com.amazonaws.f
    public boolean isStreaming() {
        return this.f23567b;
    }

    @Override // com.amazonaws.f
    public int j() {
        return this.f23575j;
    }

    @Override // com.amazonaws.f
    public b k() {
        return this.f23572g;
    }

    @Override // com.amazonaws.f
    public HttpMethodName l() {
        return this.f23573h;
    }

    @Override // com.amazonaws.f
    public void m(boolean z3) {
        this.f23567b = z3;
    }

    @Override // com.amazonaws.f
    public void n(HttpMethodName httpMethodName) {
        this.f23573h = httpMethodName;
    }

    @Override // com.amazonaws.f
    public void o(String str, String str2) {
        this.f23568c.put(str, str2);
    }

    @Override // com.amazonaws.f
    public String p() {
        return this.f23566a;
    }

    @Override // com.amazonaws.f
    @Deprecated
    public void q(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f23576k == null) {
            this.f23576k = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    @Override // com.amazonaws.f
    public void r(Map<String, String> map) {
        this.f23568c.clear();
        this.f23568c.putAll(map);
    }

    @Override // com.amazonaws.f
    public URI s() {
        return this.f23570e;
    }

    @Override // com.amazonaws.f
    public f<T> t(String str, String str2) {
        o(str, str2);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(l());
        sb.append(" ");
        sb.append(s());
        sb.append(" ");
        String p4 = p();
        if (p4 == null) {
            sb.append("/");
        } else {
            if (!p4.startsWith("/")) {
                sb.append("/");
            }
            sb.append(p4);
        }
        sb.append(" ");
        if (!e().isEmpty()) {
            sb.append("Parameters: (");
            for (String str : e().keySet()) {
                String str2 = e().get(str);
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append(", ");
            }
            sb.append(") ");
        }
        if (!a().isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : a().keySet()) {
                String str4 = a().get(str3);
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                sb.append(", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    @Override // com.amazonaws.f
    public void u(Map<String, String> map) {
        this.f23569d.clear();
        this.f23569d.putAll(map);
    }

    @Override // com.amazonaws.f
    public f<T> v(int i4) {
        i(i4);
        return this;
    }

    @Override // com.amazonaws.f
    public void w(URI uri) {
        this.f23570e = uri;
    }

    public e(String str) {
        this(null, str);
    }
}

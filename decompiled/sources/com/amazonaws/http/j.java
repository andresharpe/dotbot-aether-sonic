package com.amazonaws.http;

import com.amazonaws.util.w;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f23663a;

    /* renamed from: b, reason: collision with root package name */
    private URI f23664b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f23665c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f23666d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23667e;

    public j(String str, URI uri) {
        this(str, uri, null, null);
    }

    public InputStream a() {
        return this.f23666d;
    }

    public long b() {
        String str;
        Map<String, String> map = this.f23665c;
        if (map == null || (str = map.get(h.f23644c)) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }

    public Map<String, String> c() {
        return this.f23665c;
    }

    public String d() {
        return this.f23663a;
    }

    public URI e() {
        return this.f23664b;
    }

    public boolean f() {
        return this.f23667e;
    }

    public void g(boolean z3) {
        this.f23667e = z3;
    }

    void h(URI uri) {
        this.f23664b = uri;
    }

    public j(String str, URI uri, Map<String, String> map, InputStream inputStream) {
        Map<String, String> unmodifiableMap;
        this.f23663a = w.u(str);
        this.f23664b = uri;
        if (map == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(map);
        }
        this.f23665c = unmodifiableMap;
        this.f23666d = inputStream;
    }
}

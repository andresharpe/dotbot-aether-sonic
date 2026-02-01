package com.amazonaws.mobileconnectors.apigateway;

import com.amazonaws.auth.C1024b;
import com.amazonaws.auth.I;
import com.amazonaws.auth.InterfaceC1030h;
import java.lang.reflect.Proxy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f23839f = "execute-api";

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f23840g = Pattern.compile("^https?://\\w+.execute-api.([a-z0-9-]+).amazonaws.com/.*");

    /* renamed from: a, reason: collision with root package name */
    private String f23841a;

    /* renamed from: b, reason: collision with root package name */
    private String f23842b;

    /* renamed from: c, reason: collision with root package name */
    private String f23843c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1030h f23844d;

    /* renamed from: e, reason: collision with root package name */
    private com.amazonaws.d f23845e;

    public a a(String str) {
        this.f23842b = str;
        return this;
    }

    public <T> T b(Class<T> cls) {
        if (cls != null) {
            String g4 = g(cls);
            if (g4 != null) {
                return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, h(g4, f(cls))));
            }
            throw new IllegalArgumentException("Missing endpoint information");
        }
        throw new IllegalArgumentException("Missing API class");
    }

    public a c(com.amazonaws.d dVar) {
        this.f23845e = dVar;
        return this;
    }

    public a d(InterfaceC1030h interfaceC1030h) {
        this.f23844d = interfaceC1030h;
        return this;
    }

    public a e(String str) {
        this.f23841a = str;
        return this;
    }

    String f(Class<?> cls) {
        return cls.getSimpleName();
    }

    String g(Class<?> cls) {
        p0.c cVar = (p0.c) cls.getAnnotation(p0.c.class);
        if (cVar != null) {
            String str = this.f23841a;
            if (str == null) {
                return cVar.endpoint();
            }
            return str;
        }
        throw new IllegalArgumentException("Can't find annotation Service");
    }

    b h(String str, String str2) {
        I j4;
        if (this.f23844d == null) {
            j4 = null;
        } else {
            j4 = j(i(str));
        }
        I i4 = j4;
        com.amazonaws.d dVar = this.f23845e;
        if (dVar == null) {
            dVar = new com.amazonaws.d();
        }
        return new b(str, str2, i4, this.f23844d, this.f23842b, dVar);
    }

    String i(String str) {
        String str2 = this.f23843c;
        if (str2 != null) {
            return str2;
        }
        Matcher matcher = f23840g.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Region isn't specified and can't be deduced from endpoint.");
    }

    I j(String str) {
        C1024b c1024b = new C1024b();
        c1024b.a(f23839f);
        c1024b.c(str);
        return c1024b;
    }

    public a k(String str) {
        this.f23843c = str;
        return this;
    }
}

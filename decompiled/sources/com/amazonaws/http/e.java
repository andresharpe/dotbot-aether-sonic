package com.amazonaws.http;

import com.amazonaws.auth.I;
import com.amazonaws.auth.InterfaceC1029g;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.C1068a;
import java.net.URI;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final AWSRequestMetrics f23635a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.amazonaws.handlers.e> f23636b;

    /* renamed from: c, reason: collision with root package name */
    private String f23637c;

    /* renamed from: d, reason: collision with root package name */
    private final com.amazonaws.a f23638d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC1029g f23639e;

    @Deprecated
    public e(boolean z3) {
        this(null, z3, null);
    }

    @Deprecated
    public AWSRequestMetrics a() {
        return this.f23635a;
    }

    public String b() {
        return this.f23637c;
    }

    public InterfaceC1029g c() {
        return this.f23639e;
    }

    public List<com.amazonaws.handlers.e> d() {
        return this.f23636b;
    }

    public I e(URI uri) {
        com.amazonaws.a aVar = this.f23638d;
        if (aVar == null) {
            return null;
        }
        return aVar.d0(uri);
    }

    public void f(String str) {
        this.f23637c = str;
    }

    public void g(InterfaceC1029g interfaceC1029g) {
        this.f23639e = interfaceC1029g;
    }

    public void h(I i4) {
    }

    public e() {
        this(null, false, null);
    }

    public e(List<com.amazonaws.handlers.e> list, boolean z3, com.amazonaws.a aVar) {
        this.f23636b = list;
        this.f23635a = z3 ? new C1068a() : new AWSRequestMetrics();
        this.f23638d = aVar;
    }
}

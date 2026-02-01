package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: com.amazonaws.util.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1068a extends AWSRequestMetrics {

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazonaws.logging.c f24266d = LogFactory.d("com.amazonaws.latency");

    /* renamed from: e, reason: collision with root package name */
    private static final Object f24267e = "=";

    /* renamed from: f, reason: collision with root package name */
    private static final Object f24268f = ", ";

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, List<Object>> f24269b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, x> f24270c;

    public C1068a() {
        super(x.F());
        this.f24269b = new HashMap();
        this.f24270c = new HashMap();
    }

    private void p(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(f24267e);
        sb.append(obj2);
        sb.append(f24268f);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void a(com.amazonaws.metrics.f fVar, Object obj) {
        b(fVar.name(), obj);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void b(String str, Object obj) {
        List<Object> list = this.f24269b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f24269b.put(str, list);
        }
        list.add(obj);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void c(com.amazonaws.metrics.f fVar) {
        d(fVar.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void d(String str) {
        x xVar = this.f24270c.get(str);
        if (xVar == null) {
            LogFactory.c(getClass()).m("Trying to end an event which was never started: " + str);
            return;
        }
        xVar.c();
        this.f24253a.a(str, x.I(xVar.q(), Long.valueOf(xVar.k())));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public List<Object> e(com.amazonaws.metrics.f fVar) {
        return f(fVar.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public List<Object> f(String str) {
        return this.f24269b.get(str);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void h(com.amazonaws.metrics.f fVar) {
        i(fVar.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void i(String str) {
        this.f24253a.w(str);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final boolean j() {
        return true;
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void k() {
        if (f24266d.h()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, List<Object>> entry : this.f24269b.entrySet()) {
                p(entry.getKey(), entry.getValue(), sb);
            }
            for (Map.Entry<String, Number> entry2 : this.f24253a.d().entrySet()) {
                p(entry2.getKey(), entry2.getValue(), sb);
            }
            for (Map.Entry<String, List<x>> entry3 : this.f24253a.t().entrySet()) {
                p(entry3.getKey(), entry3.getValue(), sb);
            }
            f24266d.i(sb.toString());
        }
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void l(com.amazonaws.metrics.f fVar, long j4) {
        m(fVar.name(), j4);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void m(String str, long j4) {
        this.f24253a.B(str, j4);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void n(com.amazonaws.metrics.f fVar) {
        o(fVar.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public void o(String str) {
        this.f24270c.put(str, x.G(System.nanoTime()));
    }
}

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1363c {

    /* renamed from: a, reason: collision with root package name */
    private C1355b f29596a;

    /* renamed from: b, reason: collision with root package name */
    private C1355b f29597b;

    /* renamed from: c, reason: collision with root package name */
    private final List f29598c;

    public C1363c() {
        this.f29596a = new C1355b("", 0L, null);
        this.f29597b = new C1355b("", 0L, null);
        this.f29598c = new ArrayList();
    }

    public final C1355b a() {
        return this.f29596a;
    }

    public final C1355b b() {
        return this.f29597b;
    }

    public final List c() {
        return this.f29598c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1363c c1363c = new C1363c(this.f29596a.clone());
        Iterator it = this.f29598c.iterator();
        while (it.hasNext()) {
            c1363c.f29598c.add(((C1355b) it.next()).clone());
        }
        return c1363c;
    }

    public final void d(C1355b c1355b) {
        this.f29596a = c1355b;
        this.f29597b = c1355b.clone();
        this.f29598c.clear();
    }

    public final void e(String str, long j4, Map map) {
        this.f29598c.add(new C1355b(str, j4, map));
    }

    public final void f(C1355b c1355b) {
        this.f29597b = c1355b;
    }

    public C1363c(C1355b c1355b) {
        this.f29596a = c1355b;
        this.f29597b = c1355b.clone();
        this.f29598c = new ArrayList();
    }
}

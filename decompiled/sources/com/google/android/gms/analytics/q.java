package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final t f27811a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1306g f27812b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27813c;

    /* renamed from: d, reason: collision with root package name */
    private long f27814d;

    /* renamed from: e, reason: collision with root package name */
    private long f27815e;

    /* renamed from: f, reason: collision with root package name */
    private long f27816f;

    /* renamed from: g, reason: collision with root package name */
    private long f27817g;

    /* renamed from: h, reason: collision with root package name */
    private long f27818h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27819i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f27820j;

    /* renamed from: k, reason: collision with root package name */
    private final List f27821k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(q qVar) {
        this.f27811a = qVar.f27811a;
        this.f27812b = qVar.f27812b;
        this.f27814d = qVar.f27814d;
        this.f27815e = qVar.f27815e;
        this.f27816f = qVar.f27816f;
        this.f27817g = qVar.f27817g;
        this.f27818h = qVar.f27818h;
        this.f27821k = new ArrayList(qVar.f27821k);
        this.f27820j = new HashMap(qVar.f27820j.size());
        for (Map.Entry entry : qVar.f27820j.entrySet()) {
            s n4 = n((Class) entry.getKey());
            ((s) entry.getValue()).zzc(n4);
            this.f27820j.put((Class) entry.getKey(), n4);
        }
    }

    @TargetApi(19)
    private static s n(Class cls) {
        try {
            return (s) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e4) {
            if (!(e4 instanceof InstantiationException)) {
                if (!(e4 instanceof IllegalAccessException)) {
                    if (e4 instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e4);
                    }
                    throw new RuntimeException(e4);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e4);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e4);
        }
    }

    @com.google.android.gms.common.util.D
    public final long a() {
        return this.f27814d;
    }

    @com.google.android.gms.common.util.D
    public final s b(Class cls) {
        s sVar = (s) this.f27820j.get(cls);
        if (sVar == null) {
            s n4 = n(cls);
            this.f27820j.put(cls, n4);
            return n4;
        }
        return sVar;
    }

    @P
    @com.google.android.gms.common.util.D
    public final s c(Class cls) {
        return (s) this.f27820j.get(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final t d() {
        return this.f27811a;
    }

    @com.google.android.gms.common.util.D
    public final Collection e() {
        return this.f27820j.values();
    }

    public final List f() {
        return this.f27821k;
    }

    @com.google.android.gms.common.util.D
    public final void g(s sVar) {
        C1285y.l(sVar);
        Class<?> cls = sVar.getClass();
        if (cls.getSuperclass() == s.class) {
            sVar.zzc(b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final void h() {
        this.f27819i = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final void i() {
        this.f27816f = this.f27812b.c();
        long j4 = this.f27815e;
        if (j4 != 0) {
            this.f27814d = j4;
        } else {
            this.f27814d = this.f27812b.a();
        }
        this.f27813c = true;
    }

    @com.google.android.gms.common.util.D
    public final void j(long j4) {
        this.f27815e = j4;
    }

    @com.google.android.gms.common.util.D
    public final void k() {
        this.f27811a.b().k(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final boolean l() {
        return this.f27819i;
    }

    @com.google.android.gms.common.util.D
    public final boolean m() {
        return this.f27813c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public q(t tVar, InterfaceC1306g interfaceC1306g) {
        C1285y.l(tVar);
        C1285y.l(interfaceC1306g);
        this.f27811a = tVar;
        this.f27812b = interfaceC1306g;
        this.f27817g = 1800000L;
        this.f27818h = 3024000000L;
        this.f27820j = new HashMap();
        this.f27821k = new ArrayList();
    }
}

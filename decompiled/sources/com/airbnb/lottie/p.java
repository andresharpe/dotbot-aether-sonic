package com.airbnb.lottie;

import androidx.annotation.P;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p<V> {

    /* renamed from: a, reason: collision with root package name */
    @P
    private final V f21853a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final Throwable f21854b;

    public p(V v3) {
        this.f21853a = v3;
        this.f21854b = null;
    }

    @P
    public Throwable a() {
        return this.f21854b;
    }

    @P
    public V b() {
        return this.f21853a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (b() != null && b().equals(pVar.b())) {
            return true;
        }
        if (a() == null || pVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public p(Throwable th) {
        this.f21854b = th;
        this.f21853a = null;
    }
}

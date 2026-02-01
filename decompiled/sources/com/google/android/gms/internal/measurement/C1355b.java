package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1355b {

    /* renamed from: a, reason: collision with root package name */
    private String f29589a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29590b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f29591c;

    public C1355b(String str, long j4, Map map) {
        this.f29589a = str;
        this.f29590b = j4;
        HashMap hashMap = new HashMap();
        this.f29591c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.f29590b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1355b clone() {
        return new C1355b(this.f29589a, this.f29590b, new HashMap(this.f29591c));
    }

    public final Object c(String str) {
        if (this.f29591c.containsKey(str)) {
            return this.f29591c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f29589a;
    }

    public final Map e() {
        return this.f29591c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1355b)) {
            return false;
        }
        C1355b c1355b = (C1355b) obj;
        if (this.f29590b != c1355b.f29590b || !this.f29589a.equals(c1355b.f29589a)) {
            return false;
        }
        return this.f29591c.equals(c1355b.f29591c);
    }

    public final void f(String str) {
        this.f29589a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f29591c.remove(str);
        } else {
            this.f29591c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f29589a.hashCode();
        long j4 = this.f29590b;
        return (((hashCode * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f29591c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f29589a + "', timestamp=" + this.f29590b + ", params=" + this.f29591c.toString() + "}";
    }
}

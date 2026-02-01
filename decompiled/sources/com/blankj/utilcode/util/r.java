package com.blankj.utilcode.util;

import java.util.HashMap;
import java.util.Map;
import r0.InterfaceC2401a;

/* loaded from: classes.dex */
public final class r implements InterfaceC2401a {

    /* renamed from: g, reason: collision with root package name */
    private static final int f25106g = 256;

    /* renamed from: h, reason: collision with root package name */
    private static final Map<String, r> f25107h = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f25108e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.collection.j<String, a> f25109f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        long f25110a;

        /* renamed from: b, reason: collision with root package name */
        Object f25111b;

        a(long j4, Object obj) {
            this.f25110a = j4;
            this.f25111b = obj;
        }
    }

    private r(String str, androidx.collection.j<String, a> jVar) {
        this.f25108e = str;
        this.f25109f = jVar;
    }

    public static r e() {
        return f(256);
    }

    public static r f(int i4) {
        return g(String.valueOf(i4), i4);
    }

    public static r g(String str, int i4) {
        Map<String, r> map = f25107h;
        r rVar = map.get(str);
        if (rVar == null) {
            synchronized (r.class) {
                try {
                    rVar = map.get(str);
                    if (rVar == null) {
                        rVar = new r(str, new androidx.collection.j(i4));
                        map.put(str, rVar);
                    }
                } finally {
                }
            }
        }
        return rVar;
    }

    public void a() {
        this.f25109f.d();
    }

    public <T> T b(@androidx.annotation.N String str) {
        return (T) c(str, null);
    }

    public <T> T c(@androidx.annotation.N String str, T t3) {
        a f4 = this.f25109f.f(str);
        if (f4 == null) {
            return t3;
        }
        long j4 = f4.f25110a;
        if (j4 != -1 && j4 < System.currentTimeMillis()) {
            this.f25109f.l(str);
            return t3;
        }
        return (T) f4.f25111b;
    }

    public int d() {
        return this.f25109f.o();
    }

    public void h(@androidx.annotation.N String str, Object obj) {
        i(str, obj, -1);
    }

    public void i(@androidx.annotation.N String str, Object obj, int i4) {
        long currentTimeMillis;
        if (obj == null) {
            return;
        }
        if (i4 < 0) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() + (i4 * 1000);
        }
        this.f25109f.j(str, new a(currentTimeMillis, obj));
    }

    public Object j(@androidx.annotation.N String str) {
        a l4 = this.f25109f.l(str);
        if (l4 == null) {
            return null;
        }
        return l4.f25111b;
    }

    public String toString() {
        return this.f25108e + "@" + Integer.toHexString(hashCode());
    }
}

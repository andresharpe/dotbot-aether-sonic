package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.P;
import com.bumptech.glide.load.engine.bitmap_recycle.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h<K extends n, V> {

    /* renamed from: a, reason: collision with root package name */
    private final a<K, V> f25889a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f25890b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f25891a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f25892b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f25893c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f25894d;

        a() {
            this(null);
        }

        public void a(V v3) {
            if (this.f25892b == null) {
                this.f25892b = new ArrayList();
            }
            this.f25892b.add(v3);
        }

        @P
        public V b() {
            int c4 = c();
            if (c4 > 0) {
                return this.f25892b.remove(c4 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f25892b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k4) {
            this.f25894d = this;
            this.f25893c = this;
            this.f25891a = k4;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f25889a;
        aVar.f25894d = aVar2;
        aVar.f25893c = aVar2.f25893c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f25889a;
        aVar.f25894d = aVar2.f25894d;
        aVar.f25893c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f25894d;
        aVar2.f25893c = aVar.f25893c;
        aVar.f25893c.f25894d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f25893c.f25894d = aVar;
        aVar.f25894d.f25893c = aVar;
    }

    @P
    public V a(K k4) {
        a<K, V> aVar = this.f25890b.get(k4);
        if (aVar == null) {
            aVar = new a<>(k4);
            this.f25890b.put(k4, aVar);
        } else {
            k4.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k4, V v3) {
        a<K, V> aVar = this.f25890b.get(k4);
        if (aVar == null) {
            aVar = new a<>(k4);
            c(aVar);
            this.f25890b.put(k4, aVar);
        } else {
            k4.a();
        }
        aVar.a(v3);
    }

    @P
    public V f() {
        for (a aVar = this.f25889a.f25894d; !aVar.equals(this.f25889a); aVar = aVar.f25894d) {
            V v3 = (V) aVar.b();
            if (v3 != null) {
                return v3;
            }
            e(aVar);
            this.f25890b.remove(aVar.f25891a);
            ((n) aVar.f25891a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f25889a.f25893c;
        boolean z3 = false;
        while (!aVar.equals(this.f25889a)) {
            sb.append('{');
            sb.append(aVar.f25891a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
            aVar = aVar.f25893c;
            z3 = true;
        }
        if (z3) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}

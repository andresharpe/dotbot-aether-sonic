package com.airbnb.lottie.parser.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: M, reason: collision with root package name */
    private static final Comparator<Comparable> f21952M = new a();

    /* renamed from: N, reason: collision with root package name */
    static final /* synthetic */ boolean f21953N = false;

    /* renamed from: E, reason: collision with root package name */
    Comparator<? super K> f21954E;

    /* renamed from: F, reason: collision with root package name */
    g<K, V>[] f21955F;

    /* renamed from: G, reason: collision with root package name */
    final g<K, V> f21956G;

    /* renamed from: H, reason: collision with root package name */
    int f21957H;

    /* renamed from: I, reason: collision with root package name */
    int f21958I;

    /* renamed from: J, reason: collision with root package name */
    int f21959J;

    /* renamed from: K, reason: collision with root package name */
    private e<K, V>.d f21960K;

    /* renamed from: L, reason: collision with root package name */
    private e<K, V>.C0200e f21961L;

    /* loaded from: classes.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f21962a;

        /* renamed from: b, reason: collision with root package name */
        private int f21963b;

        /* renamed from: c, reason: collision with root package name */
        private int f21964c;

        /* renamed from: d, reason: collision with root package name */
        private int f21965d;

        b() {
        }

        void a(g<K, V> gVar) {
            gVar.f21977G = null;
            gVar.f21975E = null;
            gVar.f21976F = null;
            gVar.f21983M = 1;
            int i4 = this.f21963b;
            if (i4 > 0) {
                int i5 = this.f21965d;
                if ((i5 & 1) == 0) {
                    this.f21965d = i5 + 1;
                    this.f21963b = i4 - 1;
                    this.f21964c++;
                }
            }
            gVar.f21975E = this.f21962a;
            this.f21962a = gVar;
            int i6 = this.f21965d;
            int i7 = i6 + 1;
            this.f21965d = i7;
            int i8 = this.f21963b;
            if (i8 > 0 && (i7 & 1) == 0) {
                this.f21965d = i6 + 2;
                this.f21963b = i8 - 1;
                this.f21964c++;
            }
            int i9 = 4;
            while (true) {
                int i10 = i9 - 1;
                if ((this.f21965d & i10) == i10) {
                    int i11 = this.f21964c;
                    if (i11 == 0) {
                        g<K, V> gVar2 = this.f21962a;
                        g<K, V> gVar3 = gVar2.f21975E;
                        g<K, V> gVar4 = gVar3.f21975E;
                        gVar3.f21975E = gVar4.f21975E;
                        this.f21962a = gVar3;
                        gVar3.f21976F = gVar4;
                        gVar3.f21977G = gVar2;
                        gVar3.f21983M = gVar2.f21983M + 1;
                        gVar4.f21975E = gVar3;
                        gVar2.f21975E = gVar3;
                    } else if (i11 == 1) {
                        g<K, V> gVar5 = this.f21962a;
                        g<K, V> gVar6 = gVar5.f21975E;
                        this.f21962a = gVar6;
                        gVar6.f21977G = gVar5;
                        gVar6.f21983M = gVar5.f21983M + 1;
                        gVar5.f21975E = gVar6;
                        this.f21964c = 0;
                    } else if (i11 == 2) {
                        this.f21964c = 0;
                    }
                    i9 *= 2;
                } else {
                    return;
                }
            }
        }

        void b(int i4) {
            this.f21963b = ((Integer.highestOneBit(i4) * 2) - 1) - i4;
            this.f21965d = 0;
            this.f21964c = 0;
            this.f21962a = null;
        }

        g<K, V> c() {
            g<K, V> gVar = this.f21962a;
            if (gVar.f21975E == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private g<K, V> f21966a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f21966a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f21975E;
            gVar.f21975E = null;
            g<K, V> gVar3 = gVar.f21977G;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.f21975E = gVar4;
                    gVar3 = gVar2.f21976F;
                } else {
                    this.f21966a = gVar4;
                    return gVar;
                }
            }
        }

        void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f21975E = gVar2;
                gVar2 = gVar;
                gVar = gVar.f21976F;
            }
            this.f21966a = gVar2;
        }
    }

    /* loaded from: classes.dex */
    final class d extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        class a extends e<K, V>.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && e.this.i((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> i4;
            if (!(obj instanceof Map.Entry) || (i4 = e.this.i((Map.Entry) obj)) == null) {
                return false;
            }
            e.this.l(i4, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e.this.f21957H;
        }
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    final class C0200e extends AbstractSet<K> {

        /* renamed from: com.airbnb.lottie.parser.moshi.e$e$a */
        /* loaded from: classes.dex */
        class a extends e<K, V>.f<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f21980J;
            }
        }

        C0200e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return e.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (e.this.m(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e.this.f21957H;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: E, reason: collision with root package name */
        g<K, V> f21971E;

        /* renamed from: F, reason: collision with root package name */
        g<K, V> f21972F = null;

        /* renamed from: G, reason: collision with root package name */
        int f21973G;

        f() {
            this.f21971E = e.this.f21956G.f21978H;
            this.f21973G = e.this.f21958I;
        }

        final g<K, V> a() {
            g<K, V> gVar = this.f21971E;
            e eVar = e.this;
            if (gVar != eVar.f21956G) {
                if (eVar.f21958I == this.f21973G) {
                    this.f21971E = gVar.f21978H;
                    this.f21972F = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f21971E != e.this.f21956G) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f21972F;
            if (gVar != null) {
                e.this.l(gVar, true);
                this.f21972F = null;
                this.f21973G = e.this.f21958I;
                return;
            }
            throw new IllegalStateException();
        }
    }

    e() {
        this(null);
    }

    private void a() {
        g<K, V>[] c4 = c(this.f21955F);
        this.f21955F = c4;
        this.f21959J = (c4.length / 2) + (c4.length / 4);
    }

    static <K, V> g<K, V>[] c(g<K, V>[] gVarArr) {
        g<K, V> gVar;
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i4 = 0; i4 < length; i4++) {
            g<K, V> gVar2 = gVarArr[i4];
            if (gVar2 != null) {
                cVar.b(gVar2);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    g<K, V> a4 = cVar.a();
                    if (a4 == null) {
                        break;
                    }
                    if ((a4.f21981K & length) == 0) {
                        i5++;
                    } else {
                        i6++;
                    }
                }
                bVar.b(i5);
                bVar2.b(i6);
                cVar.b(gVar2);
                while (true) {
                    g<K, V> a5 = cVar.a();
                    if (a5 == null) {
                        break;
                    }
                    if ((a5.f21981K & length) == 0) {
                        bVar.a(a5);
                    } else {
                        bVar2.a(a5);
                    }
                }
                g<K, V> gVar3 = null;
                if (i5 > 0) {
                    gVar = bVar.c();
                } else {
                    gVar = null;
                }
                gVarArr2[i4] = gVar;
                int i7 = i4 + length;
                if (i6 > 0) {
                    gVar3 = bVar2.c();
                }
                gVarArr2[i7] = gVar3;
            }
        }
        return gVarArr2;
    }

    private boolean e(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void k(g<K, V> gVar, boolean z3) {
        int i4;
        int i5;
        int i6;
        int i7;
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f21976F;
            g<K, V> gVar3 = gVar.f21977G;
            int i8 = 0;
            if (gVar2 != null) {
                i4 = gVar2.f21983M;
            } else {
                i4 = 0;
            }
            if (gVar3 != null) {
                i5 = gVar3.f21983M;
            } else {
                i5 = 0;
            }
            int i9 = i4 - i5;
            if (i9 == -2) {
                g<K, V> gVar4 = gVar3.f21976F;
                g<K, V> gVar5 = gVar3.f21977G;
                if (gVar5 != null) {
                    i7 = gVar5.f21983M;
                } else {
                    i7 = 0;
                }
                if (gVar4 != null) {
                    i8 = gVar4.f21983M;
                }
                int i10 = i8 - i7;
                if (i10 != -1 && (i10 != 0 || z3)) {
                    p(gVar3);
                    o(gVar);
                } else {
                    o(gVar);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 2) {
                g<K, V> gVar6 = gVar2.f21976F;
                g<K, V> gVar7 = gVar2.f21977G;
                if (gVar7 != null) {
                    i6 = gVar7.f21983M;
                } else {
                    i6 = 0;
                }
                if (gVar6 != null) {
                    i8 = gVar6.f21983M;
                }
                int i11 = i8 - i6;
                if (i11 != 1 && (i11 != 0 || z3)) {
                    o(gVar2);
                    p(gVar);
                } else {
                    p(gVar);
                }
                if (z3) {
                    return;
                }
            } else if (i9 == 0) {
                gVar.f21983M = i4 + 1;
                if (z3) {
                    return;
                }
            } else {
                gVar.f21983M = Math.max(i4, i5) + 1;
                if (!z3) {
                    return;
                }
            }
            gVar = gVar.f21975E;
        }
    }

    private void n(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f21975E;
        gVar.f21975E = null;
        if (gVar2 != null) {
            gVar2.f21975E = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.f21976F == gVar) {
                gVar3.f21976F = gVar2;
                return;
            } else {
                gVar3.f21977G = gVar2;
                return;
            }
        }
        int i4 = gVar.f21981K;
        this.f21955F[i4 & (r0.length - 1)] = gVar2;
    }

    private void o(g<K, V> gVar) {
        int i4;
        int i5;
        g<K, V> gVar2 = gVar.f21976F;
        g<K, V> gVar3 = gVar.f21977G;
        g<K, V> gVar4 = gVar3.f21976F;
        g<K, V> gVar5 = gVar3.f21977G;
        gVar.f21977G = gVar4;
        if (gVar4 != null) {
            gVar4.f21975E = gVar;
        }
        n(gVar, gVar3);
        gVar3.f21976F = gVar;
        gVar.f21975E = gVar3;
        int i6 = 0;
        if (gVar2 != null) {
            i4 = gVar2.f21983M;
        } else {
            i4 = 0;
        }
        if (gVar4 != null) {
            i5 = gVar4.f21983M;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        gVar.f21983M = max;
        if (gVar5 != null) {
            i6 = gVar5.f21983M;
        }
        gVar3.f21983M = Math.max(max, i6) + 1;
    }

    private void p(g<K, V> gVar) {
        int i4;
        int i5;
        g<K, V> gVar2 = gVar.f21976F;
        g<K, V> gVar3 = gVar.f21977G;
        g<K, V> gVar4 = gVar2.f21976F;
        g<K, V> gVar5 = gVar2.f21977G;
        gVar.f21976F = gVar5;
        if (gVar5 != null) {
            gVar5.f21975E = gVar;
        }
        n(gVar, gVar2);
        gVar2.f21977G = gVar;
        gVar.f21975E = gVar2;
        int i6 = 0;
        if (gVar3 != null) {
            i4 = gVar3.f21983M;
        } else {
            i4 = 0;
        }
        if (gVar5 != null) {
            i5 = gVar5.f21983M;
        } else {
            i5 = 0;
        }
        int max = Math.max(i4, i5) + 1;
        gVar.f21983M = max;
        if (gVar4 != null) {
            i6 = gVar4.f21983M;
        }
        gVar2.f21983M = Math.max(max, i6) + 1;
    }

    private static int q(int i4) {
        int i5 = i4 ^ ((i4 >>> 20) ^ (i4 >>> 12));
        return (i5 >>> 4) ^ ((i5 >>> 7) ^ i5);
    }

    private Object r() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f21955F, (Object) null);
        this.f21957H = 0;
        this.f21958I++;
        g<K, V> gVar = this.f21956G;
        g<K, V> gVar2 = gVar.f21978H;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f21978H;
            gVar2.f21979I = null;
            gVar2.f21978H = null;
            gVar2 = gVar3;
        }
        gVar.f21979I = gVar;
        gVar.f21978H = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (j(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e<K, V>.d dVar = this.f21960K;
        if (dVar == null) {
            e<K, V>.d dVar2 = new d();
            this.f21960K = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> j4 = j(obj);
        if (j4 != null) {
            return j4.f21982L;
        }
        return null;
    }

    g<K, V> h(K k4, boolean z3) {
        int i4;
        g<K, V> gVar;
        Comparable comparable;
        g<K, V> gVar2;
        Comparator<? super K> comparator = this.f21954E;
        g<K, V>[] gVarArr = this.f21955F;
        int q4 = q(k4.hashCode());
        int length = (gVarArr.length - 1) & q4;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            if (comparator == f21952M) {
                comparable = (Comparable) k4;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i4 = comparable.compareTo(gVar3.f21980J);
                } else {
                    i4 = comparator.compare(k4, gVar3.f21980J);
                }
                if (i4 == 0) {
                    return gVar3;
                }
                if (i4 < 0) {
                    gVar2 = gVar3.f21976F;
                } else {
                    gVar2 = gVar3.f21977G;
                }
                if (gVar2 == null) {
                    break;
                }
                gVar3 = gVar2;
            }
        } else {
            i4 = 0;
        }
        g<K, V> gVar4 = gVar3;
        int i5 = i4;
        if (!z3) {
            return null;
        }
        g<K, V> gVar5 = this.f21956G;
        if (gVar4 == null) {
            if (comparator == f21952M && !(k4 instanceof Comparable)) {
                throw new ClassCastException(k4.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar4, k4, q4, gVar5, gVar5.f21979I);
            gVarArr[length] = gVar;
        } else {
            gVar = new g<>(gVar4, k4, q4, gVar5, gVar5.f21979I);
            if (i5 < 0) {
                gVar4.f21976F = gVar;
            } else {
                gVar4.f21977G = gVar;
            }
            k(gVar4, true);
        }
        int i6 = this.f21957H;
        this.f21957H = i6 + 1;
        if (i6 > this.f21959J) {
            a();
        }
        this.f21958I++;
        return gVar;
    }

    g<K, V> i(Map.Entry<?, ?> entry) {
        g<K, V> j4 = j(entry.getKey());
        if (j4 == null || !e(j4.f21982L, entry.getValue())) {
            return null;
        }
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    g<K, V> j(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return h(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        e<K, V>.C0200e c0200e = this.f21961L;
        if (c0200e == null) {
            e<K, V>.C0200e c0200e2 = new C0200e();
            this.f21961L = c0200e2;
            return c0200e2;
        }
        return c0200e;
    }

    void l(g<K, V> gVar, boolean z3) {
        g<K, V> a4;
        int i4;
        if (z3) {
            g<K, V> gVar2 = gVar.f21979I;
            gVar2.f21978H = gVar.f21978H;
            gVar.f21978H.f21979I = gVar2;
            gVar.f21979I = null;
            gVar.f21978H = null;
        }
        g<K, V> gVar3 = gVar.f21976F;
        g<K, V> gVar4 = gVar.f21977G;
        g<K, V> gVar5 = gVar.f21975E;
        int i5 = 0;
        if (gVar3 != null && gVar4 != null) {
            if (gVar3.f21983M > gVar4.f21983M) {
                a4 = gVar3.b();
            } else {
                a4 = gVar4.a();
            }
            l(a4, false);
            g<K, V> gVar6 = gVar.f21976F;
            if (gVar6 != null) {
                i4 = gVar6.f21983M;
                a4.f21976F = gVar6;
                gVar6.f21975E = a4;
                gVar.f21976F = null;
            } else {
                i4 = 0;
            }
            g<K, V> gVar7 = gVar.f21977G;
            if (gVar7 != null) {
                i5 = gVar7.f21983M;
                a4.f21977G = gVar7;
                gVar7.f21975E = a4;
                gVar.f21977G = null;
            }
            a4.f21983M = Math.max(i4, i5) + 1;
            n(gVar, a4);
            return;
        }
        if (gVar3 != null) {
            n(gVar, gVar3);
            gVar.f21976F = null;
        } else if (gVar4 != null) {
            n(gVar, gVar4);
            gVar.f21977G = null;
        } else {
            n(gVar, null);
        }
        k(gVar5, false);
        this.f21957H--;
        this.f21958I++;
    }

    g<K, V> m(Object obj) {
        g<K, V> j4 = j(obj);
        if (j4 != null) {
            l(j4, true);
        }
        return j4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k4, V v3) {
        if (k4 != null) {
            g<K, V> h4 = h(k4, true);
            V v4 = h4.f21982L;
            h4.f21982L = v3;
            return v4;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> m4 = m(obj);
        if (m4 != null) {
            return m4.f21982L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f21957H;
    }

    e(Comparator<? super K> comparator) {
        this.f21957H = 0;
        this.f21958I = 0;
        this.f21954E = comparator == null ? f21952M : comparator;
        this.f21956G = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f21955F = gVarArr;
        this.f21959J = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: E, reason: collision with root package name */
        g<K, V> f21975E;

        /* renamed from: F, reason: collision with root package name */
        g<K, V> f21976F;

        /* renamed from: G, reason: collision with root package name */
        g<K, V> f21977G;

        /* renamed from: H, reason: collision with root package name */
        g<K, V> f21978H;

        /* renamed from: I, reason: collision with root package name */
        g<K, V> f21979I;

        /* renamed from: J, reason: collision with root package name */
        final K f21980J;

        /* renamed from: K, reason: collision with root package name */
        final int f21981K;

        /* renamed from: L, reason: collision with root package name */
        V f21982L;

        /* renamed from: M, reason: collision with root package name */
        int f21983M;

        g() {
            this.f21980J = null;
            this.f21981K = -1;
            this.f21979I = this;
            this.f21978H = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f21976F; gVar2 != null; gVar2 = gVar2.f21976F) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f21977G; gVar2 != null; gVar2 = gVar2.f21977G) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k4 = this.f21980J;
            if (k4 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k4.equals(entry.getKey())) {
                return false;
            }
            V v3 = this.f21982L;
            if (v3 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v3.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f21980J;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f21982L;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k4 = this.f21980J;
            int i4 = 0;
            if (k4 == null) {
                hashCode = 0;
            } else {
                hashCode = k4.hashCode();
            }
            V v3 = this.f21982L;
            if (v3 != null) {
                i4 = v3.hashCode();
            }
            return hashCode ^ i4;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            V v4 = this.f21982L;
            this.f21982L = v3;
            return v4;
        }

        public String toString() {
            return this.f21980J + "=" + this.f21982L;
        }

        g(g<K, V> gVar, K k4, int i4, g<K, V> gVar2, g<K, V> gVar3) {
            this.f21975E = gVar;
            this.f21980J = k4;
            this.f21981K = i4;
            this.f21983M = 1;
            this.f21978H = gVar2;
            this.f21979I = gVar3;
            gVar3.f21978H = this;
            gVar2.f21979I = this;
        }
    }
}

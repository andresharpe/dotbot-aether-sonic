package kotlinx.coroutines.debug.internal;

import X2.p;
import Y2.g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.H0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.AbstractC2092g;
import kotlin.collections.AbstractC2093h;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.u;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class c<K, V> extends AbstractC2092g<K, V> {

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f53399F = AtomicIntegerFieldUpdater.newUpdater(c.class, "_size");

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private final ReferenceQueue<K> f53400E;

    @l3.d
    private volatile /* synthetic */ int _size;

    @l3.d
    volatile /* synthetic */ Object core;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f53401g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* renamed from: a, reason: collision with root package name */
        private final int f53402a;

        /* renamed from: b, reason: collision with root package name */
        private final int f53403b;

        /* renamed from: c, reason: collision with root package name */
        private final int f53404c;

        /* renamed from: d, reason: collision with root package name */
        @l3.d
        /* synthetic */ AtomicReferenceArray f53405d;

        /* renamed from: e, reason: collision with root package name */
        @l3.d
        /* synthetic */ AtomicReferenceArray f53406e;

        @l3.d
        private volatile /* synthetic */ int load = 0;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: kotlinx.coroutines.debug.internal.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0481a<E> implements Iterator<E>, Y2.d {

            /* renamed from: E, reason: collision with root package name */
            @l3.d
            private final p<K, V, E> f53408E;

            /* renamed from: F, reason: collision with root package name */
            private int f53409F = -1;

            /* renamed from: G, reason: collision with root package name */
            private K f53410G;

            /* renamed from: H, reason: collision with root package name */
            private V f53411H;

            /* JADX WARN: Multi-variable type inference failed */
            public C0481a(@l3.d p<? super K, ? super V, ? extends E> pVar) {
                this.f53408E = pVar;
                b();
            }

            private final void b() {
                K k4;
                while (true) {
                    int i4 = this.f53409F + 1;
                    this.f53409F = i4;
                    if (i4 < ((a) a.this).f53402a) {
                        j jVar = (j) a.this.f53405d.get(this.f53409F);
                        if (jVar != null && (k4 = (K) jVar.get()) != null) {
                            this.f53410G = k4;
                            Object obj = (V) a.this.f53406e.get(this.f53409F);
                            if (obj instanceof k) {
                                obj = (V) ((k) obj).f53452a;
                            }
                            if (obj != null) {
                                this.f53411H = (V) obj;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @Override // java.util.Iterator
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                kotlinx.coroutines.debug.internal.d.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f53409F < ((a) a.this).f53402a) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f53409F < ((a) a.this).f53402a) {
                    p<K, V, E> pVar = this.f53408E;
                    K k4 = this.f53410G;
                    if (k4 == false) {
                        F.S("key");
                        k4 = (K) H0.f51801a;
                    }
                    V v3 = this.f53411H;
                    if (v3 == false) {
                        F.S("value");
                        v3 = (V) H0.f51801a;
                    }
                    E e4 = (E) pVar.c0(k4, v3);
                    b();
                    return e4;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i4) {
            this.f53402a = i4;
            this.f53403b = Integer.numberOfLeadingZeros(i4) + 1;
            this.f53404c = (i4 * 2) / 3;
            this.f53405d = new AtomicReferenceArray(i4);
            this.f53406e = new AtomicReferenceArray(i4);
        }

        private final int d(int i4) {
            return (i4 * (-1640531527)) >>> this.f53403b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, j jVar, int i4, Object obj3) {
            if ((i4 & 4) != 0) {
                jVar = null;
            }
            return aVar.f(obj, obj2, jVar);
        }

        private final void i(int i4) {
            Object obj;
            do {
                obj = this.f53406e.get(i4);
                if (obj == null || (obj instanceof k)) {
                    return;
                }
            } while (!kotlinx.coroutines.debug.internal.b.a(this.f53406e, i4, obj, null));
            c.this.m();
        }

        public final void b(@l3.d j<?> jVar) {
            int d4 = d(jVar.f53451a);
            while (true) {
                j<?> jVar2 = (j) this.f53405d.get(d4);
                if (jVar2 == null) {
                    return;
                }
                if (jVar2 == jVar) {
                    i(d4);
                    return;
                } else {
                    if (d4 == 0) {
                        d4 = this.f53402a;
                    }
                    d4--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l3.e
        public final V c(@l3.d K k4) {
            int d4 = d(k4.hashCode());
            while (true) {
                j jVar = (j) this.f53405d.get(d4);
                if (jVar == null) {
                    return null;
                }
                T t3 = jVar.get();
                if (F.g(k4, t3)) {
                    V v3 = (V) this.f53406e.get(d4);
                    if (v3 instanceof k) {
                        return (V) ((k) v3).f53452a;
                    }
                    return v3;
                }
                if (t3 == 0) {
                    i(d4);
                }
                if (d4 == 0) {
                    d4 = this.f53402a;
                }
                d4--;
            }
        }

        @l3.d
        public final <E> Iterator<E> e(@l3.d p<? super K, ? super V, ? extends E> pVar) {
            return new C0481a(pVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            r6 = r5.f53406e.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.k) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (kotlinx.coroutines.debug.internal.b.a(r5.f53406e, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.d.f53421c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0017, code lost:
        
            if (r1 == false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0019, code lost:
        
            r1 = r5.load;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
        
            if (r1 < r5.f53404c) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x002c, code lost:
        
            if (kotlinx.coroutines.debug.internal.c.a.f53401g.compareAndSet(r5, r1, r1 + 1) != false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x002f, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x001f, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.d.f53421c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0023, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0030, code lost:
        
            if (r8 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
        
            r8 = new kotlinx.coroutines.debug.internal.j<>(r6, ((kotlinx.coroutines.debug.internal.c) r5.f53407f).f53400E);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0043, code lost:
        
            if (kotlinx.coroutines.debug.internal.b.a(r5.f53405d, r0, null, r8) != false) goto L38;
         */
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object f(@l3.d K r6, @l3.e V r7, @l3.e kotlinx.coroutines.debug.internal.j<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.d(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f53405d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.j r2 = (kotlinx.coroutines.debug.internal.j) r2
                if (r2 != 0) goto L46
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L30
            L19:
                int r1 = r5.load
                int r3 = r5.f53404c
                if (r1 < r3) goto L24
                kotlinx.coroutines.internal.S r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L24:
                int r3 = r1 + 1
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.debug.internal.c.a.f53401g
                boolean r1 = r4.compareAndSet(r5, r1, r3)
                if (r1 != 0) goto L2f
                goto L19
            L2f:
                r1 = 1
            L30:
                if (r8 != 0) goto L3d
                kotlinx.coroutines.debug.internal.j r8 = new kotlinx.coroutines.debug.internal.j
                kotlinx.coroutines.debug.internal.c<K, V> r3 = kotlinx.coroutines.debug.internal.c.this
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.c.k(r3)
                r8.<init>(r6, r3)
            L3d:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f53405d
                boolean r2 = kotlinx.coroutines.debug.internal.b.a(r3, r0, r2, r8)
                if (r2 != 0) goto L57
                goto L9
            L46:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.F.g(r6, r2)
                if (r3 == 0) goto L6f
                if (r1 == 0) goto L57
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.c.a.f53401g
                r6.decrementAndGet(r5)
            L57:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.f53406e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.k
                if (r8 == 0) goto L66
                kotlinx.coroutines.internal.S r6 = kotlinx.coroutines.debug.internal.d.a()
                return r6
            L66:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.f53406e
                boolean r8 = kotlinx.coroutines.debug.internal.b.a(r8, r0, r6, r7)
                if (r8 == 0) goto L57
                return r6
            L6f:
                if (r2 != 0) goto L74
                r5.i(r0)
            L74:
                if (r0 != 0) goto L78
                int r0 = r5.f53402a
            L78:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.c.a.f(java.lang.Object, java.lang.Object, kotlinx.coroutines.debug.internal.j):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l3.d
        public final c<K, V>.a h() {
            int u3;
            Object obj;
            Object obj2;
            S s4;
            k d4;
            while (true) {
                u3 = u.u(c.this.size(), 4);
                c<K, V>.a aVar = (c<K, V>.a) new a(Integer.highestOneBit(u3) * 4);
                int i4 = this.f53402a;
                for (int i5 = 0; i5 < i4; i5++) {
                    j jVar = (j) this.f53405d.get(i5);
                    if (jVar != null) {
                        obj = jVar.get();
                    } else {
                        obj = null;
                    }
                    if (jVar != null && obj == null) {
                        i(i5);
                    }
                    while (true) {
                        obj2 = this.f53406e.get(i5);
                        if (obj2 instanceof k) {
                            obj2 = ((k) obj2).f53452a;
                            break;
                        }
                        AtomicReferenceArray atomicReferenceArray = this.f53406e;
                        d4 = kotlinx.coroutines.debug.internal.d.d(obj2);
                        if (kotlinx.coroutines.debug.internal.b.a(atomicReferenceArray, i5, obj2, d4)) {
                            break;
                        }
                    }
                    if (obj != null && obj2 != null) {
                        Object f4 = aVar.f(obj, obj2, jVar);
                        s4 = kotlinx.coroutines.debug.internal.d.f53421c;
                        if (f4 != s4) {
                        }
                    }
                }
                return aVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: E, reason: collision with root package name */
        private final K f53413E;

        /* renamed from: F, reason: collision with root package name */
        private final V f53414F;

        public b(K k4, V v3) {
            this.f53413E = k4;
            this.f53414F = v3;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f53413E;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f53414F;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v3) {
            kotlinx.coroutines.debug.internal.d.e();
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: kotlinx.coroutines.debug.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private final class C0482c<E> extends AbstractC2093h<E> {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final p<K, V, E> f53415E;

        /* JADX WARN: Multi-variable type inference failed */
        public C0482c(@l3.d p<? super K, ? super V, ? extends E> pVar) {
            this.f53415E = pVar;
        }

        @Override // kotlin.collections.AbstractC2093h, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e4) {
            kotlinx.coroutines.debug.internal.d.e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractC2093h
        public int b() {
            return c.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @l3.d
        public Iterator<E> iterator() {
            return ((a) c.this.core).e(this.f53415E);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements p<K, V, Map.Entry<K, V>> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f53417F = new d();

        d() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Map.Entry<K, V> c0(@l3.d K k4, @l3.d V v3) {
            return new b(k4, v3);
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements p<K, V, K> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f53418F = new e();

        e() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        public final K c0(@l3.d K k4, @l3.d V v3) {
            return k4;
        }
    }

    public c() {
        this(false, 1, null);
    }

    private final void l(j<?> jVar) {
        ((a) this.core).b(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        f53399F.decrementAndGet(this);
    }

    private final synchronized V n(K k4, V v3) {
        V v4;
        S s4;
        a aVar = (a) this.core;
        while (true) {
            v4 = (V) a.g(aVar, k4, v3, null, 4, null);
            s4 = kotlinx.coroutines.debug.internal.d.f53421c;
            if (v4 == s4) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return v4;
    }

    @Override // kotlin.collections.AbstractC2092g
    @l3.d
    public Set<Map.Entry<K, V>> c() {
        return new C0482c(d.f53417F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // kotlin.collections.AbstractC2092g
    @l3.d
    public Set<K> e() {
        return new C0482c(e.f53418F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @l3.e
    public V get(@l3.e Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) this.core).c(obj);
    }

    @Override // kotlin.collections.AbstractC2092g
    public int h() {
        return this._size;
    }

    public final void o() {
        if (this.f53400E != null) {
            while (true) {
                try {
                    Reference<? extends K> remove = this.f53400E.remove();
                    if (remove == null) {
                        break;
                    } else {
                        l((j) remove);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
    }

    @Override // kotlin.collections.AbstractC2092g, java.util.AbstractMap, java.util.Map
    @l3.e
    public V put(@l3.d K k4, @l3.d V v3) {
        S s4;
        V v4 = (V) a.g((a) this.core, k4, v3, null, 4, null);
        s4 = kotlinx.coroutines.debug.internal.d.f53421c;
        if (v4 == s4) {
            v4 = n(k4, v3);
        }
        if (v4 == null) {
            f53399F.incrementAndGet(this);
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @l3.e
    public V remove(@l3.e Object obj) {
        S s4;
        if (obj == 0) {
            return null;
        }
        V v3 = (V) a.g((a) this.core, obj, null, null, 4, null);
        s4 = kotlinx.coroutines.debug.internal.d.f53421c;
        if (v3 == s4) {
            v3 = n(obj, null);
        }
        if (v3 != null) {
            f53399F.decrementAndGet(this);
        }
        return v3;
    }

    public /* synthetic */ c(boolean z3, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? false : z3);
    }

    public c(boolean z3) {
        this._size = 0;
        this.core = new a(16);
        this.f53400E = z3 ? new ReferenceQueue<>() : null;
    }
}

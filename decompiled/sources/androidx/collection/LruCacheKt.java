package androidx.collection;

import X2.p;
import X2.r;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends j<K, V> {

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f6450i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ X2.l f6451j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ r f6452k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f6453l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, X2.l lVar, r rVar, int i4, int i5) {
            super(i5);
            this.f6450i = pVar;
            this.f6451j = lVar;
            this.f6452k = rVar;
            this.f6453l = i4;
        }

        @Override // androidx.collection.j
        @l3.e
        protected V a(@l3.d K key) {
            F.q(key, "key");
            return (V) this.f6451j.C(key);
        }

        @Override // androidx.collection.j
        protected void c(boolean z3, @l3.d K key, @l3.d V oldValue, @l3.e V v3) {
            F.q(key, "key");
            F.q(oldValue, "oldValue");
            this.f6452k.N(Boolean.valueOf(z3), key, oldValue, v3);
        }

        @Override // androidx.collection.j
        protected int p(@l3.d K key, @l3.d V value) {
            F.q(key, "key");
            F.q(value, "value");
            return ((Number) this.f6450i.c0(key, value)).intValue();
        }
    }

    @l3.d
    public static final <K, V> j<K, V> a(int i4, @l3.d p<? super K, ? super V, Integer> sizeOf, @l3.d X2.l<? super K, ? extends V> create, @l3.d r<? super Boolean, ? super K, ? super V, ? super V, H0> onEntryRemoved) {
        F.q(sizeOf, "sizeOf");
        F.q(create, "create");
        F.q(onEntryRemoved, "onEntryRemoved");
        return new a(sizeOf, create, onEntryRemoved, i4, i4);
    }

    @l3.d
    public static /* synthetic */ j b(int i4, p pVar, X2.l lVar, r rVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            pVar = new p<Object, Object, Integer>() { // from class: androidx.collection.LruCacheKt$lruCache$1
                public final int c(@l3.d Object obj2, @l3.d Object obj3) {
                    F.q(obj2, "<anonymous parameter 0>");
                    F.q(obj3, "<anonymous parameter 1>");
                    return 1;
                }

                @Override // X2.p
                public /* bridge */ /* synthetic */ Integer c0(Object obj2, Object obj3) {
                    return Integer.valueOf(c(obj2, obj3));
                }
            };
        }
        p sizeOf = pVar;
        if ((i5 & 4) != 0) {
            lVar = new X2.l<Object, Object>() { // from class: androidx.collection.LruCacheKt$lruCache$2
                @Override // X2.l
                @l3.e
                public final Object C(@l3.d Object it) {
                    F.q(it, "it");
                    return null;
                }
            };
        }
        X2.l create = lVar;
        if ((i5 & 8) != 0) {
            rVar = new r<Boolean, Object, Object, Object, H0>() { // from class: androidx.collection.LruCacheKt$lruCache$3
                @Override // X2.r
                public /* bridge */ /* synthetic */ H0 N(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    c(bool.booleanValue(), obj2, obj3, obj4);
                    return H0.f51801a;
                }

                public final void c(boolean z3, @l3.d Object obj2, @l3.d Object obj3, @l3.e Object obj4) {
                    F.q(obj2, "<anonymous parameter 1>");
                    F.q(obj3, "<anonymous parameter 2>");
                }
            };
        }
        r onEntryRemoved = rVar;
        F.q(sizeOf, "sizeOf");
        F.q(create, "create");
        F.q(onEntryRemoved, "onEntryRemoved");
        return new a(sizeOf, create, onEntryRemoved, i4, i4);
    }
}

package androidx.core.util;

import android.util.LruCache;
import kotlin.H0;

/* loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends LruCache<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ X2.p<K, V, Integer> f13006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X2.l<K, V> f13007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ X2.r<Boolean, K, V, V, H0> f13008c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i4, X2.p<? super K, ? super V, Integer> pVar, X2.l<? super K, ? extends V> lVar, X2.r<? super Boolean, ? super K, ? super V, ? super V, H0> rVar) {
            super(i4);
            this.f13006a = pVar;
            this.f13007b = lVar;
            this.f13008c = rVar;
        }

        @Override // android.util.LruCache
        @l3.e
        protected V create(@l3.d K key) {
            kotlin.jvm.internal.F.p(key, "key");
            return this.f13007b.C(key);
        }

        @Override // android.util.LruCache
        protected void entryRemoved(boolean z3, @l3.d K key, @l3.d V oldValue, @l3.e V v3) {
            kotlin.jvm.internal.F.p(key, "key");
            kotlin.jvm.internal.F.p(oldValue, "oldValue");
            this.f13008c.N(Boolean.valueOf(z3), key, oldValue, v3);
        }

        @Override // android.util.LruCache
        protected int sizeOf(@l3.d K key, @l3.d V value) {
            kotlin.jvm.internal.F.p(key, "key");
            kotlin.jvm.internal.F.p(value, "value");
            return this.f13006a.c0(key, value).intValue();
        }
    }

    @l3.d
    public static final <K, V> LruCache<K, V> a(int i4, @l3.d X2.p<? super K, ? super V, Integer> sizeOf, @l3.d X2.l<? super K, ? extends V> create, @l3.d X2.r<? super Boolean, ? super K, ? super V, ? super V, H0> onEntryRemoved) {
        kotlin.jvm.internal.F.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.F.p(create, "create");
        kotlin.jvm.internal.F.p(onEntryRemoved, "onEntryRemoved");
        return new a(i4, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache b(int i4, X2.p sizeOf, X2.l create, X2.r onEntryRemoved, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            sizeOf = new X2.p<Object, Object, Integer>() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                @Override // X2.p
                @l3.d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Integer c0(@l3.d Object obj2, @l3.d Object obj3) {
                    kotlin.jvm.internal.F.p(obj2, "<anonymous parameter 0>");
                    kotlin.jvm.internal.F.p(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i5 & 4) != 0) {
            create = new X2.l<Object, Object>() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // X2.l
                @l3.e
                public final Object C(@l3.d Object it) {
                    kotlin.jvm.internal.F.p(it, "it");
                    return null;
                }
            };
        }
        if ((i5 & 8) != 0) {
            onEntryRemoved = new X2.r<Boolean, Object, Object, Object, H0>() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                @Override // X2.r
                public /* bridge */ /* synthetic */ H0 N(Boolean bool, Object obj2, Object obj3, Object obj4) {
                    c(bool.booleanValue(), obj2, obj3, obj4);
                    return H0.f51801a;
                }

                public final void c(boolean z3, @l3.d Object obj2, @l3.d Object obj3, @l3.e Object obj4) {
                    kotlin.jvm.internal.F.p(obj2, "<anonymous parameter 1>");
                    kotlin.jvm.internal.F.p(obj3, "<anonymous parameter 2>");
                }
            };
        }
        kotlin.jvm.internal.F.p(sizeOf, "sizeOf");
        kotlin.jvm.internal.F.p(create, "create");
        kotlin.jvm.internal.F.p(onEntryRemoved, "onEntryRemoved");
        return new a(i4, sizeOf, create, onEntryRemoved);
    }
}

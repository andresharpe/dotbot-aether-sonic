package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class m<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, O2.c<V>> implements x0.e<Map<K, O2.c<V>>> {

    /* loaded from: classes.dex */
    public static final class b<K, V> extends a.AbstractC0256a<K, V, O2.c<V>> {
        public m<K, V> c() {
            return new m<>(this.f27402a);
        }

        @Override // com.google.android.datatransport.runtime.dagger.internal.a.AbstractC0256a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b<K, V> a(K k4, O2.c<V> cVar) {
            super.a(k4, cVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.datatransport.runtime.dagger.internal.a.AbstractC0256a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(O2.c<Map<K, O2.c<V>>> cVar) {
            super.b(cVar);
            return this;
        }

        private b(int i4) {
            super(i4);
        }
    }

    public static <K, V> b<K, V> c(int i4) {
        return new b<>(i4);
    }

    @Override // O2.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map<K, O2.c<V>> get() {
        return b();
    }

    private m(Map<K, O2.c<V>> map) {
        super(map);
    }
}

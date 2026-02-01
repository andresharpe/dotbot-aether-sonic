package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final O2.c<Map<Object, Object>> f27412b = j.a(Collections.emptyMap());

    /* loaded from: classes.dex */
    public static final class b<K, V> extends a.AbstractC0256a<K, V, V> {
        public l<K, V> c() {
            return new l<>(this.f27402a);
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
        public b<K, V> b(O2.c<Map<K, V>> cVar) {
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

    public static <K, V> O2.c<Map<K, V>> d() {
        return (O2.c<Map<K, V>>) f27412b;
    }

    @Override // O2.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap d4 = d.d(b().size());
        for (Map.Entry<K, O2.c<V>> entry : b().entrySet()) {
            d4.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d4);
    }

    private l(Map<K, O2.c<V>> map) {
        super(map);
    }
}

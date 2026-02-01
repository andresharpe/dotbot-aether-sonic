package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a<K, V, V2> implements g<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, O2.c<V>> f27401a;

    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0256a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, O2.c<V>> f27402a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0256a(int i4) {
            this.f27402a = d.d(i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC0256a<K, V, V2> a(K k4, O2.c<V> cVar) {
            this.f27402a.put(p.c(k4, "key"), p.c(cVar, "provider"));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public AbstractC0256a<K, V, V2> b(O2.c<Map<K, V2>> cVar) {
            if (cVar instanceof e) {
                return b(((e) cVar).a());
            }
            this.f27402a.putAll(((a) cVar).f27401a);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Map<K, O2.c<V>> map) {
        this.f27401a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, O2.c<V>> b() {
        return this.f27401a;
    }
}

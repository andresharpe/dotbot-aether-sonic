package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class s<T> implements g<Set<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final g<Set<Object>> f27417c = j.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List<O2.c<T>> f27418a;

    /* renamed from: b, reason: collision with root package name */
    private final List<O2.c<Collection<T>>> f27419b;

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f27420c = false;

        /* renamed from: a, reason: collision with root package name */
        private final List<O2.c<T>> f27421a;

        /* renamed from: b, reason: collision with root package name */
        private final List<O2.c<Collection<T>>> f27422b;

        public b<T> a(O2.c<? extends Collection<? extends T>> cVar) {
            this.f27422b.add(cVar);
            return this;
        }

        public b<T> b(O2.c<? extends T> cVar) {
            this.f27421a.add(cVar);
            return this;
        }

        public s<T> c() {
            return new s<>(this.f27421a, this.f27422b);
        }

        private b(int i4, int i5) {
            this.f27421a = d.e(i4);
            this.f27422b = d.e(i5);
        }
    }

    public static <T> b<T> a(int i4, int i5) {
        return new b<>(i4, i5);
    }

    public static <T> g<Set<T>> b() {
        return (g<Set<T>>) f27417c;
    }

    @Override // O2.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        int size = this.f27418a.size();
        ArrayList arrayList = new ArrayList(this.f27419b.size());
        int size2 = this.f27419b.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Collection<T> collection = this.f27419b.get(i4).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c4 = d.c(size);
        int size3 = this.f27418a.size();
        for (int i5 = 0; i5 < size3; i5++) {
            c4.add(p.b(this.f27418a.get(i5).get()));
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            Iterator it = ((Collection) arrayList.get(i6)).iterator();
            while (it.hasNext()) {
                c4.add(p.b(it.next()));
            }
        }
        return Collections.unmodifiableSet(c4);
    }

    private s(List<O2.c<T>> list, List<O2.c<Collection<T>>> list2) {
        this.f27418a = list;
        this.f27419b = list2;
    }
}

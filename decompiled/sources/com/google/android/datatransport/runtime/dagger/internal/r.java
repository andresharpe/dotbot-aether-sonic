package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class r<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f27415b = "Set contributions cannot be null";

    /* renamed from: a, reason: collision with root package name */
    private final List<T> f27416a;

    private r(int i4) {
        this.f27416a = new ArrayList(i4);
    }

    public static <T> r<T> d(int i4) {
        return new r<>(i4);
    }

    public r<T> a(T t3) {
        this.f27416a.add(p.c(t3, f27415b));
        return this;
    }

    public r<T> b(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            p.c(it.next(), f27415b);
        }
        this.f27416a.addAll(collection);
        return this;
    }

    public Set<T> c() {
        int size = this.f27416a.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableSet(new HashSet(this.f27416a));
            }
            return Collections.singleton(this.f27416a.get(0));
        }
        return Collections.emptySet();
    }
}

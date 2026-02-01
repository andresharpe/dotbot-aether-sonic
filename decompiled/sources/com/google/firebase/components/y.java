package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class y<T> implements C1.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f34948b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<C1.b<T>> f34947a = Collections.newSetFromMap(new ConcurrentHashMap());

    y(Collection<C1.b<T>> collection) {
        this.f34947a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y<?> b(Collection<C1.b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator<C1.b<T>> it = this.f34947a.iterator();
            while (it.hasNext()) {
                this.f34948b.add(it.next().get());
            }
            this.f34947a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(C1.b<T> bVar) {
        try {
            if (this.f34948b == null) {
                this.f34947a.add(bVar);
            } else {
                this.f34948b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // C1.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f34948b == null) {
            synchronized (this) {
                try {
                    if (this.f34948b == null) {
                        this.f34948b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f34948b);
    }
}

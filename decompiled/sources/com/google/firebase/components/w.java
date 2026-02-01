package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import y1.C2444a;

/* loaded from: classes2.dex */
class w implements y1.d, y1.c {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.B("this")
    private final Map<Class<?>, ConcurrentHashMap<y1.b<Object>, Executor>> f34941a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.B("this")
    private Queue<C2444a<?>> f34942b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f34943c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Executor executor) {
        this.f34943c = executor;
    }

    private synchronized Set<Map.Entry<y1.b<Object>, Executor>> g(C2444a<?> c2444a) {
        Set<Map.Entry<y1.b<Object>, Executor>> entrySet;
        try {
            ConcurrentHashMap<y1.b<Object>, Executor> concurrentHashMap = this.f34941a.get(c2444a.b());
            if (concurrentHashMap == null) {
                entrySet = Collections.emptySet();
            } else {
                entrySet = concurrentHashMap.entrySet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return entrySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map.Entry entry, C2444a c2444a) {
        ((y1.b) entry.getKey()).a(c2444a);
    }

    @Override // y1.c
    public void a(final C2444a<?> c2444a) {
        D.b(c2444a);
        synchronized (this) {
            try {
                Queue<C2444a<?>> queue = this.f34942b;
                if (queue != null) {
                    queue.add(c2444a);
                    return;
                }
                for (final Map.Entry<y1.b<Object>, Executor> entry : g(c2444a)) {
                    entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            w.h(entry, c2444a);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.d
    public synchronized <T> void b(Class<T> cls, Executor executor, y1.b<? super T> bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.f34941a.containsKey(cls)) {
                this.f34941a.put(cls, new ConcurrentHashMap<>());
            }
            this.f34941a.get(cls).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // y1.d
    public <T> void c(Class<T> cls, y1.b<? super T> bVar) {
        b(cls, this.f34943c, bVar);
    }

    @Override // y1.d
    public synchronized <T> void d(Class<T> cls, y1.b<? super T> bVar) {
        D.b(cls);
        D.b(bVar);
        if (!this.f34941a.containsKey(cls)) {
            return;
        }
        ConcurrentHashMap<y1.b<Object>, Executor> concurrentHashMap = this.f34941a.get(cls);
        concurrentHashMap.remove(bVar);
        if (concurrentHashMap.isEmpty()) {
            this.f34941a.remove(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        Queue<C2444a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f34942b;
                if (queue != null) {
                    this.f34942b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<C2444a<?>> it = queue.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}

package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f25951a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f25952b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f25953a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f25954b;

        a() {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f25955b = 10;

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f25956a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f25956a) {
                poll = this.f25956a.poll();
            }
            if (poll == null) {
                return new a();
            }
            return poll;
        }

        void b(a aVar) {
            synchronized (this.f25956a) {
                try {
                    if (this.f25956a.size() < 10) {
                        this.f25956a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.f25951a.get(str);
                if (aVar == null) {
                    aVar = this.f25952b.a();
                    this.f25951a.put(str, aVar);
                }
                aVar.f25954b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f25953a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) com.bumptech.glide.util.l.d(this.f25951a.get(str));
                int i4 = aVar.f25954b;
                if (i4 >= 1) {
                    int i5 = i4 - 1;
                    aVar.f25954b = i5;
                    if (i5 == 0) {
                        a remove = this.f25951a.remove(str);
                        if (remove.equals(aVar)) {
                            this.f25952b.b(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f25954b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f25953a.unlock();
    }
}

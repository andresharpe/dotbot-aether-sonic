package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.n;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class d<T extends n> {

    /* renamed from: b, reason: collision with root package name */
    private static final int f25886b = 20;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f25887a = com.bumptech.glide.util.n.f(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.f25887a.poll();
        if (poll == null) {
            return a();
        }
        return poll;
    }

    public void c(T t3) {
        if (this.f25887a.size() < 20) {
            this.f25887a.offer(t3);
        }
    }
}

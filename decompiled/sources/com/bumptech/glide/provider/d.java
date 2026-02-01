package com.bumptech.glide.provider;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.util.k;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<k> f26713a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final androidx.collection.a<k, List<Class<?>>> f26714b = new androidx.collection.a<>();

    public void a() {
        synchronized (this.f26714b) {
            this.f26714b.clear();
        }
    }

    @P
    public List<Class<?>> b(@N Class<?> cls, @N Class<?> cls2, @N Class<?> cls3) {
        List<Class<?>> list;
        k andSet = this.f26713a.getAndSet(null);
        if (andSet == null) {
            andSet = new k(cls, cls2, cls3);
        } else {
            andSet.b(cls, cls2, cls3);
        }
        synchronized (this.f26714b) {
            list = this.f26714b.get(andSet);
        }
        this.f26713a.set(andSet);
        return list;
    }

    public void c(@N Class<?> cls, @N Class<?> cls2, @N Class<?> cls3, @N List<Class<?>> list) {
        synchronized (this.f26714b) {
            this.f26714b.put(new k(cls, cls2, cls3), list);
        }
    }
}

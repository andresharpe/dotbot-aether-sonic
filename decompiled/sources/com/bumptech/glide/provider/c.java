package com.bumptech.glide.provider;

import androidx.annotation.P;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.resource.transcode.g;
import com.bumptech.glide.util.k;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final s<?, ?, ?> f26710c = new s<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.a<k, s<?, ?, ?>> f26711a = new androidx.collection.a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<k> f26712b = new AtomicReference<>();

    private k b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        k andSet = this.f26712b.getAndSet(null);
        if (andSet == null) {
            andSet = new k();
        }
        andSet.b(cls, cls2, cls3);
        return andSet;
    }

    @P
    public <Data, TResource, Transcode> s<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        s<Data, TResource, Transcode> sVar;
        k b4 = b(cls, cls2, cls3);
        synchronized (this.f26711a) {
            sVar = (s) this.f26711a.get(b4);
        }
        this.f26712b.set(b4);
        return sVar;
    }

    public boolean c(@P s<?, ?, ?> sVar) {
        return f26710c.equals(sVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, @P s<?, ?, ?> sVar) {
        synchronized (this.f26711a) {
            androidx.collection.a<k, s<?, ?, ?>> aVar = this.f26711a;
            k kVar = new k(cls, cls2, cls3);
            if (sVar == null) {
                sVar = f26710c;
            }
            aVar.put(kVar, sVar);
        }
    }
}

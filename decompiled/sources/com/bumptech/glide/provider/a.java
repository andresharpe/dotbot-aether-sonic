package com.bumptech.glide.provider;

import androidx.annotation.N;
import androidx.annotation.P;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List<C0240a<?>> f26706a = new ArrayList();

    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0240a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f26707a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.a<T> f26708b;

        C0240a(@N Class<T> cls, @N com.bumptech.glide.load.a<T> aVar) {
            this.f26707a = cls;
            this.f26708b = aVar;
        }

        boolean a(@N Class<?> cls) {
            return this.f26707a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@N Class<T> cls, @N com.bumptech.glide.load.a<T> aVar) {
        this.f26706a.add(new C0240a<>(cls, aVar));
    }

    @P
    public synchronized <T> com.bumptech.glide.load.a<T> b(@N Class<T> cls) {
        for (C0240a<?> c0240a : this.f26706a) {
            if (c0240a.a(cls)) {
                return (com.bumptech.glide.load.a<T>) c0240a.f26708b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@N Class<T> cls, @N com.bumptech.glide.load.a<T> aVar) {
        this.f26706a.add(0, new C0240a<>(cls, aVar));
    }
}

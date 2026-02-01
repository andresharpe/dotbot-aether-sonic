package com.bumptech.glide.provider;

import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.load.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final List<a<?>> f26720a = new ArrayList();

    /* loaded from: classes.dex */
    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f26721a;

        /* renamed from: b, reason: collision with root package name */
        final h<T> f26722b;

        a(@N Class<T> cls, @N h<T> hVar) {
            this.f26721a = cls;
            this.f26722b = hVar;
        }

        boolean a(@N Class<?> cls) {
            return this.f26721a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@N Class<Z> cls, @N h<Z> hVar) {
        this.f26720a.add(new a<>(cls, hVar));
    }

    @P
    public synchronized <Z> h<Z> b(@N Class<Z> cls) {
        int size = this.f26720a.size();
        for (int i4 = 0; i4 < size; i4++) {
            a<?> aVar = this.f26720a.get(i4);
            if (aVar.a(cls)) {
                return (h<Z>) aVar.f26722b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@N Class<Z> cls, @N h<Z> hVar) {
        this.f26720a.add(0, new a<>(cls, hVar));
    }
}

package com.bumptech.glide.load.data;

import androidx.annotation.N;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final e.a<?> f25796b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f25797a = new HashMap();

    /* loaded from: classes.dex */
    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @N
        public e<Object> b(@N Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f25798a;

        b(@N Object obj) {
            this.f25798a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @N
        public Object a() {
            return this.f25798a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @N
    public synchronized <T> e<T> a(@N T t3) {
        e.a<?> aVar;
        try {
            com.bumptech.glide.util.l.d(t3);
            aVar = this.f25797a.get(t3.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f25797a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t3.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f25796b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (e<T>) aVar.b(t3);
    }

    public synchronized void b(@N e.a<?> aVar) {
        this.f25797a.put(aVar.a(), aVar);
    }
}

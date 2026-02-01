package com.bumptech.glide.load.model;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.t;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final r f26329a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26330b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, C0237a<?>> f26331a = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.bumptech.glide.load.model.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0237a<Model> {

            /* renamed from: a, reason: collision with root package name */
            final List<n<Model, ?>> f26332a;

            public C0237a(List<n<Model, ?>> list) {
                this.f26332a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f26331a.clear();
        }

        @P
        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0237a<?> c0237a = this.f26331a.get(cls);
            if (c0237a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0237a.f26332a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.f26331a.put(cls, new C0237a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(@N t.a<List<Throwable>> aVar) {
        this(new r(aVar));
    }

    @N
    private static <A> Class<A> c(@N A a4) {
        return (Class<A>) a4.getClass();
    }

    @N
    private synchronized <A> List<n<A, ?>> f(@N Class<A> cls) {
        List<n<A, ?>> b4;
        b4 = this.f26330b.b(cls);
        if (b4 == null) {
            b4 = Collections.unmodifiableList(this.f26329a.e(cls));
            this.f26330b.c(cls, b4);
        }
        return b4;
    }

    private <Model, Data> void j(@N List<o<? extends Model, ? extends Data>> list) {
        Iterator<o<? extends Model, ? extends Data>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized <Model, Data> void a(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        this.f26329a.b(cls, cls2, oVar);
        this.f26330b.a();
    }

    public synchronized <Model, Data> n<Model, Data> b(@N Class<Model> cls, @N Class<Data> cls2) {
        return this.f26329a.d(cls, cls2);
    }

    @N
    public synchronized List<Class<?>> d(@N Class<?> cls) {
        return this.f26329a.g(cls);
    }

    @N
    public <A> List<n<A, ?>> e(@N A a4) {
        List<n<A, ?>> f4 = f(c(a4));
        if (!f4.isEmpty()) {
            int size = f4.size();
            List<n<A, ?>> emptyList = Collections.emptyList();
            boolean z3 = true;
            for (int i4 = 0; i4 < size; i4++) {
                n<A, ?> nVar = f4.get(i4);
                if (nVar.a(a4)) {
                    if (z3) {
                        emptyList = new ArrayList<>(size - i4);
                        z3 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(a4, f4);
        }
        throw new Registry.NoModelLoaderAvailableException(a4);
    }

    public synchronized <Model, Data> void g(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        this.f26329a.i(cls, cls2, oVar);
        this.f26330b.a();
    }

    public synchronized <Model, Data> void h(@N Class<Model> cls, @N Class<Data> cls2) {
        j(this.f26329a.j(cls, cls2));
        this.f26330b.a();
    }

    public synchronized <Model, Data> void i(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        j(this.f26329a.k(cls, cls2, oVar));
        this.f26330b.a();
    }

    private p(@N r rVar) {
        this.f26330b = new a();
        this.f26329a = rVar;
    }
}

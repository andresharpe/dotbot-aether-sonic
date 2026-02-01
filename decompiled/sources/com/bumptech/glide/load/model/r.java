package com.bumptech.glide.load.model;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.core.util.t;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class r {

    /* renamed from: e, reason: collision with root package name */
    private static final c f26342e = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final n<Object, Object> f26343f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<b<?, ?>> f26344a;

    /* renamed from: b, reason: collision with root package name */
    private final c f26345b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b<?, ?>> f26346c;

    /* renamed from: d, reason: collision with root package name */
    private final t.a<List<Throwable>> f26347d;

    /* loaded from: classes.dex */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.model.n
        public boolean a(@N Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.n
        @P
        public n.a<Object> b(@N Object obj, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<Model> f26348a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f26349b;

        /* renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f26350c;

        public b(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
            this.f26348a = cls;
            this.f26349b = cls2;
            this.f26350c = oVar;
        }

        public boolean a(@N Class<?> cls) {
            return this.f26348a.isAssignableFrom(cls);
        }

        public boolean b(@N Class<?> cls, @N Class<?> cls2) {
            if (a(cls) && this.f26349b.isAssignableFrom(cls2)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        @N
        public <Model, Data> q<Model, Data> a(@N List<n<Model, Data>> list, @N t.a<List<Throwable>> aVar) {
            return new q<>(list, aVar);
        }
    }

    public r(@N t.a<List<Throwable>> aVar) {
        this(aVar, f26342e);
    }

    private <Model, Data> void a(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar, boolean z3) {
        int i4;
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f26344a;
        if (z3) {
            i4 = list.size();
        } else {
            i4 = 0;
        }
        list.add(i4, bVar);
    }

    @N
    private <Model, Data> n<Model, Data> c(@N b<?, ?> bVar) {
        return (n) com.bumptech.glide.util.l.d(bVar.f26350c.c(this));
    }

    @N
    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f26343f;
    }

    @N
    private <Model, Data> o<Model, Data> h(@N b<?, ?> bVar) {
        return (o<Model, Data>) bVar.f26350c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    @N
    public synchronized <Model, Data> n<Model, Data> d(@N Class<Model> cls, @N Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z3 = false;
            for (b<?, ?> bVar : this.f26344a) {
                if (this.f26346c.contains(bVar)) {
                    z3 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f26346c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f26346c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f26345b.a(arrayList, this.f26347d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (z3) {
                return f();
            }
            throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f26346c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public synchronized <Model> List<n<Model, ?>> e(@N Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f26344a) {
                if (!this.f26346c.contains(bVar) && bVar.a(cls)) {
                    this.f26346c.add(bVar);
                    arrayList.add(c(bVar));
                    this.f26346c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f26346c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public synchronized List<Class<?>> g(@N Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f26344a) {
            if (!arrayList.contains(bVar.f26349b) && bVar.a(cls)) {
                arrayList.add(bVar.f26349b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized <Model, Data> void i(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> j(@N Class<Model> cls, @N Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f26344a.iterator();
        while (it.hasNext()) {
            b<?, ?> next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public synchronized <Model, Data> List<o<? extends Model, ? extends Data>> k(@N Class<Model> cls, @N Class<Data> cls2, @N o<? extends Model, ? extends Data> oVar) {
        List<o<? extends Model, ? extends Data>> j4;
        j4 = j(cls, cls2);
        b(cls, cls2, oVar);
        return j4;
    }

    @i0
    r(@N t.a<List<Throwable>> aVar, @N c cVar) {
        this.f26344a = new ArrayList();
        this.f26346c = new HashSet();
        this.f26347d = aVar;
        this.f26345b = cVar;
    }
}

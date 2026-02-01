package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import com.google.firebase.components.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import l1.InterfaceC2354a;
import u1.InterfaceC2422a;

/* loaded from: classes2.dex */
public class r extends AbstractC1787a implements InterfaceC2422a {

    /* renamed from: h, reason: collision with root package name */
    private static final C1.b<Set<Object>> f34918h = new C1.b() { // from class: com.google.firebase.components.n
        @Override // C1.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<C1792f<?>, C1.b<?>> f34919a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, C1.b<?>> f34920b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, y<?>> f34921c;

    /* renamed from: d, reason: collision with root package name */
    private final List<C1.b<ComponentRegistrar>> f34922d;

    /* renamed from: e, reason: collision with root package name */
    private final w f34923e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<Boolean> f34924f;

    /* renamed from: g, reason: collision with root package name */
    private final l f34925g;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f34926a;

        /* renamed from: b, reason: collision with root package name */
        private final List<C1.b<ComponentRegistrar>> f34927b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<C1792f<?>> f34928c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private l f34929d = l.f34910a;

        b(Executor executor) {
            this.f34926a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        @InterfaceC2354a
        public b b(C1792f<?> c1792f) {
            this.f34928c.add(c1792f);
            return this;
        }

        @InterfaceC2354a
        public b c(final ComponentRegistrar componentRegistrar) {
            this.f34927b.add(new C1.b() { // from class: com.google.firebase.components.s
                @Override // C1.b
                public final Object get() {
                    ComponentRegistrar f4;
                    f4 = r.b.f(ComponentRegistrar.this);
                    return f4;
                }
            });
            return this;
        }

        @InterfaceC2354a
        public b d(Collection<C1.b<ComponentRegistrar>> collection) {
            this.f34927b.addAll(collection);
            return this;
        }

        public r e() {
            return new r(this.f34926a, this.f34927b, this.f34928c, this.f34929d);
        }

        @InterfaceC2354a
        public b g(l lVar) {
            this.f34929d = lVar;
            return this;
        }
    }

    public static b k(Executor executor) {
        return new b(executor);
    }

    private void l(List<C1792f<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C1.b<ComponentRegistrar>> it = this.f34922d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f34925g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e4) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            if (this.f34919a.isEmpty()) {
                t.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f34919a.keySet());
                arrayList2.addAll(list);
                t.a(arrayList2);
            }
            for (final C1792f<?> c1792f : list) {
                this.f34919a.put(c1792f, new x(new C1.b() { // from class: com.google.firebase.components.o
                    @Override // C1.b
                    public final Object get() {
                        Object r4;
                        r4 = r.this.r(c1792f);
                        return r4;
                    }
                }));
            }
            arrayList.addAll(x(list));
            arrayList.addAll(y());
            w();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        v();
    }

    private void m(Map<C1792f<?>, C1.b<?>> map, boolean z3) {
        for (Map.Entry<C1792f<?>, C1.b<?>> entry : map.entrySet()) {
            C1792f<?> key = entry.getKey();
            C1.b<?> value = entry.getValue();
            if (key.m() || (key.n() && z3)) {
                value.get();
            }
        }
        this.f34923e.f();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C1792f c1792f) {
        return c1792f.g().a(new F(c1792f, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ComponentRegistrar u(ComponentRegistrar componentRegistrar) {
        return componentRegistrar;
    }

    private void v() {
        Boolean bool = this.f34924f.get();
        if (bool != null) {
            m(this.f34919a, bool.booleanValue());
        }
    }

    private void w() {
        for (C1792f<?> c1792f : this.f34919a.keySet()) {
            for (u uVar : c1792f.f()) {
                if (uVar.g() && !this.f34921c.containsKey(uVar.c())) {
                    this.f34921c.put(uVar.c(), y.b(Collections.emptySet()));
                } else if (this.f34920b.containsKey(uVar.c())) {
                    continue;
                } else if (!uVar.f()) {
                    if (!uVar.g()) {
                        this.f34920b.put(uVar.c(), C.e());
                    }
                } else {
                    throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c1792f, uVar.c()));
                }
            }
        }
    }

    private List<Runnable> x(List<C1792f<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C1792f<?> c1792f : list) {
            if (c1792f.p()) {
                final C1.b<?> bVar = this.f34919a.get(c1792f);
                for (Class<? super Object> cls : c1792f.i()) {
                    if (!this.f34920b.containsKey(cls)) {
                        this.f34920b.put(cls, bVar);
                    } else {
                        final C c4 = (C) this.f34920b.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                C.this.j(bVar);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> y() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C1792f<?>, C1.b<?>> entry : this.f34919a.entrySet()) {
            C1792f<?> key = entry.getKey();
            if (!key.p()) {
                C1.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.i()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f34921c.containsKey(entry2.getKey())) {
                this.f34921c.put((Class) entry2.getKey(), y.b((Collection) entry2.getValue()));
            } else {
                final y<?> yVar = this.f34921c.get(entry2.getKey());
                for (final C1.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            y.this.a(bVar);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    private static Iterable<C1.b<ComponentRegistrar>> z(Iterable<ComponentRegistrar> iterable) {
        ArrayList arrayList = new ArrayList();
        for (final ComponentRegistrar componentRegistrar : iterable) {
            arrayList.add(new C1.b() { // from class: com.google.firebase.components.m
                @Override // C1.b
                public final Object get() {
                    ComponentRegistrar u3;
                    u3 = r.u(ComponentRegistrar.this);
                    return u3;
                }
            });
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.AbstractC1787a, com.google.firebase.components.g
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.g
    public synchronized <T> C1.b<T> b(Class<T> cls) {
        D.c(cls, "Null interface requested.");
        return (C1.b) this.f34920b.get(cls);
    }

    @Override // u1.InterfaceC2422a
    public void c() {
        synchronized (this) {
            try {
                if (this.f34922d.isEmpty()) {
                    return;
                }
                l(new ArrayList());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.components.g
    public synchronized <T> C1.b<Set<T>> d(Class<T> cls) {
        y<?> yVar = this.f34921c.get(cls);
        if (yVar != null) {
            return yVar;
        }
        return (C1.b<Set<T>>) f34918h;
    }

    @Override // com.google.firebase.components.AbstractC1787a, com.google.firebase.components.g
    public /* bridge */ /* synthetic */ Set e(Class cls) {
        return super.e(cls);
    }

    @Override // com.google.firebase.components.g
    public <T> C1.a<T> f(Class<T> cls) {
        C1.b<T> b4 = b(cls);
        if (b4 == null) {
            return C.e();
        }
        if (b4 instanceof C) {
            return (C) b4;
        }
        return C.i(b4);
    }

    @i0
    Collection<C1792f<?>> n() {
        return this.f34919a.keySet();
    }

    @i0
    @RestrictTo({RestrictTo.Scope.TESTS})
    public void o() {
        Iterator<C1.b<?>> it = this.f34919a.values().iterator();
        while (it.hasNext()) {
            it.next().get();
        }
    }

    public void p(boolean z3) {
        HashMap hashMap;
        if (!androidx.lifecycle.B.a(this.f34924f, null, Boolean.valueOf(z3))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f34919a);
        }
        m(hashMap, z3);
    }

    @Deprecated
    public r(Executor executor, Iterable<ComponentRegistrar> iterable, C1792f<?>... c1792fArr) {
        this(executor, z(iterable), Arrays.asList(c1792fArr), l.f34910a);
    }

    private r(Executor executor, Iterable<C1.b<ComponentRegistrar>> iterable, Collection<C1792f<?>> collection, l lVar) {
        this.f34919a = new HashMap();
        this.f34920b = new HashMap();
        this.f34921c = new HashMap();
        this.f34924f = new AtomicReference<>();
        w wVar = new w(executor);
        this.f34923e = wVar;
        this.f34925g = lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1792f.u(wVar, w.class, y1.d.class, y1.c.class));
        arrayList.add(C1792f.u(this, InterfaceC2422a.class, new Class[0]));
        for (C1792f<?> c1792f : collection) {
            if (c1792f != null) {
                arrayList.add(c1792f);
            }
        }
        this.f34922d = q(iterable);
        l(arrayList);
    }
}

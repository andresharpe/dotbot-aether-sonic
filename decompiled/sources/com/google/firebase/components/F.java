package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y1.C2444a;

/* loaded from: classes2.dex */
final class F extends AbstractC1787a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f34871a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f34872b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f34873c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f34874d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<Class<?>> f34875e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f34876f;

    /* renamed from: g, reason: collision with root package name */
    private final g f34877g;

    /* loaded from: classes2.dex */
    private static class a implements y1.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f34878a;

        /* renamed from: b, reason: collision with root package name */
        private final y1.c f34879b;

        public a(Set<Class<?>> set, y1.c cVar) {
            this.f34878a = set;
            this.f34879b = cVar;
        }

        @Override // y1.c
        public void a(C2444a<?> c2444a) {
            if (this.f34878a.contains(c2444a.b())) {
                this.f34879b.a(c2444a);
                return;
            }
            throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", c2444a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C1792f<?> c1792f, g gVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (u uVar : c1792f.f()) {
            if (uVar.e()) {
                if (uVar.g()) {
                    hashSet4.add(uVar.c());
                } else {
                    hashSet.add(uVar.c());
                }
            } else if (uVar.d()) {
                hashSet3.add(uVar.c());
            } else if (uVar.g()) {
                hashSet5.add(uVar.c());
            } else {
                hashSet2.add(uVar.c());
            }
        }
        if (!c1792f.j().isEmpty()) {
            hashSet.add(y1.c.class);
        }
        this.f34871a = Collections.unmodifiableSet(hashSet);
        this.f34872b = Collections.unmodifiableSet(hashSet2);
        this.f34873c = Collections.unmodifiableSet(hashSet3);
        this.f34874d = Collections.unmodifiableSet(hashSet4);
        this.f34875e = Collections.unmodifiableSet(hashSet5);
        this.f34876f = c1792f.j();
        this.f34877g = gVar;
    }

    @Override // com.google.firebase.components.AbstractC1787a, com.google.firebase.components.g
    public <T> T a(Class<T> cls) {
        if (this.f34871a.contains(cls)) {
            T t3 = (T) this.f34877g.a(cls);
            if (!cls.equals(y1.c.class)) {
                return t3;
            }
            return (T) new a(this.f34876f, (y1.c) t3);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // com.google.firebase.components.g
    public <T> C1.b<T> b(Class<T> cls) {
        if (this.f34872b.contains(cls)) {
            return this.f34877g.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.g
    public <T> C1.b<Set<T>> d(Class<T> cls) {
        if (this.f34875e.contains(cls)) {
            return this.f34877g.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // com.google.firebase.components.AbstractC1787a, com.google.firebase.components.g
    public <T> Set<T> e(Class<T> cls) {
        if (this.f34874d.contains(cls)) {
            return this.f34877g.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.g
    public <T> C1.a<T> f(Class<T> cls) {
        if (this.f34873c.contains(cls)) {
            return this.f34877g.f(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}

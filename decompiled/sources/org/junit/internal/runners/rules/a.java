package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.rules.l;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f55629d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f55630e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f55631f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f55632g;

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f55633a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55634b;

    /* renamed from: c, reason: collision with root package name */
    private final List<k> f55635c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Annotation> f55636a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55637b;

        /* renamed from: c, reason: collision with root package name */
        private final List<k> f55638c;

        a d() {
            return new a(this);
        }

        b e() {
            this.f55637b = true;
            return this;
        }

        b f(k kVar) {
            this.f55638c.add(kVar);
            return this;
        }

        private b(Class<? extends Annotation> cls) {
            this.f55636a = cls;
            this.f55637b = false;
            this.f55638c = new ArrayList();
        }
    }

    /* loaded from: classes2.dex */
    private static final class c implements k {
        private c() {
        }

        private boolean b(org.junit.runners.model.c<?> cVar) {
            return Modifier.isPublic(cVar.b().getModifiers());
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!b(cVar)) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must be declared in a public class."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class d implements k {
        private d() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!a.f(cVar)) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must implement MethodRule or TestRule."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class e implements k {
        private e() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!a.g(cVar)) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must implement TestRule."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class f implements k {
        private f() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            boolean z3;
            String str;
            boolean e4 = a.e(cVar);
            if (cVar.a(org.junit.g.class) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (cVar.k()) {
                if (e4 || !z3) {
                    if (a.e(cVar)) {
                        str = "must not be static.";
                    } else {
                        str = "must not be static or it must be annotated with @ClassRule.";
                    }
                    list.add(new org.junit.internal.runners.rules.b(cVar, cls, str));
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class g implements k {
        private g() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!cVar.h()) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must be public."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class h implements k {
        private h() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!cVar.k()) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must be static."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class i implements k {
        private i() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!a.f(cVar)) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must return an implementation of MethodRule or TestRule."));
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class j implements k {
        private j() {
        }

        @Override // org.junit.internal.runners.rules.a.k
        public void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list) {
            if (!a.g(cVar)) {
                list.add(new org.junit.internal.runners.rules.b(cVar, cls, "must return an implementation of TestRule."));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface k {
        void a(org.junit.runners.model.c<?> cVar, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        f55629d = d().f(new c()).f(new h()).f(new g()).f(new e()).d();
        f55630e = h().f(new f()).f(new g()).f(new d()).d();
        f55631f = d().e().f(new c()).f(new h()).f(new g()).f(new j()).d();
        f55632g = h().e().f(new f()).f(new g()).f(new i()).d();
    }

    a(b bVar) {
        this.f55633a = bVar.f55636a;
        this.f55634b = bVar.f55637b;
        this.f55635c = bVar.f55638c;
    }

    private static b d() {
        return new b(org.junit.g.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(org.junit.runners.model.c<?> cVar) {
        return org.junit.rules.f.class.isAssignableFrom(cVar.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(org.junit.runners.model.c<?> cVar) {
        if (!e(cVar) && !g(cVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(org.junit.runners.model.c<?> cVar) {
        return l.class.isAssignableFrom(cVar.e());
    }

    private static b h() {
        return new b(org.junit.j.class);
    }

    private void j(org.junit.runners.model.c<?> cVar, List<Throwable> list) {
        Iterator<k> it = this.f55635c.iterator();
        while (it.hasNext()) {
            it.next().a(cVar, this.f55633a, list);
        }
    }

    public void i(org.junit.runners.model.j jVar, List<Throwable> list) {
        List h4;
        if (this.f55634b) {
            h4 = jVar.m(this.f55633a);
        } else {
            h4 = jVar.h(this.f55633a);
        }
        Iterator it = h4.iterator();
        while (it.hasNext()) {
            j((org.junit.runners.model.c) it.next(), list);
        }
    }
}

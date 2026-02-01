package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.N;
import androidx.core.util.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26969a = "FactoryPools";

    /* renamed from: b, reason: collision with root package name */
    private static final int f26970b = 20;

    /* renamed from: c, reason: collision with root package name */
    private static final g<Object> f26971c = new C0243a();

    /* renamed from: com.bumptech.glide.util.pool.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0243a implements g<Object> {
        C0243a() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        public void a(@N Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.util.pool.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@N List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements t.a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final d<T> f26972a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f26973b;

        /* renamed from: c, reason: collision with root package name */
        private final t.a<T> f26974c;

        e(@N t.a<T> aVar, @N d<T> dVar, @N g<T> gVar) {
            this.f26974c = aVar;
            this.f26972a = dVar;
            this.f26973b = gVar;
        }

        @Override // androidx.core.util.t.a
        public boolean a(@N T t3) {
            if (t3 instanceof f) {
                ((f) t3).g().b(true);
            }
            this.f26973b.a(t3);
            return this.f26974c.a(t3);
        }

        @Override // androidx.core.util.t.a
        public T b() {
            T b4 = this.f26974c.b();
            if (b4 == null) {
                b4 = this.f26972a.a();
                if (Log.isLoggable(a.f26969a, 2)) {
                    Log.v(a.f26969a, "Created new " + b4.getClass());
                }
            }
            if (b4 instanceof f) {
                b4.g().b(false);
            }
            return (T) b4;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        @N
        com.bumptech.glide.util.pool.c g();
    }

    /* loaded from: classes.dex */
    public interface g<T> {
        void a(@N T t3);
    }

    private a() {
    }

    @N
    private static <T extends f> t.a<T> a(@N t.a<T> aVar, @N d<T> dVar) {
        return b(aVar, dVar, c());
    }

    @N
    private static <T> t.a<T> b(@N t.a<T> aVar, @N d<T> dVar, @N g<T> gVar) {
        return new e(aVar, dVar, gVar);
    }

    @N
    private static <T> g<T> c() {
        return (g<T>) f26971c;
    }

    @N
    public static <T extends f> t.a<T> d(int i4, @N d<T> dVar) {
        return a(new t.b(i4), dVar);
    }

    @N
    public static <T extends f> t.a<T> e(int i4, @N d<T> dVar) {
        return a(new t.c(i4), dVar);
    }

    @N
    public static <T> t.a<List<T>> f() {
        return g(20);
    }

    @N
    public static <T> t.a<List<T>> g(int i4) {
        return b(new t.c(i4), new b(), new c());
    }
}

package com.bumptech.glide.load.model;

import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;

/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final v<?> f26388a = new v<>();

    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f26389a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> b() {
            return (a<T>) f26389a;
        }

        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<Model, Model> c(r rVar) {
            return v.c();
        }
    }

    /* loaded from: classes.dex */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: E, reason: collision with root package name */
        private final Model f26390E;

        b(Model model) {
            this.f26390E = model;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<Model> a() {
            return (Class<Model>) this.f26390E.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super Model> aVar) {
            aVar.f(this.f26390E);
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) f26388a;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@N Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Model> b(@N Model model, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(model), new b(model));
    }
}

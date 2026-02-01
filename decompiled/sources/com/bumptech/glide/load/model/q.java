package com.bumptech.glide.load.model;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.util.t;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<n<Model, Data>> f26333a;

    /* renamed from: b, reason: collision with root package name */
    private final t.a<List<Throwable>> f26334b;

    /* loaded from: classes.dex */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: E, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f26335E;

        /* renamed from: F, reason: collision with root package name */
        private final t.a<List<Throwable>> f26336F;

        /* renamed from: G, reason: collision with root package name */
        private int f26337G;

        /* renamed from: H, reason: collision with root package name */
        private Priority f26338H;

        /* renamed from: I, reason: collision with root package name */
        private d.a<? super Data> f26339I;

        /* renamed from: J, reason: collision with root package name */
        @P
        private List<Throwable> f26340J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f26341K;

        a(@N List<com.bumptech.glide.load.data.d<Data>> list, @N t.a<List<Throwable>> aVar) {
            this.f26336F = aVar;
            com.bumptech.glide.util.l.c(list);
            this.f26335E = list;
            this.f26337G = 0;
        }

        private void g() {
            if (this.f26341K) {
                return;
            }
            if (this.f26337G < this.f26335E.size() - 1) {
                this.f26337G++;
                e(this.f26338H, this.f26339I);
            } else {
                com.bumptech.glide.util.l.d(this.f26340J);
                this.f26339I.c(new GlideException("Fetch failed", new ArrayList(this.f26340J)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<Data> a() {
            return this.f26335E.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f26340J;
            if (list != null) {
                this.f26336F.a(list);
            }
            this.f26340J = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f26335E.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@N Exception exc) {
            ((List) com.bumptech.glide.util.l.d(this.f26340J)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f26341K = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f26335E.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public DataSource d() {
            return this.f26335E.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super Data> aVar) {
            this.f26338H = priority;
            this.f26339I = aVar;
            this.f26340J = this.f26336F.b();
            this.f26335E.get(this.f26337G).e(priority, this);
            if (this.f26341K) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@P Data data) {
            if (data != null) {
                this.f26339I.f(data);
            } else {
                g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(@N List<n<Model, Data>> list, @N t.a<List<Throwable>> aVar) {
        this.f26333a = list;
        this.f26334b = aVar;
    }

    @Override // com.bumptech.glide.load.model.n
    public boolean a(@N Model model) {
        Iterator<n<Model, Data>> it = this.f26333a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.n
    public n.a<Data> b(@N Model model, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        n.a<Data> b4;
        int size = this.f26333a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.c cVar = null;
        for (int i6 = 0; i6 < size; i6++) {
            n<Model, Data> nVar = this.f26333a.get(i6);
            if (nVar.a(model) && (b4 = nVar.b(model, i4, i5, fVar)) != null) {
                cVar = b4.f26326a;
                arrayList.add(b4.f26328c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new n.a<>(cVar, new a(arrayList, this.f26334b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f26333a.toArray()) + '}';
    }
}

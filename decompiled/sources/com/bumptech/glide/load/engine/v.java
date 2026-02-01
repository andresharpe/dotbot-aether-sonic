package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v implements f, d.a<Object> {

    /* renamed from: E, reason: collision with root package name */
    private final f.a f26233E;

    /* renamed from: F, reason: collision with root package name */
    private final g<?> f26234F;

    /* renamed from: G, reason: collision with root package name */
    private int f26235G;

    /* renamed from: H, reason: collision with root package name */
    private int f26236H = -1;

    /* renamed from: I, reason: collision with root package name */
    private com.bumptech.glide.load.c f26237I;

    /* renamed from: J, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f26238J;

    /* renamed from: K, reason: collision with root package name */
    private int f26239K;

    /* renamed from: L, reason: collision with root package name */
    private volatile n.a<?> f26240L;

    /* renamed from: M, reason: collision with root package name */
    private File f26241M;

    /* renamed from: N, reason: collision with root package name */
    private w f26242N;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(g<?> gVar, f.a aVar) {
        this.f26234F = gVar;
        this.f26233E = aVar;
    }

    private boolean b() {
        if (this.f26239K < this.f26238J.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        List<com.bumptech.glide.load.c> c4 = this.f26234F.c();
        boolean z3 = false;
        if (c4.isEmpty()) {
            return false;
        }
        List<Class<?>> m4 = this.f26234F.m();
        if (m4.isEmpty()) {
            if (File.class.equals(this.f26234F.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f26234F.i() + " to " + this.f26234F.q());
        }
        while (true) {
            if (this.f26238J != null && b()) {
                this.f26240L = null;
                while (!z3 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f26238J;
                    int i4 = this.f26239K;
                    this.f26239K = i4 + 1;
                    this.f26240L = list.get(i4).b(this.f26241M, this.f26234F.s(), this.f26234F.f(), this.f26234F.k());
                    if (this.f26240L != null && this.f26234F.t(this.f26240L.f26328c.a())) {
                        this.f26240L.f26328c.e(this.f26234F.l(), this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i5 = this.f26236H + 1;
            this.f26236H = i5;
            if (i5 >= m4.size()) {
                int i6 = this.f26235G + 1;
                this.f26235G = i6;
                if (i6 >= c4.size()) {
                    return false;
                }
                this.f26236H = 0;
            }
            com.bumptech.glide.load.c cVar = c4.get(this.f26235G);
            Class<?> cls = m4.get(this.f26236H);
            this.f26242N = new w(this.f26234F.b(), cVar, this.f26234F.o(), this.f26234F.s(), this.f26234F.f(), this.f26234F.r(cls), cls, this.f26234F.k());
            File b4 = this.f26234F.d().b(this.f26242N);
            this.f26241M = b4;
            if (b4 != null) {
                this.f26237I = cVar;
                this.f26238J = this.f26234F.j(b4);
                this.f26239K = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@N Exception exc) {
        this.f26233E.b(this.f26242N, exc, this.f26240L.f26328c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f26240L;
        if (aVar != null) {
            aVar.f26328c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f26233E.f(this.f26237I, obj, this.f26240L.f26328c, DataSource.RESOURCE_DISK_CACHE, this.f26242N);
    }
}

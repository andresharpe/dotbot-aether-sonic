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
public class c implements f, d.a<Object> {

    /* renamed from: E, reason: collision with root package name */
    private final List<com.bumptech.glide.load.c> f25940E;

    /* renamed from: F, reason: collision with root package name */
    private final g<?> f25941F;

    /* renamed from: G, reason: collision with root package name */
    private final f.a f25942G;

    /* renamed from: H, reason: collision with root package name */
    private int f25943H;

    /* renamed from: I, reason: collision with root package name */
    private com.bumptech.glide.load.c f25944I;

    /* renamed from: J, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f25945J;

    /* renamed from: K, reason: collision with root package name */
    private int f25946K;

    /* renamed from: L, reason: collision with root package name */
    private volatile n.a<?> f25947L;

    /* renamed from: M, reason: collision with root package name */
    private File f25948M;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        if (this.f25946K < this.f25945J.size()) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        while (true) {
            boolean z3 = false;
            if (this.f25945J != null && b()) {
                this.f25947L = null;
                while (!z3 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f25945J;
                    int i4 = this.f25946K;
                    this.f25946K = i4 + 1;
                    this.f25947L = list.get(i4).b(this.f25948M, this.f25941F.s(), this.f25941F.f(), this.f25941F.k());
                    if (this.f25947L != null && this.f25941F.t(this.f25947L.f26328c.a())) {
                        this.f25947L.f26328c.e(this.f25941F.l(), this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i5 = this.f25943H + 1;
            this.f25943H = i5;
            if (i5 >= this.f25940E.size()) {
                return false;
            }
            com.bumptech.glide.load.c cVar = this.f25940E.get(this.f25943H);
            File b4 = this.f25941F.d().b(new d(cVar, this.f25941F.o()));
            this.f25948M = b4;
            if (b4 != null) {
                this.f25944I = cVar;
                this.f25945J = this.f25941F.j(b4);
                this.f25946K = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@N Exception exc) {
        this.f25942G.b(this.f25944I, exc, this.f25947L.f26328c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f25947L;
        if (aVar != null) {
            aVar.f26328c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f25942G.f(this.f25944I, obj, this.f25947L.f26328c, DataSource.DATA_DISK_CACHE, this.f25944I);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(List<com.bumptech.glide.load.c> list, g<?> gVar, f.a aVar) {
        this.f25943H = -1;
        this.f25940E = list;
        this.f25941F = gVar;
        this.f25942G = aVar;
    }
}

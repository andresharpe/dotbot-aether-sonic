package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final L.c f18349a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final G.d f18350b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.Adapter<RecyclerView.F> f18351c;

    /* renamed from: d, reason: collision with root package name */
    final b f18352d;

    /* renamed from: e, reason: collision with root package name */
    int f18353e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.i f18354f = new a();

    /* loaded from: classes.dex */
    class a extends RecyclerView.i {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            w wVar = w.this;
            wVar.f18353e = wVar.f18351c.l();
            w wVar2 = w.this;
            wVar2.f18352d.f(wVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i4, int i5) {
            w wVar = w.this;
            wVar.f18352d.b(wVar, i4, i5, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i4, int i5, @P Object obj) {
            w wVar = w.this;
            wVar.f18352d.b(wVar, i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i4, int i5) {
            w wVar = w.this;
            wVar.f18353e += i5;
            wVar.f18352d.d(wVar, i4, i5);
            w wVar2 = w.this;
            if (wVar2.f18353e > 0 && wVar2.f18351c.o() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                w wVar3 = w.this;
                wVar3.f18352d.a(wVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i4, int i5, int i6) {
            boolean z3 = true;
            if (i6 != 1) {
                z3 = false;
            }
            androidx.core.util.u.b(z3, "moving more than 1 item is not supported in RecyclerView");
            w wVar = w.this;
            wVar.f18352d.e(wVar, i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i4, int i5) {
            w wVar = w.this;
            wVar.f18353e -= i5;
            wVar.f18352d.g(wVar, i4, i5);
            w wVar2 = w.this;
            if (wVar2.f18353e < 1 && wVar2.f18351c.o() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                w wVar3 = w.this;
                wVar3.f18352d.a(wVar3);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void g() {
            w wVar = w.this;
            wVar.f18352d.a(wVar);
        }
    }

    /* loaded from: classes.dex */
    interface b {
        void a(w wVar);

        void b(@N w wVar, int i4, int i5, @P Object obj);

        void c(@N w wVar, int i4, int i5);

        void d(@N w wVar, int i4, int i5);

        void e(@N w wVar, int i4, int i5);

        void f(@N w wVar);

        void g(@N w wVar, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(RecyclerView.Adapter<RecyclerView.F> adapter, b bVar, L l4, G.d dVar) {
        this.f18351c = adapter;
        this.f18352d = bVar;
        this.f18349a = l4.b(this);
        this.f18350b = dVar;
        this.f18353e = adapter.l();
        adapter.K(this.f18354f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f18351c.N(this.f18354f);
        this.f18349a.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f18353e;
    }

    public long c(int i4) {
        return this.f18350b.a(this.f18351c.m(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i4) {
        return this.f18349a.h(this.f18351c.n(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.F f4, int i4) {
        this.f18351c.h(f4, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.F f(ViewGroup viewGroup, int i4) {
        return this.f18351c.E(viewGroup, this.f18349a.g(i4));
    }
}

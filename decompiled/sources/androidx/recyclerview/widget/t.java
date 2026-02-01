package androidx.recyclerview.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.C0957c;
import androidx.recyclerview.widget.C0958d;
import androidx.recyclerview.widget.C0964j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.F;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t<T, VH extends RecyclerView.F> extends RecyclerView.Adapter<VH> {

    /* renamed from: d, reason: collision with root package name */
    final C0958d<T> f18315d;

    /* renamed from: e, reason: collision with root package name */
    private final C0958d.b<T> f18316e;

    /* loaded from: classes.dex */
    class a implements C0958d.b<T> {
        a() {
        }

        @Override // androidx.recyclerview.widget.C0958d.b
        public void a(@N List<T> list, @N List<T> list2) {
            t.this.Q(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t(@N C0964j.f<T> fVar) {
        a aVar = new a();
        this.f18316e = aVar;
        C0958d<T> c0958d = new C0958d<>(new C0956b(this), new C0957c.a(fVar).a());
        this.f18315d = c0958d;
        c0958d.a(aVar);
    }

    @N
    public List<T> O() {
        return this.f18315d.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T P(int i4) {
        return this.f18315d.b().get(i4);
    }

    public void Q(@N List<T> list, @N List<T> list2) {
    }

    public void R(@P List<T> list) {
        this.f18315d.f(list);
    }

    public void S(@P List<T> list, @P Runnable runnable) {
        this.f18315d.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f18315d.b().size();
    }

    protected t(@N C0957c<T> c0957c) {
        a aVar = new a();
        this.f18316e = aVar;
        C0958d<T> c0958d = new C0958d<>(new C0956b(this), c0957c);
        this.f18315d = c0958d;
        c0958d.a(aVar);
    }
}

package androidx.lifecycle;

import androidx.annotation.InterfaceC0566i;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class N<T> extends P<T> {

    /* renamed from: m, reason: collision with root package name */
    private androidx.arch.core.internal.b<LiveData<?>, a<?>> f15473m;

    /* loaded from: classes.dex */
    private static class a<V> implements Q<V> {

        /* renamed from: a, reason: collision with root package name */
        final LiveData<V> f15474a;

        /* renamed from: b, reason: collision with root package name */
        final Q<? super V> f15475b;

        /* renamed from: c, reason: collision with root package name */
        int f15476c = -1;

        a(LiveData<V> liveData, Q<? super V> q4) {
            this.f15474a = liveData;
            this.f15475b = q4;
        }

        void a() {
            this.f15474a.l(this);
        }

        void b() {
            this.f15474a.p(this);
        }

        @Override // androidx.lifecycle.Q
        public void f(@androidx.annotation.P V v3) {
            if (this.f15476c != this.f15474a.g()) {
                this.f15476c = this.f15474a.g();
                this.f15475b.f(v3);
            }
        }
    }

    public N() {
        this.f15473m = new androidx.arch.core.internal.b<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    @InterfaceC0566i
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f15473m.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    @InterfaceC0566i
    public void n() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f15473m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @androidx.annotation.K
    public <S> void s(@androidx.annotation.N LiveData<S> liveData, @androidx.annotation.N Q<? super S> q4) {
        if (liveData != null) {
            a<?> aVar = new a<>(liveData, q4);
            a<?> k4 = this.f15473m.k(liveData, aVar);
            if (k4 != null && k4.f15475b != q4) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (k4 == null && h()) {
                aVar.a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    @androidx.annotation.K
    public <S> void t(@androidx.annotation.N LiveData<S> liveData) {
        a<?> l4 = this.f15473m.l(liveData);
        if (l4 != null) {
            l4.b();
        }
    }

    public N(T t3) {
        super(t3);
        this.f15473m = new androidx.arch.core.internal.b<>();
    }
}

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final X2.a<T> f52622a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, T> f52623b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.e
        private T f52624E;

        /* renamed from: F, reason: collision with root package name */
        private int f52625F = -2;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ j<T> f52626G;

        a(j<T> jVar) {
            this.f52626G = jVar;
        }

        private final void b() {
            T t3;
            int i4;
            if (this.f52625F != -2) {
                X2.l lVar = ((j) this.f52626G).f52623b;
                T t4 = this.f52624E;
                F.m(t4);
                t3 = (T) lVar.C(t4);
            } else {
                t3 = (T) ((j) this.f52626G).f52622a.n();
            }
            this.f52624E = t3;
            if (t3 == null) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            this.f52625F = i4;
        }

        @l3.e
        public final T c() {
            return this.f52624E;
        }

        public final int d() {
            return this.f52625F;
        }

        public final void e(@l3.e T t3) {
            this.f52624E = t3;
        }

        public final void h(int i4) {
            this.f52625F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52625F < 0) {
                b();
            }
            if (this.f52625F == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @l3.d
        public T next() {
            if (this.f52625F < 0) {
                b();
            }
            if (this.f52625F != 0) {
                T t3 = this.f52624E;
                F.n(t3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f52625F = -1;
                return t3;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@l3.d X2.a<? extends T> getInitialValue, @l3.d X2.l<? super T, ? extends T> getNextValue) {
        F.p(getInitialValue, "getInitialValue");
        F.p(getNextValue, "getNextValue");
        this.f52622a = getInitialValue;
        this.f52623b = getNextValue;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

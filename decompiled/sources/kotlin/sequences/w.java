package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class w<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52681a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, Boolean> f52682b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52683E;

        /* renamed from: F, reason: collision with root package name */
        private int f52684F = -1;

        /* renamed from: G, reason: collision with root package name */
        @l3.e
        private T f52685G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ w<T> f52686H;

        a(w<T> wVar) {
            this.f52686H = wVar;
            this.f52683E = ((w) wVar).f52681a.iterator();
        }

        private final void b() {
            if (this.f52683E.hasNext()) {
                T next = this.f52683E.next();
                if (((Boolean) ((w) this.f52686H).f52682b.C(next)).booleanValue()) {
                    this.f52684F = 1;
                    this.f52685G = next;
                    return;
                }
            }
            this.f52684F = 0;
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52683E;
        }

        @l3.e
        public final T d() {
            return this.f52685G;
        }

        public final int e() {
            return this.f52684F;
        }

        public final void h(@l3.e T t3) {
            this.f52685G = t3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52684F == -1) {
                b();
            }
            if (this.f52684F == 1) {
                return true;
            }
            return false;
        }

        public final void i(int i4) {
            this.f52684F = i4;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f52684F == -1) {
                b();
            }
            if (this.f52684F != 0) {
                T t3 = this.f52685G;
                this.f52685G = null;
                this.f52684F = -1;
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
    public w(@l3.d m<? extends T> sequence, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(sequence, "sequence");
        F.p(predicate, "predicate");
        this.f52681a = sequence;
        this.f52682b = predicate;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

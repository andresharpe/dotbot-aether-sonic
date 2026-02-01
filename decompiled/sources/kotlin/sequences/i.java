package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class i<T, R, E> implements m<E> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52616a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, R> f52617b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final X2.l<R, Iterator<E>> f52618c;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<E>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52619E;

        /* renamed from: F, reason: collision with root package name */
        @l3.e
        private Iterator<? extends E> f52620F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ i<T, R, E> f52621G;

        a(i<T, R, E> iVar) {
            this.f52621G = iVar;
            this.f52619E = ((i) iVar).f52616a.iterator();
        }

        private final boolean b() {
            Iterator<? extends E> it = this.f52620F;
            if (it != null && !it.hasNext()) {
                this.f52620F = null;
            }
            while (true) {
                if (this.f52620F != null) {
                    break;
                }
                if (!this.f52619E.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it2 = (Iterator) ((i) this.f52621G).f52618c.C(((i) this.f52621G).f52617b.C(this.f52619E.next()));
                if (it2.hasNext()) {
                    this.f52620F = it2;
                    break;
                }
            }
            return true;
        }

        @l3.e
        public final Iterator<E> c() {
            return this.f52620F;
        }

        @l3.d
        public final Iterator<T> d() {
            return this.f52619E;
        }

        public final void e(@l3.e Iterator<? extends E> it) {
            this.f52620F = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return b();
        }

        @Override // java.util.Iterator
        public E next() {
            if (b()) {
                Iterator<? extends E> it = this.f52620F;
                F.m(it);
                return it.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@l3.d m<? extends T> sequence, @l3.d X2.l<? super T, ? extends R> transformer, @l3.d X2.l<? super R, ? extends Iterator<? extends E>> iterator) {
        F.p(sequence, "sequence");
        F.p(transformer, "transformer");
        F.p(iterator, "iterator");
        this.f52616a = sequence;
        this.f52617b = transformer;
        this.f52618c = iterator;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<E> iterator() {
        return new a(this);
    }
}

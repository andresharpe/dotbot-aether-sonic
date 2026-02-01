package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class y<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52692a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, R> f52693b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52694E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ y<T, R> f52695F;

        a(y<T, R> yVar) {
            this.f52695F = yVar;
            this.f52694E = ((y) yVar).f52692a.iterator();
        }

        @l3.d
        public final Iterator<T> b() {
            return this.f52694E;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52694E.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((y) this.f52695F).f52693b.C(this.f52694E.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@l3.d m<? extends T> sequence, @l3.d X2.l<? super T, ? extends R> transformer) {
        F.p(sequence, "sequence");
        F.p(transformer, "transformer");
        this.f52692a = sequence;
        this.f52693b = transformer;
    }

    @l3.d
    public final <E> m<E> e(@l3.d X2.l<? super R, ? extends Iterator<? extends E>> iterator) {
        F.p(iterator, "iterator");
        return new i(this.f52692a, this.f52693b, iterator);
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}

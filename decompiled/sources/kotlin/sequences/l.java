package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class l<T1, T2, V> implements m<V> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T1> f52630a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final m<T2> f52631b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final X2.p<T1, T2, V> f52632c;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<V>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T1> f52633E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final Iterator<T2> f52634F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ l<T1, T2, V> f52635G;

        a(l<T1, T2, V> lVar) {
            this.f52635G = lVar;
            this.f52633E = ((l) lVar).f52630a.iterator();
            this.f52634F = ((l) lVar).f52631b.iterator();
        }

        @l3.d
        public final Iterator<T1> b() {
            return this.f52633E;
        }

        @l3.d
        public final Iterator<T2> c() {
            return this.f52634F;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52633E.hasNext() && this.f52634F.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((l) this.f52635G).f52632c.c0(this.f52633E.next(), this.f52634F.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@l3.d m<? extends T1> sequence1, @l3.d m<? extends T2> sequence2, @l3.d X2.p<? super T1, ? super T2, ? extends V> transform) {
        F.p(sequence1, "sequence1");
        F.p(sequence2, "sequence2");
        F.p(transform, "transform");
        this.f52630a = sequence1;
        this.f52631b = sequence2;
        this.f52632c = transform;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<V> iterator() {
        return new a(this);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes2.dex */
public final class d<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52598a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52599b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52600E;

        /* renamed from: F, reason: collision with root package name */
        private int f52601F;

        a(d<T> dVar) {
            this.f52600E = ((d) dVar).f52598a.iterator();
            this.f52601F = ((d) dVar).f52599b;
        }

        private final void b() {
            while (this.f52601F > 0 && this.f52600E.hasNext()) {
                this.f52600E.next();
                this.f52601F--;
            }
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52600E;
        }

        public final int d() {
            return this.f52601F;
        }

        public final void e(int i4) {
            this.f52601F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f52600E.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.f52600E.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l3.d m<? extends T> sequence, int i4) {
        F.p(sequence, "sequence");
        this.f52598a = sequence;
        this.f52599b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> a(int i4) {
        int i5 = this.f52599b;
        int i6 = i5 + i4;
        if (i6 < 0) {
            return new v(this, i4);
        }
        return new u(this.f52598a, i5, i6);
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> b(int i4) {
        int i5 = this.f52599b + i4;
        if (i5 < 0) {
            return new d(this, i4);
        }
        return new d(this.f52598a, i5);
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.M;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class k<T> implements m<M<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52627a;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<M<? extends T>>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52628E;

        /* renamed from: F, reason: collision with root package name */
        private int f52629F;

        a(k<T> kVar) {
            this.f52628E = ((k) kVar).f52627a.iterator();
        }

        public final int b() {
            return this.f52629F;
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52628E;
        }

        @Override // java.util.Iterator
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public M<T> next() {
            int i4 = this.f52629F;
            this.f52629F = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            return new M<>(i4, this.f52628E.next());
        }

        public final void e(int i4) {
            this.f52629F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52628E.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@l3.d m<? extends T> sequence) {
        F.p(sequence, "sequence");
        this.f52627a = sequence;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<M<T>> iterator() {
        return new a(this);
    }
}

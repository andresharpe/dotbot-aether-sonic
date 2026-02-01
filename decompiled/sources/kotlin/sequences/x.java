package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class x<T, R> implements m<R> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52687a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.p<Integer, T, R> f52688b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52689E;

        /* renamed from: F, reason: collision with root package name */
        private int f52690F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ x<T, R> f52691G;

        a(x<T, R> xVar) {
            this.f52691G = xVar;
            this.f52689E = ((x) xVar).f52687a.iterator();
        }

        public final int b() {
            return this.f52690F;
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52689E;
        }

        public final void d(int i4) {
            this.f52690F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52689E.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            X2.p pVar = ((x) this.f52691G).f52688b;
            int i4 = this.f52690F;
            this.f52690F = i4 + 1;
            if (i4 < 0) {
                CollectionsKt__CollectionsKt.Z();
            }
            return (R) pVar.c0(Integer.valueOf(i4), this.f52689E.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@l3.d m<? extends T> sequence, @l3.d X2.p<? super Integer, ? super T, ? extends R> transformer) {
        F.p(sequence, "sequence");
        F.p(transformer, "transformer");
        this.f52687a = sequence;
        this.f52688b = transformer;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}

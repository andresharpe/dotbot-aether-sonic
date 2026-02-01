package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes2.dex */
public final class v<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52677a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52678b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f52679E;

        /* renamed from: F, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52680F;

        a(v<T> vVar) {
            this.f52679E = ((v) vVar).f52678b;
            this.f52680F = ((v) vVar).f52677a.iterator();
        }

        @l3.d
        public final Iterator<T> b() {
            return this.f52680F;
        }

        public final int c() {
            return this.f52679E;
        }

        public final void d(int i4) {
            this.f52679E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52679E > 0 && this.f52680F.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            int i4 = this.f52679E;
            if (i4 != 0) {
                this.f52679E = i4 - 1;
                return this.f52680F.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@l3.d m<? extends T> sequence, int i4) {
        F.p(sequence, "sequence");
        this.f52677a = sequence;
        this.f52678b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> a(int i4) {
        if (i4 >= this.f52678b) {
            return this;
        }
        return new v(this.f52677a, i4);
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> b(int i4) {
        m<T> g4;
        int i5 = this.f52678b;
        if (i4 >= i5) {
            g4 = s.g();
            return g4;
        }
        return new u(this.f52677a, i4, i5);
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

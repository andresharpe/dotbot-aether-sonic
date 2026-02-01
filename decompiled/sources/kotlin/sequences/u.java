package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* loaded from: classes2.dex */
public final class u<T> implements m<T>, e<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52671a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52672b;

    /* renamed from: c, reason: collision with root package name */
    private final int f52673c;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52674E;

        /* renamed from: F, reason: collision with root package name */
        private int f52675F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ u<T> f52676G;

        a(u<T> uVar) {
            this.f52676G = uVar;
            this.f52674E = ((u) uVar).f52671a.iterator();
        }

        private final void b() {
            while (this.f52675F < ((u) this.f52676G).f52672b && this.f52674E.hasNext()) {
                this.f52674E.next();
                this.f52675F++;
            }
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52674E;
        }

        public final int d() {
            return this.f52675F;
        }

        public final void e(int i4) {
            this.f52675F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            if (this.f52675F < ((u) this.f52676G).f52673c && this.f52674E.hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (this.f52675F < ((u) this.f52676G).f52673c) {
                this.f52675F++;
                return this.f52674E.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(@l3.d m<? extends T> sequence, int i4, int i5) {
        F.p(sequence, "sequence");
        this.f52671a = sequence;
        this.f52672b = i4;
        this.f52673c = i5;
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i5 >= i4) {
                    return;
                }
                throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i5 + " < " + i4).toString());
            }
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i5).toString());
        }
        throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i4).toString());
    }

    private final int f() {
        return this.f52673c - this.f52672b;
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> a(int i4) {
        if (i4 >= f()) {
            return this;
        }
        m<T> mVar = this.f52671a;
        int i5 = this.f52672b;
        return new u(mVar, i5, i4 + i5);
    }

    @Override // kotlin.sequences.e
    @l3.d
    public m<T> b(int i4) {
        m<T> g4;
        if (i4 >= f()) {
            g4 = s.g();
            return g4;
        }
        return new u(this.f52671a, this.f52672b + i4, this.f52673c);
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

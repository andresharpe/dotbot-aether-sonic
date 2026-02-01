package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class h<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52609a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f52610b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final X2.l<T, Boolean> f52611c;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52612E;

        /* renamed from: F, reason: collision with root package name */
        private int f52613F = -1;

        /* renamed from: G, reason: collision with root package name */
        @l3.e
        private T f52614G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ h<T> f52615H;

        a(h<T> hVar) {
            this.f52615H = hVar;
            this.f52612E = ((h) hVar).f52609a.iterator();
        }

        private final void b() {
            while (this.f52612E.hasNext()) {
                T next = this.f52612E.next();
                if (((Boolean) ((h) this.f52615H).f52611c.C(next)).booleanValue() == ((h) this.f52615H).f52610b) {
                    this.f52614G = next;
                    this.f52613F = 1;
                    return;
                }
            }
            this.f52613F = 0;
        }

        @l3.d
        public final Iterator<T> c() {
            return this.f52612E;
        }

        @l3.e
        public final T d() {
            return this.f52614G;
        }

        public final int e() {
            return this.f52613F;
        }

        public final void h(@l3.e T t3) {
            this.f52614G = t3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52613F == -1) {
                b();
            }
            if (this.f52613F == 1) {
                return true;
            }
            return false;
        }

        public final void i(int i4) {
            this.f52613F = i4;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f52613F == -1) {
                b();
            }
            if (this.f52613F != 0) {
                T t3 = this.f52614G;
                this.f52614G = null;
                this.f52613F = -1;
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
    public h(@l3.d m<? extends T> sequence, boolean z3, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(sequence, "sequence");
        F.p(predicate, "predicate");
        this.f52609a = sequence;
        this.f52610b = z3;
        this.f52611c = predicate;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }

    public /* synthetic */ h(m mVar, boolean z3, X2.l lVar, int i4, C2197u c2197u) {
        this(mVar, (i4 & 2) != 0 ? true : z3, lVar);
    }
}

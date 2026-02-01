package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class f<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52602a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, Boolean> f52603b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final Iterator<T> f52604E;

        /* renamed from: F, reason: collision with root package name */
        private int f52605F = -1;

        /* renamed from: G, reason: collision with root package name */
        @l3.e
        private T f52606G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ f<T> f52607H;

        a(f<T> fVar) {
            this.f52607H = fVar;
            this.f52604E = ((f) fVar).f52602a.iterator();
        }

        private final void b() {
            while (this.f52604E.hasNext()) {
                T next = this.f52604E.next();
                if (!((Boolean) ((f) this.f52607H).f52603b.C(next)).booleanValue()) {
                    this.f52606G = next;
                    this.f52605F = 1;
                    return;
                }
            }
            this.f52605F = 0;
        }

        public final int c() {
            return this.f52605F;
        }

        @l3.d
        public final Iterator<T> d() {
            return this.f52604E;
        }

        @l3.e
        public final T e() {
            return this.f52606G;
        }

        public final void h(int i4) {
            this.f52605F = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f52605F == -1) {
                b();
            }
            if (this.f52605F == 1 || this.f52604E.hasNext()) {
                return true;
            }
            return false;
        }

        public final void i(@l3.e T t3) {
            this.f52606G = t3;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f52605F == -1) {
                b();
            }
            if (this.f52605F == 1) {
                T t3 = this.f52606G;
                this.f52606G = null;
                this.f52605F = 0;
                return t3;
            }
            return this.f52604E.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@l3.d m<? extends T> sequence, @l3.d X2.l<? super T, Boolean> predicate) {
        F.p(sequence, "sequence");
        F.p(predicate, "predicate");
        this.f52602a = sequence;
        this.f52603b = predicate;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}

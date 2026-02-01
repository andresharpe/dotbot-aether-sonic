package androidx.collection;

import X2.p;
import java.util.Iterator;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.collections.Q;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class i {

    /* loaded from: classes.dex */
    public static final class a extends Q {

        /* renamed from: E, reason: collision with root package name */
        private int f6490E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ h f6491F;

        a(h<T> hVar) {
            this.f6491F = hVar;
        }

        @Override // kotlin.collections.Q
        public long c() {
            h hVar = this.f6491F;
            int i4 = this.f6490E;
            this.f6490E = i4 + 1;
            return hVar.o(i4);
        }

        public final int d() {
            return this.f6490E;
        }

        public final void e(int i4) {
            this.f6490E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6490E < this.f6491F.A()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f6492E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ h f6493F;

        b(h<T> hVar) {
            this.f6493F = hVar;
        }

        public final int b() {
            return this.f6492E;
        }

        public final void c(int i4) {
            this.f6492E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6492E < this.f6493F.A()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            h hVar = this.f6493F;
            int i4 = this.f6492E;
            this.f6492E = i4 + 1;
            return (T) hVar.B(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@l3.d h<T> receiver$0, long j4) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.e(j4);
    }

    public static final <T> void b(@l3.d h<T> receiver$0, @l3.d p<? super Long, ? super T, H0> action) {
        F.q(receiver$0, "receiver$0");
        F.q(action, "action");
        int A3 = receiver$0.A();
        for (int i4 = 0; i4 < A3; i4++) {
            action.c0(Long.valueOf(receiver$0.o(i4)), receiver$0.B(i4));
        }
    }

    public static final <T> T c(@l3.d h<T> receiver$0, long j4, T t3) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.j(j4, t3);
    }

    public static final <T> T d(@l3.d h<T> receiver$0, long j4, @l3.d X2.a<? extends T> defaultValue) {
        F.q(receiver$0, "receiver$0");
        F.q(defaultValue, "defaultValue");
        T i4 = receiver$0.i(j4);
        if (i4 == null) {
            return defaultValue.n();
        }
        return i4;
    }

    public static final <T> int e(@l3.d h<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.A();
    }

    public static final <T> boolean f(@l3.d h<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return !receiver$0.n();
    }

    @l3.d
    public static final <T> Q g(@l3.d h<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return new a(receiver$0);
    }

    @l3.d
    public static final <T> h<T> h(@l3.d h<T> receiver$0, @l3.d h<T> other) {
        F.q(receiver$0, "receiver$0");
        F.q(other, "other");
        h<T> hVar = new h<>(receiver$0.A() + other.A());
        hVar.q(receiver$0);
        hVar.q(other);
        return hVar;
    }

    @InterfaceC2205l(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean i(@l3.d h<T> receiver$0, long j4, T t3) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.t(j4, t3);
    }

    public static final <T> void j(@l3.d h<T> receiver$0, long j4, T t3) {
        F.q(receiver$0, "receiver$0");
        receiver$0.p(j4, t3);
    }

    @l3.d
    public static final <T> Iterator<T> k(@l3.d h<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return new b(receiver$0);
    }
}

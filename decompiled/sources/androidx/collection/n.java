package androidx.collection;

import X2.p;
import java.util.Iterator;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.collections.P;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class n {

    /* loaded from: classes.dex */
    public static final class a extends P {

        /* renamed from: E, reason: collision with root package name */
        private int f6534E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ m f6535F;

        a(m<T> mVar) {
            this.f6535F = mVar;
        }

        @Override // kotlin.collections.P
        public int c() {
            m mVar = this.f6535F;
            int i4 = this.f6534E;
            this.f6534E = i4 + 1;
            return mVar.o(i4);
        }

        public final int d() {
            return this.f6534E;
        }

        public final void e(int i4) {
            this.f6534E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6534E < this.f6535F.B()) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    public static final class b<T> implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        private int f6536E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ m f6537F;

        b(m<T> mVar) {
            this.f6537F = mVar;
        }

        public final int b() {
            return this.f6536E;
        }

        public final void c(int i4) {
            this.f6536E = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f6536E < this.f6537F.B()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            m mVar = this.f6537F;
            int i4 = this.f6536E;
            this.f6536E = i4 + 1;
            return (T) mVar.C(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> boolean a(@l3.d m<T> receiver$0, int i4) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.e(i4);
    }

    public static final <T> void b(@l3.d m<T> receiver$0, @l3.d p<? super Integer, ? super T, H0> action) {
        F.q(receiver$0, "receiver$0");
        F.q(action, "action");
        int B3 = receiver$0.B();
        for (int i4 = 0; i4 < B3; i4++) {
            action.c0(Integer.valueOf(receiver$0.o(i4)), receiver$0.C(i4));
        }
    }

    public static final <T> T c(@l3.d m<T> receiver$0, int i4, T t3) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.j(i4, t3);
    }

    public static final <T> T d(@l3.d m<T> receiver$0, int i4, @l3.d X2.a<? extends T> defaultValue) {
        F.q(receiver$0, "receiver$0");
        F.q(defaultValue, "defaultValue");
        T i5 = receiver$0.i(i4);
        if (i5 == null) {
            return defaultValue.n();
        }
        return i5;
    }

    public static final <T> int e(@l3.d m<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.B();
    }

    public static final <T> boolean f(@l3.d m<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return !receiver$0.n();
    }

    @l3.d
    public static final <T> P g(@l3.d m<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return new a(receiver$0);
    }

    @l3.d
    public static final <T> m<T> h(@l3.d m<T> receiver$0, @l3.d m<T> other) {
        F.q(receiver$0, "receiver$0");
        F.q(other, "other");
        m<T> mVar = new m<>(receiver$0.B() + other.B());
        mVar.q(receiver$0);
        mVar.q(other);
        return mVar;
    }

    @InterfaceC2205l(message = "Replaced with member function. Remove extension import!")
    public static final <T> boolean i(@l3.d m<T> receiver$0, int i4, T t3) {
        F.q(receiver$0, "receiver$0");
        return receiver$0.t(i4, t3);
    }

    public static final <T> void j(@l3.d m<T> receiver$0, int i4, T t3) {
        F.q(receiver$0, "receiver$0");
        receiver$0.p(i4, t3);
    }

    @l3.d
    public static final <T> Iterator<T> k(@l3.d m<T> receiver$0) {
        F.q(receiver$0, "receiver$0");
        return new b(receiver$0);
    }
}

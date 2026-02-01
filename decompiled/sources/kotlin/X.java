package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
final class X<T> implements A<T>, Serializable {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f51815H = new a(null);

    /* renamed from: I, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<X<?>, Object> f51816I = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "F");

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private volatile X2.a<? extends T> f51817E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private volatile Object f51818F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Object f51819G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public X(@l3.d X2.a<? extends T> initializer) {
        kotlin.jvm.internal.F.p(initializer, "initializer");
        this.f51817E = initializer;
        B0 b02 = B0.f51790a;
        this.f51818F = b02;
        this.f51819G = b02;
    }

    private final Object b() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.A
    public boolean a() {
        if (this.f51818F != B0.f51790a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.A
    public T getValue() {
        T t3 = (T) this.f51818F;
        B0 b02 = B0.f51790a;
        if (t3 != b02) {
            return t3;
        }
        X2.a<? extends T> aVar = this.f51817E;
        if (aVar != null) {
            T n4 = aVar.n();
            if (androidx.concurrent.futures.b.a(f51816I, this, b02, n4)) {
                this.f51817E = null;
                return n4;
            }
        }
        return (T) this.f51818F;
    }

    @l3.d
    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C2197u;

/* renamed from: kotlin.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2118f0<T> implements A<T>, Serializable {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private X2.a<? extends T> f52086E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private volatile Object f52087F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Object f52088G;

    public C2118f0(@l3.d X2.a<? extends T> initializer, @l3.e Object obj) {
        kotlin.jvm.internal.F.p(initializer, "initializer");
        this.f52086E = initializer;
        this.f52087F = B0.f51790a;
        this.f52088G = obj == null ? this : obj;
    }

    private final Object b() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.A
    public boolean a() {
        if (this.f52087F != B0.f51790a) {
            return true;
        }
        return false;
    }

    @Override // kotlin.A
    public T getValue() {
        T t3;
        T t4 = (T) this.f52087F;
        B0 b02 = B0.f51790a;
        if (t4 != b02) {
            return t4;
        }
        synchronized (this.f52088G) {
            t3 = (T) this.f52087F;
            if (t3 == b02) {
                X2.a<? extends T> aVar = this.f52086E;
                kotlin.jvm.internal.F.m(aVar);
                t3 = aVar.n();
                this.f52087F = t3;
                this.f52086E = null;
            }
        }
        return t3;
    }

    @l3.d
    public String toString() {
        if (a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C2118f0(X2.a aVar, Object obj, int i4, C2197u c2197u) {
        this(aVar, (i4 & 2) != 0 ? null : obj);
    }
}

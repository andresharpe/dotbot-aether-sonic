package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.O;

@W2.g
/* loaded from: classes2.dex */
public final class P<S extends O<S>> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final Object f54451a;

    private /* synthetic */ P(Object obj) {
        this.f54451a = obj;
    }

    public static final /* synthetic */ P a(Object obj) {
        return new P(obj);
    }

    @l3.d
    public static <S extends O<S>> Object b(@l3.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof P) && kotlin.jvm.internal.F.g(obj, ((P) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.F.g(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @l3.d
    public static final S f(Object obj) {
        if (obj != C2301h.f54488b) {
            if (obj != null) {
                return (S) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        if (obj == C2301h.f54488b) {
            return true;
        }
        return false;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f54451a, obj);
    }

    public int hashCode() {
        return g(this.f54451a);
    }

    public final /* synthetic */ Object j() {
        return this.f54451a;
    }

    public String toString() {
        return i(this.f54451a);
    }
}

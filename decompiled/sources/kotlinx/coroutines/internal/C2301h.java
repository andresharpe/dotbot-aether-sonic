package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes2.dex */
public final class C2301h {

    /* renamed from: a */
    private static final int f54487a = 16;

    /* renamed from: b */
    @l3.d
    private static final S f54488b = new S("CLOSED");

    public static final /* synthetic */ S a() {
        return f54488b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.i] */
    @l3.d
    public static final <N extends AbstractC2302i<N>> N b(@l3.d N n4) {
        while (true) {
            Object e4 = n4.e();
            if (e4 == f54488b) {
                return n4;
            }
            ?? r02 = (AbstractC2302i) e4;
            if (r02 == 0) {
                if (n4.j()) {
                    return n4;
                }
            } else {
                n4 = r02;
            }
        }
    }

    private static final <S extends O<S>> Object c(S s4, long j4, X2.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s4.o() < j4 || s4.g()) {
                Object e4 = s4.e();
                if (e4 == f54488b) {
                    return P.b(f54488b);
                }
                S s5 = (S) ((AbstractC2302i) e4);
                if (s5 == null) {
                    s5 = pVar.c0(Long.valueOf(s4.o() + 1), s4);
                    if (s4.m(s5)) {
                        if (s4.g()) {
                            s4.l();
                        }
                    }
                }
                s4 = s5;
            } else {
                return P.b(s4);
            }
        }
    }

    private static /* synthetic */ void d() {
    }
}

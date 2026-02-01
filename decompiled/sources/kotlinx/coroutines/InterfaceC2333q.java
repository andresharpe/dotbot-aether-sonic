package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2333q<T> extends kotlin.coroutines.c<T> {

    /* renamed from: kotlinx.coroutines.q$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC2333q interfaceC2333q, Throwable th, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 1) != 0) {
                    th = null;
                }
                return interfaceC2333q.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(InterfaceC2333q interfaceC2333q, Object obj, Object obj2, int i4, Object obj3) {
            if (obj3 == null) {
                if ((i4 & 2) != 0) {
                    obj2 = null;
                }
                return interfaceC2333q.o(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    @l3.e
    @G0
    Object L(@l3.d Throwable th);

    @A0
    void M(T t3, @l3.e X2.l<? super Throwable, kotlin.H0> lVar);

    @A0
    void O(@l3.d N n4, @l3.d Throwable th);

    @A0
    void Q(@l3.d N n4, T t3);

    @G0
    void T();

    boolean c();

    boolean d(@l3.e Throwable th);

    boolean isCancelled();

    @l3.e
    @G0
    Object j0(T t3, @l3.e Object obj, @l3.e X2.l<? super Throwable, kotlin.H0> lVar);

    boolean m();

    @l3.e
    @G0
    Object o(T t3, @l3.e Object obj);

    @G0
    void t0(@l3.d Object obj);

    void u(@l3.d X2.l<? super Throwable, kotlin.H0> lVar);
}

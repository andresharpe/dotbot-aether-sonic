package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final S f54070a = new S("NONE");

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final S f54071b = new S("PENDING");

    @l3.d
    public static final <T> t<T> a(T t3) {
        if (t3 == null) {
            t3 = (T) kotlinx.coroutines.flow.internal.s.f54253a;
        }
        return new I(t3);
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> d(@l3.d H<? extends T> h4, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        if (((i4 >= 0 && i4 < 2) || i4 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return h4;
        }
        return z.e(h4, fVar, i4, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@l3.d t<T> tVar, @l3.d X2.l<? super T, ? extends T> lVar) {
        ?? r02;
        do {
            r02 = (Object) tVar.getValue();
        } while (!tVar.h(r02, lVar.C(r02)));
        return r02;
    }

    private static /* synthetic */ void f() {
    }

    private static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void h(@l3.d t<T> tVar, @l3.d X2.l<? super T, ? extends T> lVar) {
        A2.a aVar;
        do {
            aVar = (Object) tVar.getValue();
        } while (!tVar.h(aVar, lVar.C(aVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T i(@l3.d t<T> tVar, @l3.d X2.l<? super T, ? extends T> lVar) {
        A2.a aVar;
        T C3;
        do {
            aVar = (Object) tVar.getValue();
            C3 = lVar.C(aVar);
        } while (!tVar.h(aVar, C3));
        return C3;
    }
}

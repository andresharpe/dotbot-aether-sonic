package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.C2307n;

/* renamed from: kotlinx.coroutines.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2289g0<T> extends kotlinx.coroutines.internal.N<T> {

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54390H = AtomicIntegerFieldUpdater.newUpdater(C2289g0.class, "_decision");

    @l3.d
    private volatile /* synthetic */ int _decision;

    public C2289g0(@l3.d kotlin.coroutines.f fVar, @l3.d kotlin.coroutines.c<? super T> cVar) {
        super(fVar, cVar);
        this._decision = 0;
    }

    private final boolean L1() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f54390H.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean M1() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f54390H.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.N, kotlinx.coroutines.AbstractC2234a
    protected void E1(@l3.e Object obj) {
        kotlin.coroutines.c e4;
        if (!L1()) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(this.f54448G);
            C2307n.g(e4, J.a(obj, this.f54448G), null, 2, null);
        }
    }

    @l3.e
    public final Object K1() {
        Object l4;
        if (M1()) {
            l4 = kotlin.coroutines.intrinsics.b.l();
            return l4;
        }
        Object o4 = T0.o(P0());
        if (!(o4 instanceof E)) {
            return o4;
        }
        throw ((E) o4).f52925a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.N, kotlinx.coroutines.S0
    public void h0(@l3.e Object obj) {
        E1(obj);
    }
}

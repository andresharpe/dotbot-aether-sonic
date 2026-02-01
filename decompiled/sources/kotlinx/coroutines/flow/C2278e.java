package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.U;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2278e<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f54101J = AtomicIntegerFieldUpdater.newUpdater(C2278e.class, "consumed");

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final kotlinx.coroutines.channels.F<T> f54102H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f54103I;

    @l3.d
    private volatile /* synthetic */ int consumed;

    public /* synthetic */ C2278e(kotlinx.coroutines.channels.F f4, boolean z3, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(f4, z3, (i5 & 4) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 8) != 0 ? -3 : i4, (i5 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final void q() {
        if (this.f54103I && f54101J.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.InterfaceC2282i
    @l3.e
    public Object a(@l3.d InterfaceC2283j<? super T> interfaceC2283j, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object l5;
        if (this.f54133F == -3) {
            q();
            Object e4 = C2285l.e(interfaceC2283j, this.f54102H, this.f54103I, cVar);
            l5 = kotlin.coroutines.intrinsics.b.l();
            if (e4 == l5) {
                return e4;
            }
            return H0.f51801a;
        }
        Object a4 = super.a(interfaceC2283j, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (a4 == l4) {
            return a4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected String d() {
        return "channel=" + this.f54102H;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.e
    protected Object g(@l3.d kotlinx.coroutines.channels.D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object e4 = C2285l.e(new kotlinx.coroutines.flow.internal.u(d4), this.f54102H, this.f54103I, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (e4 == l4) {
            return e4;
        }
        return H0.f51801a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected kotlinx.coroutines.flow.internal.d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new C2278e(this.f54102H, this.f54103I, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public InterfaceC2282i<T> m() {
        return new C2278e(this.f54102H, this.f54103I, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public kotlinx.coroutines.channels.F<T> p(@l3.d U u3) {
        q();
        if (this.f54133F == -3) {
            return this.f54102H;
        }
        return super.p(u3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2278e(@l3.d kotlinx.coroutines.channels.F<? extends T> f4, boolean z3, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(fVar, i4, bufferOverflow);
        this.f54102H = f4;
        this.f54103I = z3;
        this.consumed = 0;
    }
}

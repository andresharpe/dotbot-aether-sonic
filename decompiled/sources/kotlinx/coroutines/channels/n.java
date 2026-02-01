package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.AbstractC2234a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.S0;

/* loaded from: classes2.dex */
public class n<E> extends AbstractC2234a<H0> implements InterfaceC2254m<E> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final InterfaceC2254m<E> f53127G;

    public n(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2254m<E> interfaceC2254m, boolean z3, boolean z4) {
        super(fVar, z3, z4);
        this.f53127G = interfaceC2254m;
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    @kotlin.internal.h
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @V(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object B(@l3.d kotlin.coroutines.c<? super E> cVar) {
        return this.f53127G.B(cVar);
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    public Object E(@l3.d kotlin.coroutines.c<? super q<? extends E>> cVar) {
        Object E3 = this.f53127G.E(cVar);
        kotlin.coroutines.intrinsics.b.l();
        return E3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final InterfaceC2254m<E> J1() {
        return this.f53127G;
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public kotlinx.coroutines.selects.e<E, J<E>> K() {
        return this.f53127G.K();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    public Object N(@l3.d kotlin.coroutines.c<? super E> cVar) {
        return this.f53127G.N(cVar);
    }

    @Override // kotlinx.coroutines.channels.J
    /* renamed from: P */
    public boolean d(@l3.e Throwable th) {
        return this.f53127G.d(th);
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public Object S(E e4) {
        return this.f53127G.S(e4);
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.e
    public Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return this.f53127G.U(e4, cVar);
    }

    @Override // kotlinx.coroutines.channels.J
    public boolean W() {
        return this.f53127G.W();
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public /* synthetic */ void cancel() {
        n0(new JobCancellationException(q0(), null, this));
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean d(Throwable th) {
        n0(new JobCancellationException(q0(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public final void f(@l3.e CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(q0(), null, this);
        }
        n0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.J
    @A0
    public void g(@l3.d X2.l<? super Throwable, H0> lVar) {
        this.f53127G.g(lVar);
    }

    @l3.d
    public final InterfaceC2254m<E> h() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.F
    public boolean isEmpty() {
        return this.f53127G.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public o<E> iterator() {
        return this.f53127G.iterator();
    }

    @Override // kotlinx.coroutines.channels.F
    public boolean l() {
        return this.f53127G.l();
    }

    @Override // kotlinx.coroutines.S0
    public void n0(@l3.d Throwable th) {
        CancellationException x12 = S0.x1(this, th, null, 1, null);
        this.f53127G.f(x12);
        l0(x12);
    }

    @Override // kotlinx.coroutines.channels.J
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e4) {
        return this.f53127G.offer(e4);
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @V(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return this.f53127G.poll();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public kotlinx.coroutines.selects.d<E> r() {
        return this.f53127G.r();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public kotlinx.coroutines.selects.d<q<E>> s() {
        return this.f53127G.s();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public kotlinx.coroutines.selects.d<E> w() {
        return this.f53127G.w();
    }

    @Override // kotlinx.coroutines.channels.F
    @l3.d
    public Object y() {
        return this.f53127G.y();
    }
}

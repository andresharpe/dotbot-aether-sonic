package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;
import kotlin.V;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.AbstractC2234a;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.L0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.S0;
import kotlinx.coroutines.channels.J;

/* renamed from: kotlinx.coroutines.channels.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2252k<E> extends AbstractC2234a<H0> implements D<E>, InterfaceC2250i<E> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final InterfaceC2250i<E> f53106G;

    public C2252k(@l3.d kotlin.coroutines.f fVar, @l3.d InterfaceC2250i<E> interfaceC2250i, boolean z3) {
        super(fVar, false, z3);
        this.f53106G = interfaceC2250i;
        S0((L0) fVar.a(L0.f52941w));
    }

    @Override // kotlinx.coroutines.AbstractC2234a
    protected void G1(@l3.d Throwable th, boolean z3) {
        if (!this.f53106G.d(th) && !z3) {
            Q.b(e(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @l3.d
    public final InterfaceC2250i<E> J1() {
        return this.f53106G;
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public kotlinx.coroutines.selects.e<E, J<E>> K() {
        return this.f53106G.K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractC2234a
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public void H1(@l3.d H0 h02) {
        J.a.a(this.f53106G, null, 1, null);
    }

    @Override // kotlinx.coroutines.channels.J
    /* renamed from: P */
    public boolean d(@l3.e Throwable th) {
        boolean d4 = this.f53106G.d(th);
        start();
        return d4;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC2250i
    @l3.d
    public F<E> R() {
        return this.f53106G.R();
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.d
    public Object S(E e4) {
        return this.f53106G.S(e4);
    }

    @Override // kotlinx.coroutines.channels.J
    @l3.e
    public Object U(E e4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return this.f53106G.U(e4, cVar);
    }

    @Override // kotlinx.coroutines.channels.J
    public boolean W() {
        return this.f53106G.W();
    }

    @Override // kotlinx.coroutines.AbstractC2234a, kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public boolean c() {
        return super.c();
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean d(Throwable th) {
        if (th == null) {
            th = new JobCancellationException(q0(), null, this);
        }
        n0(th);
        return true;
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public final void f(@l3.e CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(q0(), null, this);
        }
        n0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.J
    @A0
    public void g(@l3.d X2.l<? super Throwable, H0> lVar) {
        this.f53106G.g(lVar);
    }

    @Override // kotlinx.coroutines.channels.D
    @l3.d
    public J<E> h() {
        return this;
    }

    @Override // kotlinx.coroutines.S0
    public void n0(@l3.d Throwable th) {
        CancellationException x12 = S0.x1(this, th, null, 1, null);
        this.f53106G.f(x12);
        l0(x12);
    }

    @Override // kotlinx.coroutines.channels.J
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @V(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e4) {
        return this.f53106G.offer(e4);
    }
}

package kotlinx.coroutines.channels;

import kotlinx.coroutines.C2336s;
import kotlinx.coroutines.X;
import kotlinx.coroutines.internal.C2317y;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class v<E> extends I implements G<E> {

    /* renamed from: H, reason: collision with root package name */
    @W2.f
    @l3.e
    public final Throwable f53350H;

    public v(@l3.e Throwable th) {
        this.f53350H = th;
    }

    @Override // kotlinx.coroutines.channels.G
    public void X(E e4) {
    }

    @Override // kotlinx.coroutines.channels.I
    public void X0() {
    }

    @Override // kotlinx.coroutines.channels.I
    public void Z0(@l3.d v<?> vVar) {
    }

    @Override // kotlinx.coroutines.channels.I
    @l3.d
    public S a1(@l3.e C2317y.d dVar) {
        S s4 = C2336s.f54561d;
        if (dVar != null) {
            dVar.d();
        }
        return s4;
    }

    @Override // kotlinx.coroutines.channels.G
    @l3.d
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public v<E> v() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.I
    @l3.d
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public v<E> Y0() {
        return this;
    }

    @l3.d
    public final Throwable e1() {
        Throwable th = this.f53350H;
        if (th == null) {
            return new ClosedReceiveChannelException(r.f53135a);
        }
        return th;
    }

    @l3.d
    public final Throwable f1() {
        Throwable th = this.f53350H;
        if (th == null) {
            return new ClosedSendChannelException(r.f53135a);
        }
        return th;
    }

    @Override // kotlinx.coroutines.channels.G
    @l3.d
    public S o0(E e4, @l3.e C2317y.d dVar) {
        S s4 = C2336s.f54561d;
        if (dVar != null) {
            dVar.d();
        }
        return s4;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.d
    public String toString() {
        return "Closed@" + X.b(this) + '[' + this.f53350H + ']';
    }
}

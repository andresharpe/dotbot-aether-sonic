package kotlinx.coroutines.flow;

import kotlin.H0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2279f<T> extends kotlinx.coroutines.flow.internal.d<T> {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final X2.p<kotlinx.coroutines.channels.D<? super T>, kotlin.coroutines.c<? super H0>, Object> f54104H;

    public /* synthetic */ C2279f(X2.p pVar, kotlin.coroutines.f fVar, int i4, BufferOverflow bufferOverflow, int i5, C2197u c2197u) {
        this(pVar, (i5 & 2) != 0 ? EmptyCoroutineContext.f52041E : fVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    static /* synthetic */ Object q(C2279f c2279f, kotlinx.coroutines.channels.D d4, kotlin.coroutines.c cVar) {
        Object l4;
        Object c02 = c2279f.f54104H.c0(d4, cVar);
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (c02 == l4) {
            return c02;
        }
        return H0.f51801a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.d
    @l3.e
    public Object g(@l3.d kotlinx.coroutines.channels.D<? super T> d4, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        return q(this, d4, cVar);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    protected kotlinx.coroutines.flow.internal.d<T> l(@l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        return new C2279f(this.f54104H, fVar, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @l3.d
    public String toString() {
        return "block[" + this.f54104H + "] -> " + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2279f(@l3.d X2.p<? super kotlinx.coroutines.channels.D<? super T>, ? super kotlin.coroutines.c<? super H0>, ? extends Object> pVar, @l3.d kotlin.coroutines.f fVar, int i4, @l3.d BufferOverflow bufferOverflow) {
        super(fVar, i4, bufferOverflow);
        this.f54104H = pVar;
    }
}

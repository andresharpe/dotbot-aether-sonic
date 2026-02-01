package kotlinx.coroutines;

@G0
/* renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2234a<T> extends S0 implements L0, kotlin.coroutines.c<T>, U {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f53010F;

    public AbstractC2234a(@l3.d kotlin.coroutines.f fVar, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            S0((L0) fVar.a(L0.f52941w));
        }
        this.f53010F = fVar.A(this);
    }

    public static /* synthetic */ void F1() {
    }

    protected void E1(@l3.e Object obj) {
        h0(obj);
    }

    protected void G1(@l3.d Throwable th, boolean z3) {
    }

    protected void H1(T t3) {
    }

    public final <R> void I1(@l3.d CoroutineStart coroutineStart, R r4, @l3.d X2.p<? super R, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        coroutineStart.f(pVar, r4, this);
    }

    @Override // kotlinx.coroutines.S0
    public final void R0(@l3.d Throwable th) {
        Q.b(this.f53010F, th);
    }

    @Override // kotlinx.coroutines.S0, kotlinx.coroutines.L0
    public boolean c() {
        return super.c();
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public final kotlin.coroutines.f e() {
        return this.f53010F;
    }

    @Override // kotlinx.coroutines.S0
    @l3.d
    public String g1() {
        String b4 = M.b(this.f53010F);
        if (b4 == null) {
            return super.g1();
        }
        return kotlin.text.F.f52746b + b4 + "\":" + super.g1();
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f53010F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.S0
    protected final void m1(@l3.e Object obj) {
        if (obj instanceof E) {
            E e4 = (E) obj;
            G1(e4.f52925a, e4.a());
        } else {
            H1(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.S0
    @l3.d
    public String q0() {
        return X.a(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.c
    public final void x(@l3.d Object obj) {
        Object d12 = d1(J.d(obj, null, 1, null));
        if (d12 == T0.f52975b) {
            return;
        }
        E1(d12);
    }
}

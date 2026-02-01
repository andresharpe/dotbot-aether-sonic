package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlinx.coroutines.L0;

/* loaded from: classes2.dex */
public final class Y0 extends kotlin.coroutines.a implements L0 {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final Y0 f53005F = new Y0();

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private static final String f53006G = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private Y0() {
        super(L0.f52941w);
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public static /* synthetic */ void h1() {
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public static /* synthetic */ void i1() {
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public static /* synthetic */ void j1() {
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public static /* synthetic */ void k1() {
    }

    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public static /* synthetic */ void l1() {
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public kotlinx.coroutines.selects.c E0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    public kotlin.sequences.m<L0> F() {
        kotlin.sequences.m<L0> g4;
        g4 = kotlin.sequences.s.g();
        return g4;
    }

    @Override // kotlinx.coroutines.L0
    @l3.e
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public Object H(@l3.d kotlin.coroutines.c<? super kotlin.H0> cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public InterfaceC2328n0 V(@l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        return Z0.f53009E;
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public CancellationException a0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.L0
    public boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        f(null);
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean d(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public void f(@l3.e CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public InterfaceC2344w f1(@l3.d InterfaceC2348y interfaceC2348y) {
        return Z0.f53009E;
    }

    @Override // kotlinx.coroutines.L0
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.L0
    public boolean m() {
        return false;
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public InterfaceC2328n0 p(boolean z3, boolean z4, @l3.d X2.l<? super Throwable, kotlin.H0> lVar) {
        return Z0.f53009E;
    }

    @Override // kotlinx.coroutines.L0
    @InterfaceC2205l(level = DeprecationLevel.WARNING, message = f53006G)
    public boolean start() {
        return false;
    }

    @l3.d
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.L0
    @l3.d
    @InterfaceC2205l(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public L0 u0(@l3.d L0 l02) {
        return L0.a.i(this, l02);
    }
}

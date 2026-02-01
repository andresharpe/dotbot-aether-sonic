package kotlinx.coroutines.android;

import X2.l;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.u;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.InterfaceC2241c0;
import kotlinx.coroutines.InterfaceC2328n0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.Z0;

/* loaded from: classes2.dex */
public final class d extends e implements InterfaceC2241c0 {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Handler f53013G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private final String f53014H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f53015I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final d f53016J;

    @l3.e
    private volatile d _immediate;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q f53017E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ d f53018F;

        public a(InterfaceC2333q interfaceC2333q, d dVar) {
            this.f53017E = interfaceC2333q;
            this.f53018F = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f53017E.Q(this.f53018F, H0.f51801a);
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements l<Throwable, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Runnable f53020G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f53020G = runnable;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            d.this.f53013G.removeCallbacks(this.f53020G);
        }
    }

    private d(Handler handler, String str, boolean z3) {
        super(null);
        this.f53013G = handler;
        this.f53014H = str;
        this.f53015I = z3;
        this._immediate = z3 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f53016J = dVar;
    }

    private final void r1(kotlin.coroutines.f fVar, Runnable runnable) {
        O0.f(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C2322k0.c().h1(fVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(d dVar, Runnable runnable) {
        dVar.f53013G.removeCallbacks(runnable);
    }

    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof d) && ((d) obj).f53013G == this.f53013G) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC2241c0
    public void h(long j4, @l3.d InterfaceC2333q<? super H0> interfaceC2333q) {
        long C3;
        a aVar = new a(interfaceC2333q, this);
        Handler handler = this.f53013G;
        C3 = u.C(j4, kotlin.time.g.f52881c);
        if (handler.postDelayed(aVar, C3)) {
            interfaceC2333q.u(new b(aVar));
        } else {
            r1(interfaceC2333q.e(), aVar);
        }
    }

    @Override // kotlinx.coroutines.N
    public void h1(@l3.d kotlin.coroutines.f fVar, @l3.d Runnable runnable) {
        if (!this.f53013G.post(runnable)) {
            r1(fVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f53013G);
    }

    @Override // kotlinx.coroutines.N
    public boolean j1(@l3.d kotlin.coroutines.f fVar) {
        if (this.f53015I && F.g(Looper.myLooper(), this.f53013G.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.android.e
    @l3.d
    /* renamed from: s1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d o1() {
        return this.f53016J;
    }

    @Override // kotlinx.coroutines.W0, kotlinx.coroutines.N
    @l3.d
    public String toString() {
        String n12 = n1();
        if (n12 == null) {
            String str = this.f53014H;
            if (str == null) {
                str = this.f53013G.toString();
            }
            if (this.f53015I) {
                return str + ".immediate";
            }
            return str;
        }
        return n12;
    }

    @Override // kotlinx.coroutines.android.e, kotlinx.coroutines.InterfaceC2241c0
    @l3.d
    public InterfaceC2328n0 x0(long j4, @l3.d final Runnable runnable, @l3.d kotlin.coroutines.f fVar) {
        long C3;
        Handler handler = this.f53013G;
        C3 = u.C(j4, kotlin.time.g.f52881c);
        if (handler.postDelayed(runnable, C3)) {
            return new InterfaceC2328n0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.InterfaceC2328n0
                public final void f() {
                    d.t1(d.this, runnable);
                }
            };
        }
        r1(fVar, runnable);
        return Z0.f53009E;
    }

    public /* synthetic */ d(Handler handler, String str, int i4, C2197u c2197u) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public d(@l3.d Handler handler, @l3.e String str) {
        this(handler, str, false);
    }
}

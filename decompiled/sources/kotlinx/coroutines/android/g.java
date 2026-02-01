package kotlinx.coroutines.android;

import W2.i;
import W2.j;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.i0;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.InterfaceC2333q;
import kotlinx.coroutines.r;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f53022a = 4611686018427387903L;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    @l3.e
    public static final e f53023b;

    @l3.e
    private static volatile Choreographer choreographer;

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q f53024E;

        public a(InterfaceC2333q interfaceC2333q) {
            this.f53024E = interfaceC2333q;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.l(this.f53024E);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object b4;
        Object obj = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            Result.a aVar = Result.f51807F;
            b4 = Result.b(new d(d(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        if (!Result.i(b4)) {
            obj = b4;
        }
        f53023b = (e) obj;
    }

    @i0
    @l3.d
    public static final Handler d(@l3.d Looper looper, boolean z3) {
        if (z3) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                if (invoke != null) {
                    return (Handler) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    @l3.e
    public static final Object e(@l3.d kotlin.coroutines.c<? super Long> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        kotlin.coroutines.c e5;
        Object l5;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            e5 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            r rVar = new r(e5, 1);
            rVar.T();
            j(choreographer2, rVar);
            Object z3 = rVar.z();
            l5 = kotlin.coroutines.intrinsics.b.l();
            if (z3 == l5) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar2 = new r(e4, 1);
        rVar2.T();
        C2322k0.e().h1(EmptyCoroutineContext.f52041E, new a(rVar2));
        Object z4 = rVar2.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z4 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z4;
    }

    @j
    @l3.d
    @i(name = "from")
    public static final e f(@l3.d Handler handler) {
        return h(handler, null, 1, null);
    }

    @j
    @l3.d
    @i(name = "from")
    public static final e g(@l3.d Handler handler, @l3.e String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e h(Handler handler, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Choreographer choreographer2, final InterfaceC2333q<? super Long> interfaceC2333q) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j4) {
                g.k(InterfaceC2333q.this, j4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(InterfaceC2333q interfaceC2333q, long j4) {
        interfaceC2333q.Q(C2322k0.e(), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(InterfaceC2333q<? super Long> interfaceC2333q) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            F.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, interfaceC2333q);
    }
}

package androidx.core.os;

import android.os.Handler;
import kotlin.H0;

/* renamed from: androidx.core.os.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748k {

    /* renamed from: androidx.core.os.k$a */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<H0> f12741E;

        public a(X2.a<H0> aVar) {
            this.f12741E = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12741E.n();
        }
    }

    /* renamed from: androidx.core.os.k$b */
    /* loaded from: classes.dex */
    public static final class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ X2.a<H0> f12742E;

        public b(X2.a<H0> aVar) {
            this.f12742E = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f12742E.n();
        }
    }

    @l3.d
    public static final Runnable a(@l3.d Handler handler, long j4, @l3.e Object obj, @l3.d X2.a<H0> action) {
        kotlin.jvm.internal.F.p(handler, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j4);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j4, Object obj, X2.a action, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.F.p(handler, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        a aVar = new a(action);
        handler.postAtTime(aVar, obj, j4);
        return aVar;
    }

    @l3.d
    public static final Runnable c(@l3.d Handler handler, long j4, @l3.e Object obj, @l3.d X2.a<H0> action) {
        kotlin.jvm.internal.F.p(handler, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j4);
        } else {
            C0747j.d(handler, bVar, obj, j4);
        }
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j4, Object obj, X2.a action, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.F.p(handler, "<this>");
        kotlin.jvm.internal.F.p(action, "action");
        b bVar = new b(action);
        if (obj == null) {
            handler.postDelayed(bVar, j4);
        } else {
            C0747j.d(handler, bVar, obj, j4);
        }
        return bVar;
    }
}

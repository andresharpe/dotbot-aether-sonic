package kotlin.concurrent;

import W2.i;
import X2.l;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.H0;
import kotlin.internal.f;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import l3.e;

@i(name = "TimersKt")
/* loaded from: classes2.dex */
public final class c {

    @U({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a extends TimerTask {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ l<TimerTask, H0> f52032E;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, H0> lVar) {
            this.f52032E = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f52032E.C(this);
        }
    }

    @f
    private static final Timer a(String str, boolean z3, long j4, long j5, l<? super TimerTask, H0> action) {
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.scheduleAtFixedRate(new a(action), j4, j5);
        return k4;
    }

    @f
    private static final Timer b(String str, boolean z3, Date startAt, long j4, l<? super TimerTask, H0> action) {
        F.p(startAt, "startAt");
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.scheduleAtFixedRate(new a(action), startAt, j4);
        return k4;
    }

    static /* synthetic */ Timer c(String str, boolean z3, long j4, long j5, l action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.scheduleAtFixedRate(new a(action), j4, j5);
        return k4;
    }

    static /* synthetic */ Timer d(String str, boolean z3, Date startAt, long j4, l action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        F.p(startAt, "startAt");
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.scheduleAtFixedRate(new a(action), startAt, j4);
        return k4;
    }

    @f
    private static final TimerTask e(Timer timer, long j4, long j5, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j4, j5);
        return aVar;
    }

    @f
    private static final TimerTask f(Timer timer, long j4, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, j4);
        return aVar;
    }

    @f
    private static final TimerTask g(Timer timer, Date time, long j4, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(time, "time");
        F.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time, j4);
        return aVar;
    }

    @f
    private static final TimerTask h(Timer timer, Date time, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(time, "time");
        F.p(action, "action");
        a aVar = new a(action);
        timer.schedule(aVar, time);
        return aVar;
    }

    @f
    private static final TimerTask i(Timer timer, long j4, long j5, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, j4, j5);
        return aVar;
    }

    @f
    private static final TimerTask j(Timer timer, Date time, long j4, l<? super TimerTask, H0> action) {
        F.p(timer, "<this>");
        F.p(time, "time");
        F.p(action, "action");
        a aVar = new a(action);
        timer.scheduleAtFixedRate(aVar, time, j4);
        return aVar;
    }

    @l3.d
    @kotlin.U
    public static final Timer k(@e String str, boolean z3) {
        if (str == null) {
            return new Timer(z3);
        }
        return new Timer(str, z3);
    }

    @f
    private static final Timer l(String str, boolean z3, long j4, long j5, l<? super TimerTask, H0> action) {
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.schedule(new a(action), j4, j5);
        return k4;
    }

    @f
    private static final Timer m(String str, boolean z3, Date startAt, long j4, l<? super TimerTask, H0> action) {
        F.p(startAt, "startAt");
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.schedule(new a(action), startAt, j4);
        return k4;
    }

    static /* synthetic */ Timer n(String str, boolean z3, long j4, long j5, l action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.schedule(new a(action), j4, j5);
        return k4;
    }

    static /* synthetic */ Timer o(String str, boolean z3, Date startAt, long j4, l action, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        F.p(startAt, "startAt");
        F.p(action, "action");
        Timer k4 = k(str, z3);
        k4.schedule(new a(action), startAt, j4);
        return k4;
    }

    @f
    private static final TimerTask p(l<? super TimerTask, H0> action) {
        F.p(action, "action");
        return new a(action);
    }
}

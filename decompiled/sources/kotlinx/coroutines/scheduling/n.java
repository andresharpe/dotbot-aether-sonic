package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.ranges.s;
import kotlinx.coroutines.internal.U;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final String f54631a = "DefaultDispatcher";

    /* renamed from: g, reason: collision with root package name */
    public static final int f54637g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f54638h = 1;

    /* renamed from: b, reason: collision with root package name */
    @W2.f
    public static final long f54632b = U.g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* renamed from: c, reason: collision with root package name */
    @W2.f
    public static final int f54633c = U.f("kotlinx.coroutines.scheduler.core.pool.size", s.u(U.a(), 2), 1, 0, 8, null);

    /* renamed from: d, reason: collision with root package name */
    @W2.f
    public static final int f54634d = U.f("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f54587Z, 0, CoroutineScheduler.f54587Z, 4, null);

    /* renamed from: e, reason: collision with root package name */
    @W2.f
    public static final long f54635e = TimeUnit.SECONDS.toNanos(U.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* renamed from: f, reason: collision with root package name */
    @W2.f
    @l3.d
    public static i f54636f = g.f54621a;

    /* renamed from: i, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final k f54639i = new l(0);

    /* renamed from: j, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final k f54640j = new l(1);

    public static final boolean a(@l3.d j jVar) {
        if (jVar.f54628F.i0() == 1) {
            return true;
        }
        return false;
    }
}

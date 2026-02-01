package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.U;

@U
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final kotlin.coroutines.f f53424a;

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private final kotlin.coroutines.jvm.internal.c f53425b;

    /* renamed from: c, reason: collision with root package name */
    private final long f53426c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final List<StackTraceElement> f53427d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final String f53428e;

    /* renamed from: f, reason: collision with root package name */
    @l3.e
    private final Thread f53429f;

    /* renamed from: g, reason: collision with root package name */
    @l3.e
    private final kotlin.coroutines.jvm.internal.c f53430g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final List<StackTraceElement> f53431h;

    public e(@l3.d f fVar, @l3.d kotlin.coroutines.f fVar2) {
        this.f53424a = fVar2;
        this.f53425b = fVar.d();
        this.f53426c = fVar.f53433b;
        this.f53427d = fVar.e();
        this.f53428e = fVar.g();
        this.f53429f = fVar.f53436e;
        this.f53430g = fVar.f();
        this.f53431h = fVar.h();
    }

    @l3.d
    public final kotlin.coroutines.f a() {
        return this.f53424a;
    }

    @l3.e
    public final kotlin.coroutines.jvm.internal.c b() {
        return this.f53425b;
    }

    @l3.d
    public final List<StackTraceElement> c() {
        return this.f53427d;
    }

    @l3.e
    public final kotlin.coroutines.jvm.internal.c d() {
        return this.f53430g;
    }

    @l3.e
    public final Thread e() {
        return this.f53429f;
    }

    public final long f() {
        return this.f53426c;
    }

    @l3.d
    public final String g() {
        return this.f53428e;
    }

    @l3.d
    @W2.i(name = "lastObservedStackTrace")
    public final List<StackTraceElement> h() {
        return this.f53431h;
    }
}

package kotlin.time;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.time.q;

/* loaded from: classes2.dex */
final class c implements q {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final q f52870E;

    /* renamed from: F, reason: collision with root package name */
    private final long f52871F;

    public /* synthetic */ c(q qVar, long j4, C2197u c2197u) {
        this(qVar, j4);
    }

    @Override // kotlin.time.q
    @l3.d
    public q a(long j4) {
        return q.a.c(this, j4);
    }

    @Override // kotlin.time.q
    public boolean b() {
        return q.a.b(this);
    }

    @Override // kotlin.time.q
    @l3.d
    public q c(long j4) {
        return new c(this.f52870E, e.h0(this.f52871F, j4), null);
    }

    @Override // kotlin.time.q
    public long e() {
        return e.g0(this.f52870E.e(), this.f52871F);
    }

    @Override // kotlin.time.q
    public boolean f() {
        return q.a.a(this);
    }

    public final long g() {
        return this.f52871F;
    }

    @l3.d
    public final q i() {
        return this.f52870E;
    }

    private c(q mark, long j4) {
        F.p(mark, "mark");
        this.f52870E = mark;
        this.f52871F = j4;
    }
}

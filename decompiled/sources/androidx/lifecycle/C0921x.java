package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.L0;

@androidx.annotation.K
@kotlin.jvm.internal.U({"SMAP\nLifecycleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,70:1\n57#1,3:71\n57#1,3:74\n*S KotlinDebug\n*F\n+ 1 LifecycleController.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:71,3\n36#1:74,3\n*E\n"})
/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921x {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Lifecycle f15732a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final Lifecycle.State f15733b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final C0912n f15734c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final A f15735d;

    public C0921x(@l3.d Lifecycle lifecycle, @l3.d Lifecycle.State minState, @l3.d C0912n dispatchQueue, @l3.d final L0 parentJob) {
        kotlin.jvm.internal.F.p(lifecycle, "lifecycle");
        kotlin.jvm.internal.F.p(minState, "minState");
        kotlin.jvm.internal.F.p(dispatchQueue, "dispatchQueue");
        kotlin.jvm.internal.F.p(parentJob, "parentJob");
        this.f15732a = lifecycle;
        this.f15733b = minState;
        this.f15734c = dispatchQueue;
        A a4 = new A() { // from class: androidx.lifecycle.w
            @Override // androidx.lifecycle.A
            public final void f(E e4, Lifecycle.Event event) {
                C0921x.d(C0921x.this, parentJob, e4, event);
            }
        };
        this.f15735d = a4;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            L0.a.b(parentJob, null, 1, null);
            b();
        } else {
            lifecycle.a(a4);
        }
    }

    private final void c(L0 l02) {
        L0.a.b(l02, null, 1, null);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0921x this$0, L0 parentJob, E source, Lifecycle.Event event) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(parentJob, "$parentJob");
        kotlin.jvm.internal.F.p(source, "source");
        kotlin.jvm.internal.F.p(event, "<anonymous parameter 1>");
        if (source.getLifecycle().b() == Lifecycle.State.DESTROYED) {
            L0.a.b(parentJob, null, 1, null);
            this$0.b();
        } else if (source.getLifecycle().b().compareTo(this$0.f15733b) < 0) {
            this$0.f15734c.h();
        } else {
            this$0.f15734c.i();
        }
    }

    @androidx.annotation.K
    public final void b() {
        this.f15732a.d(this.f15735d);
        this.f15734c.g();
    }
}

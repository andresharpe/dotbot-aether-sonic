package androidx.lifecycle;

import androidx.annotation.InterfaceC0561d;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.W0;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912n {

    /* renamed from: b, reason: collision with root package name */
    private boolean f15689b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15690c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f15688a = true;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final Queue<Runnable> f15691d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0912n this$0, Runnable runnable) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        kotlin.jvm.internal.F.p(runnable, "$runnable");
        this$0.f(runnable);
    }

    @androidx.annotation.K
    private final void f(Runnable runnable) {
        if (this.f15691d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    @androidx.annotation.K
    public final boolean b() {
        if (!this.f15689b && this.f15688a) {
            return false;
        }
        return true;
    }

    @InterfaceC0561d
    public final void c(@l3.d kotlin.coroutines.f context, @l3.d final Runnable runnable) {
        kotlin.jvm.internal.F.p(context, "context");
        kotlin.jvm.internal.F.p(runnable, "runnable");
        W0 m12 = C2322k0.e().m1();
        if (!m12.j1(context) && !b()) {
            f(runnable);
        } else {
            m12.h1(context, new Runnable() { // from class: androidx.lifecycle.m
                @Override // java.lang.Runnable
                public final void run() {
                    C0912n.d(C0912n.this, runnable);
                }
            });
        }
    }

    @androidx.annotation.K
    public final void e() {
        if (this.f15690c) {
            return;
        }
        try {
            this.f15690c = true;
            while ((!this.f15691d.isEmpty()) && b()) {
                Runnable poll = this.f15691d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f15690c = false;
        }
    }

    @androidx.annotation.K
    public final void g() {
        this.f15689b = true;
        e();
    }

    @androidx.annotation.K
    public final void h() {
        this.f15688a = true;
    }

    @androidx.annotation.K
    public final void i() {
        if (!this.f15688a) {
            return;
        }
        if (!this.f15689b) {
            this.f15688a = false;
            e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}

package androidx.arch.core.executor;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile c f6366c;

    /* renamed from: d, reason: collision with root package name */
    @N
    private static final Executor f6367d = new Executor() { // from class: androidx.arch.core.executor.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.j(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    @N
    private static final Executor f6368e = new Executor() { // from class: androidx.arch.core.executor.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.k(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @N
    private e f6369a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final e f6370b;

    private c() {
        d dVar = new d();
        this.f6370b = dVar;
        this.f6369a = dVar;
    }

    @N
    public static Executor g() {
        return f6368e;
    }

    @N
    public static c h() {
        if (f6366c != null) {
            return f6366c;
        }
        synchronized (c.class) {
            try {
                if (f6366c == null) {
                    f6366c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6366c;
    }

    @N
    public static Executor i() {
        return f6367d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        h().d(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Runnable runnable) {
        h().a(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public void a(@N Runnable runnable) {
        this.f6369a.a(runnable);
    }

    @Override // androidx.arch.core.executor.e
    public boolean c() {
        return this.f6369a.c();
    }

    @Override // androidx.arch.core.executor.e
    public void d(@N Runnable runnable) {
        this.f6369a.d(runnable);
    }

    public void l(@P e eVar) {
        if (eVar == null) {
            eVar = this.f6370b;
        }
        this.f6369a = eVar;
    }
}

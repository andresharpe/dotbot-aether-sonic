package com.android.volley;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class b implements j {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f24407a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f24408b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f24409c;

    /* loaded from: classes.dex */
    class a implements InterfaceC0209b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f24410a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f24411b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f24412c;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
            this.f24410a = atomicReference;
            this.f24411b = countDownLatch;
            this.f24412c = atomicReference2;
        }

        @Override // com.android.volley.b.InterfaceC0209b
        public void a(VolleyError volleyError) {
            this.f24412c.set(volleyError);
            this.f24411b.countDown();
        }

        @Override // com.android.volley.b.InterfaceC0209b
        public void b(l lVar) {
            this.f24410a.set(lVar);
            this.f24411b.countDown();
        }
    }

    /* renamed from: com.android.volley.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0209b {
        void a(VolleyError volleyError);

        void b(l lVar);
    }

    @Override // com.android.volley.j
    public l a(Request<?> request) throws VolleyError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        e(request, new a(atomicReference, countDownLatch, atomicReference2));
        try {
            countDownLatch.await();
            if (atomicReference.get() != null) {
                return (l) atomicReference.get();
            }
            if (atomicReference2.get() != null) {
                throw ((VolleyError) atomicReference2.get());
            }
            throw new VolleyError("Neither response entry was set");
        } catch (InterruptedException e4) {
            s.d(e4, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new VolleyError(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ExecutorService b() {
        return this.f24407a;
    }

    protected ExecutorService c() {
        return this.f24408b;
    }

    protected ScheduledExecutorService d() {
        return this.f24409c;
    }

    public abstract void e(Request<?> request, InterfaceC0209b interfaceC0209b);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f24407a = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f24408b = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void h(ScheduledExecutorService scheduledExecutorService) {
        this.f24409c = scheduledExecutorService;
    }
}

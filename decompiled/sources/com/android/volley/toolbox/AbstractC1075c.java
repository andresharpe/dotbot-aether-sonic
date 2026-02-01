package com.android.volley.toolbox;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.android.volley.toolbox.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1075c extends AbstractC1077e {

    /* renamed from: a, reason: collision with root package name */
    private ExecutorService f24553a;

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f24554b;

    /* renamed from: com.android.volley.toolbox.c$a */
    /* loaded from: classes.dex */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f24555a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f24556b;

        a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f24555a = atomicReference;
            this.f24556b = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void a(AuthFailureError authFailureError) {
            this.f24555a.set(new C0214c(null, 0 == true ? 1 : 0, authFailureError, 0 == true ? 1 : 0));
            this.f24556b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void b(n nVar) {
            this.f24555a.set(new C0214c(nVar, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f24556b.countDown();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void c(IOException iOException) {
            this.f24555a.set(new C0214c(null, iOException, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
            this.f24556b.countDown();
        }
    }

    /* renamed from: com.android.volley.toolbox.c$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(AuthFailureError authFailureError);

        void b(n nVar);

        void c(IOException iOException);
    }

    /* renamed from: com.android.volley.toolbox.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0214c {

        /* renamed from: a, reason: collision with root package name */
        n f24558a;

        /* renamed from: b, reason: collision with root package name */
        IOException f24559b;

        /* renamed from: c, reason: collision with root package name */
        AuthFailureError f24560c;

        /* synthetic */ C0214c(n nVar, IOException iOException, AuthFailureError authFailureError, a aVar) {
            this(nVar, iOException, authFailureError);
        }

        private C0214c(@P n nVar, @P IOException iOException, @P AuthFailureError authFailureError) {
            this.f24558a = nVar;
            this.f24559b = iOException;
            this.f24560c = authFailureError;
        }
    }

    @Override // com.android.volley.toolbox.AbstractC1077e
    public final n b(Request<?> request, Map<String, String> map) throws IOException, AuthFailureError {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        c(request, map, new a(atomicReference, countDownLatch));
        try {
            countDownLatch.await();
            C0214c c0214c = (C0214c) atomicReference.get();
            n nVar = c0214c.f24558a;
            if (nVar != null) {
                return nVar;
            }
            IOException iOException = c0214c.f24559b;
            if (iOException != null) {
                throw iOException;
            }
            throw c0214c.f24560c;
        } catch (InterruptedException e4) {
            com.android.volley.s.d(e4, "while waiting for CountDownLatch", new Object[0]);
            Thread.currentThread().interrupt();
            throw new InterruptedIOException(e4.toString());
        }
    }

    public abstract void c(Request<?> request, Map<String, String> map, b bVar);

    protected ExecutorService d() {
        return this.f24553a;
    }

    protected ExecutorService e() {
        return this.f24554b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        this.f24553a = executorService;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        this.f24554b = executorService;
    }
}

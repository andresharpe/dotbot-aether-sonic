package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1771l;
import com.google.android.gms.tasks.InterfaceC1762c;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f35023a = C1813v.c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class a<T> implements InterfaceC1762c<T, Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1771l f35024a;

        a(C1771l c1771l) {
            this.f35024a = c1771l;
        }

        @Override // com.google.android.gms.tasks.InterfaceC1762c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(@androidx.annotation.N AbstractC1770k<T> abstractC1770k) throws Exception {
            if (abstractC1770k.v()) {
                this.f35024a.e(abstractC1770k.r());
                return null;
            }
            this.f35024a.d(abstractC1770k.q());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Callable f35025E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1771l f35026F;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* loaded from: classes2.dex */
        class a<T> implements InterfaceC1762c<T, Void> {
            a() {
            }

            @Override // com.google.android.gms.tasks.InterfaceC1762c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(@androidx.annotation.N AbstractC1770k<T> abstractC1770k) throws Exception {
                if (abstractC1770k.v()) {
                    b.this.f35026F.c(abstractC1770k.r());
                    return null;
                }
                b.this.f35026F.b(abstractC1770k.q());
                return null;
            }
        }

        b(Callable callable, C1771l c1771l) {
            this.f35025E = callable;
            this.f35026F = c1771l;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((AbstractC1770k) this.f35025E.call()).m(new a());
            } catch (Exception e4) {
                this.f35026F.b(e4);
            }
        }
    }

    private V() {
    }

    public static <T> T b(AbstractC1770k<T> abstractC1770k) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC1770k.n(f35023a, new InterfaceC1762c() { // from class: com.google.firebase.crashlytics.internal.common.U
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k2) {
                Object d4;
                d4 = V.d(countDownLatch, abstractC1770k2);
                return d4;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (abstractC1770k.v()) {
            return abstractC1770k.r();
        }
        if (!abstractC1770k.t()) {
            if (abstractC1770k.u()) {
                throw new IllegalStateException(abstractC1770k.q());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }

    public static <T> AbstractC1770k<T> c(Executor executor, Callable<AbstractC1770k<T>> callable) {
        C1771l c1771l = new C1771l();
        executor.execute(new b(callable, c1771l));
        return c1771l.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d(CountDownLatch countDownLatch, AbstractC1770k abstractC1770k) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    public static <T> AbstractC1770k<T> e(AbstractC1770k<T> abstractC1770k, AbstractC1770k<T> abstractC1770k2) {
        C1771l c1771l = new C1771l();
        a aVar = new a(c1771l);
        abstractC1770k.m(aVar);
        abstractC1770k2.m(aVar);
        return c1771l.a();
    }
}

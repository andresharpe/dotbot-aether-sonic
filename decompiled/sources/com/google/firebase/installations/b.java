package com.google.firebase.installations;

import androidx.annotation.N;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.InterfaceC1764e;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class b implements InterfaceC1764e<Void> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f35988a = new CountDownLatch(1);

    b() {
    }

    @Override // com.google.android.gms.tasks.InterfaceC1764e
    public void a(@N AbstractC1770k<Void> abstractC1770k) {
        this.f35988a.countDown();
    }

    public boolean b(long j4, TimeUnit timeUnit) throws InterruptedException {
        return this.f35988a.await(j4, timeUnit);
    }

    public void c() {
        this.f35988a.countDown();
    }
}

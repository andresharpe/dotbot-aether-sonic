package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f27707a;

    public c(long j4) {
        this.f27707a = new AtomicLong(j4);
    }

    @Override // com.google.android.datatransport.runtime.time.a
    public long a() {
        return this.f27707a.get();
    }

    public void b(long j4) {
        if (j4 >= 0) {
            this.f27707a.addAndGet(j4);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    public void c() {
        b(1L);
    }
}

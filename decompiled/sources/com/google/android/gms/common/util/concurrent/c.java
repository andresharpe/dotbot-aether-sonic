package com.google.android.gms.common.util.concurrent;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@I0.a
/* loaded from: classes.dex */
public class c implements ThreadFactory {

    /* renamed from: E, reason: collision with root package name */
    private final String f28991E;

    /* renamed from: F, reason: collision with root package name */
    private final AtomicInteger f28992F = new AtomicInteger();

    /* renamed from: G, reason: collision with root package name */
    private final ThreadFactory f28993G = Executors.defaultThreadFactory();

    @I0.a
    public c(@N String str) {
        C1285y.m(str, "Name must not be null");
        this.f28991E = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @N
    public final Thread newThread(@N Runnable runnable) {
        Thread newThread = this.f28993G.newThread(new d(runnable, 0));
        newThread.setName(this.f28991E + "[" + this.f28992F.getAndIncrement() + "]");
        return newThread;
    }
}

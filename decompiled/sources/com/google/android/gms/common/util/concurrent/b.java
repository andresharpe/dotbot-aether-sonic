package com.google.android.gms.common.util.concurrent;

import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@I0.a
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: E, reason: collision with root package name */
    private final String f28989E;

    /* renamed from: F, reason: collision with root package name */
    private final ThreadFactory f28990F = Executors.defaultThreadFactory();

    @I0.a
    public b(@N String str) {
        C1285y.m(str, "Name must not be null");
        this.f28989E = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @N
    public final Thread newThread(@N Runnable runnable) {
        Thread newThread = this.f28990F.newThread(new d(runnable, 0));
        newThread.setName(this.f28989E);
        return newThread;
    }
}

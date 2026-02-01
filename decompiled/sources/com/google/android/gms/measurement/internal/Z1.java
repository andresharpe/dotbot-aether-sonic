package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Z1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final String f30497a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1620c2 f30498b;

    public Z1(C1620c2 c1620c2, String str) {
        this.f30498b = c1620c2;
        C1285y.l(str);
        this.f30497a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f30498b.f31060a.b().p().b(this.f30497a, th);
    }
}

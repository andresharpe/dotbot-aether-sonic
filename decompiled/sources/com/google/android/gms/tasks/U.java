package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    final /* synthetic */ Q f31178E;

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Callable f31179F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U(Q q4, Callable callable) {
        this.f31178E = q4;
        this.f31179F = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f31178E.z(this.f31179F.call());
        } catch (Exception e4) {
            this.f31178E.y(e4);
        } catch (Throwable th) {
            this.f31178E.y(new RuntimeException(th));
        }
    }
}

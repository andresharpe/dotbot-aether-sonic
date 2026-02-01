package com.google.android.play.core.review.internal;

import androidx.annotation.P;
import com.google.android.gms.tasks.C1771l;

/* loaded from: classes2.dex */
public abstract class j implements Runnable {

    /* renamed from: E, reason: collision with root package name */
    @P
    private final C1771l f34428E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f34428E = null;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public final C1771l b() {
        return this.f34428E;
    }

    public final void c(Exception exc) {
        C1771l c1771l = this.f34428E;
        if (c1771l != null) {
            c1771l.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e4) {
            c(e4);
        }
    }

    public j(@P C1771l c1771l) {
        this.f34428E = c1771l;
    }
}

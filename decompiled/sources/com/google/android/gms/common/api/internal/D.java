package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@androidx.annotation.i0(otherwise = 2)
/* loaded from: classes.dex */
final class D extends LifecycleCallback {

    /* renamed from: F, reason: collision with root package name */
    private List<Runnable> f28134F;

    private D(InterfaceC1203m interfaceC1203m) {
        super(interfaceC1203m);
        this.f28134F = new ArrayList();
        this.f28187E.addCallback("LifecycleObserverOnStop", this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ D m(Activity activity) {
        D d4;
        synchronized (activity) {
            try {
                InterfaceC1203m c4 = LifecycleCallback.c(activity);
                d4 = (D) c4.getCallbackOrNull("LifecycleObserverOnStop", D.class);
                if (d4 == null) {
                    d4 = new D(c4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void o(Runnable runnable) {
        this.f28134F.add(runnable);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @androidx.annotation.K
    public final void l() {
        List<Runnable> list;
        synchronized (this) {
            list = this.f28134F;
            this.f28134F = new ArrayList();
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}

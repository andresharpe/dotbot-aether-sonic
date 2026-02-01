package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.InterfaceC1203m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class P extends LifecycleCallback {

    /* renamed from: F, reason: collision with root package name */
    private final List f31167F;

    private P(InterfaceC1203m interfaceC1203m) {
        super(interfaceC1203m);
        this.f31167F = new ArrayList();
        this.f28187E.addCallback("TaskOnStopCallback", this);
    }

    public static P m(Activity activity) {
        InterfaceC1203m c4 = LifecycleCallback.c(activity);
        P p4 = (P) c4.getCallbackOrNull("TaskOnStopCallback", P.class);
        if (p4 == null) {
            return new P(c4);
        }
        return p4;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @androidx.annotation.K
    public final void l() {
        synchronized (this.f31167F) {
            try {
                Iterator it = this.f31167F.iterator();
                while (it.hasNext()) {
                    K k4 = (K) ((WeakReference) it.next()).get();
                    if (k4 != null) {
                        k4.zzc();
                    }
                }
                this.f31167F.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(K k4) {
        synchronized (this.f31167F) {
            this.f31167F.add(new WeakReference(k4));
        }
    }
}

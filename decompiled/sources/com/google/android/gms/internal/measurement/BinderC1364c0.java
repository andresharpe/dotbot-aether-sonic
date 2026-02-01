package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1364c0 extends AbstractBinderC1412i0 {

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f29599i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    private boolean f29600j;

    public static final Object O0(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e4) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e4);
            throw e4;
        }
    }

    public final Bundle A(long j4) {
        Bundle bundle;
        synchronized (this.f29599i) {
            if (!this.f29600j) {
                try {
                    this.f29599i.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f29599i.get();
        }
        return bundle;
    }

    public final String G(long j4) {
        return (String) O0(A(j4), String.class);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1420j0
    public final void o(Bundle bundle) {
        synchronized (this.f29599i) {
            try {
                try {
                    this.f29599i.set(bundle);
                    this.f29600j = true;
                } finally {
                    this.f29599i.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

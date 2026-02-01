package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1479q3 implements Serializable, InterfaceC1471p3 {

    /* renamed from: E, reason: collision with root package name */
    final InterfaceC1471p3 f29747E;

    /* renamed from: F, reason: collision with root package name */
    volatile transient boolean f29748F;

    /* renamed from: G, reason: collision with root package name */
    @CheckForNull
    transient Object f29749G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1479q3(InterfaceC1471p3 interfaceC1471p3) {
        interfaceC1471p3.getClass();
        this.f29747E = interfaceC1471p3;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f29748F) {
            obj = "<supplier that returned " + this.f29749G + ">";
        } else {
            obj = this.f29747E;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1471p3
    public final Object zza() {
        if (!this.f29748F) {
            synchronized (this) {
                try {
                    if (!this.f29748F) {
                        Object zza = this.f29747E.zza();
                        this.f29749G = zza;
                        this.f29748F = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f29749G;
    }
}

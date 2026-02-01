package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1486r3 implements InterfaceC1471p3 {

    /* renamed from: E, reason: collision with root package name */
    @CheckForNull
    volatile InterfaceC1471p3 f29764E;

    /* renamed from: F, reason: collision with root package name */
    volatile boolean f29765F;

    /* renamed from: G, reason: collision with root package name */
    @CheckForNull
    Object f29766G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1486r3(InterfaceC1471p3 interfaceC1471p3) {
        interfaceC1471p3.getClass();
        this.f29764E = interfaceC1471p3;
    }

    public final String toString() {
        Object obj = this.f29764E;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f29766G + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1471p3
    public final Object zza() {
        if (!this.f29765F) {
            synchronized (this) {
                try {
                    if (!this.f29765F) {
                        InterfaceC1471p3 interfaceC1471p3 = this.f29764E;
                        interfaceC1471p3.getClass();
                        Object zza = interfaceC1471p3.zza();
                        this.f29766G = zza;
                        this.f29765F = true;
                        this.f29764E = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f29766G;
    }
}

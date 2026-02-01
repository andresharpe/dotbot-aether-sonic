package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1494s3 implements Serializable, InterfaceC1471p3 {

    /* renamed from: E, reason: collision with root package name */
    final Object f29775E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1494s3(Object obj) {
        this.f29775E = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof C1494s3)) {
            return false;
        }
        Object obj2 = this.f29775E;
        Object obj3 = ((C1494s3) obj).f29775E;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29775E});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f29775E + ")";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1471p3
    public final Object zza() {
        return this.f29775E;
    }
}

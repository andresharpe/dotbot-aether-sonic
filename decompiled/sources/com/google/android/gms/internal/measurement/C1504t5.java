package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1504t5 extends AbstractC1488r5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ int a(Object obj) {
        return ((C1496s5) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ int b(Object obj) {
        return ((C1496s5) obj).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ Object c(Object obj) {
        return ((AbstractC1440l4) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        C1496s5 c1496s5 = (C1496s5) obj2;
        if (c1496s5.equals(C1496s5.c())) {
            return obj;
        }
        return C1496s5.d((C1496s5) obj, c1496s5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ Object e() {
        return C1496s5.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* bridge */ /* synthetic */ void f(Object obj, int i4, long j4) {
        ((C1496s5) obj).h(i4 << 3, Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final void g(Object obj) {
        ((AbstractC1440l4) obj).zzc.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC1440l4) obj).zzc = (C1496s5) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC1488r5
    public final /* synthetic */ void i(Object obj, I5 i5) throws IOException {
        ((C1496s5) obj).i(i5);
    }
}

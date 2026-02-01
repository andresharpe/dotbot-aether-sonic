package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1306g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1735v4 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1306g f31010a;

    /* renamed from: b, reason: collision with root package name */
    private long f31011b;

    public C1735v4(InterfaceC1306g interfaceC1306g) {
        C1285y.l(interfaceC1306g);
        this.f31010a = interfaceC1306g;
    }

    public final void a() {
        this.f31011b = 0L;
    }

    public final void b() {
        this.f31011b = this.f31010a.c();
    }

    public final boolean c(long j4) {
        if (this.f31011b == 0 || this.f31010a.c() - this.f31011b >= 3600000) {
            return true;
        }
        return false;
    }
}

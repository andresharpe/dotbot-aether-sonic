package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    final C1638f2 f30337a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M1(L4 l4) {
        this.f30337a = l4.a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final boolean a() {
        try {
            com.google.android.gms.common.wrappers.d a4 = com.google.android.gms.common.wrappers.e.a(this.f30337a.d());
            if (a4 == null) {
                this.f30337a.b().t().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a4.f("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e4) {
            this.f30337a.b().t().b("Failed to retrieve Play Store version for Install Referrer", e4);
            return false;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1756z1 extends AbstractC1759z4 {
    public C1756z1(L4 l4) {
        super(l4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    public final boolean k() {
        g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f31060a.d().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}

package com.google.android.gms.location;

import androidx.core.view.C0805e0;

/* renamed from: com.google.android.gms.location.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1576l extends com.google.android.gms.common.api.f {

    /* renamed from: t, reason: collision with root package name */
    public static final int f30025t = 1000;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30026u = 1001;

    /* renamed from: v, reason: collision with root package name */
    public static final int f30027v = 1002;

    /* renamed from: w, reason: collision with root package name */
    public static final int f30028w = 1004;

    /* renamed from: x, reason: collision with root package name */
    public static final int f30029x = 1005;

    private C1576l() {
    }

    @androidx.annotation.N
    public static String a(int i4) {
        switch (i4) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            case C0805e0.f13470f /* 1003 */:
            default:
                return com.google.android.gms.common.api.f.a(i4);
            case 1004:
                return "GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION";
        }
    }
}

package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.location.C1328g;

/* renamed from: com.google.android.gms.location.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1589s {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    public static final C1164a<C1164a.d.C0267d> f30052a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final InterfaceC1570i f30053b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final InterfaceC1578m f30054c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final A f30055d;

    /* renamed from: e, reason: collision with root package name */
    private static final C1164a.g<com.google.android.gms.internal.location.A> f30056e;

    /* renamed from: f, reason: collision with root package name */
    private static final C1164a.AbstractC0265a<com.google.android.gms.internal.location.A, C1164a.d.C0267d> f30057f;

    static {
        C1164a.g<com.google.android.gms.internal.location.A> gVar = new C1164a.g<>();
        f30056e = gVar;
        C1585p0 c1585p0 = new C1585p0();
        f30057f = c1585p0;
        f30052a = new C1164a<>("LocationServices.API", c1585p0, gVar);
        f30053b = new com.google.android.gms.internal.location.u0();
        f30054c = new C1328g();
        f30055d = new com.google.android.gms.internal.location.K();
    }

    private C1589s() {
    }

    @androidx.annotation.N
    public static C1572j a(@androidx.annotation.N Activity activity) {
        return new C1572j(activity);
    }

    @androidx.annotation.N
    public static C1572j b(@androidx.annotation.N Context context) {
        return new C1572j(context);
    }

    @androidx.annotation.N
    public static C1580n c(@androidx.annotation.N Activity activity) {
        return new C1580n(activity);
    }

    @androidx.annotation.N
    public static C1580n d(@androidx.annotation.N Context context) {
        return new C1580n(context);
    }

    @androidx.annotation.N
    public static B e(@androidx.annotation.N Activity activity) {
        return new B(activity);
    }

    @androidx.annotation.N
    public static B f(@androidx.annotation.N Context context) {
        return new B(context);
    }

    public static com.google.android.gms.internal.location.A g(com.google.android.gms.common.api.i iVar) {
        boolean z3;
        boolean z4 = false;
        if (iVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.b(z3, "GoogleApiClient parameter is required.");
        com.google.android.gms.internal.location.A a4 = (com.google.android.gms.internal.location.A) iVar.o(f30056e);
        if (a4 != null) {
            z4 = true;
        }
        C1285y.s(z4, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return a4;
    }
}

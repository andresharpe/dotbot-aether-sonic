package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C1164a;

/* renamed from: com.google.android.gms.location.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1554a {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f29965a = "activity_recognition";

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    public static final C1164a<C1164a.d.C0267d> f29966b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final InterfaceC1556b f29967c;

    /* renamed from: d, reason: collision with root package name */
    private static final C1164a.g<com.google.android.gms.internal.location.A> f29968d;

    /* renamed from: e, reason: collision with root package name */
    private static final C1164a.AbstractC0265a<com.google.android.gms.internal.location.A, C1164a.d.C0267d> f29969e;

    static {
        C1164a.g<com.google.android.gms.internal.location.A> gVar = new C1164a.g<>();
        f29968d = gVar;
        F f4 = new F();
        f29969e = f4;
        f29966b = new C1164a<>("ActivityRecognition.API", f4, gVar);
        f29967c = new com.google.android.gms.internal.location.b0();
    }

    private C1554a() {
    }

    @androidx.annotation.N
    public static C1558c a(@androidx.annotation.N Activity activity) {
        return new C1558c(activity);
    }

    @androidx.annotation.N
    public static C1558c b(@androidx.annotation.N Context context) {
        return new C1558c(context);
    }
}

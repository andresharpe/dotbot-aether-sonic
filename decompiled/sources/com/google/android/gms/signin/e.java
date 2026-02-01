package com.google.android.gms.signin;

import com.google.android.gms.common.C1297s;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.D;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1164a.g<com.google.android.gms.signin.internal.a> f31081a;

    /* renamed from: b, reason: collision with root package name */
    @D
    public static final C1164a.g<com.google.android.gms.signin.internal.a> f31082b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1164a.AbstractC0265a<com.google.android.gms.signin.internal.a, a> f31083c;

    /* renamed from: d, reason: collision with root package name */
    static final C1164a.AbstractC0265a<com.google.android.gms.signin.internal.a, d> f31084d;

    /* renamed from: e, reason: collision with root package name */
    public static final Scope f31085e;

    /* renamed from: f, reason: collision with root package name */
    public static final Scope f31086f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1164a<a> f31087g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1164a<d> f31088h;

    static {
        C1164a.g<com.google.android.gms.signin.internal.a> gVar = new C1164a.g<>();
        f31081a = gVar;
        C1164a.g<com.google.android.gms.signin.internal.a> gVar2 = new C1164a.g<>();
        f31082b = gVar2;
        b bVar = new b();
        f31083c = bVar;
        c cVar = new c();
        f31084d = cVar;
        f31085e = new Scope(C1297s.f28868a);
        f31086f = new Scope("email");
        f31087g = new C1164a<>("SignIn.API", bVar, gVar);
        f31088h = new C1164a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}

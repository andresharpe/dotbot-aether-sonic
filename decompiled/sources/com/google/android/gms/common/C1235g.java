package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzag;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;

@com.google.android.gms.common.internal.D
@I0.a
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1235g {

    /* renamed from: a, reason: collision with root package name */
    private static final C1312z f28545a;

    /* renamed from: b, reason: collision with root package name */
    private static final C1312z f28546b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f28547c;

    static {
        b0 b0Var = new b0();
        b0Var.d("com.google.android.gms");
        b0Var.a(204200000L);
        M m4 = O.f27969d;
        b0Var.c(zzag.r(m4.O0(), O.f27967b.O0()));
        M m5 = O.f27968c;
        b0Var.b(zzag.r(m5.O0(), O.f27966a.O0()));
        f28545a = b0Var.e();
        b0 b0Var2 = new b0();
        b0Var2.d("com.android.vending");
        b0Var2.a(82240000L);
        b0Var2.c(zzag.q(m4.O0()));
        b0Var2.b(zzag.q(m5.O0()));
        f28546b = b0Var2.e();
        f28547c = new HashMap();
    }
}

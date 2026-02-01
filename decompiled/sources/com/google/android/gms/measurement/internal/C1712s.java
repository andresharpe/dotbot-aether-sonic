package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1712s {

    /* renamed from: a, reason: collision with root package name */
    final String f30949a;

    /* renamed from: b, reason: collision with root package name */
    final String f30950b;

    /* renamed from: c, reason: collision with root package name */
    final long f30951c;

    /* renamed from: d, reason: collision with root package name */
    final long f30952d;

    /* renamed from: e, reason: collision with root package name */
    final long f30953e;

    /* renamed from: f, reason: collision with root package name */
    final long f30954f;

    /* renamed from: g, reason: collision with root package name */
    final long f30955g;

    /* renamed from: h, reason: collision with root package name */
    final Long f30956h;

    /* renamed from: i, reason: collision with root package name */
    final Long f30957i;

    /* renamed from: j, reason: collision with root package name */
    final Long f30958j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f30959k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1712s(String str, String str2, long j4, long j5, long j6, long j7, long j8, Long l4, Long l5, Long l6, Boolean bool) {
        boolean z3;
        boolean z4;
        boolean z5;
        C1285y.h(str);
        C1285y.h(str2);
        if (j4 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1285y.a(z4);
        if (j6 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C1285y.a(z5);
        C1285y.a(j8 >= 0);
        this.f30949a = str;
        this.f30950b = str2;
        this.f30951c = j4;
        this.f30952d = j5;
        this.f30953e = j6;
        this.f30954f = j7;
        this.f30955g = j8;
        this.f30956h = l4;
        this.f30957i = l5;
        this.f30958j = l6;
        this.f30959k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1712s a(Long l4, Long l5, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new C1712s(this.f30949a, this.f30950b, this.f30951c, this.f30952d, this.f30953e, this.f30954f, this.f30955g, this.f30956h, l4, l5, bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1712s b(long j4, long j5) {
        return new C1712s(this.f30949a, this.f30950b, this.f30951c, this.f30952d, this.f30953e, this.f30954f, j4, Long.valueOf(j5), this.f30957i, this.f30958j, this.f30959k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C1712s c(long j4) {
        return new C1712s(this.f30949a, this.f30950b, this.f30951c, this.f30952d, this.f30953e, j4, this.f30955g, this.f30956h, this.f30957i, this.f30958j, this.f30959k);
    }
}

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1468p0;

@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    final Context f30278a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    String f30279b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    String f30280c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    String f30281d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.P
    Boolean f30282e;

    /* renamed from: f, reason: collision with root package name */
    long f30283f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.P
    C1468p0 f30284g;

    /* renamed from: h, reason: collision with root package name */
    boolean f30285h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.P
    final Long f30286i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.P
    String f30287j;

    @com.google.android.gms.common.util.D
    public K2(Context context, @androidx.annotation.P C1468p0 c1468p0, @androidx.annotation.P Long l4) {
        this.f30285h = true;
        C1285y.l(context);
        Context applicationContext = context.getApplicationContext();
        C1285y.l(applicationContext);
        this.f30278a = applicationContext;
        this.f30286i = l4;
        if (c1468p0 != null) {
            this.f30284g = c1468p0;
            this.f30279b = c1468p0.f29741J;
            this.f30280c = c1468p0.f29740I;
            this.f30281d = c1468p0.f29739H;
            this.f30285h = c1468p0.f29738G;
            this.f30283f = c1468p0.f29737F;
            this.f30287j = c1468p0.f29743L;
            Bundle bundle = c1468p0.f29742K;
            if (bundle != null) {
                this.f30282e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

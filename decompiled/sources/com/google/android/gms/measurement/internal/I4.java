package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.measurement.C1422j2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class I4 {

    /* renamed from: a, reason: collision with root package name */
    C1422j2 f30241a;

    /* renamed from: b, reason: collision with root package name */
    List f30242b;

    /* renamed from: c, reason: collision with root package name */
    List f30243c;

    /* renamed from: d, reason: collision with root package name */
    long f30244d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L4 f30245e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ I4(L4 l4, H4 h4) {
        this.f30245e = l4;
    }

    private static final long b(com.google.android.gms.internal.measurement.Y1 y12) {
        return ((y12.D() / 1000) / 60) / 60;
    }

    public final boolean a(long j4, com.google.android.gms.internal.measurement.Y1 y12) {
        C1285y.l(y12);
        if (this.f30243c == null) {
            this.f30243c = new ArrayList();
        }
        if (this.f30242b == null) {
            this.f30242b = new ArrayList();
        }
        if (!this.f30243c.isEmpty() && b((com.google.android.gms.internal.measurement.Y1) this.f30243c.get(0)) != b(y12)) {
            return false;
        }
        long f4 = this.f30244d + y12.f();
        this.f30245e.S();
        if (f4 >= Math.max(0, ((Integer) C1643g1.f30716j.a(null)).intValue())) {
            return false;
        }
        this.f30244d = f4;
        this.f30243c.add(y12);
        this.f30242b.add(Long.valueOf(j4));
        int size = this.f30243c.size();
        this.f30245e.S();
        if (size >= Math.max(1, ((Integer) C1643g1.f30718k.a(null)).intValue())) {
            return false;
        }
        return true;
    }
}

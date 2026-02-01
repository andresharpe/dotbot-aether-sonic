package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1418i6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1717s4 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected long f30965a;

    /* renamed from: b, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected long f30966b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1695p f30967c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1729u4 f30968d;

    public C1717s4(C1729u4 c1729u4) {
        this.f30968d = c1729u4;
        this.f30967c = new C1711r4(this, c1729u4.f31060a);
        long c4 = c1729u4.f31060a.zzav().c();
        this.f30965a = c4;
        this.f30966b = c4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f30967c.b();
        this.f30965a = 0L;
        this.f30966b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void b(long j4) {
        this.f30967c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void c(long j4) {
        this.f30968d.f();
        this.f30967c.b();
        this.f30965a = j4;
        this.f30966b = j4;
    }

    @androidx.annotation.j0
    public final boolean d(boolean z3, boolean z4, long j4) {
        this.f30968d.f();
        this.f30968d.g();
        C1418i6.b();
        if (this.f30968d.f31060a.x().z(null, C1643g1.f30709f0)) {
            if (this.f30968d.f31060a.m()) {
                this.f30968d.f31060a.D().f30261o.b(this.f30968d.f31060a.zzav().a());
            }
        } else {
            this.f30968d.f31060a.D().f30261o.b(this.f30968d.f31060a.zzav().a());
        }
        long j5 = j4 - this.f30965a;
        if (!z3 && j5 < 1000) {
            this.f30968d.f31060a.b().t().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j5));
            return false;
        }
        if (!z4) {
            j5 = j4 - this.f30966b;
            this.f30966b = j4;
        }
        this.f30968d.f31060a.b().t().b("Recording user engagement, ms", Long.valueOf(j5));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j5);
        U4.w(this.f30968d.f31060a.I().q(!this.f30968d.f31060a.x().B()), bundle, true);
        if (!z4) {
            this.f30968d.f31060a.G().s(kotlinx.coroutines.W.f52989c, "_e", bundle);
        }
        this.f30965a = j4;
        this.f30967c.b();
        this.f30967c.d(3600000L);
        return true;
    }
}

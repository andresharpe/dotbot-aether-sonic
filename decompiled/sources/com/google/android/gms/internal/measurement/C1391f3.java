package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1391f3 {

    /* renamed from: a, reason: collision with root package name */
    final String f29638a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f29639b;

    /* renamed from: c, reason: collision with root package name */
    final String f29640c;

    /* renamed from: d, reason: collision with root package name */
    final String f29641d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f29642e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f29643f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f29644g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f29645h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    final InterfaceC1455n3 f29646i;

    private C1391f3(String str, Uri uri, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable InterfaceC1455n3 interfaceC1455n3) {
        this.f29638a = null;
        this.f29639b = uri;
        this.f29640c = "";
        this.f29641d = "";
        this.f29642e = z3;
        this.f29643f = false;
        this.f29644g = z5;
        this.f29645h = false;
        this.f29646i = null;
    }

    public final C1391f3 a() {
        return new C1391f3(null, this.f29639b, this.f29640c, this.f29641d, this.f29642e, false, true, false, null);
    }

    public final C1391f3 b() {
        if (this.f29640c.isEmpty()) {
            return new C1391f3(null, this.f29639b, this.f29640c, this.f29641d, true, false, this.f29644g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final AbstractC1423j3 c(String str, double d4) {
        return new C1375d3(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final AbstractC1423j3 d(String str, long j4) {
        return new C1359b3(this, str, Long.valueOf(j4), true);
    }

    public final AbstractC1423j3 e(String str, String str2) {
        return new C1383e3(this, str, str2, true);
    }

    public final AbstractC1423j3 f(String str, boolean z3) {
        return new C1367c3(this, str, Boolean.valueOf(z3), true);
    }

    public C1391f3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}

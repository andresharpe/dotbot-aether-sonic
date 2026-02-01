package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1403h implements r {

    /* renamed from: E, reason: collision with root package name */
    private final r f29659E;

    /* renamed from: F, reason: collision with root package name */
    private final String f29660F;

    public C1403h(String str) {
        this.f29659E = r.f29754h;
        this.f29660F = str;
    }

    public final r a() {
        return this.f29659E;
    }

    public final String b() {
        return this.f29660F;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d(String str, C1398g2 c1398g2, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1403h)) {
            return false;
        }
        C1403h c1403h = (C1403h) obj;
        if (this.f29660F.equals(c1403h.f29660F) && this.f29659E.equals(c1403h.f29659E)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29660F.hashCode() * 31) + this.f29659E.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return new C1403h(this.f29660F, this.f29659E.zzd());
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator zzl() {
        return null;
    }

    public C1403h(String str, r rVar) {
        this.f29659E = rVar;
        this.f29660F = str;
    }

    public C1403h() {
        throw null;
    }
}

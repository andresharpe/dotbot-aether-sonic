package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1463o3 extends zzif {

    /* renamed from: E, reason: collision with root package name */
    private final Object f29727E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1463o3(Object obj) {
        this.f29727E = obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object a() {
        return this.f29727E;
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final boolean b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof C1463o3) {
            return this.f29727E.equals(((C1463o3) obj).f29727E);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29727E.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f29727E + ")";
    }
}

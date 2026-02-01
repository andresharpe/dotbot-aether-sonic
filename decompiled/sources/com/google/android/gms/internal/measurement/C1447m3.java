package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.measurement.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1447m3 extends zzif {

    /* renamed from: E, reason: collision with root package name */
    static final C1447m3 f29716E = new C1447m3();

    private C1447m3() {
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final boolean b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

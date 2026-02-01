package com.google.android.gms.common.api;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;

@I0.a
/* renamed from: com.google.android.gms.common.api.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1168e implements q {

    /* renamed from: E, reason: collision with root package name */
    private final Status f28055E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f28056F;

    @com.google.android.gms.common.internal.D
    @I0.a
    public C1168e(@N Status status, boolean z3) {
        this.f28055E = (Status) C1285y.m(status, "Status must not be null");
        this.f28056F = z3;
    }

    @I0.a
    public boolean a() {
        return this.f28056F;
    }

    @I0.a
    public final boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1168e)) {
            return false;
        }
        C1168e c1168e = (C1168e) obj;
        if (!this.f28055E.equals(c1168e.f28055E) || this.f28056F != c1168e.f28056F) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.q
    @I0.a
    @N
    public Status getStatus() {
        return this.f28055E;
    }

    @I0.a
    public final int hashCode() {
        return ((this.f28055E.hashCode() + 527) * 31) + (this.f28056F ? 1 : 0);
    }
}

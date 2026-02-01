package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.util.D;

@I0.a
/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    @D
    static int f27878b = 31;

    /* renamed from: a, reason: collision with root package name */
    private int f27879a = 1;

    @I0.a
    @N
    public b a(@P Object obj) {
        int hashCode;
        int i4 = f27878b * this.f27879a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f27879a = i4 + hashCode;
        return this;
    }

    @I0.a
    public int b() {
        return this.f27879a;
    }

    @N
    public final b c(boolean z3) {
        this.f27879a = (f27878b * this.f27879a) + (z3 ? 1 : 0);
        return this;
    }
}

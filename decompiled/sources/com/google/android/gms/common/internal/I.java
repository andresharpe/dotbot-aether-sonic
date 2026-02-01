package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C1164a;

@I0.a
/* loaded from: classes.dex */
public class I implements C1164a.d.f {

    /* renamed from: F, reason: collision with root package name */
    @androidx.annotation.N
    public static final I f28624F = a().a();

    /* renamed from: E, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28625E;

    @I0.a
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.P
        private String f28626a;

        private a() {
        }

        @I0.a
        @androidx.annotation.N
        public I a() {
            return new I(this.f28626a, null);
        }

        @I0.a
        @androidx.annotation.N
        public a b(@androidx.annotation.P String str) {
            this.f28626a = str;
            return this;
        }

        /* synthetic */ a(N n4) {
        }
    }

    /* synthetic */ I(String str, O o4) {
        this.f28625E = str;
    }

    @I0.a
    @androidx.annotation.N
    public static a a() {
        return new a(null);
    }

    @androidx.annotation.N
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f28625E;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        return C1281w.b(this.f28625E, ((I) obj).f28625E);
    }

    public final int hashCode() {
        return C1281w.c(this.f28625E);
    }
}

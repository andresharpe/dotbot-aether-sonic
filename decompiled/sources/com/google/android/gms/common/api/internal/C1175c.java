package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.d;
import com.google.android.gms.common.internal.C1281w;

/* renamed from: com.google.android.gms.common.api.internal.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175c<O extends C1164a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f28254a;

    /* renamed from: b, reason: collision with root package name */
    private final C1164a<O> f28255b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.P
    private final O f28256c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.P
    private final String f28257d;

    private C1175c(C1164a<O> c1164a, @androidx.annotation.P O o4, @androidx.annotation.P String str) {
        this.f28255b = c1164a;
        this.f28256c = o4;
        this.f28257d = str;
        this.f28254a = C1281w.c(c1164a, o4, str);
    }

    @androidx.annotation.N
    public static <O extends C1164a.d> C1175c<O> a(@androidx.annotation.N C1164a<O> c1164a, @androidx.annotation.P O o4, @androidx.annotation.P String str) {
        return new C1175c<>(c1164a, o4, str);
    }

    @androidx.annotation.N
    public final String b() {
        return this.f28255b.d();
    }

    public final boolean equals(@androidx.annotation.P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1175c)) {
            return false;
        }
        C1175c c1175c = (C1175c) obj;
        if (!C1281w.b(this.f28255b, c1175c.f28255b) || !C1281w.b(this.f28256c, c1175c.f28256c) || !C1281w.b(this.f28257d, c1175c.f28257d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28254a;
    }
}

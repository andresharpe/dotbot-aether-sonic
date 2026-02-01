package com.google.android.gms.common;

import javax.annotation.Nullable;

@l1.b
/* renamed from: com.google.android.gms.common.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1295p {

    /* renamed from: a, reason: collision with root package name */
    private final String f28860a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28861b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f28862c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final Throwable f28863d;

    private C1295p(String str, int i4, boolean z3, @Nullable String str2, @Nullable Throwable th) {
        this.f28860a = str;
        this.f28861b = z3;
        this.f28862c = str2;
        this.f28863d = th;
    }

    @androidx.annotation.N
    public static C1295p a(@androidx.annotation.N String str, @androidx.annotation.N String str2, @Nullable Throwable th) {
        return new C1295p(str, 1, false, str2, th);
    }

    @androidx.annotation.N
    public static C1295p d(@androidx.annotation.N String str, int i4) {
        return new C1295p(str, i4, true, null, null);
    }

    public final void b() {
        if (!this.f28861b) {
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.f28862c));
            Throwable th = this.f28863d;
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean c() {
        return this.f28861b;
    }
}

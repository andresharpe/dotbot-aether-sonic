package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@l1.b
/* loaded from: classes.dex */
public class Z {

    /* renamed from: e, reason: collision with root package name */
    private static final Z f27991e = new Z(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f27992a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    final String f27993b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    final Throwable f27994c;

    /* renamed from: d, reason: collision with root package name */
    final int f27995d;

    private Z(boolean z3, int i4, int i5, @Nullable String str, @Nullable Throwable th) {
        this.f27992a = z3;
        this.f27995d = i4;
        this.f27993b = str;
        this.f27994c = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static Z b() {
        return f27991e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z c(@androidx.annotation.N String str) {
        return new Z(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z d(@androidx.annotation.N String str, @androidx.annotation.N Throwable th) {
        return new Z(false, 1, 5, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z f(int i4) {
        return new Z(true, i4, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z g(int i4, int i5, @androidx.annotation.N String str, @Nullable Throwable th) {
        return new Z(false, i4, i5, str, th);
    }

    @Nullable
    String a() {
        return this.f27993b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (!this.f27992a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f27994c != null) {
                Log.d("GoogleCertificatesRslt", a(), this.f27994c);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}

package com.airbnb.lottie.model;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.i0;
import androidx.collection.j;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static final f f21699b = new f();

    /* renamed from: a, reason: collision with root package name */
    private final j<String, com.airbnb.lottie.g> f21700a = new j<>(20);

    @i0
    f() {
    }

    public static f c() {
        return f21699b;
    }

    public void a() {
        this.f21700a.d();
    }

    @P
    public com.airbnb.lottie.g b(@P String str) {
        if (str == null) {
            return null;
        }
        return this.f21700a.f(str);
    }

    public void d(@P String str, com.airbnb.lottie.g gVar) {
        if (str == null) {
            return;
        }
        this.f21700a.j(str, gVar);
    }

    public void e(int i4) {
        this.f21700a.m(i4);
    }
}

package com.airbnb.lottie.value;

import androidx.annotation.P;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f23339a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private com.airbnb.lottie.animation.keyframe.a<?, ?> f23340b;

    /* renamed from: c, reason: collision with root package name */
    @P
    protected T f23341c;

    public j() {
        this.f23339a = new b<>();
        this.f23341c = null;
    }

    @P
    public T a(b<T> bVar) {
        return this.f23341c;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f4, float f5, T t3, T t4, float f6, float f7, float f8) {
        return a(this.f23339a.h(f4, f5, t3, t4, f6, f7, f8));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@P com.airbnb.lottie.animation.keyframe.a<?, ?> aVar) {
        this.f23340b = aVar;
    }

    public final void d(@P T t3) {
        this.f23341c = t3;
        com.airbnb.lottie.animation.keyframe.a<?, ?> aVar = this.f23340b;
        if (aVar != null) {
            aVar.k();
        }
    }

    public j(@P T t3) {
        this.f23339a = new b<>();
        this.f23341c = t3;
    }
}

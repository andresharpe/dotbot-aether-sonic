package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
abstract class f<T> extends j<T> {

    /* renamed from: d, reason: collision with root package name */
    private final T f23335d;

    /* renamed from: e, reason: collision with root package name */
    private final T f23336e;

    /* renamed from: f, reason: collision with root package name */
    private final Interpolator f23337f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t3, T t4) {
        this(t3, t4, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.j
    public T a(b<T> bVar) {
        return e(this.f23335d, this.f23336e, this.f23337f.getInterpolation(bVar.e()));
    }

    abstract T e(T t3, T t4, float f4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(T t3, T t4, Interpolator interpolator) {
        this.f23335d = t3;
        this.f23336e = t4;
        this.f23337f = interpolator;
    }
}

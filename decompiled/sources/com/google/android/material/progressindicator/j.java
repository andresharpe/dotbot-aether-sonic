package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.N;
import androidx.vectordrawable.graphics.drawable.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class j<T extends Animator> {

    /* renamed from: a, reason: collision with root package name */
    protected k f32958a;

    /* renamed from: b, reason: collision with root package name */
    protected final float[] f32959b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f32960c;

    /* JADX INFO: Access modifiers changed from: protected */
    public j(int i4) {
        this.f32959b = new float[i4 * 2];
        this.f32960c = new int[i4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public float b(int i4, int i5, int i6) {
        return (i4 - i5) / i6;
    }

    public abstract void c();

    public abstract void d(@N b.a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(@N k kVar) {
        this.f32958a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    public abstract void h();
}

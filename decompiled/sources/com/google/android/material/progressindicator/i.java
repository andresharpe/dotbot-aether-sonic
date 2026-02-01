package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import com.google.android.material.progressindicator.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class i<S extends c> {

    /* renamed from: a, reason: collision with root package name */
    S f32956a;

    /* renamed from: b, reason: collision with root package name */
    protected h f32957b;

    public i(S s4) {
        this.f32956a = s4;
    }

    abstract void a(@N Canvas canvas, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(@N Canvas canvas, @N Paint paint, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5, @InterfaceC0569l int i4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(@N Canvas canvas, @N Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(@N h hVar) {
        this.f32957b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(@N Canvas canvas, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        this.f32956a.e();
        a(canvas, f4);
    }
}

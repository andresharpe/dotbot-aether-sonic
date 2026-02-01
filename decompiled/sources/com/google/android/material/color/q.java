package com.google.android.material.color;

import T0.a;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.d0;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    @N
    @InterfaceC0571n
    private final int[] f32032a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final n f32033b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC0563f
    private final int f32034c;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        @P
        private n f32036b;

        /* renamed from: a, reason: collision with root package name */
        @N
        @InterfaceC0571n
        private int[] f32035a = new int[0];

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC0563f
        private int f32037c = a.c.f1934f3;

        @N
        public q d() {
            return new q(this);
        }

        @N
        public b e(@InterfaceC0563f int i4) {
            this.f32037c = i4;
            return this;
        }

        @N
        public b f(@P n nVar) {
            this.f32036b = nVar;
            return this;
        }

        @N
        public b g(@N @InterfaceC0571n int[] iArr) {
            this.f32035a = iArr;
            return this;
        }
    }

    @N
    public static q a() {
        return new b().f(n.c()).d();
    }

    @InterfaceC0563f
    public int b() {
        return this.f32034c;
    }

    @P
    public n c() {
        return this.f32033b;
    }

    @N
    @InterfaceC0571n
    public int[] d() {
        return this.f32032a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @d0
    public int e(@d0 int i4) {
        n nVar = this.f32033b;
        if (nVar != null && nVar.e() != 0) {
            return this.f32033b.e();
        }
        return i4;
    }

    private q(b bVar) {
        this.f32032a = bVar.f32035a;
        this.f32033b = bVar.f32036b;
        this.f32034c = bVar.f32037c;
    }
}

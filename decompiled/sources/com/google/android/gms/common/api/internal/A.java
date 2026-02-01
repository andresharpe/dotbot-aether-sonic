package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.b;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.InterfaceC1303d;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* loaded from: classes.dex */
public abstract class A<A extends C1164a.b, ResultT> {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private final C1233e[] f28115a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28116b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28117c;

    @I0.a
    /* loaded from: classes.dex */
    public static class a<A extends C1164a.b, ResultT> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1220v<A, C1771l<ResultT>> f28118a;

        /* renamed from: c, reason: collision with root package name */
        private C1233e[] f28120c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28119b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f28121d = 0;

        private a() {
        }

        @I0.a
        @androidx.annotation.N
        public A<A, ResultT> a() {
            boolean z3;
            if (this.f28118a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.b(z3, "execute parameter required");
            return new C1177c1(this, this.f28120c, this.f28119b, this.f28121d);
        }

        @I0.a
        @androidx.annotation.N
        @Deprecated
        public a<A, ResultT> b(@androidx.annotation.N final InterfaceC1303d<A, C1771l<ResultT>> interfaceC1303d) {
            this.f28118a = new InterfaceC1220v() { // from class: com.google.android.gms.common.api.internal.b1
                @Override // com.google.android.gms.common.api.internal.InterfaceC1220v
                public final void a(Object obj, Object obj2) {
                    InterfaceC1303d.this.a((C1164a.b) obj, (C1771l) obj2);
                }
            };
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, ResultT> c(@androidx.annotation.N InterfaceC1220v<A, C1771l<ResultT>> interfaceC1220v) {
            this.f28118a = interfaceC1220v;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, ResultT> d(boolean z3) {
            this.f28119b = z3;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, ResultT> e(@androidx.annotation.N C1233e... c1233eArr) {
            this.f28120c = c1233eArr;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, ResultT> f(int i4) {
            this.f28121d = i4;
            return this;
        }

        /* synthetic */ a(C1180d1 c1180d1) {
        }
    }

    @I0.a
    @Deprecated
    public A() {
        this.f28115a = null;
        this.f28116b = false;
        this.f28117c = 0;
    }

    @I0.a
    @androidx.annotation.N
    public static <A extends C1164a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public abstract void b(@androidx.annotation.N A a4, @androidx.annotation.N C1771l<ResultT> c1771l) throws RemoteException;

    @I0.a
    public boolean c() {
        return this.f28116b;
    }

    public final int d() {
        return this.f28117c;
    }

    @androidx.annotation.P
    public final C1233e[] e() {
        return this.f28115a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @I0.a
    public A(@androidx.annotation.P C1233e[] c1233eArr, boolean z3, int i4) {
        this.f28115a = c1233eArr;
        boolean z4 = false;
        if (c1233eArr != null && z3) {
            z4 = true;
        }
        this.f28116b = z4;
        this.f28117c = i4;
    }
}

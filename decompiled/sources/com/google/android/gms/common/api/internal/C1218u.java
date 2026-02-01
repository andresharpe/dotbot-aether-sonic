package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C1233e;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.C1164a.b;
import com.google.android.gms.common.api.internal.C1205n;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.tasks.C1771l;

@I0.a
/* renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1218u<A extends C1164a.b, L> {

    /* renamed from: a, reason: collision with root package name */
    @I0.a
    @androidx.annotation.N
    public final AbstractC1216t<A, L> f28416a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    public final C<A, L> f28417b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.N
    public final Runnable f28418c;

    @I0.a
    /* renamed from: com.google.android.gms.common.api.internal.u$a */
    /* loaded from: classes.dex */
    public static class a<A extends C1164a.b, L> {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC1220v<A, C1771l<Void>> f28419a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1220v<A, C1771l<Boolean>> f28420b;

        /* renamed from: d, reason: collision with root package name */
        private C1205n<L> f28422d;

        /* renamed from: e, reason: collision with root package name */
        private C1233e[] f28423e;

        /* renamed from: g, reason: collision with root package name */
        private int f28425g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f28421c = Q0.f28206E;

        /* renamed from: f, reason: collision with root package name */
        private boolean f28424f = true;

        private a() {
        }

        @I0.a
        @androidx.annotation.N
        public C1218u<A, L> a() {
            boolean z3;
            boolean z4;
            boolean z5 = false;
            if (this.f28419a != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C1285y.b(z3, "Must set register function");
            if (this.f28420b != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C1285y.b(z4, "Must set unregister function");
            if (this.f28422d != null) {
                z5 = true;
            }
            C1285y.b(z5, "Must set holder");
            return new C1218u<>(new R0(this, this.f28422d, this.f28423e, this.f28424f, this.f28425g), new S0(this, (C1205n.a) C1285y.m(this.f28422d.b(), "Key must not be null")), this.f28421c, null);
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> b(@androidx.annotation.N Runnable runnable) {
            this.f28421c = runnable;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> c(@androidx.annotation.N InterfaceC1220v<A, C1771l<Void>> interfaceC1220v) {
            this.f28419a = interfaceC1220v;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> d(boolean z3) {
            this.f28424f = z3;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> e(@androidx.annotation.N C1233e... c1233eArr) {
            this.f28423e = c1233eArr;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> f(int i4) {
            this.f28425g = i4;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> g(@androidx.annotation.N InterfaceC1220v<A, C1771l<Boolean>> interfaceC1220v) {
            this.f28420b = interfaceC1220v;
            return this;
        }

        @I0.a
        @androidx.annotation.N
        public a<A, L> h(@androidx.annotation.N C1205n<L> c1205n) {
            this.f28422d = c1205n;
            return this;
        }

        /* synthetic */ a(T0 t02) {
        }
    }

    /* synthetic */ C1218u(AbstractC1216t abstractC1216t, C c4, Runnable runnable, U0 u02) {
        this.f28416a = abstractC1216t;
        this.f28417b = c4;
        this.f28418c = runnable;
    }

    @I0.a
    @androidx.annotation.N
    public static <A extends C1164a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}

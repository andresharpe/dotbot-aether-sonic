package com.google.firebase.components;

import C1.a;
import androidx.annotation.N;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class C<T> implements C1.b<T>, C1.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0003a<Object> f34866c = new a.InterfaceC0003a() { // from class: com.google.firebase.components.z
        @Override // C1.a.InterfaceC0003a
        public final void a(C1.b bVar) {
            C.f(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final C1.b<Object> f34867d = new C1.b() { // from class: com.google.firebase.components.A
        @Override // C1.b
        public final Object get() {
            Object g4;
            g4 = C.g();
            return g4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.B("this")
    private a.InterfaceC0003a<T> f34868a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C1.b<T> f34869b;

    private C(a.InterfaceC0003a<T> interfaceC0003a, C1.b<T> bVar) {
        this.f34868a = interfaceC0003a;
        this.f34869b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> C<T> e() {
        return new C<>(f34866c, f34867d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0003a interfaceC0003a, a.InterfaceC0003a interfaceC0003a2, C1.b bVar) {
        interfaceC0003a.a(bVar);
        interfaceC0003a2.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> C<T> i(C1.b<T> bVar) {
        return new C<>(null, bVar);
    }

    @Override // C1.a
    public void a(@N final a.InterfaceC0003a<T> interfaceC0003a) {
        C1.b<T> bVar;
        C1.b<T> bVar2;
        C1.b<T> bVar3 = this.f34869b;
        C1.b<Object> bVar4 = f34867d;
        if (bVar3 != bVar4) {
            interfaceC0003a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f34869b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0003a<T> interfaceC0003a2 = this.f34868a;
                this.f34868a = new a.InterfaceC0003a() { // from class: com.google.firebase.components.B
                    @Override // C1.a.InterfaceC0003a
                    public final void a(C1.b bVar5) {
                        C.h(a.InterfaceC0003a.this, interfaceC0003a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0003a.a(bVar);
        }
    }

    @Override // C1.b
    public T get() {
        return this.f34869b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(C1.b<T> bVar) {
        a.InterfaceC0003a<T> interfaceC0003a;
        if (this.f34869b == f34867d) {
            synchronized (this) {
                interfaceC0003a = this.f34868a;
                this.f34868a = null;
                this.f34869b = bVar;
            }
            interfaceC0003a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(C1.b bVar) {
    }
}

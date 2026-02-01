package com.google.firebase.components;

import androidx.annotation.i0;

/* loaded from: classes2.dex */
public class x<T> implements C1.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f34944c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f34945a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C1.b<T> f34946b;

    x(T t3) {
        this.f34945a = f34944c;
        this.f34945a = t3;
    }

    @i0
    boolean a() {
        if (this.f34945a != f34944c) {
            return true;
        }
        return false;
    }

    @Override // C1.b
    public T get() {
        T t3 = (T) this.f34945a;
        Object obj = f34944c;
        if (t3 == obj) {
            synchronized (this) {
                try {
                    t3 = (T) this.f34945a;
                    if (t3 == obj) {
                        t3 = this.f34946b.get();
                        this.f34945a = t3;
                        this.f34946b = null;
                    }
                } finally {
                }
            }
        }
        return t3;
    }

    public x(C1.b<T> bVar) {
        this.f34945a = f34944c;
        this.f34946b = bVar;
    }
}

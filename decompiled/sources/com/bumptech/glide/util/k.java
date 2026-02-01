package com.bumptech.glide.util;

import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f26958a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f26959b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f26960c;

    public k() {
    }

    public void a(@N Class<?> cls, @N Class<?> cls2) {
        b(cls, cls2, null);
    }

    public void b(@N Class<?> cls, @N Class<?> cls2, @P Class<?> cls3) {
        this.f26958a = cls;
        this.f26959b = cls2;
        this.f26960c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f26958a.equals(kVar.f26958a) && this.f26959b.equals(kVar.f26959b) && n.d(this.f26960c, kVar.f26960c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int hashCode = ((this.f26958a.hashCode() * 31) + this.f26959b.hashCode()) * 31;
        Class<?> cls = this.f26960c;
        if (cls != null) {
            i4 = cls.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f26958a + ", second=" + this.f26959b + '}';
    }

    public k(@N Class<?> cls, @N Class<?> cls2) {
        a(cls, cls2);
    }

    public k(@N Class<?> cls, @N Class<?> cls2, @P Class<?> cls3) {
        b(cls, cls2, cls3);
    }
}

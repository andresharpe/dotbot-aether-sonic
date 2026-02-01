package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class A5 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f29263a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A5(Unsafe unsafe) {
        this.f29263a = unsafe;
    }

    public abstract double a(Object obj, long j4);

    public abstract float b(Object obj, long j4);

    public abstract void c(Object obj, long j4, boolean z3);

    public abstract void d(Object obj, long j4, byte b4);

    public abstract void e(Object obj, long j4, double d4);

    public abstract void f(Object obj, long j4, float f4);

    public abstract boolean g(Object obj, long j4);

    public final int h(Class cls) {
        return this.f29263a.arrayBaseOffset(cls);
    }

    public final int i(Class cls) {
        return this.f29263a.arrayIndexScale(cls);
    }

    public final int j(Object obj, long j4) {
        return this.f29263a.getInt(obj, j4);
    }

    public final long k(Object obj, long j4) {
        return this.f29263a.getLong(obj, j4);
    }

    public final long l(Field field) {
        return this.f29263a.objectFieldOffset(field);
    }

    public final Object m(Object obj, long j4) {
        return this.f29263a.getObject(obj, j4);
    }

    public final void n(Object obj, long j4, int i4) {
        this.f29263a.putInt(obj, j4, i4);
    }

    public final void o(Object obj, long j4, long j5) {
        this.f29263a.putLong(obj, j4, j5);
    }

    public final void p(Object obj, long j4, Object obj2) {
        this.f29263a.putObject(obj, j4, obj2);
    }
}

package kotlin.jvm.internal;

import kotlin.reflect.q;

/* loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements kotlin.reflect.q {
    public PropertyReference2() {
    }

    @Override // X2.p
    public Object c0(Object obj, Object obj2) {
        return i0(obj, obj2);
    }

    @Override // kotlin.reflect.q
    @kotlin.Y(version = "1.1")
    public Object p0(Object obj, Object obj2) {
        return ((kotlin.reflect.q) z0()).p0(obj, obj2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.v(this);
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i4) {
        super(CallableReference.f52260K, cls, str, str2, i4);
    }

    @Override // kotlin.reflect.n
    public q.a a() {
        return ((kotlin.reflect.q) z0()).a();
    }
}

package kotlin.jvm.internal;

import kotlin.reflect.o;

/* loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements kotlin.reflect.o {
    public PropertyReference0() {
    }

    @Override // kotlin.reflect.o
    @kotlin.Y(version = "1.1")
    public Object m0() {
        return ((kotlin.reflect.o) z0()).m0();
    }

    @Override // X2.a
    public Object n() {
        return get();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.t(this);
    }

    @kotlin.Y(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public o.a a() {
        return ((kotlin.reflect.o) z0()).a();
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

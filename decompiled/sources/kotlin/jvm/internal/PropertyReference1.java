package kotlin.jvm.internal;

import kotlin.reflect.p;

/* loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements kotlin.reflect.p {
    public PropertyReference1() {
    }

    @Override // X2.l
    public Object C(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.p
    @kotlin.Y(version = "1.1")
    public Object r(Object obj) {
        return ((kotlin.reflect.p) z0()).r(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.u(this);
    }

    @kotlin.Y(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public p.a a() {
        return ((kotlin.reflect.p) z0()).a();
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

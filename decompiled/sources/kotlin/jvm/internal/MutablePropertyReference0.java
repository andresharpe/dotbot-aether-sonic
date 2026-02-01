package kotlin.jvm.internal;

import kotlin.reflect.k;
import kotlin.reflect.o;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements kotlin.reflect.k {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.reflect.o
    @kotlin.Y(version = "1.1")
    public Object m0() {
        return ((kotlin.reflect.k) z0()).m0();
    }

    @Override // X2.a
    public Object n() {
        return get();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.j(this);
    }

    @kotlin.Y(version = "1.1")
    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public o.a a() {
        return ((kotlin.reflect.k) z0()).a();
    }

    @Override // kotlin.reflect.j
    public k.a b() {
        return ((kotlin.reflect.k) z0()).b();
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

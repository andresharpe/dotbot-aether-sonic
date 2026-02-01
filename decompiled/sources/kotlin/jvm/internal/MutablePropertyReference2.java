package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.q;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements kotlin.reflect.m {
    public MutablePropertyReference2() {
    }

    @Override // X2.p
    public Object c0(Object obj, Object obj2) {
        return i0(obj, obj2);
    }

    @Override // kotlin.reflect.q
    @kotlin.Y(version = "1.1")
    public Object p0(Object obj, Object obj2) {
        return ((kotlin.reflect.m) z0()).p0(obj, obj2);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.l(this);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference2(Class cls, String str, String str2, int i4) {
        super(CallableReference.f52260K, cls, str, str2, i4);
    }

    @Override // kotlin.reflect.n
    public q.a a() {
        return ((kotlin.reflect.m) z0()).a();
    }

    @Override // kotlin.reflect.j
    public m.a b() {
        return ((kotlin.reflect.m) z0()).b();
    }
}

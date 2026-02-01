package kotlin.jvm.internal;

import kotlin.reflect.l;
import kotlin.reflect.p;

/* loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements kotlin.reflect.l {
    public MutablePropertyReference1() {
    }

    @Override // X2.l
    public Object C(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.p
    @kotlin.Y(version = "1.1")
    public Object r(Object obj) {
        return ((kotlin.reflect.l) z0()).r(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected kotlin.reflect.c w0() {
        return N.k(this);
    }

    @kotlin.Y(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public p.a a() {
        return ((kotlin.reflect.l) z0()).a();
    }

    @Override // kotlin.reflect.j
    public l.a b() {
        return ((kotlin.reflect.l) z0()).b();
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

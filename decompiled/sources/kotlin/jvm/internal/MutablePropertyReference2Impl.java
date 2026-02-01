package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(((r) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.q
    public Object i0(Object obj, Object obj2) {
        return a().t0(obj, obj2);
    }

    @Override // kotlin.reflect.m
    public void w(Object obj, Object obj2, Object obj3) {
        b().t0(obj, obj2, obj3);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i4) {
        super(cls, str, str2, i4);
    }
}

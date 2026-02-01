package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(CallableReference.f52260K, ((r) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @Override // kotlin.reflect.o
    public Object get() {
        return a().t0(new Object[0]);
    }

    @Override // kotlin.reflect.k
    public void set(Object obj) {
        b().t0(obj);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i4) {
        super(CallableReference.f52260K, cls, str, str2, i4);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

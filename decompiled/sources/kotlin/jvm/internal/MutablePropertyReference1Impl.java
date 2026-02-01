package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(CallableReference.f52260K, ((r) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public void W(Object obj, Object obj2) {
        b().t0(obj, obj2);
    }

    public Object get(Object obj) {
        return a().t0(obj);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i4) {
        super(CallableReference.f52260K, cls, str, str2, i4);
    }

    @kotlin.Y(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

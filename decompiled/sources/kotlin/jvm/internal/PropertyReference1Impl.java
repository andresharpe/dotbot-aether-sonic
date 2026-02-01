package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(kotlin.reflect.h hVar, String str, String str2) {
        super(CallableReference.f52260K, ((r) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return a().t0(obj);
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference1Impl(Class cls, String str, String str2, int i4) {
        super(CallableReference.f52260K, cls, str, str2, i4);
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}

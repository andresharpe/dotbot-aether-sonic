package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i4, kotlin.reflect.h hVar, String str, String str2) {
        super(i4, CallableReference.f52260K, ((r) hVar).p(), str, str2, !(hVar instanceof kotlin.reflect.d) ? 1 : 0);
    }

    @kotlin.Y(version = "1.4")
    public FunctionReferenceImpl(int i4, Class cls, String str, String str2, int i5) {
        super(i4, CallableReference.f52260K, cls, str, str2, i5);
    }

    @kotlin.Y(version = "1.4")
    public FunctionReferenceImpl(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(i4, obj, cls, str, str2, i5);
    }
}

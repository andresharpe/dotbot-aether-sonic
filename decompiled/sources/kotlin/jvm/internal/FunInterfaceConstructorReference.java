package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.Y(version = "1.7")
/* loaded from: classes2.dex */
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {

    /* renamed from: N, reason: collision with root package name */
    private final Class f52274N;

    public FunInterfaceConstructorReference(Class cls) {
        super(1);
        this.f52274N = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    /* renamed from: B0 */
    public kotlin.reflect.i z0() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        return this.f52274N.equals(((FunInterfaceConstructorReference) obj).f52274N);
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        return this.f52274N.hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        return "fun interface " + this.f52274N.getName();
    }
}

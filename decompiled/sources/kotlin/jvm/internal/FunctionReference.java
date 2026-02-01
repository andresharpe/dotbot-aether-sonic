package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements B, kotlin.reflect.i {

    /* renamed from: L, reason: collision with root package name */
    private final int f52275L;

    /* renamed from: M, reason: collision with root package name */
    @kotlin.Y(version = "1.4")
    private final int f52276M;

    public FunctionReference(int i4) {
        this(i4, CallableReference.f52260K, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.Y(version = "1.1")
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.i z0() {
        return (kotlin.reflect.i) super.z0();
    }

    @Override // kotlin.reflect.i
    @kotlin.Y(version = "1.1")
    public boolean K() {
        return z0().K();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getName().equals(functionReference.getName()) && A0().equals(functionReference.A0()) && this.f52276M == functionReference.f52276M && this.f52275L == functionReference.f52275L && F.g(x0(), functionReference.x0()) && F.g(y0(), functionReference.y0())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof kotlin.reflect.i)) {
            return false;
        }
        return obj.equals(v0());
    }

    @Override // kotlin.jvm.internal.B
    public int g() {
        return this.f52275L;
    }

    public int hashCode() {
        int hashCode;
        if (y0() == null) {
            hashCode = 0;
        } else {
            hashCode = y0().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + A0().hashCode();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @kotlin.Y(version = "1.1")
    public boolean l() {
        return z0().l();
    }

    @Override // kotlin.reflect.i
    @kotlin.Y(version = "1.1")
    public boolean n0() {
        return z0().n0();
    }

    @Override // kotlin.reflect.i
    @kotlin.Y(version = "1.1")
    public boolean s() {
        return z0().s();
    }

    @Override // kotlin.reflect.i
    @kotlin.Y(version = "1.1")
    public boolean s0() {
        return z0().s0();
    }

    public String toString() {
        kotlin.reflect.c v02 = v0();
        if (v02 != this) {
            return v02.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.Y(version = "1.1")
    protected kotlin.reflect.c w0() {
        return N.c(this);
    }

    @kotlin.Y(version = "1.1")
    public FunctionReference(int i4, Object obj) {
        this(i4, obj, null, null, null, 0);
    }

    @kotlin.Y(version = "1.4")
    public FunctionReference(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f52275L = i4;
        this.f52276M = i5 >> 1;
    }
}

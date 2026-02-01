package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements kotlin.reflect.n {

    /* renamed from: L, reason: collision with root package name */
    private final boolean f52293L;

    public PropertyReference() {
        this.f52293L = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    @kotlin.Y(version = "1.1")
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.n z0() {
        if (!this.f52293L) {
            return (kotlin.reflect.n) super.z0();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (y0().equals(propertyReference.y0()) && getName().equals(propertyReference.getName()) && A0().equals(propertyReference.A0()) && F.g(x0(), propertyReference.x0())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof kotlin.reflect.n)) {
            return false;
        }
        return obj.equals(v0());
    }

    public int hashCode() {
        return (((y0().hashCode() * 31) + getName().hashCode()) * 31) + A0().hashCode();
    }

    @Override // kotlin.reflect.n
    @kotlin.Y(version = "1.1")
    public boolean o0() {
        return z0().o0();
    }

    public String toString() {
        kotlin.reflect.c v02 = v0();
        if (v02 != this) {
            return v02.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.n
    @kotlin.Y(version = "1.1")
    public boolean u() {
        return z0().u();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public kotlin.reflect.c v0() {
        if (this.f52293L) {
            return this;
        }
        return super.v0();
    }

    @kotlin.Y(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
        this.f52293L = false;
    }

    @kotlin.Y(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f52293L = (i4 & 2) == 2;
    }
}

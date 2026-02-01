package kotlin.jvm.internal;

import java.io.Serializable;

@kotlin.Y(version = "1.4")
/* loaded from: classes2.dex */
public class AdaptedFunctionReference implements B, Serializable {

    /* renamed from: E, reason: collision with root package name */
    protected final Object f52253E;

    /* renamed from: F, reason: collision with root package name */
    private final Class f52254F;

    /* renamed from: G, reason: collision with root package name */
    private final String f52255G;

    /* renamed from: H, reason: collision with root package name */
    private final String f52256H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f52257I;

    /* renamed from: J, reason: collision with root package name */
    private final int f52258J;

    /* renamed from: K, reason: collision with root package name */
    private final int f52259K;

    public AdaptedFunctionReference(int i4, Class cls, String str, String str2, int i5) {
        this(i4, CallableReference.f52260K, cls, str, str2, i5);
    }

    public kotlin.reflect.h c() {
        Class cls = this.f52254F;
        if (cls == null) {
            return null;
        }
        if (this.f52257I) {
            return N.g(cls);
        }
        return N.d(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        if (this.f52257I == adaptedFunctionReference.f52257I && this.f52258J == adaptedFunctionReference.f52258J && this.f52259K == adaptedFunctionReference.f52259K && F.g(this.f52253E, adaptedFunctionReference.f52253E) && F.g(this.f52254F, adaptedFunctionReference.f52254F) && this.f52255G.equals(adaptedFunctionReference.f52255G) && this.f52256H.equals(adaptedFunctionReference.f52256H)) {
            return true;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.B
    public int g() {
        return this.f52258J;
    }

    public int hashCode() {
        int i4;
        int i5;
        Object obj = this.f52253E;
        int i6 = 0;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i7 = i4 * 31;
        Class cls = this.f52254F;
        if (cls != null) {
            i6 = cls.hashCode();
        }
        int hashCode = (((((i7 + i6) * 31) + this.f52255G.hashCode()) * 31) + this.f52256H.hashCode()) * 31;
        if (this.f52257I) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        return ((((hashCode + i5) * 31) + this.f52258J) * 31) + this.f52259K;
    }

    public String toString() {
        return N.w(this);
    }

    public AdaptedFunctionReference(int i4, Object obj, Class cls, String str, String str2, int i5) {
        this.f52253E = obj;
        this.f52254F = cls;
        this.f52255G = str;
        this.f52256H = str2;
        this.f52257I = (i5 & 1) == 1;
        this.f52258J = i4;
        this.f52259K = i5 >> 1;
    }
}

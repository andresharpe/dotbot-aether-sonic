package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.r
/* loaded from: classes2.dex */
public final class a implements GenericArrayType, v {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final Type f52507E;

    public a(@l3.d Type elementType) {
        F.p(elementType, "elementType");
        this.f52507E = elementType;
    }

    public boolean equals(@l3.e Object obj) {
        if ((obj instanceof GenericArrayType) && F.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    @l3.d
    public Type getGenericComponentType() {
        return this.f52507E;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.v
    @l3.d
    public String getTypeName() {
        String j4;
        StringBuilder sb = new StringBuilder();
        j4 = y.j(this.f52507E);
        sb.append(j4);
        sb.append("[]");
        return sb.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @l3.d
    public String toString() {
        return getTypeName();
    }
}

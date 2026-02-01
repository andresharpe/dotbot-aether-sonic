package kotlin.properties;

import kotlin.jvm.internal.F;
import kotlin.reflect.n;

/* loaded from: classes2.dex */
final class b<T> implements f<Object, T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private T f52420a;

    @Override // kotlin.properties.f, kotlin.properties.e
    @l3.d
    public T a(@l3.e Object obj, @l3.d n<?> property) {
        F.p(property, "property");
        T t3 = this.f52420a;
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.f
    public void b(@l3.e Object obj, @l3.d n<?> property, @l3.d T value) {
        F.p(property, "property");
        F.p(value, "value");
        this.f52420a = value;
    }

    @l3.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f52420a != null) {
            str = "value=" + this.f52420a;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}

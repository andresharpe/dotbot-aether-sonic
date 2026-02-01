package kotlin.properties;

import kotlin.jvm.internal.F;
import kotlin.reflect.n;

/* loaded from: classes2.dex */
public abstract class c<V> implements f<Object, V> {

    /* renamed from: a, reason: collision with root package name */
    private V f52421a;

    public c(V v3) {
        this.f52421a = v3;
    }

    @Override // kotlin.properties.f, kotlin.properties.e
    public V a(@l3.e Object obj, @l3.d n<?> property) {
        F.p(property, "property");
        return this.f52421a;
    }

    @Override // kotlin.properties.f
    public void b(@l3.e Object obj, @l3.d n<?> property, V v3) {
        F.p(property, "property");
        V v4 = this.f52421a;
        if (!d(property, v4, v3)) {
            return;
        }
        this.f52421a = v3;
        c(property, v4, v3);
    }

    protected void c(@l3.d n<?> property, V v3, V v4) {
        F.p(property, "property");
    }

    protected boolean d(@l3.d n<?> property, V v3, V v4) {
        F.p(property, "property");
        return true;
    }

    @l3.d
    public String toString() {
        return "ObservableProperty(value=" + this.f52421a + ')';
    }
}

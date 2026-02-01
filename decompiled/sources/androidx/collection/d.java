package androidx.collection;

import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class d {
    @l3.d
    public static final <T> c<T> a() {
        return new c<>();
    }

    @l3.d
    public static final <T> c<T> b(@l3.d T... values) {
        F.q(values, "values");
        c<T> cVar = new c<>(values.length);
        for (T t3 : values) {
            cVar.add(t3);
        }
        return cVar;
    }
}

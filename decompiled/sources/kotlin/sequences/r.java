package kotlin.sequences;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.collections.C2110x;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
class r extends q {
    @kotlin.internal.f
    private static final <T> m<T> c(Enumeration<T> enumeration) {
        Iterator f02;
        m<T> e4;
        F.p(enumeration, "<this>");
        f02 = C2110x.f0(enumeration);
        e4 = s.e(f02);
        return e4;
    }
}

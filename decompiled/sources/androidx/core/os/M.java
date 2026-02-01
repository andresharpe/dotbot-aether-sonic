package androidx.core.os;

import kotlin.InterfaceC2205l;
import kotlin.V;

/* loaded from: classes.dex */
public final class M {
    @InterfaceC2205l(message = "Use androidx.tracing.Trace instead", replaceWith = @V(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@l3.d String sectionName, @l3.d X2.a<? extends T> block) {
        kotlin.jvm.internal.F.p(sectionName, "sectionName");
        kotlin.jvm.internal.F.p(block, "block");
        L.b(sectionName);
        try {
            return block.n();
        } finally {
            kotlin.jvm.internal.C.d(1);
            L.d();
            kotlin.jvm.internal.C.c(1);
        }
    }
}

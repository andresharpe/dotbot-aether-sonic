package kotlinx.coroutines;

import kotlinx.coroutines.internal.C2315w;
import kotlinx.coroutines.internal.C2317y;

/* loaded from: classes2.dex */
public final class X0 extends C2315w implements E0 {
    @Override // kotlinx.coroutines.E0
    @l3.d
    public X0 D() {
        return this;
    }

    @l3.d
    public final String b1(@l3.d String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z3 = true;
        for (C2317y c2317y = (C2317y) I0(); !kotlin.jvm.internal.F.g(c2317y, this); c2317y = c2317y.J0()) {
            if (c2317y instanceof R0) {
                R0 r02 = (R0) c2317y;
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(", ");
                }
                sb.append(r02);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.F.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // kotlinx.coroutines.E0
    public boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.C2317y
    @l3.d
    public String toString() {
        return super.toString();
    }
}

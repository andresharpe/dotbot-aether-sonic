package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Y;
import kotlin.jvm.internal.F;

@Y(version = "1.1")
/* loaded from: classes2.dex */
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@l3.d f<T> fVar, @l3.d T value) {
            F.p(value, "value");
            if (fVar.d(fVar.c(), value) && fVar.d(value, fVar.k())) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@l3.d f<T> fVar) {
            return !fVar.d(fVar.c(), fVar.k());
        }
    }

    @Override // kotlin.ranges.g
    boolean b(@l3.d T t3);

    boolean d(@l3.d T t3, @l3.d T t4);

    @Override // kotlin.ranges.g
    boolean isEmpty();
}

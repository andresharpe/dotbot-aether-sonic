package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public interface g<T extends Comparable<? super T>> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@l3.d g<T> gVar, @l3.d T value) {
            F.p(value, "value");
            if (value.compareTo(gVar.c()) >= 0 && value.compareTo(gVar.k()) <= 0) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@l3.d g<T> gVar) {
            if (gVar.c().compareTo(gVar.k()) > 0) {
                return true;
            }
            return false;
        }
    }

    boolean b(@l3.d T t3);

    @l3.d
    T c();

    boolean isEmpty();

    @l3.d
    T k();
}

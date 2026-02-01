package kotlin.ranges;

import java.lang.Comparable;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;

@K0(markerClass = {kotlin.r.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public interface r<T extends Comparable<? super T>> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@l3.d r<T> rVar, @l3.d T value) {
            F.p(value, "value");
            if (value.compareTo(rVar.c()) >= 0 && value.compareTo(rVar.j()) < 0) {
                return true;
            }
            return false;
        }

        public static <T extends Comparable<? super T>> boolean b(@l3.d r<T> rVar) {
            if (rVar.c().compareTo(rVar.j()) >= 0) {
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
    T j();
}

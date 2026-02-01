package kotlin.time;

import kotlin.K0;
import kotlin.Y;

@K0(markerClass = {k.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public interface q {

    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean a(@l3.d q qVar) {
            return e.e0(qVar.e());
        }

        public static boolean b(@l3.d q qVar) {
            return !e.e0(qVar.e());
        }

        @l3.d
        public static q c(@l3.d q qVar, long j4) {
            return qVar.c(e.y0(j4));
        }

        @l3.d
        public static q d(@l3.d q qVar, long j4) {
            return new c(qVar, j4, null);
        }
    }

    @l3.d
    q a(long j4);

    boolean b();

    @l3.d
    q c(long j4);

    long e();

    boolean f();
}

package kotlin.time;

import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.F;
import kotlin.time.q;

@K0(markerClass = {k.class})
@Y(version = "1.9")
/* loaded from: classes2.dex */
public interface d extends q, Comparable<d> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static int a(@l3.d d dVar, @l3.d d other) {
            F.p(other, "other");
            return e.l(dVar.d(other), e.f52872F.W());
        }

        public static boolean b(@l3.d d dVar) {
            return q.a.a(dVar);
        }

        public static boolean c(@l3.d d dVar) {
            return q.a.b(dVar);
        }

        @l3.d
        public static d d(@l3.d d dVar, long j4) {
            return dVar.c(e.y0(j4));
        }
    }

    @Override // kotlin.time.q
    @l3.d
    d a(long j4);

    @Override // kotlin.time.q
    @l3.d
    d c(long j4);

    long d(@l3.d d dVar);

    boolean equals(@l3.e Object obj);

    /* renamed from: h */
    int compareTo(@l3.d d dVar);

    int hashCode();
}

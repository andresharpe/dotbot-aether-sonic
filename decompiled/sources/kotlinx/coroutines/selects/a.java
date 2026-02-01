package kotlinx.coroutines.selects;

import X2.l;
import X2.p;
import kotlinx.coroutines.A0;

/* loaded from: classes2.dex */
public interface a<R> {

    /* renamed from: kotlinx.coroutines.selects.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0504a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@l3.d a<? super R> aVar, @l3.d e<? super P, ? extends Q> eVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
            aVar.i(eVar, null, pVar);
        }
    }

    <Q> void H(@l3.d d<? extends Q> dVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    void b0(@l3.d c cVar, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar);

    <P, Q> void h(@l3.d e<? super P, ? extends Q> eVar, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    <P, Q> void i(@l3.d e<? super P, ? extends Q> eVar, P p4, @l3.d p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar);

    @A0
    void j(long j4, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar);
}

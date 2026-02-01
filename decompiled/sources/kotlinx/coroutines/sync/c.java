package kotlinx.coroutines.sync;

import kotlin.DeprecationLevel;
import kotlin.H0;
import kotlin.InterfaceC2205l;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC2205l(level = DeprecationLevel.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(c cVar, Object obj, kotlin.coroutines.c cVar2, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 1) != 0) {
                    obj = null;
                }
                return cVar.c(obj, cVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean c(c cVar, Object obj, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 1) != 0) {
                    obj = null;
                }
                return cVar.a(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void d(c cVar, Object obj, int i4, Object obj2) {
            if (obj2 == null) {
                if ((i4 & 1) != 0) {
                    obj = null;
                }
                cVar.d(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    boolean a(@l3.e Object obj);

    boolean b();

    @l3.e
    Object c(@l3.e Object obj, @l3.d kotlin.coroutines.c<? super H0> cVar);

    void d(@l3.e Object obj);

    boolean e(@l3.d Object obj);

    @l3.d
    kotlinx.coroutines.selects.e<Object, c> f();
}

package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;

@W2.g
/* renamed from: kotlinx.coroutines.internal.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2310q<E> {

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final Object f54502a;

    private /* synthetic */ C2310q(Object obj) {
        this.f54502a = obj;
    }

    public static final /* synthetic */ C2310q a(Object obj) {
        return new C2310q(obj);
    }

    @l3.d
    public static <E> Object b(@l3.e Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i4, C2197u c2197u) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof C2310q) && kotlin.jvm.internal.F.g(obj, ((C2310q) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.F.g(obj, obj2);
    }

    public static final void f(Object obj, @l3.d X2.l<? super E, H0> lVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            lVar.C(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                lVar.C((Object) arrayList.get(size));
            } else {
                return;
            }
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @l3.d
    public static final Object h(Object obj, E e4) {
        if (obj == null) {
            return b(e4);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e4);
            return b(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e4);
        return b(arrayList);
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f54502a, obj);
    }

    public int hashCode() {
        return g(this.f54502a);
    }

    public final /* synthetic */ Object j() {
        return this.f54502a;
    }

    public String toString() {
        return i(this.f54502a);
    }
}

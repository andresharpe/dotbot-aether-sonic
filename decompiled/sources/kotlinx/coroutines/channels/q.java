package kotlinx.coroutines.channels;

import kotlin.U;
import kotlin.jvm.internal.C2197u;
import kotlinx.coroutines.G0;

@W2.g
/* loaded from: classes2.dex */
public final class q<T> {

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    public static final b f53131b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final c f53132c = new c();

    /* renamed from: a, reason: collision with root package name */
    @l3.e
    private final Object f53133a;

    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @W2.f
        @l3.e
        public final Throwable f53134a;

        public a(@l3.e Throwable th) {
            this.f53134a = th;
        }

        public boolean equals(@l3.e Object obj) {
            if ((obj instanceof a) && kotlin.jvm.internal.F.g(this.f53134a, ((a) obj).f53134a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f53134a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.q.c
        @l3.d
        public String toString() {
            return "Closed(" + this.f53134a + ')';
        }
    }

    @G0
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C2197u c2197u) {
            this();
        }

        @l3.d
        @G0
        public final <E> Object a(@l3.e Throwable th) {
            return q.c(new a(th));
        }

        @l3.d
        @G0
        public final <E> Object b() {
            return q.c(q.f53132c);
        }

        @l3.d
        @G0
        public final <E> Object c(E e4) {
            return q.c(e4);
        }

        private b() {
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        @l3.d
        public String toString() {
            return "Failed";
        }
    }

    @U
    private /* synthetic */ q(Object obj) {
        this.f53133a = obj;
    }

    public static final /* synthetic */ q b(Object obj) {
        return new q(obj);
    }

    @l3.d
    @U
    public static <T> Object c(@l3.e Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof q) && kotlin.jvm.internal.F.g(obj, ((q) obj2).o());
    }

    public static final boolean e(Object obj, Object obj2) {
        return kotlin.jvm.internal.F.g(obj, obj2);
    }

    @l3.e
    public static final Throwable f(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f53134a;
    }

    @U
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.e
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).f53134a) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @l3.d
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f53133a, obj);
    }

    public int hashCode() {
        return j(this.f53133a);
    }

    public final /* synthetic */ Object o() {
        return this.f53133a;
    }

    @l3.d
    public String toString() {
        return n(this.f53133a);
    }
}

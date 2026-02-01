package kotlinx.coroutines.selects;

import X2.l;
import kotlin.H0;
import kotlin.jvm.internal.C;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.internal.S;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    @l3.d
    private static final Object f54663a = new S("NOT_SELECTED");

    /* renamed from: b */
    @l3.d
    private static final Object f54664b = new S("ALREADY_SELECTED");

    /* renamed from: c */
    @l3.d
    private static final Object f54665c = new S("UNDECIDED");

    /* renamed from: d */
    @l3.d
    private static final Object f54666d = new S("RESUMED");

    /* renamed from: e */
    @l3.d
    private static final i f54667e = new i();

    public static final /* synthetic */ Object a() {
        return f54666d;
    }

    public static final /* synthetic */ i b() {
        return f54667e;
    }

    public static final /* synthetic */ Object c() {
        return f54665c;
    }

    @l3.d
    public static final Object d() {
        return f54664b;
    }

    public static /* synthetic */ void e() {
    }

    @l3.d
    public static final Object f() {
        return f54663a;
    }

    public static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @A0
    public static final <R> void k(@l3.d a<? super R> aVar, long j4, @l3.d l<? super kotlin.coroutines.c<? super R>, ? extends Object> lVar) {
        aVar.j(C2269d0.e(j4), lVar);
    }

    @l3.e
    public static final <R> Object l(@l3.d l<? super a<? super R>, H0> lVar, @l3.d kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        b bVar = new b(cVar);
        try {
            lVar.C(bVar);
        } catch (Throwable th) {
            bVar.g1(th);
        }
        Object f12 = bVar.f1();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (f12 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return f12;
    }

    private static final <R> Object m(l<? super a<? super R>, H0> lVar, kotlin.coroutines.c<? super R> cVar) {
        Object l4;
        C.e(0);
        b bVar = new b(cVar);
        try {
            lVar.C(bVar);
        } catch (Throwable th) {
            bVar.g1(th);
        }
        Object f12 = bVar.f1();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (f12 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        C.e(1);
        return f12;
    }
}

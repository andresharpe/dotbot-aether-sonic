package kotlinx.coroutines.internal;

import kotlin.coroutines.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.p1;

/* loaded from: classes2.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @W2.f
    @l3.d
    public static final S f54458a = new S("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final X2.p<Object, f.b, Object> f54459b = a.f54462F;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private static final X2.p<p1<?>, f.b, p1<?>> f54460c = b.f54463F;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private static final X2.p<d0, f.b, d0> f54461d = c.f54464F;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.p<Object, f.b, Object> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f54462F = new a();

        a() {
            super(2);
        }

        @Override // X2.p
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.e Object obj, @l3.d f.b bVar) {
            Integer num;
            int i4;
            if (bVar instanceof p1) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = 1;
                }
                if (i4 != 0) {
                    return Integer.valueOf(i4 + 1);
                }
                return bVar;
            }
            return obj;
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.p<p1<?>, f.b, p1<?>> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f54463F = new b();

        b() {
            super(2);
        }

        @Override // X2.p
        @l3.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p1<?> c0(@l3.e p1<?> p1Var, @l3.d f.b bVar) {
            if (p1Var != null) {
                return p1Var;
            }
            if (bVar instanceof p1) {
                return (p1) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.p<d0, f.b, d0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f54464F = new c();

        c() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 c0(@l3.d d0 d0Var, @l3.d f.b bVar) {
            if (bVar instanceof p1) {
                p1<?> p1Var = (p1) bVar;
                d0Var.a(p1Var, p1Var.a1(d0Var.f54477a));
            }
            return d0Var;
        }
    }

    public static final void a(@l3.d kotlin.coroutines.f fVar, @l3.e Object obj) {
        if (obj == f54458a) {
            return;
        }
        if (obj instanceof d0) {
            ((d0) obj).b(fVar);
            return;
        }
        Object i4 = fVar.i(null, f54460c);
        if (i4 != null) {
            ((p1) i4).B0(fVar, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    @l3.d
    public static final Object b(@l3.d kotlin.coroutines.f fVar) {
        Object i4 = fVar.i(0, f54459b);
        kotlin.jvm.internal.F.m(i4);
        return i4;
    }

    @l3.e
    public static final Object c(@l3.d kotlin.coroutines.f fVar, @l3.e Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        if (obj == 0) {
            return f54458a;
        }
        if (obj instanceof Integer) {
            return fVar.i(new d0(fVar, ((Number) obj).intValue()), f54461d);
        }
        return ((p1) obj).a1(fVar);
    }
}

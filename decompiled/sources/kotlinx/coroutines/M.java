package kotlinx.coroutines;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f52943a = " @";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.p<kotlin.coroutines.f, f.b, kotlin.coroutines.f> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f52944F = new a();

        a() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.f c0(@l3.d kotlin.coroutines.f fVar, @l3.d f.b bVar) {
            if (bVar instanceof K) {
                return fVar.A(((K) bVar).y0());
            }
            return fVar.A(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.p<kotlin.coroutines.f, f.b, kotlin.coroutines.f> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<kotlin.coroutines.f> f52945F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f52946G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<kotlin.coroutines.f> objectRef, boolean z3) {
            super(2);
            this.f52945F = objectRef;
            this.f52946G = z3;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.f, T] */
        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final kotlin.coroutines.f c0(@l3.d kotlin.coroutines.f fVar, @l3.d f.b bVar) {
            if (!(bVar instanceof K)) {
                return fVar.A(bVar);
            }
            f.b a4 = this.f52945F.f52301E.a(bVar.getKey());
            if (a4 == null) {
                K k4 = (K) bVar;
                if (this.f52946G) {
                    k4 = k4.y0();
                }
                return fVar.A(k4);
            }
            Ref.ObjectRef<kotlin.coroutines.f> objectRef = this.f52945F;
            objectRef.f52301E = objectRef.f52301E.b(bVar.getKey());
            return fVar.A(((K) bVar).z(a4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.p<Boolean, f.b, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f52947F = new c();

        c() {
            super(2);
        }

        @l3.d
        public final Boolean c(boolean z3, @l3.d f.b bVar) {
            boolean z4;
            if (!z3 && !(bVar instanceof K)) {
                z4 = false;
            } else {
                z4 = true;
            }
            return Boolean.valueOf(z4);
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ Boolean c0(Boolean bool, f.b bVar) {
            return c(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final kotlin.coroutines.f a(kotlin.coroutines.f fVar, kotlin.coroutines.f fVar2, boolean z3) {
        boolean c4 = c(fVar);
        boolean c5 = c(fVar2);
        if (!c4 && !c5) {
            return fVar.A(fVar2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f52301E = fVar2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f52041E;
        kotlin.coroutines.f fVar3 = (kotlin.coroutines.f) fVar.i(emptyCoroutineContext, new b(objectRef, z3));
        if (c5) {
            objectRef.f52301E = ((kotlin.coroutines.f) objectRef.f52301E).i(emptyCoroutineContext, a.f52944F);
        }
        return fVar3.A((kotlin.coroutines.f) objectRef.f52301E);
    }

    @l3.e
    public static final String b(@l3.d kotlin.coroutines.f fVar) {
        return null;
    }

    private static final boolean c(kotlin.coroutines.f fVar) {
        return ((Boolean) fVar.i(Boolean.FALSE, c.f52947F)).booleanValue();
    }

    @l3.d
    @G0
    public static final kotlin.coroutines.f d(@l3.d kotlin.coroutines.f fVar, @l3.d kotlin.coroutines.f fVar2) {
        if (!c(fVar2)) {
            return fVar.A(fVar2);
        }
        return a(fVar, fVar2, false);
    }

    @A0
    @l3.d
    public static final kotlin.coroutines.f e(@l3.d U u3, @l3.d kotlin.coroutines.f fVar) {
        kotlin.coroutines.f a4 = a(u3.getCoroutineContext(), fVar, true);
        if (a4 != C2322k0.a() && a4.a(kotlin.coroutines.d.f52046u) == null) {
            return a4.A(C2322k0.a());
        }
        return a4;
    }

    @l3.e
    public static final y1<?> f(@l3.d kotlin.coroutines.jvm.internal.c cVar) {
        while (!(cVar instanceof C2289g0) && (cVar = cVar.q()) != null) {
            if (cVar instanceof y1) {
                return (y1) cVar;
            }
        }
        return null;
    }

    @l3.e
    public static final y1<?> g(@l3.d kotlin.coroutines.c<?> cVar, @l3.d kotlin.coroutines.f fVar, @l3.e Object obj) {
        if (!(cVar instanceof kotlin.coroutines.jvm.internal.c) || fVar.a(z1.f54766E) == null) {
            return null;
        }
        y1<?> f4 = f((kotlin.coroutines.jvm.internal.c) cVar);
        if (f4 != null) {
            f4.L1(fVar, obj);
        }
        return f4;
    }

    public static final <T> T h(@l3.d kotlin.coroutines.c<?> cVar, @l3.e Object obj, @l3.d X2.a<? extends T> aVar) {
        y1<?> y1Var;
        kotlin.coroutines.f e4 = cVar.e();
        Object c4 = kotlinx.coroutines.internal.X.c(e4, obj);
        if (c4 != kotlinx.coroutines.internal.X.f54458a) {
            y1Var = g(cVar, e4, c4);
        } else {
            y1Var = null;
        }
        try {
            return aVar.n();
        } finally {
            kotlin.jvm.internal.C.d(1);
            if (y1Var == null || y1Var.K1()) {
                kotlinx.coroutines.internal.X.a(e4, c4);
            }
            kotlin.jvm.internal.C.c(1);
        }
    }

    public static final <T> T i(@l3.d kotlin.coroutines.f fVar, @l3.e Object obj, @l3.d X2.a<? extends T> aVar) {
        Object c4 = kotlinx.coroutines.internal.X.c(fVar, obj);
        try {
            return aVar.n();
        } finally {
            kotlin.jvm.internal.C.d(1);
            kotlinx.coroutines.internal.X.a(fVar, c4);
            kotlin.jvm.internal.C.c(1);
        }
    }
}

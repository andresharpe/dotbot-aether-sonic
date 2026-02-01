package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.X;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final X2.l<Object, Object> f54340a = b.f54343F;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final X2.p<Object, Object, Boolean> f54341b = a.f54342F;

    /* loaded from: classes2.dex */
    static final class a extends Lambda implements X2.p<Object, Object, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f54342F = new a();

        a() {
            super(2);
        }

        @Override // X2.p
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean c0(@l3.e Object obj, @l3.e Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.F.g(obj, obj2));
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<Object, Object> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f54343F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.e
        public final Object C(@l3.e Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l3.d
    public static final <T> InterfaceC2282i<T> a(@l3.d InterfaceC2282i<? extends T> interfaceC2282i) {
        if (!(interfaceC2282i instanceof H)) {
            return d(interfaceC2282i, f54340a, f54341b);
        }
        return interfaceC2282i;
    }

    @l3.d
    public static final <T> InterfaceC2282i<T> b(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.p<? super T, ? super T, Boolean> pVar) {
        return d(interfaceC2282i, f54340a, (X2.p) X.q(pVar, 2));
    }

    @l3.d
    public static final <T, K> InterfaceC2282i<T> c(@l3.d InterfaceC2282i<? extends T> interfaceC2282i, @l3.d X2.l<? super T, ? extends K> lVar) {
        return d(interfaceC2282i, lVar, f54341b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> InterfaceC2282i<T> d(InterfaceC2282i<? extends T> interfaceC2282i, X2.l<? super T, ? extends Object> lVar, X2.p<Object, Object, Boolean> pVar) {
        if (interfaceC2282i instanceof C2280g) {
            C2280g c2280g = (C2280g) interfaceC2282i;
            if (c2280g.f54106F == lVar && c2280g.f54107G == pVar) {
                return interfaceC2282i;
            }
        }
        return new C2280g(interfaceC2282i, lVar, pVar);
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}

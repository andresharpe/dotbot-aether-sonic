package androidx.lifecycle;

import R.a;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l0<VM extends j0> implements kotlin.A<VM> {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private final kotlin.reflect.d<VM> f15665E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final X2.a<p0> f15666F;

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final X2.a<m0.b> f15667G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final X2.a<R.a> f15668H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private VM f15669I;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements X2.a<a.C0017a> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f15670F = new a();

        a() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a.C0017a n() {
            return a.C0017a.f1726b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public l0(@l3.d kotlin.reflect.d<VM> viewModelClass, @l3.d X2.a<? extends p0> storeProducer, @l3.d X2.a<? extends m0.b> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        kotlin.jvm.internal.F.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.F.p(storeProducer, "storeProducer");
        kotlin.jvm.internal.F.p(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.A
    public boolean a() {
        if (this.f15669I != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.A
    @l3.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.f15669I;
        if (vm == null) {
            VM vm2 = (VM) new m0(this.f15666F.n(), this.f15667G.n(), this.f15668H.n()).a(W2.b.e(this.f15665E));
            this.f15669I = vm2;
            return vm2;
        }
        return vm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @W2.j
    public l0(@l3.d kotlin.reflect.d<VM> viewModelClass, @l3.d X2.a<? extends p0> storeProducer, @l3.d X2.a<? extends m0.b> factoryProducer, @l3.d X2.a<? extends R.a> extrasProducer) {
        kotlin.jvm.internal.F.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.F.p(storeProducer, "storeProducer");
        kotlin.jvm.internal.F.p(factoryProducer, "factoryProducer");
        kotlin.jvm.internal.F.p(extrasProducer, "extrasProducer");
        this.f15665E = viewModelClass;
        this.f15666F = storeProducer;
        this.f15667G = factoryProducer;
        this.f15668H = extrasProducer;
    }

    public /* synthetic */ l0(kotlin.reflect.d dVar, X2.a aVar, X2.a aVar2, X2.a aVar3, int i4, C2197u c2197u) {
        this(dVar, aVar, aVar2, (i4 & 8) != 0 ? a.f15670F : aVar3);
    }
}

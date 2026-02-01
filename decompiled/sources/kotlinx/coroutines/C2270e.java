package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2270e<T> {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ AtomicIntegerFieldUpdater f53455b = AtomicIntegerFieldUpdater.newUpdater(C2270e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final InterfaceC2235a0<T>[] f53456a;

    @l3.d
    volatile /* synthetic */ int notCompletedCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.e$a */
    /* loaded from: classes2.dex */
    public final class a extends R0 {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private final InterfaceC2333q<List<? extends T>> f53457I;

        /* renamed from: J, reason: collision with root package name */
        public InterfaceC2328n0 f53458J;

        @l3.d
        private volatile /* synthetic */ Object _disposer = null;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@l3.d InterfaceC2333q<? super List<? extends T>> interfaceC2333q) {
            this.f53457I = interfaceC2333q;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
            X0(th);
            return kotlin.H0.f51801a;
        }

        @Override // kotlinx.coroutines.G
        public void X0(@l3.e Throwable th) {
            if (th != null) {
                Object L3 = this.f53457I.L(th);
                if (L3 != null) {
                    this.f53457I.t0(L3);
                    C2270e<T>.b a12 = a1();
                    if (a12 != null) {
                        a12.d();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C2270e.f53455b.decrementAndGet(C2270e.this) == 0) {
                InterfaceC2333q<List<? extends T>> interfaceC2333q = this.f53457I;
                InterfaceC2235a0[] interfaceC2235a0Arr = ((C2270e) C2270e.this).f53456a;
                ArrayList arrayList = new ArrayList(interfaceC2235a0Arr.length);
                for (InterfaceC2235a0 interfaceC2235a0 : interfaceC2235a0Arr) {
                    arrayList.add(interfaceC2235a0.t());
                }
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(arrayList));
            }
        }

        @l3.e
        public final C2270e<T>.b a1() {
            return (b) this._disposer;
        }

        @l3.d
        public final InterfaceC2328n0 b1() {
            InterfaceC2328n0 interfaceC2328n0 = this.f53458J;
            if (interfaceC2328n0 != null) {
                return interfaceC2328n0;
            }
            kotlin.jvm.internal.F.S("handle");
            return null;
        }

        public final void c1(@l3.e C2270e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void d1(@l3.d InterfaceC2328n0 interfaceC2328n0) {
            this.f53458J = interfaceC2328n0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.e$b */
    /* loaded from: classes2.dex */
    public final class b extends AbstractC2329o {

        /* renamed from: E, reason: collision with root package name */
        @l3.d
        private final C2270e<T>.a[] f53460E;

        public b(@l3.d C2270e<T>.a[] aVarArr) {
            this.f53460E = aVarArr;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(Throwable th) {
            c(th);
            return kotlin.H0.f51801a;
        }

        @Override // kotlinx.coroutines.AbstractC2331p
        public void c(@l3.e Throwable th) {
            d();
        }

        public final void d() {
            for (C2270e<T>.a aVar : this.f53460E) {
                aVar.b1().f();
            }
        }

        @l3.d
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f53460E + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2270e(@l3.d InterfaceC2235a0<? extends T>[] interfaceC2235a0Arr) {
        this.f53456a = interfaceC2235a0Arr;
        this.notCompletedCount = interfaceC2235a0Arr.length;
    }

    @l3.e
    public final Object b(@l3.d kotlin.coroutines.c<? super List<? extends T>> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        r rVar = new r(e4, 1);
        rVar.T();
        int length = this.f53456a.length;
        a[] aVarArr = new a[length];
        for (int i4 = 0; i4 < length; i4++) {
            InterfaceC2235a0 interfaceC2235a0 = this.f53456a[i4];
            interfaceC2235a0.start();
            a aVar = new a(rVar);
            aVar.d1(interfaceC2235a0.V(aVar));
            kotlin.H0 h02 = kotlin.H0.f51801a;
            aVarArr[i4] = aVar;
        }
        C2270e<T>.b bVar = new b(aVarArr);
        for (int i5 = 0; i5 < length; i5++) {
            aVarArr[i5].c1(bVar);
        }
        if (rVar.m()) {
            bVar.d();
        } else {
            rVar.u(bVar);
        }
        Object z3 = rVar.z();
        l4 = kotlin.coroutines.intrinsics.b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }
}

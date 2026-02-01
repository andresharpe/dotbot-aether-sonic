package androidx.fragment.app;

import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Lambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/lifecycle/m0$b;", "<anonymous>", "()Landroidx/lifecycle/m0$b;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$viewModels$3 extends Lambda implements X2.a<m0.b> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.a<q0> f15162F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ Fragment f15163G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$3(X2.a<? extends q0> aVar, Fragment fragment) {
        super(0);
        this.f15162F = aVar;
        this.f15163G = fragment;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m0.b n() {
        InterfaceC0919v interfaceC0919v;
        q0 n4 = this.f15162F.n();
        m0.b bVar = null;
        if (n4 instanceof InterfaceC0919v) {
            interfaceC0919v = (InterfaceC0919v) n4;
        } else {
            interfaceC0919v = null;
        }
        if (interfaceC0919v != null) {
            bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
        }
        if (bVar == null) {
            bVar = this.f15163G.getDefaultViewModelProviderFactory();
        }
        kotlin.jvm.internal.F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
        return bVar;
    }
}

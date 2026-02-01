package androidx.fragment.app;

import androidx.lifecycle.m0;
import kotlin.jvm.internal.Lambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/lifecycle/m0$b;", "<anonymous>", "()Landroidx/lifecycle/m0$b;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$activityViewModels$2 extends Lambda implements X2.a<m0.b> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Fragment f15159F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$2(Fragment fragment) {
        super(0);
        this.f15159F = fragment;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m0.b n() {
        m0.b defaultViewModelProviderFactory = this.f15159F.requireActivity().getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
        return defaultViewModelProviderFactory;
    }
}

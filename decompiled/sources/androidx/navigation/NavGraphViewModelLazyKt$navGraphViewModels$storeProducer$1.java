package androidx.navigation;

import androidx.lifecycle.p0;
import kotlin.jvm.internal.Lambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/lifecycle/p0;", "c", "()Landroidx/lifecycle/p0;"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends Lambda implements X2.a<p0> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ kotlin.A<r> f16323F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(kotlin.A<r> a4) {
        super(0);
        this.f16323F = a4;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final p0 n() {
        r g4;
        g4 = NavGraphViewModelLazyKt.g(this.f16323F);
        return g4.getViewModelStore();
    }
}

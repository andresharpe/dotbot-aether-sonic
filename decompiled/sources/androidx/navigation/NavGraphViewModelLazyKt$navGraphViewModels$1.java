package androidx.navigation;

import androidx.lifecycle.m0;
import kotlin.jvm.internal.Lambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/lifecycle/m0$b;", "c", "()Landroidx/lifecycle/m0$b;"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends Lambda implements X2.a<m0.b> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.a<m0.b> f16315F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ kotlin.A<r> f16316G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavGraphViewModelLazyKt$navGraphViewModels$1(X2.a<? extends m0.b> aVar, kotlin.A<r> a4) {
        super(0);
        this.f16315F = aVar;
        this.f16316G = a4;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final m0.b n() {
        m0.b n4;
        r g4;
        X2.a<m0.b> aVar = this.f16315F;
        if (aVar == null) {
            n4 = null;
        } else {
            n4 = aVar.n();
        }
        if (n4 == null) {
            g4 = NavGraphViewModelLazyKt.g(this.f16316G);
            return g4.getDefaultViewModelProviderFactory();
        }
        return n4;
    }
}

package androidx.navigation;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Lambda;

@kotlin.E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "Landroidx/navigation/r;", "c", "()Landroidx/navigation/r;"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 extends Lambda implements X2.a<r> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ Fragment f16319F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ int f16320G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(Fragment fragment, int i4) {
        super(0);
        this.f16319F = fragment;
        this.f16320G = i4;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final r n() {
        return androidx.navigation.fragment.f.a(this.f16319F).D(this.f16320G);
    }
}

package androidx.activity;

import kotlin.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;

@E(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/j0;", "VM", "LR/a;", "c", "()LR/a;"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$4 extends Lambda implements X2.a<R.a> {

    /* renamed from: F, reason: collision with root package name */
    final /* synthetic */ X2.a<R.a> f4430F;

    /* renamed from: G, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f4431G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(X2.a<? extends R.a> aVar, ComponentActivity componentActivity) {
        super(0);
        this.f4430F = aVar;
        this.f4431G = componentActivity;
    }

    @Override // X2.a
    @l3.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final R.a n() {
        R.a n4;
        X2.a<R.a> aVar = this.f4430F;
        if (aVar == null || (n4 = aVar.n()) == null) {
            R.a l4 = this.f4431G.l();
            F.o(l4, "this.defaultViewModelCreationExtras");
            return l4;
        }
        return n4;
    }
}

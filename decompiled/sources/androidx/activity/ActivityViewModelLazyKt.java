package androidx.activity;

import androidx.annotation.K;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import kotlin.A;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    @InterfaceC2205l(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @K
    public static final /* synthetic */ <VM extends j0> A<VM> a(ComponentActivity componentActivity, X2.a<? extends m0.b> aVar) {
        F.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        F.y(4, "VM");
        return new l0(N.d(j0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @K
    public static final /* synthetic */ <VM extends j0> A<VM> b(ComponentActivity componentActivity, X2.a<? extends R.a> aVar, X2.a<? extends m0.b> aVar2) {
        F.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        F.y(4, "VM");
        return new l0(N.d(j0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    public static /* synthetic */ A c(ComponentActivity componentActivity, X2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        F.p(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        F.y(4, "VM");
        return new l0(N.d(j0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ A d(ComponentActivity componentActivity, X2.a aVar, X2.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar2 = null;
        }
        F.p(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        F.y(4, "VM");
        return new l0(N.d(j0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}

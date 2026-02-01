package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.m0;

/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt {
    @androidx.annotation.K
    public static final /* synthetic */ <VM extends androidx.lifecycle.j0> kotlin.A<VM> c(Fragment fragment, @androidx.annotation.D int i4, X2.a<? extends m0.b> aVar) {
        kotlin.A a4;
        kotlin.jvm.internal.F.p(fragment, "<this>");
        a4 = kotlin.C.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i4));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(a4);
        kotlin.jvm.internal.F.y(4, "VM");
        return FragmentViewModelLazyKt.c(fragment, kotlin.jvm.internal.N.d(androidx.lifecycle.j0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, a4));
    }

    @androidx.annotation.K
    public static final /* synthetic */ <VM extends androidx.lifecycle.j0> kotlin.A<VM> d(Fragment fragment, String navGraphRoute, X2.a<? extends m0.b> aVar) {
        kotlin.A a4;
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(navGraphRoute, "navGraphRoute");
        a4 = kotlin.C.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(a4);
        kotlin.jvm.internal.F.y(4, "VM");
        return FragmentViewModelLazyKt.c(fragment, kotlin.jvm.internal.N.d(androidx.lifecycle.j0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, new NavGraphViewModelLazyKt$navGraphViewModels$2(aVar, a4));
    }

    public static /* synthetic */ kotlin.A e(Fragment fragment, int i4, X2.a aVar, int i5, Object obj) {
        kotlin.A a4;
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.F.p(fragment, "<this>");
        a4 = kotlin.C.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i4));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(a4);
        kotlin.jvm.internal.F.y(4, "VM");
        return FragmentViewModelLazyKt.c(fragment, kotlin.jvm.internal.N.d(androidx.lifecycle.j0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, new NavGraphViewModelLazyKt$navGraphViewModels$1(aVar, a4));
    }

    public static /* synthetic */ kotlin.A f(Fragment fragment, String navGraphRoute, X2.a aVar, int i4, Object obj) {
        kotlin.A a4;
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(navGraphRoute, "navGraphRoute");
        a4 = kotlin.C.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$4(fragment, navGraphRoute));
        NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(a4);
        kotlin.jvm.internal.F.y(4, "VM");
        return FragmentViewModelLazyKt.c(fragment, kotlin.jvm.internal.N.d(androidx.lifecycle.j0.class), navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, new NavGraphViewModelLazyKt$navGraphViewModels$2(aVar, a4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r g(kotlin.A<r> a4) {
        return a4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r h(kotlin.A<r> a4) {
        return a4.getValue();
    }
}

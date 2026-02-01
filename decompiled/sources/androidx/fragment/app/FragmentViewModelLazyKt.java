package androidx.fragment.app;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Lambda implements X2.a<m0.b> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Fragment f15157F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Fragment fragment) {
            super(0);
            this.f15157F = fragment;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0.b n() {
            m0.b defaultViewModelProviderFactory = this.f15157F.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.F.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @androidx.annotation.K
    public static final /* synthetic */ <VM extends j0> kotlin.A<VM> a(Fragment fragment, X2.a<? extends m0.b> aVar) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.y(4, "VM");
        kotlin.reflect.d d4 = kotlin.jvm.internal.N.d(j0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return c(fragment, d4, fragmentViewModelLazyKt$activityViewModels$1, aVar);
    }

    public static /* synthetic */ kotlin.A b(Fragment fragment, X2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.y(4, "VM");
        kotlin.reflect.d d4 = kotlin.jvm.internal.N.d(j0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return c(fragment, d4, fragmentViewModelLazyKt$activityViewModels$1, aVar);
    }

    @l3.d
    @androidx.annotation.K
    public static final <VM extends j0> kotlin.A<VM> c(@l3.d Fragment fragment, @l3.d kotlin.reflect.d<VM> viewModelClass, @l3.d X2.a<? extends p0> storeProducer, @l3.e X2.a<? extends m0.b> aVar) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.F.p(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new a(fragment);
        }
        return new l0(viewModelClass, storeProducer, aVar);
    }

    public static /* synthetic */ kotlin.A d(Fragment fragment, kotlin.reflect.d dVar, X2.a aVar, X2.a aVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            aVar2 = null;
        }
        return c(fragment, dVar, aVar, aVar2);
    }

    @androidx.annotation.K
    public static final /* synthetic */ <VM extends j0> kotlin.A<VM> e(Fragment fragment, X2.a<? extends q0> ownerProducer, X2.a<? extends m0.b> aVar) {
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.F.y(4, "VM");
        kotlin.reflect.d d4 = kotlin.jvm.internal.N.d(j0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(ownerProducer);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$3(ownerProducer, fragment);
        }
        return c(fragment, d4, fragmentViewModelLazyKt$viewModels$2, aVar);
    }

    public static /* synthetic */ kotlin.A f(final Fragment fragment, X2.a ownerProducer, X2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            ownerProducer = new X2.a<Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$1
                {
                    super(0);
                }

                @Override // X2.a
                @l3.d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Fragment n() {
                    return Fragment.this;
                }
            };
        }
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.F.p(fragment, "<this>");
        kotlin.jvm.internal.F.p(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.F.y(4, "VM");
        kotlin.reflect.d d4 = kotlin.jvm.internal.N.d(j0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(ownerProducer);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$viewModels$3(ownerProducer, fragment);
        }
        return c(fragment, d4, fragmentViewModelLazyKt$viewModels$2, aVar);
    }
}

package com.harman.jbl.partybox;

import android.content.Context;
import androidx.annotation.K;
import androidx.appcompat.app.ActivityC0587e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import kotlin.A;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;

/* loaded from: classes2.dex */
public final class ApplicationViewModelLazyKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.a<m0.b> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ ActivityC0587e f38228F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ActivityC0587e activityC0587e) {
            super(0);
            this.f38228F = activityC0587e;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0.b n() {
            Context applicationContext = this.f38228F.getApplicationContext();
            F.n(applicationContext, "null cannot be cast to non-null type com.harman.jbl.partybox.BaseViewModelApplication");
            return ((d) applicationContext).getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.a<m0.b> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Fragment f38233F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Fragment fragment) {
            super(0);
            this.f38233F = fragment;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m0.b n() {
            Context applicationContext = this.f38233F.requireActivity().getApplicationContext();
            F.n(applicationContext, "null cannot be cast to non-null type com.harman.jbl.partybox.BaseViewModelApplication");
            return ((d) applicationContext).getDefaultViewModelProviderFactory();
        }
    }

    @K
    public static final /* synthetic */ <VM extends j0> A<VM> a(ActivityC0587e activityC0587e, X2.a<? extends m0.b> aVar) {
        F.p(activityC0587e, "<this>");
        F.y(4, "VM");
        kotlin.reflect.d d4 = N.d(j0.class);
        ApplicationViewModelLazyKt$applicationViewModels$1 applicationViewModelLazyKt$applicationViewModels$1 = new ApplicationViewModelLazyKt$applicationViewModels$1(activityC0587e);
        if (aVar == null) {
            aVar = new ApplicationViewModelLazyKt$applicationViewModels$2(activityC0587e);
        }
        return e(activityC0587e, d4, applicationViewModelLazyKt$applicationViewModels$1, aVar);
    }

    @K
    public static final /* synthetic */ <VM extends j0> A<VM> b(Fragment fragment, X2.a<? extends m0.b> aVar) {
        F.p(fragment, "<this>");
        F.y(4, "VM");
        kotlin.reflect.d d4 = N.d(j0.class);
        ApplicationViewModelLazyKt$applicationViewModels$3 applicationViewModelLazyKt$applicationViewModels$3 = new ApplicationViewModelLazyKt$applicationViewModels$3(fragment);
        if (aVar == null) {
            aVar = new ApplicationViewModelLazyKt$applicationViewModels$4(fragment);
        }
        return f(fragment, d4, applicationViewModelLazyKt$applicationViewModels$3, aVar);
    }

    public static /* synthetic */ A c(ActivityC0587e activityC0587e, X2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        F.p(activityC0587e, "<this>");
        F.y(4, "VM");
        kotlin.reflect.d d4 = N.d(j0.class);
        ApplicationViewModelLazyKt$applicationViewModels$1 applicationViewModelLazyKt$applicationViewModels$1 = new ApplicationViewModelLazyKt$applicationViewModels$1(activityC0587e);
        if (aVar == null) {
            aVar = new ApplicationViewModelLazyKt$applicationViewModels$2(activityC0587e);
        }
        return e(activityC0587e, d4, applicationViewModelLazyKt$applicationViewModels$1, aVar);
    }

    public static /* synthetic */ A d(Fragment fragment, X2.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        F.p(fragment, "<this>");
        F.y(4, "VM");
        kotlin.reflect.d d4 = N.d(j0.class);
        ApplicationViewModelLazyKt$applicationViewModels$3 applicationViewModelLazyKt$applicationViewModels$3 = new ApplicationViewModelLazyKt$applicationViewModels$3(fragment);
        if (aVar == null) {
            aVar = new ApplicationViewModelLazyKt$applicationViewModels$4(fragment);
        }
        return f(fragment, d4, applicationViewModelLazyKt$applicationViewModels$3, aVar);
    }

    @l3.d
    @K
    public static final <VM extends j0> A<VM> e(@l3.d ActivityC0587e activityC0587e, @l3.d kotlin.reflect.d<VM> viewModelClass, @l3.d X2.a<? extends p0> storeProducer, @l3.e X2.a<? extends m0.b> aVar) {
        F.p(activityC0587e, "<this>");
        F.p(viewModelClass, "viewModelClass");
        F.p(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new a(activityC0587e);
        }
        return new l0(viewModelClass, storeProducer, aVar, null, 8, null);
    }

    @l3.d
    @K
    public static final <VM extends j0> A<VM> f(@l3.d Fragment fragment, @l3.d kotlin.reflect.d<VM> viewModelClass, @l3.d X2.a<? extends p0> storeProducer, @l3.e X2.a<? extends m0.b> aVar) {
        F.p(fragment, "<this>");
        F.p(viewModelClass, "viewModelClass");
        F.p(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new b(fragment);
        }
        return new l0(viewModelClass, storeProducer, aVar, null, 8, null);
    }

    public static /* synthetic */ A g(ActivityC0587e activityC0587e, kotlin.reflect.d dVar, X2.a aVar, X2.a aVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            aVar2 = null;
        }
        return e(activityC0587e, dVar, aVar, aVar2);
    }

    public static /* synthetic */ A h(Fragment fragment, kotlin.reflect.d dVar, X2.a aVar, X2.a aVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            aVar2 = null;
        }
        return f(fragment, dVar, aVar, aVar2);
    }
}

package com.harman.jbl.partybox.ui.feedback.view;

import X2.l;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.Q;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1912o0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/harman/jbl/partybox/ui/feedback/view/FeedbackSuccessFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/o0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/o0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nFeedbackSuccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackSuccessFragment.kt\ncom/harman/jbl/partybox/ui/feedback/view/FeedbackSuccessFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,60:1\n66#2,4:61\n*S KotlinDebug\n*F\n+ 1 FeedbackSuccessFragment.kt\ncom/harman/jbl/partybox/ui/feedback/view/FeedbackSuccessFragment\n*L\n16#1:61,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FeedbackSuccessFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "FeedbackSuccessFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43673Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43674R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43672S0 = {N.u(new PropertyReference1Impl(FeedbackSuccessFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentFeedbacksuccessBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1912o0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43675N = new b();

        b() {
            super(1, C1912o0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentFeedbacksuccessBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1912o0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1912o0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements l<UiPage, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f43676F = new c();

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43677a;

            static {
                int[] iArr = new int[UiPage.values().length];
                try {
                    iArr[UiPage.DISCOVERY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f43677a = iArr;
            }
        }

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(UiPage uiPage) {
            c(uiPage);
            return H0.f51801a;
        }

        public final void c(UiPage uiPage) {
            if (uiPage != null) {
                T1.a.a("BLE_LOG FeedbackSuccessFragment updateUiPage and page is : " + uiPage);
                int i4 = a.f43677a[uiPage.ordinal()];
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43678a;

        d(l function) {
            F.p(function, "function");
            this.f43678a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43678a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43678a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public FeedbackSuccessFragment() {
        super(j.i.f41487e0);
        this.f43673Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43675N);
        this.f43674R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final C1912o0 q0() {
        return (C1912o0) this.f43673Q0.a(this, f43672S0[0]);
    }

    private final o r0() {
        return (o) this.f43674R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(FeedbackSuccessFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(FeedbackSuccessFragment this$0, View view) {
        F.p(this$0, "this$0");
        ActivityC0889g activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        T1.a.a("BLE_LOG FeedbackSuccessFragment onViewCreated ");
        super.onViewCreated(view, bundle);
        q0().f39922H.f38735H.setText(getString(j.m.l7));
        C1912o0 q02 = q0();
        q02.f39922H.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.feedback.view.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeedbackSuccessFragment.s0(FeedbackSuccessFragment.this, view2);
            }
        });
        q02.f39920F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.feedback.view.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FeedbackSuccessFragment.t0(FeedbackSuccessFragment.this, view2);
            }
        });
        r0().G1().k(getViewLifecycleOwner(), new d(c.f43676F));
    }
}

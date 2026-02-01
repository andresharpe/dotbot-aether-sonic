package com.harman.jbl.partybox.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.databinding.AbstractC1935t;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.DashboardBannerViewModel;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import java.util.Arrays;
import kotlin.InterfaceC2229v;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@kotlin.E(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00018B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b5\u00106J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020$0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0019\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020$0+8F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020$0+8F¢\u0006\u0006\u001a\u0004\b1\u0010-R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020$0+8F¢\u0006\u0006\u001a\u0004\b3\u0010-¨\u00069"}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerDialogFragment;", "Lcom/harman/jbl/partybox/ui/dashboard/BaseBottomSheetDialogFragment;", "Lcom/harman/jbl/partybox/ui/party/stereo/g;", "Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel$EnumBannerStyle;", "style", "Lkotlin/H0;", "r0", "(Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel$EnumBannerStyle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onUnGroupClick", "()V", "onCloseBtnClick", "Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment;", "k1", "Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment;", "stageDashboardFragment", "Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel;", "l1", "Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel;", "viewModel", "Landroidx/lifecycle/P;", "", "m1", "Landroidx/lifecycle/P;", "_title", "", "n1", "_layoutSetUpOtherProductVisible", "o1", "_layoutGroupProductsVisible", "p1", "_layoutTurnOffAuracastVisible", "Landroidx/lifecycle/LiveData;", "getTitle", "()Landroidx/lifecycle/LiveData;", "title", "getLayoutSetUpOtherProductVisible", "layoutSetUpOtherProductVisible", "getLayoutGroupProductsVisible", "layoutGroupProductsVisible", "getLayoutTurnOffAuracastVisible", "layoutTurnOffAuracastVisible", "<init>", "(Lcom/harman/jbl/partybox/ui/dashboard/StageDashboardFragment;Lcom/harman/jbl/partybox/ui/dashboard/DashboardBannerViewModel;)V", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DashboardBannerDialogFragment extends BaseBottomSheetDialogFragment implements com.harman.jbl.partybox.ui.party.stereo.g {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: q1, reason: collision with root package name */
    @l3.d
    private static final String f42870q1 = "OneProductMissingTipsDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final StageDashboardFragment f42871k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final DashboardBannerViewModel f42872l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<String> f42873m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42874n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42875o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.P<Boolean> f42876p1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42877a;

        static {
            int[] iArr = new int[DashboardBannerViewModel.EnumBannerStyle.values().length];
            try {
                iArr[DashboardBannerViewModel.EnumBannerStyle.HOW_TO_FIND_THE_OTHER_SPEAKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DashboardBannerViewModel.EnumBannerStyle.HOW_TO_SWITCH_TO_STEREO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42877a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.DashboardBannerDialogFragment$onUnGroupClick$2", f = "DashboardBannerDialogFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super kotlin.H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42878I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ PartyBoxDevice f42880K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(PartyBoxDevice partyBoxDevice, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f42880K = partyBoxDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            HmDevice hmDevice;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f42878I;
            if (i4 != 0) {
                if (i4 == 1) {
                    kotlin.W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.W.n(obj);
                StageDashboardFragment stageDashboardFragment = DashboardBannerDialogFragment.this.f42871k1;
                PartyBoxDevice partyBoxDevice = this.f42880K;
                com.harman.jbl.partybox.ui.party.stereo.D d4 = com.harman.jbl.partybox.ui.party.stereo.D.f45020a;
                if (d4.l(partyBoxDevice)) {
                    hmDevice = d4.g(this.f42880K);
                } else {
                    hmDevice = null;
                }
                this.f42878I = 1;
                obj = stageDashboardFragment.onUngroupBtnClick(partyBoxDevice, hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                com.harman.log.f.a(DashboardBannerDialogFragment.f42870q1, "onUnGroupClick() >>> UnGroup Success");
                DashboardBannerDialogFragment.this.dismiss();
                DashboardBannerDialogFragment.this.f42871k1.onUnGroupSuccess(this.f42880K);
            }
            return kotlin.H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super kotlin.H0> cVar) {
            return ((c) v(u3, cVar)).D(kotlin.H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<kotlin.H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f42880K, cVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<DashboardBannerViewModel.EnumBannerStyle, kotlin.H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ kotlin.H0 C(DashboardBannerViewModel.EnumBannerStyle enumBannerStyle) {
            c(enumBannerStyle);
            return kotlin.H0.f51801a;
        }

        public final void c(DashboardBannerViewModel.EnumBannerStyle enumBannerStyle) {
            DashboardBannerDialogFragment dashboardBannerDialogFragment = DashboardBannerDialogFragment.this;
            kotlin.jvm.internal.F.m(enumBannerStyle);
            dashboardBannerDialogFragment.r0(enumBannerStyle);
        }
    }

    /* loaded from: classes2.dex */
    static final class e implements androidx.lifecycle.Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f42882a;

        e(X2.l function) {
            kotlin.jvm.internal.F.p(function, "function");
            this.f42882a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f42882a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof androidx.lifecycle.Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return kotlin.jvm.internal.F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f42882a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public DashboardBannerDialogFragment(@l3.d StageDashboardFragment stageDashboardFragment, @l3.d DashboardBannerViewModel viewModel) {
        kotlin.jvm.internal.F.p(stageDashboardFragment, "stageDashboardFragment");
        kotlin.jvm.internal.F.p(viewModel, "viewModel");
        this.f42871k1 = stageDashboardFragment;
        this.f42872l1 = viewModel;
        this.f42873m1 = new androidx.lifecycle.P<>();
        this.f42874n1 = new androidx.lifecycle.P<>();
        this.f42875o1 = new androidx.lifecycle.P<>();
        this.f42876p1 = new androidx.lifecycle.P<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.K
    public final void r0(DashboardBannerViewModel.EnumBannerStyle enumBannerStyle) {
        int i4 = b.f42877a[enumBannerStyle.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                this.f42873m1.r(getResources().getString(j.m.f41694S0));
                androidx.lifecycle.P<Boolean> p4 = this.f42874n1;
                Boolean bool = Boolean.FALSE;
                p4.r(bool);
                this.f42875o1.r(bool);
                this.f42876p1.r(Boolean.TRUE);
                return;
            }
            return;
        }
        this.f42873m1.r(getResources().getString(j.m.f41690R0));
        androidx.lifecycle.P<Boolean> p5 = this.f42874n1;
        Boolean bool2 = Boolean.TRUE;
        p5.r(bool2);
        this.f42875o1.r(bool2);
        this.f42876p1.r(Boolean.FALSE);
    }

    @l3.d
    public final LiveData<Boolean> getLayoutGroupProductsVisible() {
        return this.f42875o1;
    }

    @l3.d
    public final LiveData<Boolean> getLayoutSetUpOtherProductVisible() {
        return this.f42874n1;
    }

    @l3.d
    public final LiveData<Boolean> getLayoutTurnOffAuracastVisible() {
        return this.f42876p1;
    }

    @l3.d
    public final LiveData<String> getTitle() {
        return this.f42873m1;
    }

    public final void onCloseBtnClick() {
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(inflater, "inflater");
        AbstractC1935t u12 = AbstractC1935t.u1(inflater, viewGroup, false);
        kotlin.jvm.internal.F.o(u12, "inflate(...)");
        u12.M0(this);
        u12.x1(this);
        u12.y1(this);
        u12.z1(this.f42872l1);
        HmCustomFontTextView hmCustomFontTextView = u12.f40142s0;
        kotlin.jvm.internal.W w3 = kotlin.jvm.internal.W.f52310a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{getString(j.m.A5), getString(j.m.m5)}, 2));
        kotlin.jvm.internal.F.o(format, "format(...)");
        hmCustomFontTextView.setText(format);
        View d4 = u12.d();
        kotlin.jvm.internal.F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // com.harman.jbl.partybox.ui.party.stereo.g
    public void onUnGroupClick() {
        String str;
        PartyBoxDevice f4 = this.f42872l1.u().f();
        if (f4 != null) {
            str = com.harman.jbl.partybox.ui.party.b.f44881a.t(f4);
        } else {
            str = null;
        }
        com.harman.log.f.a(f42870q1, "onUnGroupClick() >>> mainDevice[" + str + "]");
        if (f4 != null) {
            C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new c(f4, null), 2, null);
        } else {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        this.f42872l1.v().k(this, new e(new d()));
    }
}

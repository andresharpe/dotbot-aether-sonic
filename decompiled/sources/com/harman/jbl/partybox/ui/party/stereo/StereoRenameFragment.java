package com.harman.jbl.partybox.ui.party.stereo;

import N0.a;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0937n;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.AbstractC1898l1;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoRenameFromPage;
import com.harman.jbl.partybox.ui.party.stereo.ui.DevRenameDialog;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B\u0007¢\u0006\u0004\b<\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0005J\u0019\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u0005J\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u00103R\u0017\u00109\u001a\b\u0012\u0004\u0012\u000206058F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006058F¢\u0006\u0006\u001a\u0004\b:\u00108¨\u0006?"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/StereoRenameFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/a;", "Lkotlin/H0;", "s0", "()V", "", "tag", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "handleOnBackPressed", "onBtnBackClick", "onRenameClick", a.C0015a.f1688b, "onNameChanged", "(Ljava/lang/String;)V", "onRenameConfirmed", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/party/stereo/w;", "Q0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/party/stereo/w;", "stereoRenameViewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "p0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/party/stereo/t;", "S0", "Landroidx/navigation/n;", "o0", "()Lcom/harman/jbl/partybox/ui/party/stereo/t;", "args", "Lcom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog;", "T0", "q0", "()Lcom/harman/jbl/partybox/ui/party/stereo/ui/DevRenameDialog;", "renameDialog", "Landroidx/lifecycle/LiveData;", "", "getBtnBackVisible", "()Landroidx/lifecycle/LiveData;", "btnBackVisible", "getTitleText", "titleText", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nStereoRenameFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StereoRenameFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoRenameFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,143:1\n56#2,10:144\n66#3,4:154\n42#4,3:158\n*S KotlinDebug\n*F\n+ 1 StereoRenameFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/StereoRenameFragment\n*L\n37#1:144,10\n39#1:154,4\n41#1:158,3\n*E\n"})
/* loaded from: classes2.dex */
public final class StereoRenameFragment extends BackDispatcherFragment implements com.harman.jbl.partybox.ui.party.stereo.ui.a {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private static final String f45140U0 = "Stereo.RenameFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45141Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45142R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final C0937n f45143S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45144T0;

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
        public static final /* synthetic */ int[] f45150a;

        static {
            int[] iArr = new int[EnumStereoRenameFromPage.values().length];
            try {
                iArr[EnumStereoRenameFromPage.STEREO_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumStereoRenameFromPage.GROUP_SETTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45150a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<EnumStereoRenameFromPage, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f45151F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d EnumStereoRenameFromPage enumStereoRenameFromPage) {
            F.p(enumStereoRenameFromPage, "enum");
            return Boolean.valueOf(enumStereoRenameFromPage.e());
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<H0> {
        d() {
            super(0);
        }

        public final void c() {
            com.harman.log.f.a(StereoRenameFragment.f45140U0, "onNameChanged() >>> ");
            StereoRenameFragment.this.s0();
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class e extends Lambda implements X2.a<DevRenameDialog> {

        /* renamed from: F, reason: collision with root package name */
        public static final e f45153F = new e();

        e() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final DevRenameDialog n() {
            return new DevRenameDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<EnumStereoRenameFromPage, String> {
        f() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String C(@l3.d EnumStereoRenameFromPage enumStereoRenameFromPage) {
            F.p(enumStereoRenameFromPage, "enum");
            String string = StereoRenameFragment.this.getResources().getString(enumStereoRenameFromPage.j());
            F.o(string, "getString(...)");
            return string;
        }
    }

    public StereoRenameFragment() {
        kotlin.A a4;
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment$special$$inlined$viewModels$default$1
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
        this.f45141Q0 = FragmentViewModelLazyKt.c(this, N.d(w.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f45142R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f45143S0 = new C0937n(N.d(t.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.stereo.StereoRenameFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Bundle n() {
                Bundle arguments = Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
            }
        });
        a4 = kotlin.C.a(e.f45153F);
        this.f45144T0 = a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final t o0() {
        return (t) this.f45143S0.getValue();
    }

    private final com.harman.jbl.partybox.ui.main.o p0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f45142R0.getValue();
    }

    private final DevRenameDialog q0() {
        return (DevRenameDialog) this.f45144T0.getValue();
    }

    private final w r0() {
        return (w) this.f45141Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        com.harman.log.f.a(f45140U0, "popToStageDashboard() >>> ");
        p0().y2();
        I a4 = q.a();
        F.o(a4, "toStageDashboardFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, a4);
    }

    @l3.d
    public final LiveData<Boolean> getBtnBackVisible() {
        return h0.b(r0().w(), c.f45151F);
    }

    @l3.d
    public final LiveData<String> getTitleText() {
        return h0.b(r0().w(), new f());
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void onBtnBackClick() {
        int i4;
        EnumStereoRenameFromPage f4 = r0().w().f();
        if (f4 == null) {
            i4 = -1;
        } else {
            i4 = b.f45150a[f4.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                s0();
                return;
            } else {
                androidx.navigation.fragment.f.a(this).t0();
                return;
            }
        }
        s0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        r0().u(o0());
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1898l1 t12 = AbstractC1898l1.t1(inflater, viewGroup, false);
        F.o(t12, "inflate(...)");
        t12.w1(this);
        t12.x1(r0());
        t12.M0(this);
        View d4 = t12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void onMainDeviceA2DPDisconnected(@l3.d UiPage page) {
        F.p(page, "page");
        com.harman.log.f.a(f45140U0, "onMainDeviceA2DPDisconnected() >>> page[" + page.name() + "]");
    }

    @Override // com.harman.jbl.partybox.ui.party.stereo.ui.a
    public void onNameChanged(@l3.e String str) {
        r0().B(str, new d());
    }

    public final void onRenameClick() {
        Dialog dialog = q0().getDialog();
        if (dialog == null || true != dialog.isShowing()) {
            q0().show(getChildFragmentManager().q().B(q0()), f45140U0);
            q0().initParams(r0().z().f(), r0().x().f());
            q0().setNameChangeListener(this);
        }
    }

    public final void onRenameConfirmed() {
        com.harman.log.f.a(f45140U0, "onRenameConfirmed() >>> ");
        s0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    @l3.d
    public String tag() {
        return f45140U0;
    }
}

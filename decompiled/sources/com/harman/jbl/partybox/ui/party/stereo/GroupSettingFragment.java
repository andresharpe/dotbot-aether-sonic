package com.harman.jbl.partybox.ui.party.stereo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.C0937n;
import com.harman.jbl.partybox.databinding.AbstractC1922q0;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.party.stereo.C2033d;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoChannelFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoRenameFromPage;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.EnumSyncOnOff;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/stereo/GroupSettingFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "", "tag", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/H0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "handleOnBackPressed", "()V", "onBtnBackClick", "onChannelAssignmentClick", "onRenameThisGroupClick", "Lcom/harman/jbl/partybox/ui/dashboard/UiPage;", "page", "onMainDeviceA2DPDisconnected", "(Lcom/harman/jbl/partybox/ui/dashboard/UiPage;)V", "Lcom/harman/jbl/partybox/ui/party/stereo/a;", "Q0", "Landroidx/navigation/n;", "o0", "()Lcom/harman/jbl/partybox/ui/party/stereo/a;", "args", "Lcom/harman/jbl/partybox/ui/party/stereo/f;", "R0", "Lkotlin/A;", "p0", "()Lcom/harman/jbl/partybox/ui/party/stereo/f;", "viewModel", "Landroidx/lifecycle/N;", "Lcom/harman/sdk/utils/EnumSyncOnOff;", "S0", "Landroidx/lifecycle/N;", "getSyncOnOffState", "()Landroidx/lifecycle/N;", "syncOnOffState", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nGroupSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupSettingFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,114:1\n42#2,3:115\n56#3,10:118\n*S KotlinDebug\n*F\n+ 1 GroupSettingFragment.kt\ncom/harman/jbl/partybox/ui/party/stereo/GroupSettingFragment\n*L\n32#1:115,3\n34#1:118,10\n*E\n"})
/* loaded from: classes2.dex */
public final class GroupSettingFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f45027T0 = "Stereo.GroupSettingFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final C0937n f45028Q0 = new C0937n(N.d(C2030a.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment$special$$inlined$navArgs$1
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

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f45029R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final androidx.lifecycle.N<EnumSyncOnOff> f45030S0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<HmDevice, H0> {
        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(HmDevice hmDevice) {
            c(hmDevice);
            return H0.f51801a;
        }

        public final void c(@l3.d HmDevice device) {
            F.p(device, "device");
            GroupSettingFragment.this.getSyncOnOffState().r(device.L());
        }
    }

    /* loaded from: classes2.dex */
    static final class c implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f45037a;

        c(X2.l function) {
            F.p(function, "function");
            this.f45037a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45037a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45037a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public GroupSettingFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment$special$$inlined$viewModels$default$1
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
        this.f45029R0 = FragmentViewModelLazyKt.c(this, N.d(f.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.party.stereo.GroupSettingFragment$special$$inlined$viewModels$default$3
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
        this.f45030S0 = new androidx.lifecycle.N<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C2030a o0() {
        return (C2030a) this.f45028Q0.getValue();
    }

    private final f p0() {
        return (f) this.f45029R0.getValue();
    }

    @l3.d
    public final androidx.lifecycle.N<EnumSyncOnOff> getSyncOnOffState() {
        return this.f45030S0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).t0();
    }

    public final void onChannelAssignmentClick() {
        C2033d.a b4 = C2033d.b(o0().d(), o0().c(), EnumStereoType.STEREO.g(), EnumStereoChannelFromPage.GROUP_SETTING.g());
        F.o(b4, "toStereoChannelFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, b4);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        p0().w(o0());
        com.harman.jbl.partybox.ui.party.b.f44881a.l(this.f45030S0, p0().x(), new c(new b()));
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1922q0 s12 = AbstractC1922q0.s1(inflater, viewGroup, false);
        F.o(s12, "inflate(...)");
        s12.v1(this);
        s12.M0(this);
        View d4 = s12.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void onMainDeviceA2DPDisconnected(@l3.d UiPage page) {
        F.p(page, "page");
        com.harman.log.f.a(f45027T0, "onMainDeviceA2DPDisconnected() >>> page[" + page.name() + "]");
    }

    public final void onRenameThisGroupClick() {
        C2033d.b c4 = C2033d.c(o0().d(), o0().c(), EnumStereoRenameFromPage.GROUP_SETTING.i());
        F.o(c4, "toStereoRenameFragment(...)");
        com.harman.jbl.partybox.utils.q.f(this, c4);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    @l3.d
    public String tag() {
        return f45027T0;
    }
}

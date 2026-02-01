package com.harman.jbl.partybox.ui.ota;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.G3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@kotlin.E(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006$"}, d2 = {"Lcom/harman/jbl/partybox/ui/ota/HmUpgradeFailFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "t0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "Lcom/harman/jbl/partybox/databinding/G3;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/G3;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "", "S0", "Ljava/lang/String;", "devicePid", "T0", "deviceMid", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nHmUpgradeFailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HmUpgradeFailFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmUpgradeFailFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n66#2,4:102\n1#3:106\n*S KotlinDebug\n*F\n+ 1 HmUpgradeFailFragment.kt\ncom/harman/jbl/partybox/ui/ota/HmUpgradeFailFragment\n*L\n19#1:102,4\n*E\n"})
/* loaded from: classes2.dex */
public final class HmUpgradeFailFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "HmUpgradeFailFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f44468Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final kotlin.A f44469R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private String f44470S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f44471T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f44467U0 = {kotlin.jvm.internal.N.u(new PropertyReference1Impl(HmUpgradeFailFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/OtaFailedFragmentBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, G3> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f44472N = new b();

        b() {
            super(1, G3.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/OtaFailedFragmentBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final G3 C(@l3.d View p02) {
            kotlin.jvm.internal.F.p(p02, "p0");
            return G3.a(p02);
        }
    }

    public HmUpgradeFailFragment() {
        super(j.i.f41401I2);
        this.f44468Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f44472N);
        this.f44469R0 = ApplicationViewModelLazyKt.f(this, kotlin.jvm.internal.N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f44470S0 = "";
        this.f44471T0 = "";
    }

    private final G3 r0() {
        return (G3) this.f44468Q0.a(this, f44467U0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o s0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44469R0.getValue();
    }

    private final void t0() {
        if (com.harman.sdk.utils.d.H(this.f44470S0)) {
            androidx.navigation.I d4 = K.d();
            kotlin.jvm.internal.F.o(d4, "actionUpgradeFragmentToStageDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, d4);
        } else {
            androidx.navigation.I a4 = K.a();
            kotlin.jvm.internal.F.o(a4, "actionUpgradeFragmentToDashboardFragment(...)");
            com.harman.jbl.partybox.utils.q.f(this, a4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u0(HmUpgradeFailFragment this$0, View view, int i4, KeyEvent keyEvent) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        if (keyEvent.getAction() == 1 && i4 == 4) {
            T1.a.a(" BLE_LOG  HmUpgradeFailFragment back button clicked");
            this$0.t0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(HmUpgradeFailFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        T1.a.a(" BLE_LOG  HmUpgradeFailFragment back button clicked");
        this$0.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(HmUpgradeFailFragment this$0, View view) {
        kotlin.jvm.internal.F.p(this$0, "this$0");
        T1.a.a(" BLE_LOG  HmUpgradeFailFragment retry button clicked");
        this$0.t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        t0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        u uVar;
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            uVar = u.fromBundle(arguments);
        } else {
            uVar = null;
        }
        if (uVar != null) {
            str = uVar.e();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        this.f44470S0 = str;
        if (uVar != null) {
            str2 = uVar.d();
        }
        if (str2 != null) {
            str3 = str2;
        }
        this.f44471T0 = str3;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        requireView().setFocusableInTouchMode(true);
        requireView().requestFocus();
        requireView().setOnKeyListener(new View.OnKeyListener() { // from class: com.harman.jbl.partybox.ui.ota.B
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                boolean u02;
                u02 = HmUpgradeFailFragment.u0(HmUpgradeFailFragment.this, view, i4, keyEvent);
                return u02;
            }
        });
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        Integer num;
        kotlin.jvm.internal.F.p(view, "view");
        super.onViewCreated(view, bundle);
        G3 r02 = r0();
        r02.f38659F.f38735H.setText(getString(j.m.p4));
        r02.f38659F.f38734G.setVisibility(0);
        r02.f38659F.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HmUpgradeFailFragment.v0(HmUpgradeFailFragment.this, view2);
            }
        });
        if (this.f44470S0.length() > 0) {
            Context context = getContext();
            if (context != null) {
                num = Integer.valueOf(com.harman.sdk.utils.d.r(context, this.f44470S0, this.f44471T0));
            } else {
                num = null;
            }
            if (num != null) {
                r02.f38662I.setCenterImage(num.intValue());
            }
        }
        r02.f38665L.setVisibility(4);
        r02.f38667N.setText(j.m.F9);
        r02.f38666M.setText(j.m.w8);
        r02.f38663J.setText(j.m.a9);
        r02.f38663J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.ota.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HmUpgradeFailFragment.w0(HmUpgradeFailFragment.this, view2);
            }
        });
    }
}

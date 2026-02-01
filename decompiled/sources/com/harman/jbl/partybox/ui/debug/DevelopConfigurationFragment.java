package com.harman.jbl.partybox.ui.debug;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.harman.jbl.partybox.databinding.C1841a;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.E;
import kotlin.InterfaceC2205l;
import kotlin.jvm.internal.F;

@InterfaceC2205l(message = "user activity since new version 3.5.3")
@E(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/harman/jbl/partybox/ui/debug/DevelopConfigurationFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "u0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "onDestroy", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Q0", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mAutoOTATestListener", "R0", "mEnableAWSLogListener", "Lcom/harman/jbl/partybox/databinding/a;", "S0", "Lcom/harman/jbl/partybox/databinding/a;", "binding", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DevelopConfigurationFragment extends BackDispatcherFragment {

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f43361Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f43362R0;

    /* renamed from: S0, reason: collision with root package name */
    private C1841a f43363S0;

    public DevelopConfigurationFragment() {
        super(j.i.f41470a);
        this.f43361Q0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.debug.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DevelopConfigurationFragment.r0(DevelopConfigurationFragment.this, compoundButton, z3);
            }
        };
        this.f43362R0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.debug.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DevelopConfigurationFragment.s0(compoundButton, z3);
            }
        };
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(DevelopConfigurationFragment this$0, CompoundButton compoundButton, boolean z3) {
        PackageManager packageManager;
        String str;
        String str2;
        F.p(this$0, "this$0");
        com.harman.jbl.partybox.persistence.a.A("auto_ota_test", z3);
        Context context = this$0.getContext();
        String str3 = "";
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            Context context2 = this$0.getContext();
            if (context2 != null) {
                str = context2.getPackageName();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null && (str2 = packageInfo.versionName) != null) {
                str3 = str2;
            }
        }
        String str4 = str3 + ":0";
        if (z3) {
            str4 = str3 + ":1";
        }
        T1.a.a("BLE_LOG OTA Automation clicked and version name is " + str3 + " and isOTAAutomation : " + z3);
        com.harman.jbl.partybox.persistence.a.I(com.harman.jbl.partybox.persistence.a.f42071g, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(CompoundButton compoundButton, boolean z3) {
        com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.constants.a.f38383t, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(DevelopConfigurationFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    private final void u0() {
        C1841a c1841a = this.f43363S0;
        if (c1841a == null) {
            F.S("binding");
            c1841a = null;
        }
        c1841a.f39311F.setVisibility(8);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        C1841a c4 = C1841a.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        this.f43363S0 = c4;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        C1841a c1841a = this.f43363S0;
        if (c1841a == null) {
            F.S("binding");
            c1841a = null;
        }
        LinearLayout d4 = c1841a.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        L1.a.f1511O2 = false;
        super.onDestroy();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        boolean h4 = com.harman.jbl.partybox.persistence.a.h("auto_ota_test");
        C1841a c1841a = this.f43363S0;
        C1841a c1841a2 = null;
        if (c1841a == null) {
            F.S("binding");
            c1841a = null;
        }
        c1841a.f39312G.setChecked(h4);
        boolean h5 = com.harman.jbl.partybox.persistence.a.h(com.harman.jbl.partybox.constants.a.f38383t);
        C1841a c1841a3 = this.f43363S0;
        if (c1841a3 == null) {
            F.S("binding");
        } else {
            c1841a2 = c1841a3;
        }
        c1841a2.f39317L.setChecked(h5);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        C1841a c1841a = this.f43363S0;
        C1841a c1841a2 = null;
        if (c1841a == null) {
            F.S("binding");
            c1841a = null;
        }
        c1841a.f39312G.setOnCheckedChangeListener(this.f43361Q0);
        C1841a c1841a3 = this.f43363S0;
        if (c1841a3 == null) {
            F.S("binding");
            c1841a3 = null;
        }
        c1841a3.f39317L.setOnCheckedChangeListener(this.f43362R0);
        C1841a c1841a4 = this.f43363S0;
        if (c1841a4 == null) {
            F.S("binding");
        } else {
            c1841a2 = c1841a4;
        }
        c1841a2.f39315J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.debug.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DevelopConfigurationFragment.t0(DevelopConfigurationFragment.this, view2);
            }
        });
        u0();
    }
}

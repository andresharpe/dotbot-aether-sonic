package com.harman.jbl.partybox.ui.debug;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.appcompat.app.ActivityC0587e;
import com.harman.jbl.partybox.j;
import kotlin.E;
import kotlin.jvm.internal.F;

@E(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/harman/jbl/partybox/ui/debug/DevelopConfigActivity;", "Landroidx/appcompat/app/e;", "Lkotlin/H0;", "I0", "()V", "N0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onDestroy", "Landroid/view/View;", "h0", "Landroid/view/View;", "autoOtaContainer", "Landroid/widget/CheckBox;", "i0", "Landroid/widget/CheckBox;", "autoOtaTest", "j0", "enableAwsLogTest", "k0", "enableMac", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "l0", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "mAutoOTATestListener", "m0", "mEnableAWSLogListener", "n0", "mEnableMacListener", "<init>", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DevelopConfigActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    @l3.e
    private View f43354h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.e
    private CheckBox f43355i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.e
    private CheckBox f43356j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.e
    private CheckBox f43357k0;

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f43358l0;

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f43359m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    private final CompoundButton.OnCheckedChangeListener f43360n0;

    public DevelopConfigActivity() {
        super(j.i.f41470a);
        this.f43358l0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.debug.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DevelopConfigActivity.K0(DevelopConfigActivity.this, compoundButton, z3);
            }
        };
        this.f43359m0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.debug.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DevelopConfigActivity.L0(compoundButton, z3);
            }
        };
        this.f43360n0 = new CompoundButton.OnCheckedChangeListener() { // from class: com.harman.jbl.partybox.ui.debug.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                DevelopConfigActivity.M0(compoundButton, z3);
            }
        };
    }

    private final void I0() {
        this.f43354h0 = findViewById(j.h.f41240Z0);
        this.f43355i0 = (CheckBox) findViewById(j.h.f41245a1);
        this.f43356j0 = (CheckBox) findViewById(j.h.p4);
        this.f43357k0 = (CheckBox) findViewById(j.h.f41306m2);
        ((ImageView) findViewById(j.h.f41178J2)).setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.debug.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevelopConfigActivity.J0(DevelopConfigActivity.this, view);
            }
        });
        CheckBox checkBox = this.f43355i0;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(this.f43358l0);
        }
        CheckBox checkBox2 = this.f43356j0;
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(this.f43359m0);
        }
        CheckBox checkBox3 = this.f43357k0;
        if (checkBox3 != null) {
            checkBox3.setOnCheckedChangeListener(this.f43360n0);
        }
        N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(DevelopConfigActivity this$0, View view) {
        F.p(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(DevelopConfigActivity this$0, CompoundButton compoundButton, boolean z3) {
        String str;
        F.p(this$0, "this$0");
        com.harman.jbl.partybox.persistence.a.A("auto_ota_test", z3);
        PackageManager packageManager = this$0.getPackageManager();
        String str2 = "";
        if (packageManager != null) {
            String packageName = this$0.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            if (packageInfo != null && (str = packageInfo.versionName) != null) {
                str2 = str;
            }
        }
        String str3 = str2 + ":0";
        if (z3) {
            str3 = str2 + ":1";
        }
        T1.a.a("BLE_LOG OTA Automation clicked and version name is " + str2 + " and isOTAAutomation : " + z3);
        com.harman.jbl.partybox.persistence.a.I(com.harman.jbl.partybox.persistence.a.f42071g, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(CompoundButton compoundButton, boolean z3) {
        com.harman.jbl.partybox.persistence.a.A(com.harman.jbl.partybox.constants.a.f38383t, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(CompoundButton compoundButton, boolean z3) {
        com.harman.jbl.partybox.persistence.a.A("ENABLE_SHOW_MAC", z3);
    }

    private final void N0() {
        View view = this.f43354h0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        I0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        L1.a.f1511O2 = false;
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean h4 = com.harman.jbl.partybox.persistence.a.h("auto_ota_test");
        CheckBox checkBox = this.f43355i0;
        if (checkBox != null) {
            checkBox.setChecked(h4);
        }
        boolean h5 = com.harman.jbl.partybox.persistence.a.h(com.harman.jbl.partybox.constants.a.f38383t);
        CheckBox checkBox2 = this.f43356j0;
        if (checkBox2 != null) {
            checkBox2.setChecked(h5);
        }
        CheckBox checkBox3 = this.f43357k0;
        if (checkBox3 != null) {
            checkBox3.setChecked(com.harman.jbl.partybox.persistence.a.h("ENABLE_SHOW_MAC"));
        }
    }
}

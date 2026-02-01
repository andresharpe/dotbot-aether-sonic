package com.harman.jbl.partybox.ui.help;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.harman.jbl.partybox.databinding.C1961y0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J!\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/harman/jbl/partybox/ui/help/LaunchJblOneAppFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "v0", "s0", "q0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/y0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "r0", "()Lcom/harman/jbl/partybox/databinding/y0;", "binding", "", "R0", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "(Ljava/lang/String;)V", LaunchJblOneAppFragment.f43768U0, "", "S0", "I", "getAppLaunchSequenceNumber", "()I", "setAppLaunchSequenceNumber", "(I)V", "appLaunchSequenceNumber", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLaunchJblOneAppFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchJblOneAppFragment.kt\ncom/harman/jbl/partybox/ui/help/LaunchJblOneAppFragment\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,138:1\n37#2,2:139\n*S KotlinDebug\n*F\n+ 1 LaunchJblOneAppFragment.kt\ncom/harman/jbl/partybox/ui/help/LaunchJblOneAppFragment\n*L\n108#1:139,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LaunchJblOneAppFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "LaunchJblOneAppFragment";

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private static final String f43768U0 = "deviceName";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43769Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private String f43770R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f43771S0;

    /* renamed from: T0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43767T0 = {N.u(new PropertyReference1Impl(LaunchJblOneAppFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLaunchJblOneBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final LaunchJblOneAppFragment a() {
            return new LaunchJblOneAppFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, C1961y0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43772N = new b();

        b() {
            super(1, C1961y0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLaunchJblOneBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1961y0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1961y0.a(p02);
        }
    }

    public LaunchJblOneAppFragment() {
        super(j.i.f41523n0);
        this.f43769Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43772N);
        this.f43770R0 = "";
        this.f43771S0 = 1;
    }

    @W2.n
    @l3.d
    public static final LaunchJblOneAppFragment newInstance() {
        return Companion.a();
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q0() {
        /*
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = ""
            java.lang.String r3 = "KEY_APP_LAUNCH_SEQ_NUM_TIMESTAMP"
            java.lang.String r4 = com.harman.jbl.partybox.persistence.a.q(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "checkAndUpdateSequenceNumber Sequence number from Preference is  "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r10 = "LaunchJblOneAppFragment"
            com.harman.log.f.a(r10, r2)
            r2 = 1
            java.lang.String r11 = ":"
            r12 = 0
            if (r4 == 0) goto L55
            int r5 = r4.length()
            if (r5 <= 0) goto L55
            java.lang.String[] r5 = new java.lang.String[]{r11}
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            java.util.List r4 = kotlin.text.q.R4(r4, r5, r6, r7, r8, r9)
            java.lang.String[] r5 = new java.lang.String[r12]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r5 = r4.length
            r6 = 2
            if (r5 != r6) goto L55
            r5 = r4[r12]
            int r5 = java.lang.Integer.parseInt(r5)
            r13.f43771S0 = r5
            r4 = r4[r2]
            long r4 = java.lang.Long.parseLong(r4)
            goto L56
        L55:
            r4 = r0
        L56:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L95
            int r4 = r13.f43771S0
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L67
            r13.f43771S0 = r12
        L67:
            int r4 = r13.f43771S0
            int r4 = r4 + r2
            r13.f43771S0 = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r11)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "checkAndUpdateSequenceNumber : Its been more than 24 hrs, so increment the app launch sequence number to "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.harman.log.f.a(r10, r1)
            com.harman.jbl.partybox.persistence.a.I(r3, r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.LaunchJblOneAppFragment.q0():void");
    }

    private final C1961y0 r0() {
        return (C1961y0) this.f43769Q0.a(this, f43767T0[0]);
    }

    private final void s0() {
        q0();
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", "launch_jbl_one");
        bundle.putString(L1.a.f1655u, this.f43770R0);
        bundle.putInt(L1.a.u3, this.f43771S0);
        K1.a.a(L1.a.f1514P1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(LaunchJblOneAppFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(LaunchJblOneAppFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.s0();
        this$0.v0();
    }

    private final void v0() {
        try {
            try {
                startActivity(requireActivity().getPackageManager().getLaunchIntentForPackage("com.jbl.oneapp"));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.harman.jbl.partybox.constants.a.f38362i)));
            }
        } catch (Exception unused2) {
            if (requireActivity().getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.jbl.oneapp"));
                intent.setPackage("com.android.vending");
                startActivity(intent);
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.harman.jbl.partybox.constants.a.f38362i)));
            }
        }
    }

    public final int getAppLaunchSequenceNumber() {
        return this.f43771S0;
    }

    @l3.d
    public final String getDeviceName() {
        return this.f43770R0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        C1961y0 r02 = r0();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString(f43768U0);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        } else {
            F.m(str);
        }
        this.f43770R0 = str;
        r02.f40330G.setText(getString(j.m.f41675N1, getString(j.m.f41727a1), this.f43770R0));
        r02.f40333J.setText(getString(j.m.f41671M1) + " " + getString(j.m.f41727a1));
        r02.f40331H.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchJblOneAppFragment.t0(LaunchJblOneAppFragment.this, view2);
            }
        });
        r02.f40333J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LaunchJblOneAppFragment.u0(LaunchJblOneAppFragment.this, view2);
            }
        });
    }

    public final void setAppLaunchSequenceNumber(int i4) {
        this.f43771S0 = i4;
    }

    public final void setDeviceName(@l3.d String str) {
        F.p(str, "<set-?>");
        this.f43770R0 = str;
    }
}

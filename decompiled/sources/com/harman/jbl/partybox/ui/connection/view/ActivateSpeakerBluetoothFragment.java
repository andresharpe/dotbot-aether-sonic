package com.harman.jbl.partybox.ui.connection.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0937n;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.O0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.sdk.setting.ProductConfig;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J!\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/harman/jbl/partybox/ui/connection/view/ActivateSpeakerBluetoothFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "t0", "()V", "s0", "onBtnBackClick", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "handleOnBackPressed", "Lcom/harman/jbl/partybox/ui/main/o;", "Q0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/databinding/O0;", "R0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/O0;", "binding", "", "S0", "Z", ActivateSpeakerBluetoothFragment.f42336X0, "", "T0", "Ljava/lang/String;", "devicePid", "Lcom/harman/jbl/partybox/ui/connection/view/b;", "U0", "Landroidx/navigation/n;", "p0", "()Lcom/harman/jbl/partybox/ui/connection/view/b;", "args", "Lcom/harman/jbl/partybox/ui/connection/view/BTPairGuideDialogFragment;", "V0", "Lcom/harman/jbl/partybox/ui/connection/view/BTPairGuideDialogFragment;", "btPairGuideDialogFragment", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nActivateSpeakerBluetoothFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivateSpeakerBluetoothFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/ActivateSpeakerBluetoothFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n66#2,4:150\n42#3,3:154\n1#4:157\n*S KotlinDebug\n*F\n+ 1 ActivateSpeakerBluetoothFragment.kt\ncom/harman/jbl/partybox/ui/connection/view/ActivateSpeakerBluetoothFragment\n*L\n32#1:150,4\n37#1:154,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ActivateSpeakerBluetoothFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "ActivateSpeakerBluetoothFragment";

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private static final String f42336X0 = "isFromProductList";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final A f42337Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f42338R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f42339S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private String f42340T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final C0937n f42341U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.e
    private BTPairGuideDialogFragment f42342V0;

    /* renamed from: W0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f42335W0 = {N.u(new PropertyReference1Impl(ActivateSpeakerBluetoothFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPairSpeakerBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final ActivateSpeakerBluetoothFragment a(boolean z3) {
            ActivateSpeakerBluetoothFragment activateSpeakerBluetoothFragment = new ActivateSpeakerBluetoothFragment();
            activateSpeakerBluetoothFragment.setArguments(C0741d.b(C2122h0.a(ActivateSpeakerBluetoothFragment.f42336X0, Boolean.valueOf(z3))));
            return activateSpeakerBluetoothFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements X2.l<View, O0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f42344N = new b();

        b() {
            super(1, O0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPairSpeakerBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final O0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return O0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.a<H0> {
        c() {
            super(0);
        }

        public final void c() {
            ActivityInfo activityInfo;
            PackageManager packageManager;
            String str = ActivateSpeakerBluetoothFragment.this.f42340T0;
            if (str == null || str.length() == 0) {
                ActivateSpeakerBluetoothFragment.this.f42340T0 = "1f5d";
            }
            ProductConfig.ProductItem u3 = com.harman.sdk.utils.d.u(ActivateSpeakerBluetoothFragment.this.f42340T0);
            if (u3 != null) {
                String k4 = u3.k();
                F.o(k4, "getQsgUrl(...)");
                if (k4.length() > 0) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(u3.k()));
                    ActivityC0889g activity = ActivateSpeakerBluetoothFragment.this.getActivity();
                    if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                        activityInfo = intent.resolveActivityInfo(packageManager, 65536);
                    } else {
                        activityInfo = null;
                    }
                    if (activityInfo != null && activityInfo.exported) {
                        ActivateSpeakerBluetoothFragment.this.startActivity(intent);
                    }
                }
            }
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends ClickableSpan {
        d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@l3.d View widget) {
            F.p(widget, "widget");
            ActivateSpeakerBluetoothFragment.this.s0();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@l3.d TextPaint ds) {
            F.p(ds, "ds");
            ds.setUnderlineText(false);
        }
    }

    public ActivateSpeakerBluetoothFragment() {
        super(j.i.f41375C0);
        this.f42337Q0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f42338R0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f42344N);
        this.f42340T0 = "";
        this.f42341U0 = new C0937n(N.d(com.harman.jbl.partybox.ui.connection.view.b.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.connection.view.ActivateSpeakerBluetoothFragment$special$$inlined$navArgs$1
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
    }

    @W2.n
    @l3.d
    public static final ActivateSpeakerBluetoothFragment newInstance(boolean z3) {
        return Companion.a(z3);
    }

    private final void onBtnBackClick() {
        if (this.f42339S0) {
            T1.a.a("BLE_LOG ActivateSpeakerBluetoothFragment isFromProductList, so reset product list");
            r0().M2(true);
        }
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.harman.jbl.partybox.ui.connection.view.b p0() {
        return (com.harman.jbl.partybox.ui.connection.view.b) this.f42341U0.getValue();
    }

    private final O0 q0() {
        return (O0) this.f42338R0.a(this, f42335W0[0]);
    }

    private final com.harman.jbl.partybox.ui.main.o r0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f42337Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        Dialog dialog;
        BTPairGuideDialogFragment bTPairGuideDialogFragment = this.f42342V0;
        if (bTPairGuideDialogFragment == null || !bTPairGuideDialogFragment.isAdded()) {
            BTPairGuideDialogFragment bTPairGuideDialogFragment2 = this.f42342V0;
            if (bTPairGuideDialogFragment2 != null && (dialog = bTPairGuideDialogFragment2.getDialog()) != null && dialog.isShowing()) {
                return;
            }
            this.f42342V0 = new BTPairGuideDialogFragment(new c());
            Bundle bundle = new Bundle();
            bundle.putString("devicePid", this.f42340T0);
            BTPairGuideDialogFragment bTPairGuideDialogFragment3 = this.f42342V0;
            if (bTPairGuideDialogFragment3 != null) {
                bTPairGuideDialogFragment3.setArguments(bundle);
            }
            BTPairGuideDialogFragment bTPairGuideDialogFragment4 = this.f42342V0;
            if (bTPairGuideDialogFragment4 != null) {
                bTPairGuideDialogFragment4.show(getChildFragmentManager(), "BTPairGuideDialogFragment");
            }
        }
    }

    private final void t0() {
        int p32;
        int g32;
        ForegroundColorSpan foregroundColorSpan;
        Typeface typeface;
        O0 q02 = q0();
        q02.f38927H.f38735H.setText(getString(j.m.r4));
        q02.f38927H.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.connection.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivateSpeakerBluetoothFragment.u0(ActivateSpeakerBluetoothFragment.this, view);
            }
        });
        String string = getString(j.m.f41762h1);
        F.o(string, "getString(...)");
        CharSequence text = getText(j.m.c6);
        F.o(text, "getText(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        p32 = kotlin.text.A.p3(text, string, 0, false, 6, null);
        g32 = kotlin.text.A.g3(text);
        if (p32 != -1) {
            Context context = getContext();
            com.harman.jbl.partybox.ui.widget.i iVar = null;
            if (context != null) {
                foregroundColorSpan = new ForegroundColorSpan(context.getColor(j.d.f40725W0));
            } else {
                foregroundColorSpan = null;
            }
            int i4 = g32 + 1;
            spannableStringBuilder.setSpan(foregroundColorSpan, p32, i4, 33);
            Context context2 = getContext();
            if (context2 != null) {
                typeface = androidx.core.content.res.i.j(context2, j.g.f41133b);
            } else {
                typeface = null;
            }
            Context context3 = getContext();
            if (context3 != null) {
                F.m(context3);
                F.m(typeface);
                iVar = new com.harman.jbl.partybox.ui.widget.i(context3, typeface);
            }
            spannableStringBuilder.setSpan(iVar, p32, i4, 33);
            spannableStringBuilder.setSpan(new d(), p32, string.length() + p32, 33);
        }
        q02.f38932M.setText(spannableStringBuilder);
        q02.f38932M.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(ActivateSpeakerBluetoothFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BTPairGuideDialogFragment bTPairGuideDialogFragment = this.f42342V0;
        if (bTPairGuideDialogFragment != null && bTPairGuideDialogFragment != null) {
            bTPairGuideDialogFragment.dismiss();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        String d4 = p0().d();
        F.o(d4, "getPid(...)");
        this.f42340T0 = d4;
        boolean z3 = true;
        if (p0().c() != 1) {
            z3 = false;
        }
        this.f42339S0 = z3;
        com.harman.log.f.a(TAG, "BLE_LOG isFromProductList is " + z3 + ",devicePid:" + this.f42340T0);
        t0();
        r0().c3(false);
    }
}

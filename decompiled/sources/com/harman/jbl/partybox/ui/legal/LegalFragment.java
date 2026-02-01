package com.harman.jbl.partybox.ui.legal;

import X2.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0741d;
import androidx.core.os.C0743f;
import androidx.fragment.app.ActivityC0889g;
import androidx.navigation.I;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.B0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.utils.m;
import com.harman.jbl.partybox.utils.q;
import com.harman.legallib.LegalConfig;
import java.util.Locale;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import kotlin.text.z;

@E(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/harman/jbl/partybox/ui/legal/LegalFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onPrivacyTextClicked", "Lcom/harman/jbl/partybox/databinding/B0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "t0", "()Lcom/harman/jbl/partybox/databinding/B0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "u0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLegalFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegalFragment.kt\ncom/harman/jbl/partybox/ui/legal/LegalFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,112:1\n66#2,4:113\n262#3,2:117\n*S KotlinDebug\n*F\n+ 1 LegalFragment.kt\ncom/harman/jbl/partybox/ui/legal/LegalFragment\n*L\n29#1:113,4\n53#1:117,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LegalFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "LegalFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43905Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43906R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43904S0 = {N.u(new PropertyReference1Impl(LegalFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLegalBinding;", 0))};

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
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, B0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43907N = new b();

        b() {
            super(1, B0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLegalBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final B0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return B0.a(p02);
        }
    }

    public LegalFragment() {
        super(j.i.f41527o0);
        this.f43905Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43907N);
        this.f43906R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    private final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final B0 t0() {
        return (B0) this.f43905Q0.a(this, f43904S0[0]);
    }

    private final o u0() {
        return (o) this.f43906R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(LegalFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w0(LegalFragment this$0, View view) {
        F.p(this$0, "this$0");
        I a4 = f.a();
        F.o(a4, "actionLegalFragmentToEulaFragment(...)");
        q.f(this$0, a4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(LegalFragment this$0, View view) {
        F.p(this$0, "this$0");
        T1.a.a("BLE_LOG LegalFragment privacyContainer clicked ");
        this$0.onPrivacyTextClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(LegalFragment this$0, View view) {
        F.p(this$0, "this$0");
        I b4 = f.b();
        F.o(b4, "actionLegalFragmentToOpe…ourceLicenseFragment(...)");
        q.f(this$0, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(LegalFragment this$0, View view) {
        F.p(this$0, "this$0");
        androidx.navigation.fragment.f.a(this$0).X(j.h.yd, C0741d.b(C2122h0.a("loadUrl", "https://beian.miit.gov.cn/#/home")));
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    public final void onPrivacyTextClicked() {
        String str;
        boolean T22;
        boolean s22;
        try {
            Context context = getContext();
            if (context != null) {
                Locale d4 = C0743f.a(getResources().getConfiguration()).d(0);
                if (d4 != null) {
                    str = d4.getLanguage();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "en";
                } else {
                    F.m(str);
                }
                if (F.g(Locale.CHINESE.getLanguage(), str)) {
                    T1.a.a("BLE_LOG AgreementFragment It is CN language, so display Privacy content inside Privacy Policy Fragment");
                    I c4 = f.c();
                    F.o(c4, "actionLegalFragmentToPrivacyPolicyFragment(...)");
                    q.f(this, c4);
                    return;
                }
                T1.a.a("BLE_LOG AgreementFragment It is not CN language, so display Privacy content in a browser");
                com.harman.legallib.d dVar = com.harman.legallib.d.f47556a;
                LegalConfig.Type type = LegalConfig.Type.PRIVACY;
                m mVar = m.f46192a;
                Resources resources = context.getResources();
                F.o(resources, "getResources(...)");
                String k4 = dVar.k(context, type, mVar.c(resources));
                if (!TextUtils.isEmpty(k4)) {
                    T22 = kotlin.text.A.T2(k4, "\t", false, 2, null);
                    if (T22) {
                        k4 = z.i2(k4, "\t", "\t\t", false, 4, null);
                    }
                    s22 = z.s2(k4, "https", false, 2, null);
                    if (s22) {
                        T1.a.a("BLE_LOG AgreementFragment It is not CN language, ACTION_VIEW intent launched");
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(k4)));
                    } else {
                        T1.a.a("BLE_LOG AgreementFragment It is not CN language, but no url received, so display it in Text View");
                        I c5 = f.c();
                        F.o(c5, "actionLegalFragmentToPrivacyPolicyFragment(...)");
                        q.f(this, c5);
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            T1.a.a("BLE_LOG AgreementFragment Exception while displaying Privacy, so just show it in Textview");
            I c6 = f.c();
            F.o(c6, "actionLegalFragmentToPrivacyPolicyFragment(...)");
            q.f(this, c6);
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        T1.a.a("BLE_LOG LightShowButtonFragment onViewCreated ");
        super.onViewCreated(view, bundle);
        t0().f38479I.f38735H.setText(getString(j.m.V7));
        B0 t02 = t0();
        t02.f38479I.f38734G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LegalFragment.v0(LegalFragment.this, view2);
            }
        });
        t02.f38476F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LegalFragment.w0(LegalFragment.this, view2);
            }
        });
        t02.f38483M.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LegalFragment.x0(LegalFragment.this, view2);
            }
        });
        t02.f38480J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LegalFragment.y0(LegalFragment.this, view2);
            }
        });
        if (com.harman.jbl.partybox.utils.l.e(view.getContext())) {
            ConstraintLayout recordNumberContainer = t0().f38486P;
            F.o(recordNumberContainer, "recordNumberContainer");
            recordNumberContainer.setVisibility(0);
            t0().f38486P.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    LegalFragment.z0(LegalFragment.this, view2);
                }
            });
        }
    }
}

package com.harman.jbl.partybox.ui.policy;

import X2.l;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0889g;
import androidx.navigation.fragment.f;
import com.google.android.gms.common.internal.C1275t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1892k0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import com.harman.jbl.partybox.utils.h;
import com.harman.jbl.partybox.utils.m;
import com.harman.legallib.LegalConfig;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import l3.d;
import l3.e;

@E(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/harman/jbl/partybox/ui/policy/PrivacyPolicyFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "", C1275t.f28813a, FirebaseAnalytics.b.f34769P, "r0", "(Ljava/lang/String;Ljava/lang/String;)V", "t0", "(Ljava/lang/String;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/k0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/k0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "q0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPrivacyPolicyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyPolicyFragment.kt\ncom/harman/jbl/partybox/ui/policy/PrivacyPolicyFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,117:1\n66#2,4:118\n*S KotlinDebug\n*F\n+ 1 PrivacyPolicyFragment.kt\ncom/harman/jbl/partybox/ui/policy/PrivacyPolicyFragment\n*L\n31#1:118,4\n*E\n"})
/* loaded from: classes2.dex */
public final class PrivacyPolicyFragment extends BackDispatcherFragment {

    @d
    public static final String TAG = "PrivacyPolicyFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @d
    private final FragmentViewBindingDelegate f45509Q0;

    /* renamed from: R0, reason: collision with root package name */
    @d
    private final A f45510R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45508S0 = {N.u(new PropertyReference1Impl(PrivacyPolicyFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentEulaBinding;", 0))};

    @d
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
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1892k0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f45511N = new b();

        b() {
            super(1, C1892k0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentEulaBinding;", 0);
        }

        @Override // X2.l
        @d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1892k0 C(@d View p02) {
            F.p(p02, "p0");
            return C1892k0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements CollapsingToolBar.b {
        c() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void a() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void b() {
            PrivacyPolicyFragment.this.onBtnBackClick();
        }
    }

    public PrivacyPolicyFragment() {
        super(j.i.f41475b0);
        this.f45509Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f45511N);
        this.f45510R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBtnBackClick() {
        f.a(this).r0();
    }

    private final C1892k0 p0() {
        return (C1892k0) this.f45509Q0.a(this, f45508S0[0]);
    }

    private final o q0() {
        return (o) this.f45510R0.getValue();
    }

    private final void r0(final String str, String str2) {
        int p32;
        Resources.Theme theme;
        T1.a.a("PrivacyPolicyFragment showText content = " + str2);
        SpannableString spannableString = new SpannableString(str2);
        String spannableString2 = spannableString.toString();
        F.o(spannableString2, "toString(...)");
        p32 = kotlin.text.A.p3(spannableString2, str, 0, false, 6, null);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.policy.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyPolicyFragment.s0(str, this, view);
            }
        };
        Resources resources = getResources();
        int i4 = j.d.f40749f1;
        Context context = getContext();
        if (context != null) {
            theme = context.getTheme();
        } else {
            theme = null;
        }
        spannableString.setSpan(new h(onClickListener, resources.getColor(i4, theme)), p32, str.length() + p32, 33);
        p0().f39762H.setMovementMethod(LinkMovementMethod.getInstance());
        p0().f39762H.setHighlightColor(0);
        p0().f39762H.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(String url, PrivacyPolicyFragment this$0, View view) {
        F.p(url, "$url");
        F.p(this$0, "this$0");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        this$0.startActivity(intent);
    }

    private final void t0(String str) {
        T1.a.a("PrivacyPolicyFragment updateText content = " + str);
        p0().f39762H.setText(str);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@d View view, @e Bundle bundle) {
        boolean T22;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        p0().f39760F.setTitleText(getString(j.m.L7));
        p0().f39760F.setNavigationListener(new c());
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            try {
                com.harman.legallib.d dVar = com.harman.legallib.d.f47556a;
                Context applicationContext = activity.getApplicationContext();
                F.o(applicationContext, "getApplicationContext(...)");
                LegalConfig.Type type = LegalConfig.Type.PRIVACY;
                m mVar = m.f46192a;
                Resources resources = getResources();
                F.o(resources, "getResources(...)");
                String k4 = dVar.k(applicationContext, type, mVar.c(resources));
                T22 = kotlin.text.A.T2(k4, S1.a.f1736d, false, 2, null);
                if (T22) {
                    T1.a.a("PrivacyPolicyFragment It is Privacy Link");
                    r0(S1.a.f1736d, k4);
                } else {
                    T1.a.a("PrivacyPolicyFragment It is Privacy content");
                    t0(k4);
                }
                H0 h02 = H0.f51801a;
            } catch (Exception e4) {
                e4.printStackTrace();
                Log.d(EulaFragment.TAG, H0.f51801a.toString());
            }
        }
    }
}

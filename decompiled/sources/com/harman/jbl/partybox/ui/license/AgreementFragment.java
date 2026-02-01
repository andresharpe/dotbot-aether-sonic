package com.harman.jbl.partybox.ui.license;

import W2.n;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.content.C0669d;
import androidx.core.os.C0743f;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.I;
import com.google.android.gms.analytics.ecommerce.c;
import com.google.firebase.crashlytics.i;
import com.harman.jbl.partybox.databinding.AbstractC1965z0;
import com.harman.jbl.partybox.f;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.utils.m;
import com.harman.jbl.partybox.utils.q;
import com.harman.legallib.LegalConfig;
import java.util.Locale;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import l3.d;
import l3.e;
import t2.C2418d;
import t2.InterfaceC2419e;

@E(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0004R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/harman/jbl/partybox/ui/license/AgreementFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "s0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onEulaTextClicked", "onAcceptButtonClicked", "onNotAcceptButtonClicked", "onPrivacyTextClicked", "Lcom/harman/jbl/partybox/ui/license/b;", "k1", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/license/b;", "viewModel", "Lcom/harman/jbl/partybox/databinding/z0;", "l1", "Lcom/harman/jbl/partybox/databinding/z0;", "binding", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAgreementFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgreementFragment.kt\ncom/harman/jbl/partybox/ui/license/AgreementFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n56#2,10:169\n1#3:179\n*S KotlinDebug\n*F\n+ 1 AgreementFragment.kt\ncom/harman/jbl/partybox/ui/license/AgreementFragment\n*L\n39#1:169,10\n*E\n"})
/* loaded from: classes2.dex */
public final class AgreementFragment extends DialogFragment {

    @d
    public static final a Companion = new a(null);

    @d
    public static final String TAG = "AgreementFragment";

    /* renamed from: k1, reason: collision with root package name */
    @d
    private final A f43926k1;

    /* renamed from: l1, reason: collision with root package name */
    @e
    private AbstractC1965z0 f43927l1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @n
        @d
        public final AgreementFragment a() {
            return new AgreementFragment();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC2419e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f43932a;

        b(Context context) {
            this.f43932a = context;
        }

        @Override // t2.InterfaceC2419e
        public void a() {
        }

        @Override // t2.InterfaceC2419e
        public void b() {
            q2.b a4 = q2.b.f57366d.a();
            Context it = this.f43932a;
            F.o(it, "$it");
            a4.f(it, null, C2418d.f57874c.a().e("RatingInAppAndroid"));
        }
    }

    public AgreementFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.license.AgreementFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43926k1 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.license.b.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.license.AgreementFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.license.AgreementFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @d
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
    }

    @n
    @d
    public static final AgreementFragment newInstance() {
        return Companion.a();
    }

    private final com.harman.jbl.partybox.ui.license.b r0() {
        return (com.harman.jbl.partybox.ui.license.b) this.f43926k1.getValue();
    }

    private final void s0() {
        startActivity(new Intent(getActivity(), (Class<?>) MainActivityNav.class));
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void onAcceptButtonClicked() {
        Context applicationContext;
        ActivityC0889g activity = getActivity();
        if (activity != null && (applicationContext = activity.getApplicationContext()) != null) {
            com.google.firebase.e.x(applicationContext);
        }
        r0().v();
        Context context = getContext();
        if (context != null) {
            com.harman.legallib.d.f47556a.c(context);
            C2418d.f57874c.a().f(new b(context));
        }
        com.harman.jbl.partybox.persistence.a.A("legal_info_agreed", true);
        T1.a.a("BLE_LOG Enable Firebase Crashlytics as User has Accepted the Privacy terms.");
        i.d().j(true);
        T1.a.a("BLE_LOG Enable Firebase Analytics as User has Accepted the Privacy terms.");
        K1.a.c(getContext());
        r3.c.d(getContext(), f.f40392g, f.f40391f);
        s0();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @d
    public Dialog onCreateDialog(@e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, j.d.f40743d1);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        F.p(inflater, "inflater");
        AbstractC1965z0 r12 = AbstractC1965z0.r1(inflater);
        this.f43927l1 = r12;
        if (r12 != null) {
            return r12.d();
        }
        return null;
    }

    public final void onEulaTextClicked() {
        I a4 = com.harman.jbl.partybox.ui.license.a.a();
        F.o(a4, "actionAgreementFragmentToEulaFragment(...)");
        q.f(this, a4);
    }

    public final void onNotAcceptButtonClicked() {
        AbstractC1965z0 abstractC1965z0 = this.f43927l1;
        if (abstractC1965z0 != null) {
            abstractC1965z0.f40362k0.setVisibility(8);
        }
        androidx.navigation.fragment.f.a(this).r0();
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
                    I b4 = com.harman.jbl.partybox.ui.license.a.b();
                    F.o(b4, "actionAgreementFragmentToPrivacyPolicy(...)");
                    q.f(this, b4);
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
                        I b5 = com.harman.jbl.partybox.ui.license.a.b();
                        F.o(b5, "actionAgreementFragmentToPrivacyPolicy(...)");
                        q.f(this, b5);
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            T1.a.a("BLE_LOG AgreementFragment Exception while displaying Privacy, so just show it in Textview");
            I b6 = com.harman.jbl.partybox.ui.license.a.b();
            F.o(b6, "actionAgreementFragmentToPrivacyPolicy(...)");
            q.f(this, b6);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC1965z0 abstractC1965z0 = this.f43927l1;
        if (abstractC1965z0 != null) {
            abstractC1965z0.v1(this);
        }
    }
}

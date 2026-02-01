package com.harman.jbl.partybox.ui.language;

import X2.l;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.i;
import androidx.core.os.C0741d;
import androidx.core.os.C0750m;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1956x0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.language.b;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import kotlin.text.z;
import l3.e;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRH\u0010'\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007  *\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f0\u001f0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00063"}, d2 = {"Lcom/harman/jbl/partybox/ui/language/LanguageFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "onBtnBackClick", "()V", "q0", "initData", "", "languageName", "r0", "(Ljava/lang/String;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/x0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "o0", "()Lcom/harman/jbl/partybox/databinding/x0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "p0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Landroidx/lifecycle/P;", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "S0", "Landroidx/lifecycle/P;", "getMLanguageLiveData", "()Landroidx/lifecycle/P;", "setMLanguageLiveData", "(Landroidx/lifecycle/P;)V", "mLanguageLiveData", "Lcom/harman/jbl/partybox/ui/language/b;", "T0", "Lcom/harman/jbl/partybox/ui/language/b;", "getAdapter", "()Lcom/harman/jbl/partybox/ui/language/b;", "setAdapter", "(Lcom/harman/jbl/partybox/ui/language/b;)V", "adapter", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLanguageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageFragment.kt\ncom/harman/jbl/partybox/ui/language/LanguageFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n66#2,4:139\n223#3,2:143\n*S KotlinDebug\n*F\n+ 1 LanguageFragment.kt\ncom/harman/jbl/partybox/ui/language/LanguageFragment\n*L\n53#1:139,4\n98#1:143,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LanguageFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "LanguageFragment";

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private static final List<Pair<String, String>> f43887V0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43888Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43889R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private P<Pair<String, String>> f43890S0;

    /* renamed from: T0, reason: collision with root package name */
    @e
    private com.harman.jbl.partybox.ui.language.b f43891T0;

    /* renamed from: U0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43886U0 = {N.u(new PropertyReference1Impl(LanguageFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentLanguageBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final List<Pair<String, String>> a() {
            return LanguageFragment.f43887V0;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1956x0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43892N = new b();

        b() {
            super(1, C1956x0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentLanguageBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1956x0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1956x0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b.InterfaceC0379b {
        c() {
        }

        @Override // com.harman.jbl.partybox.ui.language.b.InterfaceC0379b
        public void a(@l3.d b.a vHolder, int i4) {
            F.p(vHolder, "vHolder");
            Pair<String, String> pair = LanguageFragment.Companion.a().get(i4);
            LanguageFragment.this.getMLanguageLiveData().r(pair);
            i.X(C0750m.a(Locale.forLanguageTag(pair.e())));
            LanguageFragment.this.r0(pair.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements CollapsingToolBar.b {
        d() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void a() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void b() {
            LanguageFragment.this.onBtnBackClick();
        }
    }

    static {
        List<Pair<String, String>> O3;
        O3 = CollectionsKt__CollectionsKt.O(C2122h0.a("en", "English"), C2122h0.a("fr", "Française"), C2122h0.a("es", "Española"), C2122h0.a("pt-BR", "Portugues Do Brasil"), C2122h0.a("de", "Deutsch"), C2122h0.a("it", "Italiano"), C2122h0.a("nl", "Nederlands"), C2122h0.a("no", "Norsk"), C2122h0.a("fi", "Suomalainen"), C2122h0.a("ru", "РУССКИЙ"), C2122h0.a("sv", "Svenska"), C2122h0.a("da", "Dansk"), C2122h0.a("ja", "日本語"), C2122h0.a("pl", "Polski"), C2122h0.a("ko", "한국어"), C2122h0.a("zh-CN", "简体中文"), C2122h0.a("zh-TW", "繁體中文"), C2122h0.a("id-ID", "Bahasa"), C2122h0.a("ar", "Arabic"));
        f43887V0 = O3;
    }

    public LanguageFragment() {
        super(j.i.f41519m0);
        Object B22;
        this.f43888Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43892N);
        this.f43889R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        B22 = D.B2(f43887V0);
        this.f43890S0 = new P<>(B22);
    }

    private final void initData() {
        this.f43891T0 = new com.harman.jbl.partybox.ui.language.b(f43887V0, this, new c());
        o0().f40299G.setAdapter(this.f43891T0);
        o0().f40299G.setLayoutManager(new LinearLayoutManager(requireContext()));
        q0();
    }

    private final C1956x0 o0() {
        return (C1956x0) this.f43888Q0.a(this, f43886U0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final o p0() {
        return (o) this.f43889R0.getValue();
    }

    private final void q0() {
        boolean T22;
        try {
            Locale d4 = i.t().d(0);
            if (d4 == null) {
                d4 = getResources().getConfiguration().locale;
            }
            for (Object obj : f43887V0) {
                F.m(d4);
                String languageTag = d4.toLanguageTag();
                F.o(languageTag, "toLanguageTag(...)");
                T22 = kotlin.text.A.T2(languageTag, (CharSequence) ((Pair) obj).e(), false, 2, null);
                if (T22) {
                    this.f43890S0.r((Pair) obj);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            this.f43890S0.r(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(String str) {
        boolean S12;
        if (str != null) {
            S12 = z.S1(str);
            if (!S12) {
                Bundle b4 = C0741d.b(C2122h0.a("di_action_type", L1.a.f1670x2), C2122h0.a(L1.a.f1522R1, str), C2122h0.a(L1.a.u3, Integer.valueOf(com.harman.jbl.partybox.c.f38305O)));
                HmDevice k12 = p0().k1();
                if (k12 != null) {
                    b4.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
                }
                K1.a.a(L1.a.f1514P1, b4);
            }
        }
    }

    @e
    public final com.harman.jbl.partybox.ui.language.b getAdapter() {
        return this.f43891T0;
    }

    @l3.d
    public final P<Pair<String, String>> getMLanguageLiveData() {
        return this.f43890S0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        o0().f40298F.setNavigationListener(new d());
        initData();
    }

    public final void setAdapter(@e com.harman.jbl.partybox.ui.language.b bVar) {
        this.f43891T0 = bVar;
    }

    public final void setMLanguageLiveData(@l3.d P<Pair<String, String>> p4) {
        F.p(p4, "<set-?>");
        this.f43890S0 = p4;
    }
}

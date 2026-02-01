package com.harman.jbl.partybox.ui.party.auracast;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.C0937n;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.S;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.UiPage;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.spotify.sdk.android.auth.b;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ,2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b+\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00060"}, d2 = {"Lcom/harman/jbl/partybox/ui/party/auracast/AuracastWebviewFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "", "loadUrl", "Lkotlin/H0;", "p0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "()V", "onBtnBackClick", "onDestroyView", "onResume", "onPause", "Lcom/harman/jbl/partybox/databinding/S;", "Q0", "Lcom/harman/jbl/partybox/databinding/S;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/party/auracast/u;", "S0", "Landroidx/navigation/n;", "r0", "()Lcom/harman/jbl/partybox/ui/party/auracast/u;", "args", "<init>", "Companion", "a", com.harman.log.b.f47574c, "c", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nAuracastWebviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastWebviewFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastWebviewFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n66#2,4:168\n42#3,3:172\n223#4,2:175\n*S KotlinDebug\n*F\n+ 1 AuracastWebviewFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastWebviewFragment\n*L\n28#1:168,4\n30#1:172,3\n69#1:175,2\n*E\n"})
/* loaded from: classes2.dex */
public final class AuracastWebviewFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private static final String f44835T0 = "Party.Auracast.WebviewFragment";

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private static final List<Pair<String, String>> f44836U0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private S f44837Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f44838R0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final C0937n f44839S0 = new C0937n(N.d(u.class), new X2.a<Bundle>() { // from class: com.harman.jbl.partybox.ui.party.auracast.AuracastWebviewFragment$special$$inlined$navArgs$1
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

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final List<Pair<String, String>> a() {
            return AuracastWebviewFragment.f44836U0;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@l3.d WebView view, int i4) {
            ProgressBar progressBar;
            F.p(view, "view");
            S s4 = AuracastWebviewFragment.this.f44837Q0;
            if (s4 != null && (progressBar = s4.f39021H) != null) {
                progressBar.setProgress(i4, true);
            }
            super.onProgressChanged(view, i4);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@l3.e WebView webView, @l3.e String str) {
            HmCustomFontTextView hmCustomFontTextView;
            super.onReceivedTitle(webView, str);
            S s4 = AuracastWebviewFragment.this.f44837Q0;
            if (s4 != null) {
                hmCustomFontTextView = s4.f39023J;
            } else {
                hmCustomFontTextView = null;
            }
            if (hmCustomFontTextView != null) {
                hmCustomFontTextView.setText(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nAuracastWebviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuracastWebviewFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastWebviewFragment$MyWebViewClient\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,167:1\n262#2,2:168\n262#2,2:170\n*S KotlinDebug\n*F\n+ 1 AuracastWebviewFragment.kt\ncom/harman/jbl/partybox/ui/party/auracast/AuracastWebviewFragment$MyWebViewClient\n*L\n89#1:168,2\n94#1:170,2\n*E\n"})
    /* loaded from: classes2.dex */
    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@l3.d WebView view, @l3.d String url) {
            ProgressBar progressBar;
            F.p(view, "view");
            F.p(url, "url");
            S s4 = AuracastWebviewFragment.this.f44837Q0;
            if (s4 != null) {
                progressBar = s4.f39021H;
            } else {
                progressBar = null;
            }
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@l3.e WebView webView, @l3.e String str, @l3.e Bitmap bitmap) {
            ProgressBar progressBar;
            S s4 = AuracastWebviewFragment.this.f44837Q0;
            if (s4 != null) {
                progressBar = s4.f39021H;
            } else {
                progressBar = null;
            }
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@l3.d WebView view, @l3.d String url) {
            F.p(view, "view");
            F.p(url, "url");
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

    static {
        List<Pair<String, String>> O3;
        O3 = CollectionsKt__CollectionsKt.O(C2122h0.a("en", "en"), C2122h0.a("fr", "fr"), C2122h0.a("es", "es"), C2122h0.a("pt-BR", "pt-BR"), C2122h0.a("de", "de"), C2122h0.a("it", "it"), C2122h0.a("nl", "nl"), C2122h0.a("no", "nb"), C2122h0.a("fi", "fi"), C2122h0.a("ru", "ru"), C2122h0.a("sv", "sv"), C2122h0.a("da", "da"), C2122h0.a("ja", "ja"), C2122h0.a("pl", "pl"), C2122h0.a("ko", "ko"), C2122h0.a("zh-CN", "zh-Hans"), C2122h0.a("zh-Hans-CN", "zh-Hans"), C2122h0.a("zh-TW", "zh-Hant"), C2122h0.a("zh-Hant-HK", "zh-Hant"), C2122h0.a("id-ID", b.c.f48986a), C2122h0.a("ar", "ar"));
        f44836U0 = O3;
    }

    private final void p0(String str) {
        boolean T22;
        S s4 = this.f44837Q0;
        if (s4 != null) {
            s4.f39019F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.party.auracast.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AuracastWebviewFragment.q0(AuracastWebviewFragment.this, view);
                }
            });
            WebSettings settings = s4.f39024K.getSettings();
            F.o(settings, "getSettings(...)");
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setDomStorageEnabled(false);
            s4.f39024K.setWebViewClient(new c());
            s4.f39024K.setWebChromeClient(new b());
            if (str != null) {
                try {
                    Locale d4 = androidx.appcompat.app.i.t().d(0);
                    if (d4 == null) {
                        d4 = getResources().getConfiguration().locale;
                    }
                    for (Object obj : f44836U0) {
                        F.m(d4);
                        String languageTag = d4.toLanguageTag();
                        F.o(languageTag, "toLanguageTag(...)");
                        T22 = kotlin.text.A.T2(languageTag, (CharSequence) ((Pair) obj).e(), false, 2, null);
                        if (T22) {
                            s4.f39024K.loadUrl(str + "?lang=" + ((Pair) obj).f());
                            return;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                } catch (Exception unused) {
                    s4.f39024K.loadUrl(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(AuracastWebviewFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final u r0() {
        return (u) this.f44839S0.getValue();
    }

    private final com.harman.jbl.partybox.ui.main.o s0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f44838R0.getValue();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        WebView webView;
        WebView webView2;
        S s4 = this.f44837Q0;
        if (s4 != null && (webView = s4.f39024K) != null && webView.canGoBack()) {
            S s5 = this.f44837Q0;
            if (s5 != null && (webView2 = s5.f39024K) != null) {
                webView2.goBack();
                return;
            }
            return;
        }
        onBtnBackClick();
    }

    public final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        S e4 = S.e(inflater, viewGroup, false);
        F.o(e4, "inflate(...)");
        this.f44837Q0 = e4;
        ConstraintLayout d4 = e4.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView webView;
        super.onDestroyView();
        S s4 = this.f44837Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.destroy();
        }
        s0().s3(UiPage.AURACAST);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onPause() {
        WebView webView;
        super.onPause();
        S s4 = this.f44837Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.onPause();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        WebView webView;
        super.onResume();
        S s4 = this.f44837Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.onResume();
        }
        s0().s3(UiPage.AURACAST_QA);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        p0(r0().c());
    }
}

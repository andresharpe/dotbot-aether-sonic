package com.harman.jbl.partybox.ui.legal;

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
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.S;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import kotlin.A;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0003'()B\u0007¢\u0006\u0004\b%\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/harman/jbl/partybox/ui/legal/RecordNumberFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "", "loadUrl", "Lkotlin/H0;", "p0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "()V", "onBtnBackClick", "onDestroyView", "onResume", "onPause", "Lcom/harman/jbl/partybox/databinding/S;", "Q0", "Lcom/harman/jbl/partybox/databinding/S;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "<init>", "Companion", "a", com.harman.log.b.f47574c, "c", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nRecordNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordNumberFragment.kt\ncom/harman/jbl/partybox/ui/legal/RecordNumberFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n*L\n1#1,129:1\n66#2,4:130\n*S KotlinDebug\n*F\n+ 1 RecordNumberFragment.kt\ncom/harman/jbl/partybox/ui/legal/RecordNumberFragment\n*L\n25#1:130,4\n*E\n"})
/* loaded from: classes2.dex */
public final class RecordNumberFragment extends BackDispatcherFragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private static final String f43912S0 = "Info.legal.RecordNumberFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private S f43913Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43914R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
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
            S s4 = RecordNumberFragment.this.f43913Q0;
            if (s4 != null && (progressBar = s4.f39021H) != null) {
                progressBar.setProgress(i4, true);
            }
            super.onProgressChanged(view, i4);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@l3.e WebView webView, @l3.e String str) {
            HmCustomFontTextView hmCustomFontTextView;
            super.onReceivedTitle(webView, str);
            S s4 = RecordNumberFragment.this.f43913Q0;
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
    @U({"SMAP\nRecordNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordNumberFragment.kt\ncom/harman/jbl/partybox/ui/legal/RecordNumberFragment$MyWebViewClient\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,129:1\n262#2,2:130\n262#2,2:132\n*S KotlinDebug\n*F\n+ 1 RecordNumberFragment.kt\ncom/harman/jbl/partybox/ui/legal/RecordNumberFragment$MyWebViewClient\n*L\n78#1:130,2\n83#1:132,2\n*E\n"})
    /* loaded from: classes2.dex */
    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@l3.d WebView view, @l3.d String url) {
            ProgressBar progressBar;
            F.p(view, "view");
            F.p(url, "url");
            S s4 = RecordNumberFragment.this.f43913Q0;
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
            S s4 = RecordNumberFragment.this.f43913Q0;
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

    private final void p0(String str) {
        S s4 = this.f43913Q0;
        if (s4 != null) {
            s4.f39019F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.legal.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecordNumberFragment.q0(RecordNumberFragment.this, view);
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
                s4.f39024K.loadUrl(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(RecordNumberFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.handleOnBackPressed();
    }

    private final o r0() {
        return (o) this.f43914R0.getValue();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        WebView webView;
        WebView webView2;
        S s4 = this.f43913Q0;
        if (s4 != null && (webView = s4.f39024K) != null && webView.canGoBack()) {
            S s5 = this.f43913Q0;
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
        this.f43913Q0 = e4;
        ConstraintLayout d4 = e4.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        WebView webView;
        super.onDestroyView();
        S s4 = this.f43913Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.destroy();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onPause() {
        WebView webView;
        super.onPause();
        S s4 = this.f43913Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.onPause();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        WebView webView;
        super.onResume();
        S s4 = this.f43913Q0;
        if (s4 != null && (webView = s4.f39024K) != null) {
            webView.onResume();
        }
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        String str;
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("loadUrl");
        } else {
            str = null;
        }
        p0(str);
    }
}

package com.harman.jbl.cd_biz_comm.widget;

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
import androidx.activity.j;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.C0741d;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.C1275t;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import m2.v;

@E(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001\u001c\b\u0000\u0018\u0000 !2\u00020\u0001:\u0003\"#$B\u0007¢\u0006\u0004\b \u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/widget/WebViewFragment;", "Landroidx/fragment/app/Fragment;", "", "loadUrl", "Lkotlin/H0;", "l0", "(Ljava/lang/String;)V", "n0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lm2/v;", "N0", "Lm2/v;", "binding", "com/harman/jbl/cd_biz_comm/widget/WebViewFragment$d", "O0", "Lcom/harman/jbl/cd_biz_comm/widget/WebViewFragment$d;", "onBackPressCallback", "<init>", "Companion", "a", com.harman.log.b.f47574c, "c", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class WebViewFragment extends Fragment {

    @l3.d
    public static final a Companion = new a(null);

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private static final String f38038P0 = C1275t.f28813a;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private static final String f38039Q0 = "title";

    /* renamed from: N0, reason: collision with root package name */
    private v f38040N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.d
    private final d f38041O0 = new d();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public static /* synthetic */ WebViewFragment b(a aVar, String str, String str2, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                str2 = null;
            }
            return aVar.a(str, str2);
        }

        @l3.d
        public final WebViewFragment a(@l3.d String url, @l3.e String str) {
            F.p(url, "url");
            WebViewFragment webViewFragment = new WebViewFragment();
            webViewFragment.setArguments(C0741d.b(C2122h0.a(WebViewFragment.f38038P0, url), C2122h0.a(WebViewFragment.f38039Q0, str)));
            return webViewFragment;
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
            F.p(view, "view");
            v vVar = WebViewFragment.this.f38040N0;
            if (vVar == null) {
                F.S("binding");
                vVar = null;
            }
            vVar.f55248H.setProgress(i4, true);
            super.onProgressChanged(view, i4);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@l3.e WebView webView, @l3.e String str) {
            super.onReceivedTitle(webView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @U({"SMAP\nWebViewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewFragment.kt\ncom/harman/jbl/cd_biz_comm/widget/WebViewFragment$MyWebViewClient\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,129:1\n254#2,2:130\n254#2,2:132\n*S KotlinDebug\n*F\n+ 1 WebViewFragment.kt\ncom/harman/jbl/cd_biz_comm/widget/WebViewFragment$MyWebViewClient\n*L\n91#1:130,2\n96#1:132,2\n*E\n"})
    /* loaded from: classes2.dex */
    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@l3.d WebView view, @l3.d String url) {
            F.p(view, "view");
            F.p(url, "url");
            v vVar = WebViewFragment.this.f38040N0;
            if (vVar == null) {
                F.S("binding");
                vVar = null;
            }
            ProgressBar progressBar = vVar.f55248H;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            super.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@l3.e WebView webView, @l3.e String str, @l3.e Bitmap bitmap) {
            v vVar = WebViewFragment.this.f38040N0;
            if (vVar == null) {
                F.S("binding");
                vVar = null;
            }
            ProgressBar progressBar = vVar.f55248H;
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

    /* loaded from: classes2.dex */
    public static final class d extends j {
        d() {
            super(true);
        }

        @Override // androidx.activity.j
        public void e() {
            WebViewFragment.this.n0();
        }
    }

    private final void l0(String str) {
        v vVar = this.f38040N0;
        if (vVar == null) {
            F.S("binding");
            vVar = null;
        }
        vVar.f55246F.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.cd_biz_comm.widget.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewFragment.m0(WebViewFragment.this, view);
            }
        });
        WebSettings settings = vVar.f55251K.getSettings();
        F.o(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(false);
        vVar.f55251K.setWebViewClient(new c());
        vVar.f55251K.setWebChromeClient(new b());
        if (str != null) {
            vVar.f55251K.loadUrl(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(WebViewFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0() {
        v vVar = this.f38040N0;
        v vVar2 = null;
        if (vVar == null) {
            F.S("binding");
            vVar = null;
        }
        if (vVar.f55251K.canGoBack()) {
            v vVar3 = this.f38040N0;
            if (vVar3 == null) {
                F.S("binding");
            } else {
                vVar2 = vVar3;
            }
            vVar2.f55251K.goBack();
            return;
        }
        androidx.navigation.fragment.f.a(this).t0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().d().b(this.f38041O0);
    }

    @Override // androidx.fragment.app.Fragment
    @l3.d
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        F.p(inflater, "inflater");
        v c4 = v.c(inflater);
        F.o(c4, "inflate(...)");
        this.f38040N0 = c4;
        if (c4 == null) {
            F.S("binding");
            c4 = null;
        }
        ConstraintLayout d4 = c4.d();
        F.o(d4, "getRoot(...)");
        return d4;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        v vVar = this.f38040N0;
        if (vVar == null) {
            F.S("binding");
            vVar = null;
        }
        vVar.f55251K.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            l0(arguments.getString(f38038P0));
            v vVar = this.f38040N0;
            if (vVar == null) {
                F.S("binding");
                vVar = null;
            }
            vVar.f55250J.setText(arguments.getString(f38039Q0));
        }
    }
}

package com.spotify.sdk.android.auth.webview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.c;
import com.spotify.sdk.android.auth.d;
import com.spotify.sdk.android.auth.g;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a extends Dialog {

    /* renamed from: J, reason: collision with root package name */
    private static final String f49034J = "com.spotify.sdk.android.auth.webview.a";

    /* renamed from: K, reason: collision with root package name */
    private static final String f49035K = "^(.+\\.facebook\\.com)|(accounts\\.spotify\\.com)$";

    /* renamed from: L, reason: collision with root package name */
    private static final int f49036L = 16973840;

    /* renamed from: M, reason: collision with root package name */
    private static final int f49037M = 400;

    /* renamed from: N, reason: collision with root package name */
    private static final int f49038N = 640;

    /* renamed from: E, reason: collision with root package name */
    private final Uri f49039E;

    /* renamed from: F, reason: collision with root package name */
    private c.a f49040F;

    /* renamed from: G, reason: collision with root package name */
    private ProgressDialog f49041G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f49042H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f49043I;

    /* renamed from: com.spotify.sdk.android.auth.webview.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class DialogInterfaceOnCancelListenerC0438a implements DialogInterface.OnCancelListener {
        DialogInterfaceOnCancelListenerC0438a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f49045a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LinearLayout f49046b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49047c;

        b(WebView webView, LinearLayout linearLayout, String str) {
            this.f49045a = webView;
            this.f49046b = linearLayout;
            this.f49047c = str;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (a.this.f49042H) {
                a.this.f49041G.dismiss();
            }
            this.f49045a.setVisibility(0);
            this.f49046b.setVisibility(0);
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (a.this.f49042H) {
                a.this.f49041G.show();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            a.this.k(new Error(String.format("%s, code: %s, failing url: %s", str, Integer.valueOf(i4), str2)));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = this.f49047c;
            Locale locale = Locale.ENGLISH;
            String lowerCase = str2.toLowerCase(locale);
            String lowerCase2 = str.toLowerCase(locale);
            Uri parse = Uri.parse(str);
            if (lowerCase2.startsWith(lowerCase)) {
                a.this.j(parse);
                return true;
            }
            if (parse.getAuthority().matches(a.f49035K)) {
                return false;
            }
            String format = String.format("Can't redirect due to mismatch. \nRequest redirect-uri: %s\nResponse redirect-uri: %s", this.f49047c, parse);
            Log.e(a.f49034J, format);
            a.this.k(new RuntimeException(format));
            return true;
        }
    }

    public a(Activity activity, d dVar) {
        super(activity, 16973840);
        this.f49039E = dVar.l();
    }

    public static void f(Context context) {
        c.b(context);
        c.a(context, "spotify.com");
        c.a(context, ".spotify.com");
        c.a(context, "https://spotify.com");
        c.a(context, "https://.spotify.com");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void h(Uri uri) {
        if (!i()) {
            Log.e(f49034J, "Missing INTERNET permission");
        }
        WebView webView = (WebView) findViewById(g.a.f49029a);
        LinearLayout linearLayout = (LinearLayout) findViewById(g.a.f49030b);
        String queryParameter = uri.getQueryParameter("redirect_uri");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        webView.setWebViewClient(new b(webView, linearLayout, queryParameter));
        webView.loadUrl(uri.toString());
    }

    private boolean i() {
        if (getContext().getPackageManager().checkPermission("android.permission.INTERNET", getContext().getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Uri uri) {
        this.f49043I = true;
        c.a aVar = this.f49040F;
        if (aVar != null) {
            aVar.a(AuthorizationResponse.a(uri));
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(Throwable th) {
        this.f49043I = true;
        c.a aVar = this.f49040F;
        if (aVar != null) {
            aVar.onError(th);
        }
        g();
    }

    private void l() {
        int i4;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f4 = displayMetrics.widthPixels;
        float f5 = displayMetrics.density;
        int i5 = -1;
        if (f4 / f5 > 400.0f) {
            i4 = (int) (400.0f * f5);
        } else {
            i4 = -1;
        }
        if (displayMetrics.heightPixels / f5 > 640.0f) {
            i5 = (int) (f5 * 640.0f);
        }
        ((LinearLayout) findViewById(g.a.f49030b)).setLayoutParams(new FrameLayout.LayoutParams(i4, i5, 17));
    }

    public void g() {
        if (this.f49042H) {
            dismiss();
        }
    }

    public void m(c.a aVar) {
        this.f49040F = aVar;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f49042H = true;
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49043I = false;
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f49041G = progressDialog;
        progressDialog.setMessage(getContext().getString(g.c.f49033a));
        this.f49041G.requestWindowFeature(1);
        this.f49041G.setOnCancelListener(new DialogInterfaceOnCancelListenerC0438a());
        requestWindowFeature(1);
        getWindow().setSoftInputMode(16);
        getWindow().setBackgroundDrawableResource(R.drawable.screen_background_dark_transparent);
        setContentView(g.b.f49032b);
        l();
        h(this.f49039E);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f49042H = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        c.a aVar;
        if (!this.f49043I && (aVar = this.f49040F) != null) {
            aVar.onCancel();
        }
        this.f49043I = true;
        this.f49041G.dismiss();
        super.onStop();
    }

    public a(Activity activity, int i4, d dVar) {
        super(activity, i4);
        this.f49039E = dVar.l();
    }
}

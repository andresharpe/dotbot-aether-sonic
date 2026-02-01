package com.spotify.sdk.android.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f48968f = "Spotify Auth Client";

    /* renamed from: g, reason: collision with root package name */
    static final String f48969g = "market://";

    /* renamed from: h, reason: collision with root package name */
    static final String f48970h = "market";

    /* renamed from: i, reason: collision with root package name */
    static final String f48971i = "details";

    /* renamed from: j, reason: collision with root package name */
    static final String f48972j = "https";

    /* renamed from: k, reason: collision with root package name */
    static final String f48973k = "play.google.com";

    /* renamed from: l, reason: collision with root package name */
    static final String f48974l = "store/apps/details";

    /* renamed from: m, reason: collision with root package name */
    static final String f48975m = "com.spotify.music";

    /* renamed from: n, reason: collision with root package name */
    static final String f48976n = "spotify-sdk";

    /* renamed from: o, reason: collision with root package name */
    static final String f48977o = "android-sdk";

    /* renamed from: p, reason: collision with root package name */
    static final String f48978p = "android-sdk";

    /* renamed from: a, reason: collision with root package name */
    private final Activity f48979a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f48980b;

    /* renamed from: c, reason: collision with root package name */
    private com.spotify.sdk.android.auth.c f48981c;

    /* renamed from: d, reason: collision with root package name */
    private List<com.spotify.sdk.android.auth.c> f48982d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0437b f48983e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.spotify.sdk.android.auth.c f48984a;

        a(com.spotify.sdk.android.auth.c cVar) {
            this.f48984a = cVar;
        }

        @Override // com.spotify.sdk.android.auth.c.a
        public void a(AuthorizationResponse authorizationResponse) {
            Log.i(b.f48968f, String.format("Spotify auth response:%s", authorizationResponse.h().name()));
            b.this.n(this.f48984a, authorizationResponse);
        }

        @Override // com.spotify.sdk.android.auth.c.a
        public void onCancel() {
            Log.i(b.f48968f, "Spotify auth response: User cancelled");
            b.this.n(this.f48984a, new AuthorizationResponse.b().g(AuthorizationResponse.Type.EMPTY).a());
        }

        @Override // com.spotify.sdk.android.auth.c.a
        public void onError(Throwable th) {
            Log.e(b.f48968f, "Spotify auth Error", th);
            b.this.n(this.f48984a, new AuthorizationResponse.b().g(AuthorizationResponse.Type.ERROR).d(th.getMessage()).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.spotify.sdk.android.auth.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0437b {
        void a();

        void b(AuthorizationResponse authorizationResponse);
    }

    /* loaded from: classes2.dex */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final String f48986a = "id";

        /* renamed from: b, reason: collision with root package name */
        public static final String f48987b = "referrer";

        /* renamed from: c, reason: collision with root package name */
        public static final String f48988c = "utm_source";

        /* renamed from: d, reason: collision with root package name */
        public static final String f48989d = "utm_medium";

        /* renamed from: e, reason: collision with root package name */
        public static final String f48990e = "utm_campaign";

        c() {
        }
    }

    public b(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f48982d = arrayList;
        this.f48979a = activity;
        arrayList.add(new I2.a());
        this.f48982d.add(new com.spotify.sdk.android.auth.webview.b());
    }

    public static void d(Context context) {
        com.spotify.sdk.android.auth.webview.a.f(context);
    }

    private void e(com.spotify.sdk.android.auth.c cVar) {
        if (cVar != null) {
            cVar.b(null);
            cVar.stop();
        }
    }

    public static Intent g(Activity activity, d dVar) {
        Intent c4 = LoginActivity.c(activity, dVar);
        c4.addFlags(67108864);
        return c4;
    }

    public static AuthorizationResponse h(int i4, Intent intent) {
        if (i4 == -1 && LoginActivity.e(intent) != null) {
            return LoginActivity.e(intent);
        }
        return new AuthorizationResponse.b().g(AuthorizationResponse.Type.EMPTY).a();
    }

    public static boolean i(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    public static void j(Activity activity) {
        k(activity, "android-sdk");
    }

    public static void k(Activity activity, String str) {
        Uri.Builder builder = new Uri.Builder();
        if (i(activity, new Intent("android.intent.action.VIEW", Uri.parse(f48969g)))) {
            builder.scheme(f48970h).appendPath(f48971i);
        } else {
            builder.scheme(f48972j).authority(f48973k).appendEncodedPath(f48974l);
        }
        builder.appendQueryParameter(c.f48986a, f48975m);
        Uri.Builder builder2 = new Uri.Builder();
        builder2.appendQueryParameter("utm_source", f48976n).appendQueryParameter("utm_medium", "android-sdk");
        if (TextUtils.isEmpty(str)) {
            builder2.appendQueryParameter("utm_campaign", "android-sdk");
        } else {
            builder2.appendQueryParameter("utm_campaign", str);
        }
        builder.appendQueryParameter(c.f48987b, builder2.build().getEncodedQuery());
        activity.startActivity(new Intent("android.intent.action.VIEW", builder.build()));
    }

    public static void l(Activity activity, int i4, d dVar) {
        activity.startActivityForResult(g(activity, dVar), i4);
    }

    public static void m(Activity activity, d dVar) {
        activity.startActivity(new Intent("android.intent.action.VIEW", dVar.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.spotify.sdk.android.auth.c cVar, AuthorizationResponse authorizationResponse) {
        this.f48980b = false;
        e(cVar);
        InterfaceC0437b interfaceC0437b = this.f48983e;
        if (interfaceC0437b != null) {
            interfaceC0437b.b(authorizationResponse);
            this.f48983e = null;
        } else {
            Log.w(f48968f, "Can't deliver the Spotify Auth response. The listener is null");
        }
    }

    public static void p(Activity activity, int i4) {
        activity.finishActivity(i4);
    }

    private boolean q(com.spotify.sdk.android.auth.c cVar, d dVar) {
        cVar.b(new a(cVar));
        if (!cVar.a(this.f48979a, dVar)) {
            e(cVar);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(d dVar) {
        if (this.f48980b) {
            return;
        }
        this.f48980b = true;
        for (com.spotify.sdk.android.auth.c cVar : this.f48982d) {
            if (q(cVar, dVar)) {
                this.f48981c = cVar;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (!this.f48980b) {
            return;
        }
        this.f48980b = false;
        e(this.f48981c);
        InterfaceC0437b interfaceC0437b = this.f48983e;
        if (interfaceC0437b != null) {
            interfaceC0437b.a();
            this.f48983e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(AuthorizationResponse authorizationResponse) {
        n(this.f48981c, authorizationResponse);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(InterfaceC0437b interfaceC0437b) {
        this.f48983e = interfaceC0437b;
    }
}

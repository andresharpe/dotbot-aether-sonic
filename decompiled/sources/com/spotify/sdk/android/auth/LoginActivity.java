package com.spotify.sdk.android.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.os.C0745h;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.b;
import com.spotify.sdk.android.auth.g;

/* loaded from: classes2.dex */
public class LoginActivity extends Activity implements b.InterfaceC0437b {

    /* renamed from: F, reason: collision with root package name */
    static final String f48941F = "REPLY";

    /* renamed from: G, reason: collision with root package name */
    static final String f48942G = "ERROR";

    /* renamed from: H, reason: collision with root package name */
    static final String f48943H = "token";

    /* renamed from: I, reason: collision with root package name */
    static final String f48944I = "code";

    /* renamed from: J, reason: collision with root package name */
    private static final String f48945J = "com.spotify.sdk.android.auth.LoginActivity";

    /* renamed from: K, reason: collision with root package name */
    private static final String f48946K = "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode";

    /* renamed from: L, reason: collision with root package name */
    private static final String f48947L = "No authorization request";

    /* renamed from: M, reason: collision with root package name */
    static final String f48948M = "EXTRA_AUTH_REQUEST";

    /* renamed from: N, reason: collision with root package name */
    static final String f48949N = "EXTRA_AUTH_RESPONSE";

    /* renamed from: O, reason: collision with root package name */
    public static final String f48950O = "request";

    /* renamed from: P, reason: collision with root package name */
    public static final String f48951P = "response";

    /* renamed from: Q, reason: collision with root package name */
    public static final int f48952Q = 1138;

    /* renamed from: R, reason: collision with root package name */
    private static final int f48953R = -2;

    /* renamed from: E, reason: collision with root package name */
    private b f48954E = new b(this);

    public static Intent c(Activity activity, d dVar) {
        if (activity != null && dVar != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f48950O, dVar);
            Intent intent = new Intent(activity, (Class<?>) LoginActivity.class);
            intent.putExtra(f48948M, bundle);
            return intent;
        }
        throw new IllegalArgumentException("Context activity or request can't be null");
    }

    private d d() {
        Bundle bundleExtra = getIntent().getBundleExtra(f48948M);
        if (bundleExtra == null) {
            return null;
        }
        return (d) bundleExtra.getParcelable(f48950O);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AuthorizationResponse e(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra(f48949N)) == null) {
            return null;
        }
        return (AuthorizationResponse) bundleExtra.getParcelable(f48951P);
    }

    @Override // com.spotify.sdk.android.auth.b.InterfaceC0437b
    public void a() {
        Log.w(f48945J, "Spotify Auth cancelled due to LoginActivity being finished");
        setResult(0);
    }

    @Override // com.spotify.sdk.android.auth.b.InterfaceC0437b
    public void b(AuthorizationResponse authorizationResponse) {
        Intent intent = new Intent();
        Log.i(f48945J, String.format("Spotify auth completing. The response is in EXTRA with key '%s'", f48951P));
        Bundle bundle = new Bundle();
        bundle.putParcelable(f48951P, authorizationResponse);
        intent.putExtra(f48949N, bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        String stringExtra;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1138) {
            AuthorizationResponse.b bVar = new AuthorizationResponse.b();
            if (i5 == -2) {
                bVar.g(AuthorizationResponse.Type.ERROR);
                if (intent == null) {
                    stringExtra = "Invalid message format";
                } else {
                    stringExtra = intent.getStringExtra(f48942G);
                }
                if (stringExtra == null) {
                    stringExtra = "Unknown error";
                }
                bVar.d(stringExtra);
            } else if (i5 == -1) {
                Bundle bundle = (Bundle) intent.getParcelableExtra(f48941F);
                if (bundle == null) {
                    bVar.g(AuthorizationResponse.Type.ERROR);
                    bVar.d("Missing response data");
                } else {
                    String string = bundle.getString(f.f49024e, C0745h.f12738b);
                    Log.d(f48945J, "Response: " + string);
                    bVar.f(bundle.getString(f.f49022c, null));
                    string.hashCode();
                    if (!string.equals("code")) {
                        if (!string.equals(f48943H)) {
                            bVar.g(AuthorizationResponse.Type.UNKNOWN);
                        } else {
                            String string2 = bundle.getString(f.f49025f);
                            int i6 = bundle.getInt(f.f49027h);
                            bVar.g(AuthorizationResponse.Type.TOKEN);
                            bVar.b(string2);
                            bVar.e(i6);
                        }
                    } else {
                        String string3 = bundle.getString(f.f49026g);
                        bVar.g(AuthorizationResponse.Type.CODE);
                        bVar.c(string3);
                    }
                }
            } else {
                bVar.g(AuthorizationResponse.Type.EMPTY);
            }
            this.f48954E.o(this);
            this.f48954E.f(bVar.a());
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.b.f49031a);
        d d4 = d();
        this.f48954E.o(this);
        if (getCallingActivity() == null) {
            Log.e(f48945J, f48946K);
            finish();
        } else if (d4 == null) {
            Log.e(f48945J, f48947L);
            setResult(0);
            finish();
        } else {
            Log.d(f48945J, String.format("Spotify Auth starting with the request [%s]", d4.l().toString()));
            this.f48954E.b(d4);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.f48954E.c();
        this.f48954E.o(null);
        super.onDestroy();
    }
}

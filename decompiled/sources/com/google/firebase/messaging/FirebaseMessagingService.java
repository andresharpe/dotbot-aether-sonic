package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class FirebaseMessagingService extends AbstractServiceC1825j {

    /* renamed from: K, reason: collision with root package name */
    static final String f36460K = "com.google.android.c2dm.intent.RECEIVE";

    /* renamed from: L, reason: collision with root package name */
    public static final String f36461L = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";

    /* renamed from: M, reason: collision with root package name */
    static final String f36462M = "com.google.firebase.messaging.NEW_TOKEN";

    /* renamed from: N, reason: collision with root package name */
    static final String f36463N = "token";

    /* renamed from: O, reason: collision with root package name */
    private static final int f36464O = 10;

    /* renamed from: P, reason: collision with root package name */
    private static final Queue<String> f36465P = new ArrayDeque(10);

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f36465P;
        if (queue.contains(str)) {
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Received duplicate message: " + str);
                return true;
            }
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (L.v(extras)) {
            L l4 = new L(extras);
            ExecutorService f4 = C1830o.f();
            try {
                if (new C1822g(this, l4, f4).a()) {
                    return;
                }
                f4.shutdown();
                if (J.E(intent)) {
                    J.w(intent);
                }
            } finally {
                f4.shutdown();
            }
        }
        q(new U(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra(C1821f.d.f36975h);
        if (stringExtra == null) {
            return intent.getStringExtra(C1821f.d.f36973f);
        }
        return stringExtra;
    }

    private void o(Intent intent) {
        if (!l(intent.getStringExtra(C1821f.d.f36975h))) {
            u(intent);
        }
    }

    private void u(Intent intent) {
        String stringExtra = intent.getStringExtra(C1821f.d.f36971d);
        if (stringExtra == null) {
            stringExtra = C1821f.e.f36984a;
        }
        char c4 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals(C1821f.e.f36985b)) {
                    c4 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals(C1821f.e.f36984a)) {
                    c4 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals(C1821f.e.f36987d)) {
                    c4 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals(C1821f.e.f36986c)) {
                    c4 = 3;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                p();
                return;
            case 1:
                J.y(intent);
                m(intent);
                return;
            case 2:
                t(n(intent), new SendException(intent.getStringExtra("error")));
                return;
            case 3:
                r(intent.getStringExtra(C1821f.d.f36975h));
                return;
            default:
                Log.w(C1821f.f36920a, "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    @androidx.annotation.i0
    static void v() {
        f36465P.clear();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1825j
    protected Intent e(Intent intent) {
        return Y.b().c();
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1825j
    public void f(Intent intent) {
        String action = intent.getAction();
        if (!f36460K.equals(action) && !f36461L.equals(action)) {
            if (f36462M.equals(action)) {
                s(intent.getStringExtra(f36463N));
                return;
            }
            Log.d(C1821f.f36920a, "Unknown intent action: " + intent.getAction());
            return;
        }
        o(intent);
    }

    @androidx.annotation.j0
    public void p() {
    }

    @androidx.annotation.j0
    public void q(@androidx.annotation.N U u3) {
    }

    @androidx.annotation.j0
    public void r(@androidx.annotation.N String str) {
    }

    @androidx.annotation.j0
    public void s(@androidx.annotation.N String str) {
    }

    @androidx.annotation.j0
    public void t(@androidx.annotation.N String str, @androidx.annotation.N Exception exc) {
    }
}

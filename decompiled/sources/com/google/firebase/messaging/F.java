package com.google.firebase.messaging;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.InterfaceC0561d;
import com.google.android.gms.cloudmessaging.C1162e;
import com.google.android.gms.tasks.AbstractC1770k;
import com.google.android.gms.tasks.C1773n;
import com.google.android.gms.tasks.InterfaceC1762c;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class F {

    /* renamed from: A, reason: collision with root package name */
    private static final String f36390A = "gmp_app_id";

    /* renamed from: B, reason: collision with root package name */
    private static final String f36391B = "gmsv";

    /* renamed from: C, reason: collision with root package name */
    private static final String f36392C = "osv";

    /* renamed from: D, reason: collision with root package name */
    private static final String f36393D = "app_ver";

    /* renamed from: E, reason: collision with root package name */
    private static final String f36394E = "app_ver_name";

    /* renamed from: F, reason: collision with root package name */
    private static final String f36395F = "Goog-Firebase-Installations-Auth";

    /* renamed from: G, reason: collision with root package name */
    private static final String f36396G = "firebase-app-name-hash";

    /* renamed from: H, reason: collision with root package name */
    static final String f36397H = "RST_FULL";

    /* renamed from: I, reason: collision with root package name */
    static final String f36398I = "RST";

    /* renamed from: J, reason: collision with root package name */
    static final String f36399J = "SYNC";

    /* renamed from: K, reason: collision with root package name */
    private static final String f36400K = "*";

    /* renamed from: g, reason: collision with root package name */
    static final String f36401g = "FirebaseMessaging";

    /* renamed from: h, reason: collision with root package name */
    private static final String f36402h = "registration_id";

    /* renamed from: i, reason: collision with root package name */
    private static final String f36403i = "unregistered";

    /* renamed from: j, reason: collision with root package name */
    private static final String f36404j = "error";

    /* renamed from: k, reason: collision with root package name */
    static final String f36405k = "SERVICE_NOT_AVAILABLE";

    /* renamed from: l, reason: collision with root package name */
    static final String f36406l = "INTERNAL_SERVER_ERROR";

    /* renamed from: m, reason: collision with root package name */
    static final String f36407m = "fire-iid";

    /* renamed from: n, reason: collision with root package name */
    static final String f36408n = "InternalServerError";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36409o = "gcm.topic";

    /* renamed from: p, reason: collision with root package name */
    private static final String f36410p = "/topics/";

    /* renamed from: q, reason: collision with root package name */
    static final String f36411q = "INSTANCE_ID_RESET";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36412r = "subtype";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36413s = "sender";

    /* renamed from: t, reason: collision with root package name */
    private static final String f36414t = "scope";

    /* renamed from: u, reason: collision with root package name */
    private static final String f36415u = "delete";

    /* renamed from: v, reason: collision with root package name */
    private static final String f36416v = "iid-operation";

    /* renamed from: w, reason: collision with root package name */
    private static final String f36417w = "appid";

    /* renamed from: x, reason: collision with root package name */
    private static final String f36418x = "Firebase-Client";

    /* renamed from: y, reason: collision with root package name */
    private static final String f36419y = "Firebase-Client-Log-Type";

    /* renamed from: z, reason: collision with root package name */
    private static final String f36420z = "cliv";

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f36421a;

    /* renamed from: b, reason: collision with root package name */
    private final K f36422b;

    /* renamed from: c, reason: collision with root package name */
    private final C1162e f36423c;

    /* renamed from: d, reason: collision with root package name */
    private final C1.b<com.google.firebase.platforminfo.i> f36424d;

    /* renamed from: e, reason: collision with root package name */
    private final C1.b<HeartBeatInfo> f36425e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.j f36426f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(com.google.firebase.e eVar, K k4, C1.b<com.google.firebase.platforminfo.i> bVar, C1.b<HeartBeatInfo> bVar2, com.google.firebase.installations.j jVar) {
        this(eVar, k4, new C1162e(eVar.n()), bVar, bVar2, jVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC1770k<String> d(AbstractC1770k<Bundle> abstractC1770k) {
        return abstractC1770k.n(new androidx.profileinstaller.g(), new InterfaceC1762c() { // from class: com.google.firebase.messaging.E
            @Override // com.google.android.gms.tasks.InterfaceC1762c
            public final Object a(AbstractC1770k abstractC1770k2) {
                String i4;
                i4 = F.this.i(abstractC1770k2);
                return i4;
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f36421a.r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    @InterfaceC0561d
    private String g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString(f36402h);
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString(f36403i);
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!f36398I.equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException(f36405k);
            }
            throw new IOException(f36411q);
        }
        throw new IOException(f36405k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        if (!f36405k.equals(str) && !f36406l.equals(str) && !f36408n.equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i(AbstractC1770k abstractC1770k) throws Exception {
        return g((Bundle) abstractC1770k.s(IOException.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            com.google.firebase.e r3 = r2.f36421a
            com.google.firebase.m r3 = r3.s()
            java.lang.String r3 = r3.j()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f36422b
            int r3 = r3.d()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f36422b
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            com.google.firebase.messaging.K r3 = r2.f36422b
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.e()
            r5.putString(r3, r4)
            com.google.firebase.installations.j r3 = r2.f36426f     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            com.google.android.gms.tasks.k r3 = r3.a(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = com.google.android.gms.tasks.C1773n.a(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            com.google.firebase.installations.n r3 = (com.google.firebase.installations.n) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.b()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            com.google.firebase.installations.j r3 = r2.f36426f
            com.google.android.gms.tasks.k r3 = r3.getId()
            java.lang.Object r3 = com.google.android.gms.tasks.C1773n.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "23.0.8"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            C1.b<com.google.firebase.heartbeatinfo.HeartBeatInfo> r3 = r2.f36425e
            java.lang.Object r3 = r3.get()
            com.google.firebase.heartbeatinfo.HeartBeatInfo r3 = (com.google.firebase.heartbeatinfo.HeartBeatInfo) r3
            C1.b<com.google.firebase.platforminfo.i> r4 = r2.f36424d
            java.lang.Object r4 = r4.get()
            com.google.firebase.platforminfo.i r4 = (com.google.firebase.platforminfo.i) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r3 = r3.b(r0)
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r0 = com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.a()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.F.j(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    private AbstractC1770k<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f36423c.a(bundle);
        } catch (InterruptedException | ExecutionException e4) {
            return C1773n.f(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString(f36415u, "1");
        return d(k(K.c(this.f36421a), f36400K, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<String> f() {
        return d(k(K.c(this.f36421a), f36400K, new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f36409o, f36410p + str2);
        return d(k(str, f36410p + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1770k<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f36409o, f36410p + str2);
        bundle.putString(f36415u, "1");
        return d(k(str, f36410p + str2, bundle));
    }

    @androidx.annotation.i0
    F(com.google.firebase.e eVar, K k4, C1162e c1162e, C1.b<com.google.firebase.platforminfo.i> bVar, C1.b<HeartBeatInfo> bVar2, com.google.firebase.installations.j jVar) {
        this.f36421a = eVar;
        this.f36422b = k4;
        this.f36423c = c1162e;
        this.f36424d = bVar;
        this.f36425e = bVar2;
        this.f36426f = jVar;
    }
}

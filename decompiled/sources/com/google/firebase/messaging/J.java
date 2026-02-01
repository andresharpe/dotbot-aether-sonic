package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C1773n;
import com.google.firebase.messaging.C1821f;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private static final String f36472a = "Firebase";

    /* renamed from: b, reason: collision with root package name */
    private static final String f36473b = "notification";

    /* renamed from: c, reason: collision with root package name */
    private static final String f36474c = "com.google.firebase.messaging";

    /* renamed from: d, reason: collision with root package name */
    private static final String f36475d = "export_to_big_query";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36476e = "delivery_metrics_exported_to_big_query_enabled";

    @androidx.annotation.i0
    static void A(String str, Bundle bundle) {
        try {
            com.google.firebase.e.p();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d4 = d(bundle);
            if (d4 != null) {
                bundle2.putString("_nmid", d4);
            }
            String e4 = e(bundle);
            if (e4 != null) {
                bundle2.putString(C1821f.C0339f.f36994g, e4);
            }
            String i4 = i(bundle);
            if (!TextUtils.isEmpty(i4)) {
                bundle2.putString(C1821f.C0339f.f36991d, i4);
            }
            String g4 = g(bundle);
            if (!TextUtils.isEmpty(g4)) {
                bundle2.putString(C1821f.C0339f.f36997j, g4);
            }
            String r4 = r(bundle);
            if (r4 != null) {
                bundle2.putString(C1821f.C0339f.f36992e, r4);
            }
            String l4 = l(bundle);
            if (l4 != null) {
                try {
                    bundle2.putInt(C1821f.C0339f.f36995h, Integer.parseInt(l4));
                } catch (NumberFormatException e5) {
                    Log.w(C1821f.f36920a, "Error while parsing timestamp in GCM event", e5);
                }
            }
            String t3 = t(bundle);
            if (t3 != null) {
                try {
                    bundle2.putInt(C1821f.C0339f.f36996i, Integer.parseInt(t3));
                } catch (NumberFormatException e6) {
                    Log.w(C1821f.f36920a, "Error while parsing use_device_time in GCM event", e6);
                }
            }
            String n4 = n(bundle);
            if (C1821f.C0339f.f37000m.equals(str) || C1821f.C0339f.f37003p.equals(str)) {
                bundle2.putString(C1821f.C0339f.f36998k, n4);
            }
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.e.p().l(com.google.firebase.analytics.connector.a.class);
            if (aVar != null) {
                aVar.c("fcm", str, bundle2);
            } else {
                Log.w(C1821f.f36920a, "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e(C1821f.f36920a, "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(boolean z3) {
        com.google.firebase.e.p().n().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean(f36475d, z3).apply();
    }

    private static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString(C1821f.a.f36930g))) {
            com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) com.google.firebase.e.p().l(com.google.firebase.analytics.connector.a.class);
            if (Log.isLoggable(C1821f.f36920a, 3)) {
                Log.d(C1821f.f36920a, "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (aVar != null) {
                String string = bundle.getString(C1821f.a.f36926c);
                aVar.f("fcm", C1821f.C0339f.f37004q, string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", f36472a);
                bundle2.putString("medium", f36473b);
                bundle2.putString("campaign", string);
                aVar.c("fcm", C1821f.C0339f.f36999l, bundle2);
                return;
            }
            Log.w(C1821f.f36920a, "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        if (Log.isLoggable(C1821f.f36920a, 3)) {
            Log.d(C1821f.f36920a, "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean D(Intent intent) {
        if (intent != null && !u(intent)) {
            return a();
        }
        return false;
    }

    public static boolean E(Intent intent) {
        if (intent != null && !u(intent)) {
            return F(intent.getExtras());
        }
        return false;
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(C1821f.a.f36925b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.e.p();
            Context n4 = com.google.firebase.e.p().n();
            SharedPreferences sharedPreferences = n4.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f36475d)) {
                return sharedPreferences.getBoolean(f36475d, false);
            }
            try {
                PackageManager packageManager = n4.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(n4.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f36476e)) {
                    return applicationInfo.metaData.getBoolean(f36476e, false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i(C1821f.f36920a, "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static MessagingClientEvent b(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.a j4 = MessagingClientEvent.q().p(s(extras)).g(event).h(f(extras)).k(o()).n(MessagingClientEvent.SDKPlatform.ANDROID).j(m(extras));
        String h4 = h(extras);
        if (h4 != null) {
            j4.i(h4);
        }
        String r4 = r(extras);
        if (r4 != null) {
            j4.o(r4);
        }
        String c4 = c(extras);
        if (c4 != null) {
            j4.e(c4);
        }
        String i4 = i(extras);
        if (i4 != null) {
            j4.b(i4);
        }
        String e4 = e(extras);
        if (e4 != null) {
            j4.f(e4);
        }
        long q4 = q(extras);
        if (q4 > 0) {
            j4.m(q4);
        }
        return j4.a();
    }

    @androidx.annotation.P
    static String c(Bundle bundle) {
        return bundle.getString(C1821f.d.f36972e);
    }

    @androidx.annotation.P
    static String d(Bundle bundle) {
        return bundle.getString(C1821f.a.f36926c);
    }

    @androidx.annotation.P
    static String e(Bundle bundle) {
        return bundle.getString(C1821f.a.f36927d);
    }

    @androidx.annotation.N
    static String f(Bundle bundle) {
        String string = bundle.getString(C1821f.d.f36974g);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C1773n.a(com.google.firebase.installations.i.t(com.google.firebase.e.p()).getId());
        } catch (InterruptedException | ExecutionException e4) {
            throw new RuntimeException(e4);
        }
    }

    @androidx.annotation.P
    static String g(Bundle bundle) {
        return bundle.getString(C1821f.a.f36933j);
    }

    @androidx.annotation.P
    static String h(Bundle bundle) {
        String string = bundle.getString(C1821f.d.f36975h);
        if (string == null) {
            return bundle.getString(C1821f.d.f36973f);
        }
        return string;
    }

    @androidx.annotation.P
    static String i(Bundle bundle) {
        return bundle.getString(C1821f.a.f36932i);
    }

    @androidx.annotation.N
    private static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    static int k(Bundle bundle) {
        int p4 = p(bundle);
        if (p4 == 2) {
            return 5;
        }
        if (p4 == 1) {
            return 10;
        }
        return 0;
    }

    @androidx.annotation.P
    static String l(Bundle bundle) {
        return bundle.getString(C1821f.a.f36928e);
    }

    @androidx.annotation.N
    static MessagingClientEvent.MessageType m(Bundle bundle) {
        if (bundle != null && L.v(bundle)) {
            return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
        }
        return MessagingClientEvent.MessageType.DATA_MESSAGE;
    }

    @androidx.annotation.N
    static String n(Bundle bundle) {
        if (bundle != null && L.v(bundle)) {
            return C1821f.C0339f.a.f37007S;
        }
        return C1821f.C0339f.a.f37006R;
    }

    @androidx.annotation.N
    static String o() {
        return com.google.firebase.e.p().n().getPackageName();
    }

    @androidx.annotation.N
    static int p(Bundle bundle) {
        String string = bundle.getString(C1821f.d.f36979l);
        if (string == null) {
            if ("1".equals(bundle.getString(C1821f.d.f36981n))) {
                return 2;
            }
            string = bundle.getString(C1821f.d.f36980m);
        }
        return j(string);
    }

    @androidx.annotation.P
    static long q(Bundle bundle) {
        if (bundle.containsKey(C1821f.d.f36983p)) {
            try {
                return Long.parseLong(bundle.getString(C1821f.d.f36983p));
            } catch (NumberFormatException e4) {
                Log.w(C1821f.f36920a, "error parsing project number", e4);
            }
        }
        com.google.firebase.e p4 = com.google.firebase.e.p();
        String m4 = p4.s().m();
        if (m4 != null) {
            try {
                return Long.parseLong(m4);
            } catch (NumberFormatException e5) {
                Log.w(C1821f.f36920a, "error parsing sender ID", e5);
            }
        }
        String j4 = p4.s().j();
        if (!j4.startsWith("1:")) {
            try {
                return Long.parseLong(j4);
            } catch (NumberFormatException e6) {
                Log.w(C1821f.f36920a, "error parsing app ID", e6);
            }
        } else {
            String[] split = j4.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e7) {
                Log.w(C1821f.f36920a, "error parsing app ID", e7);
            }
        }
        return 0L;
    }

    @androidx.annotation.P
    static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @androidx.annotation.N
    static int s(Bundle bundle) {
        Object obj = bundle.get(C1821f.d.f36976i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(C1821f.f36920a, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    @androidx.annotation.P
    static String t(Bundle bundle) {
        if (bundle.containsKey(C1821f.a.f36929f)) {
            return bundle.getString(C1821f.a.f36929f);
        }
        return null;
    }

    private static boolean u(Intent intent) {
        return FirebaseMessagingService.f36461L.equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A(C1821f.C0339f.f37002o, intent.getExtras());
    }

    public static void w(Intent intent) {
        A(C1821f.C0339f.f37003p, intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A(C1821f.C0339f.f37001n, bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A(C1821f.C0339f.f37000m, intent.getExtras());
        }
        if (D(intent)) {
            z(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.A());
        }
    }

    private static void z(MessagingClientEvent.Event event, Intent intent, @androidx.annotation.P com.google.android.datatransport.h hVar) {
        if (hVar == null) {
            Log.e(C1821f.f36920a, "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        MessagingClientEvent b4 = b(event, intent);
        if (b4 == null) {
            return;
        }
        try {
            hVar.b(C1821f.b.f36934a, com.google.firebase.messaging.reporting.a.class, com.google.android.datatransport.c.b("proto"), new com.google.android.datatransport.f() { // from class: com.google.firebase.messaging.I
                @Override // com.google.android.datatransport.f
                public final Object apply(Object obj) {
                    return ((com.google.firebase.messaging.reporting.a) obj).e();
                }
            }).a(com.google.android.datatransport.d.e(com.google.firebase.messaging.reporting.a.d().b(b4).a()));
        } catch (RuntimeException e4) {
            Log.w(C1821f.f36920a, "Failed to send big query analytics payload.", e4);
        }
    }
}

package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.app.C0;
import androidx.core.content.C0669d;
import com.google.android.gms.cloudmessaging.AbstractC1159b;
import com.google.firebase.messaging.C1821f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1820e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f36901a = "com.google.firebase.messaging.default_notification_color";

    /* renamed from: b, reason: collision with root package name */
    public static final String f36902b = "com.google.firebase.messaging.default_notification_icon";

    /* renamed from: c, reason: collision with root package name */
    public static final String f36903c = "com.google.firebase.messaging.default_notification_channel_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f36904d = "fcm_fallback_notification_channel";

    /* renamed from: e, reason: collision with root package name */
    public static final String f36905e = "fcm_fallback_notification_channel_label";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36906f = "Misc";

    /* renamed from: g, reason: collision with root package name */
    private static final String f36907g = "com.google.firebase.MESSAGING_EVENT";

    /* renamed from: h, reason: collision with root package name */
    private static final int f36908h = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f36909i = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0.g f36910a;

        /* renamed from: b, reason: collision with root package name */
        public final String f36911b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36912c;

        a(C0.g gVar, String str, int i4) {
            this.f36910a = gVar;
            this.f36911b = str;
            this.f36912c = i4;
        }
    }

    private C1820e() {
    }

    @androidx.annotation.P
    private static PendingIntent a(Context context, L l4, String str, PackageManager packageManager) {
        Intent h4 = h(str, l4, packageManager);
        if (h4 == null) {
            return null;
        }
        h4.addFlags(67108864);
        h4.putExtras(l4.A());
        if (s(l4)) {
            h4.putExtra(C1821f.c.f36939E, l4.z());
        }
        return PendingIntent.getActivity(context, i(), h4, n(1073741824));
    }

    @androidx.annotation.P
    private static PendingIntent b(Context context, Context context2, L l4) {
        if (!s(l4)) {
            return null;
        }
        return c(context, context2, new Intent(AbstractC1159b.a.f27898b).putExtras(l4.z()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, i(), new Intent(f36907g).setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(AbstractC1159b.C0262b.f27900b, intent), n(1073741824));
    }

    public static a d(Context context, Context context2, L l4, String str, Bundle bundle) {
        return e(context, context2, l4, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    public static a e(Context context, Context context2, L l4, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) {
        C0.g gVar = new C0.g(context2, str);
        String n4 = l4.n(resources, str2, C1821f.c.f36948g);
        if (!TextUtils.isEmpty(n4)) {
            gVar.P(n4);
        }
        String n5 = l4.n(resources, str2, C1821f.c.f36949h);
        if (!TextUtils.isEmpty(n5)) {
            gVar.O(n5);
            gVar.z0(new C0.e().A(n5));
        }
        gVar.t0(o(packageManager, resources, str2, l4.p(C1821f.c.f36950i), bundle));
        Uri p4 = p(str2, l4, resources);
        if (p4 != null) {
            gVar.x0(p4);
        }
        gVar.N(a(context, l4, str2, packageManager));
        PendingIntent b4 = b(context, context2, l4);
        if (b4 != null) {
            gVar.U(b4);
        }
        Integer j4 = j(context2, l4.p(C1821f.c.f36953l), bundle);
        if (j4 != null) {
            gVar.J(j4.intValue());
        }
        gVar.D(!l4.a(C1821f.c.f36956o));
        gVar.e0(l4.a(C1821f.c.f36955n));
        String p5 = l4.p(C1821f.c.f36954m);
        if (p5 != null) {
            gVar.B0(p5);
        }
        Integer m4 = l4.m();
        if (m4 != null) {
            gVar.k0(m4.intValue());
        }
        Integer r4 = l4.r();
        if (r4 != null) {
            gVar.G0(r4.intValue());
        }
        Integer l5 = l4.l();
        if (l5 != null) {
            gVar.h0(l5.intValue());
        }
        Long j5 = l4.j(C1821f.c.f36965x);
        if (j5 != null) {
            gVar.r0(true);
            gVar.H0(j5.longValue());
        }
        long[] q4 = l4.q();
        if (q4 != null) {
            gVar.F0(q4);
        }
        int[] e4 = l4.e();
        if (e4 != null) {
            gVar.d0(e4[0], e4[1], e4[2]);
        }
        gVar.T(k(l4));
        return new a(gVar, q(l4), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a f(Context context, L l4) {
        Bundle l5 = l(context.getPackageManager(), context.getPackageName());
        return d(context, context, l4, m(context, l4.k(), l5), l5);
    }

    public static a g(Context context, String str, L l4, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        return e(context, context, l4, str2, bundle, str, resources, packageManager);
    }

    private static Intent h(String str, L l4, PackageManager packageManager) {
        String p4 = l4.p(C1821f.c.f36935A);
        if (!TextUtils.isEmpty(p4)) {
            Intent intent = new Intent(p4);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f4 = l4.f();
        if (f4 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f4);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(C1821f.f36920a, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int i() {
        return f36909i.incrementAndGet();
    }

    private static Integer j(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w(C1821f.f36920a, "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i4 = bundle.getInt(f36901a, 0);
        if (i4 != 0) {
            try {
                return Integer.valueOf(C0669d.f(context, i4));
            } catch (Resources.NotFoundException unused2) {
                Log.w(C1821f.f36920a, "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int k(L l4) {
        boolean a4 = l4.a(C1821f.c.f36958q);
        ?? r02 = a4;
        if (l4.a(C1821f.c.f36959r)) {
            r02 = (a4 ? 1 : 0) | 2;
        }
        if (l4.a(C1821f.c.f36960s)) {
            return r02 | 4;
        }
        return r02;
    }

    private static Bundle l(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w(C1821f.f36920a, "Couldn't get own application info: " + e4);
        }
        return Bundle.EMPTY;
    }

    @androidx.annotation.i0
    @TargetApi(26)
    public static String m(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w(C1821f.f36920a, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(f36903c);
            if (!TextUtils.isEmpty(string2)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w(C1821f.f36920a, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w(C1821f.f36920a, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel(f36904d);
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier(f36905e, v.b.f7403e, context.getPackageName());
                if (identifier == 0) {
                    Log.e(C1821f.f36920a, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = f36906f;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(androidx.core.app.T.a(f36904d, string, 3));
            }
            return f36904d;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int n(int i4) {
        return i4 | 67108864;
    }

    private static int o(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && r(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && r(resources, identifier2)) {
                return identifier2;
            }
            Log.w(C1821f.f36920a, "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i4 = bundle.getInt(f36902b, 0);
        if (i4 == 0 || !r(resources, i4)) {
            try {
                i4 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w(C1821f.f36920a, "Couldn't get own application info: " + e4);
            }
        }
        if (i4 == 0 || !r(resources, i4)) {
            return R.drawable.sym_def_app_icon;
        }
        return i4;
    }

    private static Uri p(String str, L l4, Resources resources) {
        String o4 = l4.o();
        if (TextUtils.isEmpty(o4)) {
            return null;
        }
        if (!"default".equals(o4) && resources.getIdentifier(o4, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o4);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String q(L l4) {
        String p4 = l4.p(C1821f.c.f36952k);
        if (!TextUtils.isEmpty(p4)) {
            return p4;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean r(Resources resources, int i4) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C1819d.a(resources.getDrawable(i4, null))) {
                return true;
            }
            Log.e(C1821f.f36920a, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i4);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e(C1821f.f36920a, "Couldn't find resource " + i4 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean s(@androidx.annotation.N L l4) {
        return l4.a(C1821f.a.f36925b);
    }
}

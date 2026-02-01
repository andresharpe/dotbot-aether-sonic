package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.C0;
import androidx.core.app.p1;
import androidx.core.os.C0738a;
import androidx.core.os.C0746i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.C1821f;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.content.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0669d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12187a = "ContextCompat";

    /* renamed from: b, reason: collision with root package name */
    private static final Object f12188b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12189c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static TypedValue f12190d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final String f12191e = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";

    /* renamed from: f, reason: collision with root package name */
    public static final int f12192f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f12193g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f12194h = 4;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(16)
    /* renamed from: androidx.core.content.d$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @InterfaceC0577u
        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @W(19)
    /* renamed from: androidx.core.content.d$b */
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        @InterfaceC0577u
        static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @InterfaceC0577u
        static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(21)
    /* renamed from: androidx.core.content.d$c */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static File a(Context context) {
            return context.getCodeCacheDir();
        }

        @InterfaceC0577u
        static Drawable b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        @InterfaceC0577u
        static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @W(23)
    /* renamed from: androidx.core.content.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0082d {
        private C0082d() {
        }

        @InterfaceC0577u
        static int a(Context context, int i4) {
            return context.getColor(i4);
        }

        @InterfaceC0577u
        static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC0577u
        static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @W(24)
    /* renamed from: androidx.core.content.d$e */
    /* loaded from: classes.dex */
    static class e {
        private e() {
        }

        @InterfaceC0577u
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @InterfaceC0577u
        static File b(Context context) {
            return context.getDataDir();
        }

        @InterfaceC0577u
        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(26)
    /* renamed from: androidx.core.content.d$f */
    /* loaded from: classes.dex */
    public static class f {
        private f() {
        }

        @InterfaceC0577u
        static Intent a(Context context, @androidx.annotation.P BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            if ((i4 & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C0669d.r(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4 & 1);
        }

        @InterfaceC0577u
        static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    @W(28)
    /* renamed from: androidx.core.content.d$g */
    /* loaded from: classes.dex */
    static class g {
        private g() {
        }

        @InterfaceC0577u
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    @W(30)
    /* renamed from: androidx.core.content.d$h */
    /* loaded from: classes.dex */
    static class h {
        private h() {
        }

        @InterfaceC0577u
        static String a(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(33)
    /* renamed from: androidx.core.content.d$i */
    /* loaded from: classes.dex */
    public static class i {
        private i() {
        }

        @InterfaceC0577u
        static Intent a(Context context, @androidx.annotation.P BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4);
        }
    }

    /* renamed from: androidx.core.content.d$j */
    /* loaded from: classes.dex */
    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<Class<?>, String> f12195a;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            f12195a = hashMap;
            hashMap.put(SubscriptionManager.class, "telephony_subscription_service");
            hashMap.put(UsageStatsManager.class, "usagestats");
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, C1821f.C0339f.a.f37007S);
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, C0.f11617w0);
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, FirebaseAnalytics.b.f34811s);
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, L1.a.f1635p3);
            hashMap.put(SearchManager.class, FirebaseAnalytics.a.f34742o);
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }

        private j() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: androidx.core.content.d$k */
    /* loaded from: classes.dex */
    public @interface k {
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public static int a(@androidx.annotation.N Context context, @androidx.annotation.N String str) {
        androidx.core.util.p.e(str, "permission must be non-null");
        if (!C0738a.k() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            if (p1.p(context).a()) {
                return 0;
            }
            return -1;
        }
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    @androidx.annotation.P
    public static Context b(@androidx.annotation.N Context context) {
        return e.a(context);
    }

    private static File c(File file) {
        synchronized (f12189c) {
            try {
                if (!file.exists()) {
                    if (file.mkdirs()) {
                        return file;
                    }
                    Log.w(f12187a, "Unable to create files subdir " + file.getPath());
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @androidx.annotation.P
    public static String d(@androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    @androidx.annotation.N
    public static File e(@androidx.annotation.N Context context) {
        return c.a(context);
    }

    @InterfaceC0569l
    public static int f(@androidx.annotation.N Context context, @InterfaceC0571n int i4) {
        return C0082d.a(context, i4);
    }

    @androidx.annotation.P
    public static ColorStateList g(@androidx.annotation.N Context context, @InterfaceC0571n int i4) {
        return androidx.core.content.res.i.f(context.getResources(), i4, context.getTheme());
    }

    @androidx.annotation.P
    public static File h(@androidx.annotation.N Context context) {
        return e.b(context);
    }

    @androidx.annotation.P
    public static Drawable i(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        return c.b(context, i4);
    }

    @androidx.annotation.N
    public static File[] j(@androidx.annotation.N Context context) {
        return b.a(context);
    }

    @androidx.annotation.N
    public static File[] k(@androidx.annotation.N Context context, @androidx.annotation.P String str) {
        return b.b(context, str);
    }

    @androidx.annotation.N
    public static Executor l(@androidx.annotation.N Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return C0746i.a(new Handler(context.getMainLooper()));
    }

    @androidx.annotation.P
    public static File m(@androidx.annotation.N Context context) {
        return c.c(context);
    }

    @androidx.annotation.N
    public static File[] n(@androidx.annotation.N Context context) {
        return b.c(context);
    }

    @androidx.annotation.P
    public static <T> T o(@androidx.annotation.N Context context, @androidx.annotation.N Class<T> cls) {
        return (T) C0082d.b(context, cls);
    }

    @androidx.annotation.P
    public static String p(@androidx.annotation.N Context context, @androidx.annotation.N Class<?> cls) {
        return C0082d.c(context, cls);
    }

    public static boolean q(@androidx.annotation.N Context context) {
        return e.c(context);
    }

    static String r(Context context) {
        String str = context.getPackageName() + f12191e;
        if (K.d(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    @androidx.annotation.P
    public static Intent s(@androidx.annotation.N Context context, @androidx.annotation.P BroadcastReceiver broadcastReceiver, @androidx.annotation.N IntentFilter intentFilter, int i4) {
        return t(context, broadcastReceiver, intentFilter, null, null, i4);
    }

    @androidx.annotation.P
    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    public static Intent t(@androidx.annotation.N Context context, @androidx.annotation.P BroadcastReceiver broadcastReceiver, @androidx.annotation.N IntentFilter intentFilter, @androidx.annotation.P String str, @androidx.annotation.P Handler handler, int i4) {
        int i5 = i4 & 1;
        if (i5 != 0 && (i4 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i5 != 0) {
            i4 |= 2;
        }
        int i6 = i4;
        int i7 = i6 & 2;
        if (i7 == 0 && (i6 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i7 != 0 && (i6 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (C0738a.k()) {
            return i.a(context, broadcastReceiver, intentFilter, str, handler, i6);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(context, broadcastReceiver, intentFilter, str, handler, i6);
        }
        if ((i6 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, r(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean u(@androidx.annotation.N Context context, @androidx.annotation.N Intent[] intentArr) {
        return v(context, intentArr, null);
    }

    public static boolean v(@androidx.annotation.N Context context, @androidx.annotation.N Intent[] intentArr, @androidx.annotation.P Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }

    public static void w(@androidx.annotation.N Context context, @androidx.annotation.N Intent intent, @androidx.annotation.P Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void x(@androidx.annotation.N Context context, @androidx.annotation.N Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

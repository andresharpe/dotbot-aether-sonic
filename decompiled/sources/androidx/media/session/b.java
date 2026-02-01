package androidx.media.session;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.RestrictTo;
import androidx.media.d;
import java.util.List;

/* loaded from: classes.dex */
public class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16250a = "MediaButtonReceiver";

    /* loaded from: classes.dex */
    private static class a extends MediaBrowserCompat.b {

        /* renamed from: c, reason: collision with root package name */
        private final Context f16251c;

        /* renamed from: d, reason: collision with root package name */
        private final Intent f16252d;

        /* renamed from: e, reason: collision with root package name */
        private final BroadcastReceiver.PendingResult f16253e;

        /* renamed from: f, reason: collision with root package name */
        private MediaBrowserCompat f16254f;

        a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f16251c = context;
            this.f16252d = intent;
            this.f16253e = pendingResult;
        }

        private void e() {
            this.f16254f.b();
            this.f16253e.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void a() {
            try {
                new MediaControllerCompat(this.f16251c, this.f16254f.h()).d((KeyEvent) this.f16252d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            } catch (RemoteException e4) {
                Log.e(b.f16250a, "Failed to create a media controller", e4);
            }
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void b() {
            e();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void c() {
            e();
        }

        void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f16254f = mediaBrowserCompat;
        }
    }

    public static PendingIntent a(Context context, long j4) {
        ComponentName c4 = c(context);
        if (c4 == null) {
            Log.w(f16250a, "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        return b(context, c4, j4);
    }

    public static PendingIntent b(Context context, ComponentName componentName, long j4) {
        if (componentName == null) {
            Log.w(f16250a, "The component name of media button receiver should be provided.");
            return null;
        }
        int s4 = PlaybackStateCompat.s(j4);
        if (s4 == 0) {
            Log.w(f16250a, "Cannot build a media button pending intent with the given action: " + j4);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, s4));
        return PendingIntent.getBroadcast(context, s4, intent, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static ComponentName c(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        }
        if (queryBroadcastReceivers.size() > 1) {
            Log.w(f16250a, "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
        return null;
    }

    private static ComponentName d(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (queryIntentServices.isEmpty()) {
            return null;
        }
        throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
    }

    public static KeyEvent e(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.e().d(keyEvent);
            return keyEvent;
        }
        return null;
    }

    private static void f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName d4 = d(context, "android.intent.action.MEDIA_BUTTON");
            if (d4 != null) {
                intent.setComponent(d4);
                f(context, intent);
                return;
            }
            ComponentName d5 = d(context, d.f15940M);
            if (d5 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, d5, aVar, null);
                aVar.f(mediaBrowserCompat);
                mediaBrowserCompat.a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        Log.d(f16250a, "Ignore unsupported intent: " + intent);
    }
}

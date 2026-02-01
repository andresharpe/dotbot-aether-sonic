package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Y;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.stats.d;

/* loaded from: classes.dex */
public final class zzfk {
    static final Object zza = new Object();
    static d zzb;
    static Boolean zzc;

    public static boolean zza(Context context) {
        C1285y.l(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zzi);
        return zzi;
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public static final void zzb(Context context, Intent intent) {
        zzbx zzg = zzbx.zzg(context);
        zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzO("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zzh = zzfp.zzh(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (zza) {
                context.startService(intent2);
                if (!zzh) {
                    return;
                }
                try {
                    if (zzb == null) {
                        d dVar = new d(context, 1, "Analytics WakeLock");
                        zzb = dVar;
                        dVar.d(false);
                    }
                    zzb.a(1000L);
                } catch (SecurityException unused) {
                    zzm.zzQ("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }
}

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.Y;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzcv;
import com.google.android.gms.internal.gtm.zzfd;
import com.google.android.gms.internal.gtm.zzfu;
import com.spotify.sdk.android.auth.b;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.analytics.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1153a extends BroadcastReceiver {

    @P
    static Boolean zza;

    public static boolean zzb(@N Context context) {
        C1285y.l(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zzi = zzfu.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zzi);
        return zzi;
    }

    @Override // android.content.BroadcastReceiver
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public void onReceive(@N Context context, @P Intent intent) {
        zzbx zzg = zzbx.zzg(context);
        zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra(b.c.f48987b);
        String action = intent.getAction();
        zzm.zzO("CampaignTrackingReceiver received", action);
        if ("com.android.vending.INSTALL_REFERRER".equals(action) && !TextUtils.isEmpty(stringExtra)) {
            zza(context, stringExtra);
            zzg.zzj();
            zzg.zzj();
            int zzf = zzcv.zzf();
            if (stringExtra.length() > zzf) {
                zzm.zzS("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(zzf));
                stringExtra = stringExtra.substring(0, zzf);
            }
            zzg.zzf().zzf(stringExtra, new l(this, goAsync()));
            return;
        }
        zzm.zzQ("CampaignTrackingReceiver received unexpected intent without referrer extra");
    }

    protected void zza(@N Context context, @N String str) {
    }
}

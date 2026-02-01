package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.util.D;

/* loaded from: classes2.dex */
final class zzdj extends BroadcastReceiver {

    @D
    static final String zza = "com.google.android.gms.tagmanager.zzdj";
    private final zzex zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdj(zzex zzexVar) {
        this.zzb = zzexVar;
    }

    public static void zza(Context context) {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(zza, true);
        context.sendBroadcast(intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            Bundle extras = intent.getExtras();
            Boolean bool = Boolean.FALSE;
            if (extras != null) {
                bool = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            this.zzb.zzc(!bool.booleanValue());
            return;
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(zza)) {
            this.zzb.zzb();
        }
    }
}

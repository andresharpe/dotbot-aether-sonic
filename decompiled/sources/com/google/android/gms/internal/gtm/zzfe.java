package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfe extends BroadcastReceiver {

    @D
    static final String zza = "com.google.android.gms.internal.gtm.zzfe";
    private final zzbx zzb;
    private boolean zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfe(zzbx zzbxVar) {
        C1285y.l(zzbxVar);
        this.zzb = zzbxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zze = zze();
            if (this.zzd != zze) {
                this.zzd = zze;
                zzbs zzf = this.zzb.zzf();
                zzf.zzO("Network connectivity status changed", Boolean.valueOf(zze));
                zzf.zzq().i(new zzbl(zzf, zze));
                return;
            }
            return;
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(zza)) {
                zzbs zzf2 = this.zzb.zzf();
                zzf2.zzN("Radio powered up");
                zzf2.zzc();
                return;
            }
            return;
        }
        this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if (this.zzc) {
            return;
        }
        Context zza2 = this.zzb.zza();
        zza2.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(zza2.getPackageName());
        zza2.registerReceiver(this, intentFilter);
        this.zzd = zze();
        this.zzb.zzm().zzO("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    @D
    public final void zzb() {
        Context zza2 = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(zza2.getPackageName());
        intent.putExtra(zza, true);
        zza2.sendOrderedBroadcast(intent, null);
    }

    public final void zzc() {
        if (!this.zzc) {
            return;
        }
        this.zzb.zzm().zzN("Unregistering connectivity change receiver");
        this.zzc = false;
        this.zzd = false;
        try {
            this.zzb.zza().unregisterReceiver(this);
        } catch (IllegalArgumentException e4) {
            this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", e4);
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    @D
    protected final boolean zze() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.zza().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }
}

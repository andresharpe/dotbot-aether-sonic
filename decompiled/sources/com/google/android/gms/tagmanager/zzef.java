package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.internal.gtm.zzbep;
import com.google.android.gms.internal.gtm.zzsd;
import com.google.android.gms.internal.gtm.zzsg;
import com.google.android.gms.internal.gtm.zzsh;
import com.google.android.gms.internal.gtm.zzsi;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class zzef implements Runnable {
    private final Context zza;
    private final zzsh zzb;
    private final String zzc;
    private final String zzd;
    private zzdf zze;
    private volatile zzao zzf;
    private volatile String zzg;
    private volatile String zzh;

    public zzef(Context context, String str, zzao zzaoVar) {
        zzsh zzshVar = new zzsh();
        this.zza = context;
        this.zzb = zzshVar;
        this.zzc = str;
        this.zzf = zzaoVar;
        String concat = "/r?id=".concat(String.valueOf(str));
        this.zzd = concat;
        this.zzg = concat;
        this.zzh = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzal zzalVar;
        InterfaceC1306g interfaceC1306g;
        long j4;
        boolean zzv;
        com.google.android.gms.internal.gtm.zzak zzakVar;
        com.google.android.gms.internal.gtm.zzak zzakVar2;
        zzal zzalVar2;
        if (this.zze != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zza.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                zzdg.zzb.zzd("Start loading resource from network ...");
                String str = this.zzf.zza() + this.zzg + "&v=a65833898";
                if (this.zzh != null && !this.zzh.trim().isEmpty()) {
                    str = str + "&pv=" + this.zzh;
                }
                int zze = zzdz.zza().zze();
                InputStream inputStream = null;
                if (zze != 0) {
                    if (zze == 3) {
                        str = str.concat("&gtm_debug=x");
                    }
                    zzsg zza = zzsh.zza();
                    try {
                        try {
                            try {
                                try {
                                    inputStream = zza.zza(str);
                                } catch (zzsi unused) {
                                    Log.w("GoogleTagManager", "Error when loading resource for url: " + str);
                                    this.zze.zza(4);
                                }
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    zzsd.zzc(inputStream, byteArrayOutputStream);
                                    com.google.android.gms.internal.gtm.zzak zzg = com.google.android.gms.internal.gtm.zzak.zzg(byteArrayOutputStream.toByteArray(), zzbep.zza());
                                    String str2 = "Successfully loaded supplemented resource: " + String.valueOf(zzg);
                                    zzbf zzbfVar = zzdg.zzb;
                                    zzbfVar.zzd(str2);
                                    if (!zzg.zzm() && zzg.zza() == 0) {
                                        zzbfVar.zzd("No change for container: " + this.zzc);
                                    }
                                    zzdf zzdfVar = this.zze;
                                    zzalVar = ((zzaf) zzdfVar).zza.zzi;
                                    zzalVar.zzd();
                                    synchronized (((zzaf) zzdfVar).zza) {
                                        try {
                                            if (!zzg.zzm()) {
                                                zzakVar = ((zzaf) zzdfVar).zza.zzn;
                                                if (!zzakVar.zzm()) {
                                                    Log.e("GoogleTagManager", "Current resource is null; network resource is also null");
                                                    zzalVar2 = ((zzaf) zzdfVar).zza.zzi;
                                                    ((zzaf) zzdfVar).zza.zzr(zzalVar2.zzb());
                                                } else {
                                                    com.google.android.gms.internal.gtm.zzaj zzajVar = (com.google.android.gms.internal.gtm.zzaj) zzg.zzaa();
                                                    zzakVar2 = ((zzaf) zzdfVar).zza.zzn;
                                                    zzajVar.zzc(zzakVar2.zzc());
                                                    zzg = (com.google.android.gms.internal.gtm.zzak) zzajVar.zzC();
                                                }
                                            }
                                            zzak zzakVar3 = ((zzaf) zzdfVar).zza;
                                            interfaceC1306g = zzakVar3.zza;
                                            zzakVar3.zzu(zzg, interfaceC1306g.a(), false);
                                            j4 = ((zzaf) zzdfVar).zza.zzo;
                                            zzbfVar.zzd("setting refresh time to current time: " + j4);
                                            zzv = ((zzaf) zzdfVar).zza.zzv();
                                            if (!zzv) {
                                                ((zzaf) zzdfVar).zza.zzt(zzg);
                                            }
                                        } finally {
                                        }
                                    }
                                    zza.zzb();
                                    zzbfVar.zzd("Load resource from network finished.");
                                    return;
                                } catch (IOException e4) {
                                    Log.w("GoogleTagManager", "Error when parsing downloaded resources from url: " + str + " " + e4.getMessage(), e4);
                                    this.zze.zza(3);
                                    zza.zzb();
                                    return;
                                }
                            } catch (IOException e5) {
                                Log.w("GoogleTagManager", "Error when loading resources from url: " + str + " " + e5.getMessage(), e5);
                                this.zze.zza(2);
                                zza.zzb();
                                return;
                            }
                        } catch (FileNotFoundException unused2) {
                            Log.w("GoogleTagManager", "No data is retrieved from the given url: " + str + ". Make sure container_id: " + this.zzc + " is correct.");
                            this.zze.zza(3);
                            zza.zzb();
                            return;
                        }
                    } catch (Throwable th) {
                        zza.zzb();
                        throw th;
                    }
                }
                throw null;
            }
            zzdg.zzb.zzd("...no network connectivity");
            this.zze.zza(1);
            return;
        }
        throw new IllegalStateException("callback must be set before execute");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final void zza(String str) {
        if (str == null) {
            str = this.zzd;
        } else {
            zzdg.zzb.zza("Setting CTFE URL path: ".concat(str));
        }
        this.zzg = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzdf zzdfVar) {
        this.zze = zzdfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final void zzc(String str) {
        zzdg.zzb.zza("Setting previous container version: ".concat(String.valueOf(str)));
        this.zzh = str;
    }
}

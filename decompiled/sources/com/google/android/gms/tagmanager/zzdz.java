package com.google.android.gms.tagmanager;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: Access modifiers changed from: package-private */
@D
@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public final class zzdz {
    private static zzdz zza;
    private volatile int zze = 1;
    private volatile String zzc = null;
    private volatile String zzb = null;
    private volatile String zzd = null;

    zzdz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public static zzdz zza() {
        zzdz zzdzVar;
        synchronized (zzdz.class) {
            try {
                if (zza == null) {
                    zza = new zzdz();
                }
                zzdzVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzdzVar;
    }

    private static final String zzf(String str) {
        return str.split("&")[0].split("=")[1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzd(Uri uri) {
        try {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    zzdg.zzb.zzd("Container preview url: ".concat(decode));
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.zze = 3;
                    } else {
                        this.zze = 2;
                    }
                    this.zzd = uri.getQuery().replace("&gtm_debug=x", "");
                    if (this.zze == 2 || this.zze == 3) {
                        this.zzc = "/r?".concat(String.valueOf(this.zzd));
                    }
                    this.zzb = zzf(this.zzd);
                    return true;
                }
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    if (!zzf(uri.getQuery()).equals(this.zzb)) {
                        return false;
                    }
                    zzdg.zzb.zzd("Exit preview mode for container: ".concat(String.valueOf(this.zzb)));
                    this.zze = 1;
                    this.zzc = null;
                    return true;
                }
                Log.w("GoogleTagManager", "Invalid preview uri: ".concat(decode));
                return false;
            } catch (UnsupportedEncodingException unused) {
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return this.zze;
    }
}

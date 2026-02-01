package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza implements zzc {
    final /* synthetic */ zzd zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(zzd zzdVar) {
        this.zza = zzdVar;
    }

    @Override // com.google.android.gms.tagmanager.zzc
    public final a.C0259a zza() {
        Context context;
        try {
            context = this.zza.zzi;
            return a.a(context);
        } catch (GooglePlayServicesNotAvailableException e4) {
            this.zza.zze();
            Log.w("GoogleTagManager", "GooglePlayServicesNotAvailableException getting Advertising Id Info", e4);
            return null;
        } catch (GooglePlayServicesRepairableException e5) {
            Log.w("GoogleTagManager", "GooglePlayServicesRepairableException getting Advertising Id Info", e5);
            return null;
        } catch (IOException e6) {
            Log.w("GoogleTagManager", "IOException getting Ad Id Info", e6);
            return null;
        } catch (IllegalStateException e7) {
            Log.w("GoogleTagManager", "IllegalStateException getting Advertising Id Info", e7);
            return null;
        } catch (Exception e8) {
            Log.w("GoogleTagManager", "Unknown exception. Could not get the Advertising Id Info.", e8);
            return null;
        }
    }
}

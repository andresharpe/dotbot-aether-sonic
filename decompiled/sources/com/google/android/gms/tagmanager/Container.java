package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzsc;
import com.google.android.gms.internal.gtm.zzsd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@D
/* loaded from: classes2.dex */
public class Container {
    private final Context zza;
    private final String zzb;
    private final DataLayer zzc;
    private zzet zzd;
    private Map zze;
    private Map zzf;
    private volatile long zzg;
    private volatile String zzh;

    /* loaded from: classes2.dex */
    public interface FunctionCallMacroCallback {
        @N
        Object getValue(@N String str, @N Map<String, Object> map);
    }

    /* loaded from: classes2.dex */
    public interface FunctionCallTagCallback {
        void execute(@N String str, @N Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j4, com.google.android.gms.internal.gtm.zzak zzakVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = j4;
        com.google.android.gms.internal.gtm.zzac zzc = zzakVar.zzc();
        zzc.getClass();
        try {
            zzg(zzsd.zzb(zzc));
        } catch (zzsc e4) {
            Log.e("GoogleTagManager", "Not loading resource: " + zzc.toString() + " because it is invalid: " + e4.toString());
        }
        if (zzakVar.zza() != 0) {
            com.google.android.gms.internal.gtm.zzai[] zzaiVarArr = (com.google.android.gms.internal.gtm.zzai[]) zzakVar.zzi().toArray(new com.google.android.gms.internal.gtm.zzai[0]);
            zzet zzf = zzf();
            if (zzf == null) {
                Log.e("GoogleTagManager", "evaluateTags called for closed container.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.internal.gtm.zzai zzaiVar : zzaiVarArr) {
                arrayList.add(zzaiVar);
            }
            zzf.zze(arrayList);
        }
    }

    private final synchronized zzet zzf() {
        return this.zzd;
    }

    private final void zzg(zzrv zzrvVar) {
        this.zzh = zzrvVar.zzb();
        zzh(new zzet((Context) C1285y.l(this.zza), zzrvVar, (DataLayer) C1285y.l(this.zzc), new zzu(this, null), new zzw(this, null), new zzdk(), null));
        if (getBoolean("_gtm.loadEventEnabled")) {
            this.zzc.pushEvent("gtm.load", DataLayer.mapOf("gtm.id", C1285y.l(this.zzb)));
        }
    }

    private final synchronized void zzh(zzet zzetVar) {
        this.zzd = zzetVar;
    }

    public boolean getBoolean(@N String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getBoolean called for closed container.");
            return zzfu.zzf().booleanValue();
        }
        try {
            return zzfu.zzg(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).booleanValue();
        } catch (Exception e4) {
            Log.e("GoogleTagManager", "Calling getBoolean() threw an exception: " + e4.getMessage() + " Returning default value.");
            return zzfu.zzf().booleanValue();
        }
    }

    @N
    public String getContainerId() {
        return this.zzb;
    }

    public double getDouble(@N String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getDouble called for closed container.");
            return zzfu.zzh().doubleValue();
        }
        try {
            return zzfu.zzi(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).doubleValue();
        } catch (Exception e4) {
            Log.e("GoogleTagManager", "Calling getDouble() threw an exception: " + e4.getMessage() + " Returning default value.");
            return zzfu.zzh().doubleValue();
        }
    }

    public long getLastRefreshTime() {
        return this.zzg;
    }

    public long getLong(@N String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getLong called for closed container.");
            return zzfu.zzj().longValue();
        }
        try {
            return zzfu.zzk(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza())).longValue();
        } catch (Exception e4) {
            Log.e("GoogleTagManager", "Calling getLong() threw an exception: " + e4.getMessage() + " Returning default value.");
            return zzfu.zzj().longValue();
        }
    }

    @N
    public String getString(@N String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "getString called for closed container.");
            return zzfu.zzm();
        }
        try {
            return zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzf.zza(str).zza()));
        } catch (Exception e4) {
            Log.e("GoogleTagManager", "Calling getString() threw an exception: " + e4.getMessage() + " Returning default value.");
            return zzfu.zzm();
        }
    }

    public boolean isDefault() {
        if (getLastRefreshTime() == 0) {
            return true;
        }
        return false;
    }

    public void registerFunctionCallMacroCallback(@N String str, @N FunctionCallMacroCallback functionCallMacroCallback) {
        if (functionCallMacroCallback != null) {
            synchronized (this.zze) {
                this.zze.put(str, functionCallMacroCallback);
            }
            return;
        }
        throw new NullPointerException("Macro handler must be non-null");
    }

    public void registerFunctionCallTagCallback(@N String str, @N FunctionCallTagCallback functionCallTagCallback) {
        if (functionCallTagCallback != null) {
            synchronized (this.zzf) {
                this.zzf.put(str, functionCallTagCallback);
            }
            return;
        }
        throw new NullPointerException("Tag callback must be non-null");
    }

    public void unregisterFunctionCallMacroCallback(@N String str) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
    }

    public void unregisterFunctionCallTagCallback(@N String str) {
        synchronized (this.zzf) {
            this.zzf.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @D
    public final FunctionCallMacroCallback zza(String str) {
        FunctionCallMacroCallback functionCallMacroCallback;
        synchronized (this.zze) {
            functionCallMacroCallback = (FunctionCallMacroCallback) this.zze.get(str);
        }
        return functionCallMacroCallback;
    }

    @N
    @D
    public final FunctionCallTagCallback zzb(@N String str) {
        FunctionCallTagCallback functionCallTagCallback;
        synchronized (this.zzf) {
            functionCallTagCallback = (FunctionCallTagCallback) this.zzf.get(str);
        }
        return functionCallTagCallback;
    }

    @N
    @D
    public final String zzc() {
        return this.zzh;
    }

    @D
    public final void zzd(@N String str) {
        zzet zzf = zzf();
        if (zzf == null) {
            Log.e("GoogleTagManager", "evaluateTags called for closed container.");
        } else {
            zzf.zzc(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Container(Context context, DataLayer dataLayer, String str, long j4, zzrv zzrvVar) {
        this.zze = new HashMap();
        this.zzf = new HashMap();
        this.zzh = "";
        this.zza = context;
        this.zzc = dataLayer;
        this.zzb = str;
        this.zzg = 0L;
        zzg(zzrvVar);
    }
}

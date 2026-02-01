package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.V;
import androidx.annotation.Y;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@D
/* loaded from: classes2.dex */
public class TagManager {
    private static TagManager zza;
    private final zzfo zzb;
    private final Context zzc;
    private final DataLayer zzd;
    private final zzex zze;
    private final ConcurrentMap zzf;
    private final zzao zzg;

    @D
    TagManager(Context context, zzfo zzfoVar, DataLayer dataLayer, zzex zzexVar) {
        Context applicationContext = context.getApplicationContext();
        this.zzc = applicationContext;
        this.zze = zzexVar;
        this.zzb = zzfoVar;
        this.zzf = new ConcurrentHashMap();
        this.zzd = dataLayer;
        dataLayer.zzg(new zzfl(this));
        dataLayer.zzg(new zzg(applicationContext));
        this.zzg = new zzao();
        C1285y.l(applicationContext);
        applicationContext.registerComponentCallbacks(new zzfn(this));
        C1285y.l(applicationContext);
        zzd.zzb(applicationContext);
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    @N
    public static TagManager getInstance(@N Context context) {
        TagManager tagManager;
        synchronized (TagManager.class) {
            try {
                if (zza == null) {
                    if (context != null) {
                        zza = new TagManager(context, new zzfm(), new DataLayer(new zzbd(context)), zzfe.zzg());
                    } else {
                        Log.e("GoogleTagManager", "TagManager.getInstance requires non-null context.");
                        throw null;
                    }
                }
                tagManager = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tagManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(TagManager tagManager, String str) {
        C1285y.l(tagManager.zzf);
        Iterator it = tagManager.zzf.values().iterator();
        while (it.hasNext()) {
            ((zzz) it.next()).zzd(str);
        }
    }

    public void dispatch() {
        this.zze.zza();
    }

    @N
    public DataLayer getDataLayer() {
        return this.zzd;
    }

    @N
    public l<ContainerHolder> loadContainerDefaultOnly(@N String str, @V int i4) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i4, this.zzg);
        zzakVar.zzl();
        return zzakVar;
    }

    @N
    public l<ContainerHolder> loadContainerPreferFresh(@N String str, @V int i4) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i4, this.zzg);
        zzakVar.zzm();
        return zzakVar;
    }

    @N
    public l<ContainerHolder> loadContainerPreferNonDefault(@N String str, @V int i4) {
        zzak zzakVar = new zzak(this.zzc, this, null, str, i4, this.zzg);
        zzakVar.zzn();
        return zzakVar;
    }

    public void setVerboseLoggingEnabled(boolean z3) {
        int i4;
        if (true != z3) {
            i4 = 5;
        } else {
            i4 = 2;
        }
        zzdg.zza = i4;
        zzdg.zzb.zzc(i4);
    }

    @D
    public final int zza(zzz zzzVar) {
        this.zzf.put(zzzVar.zza(), zzzVar);
        return this.zzf.size();
    }

    @D
    public final boolean zzc(zzz zzzVar) {
        if (this.zzf.remove(zzzVar.zza()) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzd(Uri uri) {
        try {
            zzdz zza2 = zzdz.zza();
            if (zza2.zzd(uri)) {
                String zzc = zza2.zzc();
                int zze = zza2.zze();
                int i4 = zze - 1;
                if (zze != 0) {
                    if (i4 != 0) {
                        if (i4 == 1 || i4 == 2) {
                            for (String str : this.zzf.keySet()) {
                                zzz zzzVar = (zzz) this.zzf.get(str);
                                if (str.equals(zzc)) {
                                    zzzVar.zze(zza2.zzb());
                                    zzzVar.refresh();
                                } else if (zzzVar.zzb() != null) {
                                    zzzVar.zze(null);
                                    zzzVar.refresh();
                                }
                            }
                        }
                    } else {
                        zzz zzzVar2 = (zzz) this.zzf.get(zzc);
                        if (zzzVar2 != null) {
                            zzzVar2.zze(null);
                            zzzVar2.refresh();
                        }
                    }
                    return true;
                }
                throw null;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @N
    public l<ContainerHolder> loadContainerDefaultOnly(@N String str, @V int i4, @N Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i4, this.zzg);
        zzakVar.zzl();
        return zzakVar;
    }

    @N
    public l<ContainerHolder> loadContainerPreferFresh(@N String str, @V int i4, @N Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i4, this.zzg);
        zzakVar.zzm();
        return zzakVar;
    }

    @N
    public l<ContainerHolder> loadContainerPreferNonDefault(@N String str, @V int i4, @N Handler handler) {
        zzak zzakVar = new zzak(this.zzc, this, handler.getLooper(), str, i4, this.zzg);
        zzakVar.zzn();
        return zzakVar;
    }
}

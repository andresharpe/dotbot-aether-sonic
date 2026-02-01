package com.google.android.gms.tagmanager;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.D;
import com.google.android.gms.tagmanager.ContainerHolder;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzz implements ContainerHolder {
    private final Looper zza;
    private Container zzb;
    private Container zzc;
    private final Status zzd;
    private zzy zze;
    private zzx zzf;
    private boolean zzg;
    private TagManager zzh;

    public zzz(Status status) {
        this.zzd = status;
        this.zza = null;
    }

    private final void zzf() {
        zzy zzyVar = this.zze;
        if (zzyVar != null) {
            zzyVar.sendMessage(zzyVar.obtainMessage(1, this.zzc.zzc()));
        }
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized Container getContainer() {
        if (this.zzg) {
            Log.e("GoogleTagManager", "ContainerHolder is released.");
            return null;
        }
        Container container = this.zzc;
        if (container != null) {
            this.zzb = container;
            this.zzc = null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.q
    public final Status getStatus() {
        return this.zzd;
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized void refresh() {
        if (this.zzg) {
            Log.e("GoogleTagManager", "Refreshing a released ContainerHolder.");
        } else {
            this.zzf.zzb();
        }
    }

    @Override // com.google.android.gms.common.api.n
    public final synchronized void release() {
        if (this.zzg) {
            Log.e("GoogleTagManager", "Releasing a released ContainerHolder.");
            return;
        }
        this.zzg = true;
        this.zzh.zzc(this);
        this.zzb.zze();
        this.zzb = null;
        this.zzc = null;
        this.zzf = null;
        this.zze = null;
    }

    @Override // com.google.android.gms.tagmanager.ContainerHolder
    public final synchronized void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containerAvailableListener) {
        if (this.zzg) {
            Log.e("GoogleTagManager", "ContainerHolder is released.");
            return;
        }
        if (containerAvailableListener == null) {
            this.zze = null;
            return;
        }
        this.zze = new zzy(this, containerAvailableListener, this.zza);
        if (this.zzc != null) {
            zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zza() {
        if (this.zzg) {
            Log.e("GoogleTagManager", "getContainerId called on a released ContainerHolder.");
            return "";
        }
        return this.zzb.getContainerId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        if (this.zzg) {
            Log.e("GoogleTagManager", "setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        return this.zzf.zza();
    }

    public final synchronized void zzc(Container container) {
        if (this.zzg) {
            return;
        }
        this.zzc = container;
        zzf();
    }

    public final synchronized void zzd(String str) {
        if (this.zzg) {
            return;
        }
        this.zzb.zzd(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str) {
        if (this.zzg) {
            Log.e("GoogleTagManager", "setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.zzf.zzc(str);
        }
    }

    public zzz(TagManager tagManager, Looper looper, Container container, zzx zzxVar) {
        this.zzh = tagManager;
        this.zza = looper == null ? Looper.getMainLooper() : looper;
        this.zzb = container;
        this.zzf = zzxVar;
        this.zzd = Status.f28025K;
        tagManager.zza(this);
    }
}

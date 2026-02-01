package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public abstract class zzbu extends zzbt {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbu(zzbx zzbxVar) {
        super(zzbxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzV() {
        if (zzX()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzW() {
        zzd();
        this.zza = true;
    }

    public final boolean zzX() {
        return this.zza;
    }

    protected abstract void zzd();
}

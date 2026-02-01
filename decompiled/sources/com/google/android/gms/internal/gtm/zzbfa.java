package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public class zzbfa extends zzbez implements zzbgt {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzbfa(zzbfb zzbfbVar) {
        super(zzbfbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbez
    public final void zzF() {
        super.zzF();
        zzbfb zzbfbVar = (zzbfb) this.zza;
        zzbfbVar.zzb = zzbfbVar.zzb.clone();
    }

    @Override // com.google.android.gms.internal.gtm.zzbez, com.google.android.gms.internal.gtm.zzbgr
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzbfb zzD() {
        if (this.zzb) {
            return (zzbfb) this.zza;
        }
        ((zzbfb) this.zza).zzb.zzi();
        return (zzbfb) super.zzD();
    }
}

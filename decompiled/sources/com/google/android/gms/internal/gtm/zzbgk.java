package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbgk implements zzbhg {
    private static final zzbgq zza = new zzbgi();
    private final zzbgq zzb;

    public zzbgk() {
        zzbgq zzbgqVar;
        zzbgq[] zzbgqVarArr = new zzbgq[2];
        zzbgqVarArr[0] = zzbey.zza();
        try {
            zzbgqVar = (zzbgq) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzbgqVar = zza;
        }
        zzbgqVarArr[1] = zzbgqVar;
        zzbgj zzbgjVar = new zzbgj(zzbgqVarArr);
        zzbfq.zzf(zzbgjVar, "messageInfoFactory");
        this.zzb = zzbgjVar;
    }

    private static boolean zzb(zzbgp zzbgpVar) {
        if (zzbgpVar.zzc() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhg
    public final zzbhf zza(Class cls) {
        zzbhh.zzG(cls);
        zzbgp zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzbff.class.isAssignableFrom(cls)) {
                return zzbgw.zzc(zzbhh.zzB(), zzbes.zzb(), zzb.zza());
            }
            return zzbgw.zzc(zzbhh.zzz(), zzbes.zza(), zzb.zza());
        }
        if (zzbff.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzbgv.zzl(cls, zzb, zzbgz.zzb(), zzbgg.zze(), zzbhh.zzB(), zzbes.zzb(), zzbgo.zzb());
            }
            return zzbgv.zzl(cls, zzb, zzbgz.zzb(), zzbgg.zze(), zzbhh.zzB(), null, zzbgo.zzb());
        }
        if (zzb(zzb)) {
            return zzbgv.zzl(cls, zzb, zzbgz.zza(), zzbgg.zzd(), zzbhh.zzz(), zzbes.zza(), zzbgo.zza());
        }
        return zzbgv.zzl(cls, zzb, zzbgz.zza(), zzbgg.zzd(), zzbhh.zzA(), null, zzbgo.zza());
    }
}

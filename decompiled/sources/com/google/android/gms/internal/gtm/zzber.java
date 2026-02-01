package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzber extends zzbeq {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final int zza(Map.Entry entry) {
        return ((zzbfc) entry.getKey()).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final zzbeu zzb(Object obj) {
        return ((zzbfb) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final zzbeu zzc(Object obj) {
        return ((zzbfb) obj).zzV();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final Object zzd(zzbep zzbepVar, zzbgs zzbgsVar, int i4) {
        return zzbepVar.zzb(zzbgsVar, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final Object zze(zzbhe zzbheVar, Object obj, zzbep zzbepVar, zzbeu zzbeuVar, Object obj2, zzbhz zzbhzVar) throws IOException {
        Object valueOf;
        Object zzf;
        zzbfd zzbfdVar = (zzbfd) obj;
        zzbfc zzbfcVar = zzbfdVar.zzd;
        int i4 = zzbfcVar.zzb;
        zzbip zzbipVar = zzbfcVar.zzc;
        if (zzbipVar == zzbip.zzn) {
            int zzg = zzbheVar.zzg();
            if (zzbfdVar.zzd.zza.zza(zzg) == null) {
                return zzbhh.zzD(i4, zzg, obj2, zzbhzVar);
            }
            valueOf = Integer.valueOf(zzg);
        } else {
            switch (zzbipVar.ordinal()) {
                case 0:
                    valueOf = Double.valueOf(zzbheVar.zza());
                    break;
                case 1:
                    valueOf = Float.valueOf(zzbheVar.zzb());
                    break;
                case 2:
                    valueOf = Long.valueOf(zzbheVar.zzl());
                    break;
                case 3:
                    valueOf = Long.valueOf(zzbheVar.zzo());
                    break;
                case 4:
                    valueOf = Integer.valueOf(zzbheVar.zzg());
                    break;
                case 5:
                    valueOf = Long.valueOf(zzbheVar.zzk());
                    break;
                case 6:
                    valueOf = Integer.valueOf(zzbheVar.zzf());
                    break;
                case 7:
                    valueOf = Boolean.valueOf(zzbheVar.zzS());
                    break;
                case 8:
                    valueOf = zzbheVar.zzv();
                    break;
                case 9:
                    valueOf = zzbheVar.zzr(zzbfdVar.zzc.getClass(), zzbepVar);
                    break;
                case 10:
                    valueOf = zzbheVar.zzt(zzbfdVar.zzc.getClass(), zzbepVar);
                    break;
                case 11:
                    valueOf = zzbheVar.zzq();
                    break;
                case 12:
                    valueOf = Integer.valueOf(zzbheVar.zzj());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    valueOf = Integer.valueOf(zzbheVar.zzh());
                    break;
                case 15:
                    valueOf = Long.valueOf(zzbheVar.zzm());
                    break;
                case 16:
                    valueOf = Integer.valueOf(zzbheVar.zzi());
                    break;
                case 17:
                    valueOf = Long.valueOf(zzbheVar.zzn());
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        zzbfc zzbfcVar2 = zzbfdVar.zzd;
        if (zzbfcVar2.zzd) {
            zzbeuVar.zzh(zzbfcVar2, valueOf);
        } else {
            int ordinal = zzbfcVar2.zzc.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (zzf = zzbeuVar.zzf(zzbfdVar.zzd)) != null) {
                valueOf = zzbfq.zzg(zzf, valueOf);
            }
            zzbeuVar.zzk(zzbfdVar.zzd, valueOf);
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final void zzf(Object obj) {
        ((zzbfb) obj).zzb.zzi();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final void zzg(zzbhe zzbheVar, Object obj, zzbep zzbepVar, zzbeu zzbeuVar) throws IOException {
        zzbfd zzbfdVar = (zzbfd) obj;
        zzbeuVar.zzk(zzbfdVar.zzd, zzbheVar.zzt(zzbfdVar.zzc.getClass(), zzbepVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final void zzh(zzbbw zzbbwVar, Object obj, zzbep zzbepVar, zzbeu zzbeuVar) throws IOException {
        byte[] bArr;
        zzbfd zzbfdVar = (zzbfd) obj;
        zzbgs zzD = zzbfdVar.zzc.zzas().zzD();
        int zzd = zzbbwVar.zzd();
        if (zzd == 0) {
            bArr = zzbfq.zzd;
        } else {
            byte[] bArr2 = new byte[zzd];
            zzbbwVar.zze(bArr2, 0, 0, zzd);
            bArr = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.hasArray()) {
            zzbbh zzbbhVar = new zzbbh(wrap, true);
            zzbhb.zza().zzb(zzD.getClass()).zzh(zzD, zzbbhVar, zzbepVar);
            zzbeuVar.zzk(zzbfdVar.zzd, zzD);
            if (zzbbhVar.zzc() == Integer.MAX_VALUE) {
                return;
            } else {
                throw zzbfs.zzb();
            }
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final boolean zzi(zzbgs zzbgsVar) {
        return zzbgsVar instanceof zzbfb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbeq
    public final void zzj(zzbck zzbckVar, Map.Entry entry) throws IOException {
        zzbfc zzbfcVar = (zzbfc) entry.getKey();
        if (zzbfcVar.zzd) {
            zzbip zzbipVar = zzbip.zza;
            switch (zzbfcVar.zzc.ordinal()) {
                case 0:
                    zzbhh.zzL(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 1:
                    zzbhh.zzP(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 2:
                    zzbhh.zzS(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 3:
                    zzbhh.zzaa(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 4:
                    zzbhh.zzR(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 5:
                    zzbhh.zzO(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 6:
                    zzbhh.zzN(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 7:
                    zzbhh.zzJ(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 8:
                    zzbhh.zzY(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzbhh.zzQ(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, zzbhb.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzbhh.zzT(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, zzbhb.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzbhh.zzK(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar);
                    return;
                case 12:
                    zzbhh.zzZ(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 13:
                    zzbhh.zzR(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 14:
                    zzbhh.zzU(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 15:
                    zzbhh.zzV(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 16:
                    zzbhh.zzW(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                case 17:
                    zzbhh.zzX(zzbfcVar.zzb, (List) entry.getValue(), zzbckVar, false);
                    return;
                default:
                    return;
            }
        }
        zzbip zzbipVar2 = zzbip.zza;
        switch (zzbfcVar.zzc.ordinal()) {
            case 0:
                zzbckVar.zzf(zzbfcVar.zzb, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzbckVar.zzo(zzbfcVar.zzb, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzbckVar.zzt(zzbfcVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzbckVar.zzK(zzbfcVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzbckVar.zzr(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzbckVar.zzm(zzbfcVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzbckVar.zzk(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzbckVar.zzb(zzbfcVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzbckVar.zzG(zzbfcVar.zzb, (String) entry.getValue());
                return;
            case 9:
                zzbckVar.zzq(zzbfcVar.zzb, entry.getValue(), zzbhb.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzbckVar.zzv(zzbfcVar.zzb, entry.getValue(), zzbhb.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzbckVar.zzd(zzbfcVar.zzb, (zzbbw) entry.getValue());
                return;
            case 12:
                zzbckVar.zzI(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzbckVar.zzr(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzbckVar.zzx(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzbckVar.zzz(zzbfcVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzbckVar.zzB(zzbfcVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzbckVar.zzD(zzbfcVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}

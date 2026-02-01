package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.D;
import com.google.android.gms.internal.gtm.zzrr;
import com.google.android.gms.internal.gtm.zzrv;
import com.google.android.gms.internal.gtm.zzrz;
import com.google.android.gms.internal.gtm.zzsd;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@D
/* loaded from: classes2.dex */
public final class zzet {
    private static final zzdr zza = new zzdr(zzfu.zzb(), true);
    private final zzrv zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;
    private final Set zzf;
    private final DataLayer zzg;
    private final Map zzh;
    private volatile String zzi;
    private int zzj;
    private final zzdk zzk;
    private final zzda zzl;
    private final zzda zzm;

    public zzet(Context context, zzrv zzrvVar, DataLayer dataLayer, zzap zzapVar, zzap zzapVar2, zzdk zzdkVar, byte[] bArr) {
        this.zzb = zzrvVar;
        HashSet<zzrz> hashSet = new HashSet(zzrvVar.zzc());
        this.zzf = hashSet;
        this.zzg = dataLayer;
        this.zzk = zzdkVar;
        this.zzl = zzr.zza(1048576, new zzem(this));
        this.zzm = zzr.zza(1048576, new zzen(this));
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        zzj(hashMap, new zzo(context));
        zzj(hashMap, new zzaq(zzapVar2));
        zzj(hashMap, new zzbe(dataLayer));
        zzj(hashMap, new zzfv(context, dataLayer));
        HashMap hashMap2 = new HashMap();
        this.zzd = hashMap2;
        zzj(hashMap2, new zzan());
        zzj(hashMap2, new zzbq());
        zzj(hashMap2, new zzbr());
        zzj(hashMap2, new zzbv());
        zzj(hashMap2, new zzbw());
        zzj(hashMap2, new zzdc());
        zzj(hashMap2, new zzdd());
        zzj(hashMap2, new zzed());
        zzj(hashMap2, new zzfj());
        HashMap hashMap3 = new HashMap();
        this.zze = hashMap3;
        zzj(hashMap3, new zze(zzd.zzb(context)));
        zzj(hashMap3, new zzf(zzd.zzb(context)));
        zzj(hashMap3, new zzh(context));
        zzj(hashMap3, new zzi(context));
        zzj(hashMap3, new zzj(context));
        zzj(hashMap3, new zzk(context));
        zzj(hashMap3, new zzl(context));
        zzj(hashMap3, new zzs());
        zzj(hashMap3, new zzam(zzrvVar.zzb()));
        zzj(hashMap3, new zzaq(zzapVar));
        zzj(hashMap3, new zzax(dataLayer));
        zzj(hashMap3, new zzbh(context));
        zzj(hashMap3, new zzbi());
        zzj(hashMap3, new zzbp());
        zzj(hashMap3, new zzbs(this));
        zzj(hashMap3, new zzbx());
        zzj(hashMap3, new zzby());
        zzj(hashMap3, new zzcv(context));
        zzj(hashMap3, new zzcx());
        zzj(hashMap3, new zzdb());
        zzj(hashMap3, new zzdh());
        zzj(hashMap3, new zzdi(context));
        zzj(hashMap3, new zzds());
        zzj(hashMap3, new zzdw());
        zzj(hashMap3, new zzea());
        zzj(hashMap3, new zzec());
        zzj(hashMap3, new zzee(context));
        zzj(hashMap3, new zzeu());
        zzj(hashMap3, new zzev());
        zzj(hashMap3, new zzfp());
        zzj(hashMap3, new zzfw());
        this.zzh = new HashMap();
        for (zzrz zzrzVar : hashSet) {
            for (int i4 = 0; i4 < zzrzVar.zza().size(); i4++) {
                zzrr zzrrVar = (zzrr) zzrzVar.zza().get(i4);
                zzes zzg = zzg(this.zzh, zzh(zzrrVar));
                zzg.zzk(zzrzVar);
                zzg.zzg(zzrzVar, zzrrVar);
                zzg.zzh(zzrzVar, "Unknown");
            }
            for (int i5 = 0; i5 < zzrzVar.zzf().size(); i5++) {
                zzrr zzrrVar2 = (zzrr) zzrzVar.zzf().get(i5);
                zzes zzg2 = zzg(this.zzh, zzh(zzrrVar2));
                zzg2.zzk(zzrzVar);
                zzg2.zzi(zzrzVar, zzrrVar2);
                zzg2.zzj(zzrzVar, "Unknown");
            }
        }
        for (Map.Entry entry : this.zzb.zzd().entrySet()) {
            for (zzrr zzrrVar3 : (List) entry.getValue()) {
                if (!zzfu.zzg(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzrrVar3.zzc().get(com.google.android.gms.internal.gtm.zzb.NOT_DEFAULT_MACRO.toString()))).booleanValue()) {
                    zzg(this.zzh, (String) entry.getKey()).zzl(zzrrVar3);
                }
            }
        }
    }

    private static zzes zzg(Map map, String str) {
        zzes zzesVar = (zzes) map.get(str);
        if (zzesVar == null) {
            zzes zzesVar2 = new zzes();
            map.put(str, zzesVar2);
            return zzesVar2;
        }
        return zzesVar;
    }

    private static String zzh(zzrr zzrrVar) {
        return zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzrrVar.zzc().get(com.google.android.gms.internal.gtm.zzb.INSTANCE_NAME.toString())));
    }

    private final String zzi() {
        if (this.zzj <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.zzj));
        for (int i4 = 2; i4 < this.zzj; i4++) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }

    private static void zzj(Map map, zzbt zzbtVar) {
        if (!map.containsKey(zzbtVar.zze())) {
            map.put(zzbtVar.zze(), zzbtVar);
            return;
        }
        throw new IllegalArgumentException("Duplicate function type name: ".concat(String.valueOf(zzbtVar.zze())));
    }

    private final void zzk(com.google.android.gms.internal.gtm.zzam zzamVar, Set set) {
        zzdr zzo;
        if (zzamVar == null || (zzo = zzo(zzamVar, set, new zzdp())) == zza) {
            return;
        }
        Object zzl = zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzo.zza());
        if (zzl instanceof Map) {
            this.zzg.push((Map) zzl);
            return;
        }
        if (zzl instanceof List) {
            for (Object obj : (List) zzl) {
                if (obj instanceof Map) {
                    this.zzg.push((Map) obj);
                } else {
                    Log.w("GoogleTagManager", "pushAfterEvaluate: value not a Map");
                }
            }
            return;
        }
        Log.w("GoogleTagManager", "pushAfterEvaluate: value not a Map or List");
    }

    private final zzdr zzl(Set set, Set set2, zzeq zzeqVar, zzdo zzdoVar) {
        zzdr zzdrVar;
        Set hashSet = new HashSet();
        Set hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            boolean z3 = true;
            while (it.hasNext()) {
                zzrz zzrzVar = (zzrz) it.next();
                zzdn zzdnVar = new zzdn();
                Iterator it2 = zzrzVar.zzd().iterator();
                while (true) {
                    boolean z4 = true;
                    while (true) {
                        if (it2.hasNext()) {
                            zzdr zzf = zzf((zzrr) it2.next(), set2, new zzdm());
                            if (((Boolean) zzf.zza()).booleanValue()) {
                                Boolean bool = Boolean.FALSE;
                                zzfu.zzc(bool);
                                zzdrVar = new zzdr(bool, zzf.zzb());
                                break;
                            }
                            if (!z4 || !zzf.zzb()) {
                                z4 = false;
                            }
                        } else {
                            Iterator it3 = zzrzVar.zze().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zzdr zzf2 = zzf((zzrr) it3.next(), set2, new zzdm());
                                    if (!((Boolean) zzf2.zza()).booleanValue()) {
                                        Boolean bool2 = Boolean.FALSE;
                                        zzfu.zzc(bool2);
                                        zzdrVar = new zzdr(bool2, zzf2.zzb());
                                        break;
                                    }
                                    if (z4 && zzf2.zzb()) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    Boolean bool3 = Boolean.TRUE;
                                    zzfu.zzc(bool3);
                                    zzdrVar = new zzdr(bool3, z4);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (((Boolean) zzdrVar.zza()).booleanValue()) {
                    zzeqVar.zza(zzrzVar, hashSet, hashSet2, zzdnVar);
                }
                if (!z3 || !zzdrVar.zzb()) {
                    z3 = false;
                }
            }
            hashSet.removeAll(hashSet2);
            return new zzdr(hashSet, z3);
        }
    }

    private final zzdr zzm(String str, Set set, zzdl zzdlVar) {
        zzrr zzrrVar;
        boolean z3 = true;
        this.zzj++;
        zzer zzerVar = (zzer) this.zzm.zza(str);
        if (zzerVar == null) {
            zzes zzesVar = (zzes) this.zzh.get(str);
            if (zzesVar == null) {
                Log.e("GoogleTagManager", zzi() + "Invalid macro: " + str);
                this.zzj = this.zzj + (-1);
                return zza;
            }
            zzdr zzl = zzl(zzesVar.zzf(), set, new zzeo(this, zzesVar.zzc(), zzesVar.zzb(), zzesVar.zze(), zzesVar.zzd()), new zzdo());
            if (((Set) zzl.zza()).isEmpty()) {
                zzrrVar = zzesVar.zza();
            } else {
                if (((Set) zzl.zza()).size() > 1) {
                    Log.w("GoogleTagManager", zzi() + "Multiple macros active for macroName " + str);
                }
                zzrrVar = (zzrr) ((Set) zzl.zza()).iterator().next();
            }
            if (zzrrVar == null) {
                this.zzj--;
                return zza;
            }
            zzdr zzn = zzn(this.zze, zzrrVar, set, new zzdm());
            if (!zzl.zzb() || !zzn.zzb()) {
                z3 = false;
            }
            zzdr zzdrVar = zza;
            if (zzn != zzdrVar) {
                zzdrVar = new zzdr((com.google.android.gms.internal.gtm.zzam) zzn.zza(), z3);
            }
            com.google.android.gms.internal.gtm.zzam zza2 = zzrrVar.zza();
            if (zzdrVar.zzb()) {
                this.zzm.zzb(str, new zzer(zzdrVar, zza2));
            }
            zzk(zza2, set);
            this.zzj--;
            return zzdrVar;
        }
        zzk(zzerVar.zzb(), set);
        this.zzj--;
        return zzerVar.zzc();
    }

    private final zzdr zzn(Map map, zzrr zzrrVar, Set set, zzdm zzdmVar) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) zzrrVar.zzc().get(com.google.android.gms.internal.gtm.zzb.FUNCTION.toString());
        if (zzamVar == null) {
            Log.e("GoogleTagManager", "No function id in properties");
            return zza;
        }
        String zzo = zzamVar.zzo();
        zzbt zzbtVar = (zzbt) map.get(zzo);
        if (zzbtVar == null) {
            Log.e("GoogleTagManager", String.valueOf(zzo).concat(" has no backing implementation."));
            return zza;
        }
        zzdr zzdrVar = (zzdr) this.zzl.zza(zzrrVar);
        if (zzdrVar == null) {
            HashMap hashMap = new HashMap();
            boolean z3 = true;
            boolean z4 = true;
            for (Map.Entry entry : zzrrVar.zzc().entrySet()) {
                com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) entry.getValue();
                zzdr zzo2 = zzo(zzamVar2, set, new zzdp());
                zzdr zzdrVar2 = zza;
                if (zzo2 == zzdrVar2) {
                    return zzdrVar2;
                }
                if (zzo2.zzb()) {
                    zzrrVar.zzd((String) entry.getKey(), (com.google.android.gms.internal.gtm.zzam) zzo2.zza());
                } else {
                    z4 = false;
                }
                hashMap.put((String) entry.getKey(), (com.google.android.gms.internal.gtm.zzam) zzo2.zza());
            }
            if (!zzbtVar.zzg(hashMap.keySet())) {
                Log.e("GoogleTagManager", "Incorrect keys for function " + zzo + " required " + zzbtVar.zzf().toString() + " had " + String.valueOf(hashMap.keySet()));
                return zza;
            }
            if (!z4 || !zzbtVar.zzb()) {
                z3 = false;
            }
            zzdr zzdrVar3 = new zzdr(zzbtVar.zza(hashMap), z3);
            if (z3) {
                this.zzl.zzb(zzrrVar, zzdrVar3);
            }
            return zzdrVar3;
        }
        return zzdrVar;
    }

    private final zzdr zzo(com.google.android.gms.internal.gtm.zzam zzamVar, Set set, zzdp zzdpVar) {
        if (!zzamVar.zzP()) {
            return new zzdr(zzamVar, true);
        }
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        int ordinal = zzamVar.zzh().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 6) {
                        Log.e("GoogleTagManager", "Unknown type: ".concat(String.valueOf(zzamVar.zzh())));
                        return zza;
                    }
                    com.google.android.gms.internal.gtm.zzan zzanVar = (com.google.android.gms.internal.gtm.zzan) zzsd.zza(zzamVar).zzaa();
                    zzanVar.zzm();
                    for (int i4 = 0; i4 < zzamVar.zze(); i4++) {
                        zzdr zzo = zzo(zzamVar.zzn(i4), set, new zzdp());
                        zzdr zzdrVar = zza;
                        if (zzo == zzdrVar) {
                            return zzdrVar;
                        }
                        zzanVar.zzh((com.google.android.gms.internal.gtm.zzam) zzo.zza());
                    }
                    return new zzdr((com.google.android.gms.internal.gtm.zzam) zzanVar.zzC(), false);
                }
                if (set.contains(zzamVar.zzp())) {
                    Log.e("GoogleTagManager", "Macro cycle detected.  Current macro reference: " + zzamVar.zzp() + ".  Previous macro references: " + set.toString() + ".");
                    return zza;
                }
                set.add(zzamVar.zzp());
                zzdr zzm = zzm(zzamVar.zzp(), set, new zzdl());
                for (com.google.android.gms.internal.gtm.zzaq zzaqVar : (com.google.android.gms.internal.gtm.zzaq[]) zzamVar.zzr().toArray(new com.google.android.gms.internal.gtm.zzaq[0])) {
                    if (!(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzm.zza()) instanceof String)) {
                        Log.e("GoogleTagManager", "Escaping can only be applied to strings.");
                    } else {
                        com.google.android.gms.internal.gtm.zzaq zzaqVar2 = com.google.android.gms.internal.gtm.zzaq.ESCAPE_HTML;
                        if (zzaqVar.ordinal() == 11) {
                            try {
                                zzm = new zzdr(zzfu.zzc(zzfx.zza(zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzm.zza())))), zzm.zzb());
                            } catch (UnsupportedEncodingException e4) {
                                Log.e("GoogleTagManager", "Escape URI: unsupported encoding", e4);
                            }
                        }
                    }
                }
                set.remove(zzamVar.zzp());
                return zzm;
            }
            com.google.android.gms.internal.gtm.zzan zzanVar2 = (com.google.android.gms.internal.gtm.zzan) zzsd.zza(zzamVar).zzaa();
            if (zzamVar.zzc() != zzamVar.zzd()) {
                Log.e("GoogleTagManager", "Invalid serving value: ".concat(zzamVar.toString()));
                return zza;
            }
            zzanVar2.zzk();
            zzanVar2.zzl();
            for (int i5 = 0; i5 < zzamVar.zzc(); i5++) {
                zzdr zzo2 = zzo(zzamVar.zzl(i5), set, new zzdp());
                zzdr zzo3 = zzo(zzamVar.zzm(i5), set, new zzdp());
                zzdr zzdrVar2 = zza;
                if (zzo2 != zzdrVar2 && zzo3 != zzdrVar2) {
                    zzanVar2.zzf((com.google.android.gms.internal.gtm.zzam) zzo2.zza());
                    zzanVar2.zzg((com.google.android.gms.internal.gtm.zzam) zzo3.zza());
                } else {
                    return zzdrVar2;
                }
            }
            return new zzdr((com.google.android.gms.internal.gtm.zzam) zzanVar2.zzC(), false);
        }
        com.google.android.gms.internal.gtm.zzan zzanVar3 = (com.google.android.gms.internal.gtm.zzan) zzsd.zza(zzamVar).zzaa();
        zzanVar3.zzj();
        for (int i6 = 0; i6 < zzamVar.zza(); i6++) {
            zzdr zzo4 = zzo(zzamVar.zzk(i6), set, new zzdp());
            zzdr zzdrVar3 = zza;
            if (zzo4 == zzdrVar3) {
                return zzdrVar3;
            }
            zzanVar3.zze((com.google.android.gms.internal.gtm.zzam) zzo4.zza());
        }
        return new zzdr((com.google.android.gms.internal.gtm.zzam) zzanVar3.zzC(), false);
    }

    public final zzdr zza(String str) {
        this.zzj = 0;
        return zzm(str, new HashSet(), new zzdl());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized String zzb() {
        return this.zzi;
    }

    public final synchronized void zzc(String str) {
        try {
            zzd(str);
            Iterator it = ((Set) zzl(this.zzf, new HashSet(), new zzep(this), new zzdo()).zza()).iterator();
            while (it.hasNext()) {
                zzn(this.zzc, (zzrr) it.next(), new HashSet(), new zzdm());
            }
            zzd(null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @D
    final synchronized void zzd(String str) {
        this.zzi = str;
    }

    public final synchronized void zze(List list) {
        Long valueOf;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.gtm.zzai zzaiVar = (com.google.android.gms.internal.gtm.zzai) it.next();
                if (zzaiVar.zzf() && zzaiVar.zzd().startsWith("gaExperiment:")) {
                    DataLayer dataLayer = this.zzg;
                    if (!zzaiVar.zze()) {
                        Log.w("GoogleTagManager", "supplemental missing experimentSupplemental");
                    } else {
                        Iterator it2 = zzaiVar.zza().zze().iterator();
                        while (it2.hasNext()) {
                            dataLayer.zzd(zzfu.zzn(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) it2.next())));
                        }
                        Iterator it3 = zzaiVar.zza().zzf().iterator();
                        while (true) {
                            Map<String, Object> map = null;
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object zzl = zzfu.zzl((com.google.android.gms.internal.gtm.zzam) it3.next());
                            if (!(zzl instanceof Map)) {
                                Log.w("GoogleTagManager", "value: " + String.valueOf(zzl) + " is not a map value, ignored.");
                            } else {
                                map = (Map) zzl;
                            }
                            if (map != null) {
                                dataLayer.push(map);
                            }
                        }
                        for (com.google.android.gms.internal.gtm.zzw zzwVar : zzaiVar.zza().zzd()) {
                            if (!zzwVar.zzh()) {
                                Log.w("GoogleTagManager", "GaExperimentRandom: No key");
                            } else {
                                Object obj = dataLayer.get(zzwVar.zzf());
                                if (!(obj instanceof Number)) {
                                    valueOf = null;
                                } else {
                                    valueOf = Long.valueOf(((Number) obj).longValue());
                                }
                                long zzd = zzwVar.zzd();
                                long zzc = zzwVar.zzc();
                                if (!zzwVar.zzg() || valueOf == null || valueOf.longValue() < zzd || valueOf.longValue() > zzc) {
                                    if (zzd <= zzc) {
                                        obj = Long.valueOf(Math.round((Math.random() * (zzc - zzd)) + zzd));
                                    } else {
                                        Log.w("GoogleTagManager", "GaExperimentRandom: random range invalid");
                                    }
                                }
                                dataLayer.zzd(zzwVar.zzf());
                                Map zza2 = dataLayer.zza(zzwVar.zzf(), obj);
                                if (zzwVar.zza() > 0) {
                                    if (!zza2.containsKey("gtm")) {
                                        zza2.put("gtm", DataLayer.mapOf("lifetime", Long.valueOf(zzwVar.zza())));
                                    } else {
                                        Object obj2 = zza2.get("gtm");
                                        if (obj2 instanceof Map) {
                                            ((Map) obj2).put("lifetime", Long.valueOf(zzwVar.zza()));
                                        } else {
                                            Log.w("GoogleTagManager", "GaExperimentRandom: gtm not a map");
                                        }
                                    }
                                }
                                dataLayer.push(zza2);
                            }
                        }
                    }
                }
                zzdg.zzb.zzd("Ignored supplemental: ".concat(String.valueOf(zzaiVar)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @D
    final zzdr zzf(zzrr zzrrVar, Set set, zzdm zzdmVar) {
        zzdr zzn = zzn(this.zzd, zzrrVar, set, zzdmVar);
        Boolean zzg = zzfu.zzg(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) zzn.zza()));
        zzfu.zzc(zzg);
        return new zzdr(zzg, zzn.zzb());
    }
}

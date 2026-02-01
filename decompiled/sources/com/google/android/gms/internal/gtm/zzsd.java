package com.google.android.gms.internal.gtm;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzsd {
    public static zzam zza(zzam zzamVar) {
        zzan zzg = zzam.zzg();
        zzg.zzt(zzat.STRING);
        zzg.zzt(zzamVar.zzh());
        zzg.zzi();
        zzg.zza(zzamVar.zzr());
        zzg.zzo(zzamVar.zzP());
        return (zzam) zzg.zzC();
    }

    public static zzrv zzb(zzac zzacVar) throws zzsc {
        zzam[] zzamVarArr = new zzam[zzacVar.zzf()];
        for (int i4 = 0; i4 < zzacVar.zzf(); i4++) {
            zze(i4, zzacVar, zzamVarArr, new HashSet(0));
        }
        zzrx zzrxVar = new zzrx(null);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < zzacVar.zze(); i5++) {
            arrayList.add(zzf(zzacVar.zzi(i5), zzacVar, zzamVarArr, i5));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < zzacVar.zzc(); i6++) {
            arrayList2.add(zzf(zzacVar.zzh(i6), zzacVar, zzamVarArr, i6));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i7 = 0; i7 < zzacVar.zza(); i7++) {
            zzrr zzf = zzf(zzacVar.zzg(i7), zzacVar, zzamVarArr, i7);
            zzrxVar.zzb(zzf);
            arrayList3.add(zzf);
        }
        for (zzae zzaeVar : zzacVar.zzq()) {
            zzsb zzsbVar = new zzsb(null);
            Iterator it = zzaeVar.zzh().iterator();
            while (it.hasNext()) {
                zzsbVar.zzg((zzrr) arrayList2.get(((Integer) it.next()).intValue()));
            }
            Iterator it2 = zzaeVar.zzg().iterator();
            while (it2.hasNext()) {
                zzsbVar.zzf((zzrr) arrayList2.get(((Integer) it2.next()).intValue()));
            }
            Iterator it3 = zzaeVar.zze().iterator();
            while (it3.hasNext()) {
                zzsbVar.zzd((zzrr) arrayList.get(((Integer) it3.next()).intValue()));
            }
            Iterator it4 = zzaeVar.zzf().iterator();
            while (it4.hasNext()) {
                zzsbVar.zze(zzacVar.zzm(((Integer) it4.next()).intValue()).zzq());
            }
            Iterator it5 = zzaeVar.zzk().iterator();
            while (it5.hasNext()) {
                zzsbVar.zzj((zzrr) arrayList.get(((Integer) it5.next()).intValue()));
            }
            Iterator it6 = zzaeVar.zzl().iterator();
            while (it6.hasNext()) {
                zzsbVar.zzk(zzacVar.zzm(((Integer) it6.next()).intValue()).zzq());
            }
            Iterator it7 = zzaeVar.zzc().iterator();
            while (it7.hasNext()) {
                zzsbVar.zzb((zzrr) arrayList3.get(((Integer) it7.next()).intValue()));
            }
            Iterator it8 = zzaeVar.zzd().iterator();
            while (it8.hasNext()) {
                zzsbVar.zzc(zzacVar.zzm(((Integer) it8.next()).intValue()).zzq());
            }
            Iterator it9 = zzaeVar.zzi().iterator();
            while (it9.hasNext()) {
                zzsbVar.zzh((zzrr) arrayList3.get(((Integer) it9.next()).intValue()));
            }
            Iterator it10 = zzaeVar.zzj().iterator();
            while (it10.hasNext()) {
                zzsbVar.zzi(zzacVar.zzm(((Integer) it10.next()).intValue()).zzq());
            }
            zzrxVar.zzc(zzsbVar.zza());
        }
        zzrxVar.zze(zzacVar.zzn());
        zzrxVar.zzd(zzacVar.zzd());
        return zzrxVar.zza();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private static zzag zzd(zzam zzamVar) throws zzsc {
        zzbfd zzbfdVar = zzag.zza;
        if (!zzamVar.zzX(zzbfdVar)) {
            zzh("Expected a ServingValue and didn't get one. Value is: ".concat(String.valueOf(zzamVar)));
        }
        return (zzag) zzamVar.zzW(zzbfdVar);
    }

    private static zzam zze(int i4, zzac zzacVar, zzam[] zzamVarArr, Set set) throws zzsc {
        zzan zzanVar;
        zzan zzanVar2;
        Integer valueOf = Integer.valueOf(i4);
        if (set.contains(valueOf)) {
            zzh("Value cycle detected.  Current value reference: " + i4 + ".  Previous value references: " + set.toString() + ".");
        }
        zzan zzanVar3 = (zzan) ((zzam) zzg(zzacVar.zzr(), i4, "values")).zzaa();
        zzam zzamVar = zzamVarArr[i4];
        if (zzamVar != null) {
            return zzamVar;
        }
        set.add(valueOf);
        zzat zzatVar = zzat.STRING;
        switch (zzanVar3.zzu()) {
            case STRING:
            case FUNCTION_ID:
            case INTEGER:
            case BOOLEAN:
                zzanVar = zzanVar3;
                break;
            case LIST:
                zzag zzd = zzd((zzam) zzanVar3.zzC());
                zzan zzanVar4 = (zzan) zza((zzam) zzanVar3.zzC()).zzaa();
                zzanVar4.zzj();
                Iterator it = zzd.zzf().iterator();
                while (it.hasNext()) {
                    zzanVar4.zze(zze(((Integer) it.next()).intValue(), zzacVar, zzamVarArr, set));
                }
                zzanVar = zzanVar4;
                break;
            case MAP:
                zzanVar2 = (zzan) zza((zzam) zzanVar3.zzC()).zzaa();
                zzag zzd2 = zzd((zzam) zzanVar3.zzC());
                if (zzd2.zzc() != zzd2.zzd()) {
                    zzh("Uneven map keys (" + zzd2.zzc() + ") and map values (" + zzd2.zzd() + ")");
                }
                zzanVar2.zzk();
                zzanVar2.zzl();
                Iterator it2 = zzd2.zzg().iterator();
                while (it2.hasNext()) {
                    zzanVar2.zzf(zze(((Integer) it2.next()).intValue(), zzacVar, zzamVarArr, set));
                }
                Iterator it3 = zzd2.zzh().iterator();
                while (it3.hasNext()) {
                    zzanVar2.zzg(zze(((Integer) it3.next()).intValue(), zzacVar, zzamVarArr, set));
                }
                zzanVar = zzanVar2;
                break;
            case MACRO_REFERENCE:
                zzanVar2 = (zzan) zza((zzam) zzanVar3.zzC()).zzaa();
                zzanVar2.zzr(com.google.android.gms.tagmanager.zzfu.zzn(com.google.android.gms.tagmanager.zzfu.zzl(zze(zzd((zzam) zzanVar3.zzC()).zza(), zzacVar, zzamVarArr, set))));
                zzanVar = zzanVar2;
                break;
            case TEMPLATE:
                zzanVar2 = (zzan) zza((zzam) zzanVar3.zzC()).zzaa();
                zzag zzd3 = zzd((zzam) zzanVar3.zzC());
                zzanVar2.zzm();
                Iterator it4 = zzd3.zzi().iterator();
                while (it4.hasNext()) {
                    zzanVar2.zzh(zze(((Integer) it4.next()).intValue(), zzacVar, zzamVarArr, set));
                }
                zzanVar = zzanVar2;
                break;
            default:
                zzanVar = null;
                break;
        }
        if (zzanVar == null) {
            zzh("Invalid value: ".concat(String.valueOf(zzanVar3)));
        }
        zzamVarArr[i4] = (zzam) zzanVar.zzC();
        set.remove(Integer.valueOf(i4));
        return (zzam) zzanVar.zzC();
    }

    private static zzrr zzf(zzu zzuVar, zzac zzacVar, zzam[] zzamVarArr, int i4) throws zzsc {
        zzrt zzrtVar = new zzrt(null);
        Iterator it = zzuVar.zzc().iterator();
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) zzg(zzacVar.zzp(), ((Integer) it.next()).intValue(), "properties");
            String str = (String) zzg(zzacVar.zzo(), zzaaVar.zza(), "keys");
            int zzc = zzaaVar.zzc();
            if (zzc < 0 || zzc >= zzamVarArr.length) {
                zzh("Index out of bounds detected: " + zzc + " in values");
            }
            zzam zzamVar = zzamVarArr[zzc];
            if (zzb.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzrtVar.zzc(zzamVar);
            } else {
                zzrtVar.zzb(str, zzamVar);
            }
        }
        return zzrtVar.zza();
    }

    private static Object zzg(List list, int i4, String str) throws zzsc {
        if (i4 < 0 || i4 >= list.size()) {
            zzh("Index out of bounds detected: " + i4 + " in " + str);
        }
        return list.get(i4);
    }

    private static void zzh(String str) throws zzsc {
        Log.e("GoogleTagManager", str);
        throw new zzsc(str);
    }
}

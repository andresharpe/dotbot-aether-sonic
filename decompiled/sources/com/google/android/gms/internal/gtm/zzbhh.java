package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzbhh {
    private static final Class zza;
    private static final zzbhz zzb;
    private static final zzbhz zzc;
    private static final zzbhz zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzbib();
    }

    public static zzbhz zzA() {
        return zzc;
    }

    public static zzbhz zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i4, List list, zzbfj zzbfjVar, Object obj, zzbhz zzbhzVar) {
        if (zzbfjVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                if (zzbfjVar.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, Integer.valueOf(intValue));
                    }
                    i5++;
                } else {
                    obj = zzD(i4, intValue, obj, zzbhzVar);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzbfjVar.zza(intValue2)) {
                    obj = zzD(i4, intValue2, obj, zzbhzVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzD(int i4, int i5, Object obj, zzbhz zzbhzVar) {
        if (obj == null) {
            obj = zzbhzVar.zzf();
        }
        zzbhzVar.zzl(obj, i4, i5);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzbeq zzbeqVar, Object obj, Object obj2) {
        zzbeu zzb2 = zzbeqVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzbeqVar.zzc(obj).zzj(zzb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzbhz zzbhzVar, Object obj, Object obj2) {
        zzbhzVar.zzo(obj, zzbhzVar.zze(zzbhzVar.zzd(obj), zzbhzVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzbff.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzH(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzI(zzbgn zzbgnVar, Object obj, Object obj2, long j4) {
        zzbij.zzs(obj, j4, zzbgn.zzc(zzbij.zzf(obj, j4), zzbij.zzf(obj2, j4)));
    }

    public static void zzJ(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzc(i4, list, z3);
        }
    }

    public static void zzK(int i4, List list, zzbck zzbckVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zze(i4, list);
        }
    }

    public static void zzL(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzg(i4, list, z3);
        }
    }

    public static void zzM(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzj(i4, list, z3);
        }
    }

    public static void zzN(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzl(i4, list, z3);
        }
    }

    public static void zzO(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzn(i4, list, z3);
        }
    }

    public static void zzP(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzp(i4, list, z3);
        }
    }

    public static void zzQ(int i4, List list, zzbck zzbckVar, zzbhf zzbhfVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                zzbckVar.zzq(i4, list.get(i5), zzbhfVar);
            }
        }
    }

    public static void zzR(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzs(i4, list, z3);
        }
    }

    public static void zzS(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzu(i4, list, z3);
        }
    }

    public static void zzT(int i4, List list, zzbck zzbckVar, zzbhf zzbhfVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                zzbckVar.zzv(i4, list.get(i5), zzbhfVar);
            }
        }
    }

    public static void zzU(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzy(i4, list, z3);
        }
    }

    public static void zzV(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzA(i4, list, z3);
        }
    }

    public static void zzW(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzC(i4, list, z3);
        }
    }

    public static void zzX(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzE(i4, list, z3);
        }
    }

    public static void zzY(int i4, List list, zzbck zzbckVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzH(i4, list);
        }
    }

    public static void zzZ(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzJ(i4, list, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbcj.zzJ(i4 << 3) + 1);
    }

    public static void zzaa(int i4, List list, zzbck zzbckVar, boolean z3) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzbckVar.zzL(i4, list, z3);
        }
    }

    private static zzbhz zzab(boolean z3) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzbhz) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzI = size * zzbcj.zzI(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzI += zzbcj.zzz((zzbbw) list.get(i5));
        }
        return zzI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzC(zzbfgVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzC(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbcj.zzJ(i4 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzbcj.zzJ(i4 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i4, List list, zzbhf zzbhfVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += zzbcj.zzA(i4, (zzbgs) list.get(i6), zzbhfVar);
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzC(zzbfgVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzC(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i4, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzK(zzbghVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzK(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i4, Object obj, zzbhf zzbhfVar) {
        if (obj instanceof zzbfy) {
            int zzJ = zzbcj.zzJ(i4 << 3);
            int zza2 = ((zzbfy) obj).zza();
            return zzJ + zzbcj.zzJ(zza2) + zza2;
        }
        return zzbcj.zzJ(i4 << 3) + zzbcj.zzF((zzbgs) obj, zzbhfVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i4, List list, zzbhf zzbhfVar) {
        int zzF;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzI = zzbcj.zzI(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof zzbfy) {
                zzF = zzbcj.zzD((zzbfy) obj);
            } else {
                zzF = zzbcj.zzF((zzbgs) obj, zzbhfVar);
            }
            zzI += zzF;
        }
        return zzI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            i4 = 0;
            while (i5 < size) {
                int zze = zzbfgVar.zze(i5);
                i4 += zzbcj.zzJ((zze >> 31) ^ (zze + zze));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += zzbcj.zzJ((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            i4 = 0;
            while (i5 < size) {
                long zze = zzbghVar.zze(i5);
                i4 += zzbcj.zzK((zze >> 63) ^ (zze + zze));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += zzbcj.zzK((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i4, List list) {
        int zzH;
        int zzH2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int zzI = zzbcj.zzI(i4) * size;
        if (list instanceof zzbga) {
            zzbga zzbgaVar = (zzbga) list;
            while (i5 < size) {
                Object zzf = zzbgaVar.zzf(i5);
                if (zzf instanceof zzbbw) {
                    zzH2 = zzbcj.zzz((zzbbw) zzf);
                } else {
                    zzH2 = zzbcj.zzH((String) zzf);
                }
                zzI += zzH2;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzbbw) {
                    zzH = zzbcj.zzz((zzbbw) obj);
                } else {
                    zzH = zzbcj.zzH((String) obj);
                }
                zzI += zzH;
                i5++;
            }
        }
        return zzI;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzJ(zzbfgVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzJ(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzbcj.zzI(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzK(zzbghVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzbcj.zzK(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static zzbhz zzz() {
        return zzb;
    }
}

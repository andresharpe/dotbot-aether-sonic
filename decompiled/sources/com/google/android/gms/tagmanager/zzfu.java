package com.google.android.gms.tagmanager;

import L1.a;
import android.util.Log;
import com.google.android.gms.common.util.D;
import com.google.firebase.remoteconfig.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@D
/* loaded from: classes2.dex */
public final class zzfu {
    private static final Long zza = new Long(0);
    private static final Double zzb = new Double(l.f37524n);
    private static final zzft zzc = zzft.zzd(0);
    private static final String zzd;
    private static final Boolean zze;
    private static final List zzf;
    private static final Map zzg;
    private static final com.google.android.gms.internal.gtm.zzam zzh;

    static {
        String str = new String("");
        zzd = str;
        zze = new Boolean(false);
        zzf = new ArrayList(0);
        zzg = new HashMap();
        zzh = zzc(str);
    }

    public static com.google.android.gms.internal.gtm.zzam zza(String str) {
        com.google.android.gms.internal.gtm.zzan zzg2 = com.google.android.gms.internal.gtm.zzam.zzg();
        zzg2.zzt(com.google.android.gms.internal.gtm.zzat.STRING);
        zzg2.zzt(com.google.android.gms.internal.gtm.zzat.FUNCTION_ID);
        zzg2.zzp(str);
        zzg2.zzo(false);
        return (com.google.android.gms.internal.gtm.zzam) zzg2.zzC();
    }

    public static com.google.android.gms.internal.gtm.zzam zzb() {
        return zzh;
    }

    public static com.google.android.gms.internal.gtm.zzam zzc(Object obj) {
        String cls;
        com.google.android.gms.internal.gtm.zzan zzg2 = com.google.android.gms.internal.gtm.zzam.zzg();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        zzg2.zzt(zzatVar);
        if (obj instanceof com.google.android.gms.internal.gtm.zzam) {
            return (com.google.android.gms.internal.gtm.zzam) obj;
        }
        boolean z3 = false;
        if (obj instanceof String) {
            zzg2.zzt(zzatVar);
            zzg2.zzs((String) obj);
        } else if (obj instanceof List) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.LIST);
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                com.google.android.gms.internal.gtm.zzam zzc2 = zzc(it.next());
                com.google.android.gms.internal.gtm.zzam zzamVar = zzh;
                if (zzc2 == zzamVar) {
                    return zzamVar;
                }
                if (z4 || zzc2.zzP()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(zzc2);
            }
            zzg2.zzj();
            zzg2.zzb(arrayList);
            z3 = z4;
        } else if (obj instanceof Map) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.MAP);
            Set<Map.Entry> entrySet = ((Map) obj).entrySet();
            ArrayList arrayList2 = new ArrayList(entrySet.size());
            ArrayList arrayList3 = new ArrayList(entrySet.size());
            boolean z5 = false;
            for (Map.Entry entry : entrySet) {
                com.google.android.gms.internal.gtm.zzam zzc3 = zzc(entry.getKey());
                com.google.android.gms.internal.gtm.zzam zzc4 = zzc(entry.getValue());
                com.google.android.gms.internal.gtm.zzam zzamVar2 = zzh;
                if (zzc3 != zzamVar2 && zzc4 != zzamVar2) {
                    if (z5 || zzc3.zzP() || zzc4.zzP()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList2.add(zzc3);
                    arrayList3.add(zzc4);
                } else {
                    return zzamVar2;
                }
            }
            zzg2.zzk();
            zzg2.zzc(arrayList2);
            zzg2.zzl();
            zzg2.zzd(arrayList3);
            z3 = z5;
        } else if (zzr(obj)) {
            zzg2.zzt(zzatVar);
            zzg2.zzs(obj.toString());
        } else if (zzs(obj)) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.INTEGER);
            zzg2.zzq(zzp(obj));
        } else if (obj instanceof Boolean) {
            zzg2.zzt(com.google.android.gms.internal.gtm.zzat.BOOLEAN);
            zzg2.zzn(((Boolean) obj).booleanValue());
        } else {
            if (obj == null) {
                cls = "null";
            } else {
                cls = obj.getClass().toString();
            }
            Log.e("GoogleTagManager", "Converting to Value from unknown object type: ".concat(String.valueOf(cls)));
            return zzh;
        }
        zzg2.zzo(z3);
        return (com.google.android.gms.internal.gtm.zzam) zzg2.zzC();
    }

    public static zzft zzd() {
        return zzc;
    }

    public static zzft zze(Object obj) {
        if (obj instanceof zzft) {
            return (zzft) obj;
        }
        if (zzs(obj)) {
            return zzft.zzd(zzp(obj));
        }
        if (zzr(obj)) {
            return zzft.zzc(Double.valueOf(zzo(obj)));
        }
        return zzq(zzn(obj));
    }

    public static Boolean zzf() {
        return zze;
    }

    public static Boolean zzg(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        String zzn = zzn(obj);
        if (a.f1650s3.equalsIgnoreCase(zzn)) {
            return Boolean.TRUE;
        }
        if (a.t3.equalsIgnoreCase(zzn)) {
            return Boolean.FALSE;
        }
        return zze;
    }

    public static Double zzh() {
        return zzb;
    }

    public static Double zzi(Object obj) {
        if (zzr(obj)) {
            return Double.valueOf(zzo(obj));
        }
        zzft zzq = zzq(zzn(obj));
        if (zzq == zzc) {
            return zzb;
        }
        return Double.valueOf(zzq.doubleValue());
    }

    public static Long zzj() {
        return zza;
    }

    public static Long zzk(Object obj) {
        if (zzs(obj)) {
            return Long.valueOf(zzp(obj));
        }
        zzft zzq = zzq(zzn(obj));
        if (zzq == zzc) {
            return zza;
        }
        return Long.valueOf(zzq.zzb());
    }

    public static Object zzl(com.google.android.gms.internal.gtm.zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        switch (zzamVar.zzh().ordinal()) {
            case 0:
                return zzamVar.zzq();
            case 1:
                ArrayList arrayList = new ArrayList(zzamVar.zza());
                Iterator it = zzamVar.zzs().iterator();
                while (it.hasNext()) {
                    Object zzl = zzl((com.google.android.gms.internal.gtm.zzam) it.next());
                    if (zzl == null) {
                        return null;
                    }
                    arrayList.add(zzl);
                }
                return arrayList;
            case 2:
                if (zzamVar.zzc() != zzamVar.zzd()) {
                    Log.e("GoogleTagManager", "Converting an invalid value to object: ".concat(zzamVar.toString()));
                    return null;
                }
                HashMap hashMap = new HashMap(zzamVar.zzd());
                for (int i4 = 0; i4 < zzamVar.zzc(); i4++) {
                    Object zzl2 = zzl(zzamVar.zzl(i4));
                    Object zzl3 = zzl(zzamVar.zzm(i4));
                    if (zzl2 == null || zzl3 == null) {
                        return null;
                    }
                    hashMap.put(zzl2, zzl3);
                }
                return hashMap;
            case 3:
                Log.e("GoogleTagManager", "Trying to convert a macro reference to object");
                return null;
            case 4:
                Log.e("GoogleTagManager", "Trying to convert a function id to object");
                return null;
            case 5:
                return Long.valueOf(zzamVar.zzf());
            case 6:
                StringBuilder sb = new StringBuilder();
                Iterator it2 = zzamVar.zzt().iterator();
                while (it2.hasNext()) {
                    String zzn = zzn(zzl((com.google.android.gms.internal.gtm.zzam) it2.next()));
                    if (zzn == zzd) {
                        return null;
                    }
                    sb.append(zzn);
                }
                return sb.toString();
            case 7:
                return Boolean.valueOf(zzamVar.zzO());
            default:
                Log.e("GoogleTagManager", "Failed to convert a value of type: ".concat(String.valueOf(zzamVar.zzh())));
                return null;
        }
    }

    public static String zzm() {
        return zzd;
    }

    public static String zzn(Object obj) {
        if (obj == null) {
            return zzd;
        }
        return obj.toString();
    }

    private static double zzo(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        Log.e("GoogleTagManager", "getDouble received non-Number");
        return l.f37524n;
    }

    private static long zzp(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        Log.e("GoogleTagManager", "getInt64 received non-Number");
        return 0L;
    }

    private static zzft zzq(String str) {
        try {
            return zzft.zze(str);
        } catch (NumberFormatException unused) {
            Log.e("GoogleTagManager", "Failed to convert '" + str + "' to a number.");
            return zzc;
        }
    }

    private static boolean zzr(Object obj) {
        if ((obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        if ((obj instanceof zzft) && ((zzft) obj).zzf()) {
            return true;
        }
        return false;
    }

    private static boolean zzs(Object obj) {
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return true;
        }
        if ((obj instanceof zzft) && ((zzft) obj).zzg()) {
            return true;
        }
        return false;
    }
}

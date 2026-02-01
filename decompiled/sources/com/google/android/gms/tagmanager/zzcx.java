package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.internal.C1275t;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class zzcx extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.JOINER.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ITEM_SEPARATOR.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.KEY_VALUE_SEPARATOR.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.ESCAPE.toString();

    public zzcx() {
        super(zza, zzb);
    }

    private static final void zzc(Set set, String str) {
        for (int i4 = 0; i4 < str.length(); i4++) {
            set.add(Character.valueOf(str.charAt(i4)));
        }
    }

    private static final String zzd(String str, int i4, Set set) {
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        int i5 = i4 - 1;
        if (i5 != 1) {
            if (i5 != 2) {
                return str;
            }
            String replace = str.replace("\\", "\\\\");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String ch = ((Character) it.next()).toString();
                replace = replace.replace(ch, "\\".concat(String.valueOf(ch)));
            }
            return replace;
        }
        try {
            return zzfx.zza(str);
        } catch (UnsupportedEncodingException e4) {
            Log.e("GoogleTagManager", "Joiner: unsupported encoding", e4);
            return str;
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str;
        String str2;
        int i4;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        if (zzamVar == null) {
            return zzfu.zzb();
        }
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar2 != null) {
            str = zzfu.zzn(zzfu.zzl(zzamVar2));
        } else {
            str = "";
        }
        com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zzd);
        if (zzamVar3 != null) {
            str2 = zzfu.zzn(zzfu.zzl(zzamVar3));
        } else {
            str2 = "=";
        }
        com.google.android.gms.internal.gtm.zzam zzamVar4 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
        HashSet hashSet = null;
        boolean z3 = true;
        if (zzamVar4 != null) {
            String zzn = zzfu.zzn(zzfu.zzl(zzamVar4));
            if (C1275t.f28813a.equals(zzn)) {
                i4 = 2;
            } else if ("backslash".equals(zzn)) {
                hashSet = new HashSet();
                zzc(hashSet, str);
                zzc(hashSet, str2);
                hashSet.remove('\\');
                i4 = 3;
            } else {
                Log.e("GoogleTagManager", "Joiner: unsupported escape type: ".concat(String.valueOf(zzn)));
                return zzfu.zzb();
            }
        } else {
            i4 = 1;
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.internal.gtm.zzat zzatVar = com.google.android.gms.internal.gtm.zzat.STRING;
        int ordinal = zzamVar.zzh().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                sb.append(zzd(zzfu.zzn(zzfu.zzl(zzamVar)), i4, hashSet));
            } else {
                for (int i5 = 0; i5 < zzamVar.zzc(); i5++) {
                    if (i5 > 0) {
                        sb.append(str);
                    }
                    String zzn2 = zzfu.zzn(zzfu.zzl(zzamVar.zzl(i5)));
                    String zzn3 = zzfu.zzn(zzfu.zzl(zzamVar.zzm(i5)));
                    sb.append(zzd(zzn2, i4, hashSet));
                    sb.append(str2);
                    sb.append(zzd(zzn3, i4, hashSet));
                }
            }
        } else {
            for (com.google.android.gms.internal.gtm.zzam zzamVar5 : zzamVar.zzs()) {
                if (!z3) {
                    sb.append(str);
                }
                sb.append(zzd(zzfu.zzn(zzfu.zzl(zzamVar5)), i4, hashSet));
                z3 = false;
            }
        }
        return zzfu.zzc(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}

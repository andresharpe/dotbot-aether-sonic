package com.google.android.gms.tagmanager;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
final class zzec extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.REGEX_GROUP.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.ARG0.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.ARG1.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.IGNORE_CASE.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.GROUP.toString();

    public zzec() {
        super(zza, zzb, zzc);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        int i4;
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        if (zzamVar != null && zzamVar != zzfu.zzb() && zzamVar2 != null && zzamVar2 != zzfu.zzb()) {
            int i5 = 1;
            if (true != zzfu.zzg(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) map.get(zzd))).booleanValue()) {
                i4 = 64;
            } else {
                i4 = 66;
            }
            com.google.android.gms.internal.gtm.zzam zzamVar3 = (com.google.android.gms.internal.gtm.zzam) map.get(zze);
            if (zzamVar3 != null) {
                Long zzk = zzfu.zzk(zzfu.zzl(zzamVar3));
                if (zzk == zzfu.zzj()) {
                    return zzfu.zzb();
                }
                i5 = zzk.intValue();
                if (i5 < 0) {
                    return zzfu.zzb();
                }
            }
            try {
                Matcher matcher = Pattern.compile(zzfu.zzn(zzfu.zzl(zzamVar2)), i4).matcher(zzfu.zzn(zzfu.zzl(zzamVar)));
                String str = null;
                if (matcher.find() && matcher.groupCount() >= i5) {
                    str = matcher.group(i5);
                }
                if (str == null) {
                    return zzfu.zzb();
                }
                return zzfu.zzc(str);
            } catch (PatternSyntaxException unused) {
                return zzfu.zzb();
            }
        }
        return zzfu.zzb();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}

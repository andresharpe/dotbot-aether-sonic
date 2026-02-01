package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.D;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@D
/* loaded from: classes2.dex */
final class zzed extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.REGEX.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.IGNORE_CASE.toString();

    public zzed() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    protected final boolean zzc(String str, String str2, Map map) {
        int i4;
        if (true != zzfu.zzg(zzfu.zzl((com.google.android.gms.internal.gtm.zzam) map.get(zzb))).booleanValue()) {
            i4 = 64;
        } else {
            i4 = 66;
        }
        try {
            return Pattern.compile(str2, i4).matcher(str).find();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }
}

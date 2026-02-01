package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.D;
import java.util.Map;

@D
@com.google.android.gms.common.util.D
/* loaded from: classes2.dex */
public final class zzbr extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.EQUALS.toString();

    public zzbr() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    protected final boolean zzc(String str, String str2, Map map) {
        return str.equals(str2);
    }
}

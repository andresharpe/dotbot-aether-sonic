package com.google.android.gms.tagmanager;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzbq extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ENDS_WITH.toString();

    public zzbq() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    protected final boolean zzc(String str, String str2, Map map) {
        return str.endsWith(str2);
    }
}

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.C1275t;
import com.spotify.sdk.android.auth.b;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzg implements zzau {
    private final Context zza;

    public zzg(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.tagmanager.zzau
    public final void zza(Map map) {
        String queryParameter;
        Object obj;
        Object obj2 = map.get("gtm.url");
        if (obj2 == null && (obj = map.get("gtm")) != null && (obj instanceof Map)) {
            obj2 = ((Map) obj).get(C1275t.f28813a);
        }
        if (obj2 != null && (obj2 instanceof String) && (queryParameter = Uri.parse((String) obj2).getQueryParameter(b.c.f48987b)) != null) {
            zzcw.zzc(this.zza, queryParameter);
        }
    }
}

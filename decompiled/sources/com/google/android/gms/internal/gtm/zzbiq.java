package com.google.android.gms.internal.gtm;

import com.google.firebase.remoteconfig.l;

/* loaded from: classes.dex */
public enum zzbiq {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(l.f37524n)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzbbw.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzbiq(Object obj) {
        this.zzk = obj;
    }
}

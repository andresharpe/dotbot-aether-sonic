package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbhy extends RuntimeException {
    public zzbhy(zzbgs zzbgsVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzbfs zza() {
        return new zzbfs(getMessage());
    }
}

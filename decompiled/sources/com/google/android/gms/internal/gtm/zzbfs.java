package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzbfs extends IOException {
    private zzbgs zza;
    private boolean zzb;

    public zzbfs(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfr zza() {
        return new zzbfr("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzb() {
        return new zzbfs("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzc() {
        return new zzbfs("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzd() {
        return new zzbfs("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zze() {
        return new zzbfs("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzf() {
        return new zzbfs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzg() {
        return new zzbfs("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzi() {
        return new zzbfs("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfs zzj() {
        return new zzbfs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzbfs zzh(zzbgs zzbgsVar) {
        this.zza = zzbgsVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public zzbfs(String str) {
        super(str);
        this.zza = null;
    }
}

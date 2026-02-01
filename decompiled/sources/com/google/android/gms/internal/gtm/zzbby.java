package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzbby extends zzbcc {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbby(byte[] bArr, int i4, int i5, boolean z3, zzbbx zzbbxVar) {
        super(null);
        this.zzh = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zza() {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zzb(int i4) throws zzbfs {
        int i5 = this.zzh;
        this.zzh = 0;
        int i6 = this.zzf + this.zzg;
        this.zzf = i6;
        if (i6 > 0) {
            this.zzg = i6;
            this.zzf = i6 - i6;
        } else {
            this.zzg = 0;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final int zzc() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final zzbbw zzd() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final String zze() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final String zzf() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final void zzg(int i4) throws zzbfs {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final void zzh(int i4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzi() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzj() throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzbcc
    public final boolean zzk(int i4) throws IOException {
        throw null;
    }
}

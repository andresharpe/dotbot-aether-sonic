package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzwc extends zzbfb implements zzbgt {
    private static final zzwc zza;
    private zzvg zzA;
    private int zzf;
    private int zzg;
    private zzvi zzh;
    private boolean zzj;
    private long zzk;
    private double zzl;
    private zzvx zzn;
    private long zzp;
    private zzvq zzt;
    private long zzx;
    private zzvk zzy;
    private zzvo zzz;
    private byte zzC = 2;
    private String zzi = "";
    private String zzm = "";
    private String zzo = "";
    private String zzq = "";
    private String zzr = "";
    private zzbbw zzs = zzbbw.zzb;
    private String zzu = "";
    private zzbfp zzv = zzbff.zzaj();
    private zzbfp zzw = zzbff.zzaj();
    private zzbfo zzB = zzbff.zzai();

    static {
        zzwc zzwcVar = new zzwc();
        zza = zzwcVar;
        zzbff.zzan(zzwc.class, zzwcVar);
    }

    private zzwc() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzC = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzvy(null);
                }
                return new zzwc();
            }
            return zzbff.zzam(zza, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u0006\u0001ဃ\u000f\u0002ဌ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007က\u0005\bဈ\u0006\tᐉ\u0007\nဈ\b\u000bဈ\n\fဈ\u000b\rည\f\u000eဈ\u000e\u000fЛ\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဂ\t\u0013ဉ\u0012\u0015\u0015\u0016Л\u0017ᐉ\r", new Object[]{"zzf", "zzx", "zzg", zzwb.zzc(), "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzq", "zzr", "zzs", "zzu", "zzv", zzbrv.class, "zzy", "zzz", "zzp", "zzA", "zzB", "zzw", zzbrv.class, "zzt"});
        }
        return Byte.valueOf(this.zzC);
    }
}

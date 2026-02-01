package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzam extends zzbfb implements zzbgt {
    private static final zzbfm zza = new zzbfm<Integer, zzaq>() { // from class: com.google.android.gms.internal.gtm.zzam.1
        @Override // com.google.android.gms.internal.gtm.zzbfm
        /* renamed from: zza, reason: merged with bridge method [inline-methods] */
        public zzaq zzb(Integer num) {
            zzaq zzb = zzaq.zzb(num.intValue());
            if (zzb == null) {
                return zzaq.ESCAPE_HTML;
            }
            return zzb;
        }
    };
    private static final zzam zzf;
    private int zzg;
    private long zzo;
    private boolean zzp;
    private boolean zzs;
    private byte zzt = 2;
    private int zzh = 1;
    private String zzi = "";
    private zzbfp zzj = zzbff.zzaj();
    private zzbfp zzk = zzbff.zzaj();
    private zzbfp zzl = zzbff.zzaj();
    private String zzm = "";
    private String zzn = "";
    private zzbfp zzq = zzbff.zzaj();
    private zzbfl zzr = zzbff.zzah();

    static {
        zzam zzamVar = new zzam();
        zzf = zzamVar;
        zzbff.zzan(zzam.class, zzamVar);
    }

    private zzam() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzam zzamVar, Iterable iterable) {
        zzamVar.zzar();
        zzbay.zzS(iterable, zzamVar.zzl);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzg |= 4;
        zzamVar.zzm = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzD(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzg |= 8;
        zzamVar.zzn = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzg |= 2;
        zzamVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzF(zzam zzamVar, long j4) {
        zzamVar.zzg |= 16;
        zzamVar.zzo = j4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzG(zzam zzamVar, boolean z3) {
        zzamVar.zzg |= 32;
        zzamVar.zzp = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzbfp zzbfpVar = zzamVar.zzq;
        if (!zzbfpVar.zzc()) {
            zzamVar.zzq = zzbff.zzak(zzbfpVar);
        }
        zzamVar.zzq.add(zzamVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzJ(zzam zzamVar, Iterable iterable) {
        int i4;
        zzbfl zzbflVar = zzamVar.zzr;
        if (!zzbflVar.zzc()) {
            int size = zzbflVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size + size;
            }
            zzamVar.zzr = zzbflVar.zzd(i4);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzamVar.zzr.zzh(((zzaq) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzL(zzam zzamVar, boolean z3) {
        zzamVar.zzg |= 64;
        zzamVar.zzs = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzM(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzap();
        zzamVar.zzj.add(zzamVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzN(zzam zzamVar, Iterable iterable) {
        zzamVar.zzap();
        zzbay.zzS(iterable, zzamVar.zzj);
    }

    private final void zzap() {
        zzbfp zzbfpVar = this.zzj;
        if (!zzbfpVar.zzc()) {
            this.zzj = zzbff.zzak(zzbfpVar);
        }
    }

    private final void zzaq() {
        zzbfp zzbfpVar = this.zzk;
        if (!zzbfpVar.zzc()) {
            this.zzk = zzbff.zzak(zzbfpVar);
        }
    }

    private final void zzar() {
        zzbfp zzbfpVar = this.zzl;
        if (!zzbfpVar.zzc()) {
            this.zzl = zzbff.zzak(zzbfpVar);
        }
    }

    public static zzan zzg() {
        return (zzan) zzf.zzZ();
    }

    public static zzam zzj() {
        return zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzam zzamVar, zzat zzatVar) {
        zzamVar.zzh = zzatVar.zza();
        zzamVar.zzg |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzaq();
        zzamVar.zzk.add(zzamVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzam zzamVar, Iterable iterable) {
        zzamVar.zzaq();
        zzbay.zzS(iterable, zzamVar.zzk);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzar();
        zzamVar.zzl.add(zzamVar2);
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final boolean zzP() {
        return this.zzs;
    }

    public final int zza() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    protected final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzal zzalVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzt = b4;
                            return null;
                        }
                        return zzf;
                    }
                    return new zzan(zzalVar);
                }
                return new zzam();
            }
            return zzbff.zzam(zzf, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0005\u0001ᔌ\u0000\u0002ဈ\u0001\u0003Л\u0004Л\u0005Л\u0006ဈ\u0002\u0007ဈ\u0003\bဂ\u0004\tဇ\u0006\n\u001e\u000bЛ\fဇ\u0005", new Object[]{"zzg", "zzh", zzat.zzc(), "zzi", "zzj", zzam.class, "zzk", zzam.class, "zzl", zzam.class, "zzm", "zzn", "zzo", "zzs", "zzr", zzaq.zzc(), "zzq", zzam.class, "zzp"});
        }
        return Byte.valueOf(this.zzt);
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final int zzd() {
        return this.zzl.size();
    }

    public final int zze() {
        return this.zzq.size();
    }

    public final long zzf() {
        return this.zzo;
    }

    public final zzat zzh() {
        zzat zzb = zzat.zzb(this.zzh);
        if (zzb == null) {
            return zzat.STRING;
        }
        return zzb;
    }

    public final zzam zzk(int i4) {
        return (zzam) this.zzj.get(i4);
    }

    public final zzam zzl(int i4) {
        return (zzam) this.zzk.get(i4);
    }

    public final zzam zzm(int i4) {
        return (zzam) this.zzl.get(i4);
    }

    public final zzam zzn(int i4) {
        return (zzam) this.zzq.get(i4);
    }

    public final String zzo() {
        return this.zzn;
    }

    public final String zzp() {
        return this.zzm;
    }

    public final String zzq() {
        return this.zzi;
    }

    public final List zzr() {
        return new zzbfn(this.zzr, zza);
    }

    public final List zzs() {
        return this.zzj;
    }

    public final List zzt() {
        return this.zzq;
    }
}

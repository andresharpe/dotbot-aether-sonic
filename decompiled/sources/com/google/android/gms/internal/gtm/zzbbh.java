package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.C2191n;

/* loaded from: classes.dex */
final class zzbbh extends zzbbj {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public zzbbh(ByteBuffer byteBuffer, boolean z3) {
        super(null);
        this.zza = byteBuffer.array();
        this.zzb = byteBuffer.arrayOffset() + byteBuffer.position();
        this.zzc = byteBuffer.arrayOffset() + byteBuffer.limit();
    }

    private final byte zzU() throws IOException {
        int i4 = this.zzb;
        if (i4 != this.zzc) {
            byte[] bArr = this.zza;
            this.zzb = i4 + 1;
            return bArr[i4];
        }
        throw zzbfs.zzj();
    }

    private final int zzV() throws IOException {
        zzad(4);
        return zzW();
    }

    private final int zzW() {
        int i4 = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i4 + 4;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    private final int zzX() throws IOException {
        int i4;
        int i5 = this.zzb;
        int i6 = this.zzc;
        if (i6 != i5) {
            byte[] bArr = this.zza;
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            if (b4 >= 0) {
                this.zzb = i7;
                return b4;
            }
            if (i6 - i7 < 9) {
                return (int) zzaa();
            }
            int i8 = i5 + 2;
            int i9 = (bArr[i7] << 7) ^ b4;
            if (i9 < 0) {
                i4 = i9 ^ (-128);
            } else {
                int i10 = i5 + 3;
                int i11 = (bArr[i8] << 14) ^ i9;
                if (i11 >= 0) {
                    i4 = i11 ^ 16256;
                } else {
                    int i12 = i5 + 4;
                    int i13 = i11 ^ (bArr[i10] << 21);
                    if (i13 < 0) {
                        i4 = (-2080896) ^ i13;
                    } else {
                        i10 = i5 + 5;
                        byte b5 = bArr[i12];
                        int i14 = (i13 ^ (b5 << 28)) ^ 266354560;
                        if (b5 < 0) {
                            i12 = i5 + 6;
                            if (bArr[i10] < 0) {
                                i10 = i5 + 7;
                                if (bArr[i12] < 0) {
                                    i12 = i5 + 8;
                                    if (bArr[i10] < 0) {
                                        i10 = i5 + 9;
                                        if (bArr[i12] < 0) {
                                            int i15 = i5 + 10;
                                            if (bArr[i10] >= 0) {
                                                i8 = i15;
                                                i4 = i14;
                                            } else {
                                                throw zzbfs.zze();
                                            }
                                        }
                                    }
                                }
                            }
                            i4 = i14;
                        }
                        i4 = i14;
                    }
                    i8 = i12;
                }
                i8 = i10;
            }
            this.zzb = i8;
            return i4;
        }
        throw zzbfs.zzj();
    }

    private final long zzY() throws IOException {
        zzad(8);
        return zzZ();
    }

    private final long zzZ() {
        int i4 = this.zzb;
        byte[] bArr = this.zza;
        this.zzb = i4 + 8;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    private final long zzaa() throws IOException {
        long j4 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((zzU() & C2191n.f52349b) == 0) {
                return j4;
            }
        }
        throw zzbfs.zze();
    }

    private final Object zzab(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int i4 = this.zze;
        this.zze = ((this.zzd >>> 3) << 3) | 4;
        try {
            Object zze = zzbhfVar.zze();
            zzbhfVar.zzh(zze, this, zzbepVar);
            zzbhfVar.zzf(zze);
            if (this.zzd == this.zze) {
                return zze;
            }
            throw zzbfs.zzg();
        } finally {
            this.zze = i4;
        }
    }

    private final Object zzac(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int zzX = zzX();
        zzad(zzX);
        int i4 = this.zzc;
        int i5 = this.zzb + zzX;
        this.zzc = i5;
        try {
            Object zze = zzbhfVar.zze();
            zzbhfVar.zzh(zze, this, zzbepVar);
            zzbhfVar.zzf(zze);
            if (this.zzb == i5) {
                return zze;
            }
            throw zzbfs.zzg();
        } finally {
            this.zzc = i4;
        }
    }

    private final void zzad(int i4) throws IOException {
        if (i4 >= 0 && i4 <= this.zzc - this.zzb) {
        } else {
            throw zzbfs.zzj();
        }
    }

    private final void zzae(int i4) throws IOException {
        if (this.zzb == i4) {
        } else {
            throw zzbfs.zzj();
        }
    }

    private final void zzaf(int i4) throws IOException {
        if ((this.zzd & 7) == i4) {
        } else {
            throw zzbfs.zza();
        }
    }

    private final void zzag(int i4) throws IOException {
        zzad(i4);
        this.zzb += i4;
    }

    private final void zzah(int i4) throws IOException {
        zzad(i4);
        if ((i4 & 3) == 0) {
        } else {
            throw zzbfs.zzg();
        }
    }

    private final void zzai(int i4) throws IOException {
        zzad(i4);
        if ((i4 & 7) == 0) {
        } else {
            throw zzbfs.zzg();
        }
    }

    private final boolean zzaj() {
        return this.zzb == this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzA(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbej) {
            zzbej zzbejVar = (zzbej) list;
            int i6 = this.zzd & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int zzX = zzX();
                    zzai(zzX);
                    int i7 = this.zzb + zzX;
                    while (this.zzb < i7) {
                        zzbejVar.zze(Double.longBitsToDouble(zzZ()));
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbejVar.zze(zza());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 1) {
            if (i8 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i9 = this.zzb + zzX2;
                while (this.zzb < i9) {
                    list.add(Double.valueOf(Double.longBitsToDouble(zzZ())));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Double.valueOf(zza()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzB(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbfgVar.zzh(zzX());
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(zze());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(zze()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzC(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbfgVar.zzh(zzf());
                    if (zzaj()) {
                        return;
                    } else {
                        i5 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i5;
                return;
            }
            int zzX = zzX();
            zzah(zzX);
            int i7 = this.zzb + zzX;
            while (this.zzb < i7) {
                zzbfgVar.zzh(zzW());
            }
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 2) {
            if (i8 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Integer.valueOf(zzf()));
                if (zzaj()) {
                    return;
                } else {
                    i4 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i4;
            return;
        }
        int zzX2 = zzX();
        zzah(zzX2);
        int i9 = this.zzb + zzX2;
        while (this.zzb < i9) {
            list.add(Integer.valueOf(zzW()));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzD(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i6 = this.zzd & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int zzX = zzX();
                    zzai(zzX);
                    int i7 = this.zzb + zzX;
                    while (this.zzb < i7) {
                        zzbghVar.zzg(zzZ());
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzk());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 1) {
            if (i8 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i9 = this.zzb + zzX2;
                while (this.zzb < i9) {
                    list.add(Long.valueOf(zzZ()));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzk()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzE(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbew) {
            zzbew zzbewVar = (zzbew) list;
            int i6 = this.zzd & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbewVar.zzf(zzb());
                    if (zzaj()) {
                        return;
                    } else {
                        i5 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i5;
                return;
            }
            int zzX = zzX();
            zzah(zzX);
            int i7 = this.zzb + zzX;
            while (this.zzb < i7) {
                zzbewVar.zzf(Float.intBitsToFloat(zzW()));
            }
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 2) {
            if (i8 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Float.valueOf(zzb()));
                if (zzaj()) {
                    return;
                } else {
                    i4 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i4;
            return;
        }
        int zzX2 = zzX();
        zzah(zzX2);
        int i9 = this.zzb + zzX2;
        while (this.zzb < i9) {
            list.add(Float.valueOf(Float.intBitsToFloat(zzW())));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final void zzF(List list, zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int i4;
        int i5 = this.zzd;
        if ((i5 & 7) != 3) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzab(zzbhfVar, zzbepVar));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == i5);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzG(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbfgVar.zzh(zzX());
                    }
                    zzae(zzX);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(zzg());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
                zzae(zzX2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(zzg()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzH(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbghVar.zzg(zzp());
                    }
                    zzae(zzX);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzl());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zzp()));
                }
                zzae(zzX2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzl()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzI(List list, zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int i4;
        int i5 = this.zzd;
        if ((i5 & 7) != 2) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzac(zzbhfVar, zzbepVar));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == i5);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzJ(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 2) {
                if (i6 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbfgVar.zzh(zzh());
                    if (zzaj()) {
                        return;
                    } else {
                        i5 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i5;
                return;
            }
            int zzX = zzX();
            zzah(zzX);
            int i7 = this.zzb + zzX;
            while (this.zzb < i7) {
                zzbfgVar.zzh(zzW());
            }
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 2) {
            if (i8 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Integer.valueOf(zzh()));
                if (zzaj()) {
                    return;
                } else {
                    i4 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i4;
            return;
        }
        int zzX2 = zzX();
        zzah(zzX2);
        int i9 = this.zzb + zzX2;
        while (this.zzb < i9) {
            list.add(Integer.valueOf(zzW()));
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzK(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i6 = this.zzd & 7;
            if (i6 != 1) {
                if (i6 == 2) {
                    int zzX = zzX();
                    zzai(zzX);
                    int i7 = this.zzb + zzX;
                    while (this.zzb < i7) {
                        zzbghVar.zzg(zzZ());
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzm());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i8 = this.zzd & 7;
        if (i8 != 1) {
            if (i8 == 2) {
                int zzX2 = zzX();
                zzai(zzX2);
                int i9 = this.zzb + zzX2;
                while (this.zzb < i9) {
                    list.add(Long.valueOf(zzZ()));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzm()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzL(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbfgVar.zzh(zzbcc.zzs(zzX()));
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(zzi());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzbcc.zzs(zzX())));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(zzi()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzM(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbghVar.zzg(zzbcc.zzt(zzp()));
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzn());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zzbcc.zzt(zzp())));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzn()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzN(List list) throws IOException {
        zzO(list, false);
    }

    public final void zzO(List list, boolean z3) throws IOException {
        int i4;
        int i5;
        if ((this.zzd & 7) == 2) {
            if ((list instanceof zzbga) && !z3) {
                zzbga zzbgaVar = (zzbga) list;
                do {
                    zzbgaVar.zzi(zzq());
                    if (zzaj()) {
                        return;
                    } else {
                        i5 = this.zzb;
                    }
                } while (zzX() == this.zzd);
                this.zzb = i5;
                return;
            }
            do {
                list.add(zzw(z3));
                if (zzaj()) {
                    return;
                } else {
                    i4 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i4;
            return;
        }
        throw zzbfs.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzP(List list) throws IOException {
        zzO(list, true);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzQ(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbfgVar.zzh(zzX());
                    }
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(zzj());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Integer.valueOf(zzX()));
                }
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(zzj()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzR(List list) throws IOException {
        int i4;
        int i5;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        zzbghVar.zzg(zzp());
                    }
                    zzae(zzX);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzo());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    list.add(Long.valueOf(zzp()));
                }
                zzae(zzX2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzo()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final boolean zzS() throws IOException {
        zzaf(0);
        if (zzX() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final boolean zzT() throws IOException {
        int i4;
        int i5;
        if (zzaj() || (i4 = this.zzd) == (i5 = this.zze)) {
            return false;
        }
        int i6 = i4 & 7;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 5) {
                            zzag(4);
                            return true;
                        }
                        throw zzbfs.zza();
                    }
                    this.zze = ((i4 >>> 3) << 3) | 4;
                    while (zzc() != Integer.MAX_VALUE && zzT()) {
                    }
                    if (this.zzd == this.zze) {
                        this.zze = i5;
                        return true;
                    }
                    throw zzbfs.zzg();
                }
                zzag(zzX());
                return true;
            }
            zzag(8);
            return true;
        }
        int i7 = this.zzc;
        int i8 = this.zzb;
        if (i7 - i8 >= 10) {
            byte[] bArr = this.zza;
            int i9 = 0;
            while (i9 < 10) {
                int i10 = i8 + 1;
                if (bArr[i8] >= 0) {
                    this.zzb = i10;
                    break;
                }
                i9++;
                i8 = i10;
            }
        }
        for (int i11 = 0; i11 < 10; i11++) {
            if (zzU() >= 0) {
                return true;
            }
        }
        throw zzbfs.zze();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final double zza() throws IOException {
        zzaf(1);
        return Double.longBitsToDouble(zzY());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final float zzb() throws IOException {
        zzaf(5);
        return Float.intBitsToFloat(zzV());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzc() throws IOException {
        if (zzaj()) {
            return Integer.MAX_VALUE;
        }
        int zzX = zzX();
        this.zzd = zzX;
        if (zzX == this.zze) {
            return Integer.MAX_VALUE;
        }
        return zzX >>> 3;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zze() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzf() throws IOException {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzg() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzh() throws IOException {
        zzaf(5);
        return zzV();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzi() throws IOException {
        zzaf(0);
        return zzbcc.zzs(zzX());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzj() throws IOException {
        zzaf(0);
        return zzX();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzk() throws IOException {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzl() throws IOException {
        zzaf(0);
        return zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzm() throws IOException {
        zzaf(1);
        return zzY();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzn() throws IOException {
        zzaf(0);
        return zzbcc.zzt(zzp());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzo() throws IOException {
        zzaf(0);
        return zzp();
    }

    public final long zzp() throws IOException {
        long j4;
        long j5;
        int i4 = this.zzb;
        int i5 = this.zzc;
        if (i5 != i4) {
            byte[] bArr = this.zza;
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.zzb = i6;
                return b4;
            }
            if (i5 - i6 < 9) {
                return zzaa();
            }
            int i7 = i4 + 2;
            int i8 = (bArr[i6] << 7) ^ b4;
            if (i8 < 0) {
                j4 = i8 ^ (-128);
            } else {
                int i9 = i4 + 3;
                int i10 = (bArr[i7] << 14) ^ i8;
                if (i10 >= 0) {
                    j4 = i10 ^ 16256;
                } else {
                    int i11 = i4 + 4;
                    int i12 = i10 ^ (bArr[i9] << 21);
                    if (i12 < 0) {
                        long j6 = (-2080896) ^ i12;
                        i7 = i11;
                        j4 = j6;
                    } else {
                        i9 = i4 + 5;
                        long j7 = i12 ^ (bArr[i11] << 28);
                        if (j7 >= 0) {
                            j4 = j7 ^ 266354560;
                        } else {
                            i7 = i4 + 6;
                            long j8 = (bArr[i9] << 35) ^ j7;
                            if (j8 < 0) {
                                j5 = -34093383808L;
                            } else {
                                int i13 = i4 + 7;
                                long j9 = j8 ^ (bArr[i7] << 42);
                                if (j9 >= 0) {
                                    j4 = j9 ^ 4363953127296L;
                                } else {
                                    i7 = i4 + 8;
                                    j8 = j9 ^ (bArr[i13] << 49);
                                    if (j8 < 0) {
                                        j5 = -558586000294016L;
                                    } else {
                                        i13 = i4 + 9;
                                        long j10 = (j8 ^ (bArr[i7] << 56)) ^ 71499008037633920L;
                                        if (j10 < 0) {
                                            i7 = i4 + 10;
                                            if (bArr[i13] >= 0) {
                                                j4 = j10;
                                            } else {
                                                throw zzbfs.zze();
                                            }
                                        } else {
                                            j4 = j10;
                                        }
                                    }
                                }
                                i7 = i13;
                            }
                            j4 = j8 ^ j5;
                        }
                    }
                }
                i7 = i9;
            }
            this.zzb = i7;
            return j4;
        }
        throw zzbfs.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final zzbbw zzq() throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return zzbbw.zzb;
        }
        zzad(zzX);
        zzbbw zzq = zzbbw.zzq(this.zza, this.zzb, zzX);
        this.zzb += zzX;
        return zzq;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final Object zzr(Class cls, zzbep zzbepVar) throws IOException {
        zzaf(3);
        return zzab(zzbhb.zza().zzb(cls), zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final Object zzs(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        zzaf(3);
        return zzab(zzbhfVar, zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final Object zzt(Class cls, zzbep zzbepVar) throws IOException {
        zzaf(2);
        return zzac(zzbhb.zza().zzb(cls), zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final Object zzu(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        zzaf(2);
        return zzac(zzbhfVar, zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final String zzv() throws IOException {
        return zzw(false);
    }

    public final String zzw(boolean z3) throws IOException {
        zzaf(2);
        int zzX = zzX();
        if (zzX == 0) {
            return "";
        }
        zzad(zzX);
        if (z3) {
            byte[] bArr = this.zza;
            int i4 = this.zzb;
            if (!zzbio.zzf(bArr, i4, i4 + zzX)) {
                throw zzbfs.zzd();
            }
        }
        String str = new String(this.zza, this.zzb, zzX, zzbfq.zzb);
        this.zzb += zzX;
        return str;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final String zzx() throws IOException {
        return zzw(true);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzy(List list) throws IOException {
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        if (list instanceof zzbbl) {
            zzbbl zzbblVar = (zzbbl) list;
            int i6 = this.zzd & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int zzX = this.zzb + zzX();
                    while (this.zzb < zzX) {
                        if (zzX() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        zzbblVar.zze(z4);
                    }
                    zzae(zzX);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbblVar.zze(zzS());
                if (zzaj()) {
                    return;
                } else {
                    i5 = this.zzb;
                }
            } while (zzX() == this.zzd);
            this.zzb = i5;
            return;
        }
        int i7 = this.zzd & 7;
        if (i7 != 0) {
            if (i7 == 2) {
                int zzX2 = this.zzb + zzX();
                while (this.zzb < zzX2) {
                    if (zzX() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    list.add(Boolean.valueOf(z3));
                }
                zzae(zzX2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Boolean.valueOf(zzS()));
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzz(List list) throws IOException {
        int i4;
        if ((this.zzd & 7) != 2) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzq());
            if (zzaj()) {
                return;
            } else {
                i4 = this.zzb;
            }
        } while (zzX() == this.zzd);
        this.zzb = i4;
    }
}

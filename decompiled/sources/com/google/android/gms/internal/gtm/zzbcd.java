package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbcd implements zzbhe {
    private final zzbcc zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzbcd(zzbcc zzbccVar) {
        zzbfq.zzf(zzbccVar, "input");
        this.zza = zzbccVar;
        zzbccVar.zzc = this;
    }

    private final Object zzO(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int i4 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzbhfVar.zze();
            zzbhfVar.zzh(zze, this, zzbepVar);
            zzbhfVar.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzbfs.zzg();
        } finally {
            this.zzc = i4;
        }
    }

    private final Object zzU(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int zzn = ((zzbca) this.zza).zzn();
        zzbcc zzbccVar = this.zza;
        if (zzbccVar.zza < zzbccVar.zzb) {
            int zzb = zzbccVar.zzb(zzn);
            Object zze = zzbhfVar.zze();
            this.zza.zza++;
            zzbhfVar.zzh(zze, this, zzbepVar);
            zzbhfVar.zzf(zze);
            this.zza.zzg(0);
            r5.zza--;
            this.zza.zzh(zzb);
            return zze;
        }
        throw new zzbfs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzV(int i4) throws IOException {
        if (this.zza.zza() == i4) {
        } else {
            throw zzbfs.zzj();
        }
    }

    private final void zzW(int i4) throws IOException {
        if ((this.zzb & 7) == i4) {
        } else {
            throw zzbfs.zza();
        }
    }

    private static final void zzX(int i4) throws IOException {
        if ((i4 & 3) == 0) {
        } else {
            throw zzbfs.zzg();
        }
    }

    private static final void zzY(int i4) throws IOException {
        if ((i4 & 7) == 0) {
        } else {
            throw zzbfs.zzg();
        }
    }

    public static zzbcd zzp(zzbcc zzbccVar) {
        zzbcd zzbcdVar = zzbccVar.zzc;
        if (zzbcdVar != null) {
            return zzbcdVar;
        }
        return new zzbcd(zzbccVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzA(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbej) {
            zzbej zzbejVar = (zzbej) list;
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int zzn = ((zzbca) this.zza).zzn();
                    zzY(zzn);
                    int zza = this.zza.zza() + zzn;
                    do {
                        zzbejVar.zze(Double.longBitsToDouble(((zzbca) this.zza).zzo()));
                    } while (this.zza.zza() < zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbejVar.zze(Double.longBitsToDouble(((zzbca) this.zza).zzo()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int zzn2 = ((zzbca) this.zza).zzn();
                zzY(zzn2);
                int zza2 = this.zza.zza() + zzn2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzbca) this.zza).zzo())));
                } while (this.zza.zza() < zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((zzbca) this.zza).zzo())));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzB(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbfgVar.zzh(((zzbca) this.zza).zzn());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(((zzbca) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzC(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbfgVar.zzh(((zzbca) this.zza).zzm());
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc2 = this.zza.zzc();
                    }
                } while (zzc2 == this.zzb);
                this.zzd = zzc2;
                return;
            }
            int zzn = ((zzbca) this.zza).zzn();
            zzX(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                zzbfgVar.zzh(((zzbca) this.zza).zzm());
            } while (this.zza.zza() < zza);
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Integer.valueOf(((zzbca) this.zza).zzm()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        int zzn2 = ((zzbca) this.zza).zzn();
        zzX(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            list.add(Integer.valueOf(((zzbca) this.zza).zzm()));
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzD(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int zzn = ((zzbca) this.zza).zzn();
                    zzY(zzn);
                    int zza = this.zza.zza() + zzn;
                    do {
                        zzbghVar.zzg(((zzbca) this.zza).zzo());
                    } while (this.zza.zza() < zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(((zzbca) this.zza).zzo());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int zzn2 = ((zzbca) this.zza).zzn();
                zzY(zzn2);
                int zza2 = this.zza.zza() + zzn2;
                do {
                    list.add(Long.valueOf(((zzbca) this.zza).zzo()));
                } while (this.zza.zza() < zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(((zzbca) this.zza).zzo()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzE(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbew) {
            zzbew zzbewVar = (zzbew) list;
            int i4 = this.zzb & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbewVar.zzf(Float.intBitsToFloat(((zzbca) this.zza).zzm()));
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc2 = this.zza.zzc();
                    }
                } while (zzc2 == this.zzb);
                this.zzd = zzc2;
                return;
            }
            int zzn = ((zzbca) this.zza).zzn();
            zzX(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                zzbewVar.zzf(Float.intBitsToFloat(((zzbca) this.zza).zzm()));
            } while (this.zza.zza() < zza);
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(((zzbca) this.zza).zzm())));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        int zzn2 = ((zzbca) this.zza).zzn();
        zzX(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((zzbca) this.zza).zzm())));
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final void zzF(List list, zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int zzc;
        int i4 = this.zzb;
        if ((i4 & 7) != 3) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzO(zzbhfVar, zzbepVar));
            if (!this.zza.zzi() && this.zzd == 0) {
                zzc = this.zza.zzc();
            } else {
                return;
            }
        } while (zzc == i4);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzG(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbfgVar.zzh(((zzbca) this.zza).zzn());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(((zzbca) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzH(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbghVar.zzg(((zzbca) this.zza).zzp());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(((zzbca) this.zza).zzp());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Long.valueOf(((zzbca) this.zza).zzp()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(((zzbca) this.zza).zzp()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzI(List list, zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        int zzc;
        int i4 = this.zzb;
        if ((i4 & 7) != 2) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzU(zzbhfVar, zzbepVar));
            if (!this.zza.zzi() && this.zzd == 0) {
                zzc = this.zza.zzc();
            } else {
                return;
            }
        } while (zzc == i4);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzJ(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw zzbfs.zza();
                }
                do {
                    zzbfgVar.zzh(((zzbca) this.zza).zzm());
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc2 = this.zza.zzc();
                    }
                } while (zzc2 == this.zzb);
                this.zzd = zzc2;
                return;
            }
            int zzn = ((zzbca) this.zza).zzn();
            zzX(zzn);
            int zza = this.zza.zza() + zzn;
            do {
                zzbfgVar.zzh(((zzbca) this.zza).zzm());
            } while (this.zza.zza() < zza);
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw zzbfs.zza();
            }
            do {
                list.add(Integer.valueOf(((zzbca) this.zza).zzm()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        int zzn2 = ((zzbca) this.zza).zzn();
        zzX(zzn2);
        int zza2 = this.zza.zza() + zzn2;
        do {
            list.add(Integer.valueOf(((zzbca) this.zza).zzm()));
        } while (this.zza.zza() < zza2);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzK(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int zzn = ((zzbca) this.zza).zzn();
                    zzY(zzn);
                    int zza = this.zza.zza() + zzn;
                    do {
                        zzbghVar.zzg(((zzbca) this.zza).zzo());
                    } while (this.zza.zza() < zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(((zzbca) this.zza).zzo());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int zzn2 = ((zzbca) this.zza).zzn();
                zzY(zzn2);
                int zza2 = this.zza.zza() + zzn2;
                do {
                    list.add(Long.valueOf(((zzbca) this.zza).zzo()));
                } while (this.zza.zza() < zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(((zzbca) this.zza).zzo()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzL(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbfgVar.zzh(zzbcc.zzs(((zzbca) this.zza).zzn()));
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(zzbcc.zzs(((zzbca) this.zza).zzn()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Integer.valueOf(zzbcc.zzs(((zzbca) this.zza).zzn())));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(zzbcc.zzs(((zzbca) this.zza).zzn())));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzM(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbghVar.zzg(zzbcc.zzt(((zzbca) this.zza).zzp()));
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(zzbcc.zzt(((zzbca) this.zza).zzp()));
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Long.valueOf(zzbcc.zzt(((zzbca) this.zza).zzp())));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(zzbcc.zzt(((zzbca) this.zza).zzp())));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzN(List list) throws IOException {
        zzw(list, false);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzP(List list) throws IOException {
        zzw(list, true);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzQ(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbfg) {
            zzbfg zzbfgVar = (zzbfg) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbfgVar.zzh(((zzbca) this.zza).zzn());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbfgVar.zzh(((zzbca) this.zza).zzn());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Integer.valueOf(((zzbca) this.zza).zzn()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzR(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbgh) {
            zzbgh zzbghVar = (zzbgh) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbghVar.zzg(((zzbca) this.zza).zzp());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbghVar.zzg(((zzbca) this.zza).zzp());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Long.valueOf(((zzbca) this.zza).zzp()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Long.valueOf(((zzbca) this.zza).zzp()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final boolean zzS() throws IOException {
        zzW(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final boolean zzT() throws IOException {
        int i4;
        if (!this.zza.zzi() && (i4 = this.zzb) != this.zzc) {
            return this.zza.zzk(i4);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final double zza() throws IOException {
        zzW(1);
        return Double.longBitsToDouble(((zzbca) this.zza).zzo());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final float zzb() throws IOException {
        zzW(5);
        return Float.intBitsToFloat(((zzbca) this.zza).zzm());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzc() throws IOException {
        int i4 = this.zzd;
        if (i4 != 0) {
            this.zzb = i4;
            this.zzd = 0;
        } else {
            i4 = this.zza.zzc();
            this.zzb = i4;
        }
        if (i4 != 0 && i4 != this.zzc) {
            return i4 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zze() throws IOException {
        zzW(0);
        return ((zzbca) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzf() throws IOException {
        zzW(5);
        return ((zzbca) this.zza).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzg() throws IOException {
        zzW(0);
        return ((zzbca) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzh() throws IOException {
        zzW(5);
        return ((zzbca) this.zza).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzi() throws IOException {
        zzW(0);
        return zzbcc.zzs(((zzbca) this.zza).zzn());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final int zzj() throws IOException {
        zzW(0);
        return ((zzbca) this.zza).zzn();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzk() throws IOException {
        zzW(1);
        return ((zzbca) this.zza).zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzl() throws IOException {
        zzW(0);
        return ((zzbca) this.zza).zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzm() throws IOException {
        zzW(1);
        return ((zzbca) this.zza).zzo();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzn() throws IOException {
        zzW(0);
        return zzbcc.zzt(((zzbca) this.zza).zzp());
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final long zzo() throws IOException {
        zzW(0);
        return ((zzbca) this.zza).zzp();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final zzbbw zzq() throws IOException {
        zzW(2);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final Object zzr(Class cls, zzbep zzbepVar) throws IOException {
        zzW(3);
        return zzO(zzbhb.zza().zzb(cls), zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    @Deprecated
    public final Object zzs(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        zzW(3);
        return zzO(zzbhfVar, zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final Object zzt(Class cls, zzbep zzbepVar) throws IOException {
        zzW(2);
        return zzU(zzbhb.zza().zzb(cls), zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final Object zzu(zzbhf zzbhfVar, zzbep zzbepVar) throws IOException {
        zzW(2);
        return zzU(zzbhfVar, zzbepVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final String zzv() throws IOException {
        zzW(2);
        return this.zza.zze();
    }

    public final void zzw(List list, boolean z3) throws IOException {
        String zzv;
        int zzc;
        int zzc2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzbga) && !z3) {
                zzbga zzbgaVar = (zzbga) list;
                do {
                    zzbgaVar.zzi(zzq());
                    if (this.zza.zzi()) {
                        return;
                    } else {
                        zzc2 = this.zza.zzc();
                    }
                } while (zzc2 == this.zzb);
                this.zzd = zzc2;
                return;
            }
            do {
                if (z3) {
                    zzv = zzx();
                } else {
                    zzv = zzv();
                }
                list.add(zzv);
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc = this.zza.zzc();
                }
            } while (zzc == this.zzb);
            this.zzd = zzc;
            return;
        }
        throw zzbfs.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final String zzx() throws IOException {
        zzW(2);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzy(List list) throws IOException {
        int zzc;
        int zzc2;
        if (list instanceof zzbbl) {
            zzbbl zzbblVar = (zzbbl) list;
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int zza = this.zza.zza() + ((zzbca) this.zza).zzn();
                    do {
                        zzbblVar.zze(this.zza.zzj());
                    } while (this.zza.zza() < zza);
                    zzV(zza);
                    return;
                }
                throw zzbfs.zza();
            }
            do {
                zzbblVar.zze(this.zza.zzj());
                if (this.zza.zzi()) {
                    return;
                } else {
                    zzc2 = this.zza.zzc();
                }
            } while (zzc2 == this.zzb);
            this.zzd = zzc2;
            return;
        }
        int i5 = this.zzb & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int zza2 = this.zza.zza() + ((zzbca) this.zza).zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzj()));
                } while (this.zza.zza() < zza2);
                zzV(zza2);
                return;
            }
            throw zzbfs.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzj()));
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhe
    public final void zzz(List list) throws IOException {
        int zzc;
        if ((this.zzb & 7) != 2) {
            throw zzbfs.zza();
        }
        do {
            list.add(zzq());
            if (this.zza.zzi()) {
                return;
            } else {
                zzc = this.zza.zzc();
            }
        } while (zzc == this.zzb);
        this.zzd = zzc;
    }
}

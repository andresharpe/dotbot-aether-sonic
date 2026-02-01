package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbgw implements zzbhf {
    private final zzbgs zza;
    private final zzbhz zzb;
    private final boolean zzc;
    private final zzbeq zzd;

    private zzbgw(zzbhz zzbhzVar, zzbeq zzbeqVar, zzbgs zzbgsVar) {
        this.zzb = zzbhzVar;
        this.zzc = zzbeqVar.zzi(zzbgsVar);
        this.zzd = zzbeqVar;
        this.zza = zzbgsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgw zzc(zzbhz zzbhzVar, zzbeq zzbeqVar, zzbgs zzbgsVar) {
        return new zzbgw(zzbhzVar, zzbeqVar, zzbgsVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final int zza(Object obj) {
        zzbhz zzbhzVar = this.zzb;
        int zzb = zzbhzVar.zzb(zzbhzVar.zzd(obj));
        if (this.zzc) {
            return zzb + this.zzd.zzb(obj).zzc();
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            return (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final Object zze() {
        return this.zza.zzas().zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzg(Object obj, Object obj2) {
        zzbhh.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzbhh.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzh(Object obj, zzbhe zzbheVar, zzbep zzbepVar) throws IOException {
        boolean zzT;
        zzbhz zzbhzVar = this.zzb;
        zzbeq zzbeqVar = this.zzd;
        Object zzc = zzbhzVar.zzc(obj);
        zzbeu zzc2 = zzbeqVar.zzc(obj);
        while (zzbheVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzbheVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzbeqVar.zzd(zzbepVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzbeqVar.zzg(zzbheVar, zzd2, zzbepVar, zzc2);
                        } else {
                            zzT = zzbhzVar.zzp(zzc, zzbheVar);
                        }
                    } else {
                        zzT = zzbheVar.zzT();
                    }
                    if (!zzT) {
                        zzbhzVar.zzn(obj, zzc);
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i4 = 0;
                    zzbbw zzbbwVar = null;
                    while (zzbheVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzbheVar.zzd();
                        if (zzd3 == 16) {
                            i4 = zzbheVar.zzj();
                            obj2 = zzbeqVar.zzd(zzbepVar, this.zza, i4);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzbeqVar.zzg(zzbheVar, obj2, zzbepVar, zzc2);
                            } else {
                                zzbbwVar = zzbheVar.zzq();
                            }
                        } else if (!zzbheVar.zzT()) {
                            break;
                        }
                    }
                    if (zzbheVar.zzd() == 12) {
                        if (zzbbwVar != null) {
                            if (obj2 != null) {
                                zzbeqVar.zzh(zzbbwVar, obj2, zzbepVar, zzc2);
                            } else {
                                zzbhzVar.zzk(zzc, i4, zzbbwVar);
                            }
                        }
                    } else {
                        throw zzbfs.zzb();
                    }
                }
            } catch (Throwable th) {
                zzbhzVar.zzn(obj, zzc);
                throw th;
            }
        }
        zzbhzVar.zzn(obj, zzc);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf A[EDGE_INSN: B:24:0x00bf->B:25:0x00bf BREAK  A[LOOP:1: B:10:0x0067->B:18:0x0067], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzbhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.gtm.zzbbf r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.android.gms.internal.gtm.zzbff r0 = (com.google.android.gms.internal.gtm.zzbff) r0
            com.google.android.gms.internal.gtm.zzbia r1 = r0.zzd
            com.google.android.gms.internal.gtm.zzbia r2 = com.google.android.gms.internal.gtm.zzbia.zzc()
            if (r1 != r2) goto L11
            com.google.android.gms.internal.gtm.zzbia r1 = com.google.android.gms.internal.gtm.zzbia.zze()
            r0.zzd = r1
        L11:
            com.google.android.gms.internal.gtm.zzbfb r11 = (com.google.android.gms.internal.gtm.zzbfb) r11
            com.google.android.gms.internal.gtm.zzbeu r11 = r11.zzV()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lca
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zzj(r12, r13, r15)
            int r13 = r15.zza
            r3 = 11
            r5 = 2
            if (r13 == r3) goto L65
            r3 = r13 & 7
            if (r3 != r5) goto L60
            com.google.android.gms.internal.gtm.zzbeq r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzbep r3 = r15.zzd
            com.google.android.gms.internal.gtm.zzbgs r5 = r10.zza
            int r6 = r13 >>> 3
            java.lang.Object r8 = r2.zzd(r3, r5, r6)
            if (r8 == 0) goto L56
            com.google.android.gms.internal.gtm.zzbhb r13 = com.google.android.gms.internal.gtm.zzbhb.zza()
            r2 = r8
            com.google.android.gms.internal.gtm.zzbfd r2 = (com.google.android.gms.internal.gtm.zzbfd) r2
            com.google.android.gms.internal.gtm.zzbgs r3 = r2.zzc
            java.lang.Class r3 = r3.getClass()
            com.google.android.gms.internal.gtm.zzbhf r13 = r13.zzb(r3)
            int r13 = com.google.android.gms.internal.gtm.zzbbg.zzd(r13, r12, r4, r14, r15)
            com.google.android.gms.internal.gtm.zzbfc r2 = r2.zzd
            java.lang.Object r3 = r15.zzc
            r11.zzk(r2, r3)
        L54:
            r2 = r8
            goto L19
        L56:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.android.gms.internal.gtm.zzbbg.zzi(r2, r3, r4, r5, r6, r7)
            goto L54
        L60:
            int r13 = com.google.android.gms.internal.gtm.zzbbg.zzn(r13, r12, r4, r14, r15)
            goto L19
        L65:
            r13 = 0
            r3 = r0
        L67:
            if (r4 >= r14) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zzj(r12, r4, r15)
            int r6 = r15.zza
            r7 = r6 & 7
            int r8 = r6 >>> 3
            if (r8 == r5) goto La3
            r9 = 3
            if (r8 == r9) goto L79
            goto Lb6
        L79:
            if (r2 == 0) goto L98
            com.google.android.gms.internal.gtm.zzbhb r6 = com.google.android.gms.internal.gtm.zzbhb.zza()
            r7 = r2
            com.google.android.gms.internal.gtm.zzbfd r7 = (com.google.android.gms.internal.gtm.zzbfd) r7
            com.google.android.gms.internal.gtm.zzbgs r8 = r7.zzc
            java.lang.Class r8 = r8.getClass()
            com.google.android.gms.internal.gtm.zzbhf r6 = r6.zzb(r8)
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zzd(r6, r12, r4, r14, r15)
            com.google.android.gms.internal.gtm.zzbfc r6 = r7.zzd
            java.lang.Object r7 = r15.zzc
            r11.zzk(r6, r7)
            goto L67
        L98:
            if (r7 != r5) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zza(r12, r4, r15)
            java.lang.Object r3 = r15.zzc
            com.google.android.gms.internal.gtm.zzbbw r3 = (com.google.android.gms.internal.gtm.zzbbw) r3
            goto L67
        La3:
            if (r7 != 0) goto Lb6
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zzj(r12, r4, r15)
            int r13 = r15.zza
            com.google.android.gms.internal.gtm.zzbeq r2 = r10.zzd
            com.google.android.gms.internal.gtm.zzbep r6 = r15.zzd
            com.google.android.gms.internal.gtm.zzbgs r7 = r10.zza
            java.lang.Object r2 = r2.zzd(r6, r7, r13)
            goto L67
        Lb6:
            r7 = 12
            if (r6 == r7) goto Lbf
            int r4 = com.google.android.gms.internal.gtm.zzbbg.zzn(r6, r12, r4, r14, r15)
            goto L67
        Lbf:
            if (r3 == 0) goto Lc7
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.zzh(r13, r3)
        Lc7:
            r13 = r4
            goto L19
        Lca:
            if (r13 != r14) goto Lcd
            return
        Lcd:
            com.google.android.gms.internal.gtm.zzbfs r11 = com.google.android.gms.internal.gtm.zzbfs.zzg()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgw.zzi(java.lang.Object, byte[], int, int, com.google.android.gms.internal.gtm.zzbbf):void");
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final boolean zzk(Object obj) {
        return this.zzd.zzb(obj).zzm();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzn(Object obj, zzbck zzbckVar) throws IOException {
        Iterator zzg = this.zzd.zzb(obj).zzg();
        while (zzg.hasNext()) {
            Map.Entry entry = (Map.Entry) zzg.next();
            zzbet zzbetVar = (zzbet) entry.getKey();
            if (zzbetVar.zze() == zzbiq.MESSAGE && !zzbetVar.zzg()) {
                zzbetVar.zzf();
                if (entry instanceof zzbfv) {
                    zzbckVar.zzw(zzbetVar.zza(), ((zzbfv) entry).zza().zzb());
                } else {
                    zzbckVar.zzw(zzbetVar.zza(), entry.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzbhz zzbhzVar = this.zzb;
        zzbhzVar.zzr(zzbhzVar.zzd(obj), zzbckVar);
    }
}

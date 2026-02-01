package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class K1 extends AbstractC1440l4 implements Q4 {
    private static final K1 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private InterfaceC1495s4 zzi = AbstractC1440l4.p();
    private InterfaceC1495s4 zzj = AbstractC1440l4.p();
    private InterfaceC1495s4 zzk = AbstractC1440l4.p();
    private String zzl = "";
    private InterfaceC1495s4 zzn = AbstractC1440l4.p();
    private InterfaceC1495s4 zzo = AbstractC1440l4.p();
    private String zzp = "";

    static {
        K1 k12 = new K1();
        zza = k12;
        AbstractC1440l4.t(K1.class, k12);
    }

    private K1() {
    }

    public static J1 E() {
        return (J1) zza.u();
    }

    public static K1 G() {
        return zza;
    }

    public static /* synthetic */ void N(K1 k12, int i4, I1 i12) {
        i12.getClass();
        InterfaceC1495s4 interfaceC1495s4 = k12.zzj;
        if (!interfaceC1495s4.zzc()) {
            k12.zzj = AbstractC1440l4.q(interfaceC1495s4);
        }
        k12.zzj.set(i4, i12);
    }

    public final int A() {
        return this.zzn.size();
    }

    public final int B() {
        return this.zzj.size();
    }

    public final long C() {
        return this.zzf;
    }

    public final I1 D(int i4) {
        return (I1) this.zzj.get(i4);
    }

    public final String H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzp;
    }

    public final List J() {
        return this.zzk;
    }

    public final List K() {
        return this.zzo;
    }

    public final List L() {
        return this.zzn;
    }

    public final List M() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzm;
    }

    public final boolean Q() {
        return (this.zze & 2) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1440l4
    public final Object y(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new J1(null);
                }
                return new K1();
            }
            return AbstractC1440l4.s(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", O1.class, "zzj", I1.class, "zzk", C1445m1.class, "zzl", "zzm", "zzn", C1549z2.class, "zzo", G1.class, "zzp"});
        }
        return (byte) 1;
    }
}

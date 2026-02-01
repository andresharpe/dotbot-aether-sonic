package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.C0755c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.B;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbgv<T> implements zzbhf<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzbij.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzbgs zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzbgg zzn;
    private final zzbhz zzo;
    private final zzbeq zzp;
    private final zzbgy zzq;
    private final zzbgn zzr;

    private zzbgv(int[] iArr, Object[] objArr, int i4, int i5, zzbgs zzbgsVar, boolean z3, boolean z4, int[] iArr2, int i6, int i7, zzbgy zzbgyVar, zzbgg zzbggVar, zzbhz zzbhzVar, zzbeq zzbeqVar, zzbgn zzbgnVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzi = zzbgsVar instanceof zzbff;
        this.zzj = z3;
        boolean z5 = false;
        if (zzbeqVar != null && zzbeqVar.zzi(zzbgsVar)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzk = iArr2;
        this.zzl = i6;
        this.zzm = i7;
        this.zzq = zzbgyVar;
        this.zzn = zzbggVar;
        this.zzo = zzbhzVar;
        this.zzp = zzbeqVar;
        this.zzg = zzbgsVar;
        this.zzr = zzbgnVar;
    }

    private final int zzA(int i4, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.zzc[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i4) {
        return (i4 >>> 20) & 255;
    }

    private final int zzC(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzD(Object obj, long j4) {
        return ((Long) zzbij.zzf(obj, j4)).longValue();
    }

    private final zzbfj zzE(int i4) {
        int i5 = i4 / 3;
        return (zzbfj) this.zzd[i5 + i5 + 1];
    }

    private final zzbhf zzF(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzbhf zzbhfVar = (zzbhf) this.zzd[i6];
        if (zzbhfVar != null) {
            return zzbhfVar;
        }
        zzbhf zzb2 = zzbhb.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i4, Object obj2, zzbhz zzbhzVar) {
        int i5 = this.zzc[i4];
        Object zzf = zzbij.zzf(obj, zzC(i4) & 1048575);
        if (zzf == null) {
            return obj2;
        }
        if (zzE(i4) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzH(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i4) {
        long zzC = zzC(i4) & 1048575;
        if (!zzQ(obj2, i4)) {
            return;
        }
        Object zzf = zzbij.zzf(obj, zzC);
        Object zzf2 = zzbij.zzf(obj2, zzC);
        if (zzf != null && zzf2 != null) {
            zzbij.zzs(obj, zzC, zzbfq.zzg(zzf, zzf2));
            zzM(obj, i4);
        } else if (zzf2 != null) {
            zzbij.zzs(obj, zzC, zzf2);
            zzM(obj, i4);
        }
    }

    private final void zzK(Object obj, Object obj2, int i4) {
        Object obj3;
        int zzC = zzC(i4);
        int i5 = this.zzc[i4];
        long j4 = zzC & 1048575;
        if (!zzT(obj2, i5, i4)) {
            return;
        }
        if (zzT(obj, i5, i4)) {
            obj3 = zzbij.zzf(obj, j4);
        } else {
            obj3 = null;
        }
        Object zzf = zzbij.zzf(obj2, j4);
        if (obj3 != null && zzf != null) {
            zzbij.zzs(obj, j4, zzbfq.zzg(obj3, zzf));
            zzN(obj, i5, i4);
        } else if (zzf != null) {
            zzbij.zzs(obj, j4, zzf);
            zzN(obj, i5, i4);
        }
    }

    private final void zzL(Object obj, int i4, zzbhe zzbheVar) throws IOException {
        if (zzP(i4)) {
            zzbij.zzs(obj, i4 & 1048575, zzbheVar.zzx());
        } else if (this.zzi) {
            zzbij.zzs(obj, i4 & 1048575, zzbheVar.zzv());
        } else {
            zzbij.zzs(obj, i4 & 1048575, zzbheVar.zzq());
        }
    }

    private final void zzM(Object obj, int i4) {
        int zzz = zzz(i4);
        long j4 = 1048575 & zzz;
        if (j4 == 1048575) {
            return;
        }
        zzbij.zzq(obj, j4, (1 << (zzz >>> 20)) | zzbij.zzc(obj, j4));
    }

    private final void zzN(Object obj, int i4, int i5) {
        zzbij.zzq(obj, zzz(i5) & 1048575, i4);
    }

    private final boolean zzO(Object obj, Object obj2, int i4) {
        if (zzQ(obj, i4) == zzQ(obj2, i4)) {
            return true;
        }
        return false;
    }

    private static boolean zzP(int i4) {
        return (i4 & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i4) {
        int zzz = zzz(i4);
        long j4 = zzz & 1048575;
        if (j4 == 1048575) {
            int zzC = zzC(i4);
            long j5 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzbij.zza(obj, j5)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzbij.zzb(obj, j5)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzbij.zzd(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzbij.zzd(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzbij.zzd(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzbij.zzw(obj, j5);
                case 8:
                    Object zzf = zzbij.zzf(obj, j5);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzbbw) {
                        if (zzbbw.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzbij.zzf(obj, j5) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzbbw.zzb.equals(zzbij.zzf(obj, j5))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzbij.zzd(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzbij.zzc(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzbij.zzd(obj, j5) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzbij.zzf(obj, j5) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzbij.zzc(obj, j4) & (1 << (zzz >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzR(Object obj, int i4, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return zzQ(obj, i4);
        }
        if ((i6 & i7) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, int i4, zzbhf zzbhfVar) {
        return zzbhfVar.zzk(zzbij.zzf(obj, i4 & 1048575));
    }

    private final boolean zzT(Object obj, int i4, int i5) {
        if (zzbij.zzc(obj, zzz(i5) & 1048575) == i4) {
            return true;
        }
        return false;
    }

    private static boolean zzU(Object obj, long j4) {
        return ((Boolean) zzbij.zzf(obj, j4)).booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x007c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:216:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzV(java.lang.Object r17, com.google.android.gms.internal.gtm.zzbck r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgv.zzV(java.lang.Object, com.google.android.gms.internal.gtm.zzbck):void");
    }

    private final void zzW(zzbck zzbckVar, int i4, Object obj, int i5) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i4, Object obj, zzbck zzbckVar) throws IOException {
        if (obj instanceof String) {
            zzbckVar.zzG(i4, (String) obj);
        } else {
            zzbckVar.zzd(i4, (zzbbw) obj);
        }
    }

    static zzbia zzd(Object obj) {
        zzbff zzbffVar = (zzbff) obj;
        zzbia zzbiaVar = zzbffVar.zzd;
        if (zzbiaVar == zzbia.zzc()) {
            zzbia zze = zzbia.zze();
            zzbffVar.zzd = zze;
            return zze;
        }
        return zzbiaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbgv zzl(Class cls, zzbgp zzbgpVar, zzbgy zzbgyVar, zzbgg zzbggVar, zzbhz zzbhzVar, zzbeq zzbeqVar, zzbgn zzbgnVar) {
        if (zzbgpVar instanceof zzbhd) {
            return zzm((zzbhd) zzbgpVar, zzbgyVar, zzbggVar, zzbhzVar, zzbeqVar, zzbgnVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.gtm.zzbgv zzm(com.google.android.gms.internal.gtm.zzbhd r34, com.google.android.gms.internal.gtm.zzbgy r35, com.google.android.gms.internal.gtm.zzbgg r36, com.google.android.gms.internal.gtm.zzbhz r37, com.google.android.gms.internal.gtm.zzbeq r38, com.google.android.gms.internal.gtm.zzbgn r39) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgv.zzm(com.google.android.gms.internal.gtm.zzbhd, com.google.android.gms.internal.gtm.zzbgy, com.google.android.gms.internal.gtm.zzbgg, com.google.android.gms.internal.gtm.zzbhz, com.google.android.gms.internal.gtm.zzbeq, com.google.android.gms.internal.gtm.zzbgn):com.google.android.gms.internal.gtm.zzbgv");
    }

    private static double zzo(Object obj, long j4) {
        return ((Double) zzbij.zzf(obj, j4)).doubleValue();
    }

    private static float zzp(Object obj, long j4) {
        return ((Float) zzbij.zzf(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003a. Please report as an issue. */
    private final int zzq(Object obj) {
        int i4;
        int zzJ;
        int zzJ2;
        int zzJ3;
        int zzK;
        int zzJ4;
        int zzC;
        int zzJ5;
        int zzJ6;
        int zzd;
        int zzJ7;
        int i5;
        int zzu;
        boolean z3;
        int zzd2;
        int zzi;
        int zzI;
        int zzJ8;
        int i6;
        int zzJ9;
        int zzJ10;
        int zzJ11;
        int zzK2;
        int zzJ12;
        int zzd3;
        int zzJ13;
        int i7;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < this.zzc.length) {
            int zzC2 = zzC(i10);
            int[] iArr = this.zzc;
            int i13 = iArr[i10];
            int zzB = zzB(zzC2);
            if (zzB <= 17) {
                int i14 = iArr[i10 + 2];
                int i15 = i14 & i8;
                i4 = 1 << (i14 >>> 20);
                if (i15 != i9) {
                    i12 = unsafe.getInt(obj, i15);
                    i9 = i15;
                }
            } else {
                i4 = 0;
            }
            long j4 = zzC2 & i8;
            switch (zzB) {
                case 0:
                    if ((i12 & i4) != 0) {
                        zzJ = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ + 8;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i4) != 0) {
                        zzJ2 = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ2 + 4;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i4) != 0) {
                        long j5 = unsafe.getLong(obj, j4);
                        zzJ3 = zzbcj.zzJ(i13 << 3);
                        zzK = zzbcj.zzK(j5);
                        i11 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i4) != 0) {
                        long j6 = unsafe.getLong(obj, j4);
                        zzJ3 = zzbcj.zzJ(i13 << 3);
                        zzK = zzbcj.zzK(j6);
                        i11 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i4) != 0) {
                        int i16 = unsafe.getInt(obj, j4);
                        zzJ4 = zzbcj.zzJ(i13 << 3);
                        zzC = zzbcj.zzC(i16);
                        i5 = zzJ4 + zzC;
                        i11 += i5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i4) != 0) {
                        zzJ = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ + 8;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i4) != 0) {
                        zzJ2 = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ2 + 4;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i4) != 0) {
                        zzJ5 = zzbcj.zzJ(i13 << 3) + 1;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i4) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof zzbbw) {
                            zzJ6 = zzbcj.zzJ(i13 << 3);
                            zzd = ((zzbbw) object).zzd();
                            zzJ7 = zzbcj.zzJ(zzd);
                            i5 = zzJ6 + zzJ7 + zzd;
                            i11 += i5;
                            break;
                        } else {
                            zzJ4 = zzbcj.zzJ(i13 << 3);
                            zzC = zzbcj.zzH((String) object);
                            i5 = zzJ4 + zzC;
                            i11 += i5;
                        }
                    }
                case 9:
                    if ((i12 & i4) != 0) {
                        zzJ5 = zzbhh.zzo(i13, unsafe.getObject(obj, j4), zzF(i10));
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i12 & i4) != 0) {
                        zzbbw zzbbwVar = (zzbbw) unsafe.getObject(obj, j4);
                        zzJ6 = zzbcj.zzJ(i13 << 3);
                        zzd = zzbbwVar.zzd();
                        zzJ7 = zzbcj.zzJ(zzd);
                        i5 = zzJ6 + zzJ7 + zzd;
                        i11 += i5;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i4) != 0) {
                        int i17 = unsafe.getInt(obj, j4);
                        zzJ4 = zzbcj.zzJ(i13 << 3);
                        zzC = zzbcj.zzJ(i17);
                        i5 = zzJ4 + zzC;
                        i11 += i5;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i4) != 0) {
                        int i18 = unsafe.getInt(obj, j4);
                        zzJ4 = zzbcj.zzJ(i13 << 3);
                        zzC = zzbcj.zzC(i18);
                        i5 = zzJ4 + zzC;
                        i11 += i5;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i4) != 0) {
                        zzJ2 = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ2 + 4;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i12 & i4) != 0) {
                        zzJ = zzbcj.zzJ(i13 << 3);
                        zzJ5 = zzJ + 8;
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i12 & i4) != 0) {
                        int i19 = unsafe.getInt(obj, j4);
                        zzJ4 = zzbcj.zzJ(i13 << 3);
                        zzC = zzbcj.zzJ((i19 >> 31) ^ (i19 + i19));
                        i5 = zzJ4 + zzC;
                        i11 += i5;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i4 & i12) != 0) {
                        long j7 = unsafe.getLong(obj, j4);
                        i11 += zzbcj.zzJ(i13 << 3) + zzbcj.zzK((j7 >> 63) ^ (j7 + j7));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i4) != 0) {
                        zzJ5 = zzbcj.zzA(i13, (zzbgs) unsafe.getObject(obj, j4), zzF(i10));
                        i11 += zzJ5;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzJ5 = zzbhh.zzh(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 19:
                    zzJ5 = zzbhh.zzf(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 20:
                    zzJ5 = zzbhh.zzm(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 21:
                    zzJ5 = zzbhh.zzx(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 22:
                    zzJ5 = zzbhh.zzk(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 23:
                    zzJ5 = zzbhh.zzh(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 24:
                    zzJ5 = zzbhh.zzf(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 25:
                    zzJ5 = zzbhh.zza(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzJ5;
                    break;
                case 26:
                    zzu = zzbhh.zzu(i13, (List) unsafe.getObject(obj, j4));
                    i11 += zzu;
                    break;
                case 27:
                    zzu = zzbhh.zzp(i13, (List) unsafe.getObject(obj, j4), zzF(i10));
                    i11 += zzu;
                    break;
                case 28:
                    zzu = zzbhh.zzc(i13, (List) unsafe.getObject(obj, j4));
                    i11 += zzu;
                    break;
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    zzu = zzbhh.zzv(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzu;
                    break;
                case 30:
                    z3 = false;
                    zzd2 = zzbhh.zzd(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzd2;
                    break;
                case ConstraintLayout.b.a.f9573F /* 31 */:
                    z3 = false;
                    zzd2 = zzbhh.zzf(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzd2;
                    break;
                case 32:
                    z3 = false;
                    zzd2 = zzbhh.zzh(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzd2;
                    break;
                case 33:
                    z3 = false;
                    zzd2 = zzbhh.zzq(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzd2;
                    break;
                case 34:
                    z3 = false;
                    zzd2 = zzbhh.zzs(i13, (List) unsafe.getObject(obj, j4), false);
                    i11 += zzd2;
                    break;
                case 35:
                    zzi = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 36:
                    zzi = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 37:
                    zzi = zzbhh.zzn((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 38:
                    zzi = zzbhh.zzy((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 39:
                    zzi = zzbhh.zzl((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 40:
                    zzi = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 41:
                    zzi = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 42:
                    zzi = zzbhh.zzb((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 43:
                    zzi = zzbhh.zzw((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 44:
                    zzi = zzbhh.zze((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 45:
                    zzi = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 46:
                    zzi = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 47:
                    zzi = zzbhh.zzr((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 48:
                    zzi = zzbhh.zzt((List) unsafe.getObject(obj, j4));
                    if (zzi > 0) {
                        zzI = zzbcj.zzI(i13);
                        zzJ8 = zzbcj.zzJ(zzi);
                        i6 = zzI + zzJ8;
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 49:
                    zzu = zzbhh.zzj(i13, (List) unsafe.getObject(obj, j4), zzF(i10));
                    i11 += zzu;
                    break;
                case 50:
                    zzbgn.zza(i13, unsafe.getObject(obj, j4), zzH(i10));
                    break;
                case 51:
                    if (zzT(obj, i13, i10)) {
                        zzJ9 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ9 + 8;
                        i11 += zzu;
                    }
                    break;
                case 52:
                    if (zzT(obj, i13, i10)) {
                        zzJ10 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ10 + 4;
                        i11 += zzu;
                    }
                    break;
                case 53:
                    if (zzT(obj, i13, i10)) {
                        long zzD = zzD(obj, j4);
                        zzJ11 = zzbcj.zzJ(i13 << 3);
                        zzK2 = zzbcj.zzK(zzD);
                        i11 += zzJ11 + zzK2;
                    }
                    break;
                case 54:
                    if (zzT(obj, i13, i10)) {
                        long zzD2 = zzD(obj, j4);
                        zzJ11 = zzbcj.zzJ(i13 << 3);
                        zzK2 = zzbcj.zzK(zzD2);
                        i11 += zzJ11 + zzK2;
                    }
                    break;
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (zzT(obj, i13, i10)) {
                        int zzs = zzs(obj, j4);
                        i6 = zzbcj.zzJ(i13 << 3);
                        zzi = zzbcj.zzC(zzs);
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 56:
                    if (zzT(obj, i13, i10)) {
                        zzJ9 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ9 + 8;
                        i11 += zzu;
                    }
                    break;
                case 57:
                    if (zzT(obj, i13, i10)) {
                        zzJ10 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ10 + 4;
                        i11 += zzu;
                    }
                    break;
                case 58:
                    if (zzT(obj, i13, i10)) {
                        zzu = zzbcj.zzJ(i13 << 3) + 1;
                        i11 += zzu;
                    }
                    break;
                case 59:
                    if (zzT(obj, i13, i10)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof zzbbw) {
                            zzJ12 = zzbcj.zzJ(i13 << 3);
                            zzd3 = ((zzbbw) object2).zzd();
                            zzJ13 = zzbcj.zzJ(zzd3);
                            i7 = zzJ12 + zzJ13 + zzd3;
                            i11 += i7;
                        } else {
                            i6 = zzbcj.zzJ(i13 << 3);
                            zzi = zzbcj.zzH((String) object2);
                            i7 = i6 + zzi;
                            i11 += i7;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i13, i10)) {
                        zzu = zzbhh.zzo(i13, unsafe.getObject(obj, j4), zzF(i10));
                        i11 += zzu;
                    }
                    break;
                case B.f54416q /* 61 */:
                    if (zzT(obj, i13, i10)) {
                        zzbbw zzbbwVar2 = (zzbbw) unsafe.getObject(obj, j4);
                        zzJ12 = zzbcj.zzJ(i13 << 3);
                        zzd3 = zzbbwVar2.zzd();
                        zzJ13 = zzbcj.zzJ(zzd3);
                        i7 = zzJ12 + zzJ13 + zzd3;
                        i11 += i7;
                    }
                    break;
                case 62:
                    if (zzT(obj, i13, i10)) {
                        int zzs2 = zzs(obj, j4);
                        i6 = zzbcj.zzJ(i13 << 3);
                        zzi = zzbcj.zzJ(zzs2);
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case C0755c.f12913k /* 63 */:
                    if (zzT(obj, i13, i10)) {
                        int zzs3 = zzs(obj, j4);
                        i6 = zzbcj.zzJ(i13 << 3);
                        zzi = zzbcj.zzC(zzs3);
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case 64:
                    if (zzT(obj, i13, i10)) {
                        zzJ10 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ10 + 4;
                        i11 += zzu;
                    }
                    break;
                case 65:
                    if (zzT(obj, i13, i10)) {
                        zzJ9 = zzbcj.zzJ(i13 << 3);
                        zzu = zzJ9 + 8;
                        i11 += zzu;
                    }
                    break;
                case 66:
                    if (zzT(obj, i13, i10)) {
                        int zzs4 = zzs(obj, j4);
                        i6 = zzbcj.zzJ(i13 << 3);
                        zzi = zzbcj.zzJ((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i7 = i6 + zzi;
                        i11 += i7;
                    }
                    break;
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (zzT(obj, i13, i10)) {
                        long zzD3 = zzD(obj, j4);
                        i11 += zzbcj.zzJ(i13 << 3) + zzbcj.zzK((zzD3 >> 63) ^ (zzD3 + zzD3));
                    }
                    break;
                case 68:
                    if (zzT(obj, i13, i10)) {
                        zzu = zzbcj.zzA(i13, (zzbgs) unsafe.getObject(obj, j4), zzF(i10));
                        i11 += zzu;
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        int i20 = 0;
        zzbhz zzbhzVar = this.zzo;
        int zza2 = i11 + zzbhzVar.zza(zzbhzVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        zzbeu zzb2 = this.zzp.zzb(obj);
        for (int i21 = 0; i21 < zzb2.zza.zzb(); i21++) {
            Map.Entry zzg = zzb2.zza.zzg(i21);
            i20 += zzbeu.zzb((zzbet) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : zzb2.zza.zzc()) {
            i20 += zzbeu.zzb((zzbet) entry.getKey(), entry.getValue());
        }
        return zza2 + i20;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    private final int zzr(Object obj) {
        int zzJ;
        int zzJ2;
        int zzJ3;
        int zzK;
        int zzJ4;
        int zzC;
        int zzJ5;
        int zzJ6;
        int zzd;
        int zzJ7;
        int zzo;
        int zzI;
        int zzJ8;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzC2 = zzC(i6);
            int zzB = zzB(zzC2);
            int i7 = this.zzc[i6];
            long j4 = zzC2 & 1048575;
            if (zzB >= zzbev.zzJ.zza() && zzB <= zzbev.zzW.zza()) {
                int i8 = this.zzc[i6 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i6)) {
                        long zzd2 = zzbij.zzd(obj, j4);
                        zzJ3 = zzbcj.zzJ(i7 << 3);
                        zzK = zzbcj.zzK(zzd2);
                        i5 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i6)) {
                        long zzd3 = zzbij.zzd(obj, j4);
                        zzJ3 = zzbcj.zzJ(i7 << 3);
                        zzK = zzbcj.zzK(zzd3);
                        i5 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i6)) {
                        int zzc = zzbij.zzc(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzC(zzc);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i6)) {
                        zzJ5 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ5 + 1;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzQ(obj, i6)) {
                        break;
                    } else {
                        Object zzf = zzbij.zzf(obj, j4);
                        if (zzf instanceof zzbbw) {
                            zzJ6 = zzbcj.zzJ(i7 << 3);
                            zzd = ((zzbbw) zzf).zzd();
                            zzJ7 = zzbcj.zzJ(zzd);
                            i4 = zzJ6 + zzJ7 + zzd;
                            i5 += i4;
                            break;
                        } else {
                            zzJ4 = zzbcj.zzJ(i7 << 3);
                            zzC = zzbcj.zzH((String) zzf);
                            i4 = zzJ4 + zzC;
                            i5 += i4;
                        }
                    }
                case 9:
                    if (zzQ(obj, i6)) {
                        zzo = zzbhh.zzo(i7, zzbij.zzf(obj, j4), zzF(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i6)) {
                        zzbbw zzbbwVar = (zzbbw) zzbij.zzf(obj, j4);
                        zzJ6 = zzbcj.zzJ(i7 << 3);
                        zzd = zzbbwVar.zzd();
                        zzJ7 = zzbcj.zzJ(zzd);
                        i4 = zzJ6 + zzJ7 + zzd;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i6)) {
                        int zzc2 = zzbij.zzc(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzJ(zzc2);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i6)) {
                        int zzc3 = zzbij.zzc(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzC(zzc3);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i6)) {
                        int zzc4 = zzbij.zzc(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzJ((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i6)) {
                        long zzd4 = zzbij.zzd(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzK((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i6)) {
                        zzo = zzbcj.zzA(i7, (zzbgs) zzbij.zzf(obj, j4), zzF(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzbhh.zzh(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzbhh.zzf(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzbhh.zzm(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 21:
                    zzo = zzbhh.zzx(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzbhh.zzk(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 23:
                    zzo = zzbhh.zzh(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzbhh.zzf(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzbhh.zza(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzbhh.zzu(i7, (List) zzbij.zzf(obj, j4));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzbhh.zzp(i7, (List) zzbij.zzf(obj, j4), zzF(i6));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzbhh.zzc(i7, (List) zzbij.zzf(obj, j4));
                    i5 += zzo;
                    break;
                case ConstraintLayout.b.a.f9571D /* 29 */:
                    zzo = zzbhh.zzv(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzbhh.zzd(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case ConstraintLayout.b.a.f9573F /* 31 */:
                    zzo = zzbhh.zzf(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzbhh.zzh(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 33:
                    zzo = zzbhh.zzq(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzbhh.zzs(i7, (List) zzbij.zzf(obj, j4), false);
                    i5 += zzo;
                    break;
                case 35:
                    zzC = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzC = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzC = zzbhh.zzn((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzC = zzbhh.zzy((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzC = zzbhh.zzl((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzC = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzC = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzC = zzbhh.zzb((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzC = zzbhh.zzw((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzC = zzbhh.zze((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzC = zzbhh.zzg((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzC = zzbhh.zzi((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzC = zzbhh.zzr((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzC = zzbhh.zzt((List) unsafe.getObject(obj, j4));
                    if (zzC > 0) {
                        zzI = zzbcj.zzI(i7);
                        zzJ8 = zzbcj.zzJ(zzC);
                        zzJ4 = zzI + zzJ8;
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzbhh.zzj(i7, (List) zzbij.zzf(obj, j4), zzF(i6));
                    i5 += zzo;
                    break;
                case 50:
                    zzbgn.zza(i7, zzbij.zzf(obj, j4), zzH(i6));
                    break;
                case 51:
                    if (zzT(obj, i7, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i7, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i7, i6)) {
                        long zzD = zzD(obj, j4);
                        zzJ3 = zzbcj.zzJ(i7 << 3);
                        zzK = zzbcj.zzK(zzD);
                        i5 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i7, i6)) {
                        long zzD2 = zzD(obj, j4);
                        zzJ3 = zzbcj.zzJ(i7 << 3);
                        zzK = zzbcj.zzK(zzD2);
                        i5 += zzJ3 + zzK;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (zzT(obj, i7, i6)) {
                        int zzs = zzs(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzC(zzs);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i7, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i7, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i7, i6)) {
                        zzJ5 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ5 + 1;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzT(obj, i7, i6)) {
                        break;
                    } else {
                        Object zzf2 = zzbij.zzf(obj, j4);
                        if (zzf2 instanceof zzbbw) {
                            zzJ6 = zzbcj.zzJ(i7 << 3);
                            zzd = ((zzbbw) zzf2).zzd();
                            zzJ7 = zzbcj.zzJ(zzd);
                            i4 = zzJ6 + zzJ7 + zzd;
                            i5 += i4;
                            break;
                        } else {
                            zzJ4 = zzbcj.zzJ(i7 << 3);
                            zzC = zzbcj.zzH((String) zzf2);
                            i4 = zzJ4 + zzC;
                            i5 += i4;
                        }
                    }
                case 60:
                    if (zzT(obj, i7, i6)) {
                        zzo = zzbhh.zzo(i7, zzbij.zzf(obj, j4), zzF(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case B.f54416q /* 61 */:
                    if (zzT(obj, i7, i6)) {
                        zzbbw zzbbwVar2 = (zzbbw) zzbij.zzf(obj, j4);
                        zzJ6 = zzbcj.zzJ(i7 << 3);
                        zzd = zzbbwVar2.zzd();
                        zzJ7 = zzbcj.zzJ(zzd);
                        i4 = zzJ6 + zzJ7 + zzd;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i7, i6)) {
                        int zzs2 = zzs(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzJ(zzs2);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case C0755c.f12913k /* 63 */:
                    if (zzT(obj, i7, i6)) {
                        int zzs3 = zzs(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzC(zzs3);
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i7, i6)) {
                        zzJ2 = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ2 + 4;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i7, i6)) {
                        zzJ = zzbcj.zzJ(i7 << 3);
                        zzo = zzJ + 8;
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i7, i6)) {
                        int zzs4 = zzs(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzJ((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (zzT(obj, i7, i6)) {
                        long zzD3 = zzD(obj, j4);
                        zzJ4 = zzbcj.zzJ(i7 << 3);
                        zzC = zzbcj.zzK((zzD3 >> 63) ^ (zzD3 + zzD3));
                        i4 = zzJ4 + zzC;
                        i5 += i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i7, i6)) {
                        zzo = zzbcj.zzA(i7, (zzbgs) zzbij.zzf(obj, j4), zzF(i6));
                        i5 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzbhz zzbhzVar = this.zzo;
        return i5 + zzbhzVar.zza(zzbhzVar.zzd(obj));
    }

    private static int zzs(Object obj, long j4) {
        return ((Integer) zzbij.zzf(obj, j4)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i4, int i5, int i6, long j4, zzbbf zzbbfVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i6);
        Object object = unsafe.getObject(obj, j4);
        if (zzbgn.zzb(object)) {
            zzbgm zzb2 = zzbgm.zza().zzb();
            zzbgn.zzc(zzb2, object);
            unsafe.putObject(obj, j4, zzb2);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, int i11, zzbbf zzbbfVar) throws IOException {
        Unsafe unsafe = zzb;
        long j5 = this.zzc[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 == 1) {
                    unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzbbg.zzo(bArr, i4))));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 8;
                }
                return i4;
            case 52:
                if (i8 == 5) {
                    unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzbbg.zzb(bArr, i4))));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 4;
                }
                return i4;
            case 53:
            case 54:
                if (i8 == 0) {
                    int zzm = zzbbg.zzm(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, Long.valueOf(zzbbfVar.zzb));
                    unsafe.putInt(obj, j5, i7);
                    return zzm;
                }
                return i4;
            case ConstraintLayout.b.a.f9601d0 /* 55 */:
            case 62:
                if (i8 == 0) {
                    int zzj = zzbbg.zzj(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, Integer.valueOf(zzbbfVar.zza));
                    unsafe.putInt(obj, j5, i7);
                    return zzj;
                }
                return i4;
            case 56:
            case 65:
                if (i8 == 1) {
                    unsafe.putObject(obj, j4, Long.valueOf(zzbbg.zzo(bArr, i4)));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 8;
                }
                return i4;
            case 57:
            case 64:
                if (i8 == 5) {
                    unsafe.putObject(obj, j4, Integer.valueOf(zzbbg.zzb(bArr, i4)));
                    unsafe.putInt(obj, j5, i7);
                    return i4 + 4;
                }
                return i4;
            case 58:
                if (i8 == 0) {
                    int zzm2 = zzbbg.zzm(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, Boolean.valueOf(zzbbfVar.zzb != 0));
                    unsafe.putInt(obj, j5, i7);
                    return zzm2;
                }
                return i4;
            case 59:
                if (i8 == 2) {
                    int zzj2 = zzbbg.zzj(bArr, i4, zzbbfVar);
                    int i12 = zzbbfVar.zza;
                    if (i12 == 0) {
                        unsafe.putObject(obj, j4, "");
                    } else {
                        if ((i9 & 536870912) != 0 && !zzbio.zzf(bArr, zzj2, zzj2 + i12)) {
                            throw zzbfs.zzd();
                        }
                        unsafe.putObject(obj, j4, new String(bArr, zzj2, i12, zzbfq.zzb));
                        zzj2 += i12;
                    }
                    unsafe.putInt(obj, j5, i7);
                    return zzj2;
                }
                return i4;
            case 60:
                if (i8 == 2) {
                    int zzd = zzbbg.zzd(zzF(i11), bArr, i4, i5, zzbbfVar);
                    Object object = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zzbbfVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzbfq.zzg(object, zzbbfVar.zzc));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return zzd;
                }
                return i4;
            case B.f54416q /* 61 */:
                if (i8 == 2) {
                    int zza2 = zzbbg.zza(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, zzbbfVar.zzc);
                    unsafe.putInt(obj, j5, i7);
                    return zza2;
                }
                return i4;
            case C0755c.f12913k /* 63 */:
                if (i8 == 0) {
                    int zzj3 = zzbbg.zzj(bArr, i4, zzbbfVar);
                    int i13 = zzbbfVar.zza;
                    zzbfj zzE = zzE(i11);
                    if (zzE != null && !zzE.zza(i13)) {
                        zzd(obj).zzh(i6, Long.valueOf(i13));
                    } else {
                        unsafe.putObject(obj, j4, Integer.valueOf(i13));
                        unsafe.putInt(obj, j5, i7);
                    }
                    return zzj3;
                }
                return i4;
            case 66:
                if (i8 == 0) {
                    int zzj4 = zzbbg.zzj(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, Integer.valueOf(zzbcc.zzs(zzbbfVar.zza)));
                    unsafe.putInt(obj, j5, i7);
                    return zzj4;
                }
                return i4;
            case ConstraintLayout.b.a.f9609h0 /* 67 */:
                if (i8 == 0) {
                    int zzm3 = zzbbg.zzm(bArr, i4, zzbbfVar);
                    unsafe.putObject(obj, j4, Long.valueOf(zzbcc.zzt(zzbbfVar.zzb)));
                    unsafe.putInt(obj, j5, i7);
                    return zzm3;
                }
                return i4;
            case 68:
                if (i8 == 3) {
                    int zzc = zzbbg.zzc(zzF(i11), bArr, i4, i5, (i6 & (-8)) | 4, zzbbfVar);
                    Object object2 = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j4, zzbbfVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzbfq.zzg(object2, zzbbfVar.zzc));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return zzc;
                }
                return i4;
            default:
                return i4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0081. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    private final int zzv(Object obj, byte[] bArr, int i4, int i5, zzbbf zzbbfVar) throws IOException {
        byte b4;
        int i6;
        int zzx;
        int i7;
        int i8;
        int i9;
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int zzm;
        int zzd;
        int i14;
        int i15;
        int i16;
        zzbgv<T> zzbgvVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i5;
        zzbbf zzbbfVar2 = zzbbfVar;
        Unsafe unsafe2 = zzb;
        int i18 = 1048575;
        int i19 = -1;
        int i20 = i4;
        int i21 = -1;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        while (i20 < i17) {
            int i25 = i20 + 1;
            byte b5 = bArr2[i20];
            if (b5 < 0) {
                i6 = zzbbg.zzk(b5, bArr2, i25, zzbbfVar2);
                b4 = zzbbfVar2.zza;
            } else {
                b4 = b5;
                i6 = i25;
            }
            int i26 = b4 >>> 3;
            int i27 = b4 & 7;
            if (i26 > i21) {
                zzx = zzbgvVar.zzy(i26, i23 / 3);
            } else {
                zzx = zzbgvVar.zzx(i26);
            }
            int i28 = zzx;
            if (i28 == i19) {
                i7 = i6;
                i8 = i26;
                i9 = i19;
                unsafe = unsafe2;
                i10 = 0;
            } else {
                int[] iArr = zzbgvVar.zzc;
                int i29 = iArr[i28 + 1];
                int zzB = zzB(i29);
                long j4 = i29 & i18;
                if (zzB <= 17) {
                    int i30 = iArr[i28 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i22) {
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj2, i22, i24);
                        }
                        if (i32 != 1048575) {
                            i24 = unsafe2.getInt(obj2, i32);
                        }
                        i22 = i32;
                    }
                    switch (zzB) {
                        case 0:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 1) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzbij.zzo(obj2, j4, Double.longBitsToDouble(zzbbg.zzo(bArr2, i12)));
                                i20 = i12 + 8;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 1:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 5) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzbij.zzp(obj2, j4, Float.intBitsToFloat(zzbbg.zzb(bArr2, i12)));
                                i20 = i12 + 4;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzm = zzbbg.zzm(bArr2, i12, zzbbfVar2);
                                unsafe2.putLong(obj, j4, zzbbfVar2.zzb);
                                i24 |= i31;
                                i20 = zzm;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 4:
                        case 11:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i12 = i6;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i20 = zzbbg.zzj(bArr2, i12, zzbbfVar2);
                                unsafe2.putInt(obj2, j4, zzbbfVar2.zza);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 1) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i12 = i6;
                                unsafe2.putLong(obj, j4, zzbbg.zzo(bArr2, i6));
                                i20 = i12 + 8;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 5) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                unsafe2.putInt(obj2, j4, zzbbg.zzb(bArr2, i6));
                                i20 = i6 + 4;
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 7:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                i20 = zzbbg.zzm(bArr2, i6, zzbbfVar2);
                                zzbij.zzm(obj2, j4, zzbbfVar2.zzb != 0);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 8:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                if ((536870912 & i29) == 0) {
                                    i20 = zzbbg.zzg(bArr2, i6, zzbbfVar2);
                                } else {
                                    i20 = zzbbg.zzh(bArr2, i6, zzbbfVar2);
                                }
                                unsafe2.putObject(obj2, j4, zzbbfVar2.zzc);
                                i24 |= i31;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 9:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzd = zzbbg.zzd(zzbgvVar.zzF(i11), bArr2, i6, i17, zzbbfVar2);
                                Object object = unsafe2.getObject(obj2, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j4, zzbbfVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j4, zzbfq.zzg(object, zzbbfVar2.zzc));
                                }
                                i24 |= i31;
                                i20 = zzd;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 10:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 2) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzd = zzbbg.zza(bArr2, i6, zzbbfVar2);
                                unsafe2.putObject(obj2, j4, zzbbfVar2.zzc);
                                i24 |= i31;
                                i20 = zzd;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 12:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzd = zzbbg.zzj(bArr2, i6, zzbbfVar2);
                                unsafe2.putInt(obj2, j4, zzbbfVar2.zza);
                                i24 |= i31;
                                i20 = zzd;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 15:
                            zzbbfVar2 = zzbbfVar;
                            i11 = i28;
                            i13 = 1048575;
                            i8 = i26;
                            if (i27 != 0) {
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzd = zzbbg.zzj(bArr2, i6, zzbbfVar2);
                                unsafe2.putInt(obj2, j4, zzbcc.zzs(zzbbfVar2.zza));
                                i24 |= i31;
                                i20 = zzd;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                i8 = i26;
                                i11 = i28;
                                i12 = i6;
                                i7 = i12;
                                unsafe = unsafe2;
                                i10 = i11;
                                i9 = -1;
                                break;
                            } else {
                                zzbbfVar2 = zzbbfVar;
                                zzm = zzbbg.zzm(bArr2, i6, zzbbfVar2);
                                i11 = i28;
                                i8 = i26;
                                i13 = 1048575;
                                unsafe2.putLong(obj, j4, zzbcc.zzt(zzbbfVar2.zzb));
                                i24 |= i31;
                                i20 = zzm;
                                i23 = i11;
                                i21 = i8;
                                i18 = i13;
                                i19 = -1;
                                break;
                            }
                        default:
                            i8 = i26;
                            i11 = i28;
                            i12 = i6;
                            i7 = i12;
                            unsafe = unsafe2;
                            i10 = i11;
                            i9 = -1;
                            break;
                    }
                } else {
                    zzbbfVar2 = zzbbfVar;
                    i11 = i28;
                    int i33 = i6;
                    i13 = 1048575;
                    i8 = i26;
                    if (zzB == 27) {
                        if (i27 == 2) {
                            zzbfp zzbfpVar = (zzbfp) unsafe2.getObject(obj2, j4);
                            if (!zzbfpVar.zzc()) {
                                int size = zzbfpVar.size();
                                zzbfpVar = zzbfpVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j4, zzbfpVar);
                            }
                            i20 = zzbbg.zze(zzbgvVar.zzF(i11), b4, bArr, i33, i5, zzbfpVar, zzbbfVar);
                            i24 = i24;
                            i23 = i11;
                            i21 = i8;
                            i18 = i13;
                            i19 = -1;
                        } else {
                            i14 = i33;
                            i15 = i24;
                            i16 = i22;
                            unsafe = unsafe2;
                            i10 = i11;
                            i9 = -1;
                        }
                    } else if (zzB <= 49) {
                        i15 = i24;
                        i16 = i22;
                        i9 = -1;
                        unsafe = unsafe2;
                        i10 = i11;
                        i20 = zzw(obj, bArr, i33, i5, b4, i8, i27, i11, i29, zzB, j4, zzbbfVar);
                        if (i20 != i33) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i17 = i5;
                            zzbbfVar2 = zzbbfVar;
                            i22 = i16;
                            i19 = i9;
                            i21 = i8;
                            i24 = i15;
                            i23 = i10;
                            unsafe2 = unsafe;
                            i18 = 1048575;
                            zzbgvVar = this;
                        } else {
                            i7 = i20;
                            i22 = i16;
                            i24 = i15;
                        }
                    } else {
                        i14 = i33;
                        i15 = i24;
                        i16 = i22;
                        unsafe = unsafe2;
                        i10 = i11;
                        i9 = -1;
                        if (zzB != 50) {
                            i20 = zzu(obj, bArr, i14, i5, b4, i8, i27, i29, zzB, j4, i10, zzbbfVar);
                            if (i20 != i14) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i17 = i5;
                                zzbbfVar2 = zzbbfVar;
                                i22 = i16;
                                i19 = i9;
                                i21 = i8;
                                i24 = i15;
                                i23 = i10;
                                unsafe2 = unsafe;
                                i18 = 1048575;
                                zzbgvVar = this;
                            } else {
                                i7 = i20;
                                i22 = i16;
                                i24 = i15;
                            }
                        } else if (i27 == 2) {
                            i20 = zzt(obj, bArr, i14, i5, i10, j4, zzbbfVar);
                            if (i20 != i14) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i17 = i5;
                                zzbbfVar2 = zzbbfVar;
                                i22 = i16;
                                i19 = i9;
                                i21 = i8;
                                i24 = i15;
                                i23 = i10;
                                unsafe2 = unsafe;
                                i18 = 1048575;
                                zzbgvVar = this;
                            } else {
                                i7 = i20;
                                i22 = i16;
                                i24 = i15;
                            }
                        }
                    }
                    i7 = i14;
                    i22 = i16;
                    i24 = i15;
                }
            }
            i20 = zzbbg.zzi(b4, bArr, i7, i5, zzd(obj), zzbbfVar);
            zzbgvVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i17 = i5;
            zzbbfVar2 = zzbbfVar;
            i19 = i9;
            i21 = i8;
            i23 = i10;
            unsafe2 = unsafe;
            i18 = 1048575;
        }
        int i34 = i24;
        int i35 = i22;
        Unsafe unsafe3 = unsafe2;
        if (i35 != i18) {
            unsafe3.putInt(obj, i35, i34);
        }
        if (i20 == i5) {
            return i20;
        }
        throw zzbfs.zzg();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0037. Please report as an issue. */
    private final int zzw(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, long j4, int i10, long j5, zzbbf zzbbfVar) throws IOException {
        int i11;
        int i12;
        int i13;
        int i14;
        int zzj;
        int i15 = i4;
        Unsafe unsafe = zzb;
        zzbfp zzbfpVar = (zzbfp) unsafe.getObject(obj, j5);
        if (!zzbfpVar.zzc()) {
            int size = zzbfpVar.size();
            zzbfpVar = zzbfpVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, zzbfpVar);
        }
        switch (i10) {
            case 18:
            case 35:
                if (i8 == 2) {
                    zzbej zzbejVar = (zzbej) zzbfpVar;
                    int zzj2 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i16 = zzbbfVar.zza + zzj2;
                    while (zzj2 < i16) {
                        zzbejVar.zze(Double.longBitsToDouble(zzbbg.zzo(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i16) {
                        return zzj2;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 1) {
                    zzbej zzbejVar2 = (zzbej) zzbfpVar;
                    zzbejVar2.zze(Double.longBitsToDouble(zzbbg.zzo(bArr, i4)));
                    while (true) {
                        i11 = i15 + 8;
                        if (i11 < i5) {
                            i15 = zzbbg.zzj(bArr, i11, zzbbfVar);
                            if (i6 == zzbbfVar.zza) {
                                zzbejVar2.zze(Double.longBitsToDouble(zzbbg.zzo(bArr, i15)));
                            }
                        }
                    }
                    return i11;
                }
                return i15;
            case 19:
            case 36:
                if (i8 == 2) {
                    zzbew zzbewVar = (zzbew) zzbfpVar;
                    int zzj3 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i17 = zzbbfVar.zza + zzj3;
                    while (zzj3 < i17) {
                        zzbewVar.zzf(Float.intBitsToFloat(zzbbg.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i17) {
                        return zzj3;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 5) {
                    zzbew zzbewVar2 = (zzbew) zzbfpVar;
                    zzbewVar2.zzf(Float.intBitsToFloat(zzbbg.zzb(bArr, i4)));
                    while (true) {
                        i12 = i15 + 4;
                        if (i12 < i5) {
                            i15 = zzbbg.zzj(bArr, i12, zzbbfVar);
                            if (i6 == zzbbfVar.zza) {
                                zzbewVar2.zzf(Float.intBitsToFloat(zzbbg.zzb(bArr, i15)));
                            }
                        }
                    }
                    return i12;
                }
                return i15;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i8 == 2) {
                    zzbgh zzbghVar = (zzbgh) zzbfpVar;
                    int zzj4 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i18 = zzbbfVar.zza + zzj4;
                    while (zzj4 < i18) {
                        zzj4 = zzbbg.zzm(bArr, zzj4, zzbbfVar);
                        zzbghVar.zzg(zzbbfVar.zzb);
                    }
                    if (zzj4 == i18) {
                        return zzj4;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 0) {
                    zzbgh zzbghVar2 = (zzbgh) zzbfpVar;
                    int zzm = zzbbg.zzm(bArr, i15, zzbbfVar);
                    zzbghVar2.zzg(zzbbfVar.zzb);
                    while (zzm < i5) {
                        int zzj5 = zzbbg.zzj(bArr, zzm, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzm;
                        }
                        zzm = zzbbg.zzm(bArr, zzj5, zzbbfVar);
                        zzbghVar2.zzg(zzbbfVar.zzb);
                    }
                    return zzm;
                }
                return i15;
            case 22:
            case ConstraintLayout.b.a.f9571D /* 29 */:
            case 39:
            case 43:
                if (i8 == 2) {
                    return zzbbg.zzf(bArr, i15, zzbfpVar, zzbbfVar);
                }
                if (i8 == 0) {
                    return zzbbg.zzl(i6, bArr, i4, i5, zzbfpVar, zzbbfVar);
                }
                return i15;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    zzbgh zzbghVar3 = (zzbgh) zzbfpVar;
                    int zzj6 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i19 = zzbbfVar.zza + zzj6;
                    while (zzj6 < i19) {
                        zzbghVar3.zzg(zzbbg.zzo(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i19) {
                        return zzj6;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 1) {
                    zzbgh zzbghVar4 = (zzbgh) zzbfpVar;
                    zzbghVar4.zzg(zzbbg.zzo(bArr, i4));
                    while (true) {
                        i13 = i15 + 8;
                        if (i13 < i5) {
                            i15 = zzbbg.zzj(bArr, i13, zzbbfVar);
                            if (i6 == zzbbfVar.zza) {
                                zzbghVar4.zzg(zzbbg.zzo(bArr, i15));
                            }
                        }
                    }
                    return i13;
                }
                return i15;
            case 24:
            case ConstraintLayout.b.a.f9573F /* 31 */:
            case 41:
            case 45:
                if (i8 == 2) {
                    zzbfg zzbfgVar = (zzbfg) zzbfpVar;
                    int zzj7 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i20 = zzbbfVar.zza + zzj7;
                    while (zzj7 < i20) {
                        zzbfgVar.zzh(zzbbg.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i20) {
                        return zzj7;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 5) {
                    zzbfg zzbfgVar2 = (zzbfg) zzbfpVar;
                    zzbfgVar2.zzh(zzbbg.zzb(bArr, i4));
                    while (true) {
                        i14 = i15 + 4;
                        if (i14 < i5) {
                            i15 = zzbbg.zzj(bArr, i14, zzbbfVar);
                            if (i6 == zzbbfVar.zza) {
                                zzbfgVar2.zzh(zzbbg.zzb(bArr, i15));
                            }
                        }
                    }
                    return i14;
                }
                return i15;
            case 25:
            case 42:
                if (i8 == 2) {
                    zzbbl zzbblVar = (zzbbl) zzbfpVar;
                    zzj = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i21 = zzbbfVar.zza + zzj;
                    while (zzj < i21) {
                        zzj = zzbbg.zzm(bArr, zzj, zzbbfVar);
                        zzbblVar.zze(zzbbfVar.zzb != 0);
                    }
                    if (zzj != i21) {
                        throw zzbfs.zzj();
                    }
                    return zzj;
                }
                if (i8 == 0) {
                    zzbbl zzbblVar2 = (zzbbl) zzbfpVar;
                    int zzm2 = zzbbg.zzm(bArr, i15, zzbbfVar);
                    zzbblVar2.zze(zzbbfVar.zzb != 0);
                    while (zzm2 < i5) {
                        int zzj8 = zzbbg.zzj(bArr, zzm2, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzbbg.zzm(bArr, zzj8, zzbbfVar);
                        zzbblVar2.zze(zzbbfVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i15;
            case 26:
                if (i8 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int zzj9 = zzbbg.zzj(bArr, i15, zzbbfVar);
                        int i22 = zzbbfVar.zza;
                        if (i22 < 0) {
                            throw zzbfs.zzf();
                        }
                        if (i22 == 0) {
                            zzbfpVar.add("");
                        } else {
                            zzbfpVar.add(new String(bArr, zzj9, i22, zzbfq.zzb));
                            zzj9 += i22;
                        }
                        while (zzj9 < i5) {
                            int zzj10 = zzbbg.zzj(bArr, zzj9, zzbbfVar);
                            if (i6 != zzbbfVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzbbg.zzj(bArr, zzj10, zzbbfVar);
                            int i23 = zzbbfVar.zza;
                            if (i23 < 0) {
                                throw zzbfs.zzf();
                            }
                            if (i23 == 0) {
                                zzbfpVar.add("");
                            } else {
                                zzbfpVar.add(new String(bArr, zzj9, i23, zzbfq.zzb));
                                zzj9 += i23;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i24 = zzbbfVar.zza;
                    if (i24 < 0) {
                        throw zzbfs.zzf();
                    }
                    if (i24 == 0) {
                        zzbfpVar.add("");
                    } else {
                        int i25 = zzj11 + i24;
                        if (zzbio.zzf(bArr, zzj11, i25)) {
                            zzbfpVar.add(new String(bArr, zzj11, i24, zzbfq.zzb));
                            zzj11 = i25;
                        } else {
                            throw zzbfs.zzd();
                        }
                    }
                    while (zzj11 < i5) {
                        int zzj12 = zzbbg.zzj(bArr, zzj11, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzbbg.zzj(bArr, zzj12, zzbbfVar);
                        int i26 = zzbbfVar.zza;
                        if (i26 < 0) {
                            throw zzbfs.zzf();
                        }
                        if (i26 == 0) {
                            zzbfpVar.add("");
                        } else {
                            int i27 = zzj11 + i26;
                            if (zzbio.zzf(bArr, zzj11, i27)) {
                                zzbfpVar.add(new String(bArr, zzj11, i26, zzbfq.zzb));
                                zzj11 = i27;
                            } else {
                                throw zzbfs.zzd();
                            }
                        }
                    }
                    return zzj11;
                }
                return i15;
            case 27:
                if (i8 == 2) {
                    return zzbbg.zze(zzF(i9), i6, bArr, i4, i5, zzbfpVar, zzbbfVar);
                }
                return i15;
            case 28:
                if (i8 == 2) {
                    int zzj13 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i28 = zzbbfVar.zza;
                    if (i28 >= 0) {
                        if (i28 > bArr.length - zzj13) {
                            throw zzbfs.zzj();
                        }
                        if (i28 == 0) {
                            zzbfpVar.add(zzbbw.zzb);
                        } else {
                            zzbfpVar.add(zzbbw.zzn(bArr, zzj13, i28));
                            zzj13 += i28;
                        }
                        while (zzj13 < i5) {
                            int zzj14 = zzbbg.zzj(bArr, zzj13, zzbbfVar);
                            if (i6 != zzbbfVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzbbg.zzj(bArr, zzj14, zzbbfVar);
                            int i29 = zzbbfVar.zza;
                            if (i29 >= 0) {
                                if (i29 > bArr.length - zzj13) {
                                    throw zzbfs.zzj();
                                }
                                if (i29 == 0) {
                                    zzbfpVar.add(zzbbw.zzb);
                                } else {
                                    zzbfpVar.add(zzbbw.zzn(bArr, zzj13, i29));
                                    zzj13 += i29;
                                }
                            } else {
                                throw zzbfs.zzf();
                            }
                        }
                        return zzj13;
                    }
                    throw zzbfs.zzf();
                }
                return i15;
            case 30:
            case 44:
                if (i8 != 2) {
                    if (i8 == 0) {
                        zzj = zzbbg.zzl(i6, bArr, i4, i5, zzbfpVar, zzbbfVar);
                    }
                    return i15;
                }
                zzj = zzbbg.zzf(bArr, i15, zzbfpVar, zzbbfVar);
                zzbff zzbffVar = (zzbff) obj;
                zzbia zzbiaVar = zzbffVar.zzd;
                if (zzbiaVar == zzbia.zzc()) {
                    zzbiaVar = null;
                }
                Object zzC = zzbhh.zzC(i7, zzbfpVar, zzE(i9), zzbiaVar, this.zzo);
                if (zzC != null) {
                    zzbffVar.zzd = (zzbia) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i8 == 2) {
                    zzbfg zzbfgVar3 = (zzbfg) zzbfpVar;
                    int zzj15 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i30 = zzbbfVar.zza + zzj15;
                    while (zzj15 < i30) {
                        zzj15 = zzbbg.zzj(bArr, zzj15, zzbbfVar);
                        zzbfgVar3.zzh(zzbcc.zzs(zzbbfVar.zza));
                    }
                    if (zzj15 == i30) {
                        return zzj15;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 0) {
                    zzbfg zzbfgVar4 = (zzbfg) zzbfpVar;
                    int zzj16 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    zzbfgVar4.zzh(zzbcc.zzs(zzbbfVar.zza));
                    while (zzj16 < i5) {
                        int zzj17 = zzbbg.zzj(bArr, zzj16, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzbbg.zzj(bArr, zzj17, zzbbfVar);
                        zzbfgVar4.zzh(zzbcc.zzs(zzbbfVar.zza));
                    }
                    return zzj16;
                }
                return i15;
            case 34:
            case 48:
                if (i8 == 2) {
                    zzbgh zzbghVar5 = (zzbgh) zzbfpVar;
                    int zzj18 = zzbbg.zzj(bArr, i15, zzbbfVar);
                    int i31 = zzbbfVar.zza + zzj18;
                    while (zzj18 < i31) {
                        zzj18 = zzbbg.zzm(bArr, zzj18, zzbbfVar);
                        zzbghVar5.zzg(zzbcc.zzt(zzbbfVar.zzb));
                    }
                    if (zzj18 == i31) {
                        return zzj18;
                    }
                    throw zzbfs.zzj();
                }
                if (i8 == 0) {
                    zzbgh zzbghVar6 = (zzbgh) zzbfpVar;
                    int zzm3 = zzbbg.zzm(bArr, i15, zzbbfVar);
                    zzbghVar6.zzg(zzbcc.zzt(zzbbfVar.zzb));
                    while (zzm3 < i5) {
                        int zzj19 = zzbbg.zzj(bArr, zzm3, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzbbg.zzm(bArr, zzj19, zzbbfVar);
                        zzbghVar6.zzg(zzbcc.zzt(zzbbfVar.zzb));
                    }
                    return zzm3;
                }
                return i15;
            default:
                if (i8 == 3) {
                    zzbhf zzF = zzF(i9);
                    int i32 = (i6 & (-8)) | 4;
                    int zzc = zzbbg.zzc(zzF, bArr, i4, i5, i32, zzbbfVar);
                    zzbfpVar.add(zzbbfVar.zzc);
                    while (zzc < i5) {
                        int zzj20 = zzbbg.zzj(bArr, zzc, zzbbfVar);
                        if (i6 != zzbbfVar.zza) {
                            return zzc;
                        }
                        zzc = zzbbg.zzc(zzF, bArr, zzj20, i5, i32, zzbbfVar);
                        zzbfpVar.add(zzbbfVar.zzc);
                    }
                    return zzc;
                }
                return i15;
        }
    }

    private final int zzx(int i4) {
        if (i4 >= this.zze && i4 <= this.zzf) {
            return zzA(i4, 0);
        }
        return -1;
    }

    private final int zzy(int i4, int i5) {
        if (i4 >= this.zze && i4 <= this.zzf) {
            return zzA(i4, i5);
        }
        return -1;
    }

    private final int zzz(int i4) {
        return this.zzc[i4 + 2];
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final int zza(Object obj) {
        if (this.zzj) {
            return zzr(obj);
        }
        return zzq(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final int zzb(Object obj) {
        int i4;
        int zzc;
        int length = this.zzc.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int zzC = zzC(i6);
            int i7 = this.zzc[i6];
            long j4 = 1048575 & zzC;
            int i8 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(Double.doubleToLongBits(zzbij.zza(obj, j4)));
                    i5 = i4 + zzc;
                    break;
                case 1:
                    i4 = i5 * 53;
                    zzc = Float.floatToIntBits(zzbij.zzb(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 2:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(zzbij.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 3:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(zzbij.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 4:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 5:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(zzbij.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 6:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 7:
                    i4 = i5 * 53;
                    zzc = zzbfq.zza(zzbij.zzw(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 8:
                    i4 = i5 * 53;
                    zzc = ((String) zzbij.zzf(obj, j4)).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 9:
                    Object zzf = zzbij.zzf(obj, j4);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 10:
                    i4 = i5 * 53;
                    zzc = zzbij.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 11:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 12:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 13:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 14:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(zzbij.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 15:
                    i4 = i5 * 53;
                    zzc = zzbij.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 16:
                    i4 = i5 * 53;
                    zzc = zzbfq.zzc(zzbij.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzbij.zzf(obj, j4);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.f9571D /* 29 */:
                case 30:
                case ConstraintLayout.b.a.f9573F /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    zzc = zzbij.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 50:
                    i4 = i5 * 53;
                    zzc = zzbij.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 51:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(Double.doubleToLongBits(zzo(obj, j4)));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(zzD(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(zzD(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(zzD(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zza(zzU(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = ((String) zzbij.zzf(obj, j4)).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbij.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case B.f54416q /* 61 */:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbij.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case C0755c.f12913k /* 63 */:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(zzD(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzs(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbfq.zzc(zzD(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzbij.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i5 * 53) + this.zzo.zzd(obj).hashCode();
        if (this.zzh) {
            return (hashCode * 53) + this.zzp.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0635, code lost:
    
        if (r2 == r3) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0637, code lost:
    
        r30.putInt(r13, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x063d, code lost:
    
        r2 = r9.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0641, code lost:
    
        if (r2 >= r9.zzm) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0643, code lost:
    
        r9.zzG(r13, r9.zzk[r2], null, r9.zzo);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0650, code lost:
    
        if (r7 != 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0652, code lost:
    
        if (r0 != r6) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0659, code lost:
    
        throw com.google.android.gms.internal.gtm.zzbfs.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x065e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x065a, code lost:
    
        if (r0 > r6) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x065c, code lost:
    
        if (r1 != r7) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0663, code lost:
    
        throw com.google.android.gms.internal.gtm.zzbfs.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:151:0x00a8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x04d1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.gtm.zzbbf r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgv.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.gtm.zzbbf):int");
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final Object zze() {
        return ((zzbff) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzf(Object obj) {
        int i4;
        int i5 = this.zzl;
        while (true) {
            i4 = this.zzm;
            if (i5 >= i4) {
                break;
            }
            long zzC = zzC(this.zzk[i5]) & 1048575;
            Object zzf = zzbij.zzf(obj, zzC);
            if (zzf != null) {
                ((zzbgm) zzf).zzc();
                zzbij.zzs(obj, zzC, zzf);
            }
            i5++;
        }
        int length = this.zzk.length;
        while (i4 < length) {
            this.zzn.zzb(obj, this.zzk[i4]);
            i4++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zzf(obj);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzC = zzC(i4);
            long j4 = 1048575 & zzC;
            int i5 = this.zzc[i4];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzo(obj, j4, zzbij.zza(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzp(obj, j4, zzbij.zzb(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzr(obj, j4, zzbij.zzd(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzr(obj, j4, zzbij.zzd(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzr(obj, j4, zzbij.zzd(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzm(obj, j4, zzbij.zzw(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzs(obj, j4, zzbij.zzf(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i4);
                    break;
                case 10:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzs(obj, j4, zzbij.zzf(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzr(obj, j4, zzbij.zzd(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzq(obj, j4, zzbij.zzc(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i4)) {
                        zzbij.zzr(obj, j4, zzbij.zzd(obj2, j4));
                        zzM(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.b.a.f9571D /* 29 */:
                case 30:
                case ConstraintLayout.b.a.f9573F /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j4);
                    break;
                case 50:
                    zzbhh.zzI(this.zzr, obj, obj2, j4);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case ConstraintLayout.b.a.f9601d0 /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i5, i4)) {
                        zzbij.zzs(obj, j4, zzbij.zzf(obj2, j4));
                        zzN(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i4);
                    break;
                case B.f54416q /* 61 */:
                case 62:
                case C0755c.f12913k /* 63 */:
                case 64:
                case 65:
                case 66:
                case ConstraintLayout.b.a.f9609h0 /* 67 */:
                    if (zzT(obj2, i5, i4)) {
                        zzbij.zzs(obj, j4, zzbij.zzf(obj2, j4));
                        zzN(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i4);
                    break;
            }
        }
        zzbhh.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzbhh.zzE(this.zzp, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0084. Please report as an issue. */
    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzh(Object obj, zzbhe zzbheVar, zzbep zzbepVar) throws IOException {
        zzbepVar.getClass();
        zzbhz zzbhzVar = this.zzo;
        zzbeq zzbeqVar = this.zzp;
        zzbeu zzbeuVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzbheVar.zzc();
                int zzx = zzx(zzc);
                if (zzx < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                            zzG(obj, this.zzk[i4], obj2, zzbhzVar);
                        }
                        if (obj2 != null) {
                            zzbhzVar.zzn(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object zzd = !this.zzh ? null : zzbeqVar.zzd(zzbepVar, this.zzg, zzc);
                    if (zzd != null) {
                        if (zzbeuVar == null) {
                            zzbeuVar = zzbeqVar.zzc(obj);
                        }
                        zzbeu zzbeuVar2 = zzbeuVar;
                        obj2 = zzbeqVar.zze(zzbheVar, zzd, zzbepVar, zzbeuVar2, obj2, zzbhzVar);
                        zzbeuVar = zzbeuVar2;
                    } else {
                        zzbhzVar.zzq(zzbheVar);
                        if (obj2 == null) {
                            obj2 = zzbhzVar.zzc(obj);
                        }
                        if (!zzbhzVar.zzp(obj2, zzbheVar)) {
                            for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                zzG(obj, this.zzk[i5], obj2, zzbhzVar);
                            }
                            if (obj2 != null) {
                                zzbhzVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzbij.zzo(obj, zzC & 1048575, zzbheVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzbij.zzp(obj, zzC & 1048575, zzbheVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzbij.zzr(obj, zzC & 1048575, zzbheVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzbij.zzr(obj, zzC & 1048575, zzbheVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzbij.zzq(obj, zzC & 1048575, zzbheVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzbij.zzr(obj, zzC & 1048575, zzbheVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzbij.zzq(obj, zzC & 1048575, zzbheVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzbij.zzm(obj, zzC & 1048575, zzbheVar.zzS());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzbheVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j4 = zzC & 1048575;
                                    zzbij.zzs(obj, j4, zzbfq.zzg(zzbij.zzf(obj, j4), zzbheVar.zzu(zzF(zzx), zzbepVar)));
                                    break;
                                } else {
                                    zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzu(zzF(zzx), zzbepVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzq());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzbij.zzq(obj, zzC & 1048575, zzbheVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzbheVar.zze();
                                zzbfj zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzbhh.zzD(zzc, zze, obj2, zzbhzVar);
                                    break;
                                }
                                zzbij.zzq(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzbij.zzq(obj, zzC & 1048575, zzbheVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzbij.zzr(obj, zzC & 1048575, zzbheVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzbij.zzq(obj, zzC & 1048575, zzbheVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzbij.zzr(obj, zzC & 1048575, zzbheVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j5 = zzC & 1048575;
                                    zzbij.zzs(obj, j5, zzbfq.zzg(zzbij.zzf(obj, j5), zzbheVar.zzs(zzF(zzx), zzbepVar)));
                                    break;
                                } else {
                                    zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzs(zzF(zzx), zzbepVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzbheVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzbheVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzbheVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzbheVar.zzR(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzbheVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzbheVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzbheVar.zzC(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzbheVar.zzy(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    zzbheVar.zzP(this.zzn.zza(obj, zzC & 1048575));
                                    break;
                                } else {
                                    zzbheVar.zzN(this.zzn.zza(obj, zzC & 1048575));
                                    break;
                                }
                            case 27:
                                zzbheVar.zzI(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzbepVar);
                                break;
                            case 28:
                                zzbheVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case ConstraintLayout.b.a.f9571D /* 29 */:
                                zzbheVar.zzQ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzbheVar.zzB(zza2);
                                obj2 = zzbhh.zzC(zzc, zza2, zzE(zzx), obj2, zzbhzVar);
                                break;
                            case ConstraintLayout.b.a.f9573F /* 31 */:
                                zzbheVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzbheVar.zzK(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzbheVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzbheVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzbheVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzbheVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzbheVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzbheVar.zzR(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzbheVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzbheVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzbheVar.zzC(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzbheVar.zzy(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzbheVar.zzQ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzbheVar.zzB(zza3);
                                obj2 = zzbhh.zzC(zzc, zza3, zzE(zzx), obj2, zzbhzVar);
                                break;
                            case 45:
                                zzbheVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzbheVar.zzK(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzbheVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzbheVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzbheVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzbepVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzbij.zzf(obj, zzC2);
                                if (zzf != null) {
                                    if (zzbgn.zzb(zzf)) {
                                        Object zzb2 = zzbgm.zza().zzb();
                                        zzbgn.zzc(zzb2, zzf);
                                        zzbij.zzs(obj, zzC2, zzb2);
                                        zzf = zzb2;
                                    }
                                } else {
                                    zzf = zzbgm.zza().zzb();
                                    zzbij.zzs(obj, zzC2, zzf);
                                }
                                throw null;
                                break;
                            case 51:
                                zzbij.zzs(obj, zzC & 1048575, Double.valueOf(zzbheVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzbij.zzs(obj, zzC & 1048575, Float.valueOf(zzbheVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzbij.zzs(obj, zzC & 1048575, Long.valueOf(zzbheVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzbij.zzs(obj, zzC & 1048575, Long.valueOf(zzbheVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case ConstraintLayout.b.a.f9601d0 /* 55 */:
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zzbheVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzbij.zzs(obj, zzC & 1048575, Long.valueOf(zzbheVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zzbheVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzbij.zzs(obj, zzC & 1048575, Boolean.valueOf(zzbheVar.zzS()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzbheVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j6 = zzC & 1048575;
                                    zzbij.zzs(obj, j6, zzbfq.zzg(zzbij.zzf(obj, j6), zzbheVar.zzu(zzF(zzx), zzbepVar)));
                                } else {
                                    zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzu(zzF(zzx), zzbepVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case B.f54416q /* 61 */:
                                zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzq());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zzbheVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case C0755c.f12913k /* 63 */:
                                int zze2 = zzbheVar.zze();
                                zzbfj zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzbhh.zzD(zzc, zze2, obj2, zzbhzVar);
                                    break;
                                }
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zzbheVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzbij.zzs(obj, zzC & 1048575, Long.valueOf(zzbheVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzbij.zzs(obj, zzC & 1048575, Integer.valueOf(zzbheVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case ConstraintLayout.b.a.f9609h0 /* 67 */:
                                zzbij.zzs(obj, zzC & 1048575, Long.valueOf(zzbheVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzbij.zzs(obj, zzC & 1048575, zzbheVar.zzs(zzF(zzx), zzbepVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzbhzVar.zzf();
                                }
                                if (!zzbhzVar.zzp(obj2, zzbheVar)) {
                                    for (int i6 = this.zzl; i6 < this.zzm; i6++) {
                                        zzG(obj, this.zzk[i6], obj2, zzbhzVar);
                                    }
                                    zzbhzVar.zzn(obj, obj2);
                                    return;
                                }
                                break;
                        }
                    } catch (zzbfr unused) {
                        zzbhzVar.zzq(zzbheVar);
                        if (obj2 == null) {
                            obj2 = zzbhzVar.zzc(obj);
                        }
                        if (!zzbhzVar.zzp(obj2, zzbheVar)) {
                            for (int i7 = this.zzl; i7 < this.zzm; i7++) {
                                zzG(obj, this.zzk[i7], obj2, zzbhzVar);
                            }
                            if (obj2 != null) {
                                zzbhzVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i8 = this.zzl; i8 < this.zzm; i8++) {
                    zzG(obj, this.zzk[i8], obj2, zzbhzVar);
                }
                if (obj2 != null) {
                    zzbhzVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final void zzi(Object obj, byte[] bArr, int i4, int i5, zzbbf zzbbfVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i4, i5, zzbbfVar);
        } else {
            zzc(obj, bArr, i4, i5, 0, zzbbfVar);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzbhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgv.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.gtm.zzbhf
    public final boolean zzk(Object obj) {
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.zzl) {
            int i9 = this.zzk[i8];
            int i10 = this.zzc[i9];
            int zzC = zzC(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = zzb.getInt(obj, i12);
                }
                i5 = i7;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i7;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i9, i4, i5, i13)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB != 60 && zzB != 68) {
                        if (zzB != 49) {
                            if (zzB == 50 && !((zzbgm) zzbij.zzf(obj, zzC & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzT(obj, i10, i9) && !zzS(obj, zzC, zzF(i9))) {
                        return false;
                    }
                }
                List list = (List) zzbij.zzf(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzbhf zzF = zzF(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzF.zzk(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (zzR(obj, i9, i4, i5, i13) && !zzS(obj, zzC, zzF(i9))) {
                return false;
            }
            i8++;
            i6 = i4;
            i7 = i5;
        }
        if (this.zzh && !this.zzp.zzb(obj).zzm()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0507  */
    @Override // com.google.android.gms.internal.gtm.zzbhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzn(java.lang.Object r13, com.google.android.gms.internal.gtm.zzbck r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbgv.zzn(java.lang.Object, com.google.android.gms.internal.gtm.zzbck):void");
    }
}

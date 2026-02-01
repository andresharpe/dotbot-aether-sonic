package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbeu {
    private static final zzbeu zzb = new zzbeu(true);
    final zzbhs zza = new zzbhi(16);
    private boolean zzc;
    private boolean zzd;

    private zzbeu() {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0018. Please report as an issue. */
    static int zza(zzbip zzbipVar, int i4, Object obj) {
        int zzI = zzbcj.zzI(i4);
        if (zzbipVar == zzbip.zzj) {
            zzbfq.zzi((zzbgs) obj);
            zzI += zzI;
        }
        zzbiq zzbiqVar = zzbiq.INT;
        int i5 = 4;
        switch (zzbipVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i5 = 8;
                return zzI + i5;
            case 1:
                ((Float) obj).floatValue();
                return zzI + i5;
            case 2:
                i5 = zzbcj.zzK(((Long) obj).longValue());
                return zzI + i5;
            case 3:
                i5 = zzbcj.zzK(((Long) obj).longValue());
                return zzI + i5;
            case 4:
                i5 = zzbcj.zzC(((Integer) obj).intValue());
                return zzI + i5;
            case 5:
                ((Long) obj).longValue();
                i5 = 8;
                return zzI + i5;
            case 6:
                ((Integer) obj).intValue();
                return zzI + i5;
            case 7:
                ((Boolean) obj).booleanValue();
                i5 = 1;
                return zzI + i5;
            case 8:
                i5 = obj instanceof zzbbw ? zzbcj.zzz((zzbbw) obj) : zzbcj.zzH((String) obj);
                return zzI + i5;
            case 9:
                i5 = zzbcj.zzB((zzbgs) obj);
                return zzI + i5;
            case 10:
                i5 = obj instanceof zzbfx ? zzbcj.zzD((zzbfx) obj) : zzbcj.zzE((zzbgs) obj);
                return zzI + i5;
            case 11:
                i5 = obj instanceof zzbbw ? zzbcj.zzz((zzbbw) obj) : zzbcj.zzy((byte[]) obj);
                return zzI + i5;
            case 12:
                i5 = zzbcj.zzJ(((Integer) obj).intValue());
                return zzI + i5;
            case 13:
                i5 = obj instanceof zzbfh ? zzbcj.zzC(((zzbfh) obj).zza()) : zzbcj.zzC(((Integer) obj).intValue());
                return zzI + i5;
            case 14:
                ((Integer) obj).intValue();
                return zzI + i5;
            case 15:
                ((Long) obj).longValue();
                i5 = 8;
                return zzI + i5;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i5 = zzbcj.zzJ((intValue >> 31) ^ (intValue + intValue));
                return zzI + i5;
            case 17:
                long longValue = ((Long) obj).longValue();
                i5 = zzbcj.zzK((longValue >> 63) ^ (longValue + longValue));
                return zzI + i5;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzbet zzbetVar, Object obj) {
        zzbip zzd = zzbetVar.zzd();
        int zza = zzbetVar.zza();
        if (zzbetVar.zzg()) {
            zzbetVar.zzf();
            Iterator it = ((List) obj).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                i4 += zza(zzd, zza, it.next());
            }
            return i4;
        }
        return zza(zzd, zza, obj);
    }

    public static zzbeu zze() {
        return zzb;
    }

    private static Object zzn(Object obj) {
        if (obj instanceof zzbgx) {
            return ((zzbgx) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzo(Map.Entry entry) {
        zzbgs zzC;
        zzbet zzbetVar = (zzbet) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzbfx)) {
            if (zzbetVar.zzg()) {
                Object zzf = zzf(zzbetVar);
                if (zzf == null) {
                    zzf = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) zzf).add(zzn(it.next()));
                }
                this.zza.put(zzbetVar, zzf);
                return;
            }
            if (zzbetVar.zze() == zzbiq.MESSAGE) {
                Object zzf2 = zzf(zzbetVar);
                if (zzf2 == null) {
                    this.zza.put(zzbetVar, zzn(value));
                    return;
                }
                if (zzf2 instanceof zzbgx) {
                    zzC = zzbetVar.zzc((zzbgx) zzf2, (zzbgx) value);
                } else {
                    zzbgr zzat = ((zzbgs) zzf2).zzat();
                    zzbetVar.zzb(zzat, (zzbgs) value);
                    zzC = zzat.zzC();
                }
                this.zza.put(zzbetVar, zzC);
                return;
            }
            this.zza.put(zzbetVar, zzn(value));
            return;
        }
        throw null;
    }

    private static boolean zzp(Map.Entry entry) {
        zzbet zzbetVar = (zzbet) entry.getKey();
        if (zzbetVar.zze() == zzbiq.MESSAGE) {
            if (zzbetVar.zzg()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!zzq(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            return zzq(entry.getValue());
        }
        return true;
    }

    private static boolean zzq(Object obj) {
        if (obj instanceof zzbgt) {
            return ((zzbgt) obj).zzaw();
        }
        if (obj instanceof zzbfx) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzr(Map.Entry entry) {
        int zzJ;
        int zzJ2;
        zzbet zzbetVar = (zzbet) entry.getKey();
        Object value = entry.getValue();
        if (zzbetVar.zze() == zzbiq.MESSAGE && !zzbetVar.zzg()) {
            zzbetVar.zzf();
            if (value instanceof zzbfx) {
                int zza = ((zzbet) entry.getKey()).zza();
                int zzJ3 = zzbcj.zzJ(8);
                int zza2 = ((zzbfx) value).zza();
                zzJ = zzJ3 + zzJ3 + zzbcj.zzJ(16) + zzbcj.zzJ(zza);
                zzJ2 = zzbcj.zzJ(24) + zzbcj.zzJ(zza2) + zza2;
            } else {
                int zza3 = ((zzbet) entry.getKey()).zza();
                int zzJ4 = zzbcj.zzJ(8);
                zzJ = zzJ4 + zzJ4 + zzbcj.zzJ(16) + zzbcj.zzJ(zza3);
                zzJ2 = zzbcj.zzJ(24) + zzbcj.zzE((zzbgs) value);
            }
            return zzJ + zzJ2;
        }
        return zzb(zzbetVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzs(com.google.android.gms.internal.gtm.zzbet r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.gtm.zzbip r0 = r2.zzd()
            com.google.android.gms.internal.gtm.zzbfq.zze(r3)
            com.google.android.gms.internal.gtm.zzbip r1 = com.google.android.gms.internal.gtm.zzbip.zza
            com.google.android.gms.internal.gtm.zzbiq r1 = com.google.android.gms.internal.gtm.zzbiq.INT
            com.google.android.gms.internal.gtm.zzbiq r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzbgs
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzbfx
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzbfh
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.gtm.zzbbw
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.gtm.zzbip r2 = r2.zzd()
            com.google.android.gms.internal.gtm.zzbiq r2 = r2.zza()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbeu.zzs(com.google.android.gms.internal.gtm.zzbet, java.lang.Object):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbeu)) {
            return false;
        }
        return this.zza.equals(((zzbeu) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.zza.zzb(); i5++) {
            i4 += zzr(this.zza.zzg(i5));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i4 += zzr((Map.Entry) it.next());
        }
        return i4;
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzbeu clone() {
        zzbeu zzbeuVar = new zzbeu();
        for (int i4 = 0; i4 < this.zza.zzb(); i4++) {
            Map.Entry zzg = this.zza.zzg(i4);
            zzbeuVar.zzk((zzbet) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzbeuVar.zzk((zzbet) entry.getKey(), entry.getValue());
        }
        zzbeuVar.zzd = this.zzd;
        return zzbeuVar;
    }

    public final Object zzf(zzbet zzbetVar) {
        Object obj = this.zza.get(zzbetVar);
        if (!(obj instanceof zzbfx)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzg() {
        if (this.zzd) {
            return new zzbfw(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzh(zzbet zzbetVar, Object obj) {
        List list;
        if (((zzbfc) zzbetVar).zzd) {
            zzs(zzbetVar, obj);
            Object zzf = zzf(zzbetVar);
            if (zzf == null) {
                list = new ArrayList();
                this.zza.put(zzbetVar, list);
            } else {
                list = (List) zzf;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void zzi() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzj(zzbeu zzbeuVar) {
        for (int i4 = 0; i4 < zzbeuVar.zza.zzb(); i4++) {
            zzo(zzbeuVar.zza.zzg(i4));
        }
        Iterator it = zzbeuVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzo((Map.Entry) it.next());
        }
    }

    public final void zzk(zzbet zzbetVar, Object obj) {
        if (zzbetVar.zzg()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    zzs(zzbetVar, arrayList.get(i4));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzs(zzbetVar, obj);
        }
        if (obj instanceof zzbfx) {
            this.zzd = true;
        }
        this.zza.put(zzbetVar, obj);
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final boolean zzm() {
        for (int i4 = 0; i4 < this.zza.zzb(); i4++) {
            if (!zzp(this.zza.zzg(i4))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzp((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzbeu(boolean z3) {
        zzi();
        zzi();
    }
}

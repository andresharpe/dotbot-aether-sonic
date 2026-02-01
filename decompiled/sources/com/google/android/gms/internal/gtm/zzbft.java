package com.google.android.gms.internal.gtm;

import com.google.firebase.remoteconfig.l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzbft {
    public static final zzbft zza;
    public static final zzbft zzb;
    public static final zzbft zzc;
    public static final zzbft zzd;
    public static final zzbft zze;
    public static final zzbft zzf;
    public static final zzbft zzg;
    public static final zzbft zzh;
    public static final zzbft zzi;
    public static final zzbft zzj;
    private static final /* synthetic */ zzbft[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzbft zzbftVar = new zzbft("VOID", 0, Void.class, Void.class, null);
        zza = zzbftVar;
        Class cls = Integer.TYPE;
        zzbft zzbftVar2 = new zzbft("INT", 1, cls, Integer.class, 0);
        zzb = zzbftVar2;
        zzbft zzbftVar3 = new zzbft("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzbftVar3;
        zzbft zzbftVar4 = new zzbft("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzbftVar4;
        zzbft zzbftVar5 = new zzbft("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(l.f37524n));
        zze = zzbftVar5;
        zzbft zzbftVar6 = new zzbft("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzbftVar6;
        zzbft zzbftVar7 = new zzbft("STRING", 6, String.class, String.class, "");
        zzg = zzbftVar7;
        zzbft zzbftVar8 = new zzbft("BYTE_STRING", 7, zzbbw.class, zzbbw.class, zzbbw.zzb);
        zzh = zzbftVar8;
        zzbft zzbftVar9 = new zzbft("ENUM", 8, cls, Integer.class, null);
        zzi = zzbftVar9;
        zzbft zzbftVar10 = new zzbft("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzbftVar10;
        zzk = new zzbft[]{zzbftVar, zzbftVar2, zzbftVar3, zzbftVar4, zzbftVar5, zzbftVar6, zzbftVar7, zzbftVar8, zzbftVar9, zzbftVar10};
    }

    private zzbft(String str, int i4, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzbft[] values() {
        return (zzbft[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}

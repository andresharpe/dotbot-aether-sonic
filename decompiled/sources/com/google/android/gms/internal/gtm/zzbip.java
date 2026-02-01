package com.google.android.gms.internal.gtm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzbip {
    public static final zzbip zza;
    public static final zzbip zzb;
    public static final zzbip zzc;
    public static final zzbip zzd;
    public static final zzbip zze;
    public static final zzbip zzf;
    public static final zzbip zzg;
    public static final zzbip zzh;
    public static final zzbip zzi;
    public static final zzbip zzj;
    public static final zzbip zzk;
    public static final zzbip zzl;
    public static final zzbip zzm;
    public static final zzbip zzn;
    public static final zzbip zzo;
    public static final zzbip zzp;
    public static final zzbip zzq;
    public static final zzbip zzr;
    private static final /* synthetic */ zzbip[] zzs;
    private final zzbiq zzt;

    static {
        zzbip zzbipVar = new zzbip("DOUBLE", 0, zzbiq.DOUBLE, 1);
        zza = zzbipVar;
        zzbip zzbipVar2 = new zzbip("FLOAT", 1, zzbiq.FLOAT, 5);
        zzb = zzbipVar2;
        zzbiq zzbiqVar = zzbiq.LONG;
        zzbip zzbipVar3 = new zzbip("INT64", 2, zzbiqVar, 0);
        zzc = zzbipVar3;
        zzbip zzbipVar4 = new zzbip("UINT64", 3, zzbiqVar, 0);
        zzd = zzbipVar4;
        zzbiq zzbiqVar2 = zzbiq.INT;
        zzbip zzbipVar5 = new zzbip("INT32", 4, zzbiqVar2, 0);
        zze = zzbipVar5;
        zzbip zzbipVar6 = new zzbip("FIXED64", 5, zzbiqVar, 1);
        zzf = zzbipVar6;
        zzbip zzbipVar7 = new zzbip("FIXED32", 6, zzbiqVar2, 5);
        zzg = zzbipVar7;
        zzbip zzbipVar8 = new zzbip("BOOL", 7, zzbiq.BOOLEAN, 0);
        zzh = zzbipVar8;
        zzbip zzbipVar9 = new zzbip("STRING", 8, zzbiq.STRING, 2);
        zzi = zzbipVar9;
        zzbiq zzbiqVar3 = zzbiq.MESSAGE;
        zzbip zzbipVar10 = new zzbip("GROUP", 9, zzbiqVar3, 3);
        zzj = zzbipVar10;
        zzbip zzbipVar11 = new zzbip("MESSAGE", 10, zzbiqVar3, 2);
        zzk = zzbipVar11;
        zzbip zzbipVar12 = new zzbip("BYTES", 11, zzbiq.BYTE_STRING, 2);
        zzl = zzbipVar12;
        zzbip zzbipVar13 = new zzbip("UINT32", 12, zzbiqVar2, 0);
        zzm = zzbipVar13;
        zzbip zzbipVar14 = new zzbip("ENUM", 13, zzbiq.ENUM, 0);
        zzn = zzbipVar14;
        zzbip zzbipVar15 = new zzbip("SFIXED32", 14, zzbiqVar2, 5);
        zzo = zzbipVar15;
        zzbip zzbipVar16 = new zzbip("SFIXED64", 15, zzbiqVar, 1);
        zzp = zzbipVar16;
        zzbip zzbipVar17 = new zzbip("SINT32", 16, zzbiqVar2, 0);
        zzq = zzbipVar17;
        zzbip zzbipVar18 = new zzbip("SINT64", 17, zzbiqVar, 0);
        zzr = zzbipVar18;
        zzs = new zzbip[]{zzbipVar, zzbipVar2, zzbipVar3, zzbipVar4, zzbipVar5, zzbipVar6, zzbipVar7, zzbipVar8, zzbipVar9, zzbipVar10, zzbipVar11, zzbipVar12, zzbipVar13, zzbipVar14, zzbipVar15, zzbipVar16, zzbipVar17, zzbipVar18};
    }

    private zzbip(String str, int i4, zzbiq zzbiqVar, int i5) {
        this.zzt = zzbiqVar;
    }

    public static zzbip[] values() {
        return (zzbip[]) zzs.clone();
    }

    public final zzbiq zza() {
        return this.zzt;
    }
}

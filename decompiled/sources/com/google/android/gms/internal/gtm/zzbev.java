package com.google.android.gms.internal.gtm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zza' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzbev {
    public static final zzbev zzA;
    public static final zzbev zzB;
    public static final zzbev zzC;
    public static final zzbev zzD;
    public static final zzbev zzE;
    public static final zzbev zzF;
    public static final zzbev zzG;
    public static final zzbev zzH;
    public static final zzbev zzI;
    public static final zzbev zzJ;
    public static final zzbev zzK;
    public static final zzbev zzL;
    public static final zzbev zzM;
    public static final zzbev zzN;
    public static final zzbev zzO;
    public static final zzbev zzP;
    public static final zzbev zzQ;
    public static final zzbev zzR;
    public static final zzbev zzS;
    public static final zzbev zzT;
    public static final zzbev zzU;
    public static final zzbev zzV;
    public static final zzbev zzW;
    public static final zzbev zzX;
    public static final zzbev zzY;
    private static final zzbev[] zzZ;
    public static final zzbev zza;
    private static final /* synthetic */ zzbev[] zzaa;
    public static final zzbev zzb;
    public static final zzbev zzc;
    public static final zzbev zzd;
    public static final zzbev zze;
    public static final zzbev zzf;
    public static final zzbev zzg;
    public static final zzbev zzh;
    public static final zzbev zzi;
    public static final zzbev zzj;
    public static final zzbev zzk;
    public static final zzbev zzl;
    public static final zzbev zzm;
    public static final zzbev zzn;
    public static final zzbev zzo;
    public static final zzbev zzp;
    public static final zzbev zzq;
    public static final zzbev zzr;
    public static final zzbev zzs;
    public static final zzbev zzt;
    public static final zzbev zzu;
    public static final zzbev zzv;
    public static final zzbev zzw;
    public static final zzbev zzx;
    public static final zzbev zzy;
    public static final zzbev zzz;
    private final zzbft zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzbft zzbftVar = zzbft.zze;
        zzbev zzbevVar = new zzbev("DOUBLE", 0, 0, 1, zzbftVar);
        zza = zzbevVar;
        zzbft zzbftVar2 = zzbft.zzd;
        zzbev zzbevVar2 = new zzbev("FLOAT", 1, 1, 1, zzbftVar2);
        zzb = zzbevVar2;
        zzbft zzbftVar3 = zzbft.zzc;
        zzbev zzbevVar3 = new zzbev("INT64", 2, 2, 1, zzbftVar3);
        zzc = zzbevVar3;
        zzbev zzbevVar4 = new zzbev("UINT64", 3, 3, 1, zzbftVar3);
        zzd = zzbevVar4;
        zzbft zzbftVar4 = zzbft.zzb;
        zzbev zzbevVar5 = new zzbev("INT32", 4, 4, 1, zzbftVar4);
        zze = zzbevVar5;
        zzbev zzbevVar6 = new zzbev("FIXED64", 5, 5, 1, zzbftVar3);
        zzf = zzbevVar6;
        zzbev zzbevVar7 = new zzbev("FIXED32", 6, 6, 1, zzbftVar4);
        zzg = zzbevVar7;
        zzbft zzbftVar5 = zzbft.zzf;
        zzbev zzbevVar8 = new zzbev("BOOL", 7, 7, 1, zzbftVar5);
        zzh = zzbevVar8;
        zzbft zzbftVar6 = zzbft.zzg;
        zzbev zzbevVar9 = new zzbev("STRING", 8, 8, 1, zzbftVar6);
        zzi = zzbevVar9;
        zzbft zzbftVar7 = zzbft.zzj;
        zzbev zzbevVar10 = new zzbev("MESSAGE", 9, 9, 1, zzbftVar7);
        zzj = zzbevVar10;
        zzbft zzbftVar8 = zzbft.zzh;
        zzbev zzbevVar11 = new zzbev("BYTES", 10, 10, 1, zzbftVar8);
        zzk = zzbevVar11;
        zzbev zzbevVar12 = new zzbev("UINT32", 11, 11, 1, zzbftVar4);
        zzl = zzbevVar12;
        zzbft zzbftVar9 = zzbft.zzi;
        zzbev zzbevVar13 = new zzbev("ENUM", 12, 12, 1, zzbftVar9);
        zzm = zzbevVar13;
        zzbev zzbevVar14 = new zzbev("SFIXED32", 13, 13, 1, zzbftVar4);
        zzn = zzbevVar14;
        zzbev zzbevVar15 = new zzbev("SFIXED64", 14, 14, 1, zzbftVar3);
        zzo = zzbevVar15;
        zzbev zzbevVar16 = new zzbev("SINT32", 15, 15, 1, zzbftVar4);
        zzp = zzbevVar16;
        zzbev zzbevVar17 = new zzbev("SINT64", 16, 16, 1, zzbftVar3);
        zzq = zzbevVar17;
        zzbev zzbevVar18 = new zzbev("GROUP", 17, 17, 1, zzbftVar7);
        zzr = zzbevVar18;
        zzbev zzbevVar19 = new zzbev("DOUBLE_LIST", 18, 18, 2, zzbftVar);
        zzs = zzbevVar19;
        zzbev zzbevVar20 = new zzbev("FLOAT_LIST", 19, 19, 2, zzbftVar2);
        zzt = zzbevVar20;
        zzbev zzbevVar21 = new zzbev("INT64_LIST", 20, 20, 2, zzbftVar3);
        zzu = zzbevVar21;
        zzbev zzbevVar22 = new zzbev("UINT64_LIST", 21, 21, 2, zzbftVar3);
        zzv = zzbevVar22;
        zzbev zzbevVar23 = new zzbev("INT32_LIST", 22, 22, 2, zzbftVar4);
        zzw = zzbevVar23;
        zzbev zzbevVar24 = new zzbev("FIXED64_LIST", 23, 23, 2, zzbftVar3);
        zzx = zzbevVar24;
        zzbev zzbevVar25 = new zzbev("FIXED32_LIST", 24, 24, 2, zzbftVar4);
        zzy = zzbevVar25;
        zzbev zzbevVar26 = new zzbev("BOOL_LIST", 25, 25, 2, zzbftVar5);
        zzz = zzbevVar26;
        zzbev zzbevVar27 = new zzbev("STRING_LIST", 26, 26, 2, zzbftVar6);
        zzA = zzbevVar27;
        zzbev zzbevVar28 = new zzbev("MESSAGE_LIST", 27, 27, 2, zzbftVar7);
        zzB = zzbevVar28;
        zzbev zzbevVar29 = new zzbev("BYTES_LIST", 28, 28, 2, zzbftVar8);
        zzC = zzbevVar29;
        zzbev zzbevVar30 = new zzbev("UINT32_LIST", 29, 29, 2, zzbftVar4);
        zzD = zzbevVar30;
        zzbev zzbevVar31 = new zzbev("ENUM_LIST", 30, 30, 2, zzbftVar9);
        zzE = zzbevVar31;
        zzbev zzbevVar32 = new zzbev("SFIXED32_LIST", 31, 31, 2, zzbftVar4);
        zzF = zzbevVar32;
        zzbev zzbevVar33 = new zzbev("SFIXED64_LIST", 32, 32, 2, zzbftVar3);
        zzG = zzbevVar33;
        zzbev zzbevVar34 = new zzbev("SINT32_LIST", 33, 33, 2, zzbftVar4);
        zzH = zzbevVar34;
        zzbev zzbevVar35 = new zzbev("SINT64_LIST", 34, 34, 2, zzbftVar3);
        zzI = zzbevVar35;
        zzbev zzbevVar36 = new zzbev("DOUBLE_LIST_PACKED", 35, 35, 3, zzbftVar);
        zzJ = zzbevVar36;
        zzbev zzbevVar37 = new zzbev("FLOAT_LIST_PACKED", 36, 36, 3, zzbftVar2);
        zzK = zzbevVar37;
        zzbev zzbevVar38 = new zzbev("INT64_LIST_PACKED", 37, 37, 3, zzbftVar3);
        zzL = zzbevVar38;
        zzbev zzbevVar39 = new zzbev("UINT64_LIST_PACKED", 38, 38, 3, zzbftVar3);
        zzM = zzbevVar39;
        zzbev zzbevVar40 = new zzbev("INT32_LIST_PACKED", 39, 39, 3, zzbftVar4);
        zzN = zzbevVar40;
        zzbev zzbevVar41 = new zzbev("FIXED64_LIST_PACKED", 40, 40, 3, zzbftVar3);
        zzO = zzbevVar41;
        zzbev zzbevVar42 = new zzbev("FIXED32_LIST_PACKED", 41, 41, 3, zzbftVar4);
        zzP = zzbevVar42;
        zzbev zzbevVar43 = new zzbev("BOOL_LIST_PACKED", 42, 42, 3, zzbftVar5);
        zzQ = zzbevVar43;
        zzbev zzbevVar44 = new zzbev("UINT32_LIST_PACKED", 43, 43, 3, zzbftVar4);
        zzR = zzbevVar44;
        zzbev zzbevVar45 = new zzbev("ENUM_LIST_PACKED", 44, 44, 3, zzbftVar9);
        zzS = zzbevVar45;
        zzbev zzbevVar46 = new zzbev("SFIXED32_LIST_PACKED", 45, 45, 3, zzbftVar4);
        zzT = zzbevVar46;
        zzbev zzbevVar47 = new zzbev("SFIXED64_LIST_PACKED", 46, 46, 3, zzbftVar3);
        zzU = zzbevVar47;
        zzbev zzbevVar48 = new zzbev("SINT32_LIST_PACKED", 47, 47, 3, zzbftVar4);
        zzV = zzbevVar48;
        zzbev zzbevVar49 = new zzbev("SINT64_LIST_PACKED", 48, 48, 3, zzbftVar3);
        zzW = zzbevVar49;
        zzbev zzbevVar50 = new zzbev("GROUP_LIST", 49, 49, 2, zzbftVar7);
        zzX = zzbevVar50;
        zzbev zzbevVar51 = new zzbev("MAP", 50, 50, 4, zzbft.zza);
        zzY = zzbevVar51;
        zzaa = new zzbev[]{zzbevVar, zzbevVar2, zzbevVar3, zzbevVar4, zzbevVar5, zzbevVar6, zzbevVar7, zzbevVar8, zzbevVar9, zzbevVar10, zzbevVar11, zzbevVar12, zzbevVar13, zzbevVar14, zzbevVar15, zzbevVar16, zzbevVar17, zzbevVar18, zzbevVar19, zzbevVar20, zzbevVar21, zzbevVar22, zzbevVar23, zzbevVar24, zzbevVar25, zzbevVar26, zzbevVar27, zzbevVar28, zzbevVar29, zzbevVar30, zzbevVar31, zzbevVar32, zzbevVar33, zzbevVar34, zzbevVar35, zzbevVar36, zzbevVar37, zzbevVar38, zzbevVar39, zzbevVar40, zzbevVar41, zzbevVar42, zzbevVar43, zzbevVar44, zzbevVar45, zzbevVar46, zzbevVar47, zzbevVar48, zzbevVar49, zzbevVar50, zzbevVar51};
        zzbev[] values = values();
        zzZ = new zzbev[values.length];
        for (zzbev zzbevVar52 : values) {
            zzZ[zzbevVar52.zzac] = zzbevVar52;
        }
    }

    private zzbev(String str, int i4, int i5, int i6, zzbft zzbftVar) {
        this.zzac = i5;
        this.zzab = zzbftVar;
        zzbft zzbftVar2 = zzbft.zza;
        int i7 = i6 - 1;
        if (i7 != 1) {
            if (i7 != 3) {
                this.zzad = null;
            } else {
                this.zzad = zzbftVar.zza();
            }
        } else {
            this.zzad = zzbftVar.zza();
        }
        if (i6 == 1) {
            zzbftVar.ordinal();
        }
    }

    public static zzbev[] values() {
        return (zzbev[]) zzaa.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}

package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzacl implements zzbfh {
    METHOD_UNDEFINED(0),
    BAKED(1),
    BOILED(2),
    BLANCHED(3),
    BRAISED(4),
    CODDLED(5),
    PRESSURE_COOKED(6),
    SIMMERED(7),
    STEAMED(8),
    STEEPED(9),
    GRILLED(10),
    FRIED(11),
    PAN_FRIED(12),
    STIR_FRIED(13),
    SAUTEED(14),
    ROASTED(15),
    BARBECUED(16),
    SEARED(17),
    SMOKED(18),
    FERMENTED(19),
    MARINATED(20),
    PICKLED(21),
    BASTED(22),
    KNEADED(23),
    OTHER_METHOD(99);

    private static final zzbfi zzz = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzacj
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzacl.zzb(i4);
        }
    };
    private final int zzB;

    zzacl(int i4) {
        this.zzB = i4;
    }

    public static zzacl zzb(int i4) {
        if (i4 == 99) {
            return OTHER_METHOD;
        }
        switch (i4) {
            case 0:
                return METHOD_UNDEFINED;
            case 1:
                return BAKED;
            case 2:
                return BOILED;
            case 3:
                return BLANCHED;
            case 4:
                return BRAISED;
            case 5:
                return CODDLED;
            case 6:
                return PRESSURE_COOKED;
            case 7:
                return SIMMERED;
            case 8:
                return STEAMED;
            case 9:
                return STEEPED;
            case 10:
                return GRILLED;
            case 11:
                return FRIED;
            case 12:
                return PAN_FRIED;
            case 13:
                return STIR_FRIED;
            case 14:
                return SAUTEED;
            case 15:
                return ROASTED;
            case 16:
                return BARBECUED;
            case 17:
                return SEARED;
            case 18:
                return SMOKED;
            case 19:
                return FERMENTED;
            case 20:
                return MARINATED;
            case 21:
                return PICKLED;
            case 22:
                return BASTED;
            case 23:
                return KNEADED;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzack.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzB);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzB;
    }
}

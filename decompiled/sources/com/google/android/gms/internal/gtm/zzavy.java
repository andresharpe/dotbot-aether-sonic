package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzavy implements zzbfh {
    TYPE_ANY(0),
    TYPE_SURFACE(1),
    TYPE_T_BAR(17),
    TYPE_J_BAR(18),
    TYPE_ROPE_TOW(19),
    TYPE_POMA(20),
    TYPE_CARPET(21),
    TYPE_FUNICULAR(22),
    TYPE_GONDOLA(2),
    TYPE_CHAIR(3),
    TYPE_AERIAL(4),
    TYPE_TRAM(65);

    private static final zzbfi zzm = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzavw
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzavy.zzb(i4);
        }
    };
    private final int zzo;

    zzavy(int i4) {
        this.zzo = i4;
    }

    public static zzavy zzb(int i4) {
        if (i4 == 0) {
            return TYPE_ANY;
        }
        if (i4 == 1) {
            return TYPE_SURFACE;
        }
        if (i4 == 2) {
            return TYPE_GONDOLA;
        }
        if (i4 == 3) {
            return TYPE_CHAIR;
        }
        if (i4 == 4) {
            return TYPE_AERIAL;
        }
        if (i4 == 65) {
            return TYPE_TRAM;
        }
        switch (i4) {
            case 17:
                return TYPE_T_BAR;
            case 18:
                return TYPE_J_BAR;
            case 19:
                return TYPE_ROPE_TOW;
            case 20:
                return TYPE_POMA;
            case 21:
                return TYPE_CARPET;
            case 22:
                return TYPE_FUNICULAR;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzavx.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzo);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzo;
    }
}

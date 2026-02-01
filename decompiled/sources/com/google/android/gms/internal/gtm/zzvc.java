package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzvc implements zzbfh {
    NONE(0),
    NANOSECONDS(1),
    MICROSECONDS(2),
    MILLISECONDS(3),
    SECONDS(4),
    MINUTES(5),
    HOURS(6),
    DAYS(7),
    GOOGLE_TIMESTAMP(8),
    STRING(9),
    GOOGLE_INTERVAL(10);

    private static final zzbfi zzl = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzva
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzvc.zzb(i4);
        }
    };
    private final int zzn;

    zzvc(int i4) {
        this.zzn = i4;
    }

    public static zzvc zzb(int i4) {
        switch (i4) {
            case 0:
                return NONE;
            case 1:
                return NANOSECONDS;
            case 2:
                return MICROSECONDS;
            case 3:
                return MILLISECONDS;
            case 4:
                return SECONDS;
            case 5:
                return MINUTES;
            case 6:
                return HOURS;
            case 7:
                return DAYS;
            case 8:
                return GOOGLE_TIMESTAMP;
            case 9:
                return STRING;
            case 10:
                return GOOGLE_INTERVAL;
            default:
                return null;
        }
    }

    public static zzbfj zzc() {
        return zzvb.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzn;
    }
}

package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public enum zzald implements zzbfh {
    TYPE_ANY(0),
    TYPE_USER_DEFINED_LABEL(1),
    TYPE_POINT_ANNOTATION(2),
    TYPE_LINE_ANNOTATION(3),
    TYPE_AREA_ANNOTATION(4);

    private static final zzbfi zzf = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzalb
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzald.zzb(i4);
        }
    };
    private final int zzh;

    zzald(int i4) {
        this.zzh = i4;
    }

    public static zzald zzb(int i4) {
        if (i4 == 0) {
            return TYPE_ANY;
        }
        if (i4 == 1) {
            return TYPE_USER_DEFINED_LABEL;
        }
        if (i4 == 2) {
            return TYPE_POINT_ANNOTATION;
        }
        if (i4 == 3) {
            return TYPE_LINE_ANNOTATION;
        }
        if (i4 != 4) {
            return null;
        }
        return TYPE_AREA_ANNOTATION;
    }

    public static zzbfj zzc() {
        return zzalc.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzh;
    }
}

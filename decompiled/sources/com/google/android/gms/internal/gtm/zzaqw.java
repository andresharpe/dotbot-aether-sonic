package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.clj.fastble.data.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public enum zzaqw implements zzbfh {
    ANY_UNITS(0),
    PER_USE(1),
    PER_PHONE_CALL(17),
    PER_RIDE(18),
    PER_TIME_UNIT(2),
    PER_SECOND(33),
    PER_MINUTE(34),
    PER_HOUR(35),
    PER_DAY(36),
    PER_NIGHT(37),
    PER_WEEK(38),
    PER_MONTH(39),
    PER_YEAR(40),
    PER_VOLUME_UNIT(4),
    PER_LITER(65),
    PER_GLASS(66),
    PER_BOTTLE(67),
    PER_POT(68),
    PER_LENGTH_UNIT(5),
    PER_CENTIMETER(81),
    PER_METER(82),
    PER_KILOMETER(83),
    PER_MASS_UNIT(6),
    PER_GRAM(97),
    PER_KILOGRAM(98),
    PER_OUNCE(99),
    PER_POUND(100);

    private static final zzbfi zzB = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzaqu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaqw.zzb(i4);
        }
    };
    private final int zzD;

    zzaqw(int i4) {
        this.zzD = i4;
    }

    public static zzaqw zzb(int i4) {
        if (i4 == 0) {
            return ANY_UNITS;
        }
        if (i4 == 1) {
            return PER_USE;
        }
        if (i4 == 2) {
            return PER_TIME_UNIT;
        }
        if (i4 == 4) {
            return PER_VOLUME_UNIT;
        }
        if (i4 == 5) {
            return PER_LENGTH_UNIT;
        }
        if (i4 == 6) {
            return PER_MASS_UNIT;
        }
        if (i4 == 17) {
            return PER_PHONE_CALL;
        }
        if (i4 == 18) {
            return PER_RIDE;
        }
        switch (i4) {
            case 33:
                return PER_SECOND;
            case 34:
                return PER_MINUTE;
            case 35:
                return PER_HOUR;
            case 36:
                return PER_DAY;
            case 37:
                return PER_NIGHT;
            case 38:
                return PER_WEEK;
            case 39:
                return PER_MONTH;
            case 40:
                return PER_YEAR;
            default:
                switch (i4) {
                    case 65:
                        return PER_LITER;
                    case 66:
                        return PER_GLASS;
                    case ConstraintLayout.b.a.f9609h0 /* 67 */:
                        return PER_BOTTLE;
                    case 68:
                        return PER_POT;
                    default:
                        switch (i4) {
                            case c.f27051B /* 81 */:
                                return PER_CENTIMETER;
                            case c.f27052C /* 82 */:
                                return PER_METER;
                            case ModuleDescriptor.MODULE_VERSION /* 83 */:
                                return PER_KILOMETER;
                            default:
                                switch (i4) {
                                    case c.f27055F /* 97 */:
                                        return PER_GRAM;
                                    case c.f27056G /* 98 */:
                                        return PER_KILOGRAM;
                                    case 99:
                                        return PER_OUNCE;
                                    case 100:
                                        return PER_POUND;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static zzbfj zzc() {
        return zzaqv.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzD);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzD;
    }
}

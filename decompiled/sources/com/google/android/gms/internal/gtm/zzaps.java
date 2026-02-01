package com.google.android.gms.internal.gtm;

import com.clj.fastble.data.c;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.harman.sdk.message.GestureInfo;

/* loaded from: classes.dex */
public enum zzaps implements zzbfh {
    FLAG_ANY(0),
    FLAG_IN_LOCAL_LANGUAGE(1),
    FLAG_PREFERRED(2),
    FLAG_OFFICIAL(3),
    FLAG_OBSCURE(4),
    FLAG_ON_SIGNS(5),
    FLAG_EXIT_NAME_NUMBER(81),
    FLAG_EXIT_NAME(1297),
    FLAG_INTERCHANGE_NAME(20753),
    FLAG_EXIT_NUMBER(1298),
    FLAG_INTERCHANGE_NUMBER(20769),
    FLAG_TRANSIT_HEADSIGN(82),
    FLAG_CONNECTS_DIRECTLY(83),
    FLAG_CONNECTS_INDIRECTLY(84),
    FLAG_INTERSECTION_NAME(85),
    FLAG_VANITY(6),
    FLAG_ROUTE_NUMBER(7),
    FLAG_COUNTRY_CODE_2(129),
    FLAG_ABBREVIATED(9),
    FLAG_ID(10),
    FLAG_DESIGNATED_MARKET_AREA_ID(GestureInfo.f48258r0),
    FLAG_IATA_ID(GestureInfo.f48260t0),
    FLAG_ICAO_ID(GestureInfo.f48261u0),
    FLAG_ISO_3166_2(GestureInfo.f48262v0),
    FLAG_COUNTRY_SPECIFIC_ID(GestureInfo.f48263w0),
    FLAG_LANGUAGE_CODE(GestureInfo.f48264x0),
    FLAG_TIMEZONE_ID(168),
    FLAG_PHONE_NUMBER_PREFIX(169),
    FLAG_PHONE_NUMBER_AREA_CODE(2705),
    FLAG_TRANSLITERATED(11),
    FLAG_NOT_ON_SIGNS(12),
    FLAG_NOT_IN_LOCAL_LANGUAGE(209),
    FLAG_ROUNDABOUT_ROUTE(211),
    FLAG_NEVER_DISPLAY(212),
    FLAG_BICYCLE_ROUTE(213),
    FLAG_MACHINE_GENERATED(215),
    FLAG_SUSPICIOUS(216);

    private static final zzbfi zzL = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzapq
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzaps.zzb(i4);
        }
    };
    private final int zzN;

    zzaps(int i4) {
        this.zzN = i4;
    }

    public static zzaps zzb(int i4) {
        if (i4 == 129) {
            return FLAG_COUNTRY_CODE_2;
        }
        if (i4 == 161) {
            return FLAG_DESIGNATED_MARKET_AREA_ID;
        }
        if (i4 == 209) {
            return FLAG_NOT_IN_LOCAL_LANGUAGE;
        }
        if (i4 == 2705) {
            return FLAG_PHONE_NUMBER_AREA_CODE;
        }
        if (i4 == 20753) {
            return FLAG_INTERCHANGE_NAME;
        }
        if (i4 == 20769) {
            return FLAG_INTERCHANGE_NUMBER;
        }
        if (i4 == 215) {
            return FLAG_MACHINE_GENERATED;
        }
        if (i4 == 216) {
            return FLAG_SUSPICIOUS;
        }
        if (i4 == 1297) {
            return FLAG_EXIT_NAME;
        }
        if (i4 == 1298) {
            return FLAG_EXIT_NUMBER;
        }
        switch (i4) {
            case 0:
                return FLAG_ANY;
            case 1:
                return FLAG_IN_LOCAL_LANGUAGE;
            case 2:
                return FLAG_PREFERRED;
            case 3:
                return FLAG_OFFICIAL;
            case 4:
                return FLAG_OBSCURE;
            case 5:
                return FLAG_ON_SIGNS;
            case 6:
                return FLAG_VANITY;
            case 7:
                return FLAG_ROUTE_NUMBER;
            default:
                switch (i4) {
                    case 9:
                        return FLAG_ABBREVIATED;
                    case 10:
                        return FLAG_ID;
                    case 11:
                        return FLAG_TRANSLITERATED;
                    case 12:
                        return FLAG_NOT_ON_SIGNS;
                    default:
                        switch (i4) {
                            case c.f27051B /* 81 */:
                                return FLAG_EXIT_NAME_NUMBER;
                            case c.f27052C /* 82 */:
                                return FLAG_TRANSIT_HEADSIGN;
                            case ModuleDescriptor.MODULE_VERSION /* 83 */:
                                return FLAG_CONNECTS_DIRECTLY;
                            case 84:
                                return FLAG_CONNECTS_INDIRECTLY;
                            case 85:
                                return FLAG_INTERSECTION_NAME;
                            default:
                                switch (i4) {
                                    case GestureInfo.f48260t0 /* 163 */:
                                        return FLAG_IATA_ID;
                                    case GestureInfo.f48261u0 /* 164 */:
                                        return FLAG_ICAO_ID;
                                    case GestureInfo.f48262v0 /* 165 */:
                                        return FLAG_ISO_3166_2;
                                    case GestureInfo.f48263w0 /* 166 */:
                                        return FLAG_COUNTRY_SPECIFIC_ID;
                                    case GestureInfo.f48264x0 /* 167 */:
                                        return FLAG_LANGUAGE_CODE;
                                    case 168:
                                        return FLAG_TIMEZONE_ID;
                                    case 169:
                                        return FLAG_PHONE_NUMBER_PREFIX;
                                    default:
                                        switch (i4) {
                                            case 211:
                                                return FLAG_ROUNDABOUT_ROUTE;
                                            case 212:
                                                return FLAG_NEVER_DISPLAY;
                                            case 213:
                                                return FLAG_BICYCLE_ROUTE;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public static zzbfj zzc() {
        return zzapr.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzN);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzN;
    }
}

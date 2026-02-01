package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public enum zzavh implements zzbfh {
    USAGE_ANY(0),
    USAGE_RAMP(17),
    USAGE_ON_RAMP(273),
    USAGE_OFF_RAMP(274),
    USAGE_ON_OFF_RAMP(275),
    USAGE_INTERCHANGE(276),
    USAGE_SPECIAL_TRAFFIC_FIGURE(18),
    USAGE_ROUNDABOUT(289),
    USAGE_ROUNDABOUT_BYPASS(290),
    USAGE_ROUNDABOUT_INTERNAL_BYPASS(4641),
    USAGE_ROUNDABOUT_EXTERNAL_BYPASS(4642),
    USAGE_ENCLOSED_TRAFFIC_AREA(19),
    USAGE_PEDESTRIAN_MALL(20),
    USAGE_MAJOR_PEDESTRIAN_MALL(321),
    USAGE_MINOR_PEDESTRIAN_MALL(322),
    USAGE_WALKWAY(21),
    USAGE_TRAIL(22),
    USAGE_STATION_PATH(23),
    USAGE_ACCESS_PATH(24),
    USAGE_CROSSING(25),
    USAGE_MARKED_CROSSING(v.c.f7436b),
    USAGE_UNMARKED_CROSSING(v.c.f7437c),
    USAGE_OVERPASS(26),
    USAGE_UNDERPASS(27),
    USAGE_HALLWAY(28),
    USAGE_TURN_SEGMENT(29),
    USAGE_INDOOR_CONNECTION_PATH(30);

    private static final zzbfi zzB = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzavf
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzavh.zzb(i4);
        }
    };
    private final int zzD;

    zzavh(int i4) {
        this.zzD = i4;
    }

    public static zzavh zzb(int i4) {
        if (i4 == 0) {
            return USAGE_ANY;
        }
        if (i4 == 289) {
            return USAGE_ROUNDABOUT;
        }
        if (i4 == 290) {
            return USAGE_ROUNDABOUT_BYPASS;
        }
        if (i4 == 321) {
            return USAGE_MAJOR_PEDESTRIAN_MALL;
        }
        if (i4 == 322) {
            return USAGE_MINOR_PEDESTRIAN_MALL;
        }
        if (i4 == 401) {
            return USAGE_MARKED_CROSSING;
        }
        if (i4 == 402) {
            return USAGE_UNMARKED_CROSSING;
        }
        if (i4 == 4641) {
            return USAGE_ROUNDABOUT_INTERNAL_BYPASS;
        }
        if (i4 == 4642) {
            return USAGE_ROUNDABOUT_EXTERNAL_BYPASS;
        }
        switch (i4) {
            case 17:
                return USAGE_RAMP;
            case 18:
                return USAGE_SPECIAL_TRAFFIC_FIGURE;
            case 19:
                return USAGE_ENCLOSED_TRAFFIC_AREA;
            case 20:
                return USAGE_PEDESTRIAN_MALL;
            case 21:
                return USAGE_WALKWAY;
            case 22:
                return USAGE_TRAIL;
            case 23:
                return USAGE_STATION_PATH;
            case 24:
                return USAGE_ACCESS_PATH;
            case 25:
                return USAGE_CROSSING;
            case 26:
                return USAGE_OVERPASS;
            case 27:
                return USAGE_UNDERPASS;
            case 28:
                return USAGE_HALLWAY;
            case ConstraintLayout.b.a.f9571D /* 29 */:
                return USAGE_TURN_SEGMENT;
            case 30:
                return USAGE_INDOOR_CONNECTION_PATH;
            default:
                switch (i4) {
                    case 273:
                        return USAGE_ON_RAMP;
                    case 274:
                        return USAGE_OFF_RAMP;
                    case 275:
                        return USAGE_ON_OFF_RAMP;
                    case 276:
                        return USAGE_INTERCHANGE;
                    default:
                        return null;
                }
        }
    }

    public static zzbfj zzc() {
        return zzavg.zza;
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

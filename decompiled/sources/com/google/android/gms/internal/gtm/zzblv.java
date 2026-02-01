package com.google.android.gms.internal.gtm;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.n;
import com.harman.jbl.partybox.ui.effectlab.a;

/* loaded from: classes.dex */
public enum zzblv implements zzbfh {
    LOGSID_NONE(0),
    LOGSID_IP_ADDRESS(1),
    LOGSID_IP_ADDRESS_INTERNAL(2),
    LOGSID_USER_AGENT(3),
    LOGSID_SENSITIVE_TIMESTAMP(4),
    LOGSID_SENSITIVE_LOCATION(5),
    LOGSID_APPROXIMATE_LOCATION(15),
    LOGSID_COARSE_LOCATION(6),
    LOGSID_OTHER_LOCATION(9),
    LOGSID_OTHER_VERSION_ID(7),
    LOGSID_REFERER(8),
    LOGSID_THIRD_PARTY_PARAMETERS(16),
    LOGSID_OTHER_PSEUDONYMOUS_ID(10),
    LOGSID_PREF(11),
    LOGSID_ZWIEBACK(12),
    LOGSID_BISCOTTI(13),
    LOGSID_CUSTOM_SESSION_ID(14),
    LOGSID_OTHER_PERSONAL_ID(20),
    LOGSID_GAIA_ID(21),
    LOGSID_EMAIL(22),
    LOGSID_USERNAME(23),
    LOGSID_PHONE_NUMBER(24),
    LOGSID_GAIA_ID_PUBLIC(207),
    LOGSID_OTHER_AUTHENTICATED_ID(30),
    LOGSID_OTHER_UNAUTHENTICATED_ID(31),
    LOGSID_PARTNER_OR_CUSTOMER_ID(32),
    LOGSID_PUBLISHER_ID(35),
    LOGSID_DASHER_ID(33),
    LOGSID_FOCUS_GROUP_ID(34),
    LOGSID_OTHER_MOBILE_DEVICE_ID(50),
    LOGSID_GSERVICES_ANDROID_ID(51),
    LOGSID_HARDWARE_ID(52),
    LOGSID_MSISDN_ID(53),
    LOGSID_BUILD_SERIAL_ID(54),
    LOGSID_UDID_ID(55),
    LOGSID_ANDROID_LOGGING_ID(56),
    LOGSID_SECURE_SETTINGS_ANDROID_ID(57),
    LOGSID_OTHER_IDENTIFYING_USER_INFO(100),
    LOGSID_USER_INPUT(n.f.f18255b),
    LOGSID_DEMOGRAPHIC_INFO(a.c.f43509b),
    LOGSID_GENERIC_KEY(a.c.f43510c),
    LOGSID_GENERIC_VALUE(a.c.f43511d),
    LOGSID_COOKIE(a.c.f43512e),
    LOGSID_URL(a.c.f43513f),
    LOGSID_HTTPHEADER(a.c.f43514g);

    private static final zzbfi zzT = new zzbfi() { // from class: com.google.android.gms.internal.gtm.zzblu
        @Override // com.google.android.gms.internal.gtm.zzbfi
        public final /* synthetic */ zzbfh zza(int i4) {
            return zzblv.zzc(i4);
        }
    };
    private final int zzV;

    zzblv(int i4) {
        this.zzV = i4;
    }

    public static zzbfi zzb() {
        return zzT;
    }

    public static zzblv zzc(int i4) {
        if (i4 == 100) {
            return LOGSID_OTHER_IDENTIFYING_USER_INFO;
        }
        switch (i4) {
            case 0:
                return LOGSID_NONE;
            case 1:
                return LOGSID_IP_ADDRESS;
            case 2:
                return LOGSID_IP_ADDRESS_INTERNAL;
            case 3:
                return LOGSID_USER_AGENT;
            case 4:
                return LOGSID_SENSITIVE_TIMESTAMP;
            case 5:
                return LOGSID_SENSITIVE_LOCATION;
            case 6:
                return LOGSID_COARSE_LOCATION;
            case 7:
                return LOGSID_OTHER_VERSION_ID;
            case 8:
                return LOGSID_REFERER;
            case 9:
                return LOGSID_OTHER_LOCATION;
            case 10:
                return LOGSID_OTHER_PSEUDONYMOUS_ID;
            case 11:
                return LOGSID_PREF;
            case 12:
                return LOGSID_ZWIEBACK;
            case 13:
                return LOGSID_BISCOTTI;
            case 14:
                return LOGSID_CUSTOM_SESSION_ID;
            case 15:
                return LOGSID_APPROXIMATE_LOCATION;
            case 16:
                return LOGSID_THIRD_PARTY_PARAMETERS;
            default:
                switch (i4) {
                    case 20:
                        return LOGSID_OTHER_PERSONAL_ID;
                    case 21:
                        return LOGSID_GAIA_ID;
                    case 22:
                        return LOGSID_EMAIL;
                    case 23:
                        return LOGSID_USERNAME;
                    case 24:
                        return LOGSID_PHONE_NUMBER;
                    default:
                        switch (i4) {
                            case 30:
                                return LOGSID_OTHER_AUTHENTICATED_ID;
                            case ConstraintLayout.b.a.f9573F /* 31 */:
                                return LOGSID_OTHER_UNAUTHENTICATED_ID;
                            case 32:
                                return LOGSID_PARTNER_OR_CUSTOMER_ID;
                            case 33:
                                return LOGSID_DASHER_ID;
                            case 34:
                                return LOGSID_FOCUS_GROUP_ID;
                            case 35:
                                return LOGSID_PUBLISHER_ID;
                            default:
                                switch (i4) {
                                    case 50:
                                        return LOGSID_OTHER_MOBILE_DEVICE_ID;
                                    case 51:
                                        return LOGSID_GSERVICES_ANDROID_ID;
                                    case 52:
                                        return LOGSID_HARDWARE_ID;
                                    case 53:
                                        return LOGSID_MSISDN_ID;
                                    case 54:
                                        return LOGSID_BUILD_SERIAL_ID;
                                    case ConstraintLayout.b.a.f9601d0 /* 55 */:
                                        return LOGSID_UDID_ID;
                                    case 56:
                                        return LOGSID_ANDROID_LOGGING_ID;
                                    case 57:
                                        return LOGSID_SECURE_SETTINGS_ANDROID_ID;
                                    default:
                                        switch (i4) {
                                            case n.f.f18255b /* 200 */:
                                                return LOGSID_USER_INPUT;
                                            case a.c.f43509b /* 201 */:
                                                return LOGSID_DEMOGRAPHIC_INFO;
                                            case a.c.f43510c /* 202 */:
                                                return LOGSID_GENERIC_KEY;
                                            case a.c.f43511d /* 203 */:
                                                return LOGSID_GENERIC_VALUE;
                                            case a.c.f43512e /* 204 */:
                                                return LOGSID_COOKIE;
                                            case a.c.f43513f /* 205 */:
                                                return LOGSID_URL;
                                            case a.c.f43514g /* 206 */:
                                                return LOGSID_HTTPHEADER;
                                            case 207:
                                                return LOGSID_GAIA_ID_PUBLIC;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzV);
    }

    @Override // com.google.android.gms.internal.gtm.zzbfh
    public final int zza() {
        return this.zzV;
    }
}

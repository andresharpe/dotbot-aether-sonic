package n;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.N;
import androidx.annotation.P;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f55271a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f55272b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f55273c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f55274d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f55275e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f55276f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f55277g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f55278h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final int f55279i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f55280j = 16;

    /* renamed from: k, reason: collision with root package name */
    public static final int f55281k = 32;

    private C2371a() {
    }

    @N
    public static String a(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        return "UNKNOWN";
                    }
                    return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
                }
                return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            }
            return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
        }
        return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @N
    public static String b(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i4 > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i4);
            i4 &= ~numberOfTrailingZeros;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros != 1) {
                if (numberOfTrailingZeros != 2) {
                    if (numberOfTrailingZeros != 4) {
                        if (numberOfTrailingZeros != 8) {
                            if (numberOfTrailingZeros == 16) {
                                sb.append("FEEDBACK_GENERIC");
                            }
                        } else {
                            sb.append("FEEDBACK_VISUAL");
                        }
                    } else {
                        sb.append("FEEDBACK_AUDIBLE");
                    }
                } else {
                    sb.append("FEEDBACK_HAPTIC");
                }
            } else {
                sb.append("FEEDBACK_SPOKEN");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @P
    public static String c(int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 != 8) {
                        if (i4 != 16) {
                            if (i4 != 32) {
                                return null;
                            }
                            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
                        }
                        return "FLAG_REPORT_VIEW_IDS";
                    }
                    return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
                }
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            }
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        return "DEFAULT";
    }

    public static int d(@N AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @P
    public static String e(@N AccessibilityServiceInfo accessibilityServiceInfo, @N PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}

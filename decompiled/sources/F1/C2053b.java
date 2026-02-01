package f1;

import java.util.HashMap;
import java.util.Map;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2053b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f50372a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f50373b;

    static {
        HashMap hashMap = new HashMap();
        f50372a = hashMap;
        HashMap hashMap2 = new HashMap();
        f50373b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i4) {
        Map map = f50372a;
        Integer valueOf = Integer.valueOf(i4);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f50373b.get(valueOf)) + ")";
    }
}

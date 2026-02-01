package K1;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.harman.log.f;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1396a = "FIREBASE_LOG ";

    /* renamed from: b, reason: collision with root package name */
    private static FirebaseAnalytics f1397b;

    public static void a(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalytics = f1397b;
        if (firebaseAnalytics != null) {
            firebaseAnalytics.b(str.toLowerCase(Locale.ROOT), bundle);
        } else {
            f.b(f1396a, "firebaseAnalytics is null!!!!");
        }
    }

    public static void b(long j4) {
        if (j4 < 0) {
            f.a(f1396a, "logOTADurationSelectContent failed durationLong =" + j4);
        }
    }

    public static void c(Context context) {
        f1397b = FirebaseAnalytics.getInstance(context);
    }
}

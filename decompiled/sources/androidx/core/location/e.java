package androidx.core.location;

import android.location.Location;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class e {
    public static final double a(@l3.d Location location) {
        F.p(location, "<this>");
        return location.getLatitude();
    }

    public static final double b(@l3.d Location location) {
        F.p(location, "<this>");
        return location.getLongitude();
    }
}

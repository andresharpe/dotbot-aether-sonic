package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes.dex */
public final class O {
    @l3.d
    public static final PorterDuffColorFilter a(@l3.d PorterDuff.Mode mode, int i4) {
        kotlin.jvm.internal.F.p(mode, "<this>");
        return new PorterDuffColorFilter(i4, mode);
    }

    @l3.d
    public static final PorterDuffXfermode b(@l3.d PorterDuff.Mode mode) {
        kotlin.jvm.internal.F.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}

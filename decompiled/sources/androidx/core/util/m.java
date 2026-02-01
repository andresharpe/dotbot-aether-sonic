package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Half;
import androidx.annotation.W;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class m {
    @l3.d
    @W(26)
    public static final Half a(double d4) {
        Half valueOf;
        valueOf = Half.valueOf((float) d4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @l3.d
    @W(26)
    public static final Half b(float f4) {
        Half valueOf;
        valueOf = Half.valueOf(f4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @l3.d
    @W(26)
    public static final Half c(@l3.d String str) {
        Half valueOf;
        kotlin.jvm.internal.F.p(str, "<this>");
        valueOf = Half.valueOf(str);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @l3.d
    @W(26)
    public static final Half d(short s4) {
        Half valueOf;
        valueOf = Half.valueOf(s4);
        kotlin.jvm.internal.F.o(valueOf, "valueOf(this)");
        return valueOf;
    }
}

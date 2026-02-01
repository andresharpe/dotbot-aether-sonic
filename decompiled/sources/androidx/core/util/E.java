package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.W;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class E {
    @W(21)
    public static final float a(@l3.d SizeF sizeF) {
        kotlin.jvm.internal.F.p(sizeF, "<this>");
        return sizeF.getWidth();
    }

    public static final float b(@l3.d D d4) {
        kotlin.jvm.internal.F.p(d4, "<this>");
        return d4.b();
    }

    @W(21)
    public static final int c(@l3.d Size size) {
        kotlin.jvm.internal.F.p(size, "<this>");
        return size.getWidth();
    }

    @W(21)
    public static final float d(@l3.d SizeF sizeF) {
        kotlin.jvm.internal.F.p(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float e(@l3.d D d4) {
        kotlin.jvm.internal.F.p(d4, "<this>");
        return d4.a();
    }

    @W(21)
    public static final int f(@l3.d Size size) {
        kotlin.jvm.internal.F.p(size, "<this>");
        return size.getHeight();
    }
}

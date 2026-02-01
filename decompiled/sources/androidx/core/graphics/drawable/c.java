package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.W;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class c {
    @l3.d
    public static final ColorDrawable a(@InterfaceC0569l int i4) {
        return new ColorDrawable(i4);
    }

    @l3.d
    @SuppressLint({"ClassVerificationFailure"})
    @W(26)
    public static final ColorDrawable b(@l3.d Color color) {
        int argb;
        F.p(color, "<this>");
        argb = color.toArgb();
        return new ColorDrawable(argb);
    }
}

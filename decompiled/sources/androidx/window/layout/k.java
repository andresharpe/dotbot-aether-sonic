package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.W;

@W(28)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final k f20849a = new k();

    private k() {
    }

    public final int a(@l3.d DisplayCutout displayCutout) {
        int safeInsetBottom;
        kotlin.jvm.internal.F.p(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    public final int b(@l3.d DisplayCutout displayCutout) {
        int safeInsetLeft;
        kotlin.jvm.internal.F.p(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int c(@l3.d DisplayCutout displayCutout) {
        int safeInsetRight;
        kotlin.jvm.internal.F.p(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    public final int d(@l3.d DisplayCutout displayCutout) {
        int safeInsetTop;
        kotlin.jvm.internal.F.p(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}

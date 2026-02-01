package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowMetrics;
import androidx.annotation.W;

@W(30)
/* renamed from: androidx.window.layout.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996e {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0996e f20847a = new C0996e();

    private C0996e() {
    }

    @l3.d
    public final Rect a(@l3.d Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        kotlin.jvm.internal.F.p(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        kotlin.jvm.internal.F.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @l3.d
    public final Rect b(@l3.d Activity activity) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        kotlin.jvm.internal.F.p(activity, "activity");
        maximumWindowMetrics = activity.getWindowManager().getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        kotlin.jvm.internal.F.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}

package androidx.core.view;

import android.view.VelocityTracker;

@Deprecated
/* renamed from: androidx.core.view.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817i0 {
    private C0817i0() {
    }

    @Deprecated
    public static float a(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getXVelocity(i4);
    }

    @Deprecated
    public static float b(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getYVelocity(i4);
    }
}

package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.W;

@W(24)
/* renamed from: androidx.window.layout.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0992a f20846a = new C0992a();

    private C0992a() {
    }

    public final boolean a(@l3.d Activity activity) {
        kotlin.jvm.internal.F.p(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}

package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.W;

@W(17)
/* renamed from: androidx.window.layout.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997f {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0997f f20848a = new C0997f();

    private C0997f() {
    }

    public final void a(@l3.d Display display, @l3.d Point point) {
        kotlin.jvm.internal.F.p(display, "display");
        kotlin.jvm.internal.F.p(point, "point");
        display.getRealSize(point);
    }
}

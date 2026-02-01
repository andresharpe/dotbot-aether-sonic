package androidx.core.view;

import android.view.View;
import androidx.annotation.InterfaceC0577u;

@androidx.annotation.W(16)
/* renamed from: androidx.core.view.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0798c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final C0798c f13461a = new C0798c();

    private C0798c() {
    }

    @W2.n
    @InterfaceC0577u
    public static final void a(@l3.d View view, @l3.d Runnable action, long j4) {
        kotlin.jvm.internal.F.p(view, "view");
        kotlin.jvm.internal.F.p(action, "action");
        view.postOnAnimationDelayed(action, j4);
    }
}

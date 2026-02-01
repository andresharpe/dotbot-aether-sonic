package androidx.core.animation;

import W2.n;
import android.animation.Animator;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import kotlin.jvm.internal.F;
import l3.d;

@W(19)
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f11525a = new a();

    private a() {
    }

    @n
    @InterfaceC0577u
    public static final void a(@d Animator animator, @d Animator.AnimatorPauseListener listener) {
        F.p(animator, "animator");
        F.p(listener, "listener");
        animator.addPauseListener(listener);
    }
}

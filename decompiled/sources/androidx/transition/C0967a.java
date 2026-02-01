package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0967a {

    /* renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    interface InterfaceC0180a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    private C0967a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@androidx.annotation.N Animator animator, @androidx.annotation.N AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@androidx.annotation.N Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(@androidx.annotation.N Animator animator) {
        animator.resume();
    }
}

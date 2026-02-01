package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.InterfaceC0559b;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.material.animation.h;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface f {
    void a();

    h b();

    @InterfaceC0559b
    int c();

    void d();

    @P
    h e();

    boolean f();

    void g(@N Animator.AnimatorListener animatorListener);

    void h(@N Animator.AnimatorListener animatorListener);

    void i();

    void j(@P h hVar);

    AnimatorSet k();

    List<Animator.AnimatorListener> l();

    void m(@P ExtendedFloatingActionButton.j jVar);

    void onAnimationStart(Animator animator);
}

package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.P;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    @P
    private Animator f32367a;

    public void a() {
        Animator animator = this.f32367a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f32367a = null;
    }

    public void c(Animator animator) {
        a();
        this.f32367a = animator;
    }
}

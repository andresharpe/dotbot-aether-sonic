package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.request.transition.f;

/* loaded from: classes.dex */
public abstract class j<Z> extends r<ImageView, Z> implements f.a {

    /* renamed from: N, reason: collision with root package name */
    @P
    private Animatable f26867N;

    public j(ImageView imageView) {
        super(imageView);
    }

    private void x(@P Z z3) {
        if (z3 instanceof Animatable) {
            Animatable animatable = (Animatable) z3;
            this.f26867N = animatable;
            animatable.start();
            return;
        }
        this.f26867N = null;
    }

    private void z(@P Z z3) {
        y(z3);
        x(z3);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.m
    public void a() {
        Animatable animatable = this.f26867N;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.m
    public void b() {
        Animatable animatable = this.f26867N;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.p
    public void e(@N Z z3, @P com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar != null && fVar.a(z3, this)) {
            x(z3);
        } else {
            z(z3);
        }
    }

    @Override // com.bumptech.glide.request.transition.f.a
    public void f(Drawable drawable) {
        ((ImageView) this.f26883F).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.transition.f.a
    @P
    public Drawable h() {
        return ((ImageView) this.f26883F).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void m(@P Drawable drawable) {
        super.m(drawable);
        z(null);
        f(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void p(@P Drawable drawable) {
        super.p(drawable);
        z(null);
        f(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void r(@P Drawable drawable) {
        super.r(drawable);
        Animatable animatable = this.f26867N;
        if (animatable != null) {
            animatable.stop();
        }
        z(null);
        f(drawable);
    }

    protected abstract void y(@P Z z3);

    @Deprecated
    public j(ImageView imageView, boolean z3) {
        super(imageView, z3);
    }
}

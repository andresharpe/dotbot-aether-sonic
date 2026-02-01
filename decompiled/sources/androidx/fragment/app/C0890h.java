package androidx.fragment.app;

import A.a;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.InterfaceC0558a;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0802d0;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0890h {
    private C0890h() {
    }

    @InterfaceC0558a
    private static int a(Fragment fragment, boolean z3, boolean z4) {
        if (z4) {
            if (z3) {
                return fragment.q();
            }
            return fragment.r();
        }
        if (z3) {
            return fragment.h();
        }
        return fragment.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(@androidx.annotation.N Context context, @androidx.annotation.N Fragment fragment, boolean z3, boolean z4) {
        int o4 = fragment.o();
        int a4 = a(fragment, z3, z4);
        fragment.e0(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f15025l0;
        if (viewGroup != null && viewGroup.getTag(a.c.f17c) != null) {
            fragment.f15025l0.setTag(a.c.f17c, null);
        }
        ViewGroup viewGroup2 = fragment.f15025l0;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(o4, z3, a4);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(o4, z3, a4);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a4 == 0 && o4 != 0) {
            a4 = d(context, o4, z3);
        }
        if (a4 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a4));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a4);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a4);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e5) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a4);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                } else {
                    throw e5;
                }
            }
        }
        return null;
    }

    @InterfaceC0558a
    private static int c(@androidx.annotation.N Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @InterfaceC0558a
    private static int d(@androidx.annotation.N Context context, int i4, boolean z3) {
        if (i4 != 4097) {
            if (i4 != 8194) {
                if (i4 != 8197) {
                    if (i4 != 4099) {
                        if (i4 != 4100) {
                            return -1;
                        }
                        if (z3) {
                            return c(context, R.attr.activityOpenEnterAnimation);
                        }
                        return c(context, R.attr.activityOpenExitAnimation);
                    }
                    if (z3) {
                        return a.b.f11c;
                    }
                    return a.b.f12d;
                }
                if (z3) {
                    return c(context, R.attr.activityCloseEnterAnimation);
                }
                return c(context, R.attr.activityCloseExitAnimation);
            }
            if (z3) {
                return a.b.f9a;
            }
            return a.b.f10b;
        }
        if (z3) {
            return a.b.f13e;
        }
        return a.b.f14f;
    }

    /* renamed from: androidx.fragment.app.h$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f15308a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f15309b;

        a(Animation animation) {
            this.f15308a = animation;
            this.f15309b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f15308a = null;
            this.f15309b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.h$b */
    /* loaded from: classes.dex */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final ViewGroup f15310E;

        /* renamed from: F, reason: collision with root package name */
        private final View f15311F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f15312G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f15313H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f15314I;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(@androidx.annotation.N Animation animation, @androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.N View view) {
            super(false);
            this.f15314I = true;
            this.f15310E = viewGroup;
            this.f15311F = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j4, @androidx.annotation.N Transformation transformation) {
            this.f15314I = true;
            if (this.f15312G) {
                return !this.f15313H;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f15312G = true;
                ViewTreeObserverOnPreDrawListenerC0802d0.a(this.f15310E, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f15312G && this.f15314I) {
                this.f15314I = false;
                this.f15310E.post(this);
            } else {
                this.f15310E.endViewTransition(this.f15311F);
                this.f15313H = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j4, @androidx.annotation.N Transformation transformation, float f4) {
            this.f15314I = true;
            if (this.f15312G) {
                return !this.f15313H;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f15312G = true;
                ViewTreeObserverOnPreDrawListenerC0802d0.a(this.f15310E, this);
            }
            return true;
        }
    }
}

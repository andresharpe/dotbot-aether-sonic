package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.InterfaceC0580x;

/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f13229a;

    @androidx.annotation.W(30)
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f13230a;

        a(@androidx.annotation.N WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f13230a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.X0.b
        void a(boolean z3) {
            this.f13230a.finish(z3);
        }

        @Override // androidx.core.view.X0.b
        public float b() {
            float currentAlpha;
            currentAlpha = this.f13230a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.X0.b
        public float c() {
            float currentFraction;
            currentFraction = this.f13230a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.X0.b
        @androidx.annotation.N
        public androidx.core.graphics.E d() {
            Insets currentInsets;
            currentInsets = this.f13230a.getCurrentInsets();
            return androidx.core.graphics.E.g(currentInsets);
        }

        @Override // androidx.core.view.X0.b
        @androidx.annotation.N
        public androidx.core.graphics.E e() {
            Insets hiddenStateInsets;
            hiddenStateInsets = this.f13230a.getHiddenStateInsets();
            return androidx.core.graphics.E.g(hiddenStateInsets);
        }

        @Override // androidx.core.view.X0.b
        @androidx.annotation.N
        public androidx.core.graphics.E f() {
            Insets shownStateInsets;
            shownStateInsets = this.f13230a.getShownStateInsets();
            return androidx.core.graphics.E.g(shownStateInsets);
        }

        @Override // androidx.core.view.X0.b
        @SuppressLint({"WrongConstant"})
        public int g() {
            int types;
            types = this.f13230a.getTypes();
            return types;
        }

        @Override // androidx.core.view.X0.b
        boolean h() {
            boolean isCancelled;
            isCancelled = this.f13230a.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.X0.b
        boolean i() {
            boolean isFinished;
            isFinished = this.f13230a.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.X0.b
        public void j(@androidx.annotation.P androidx.core.graphics.E e4, float f4, float f5) {
            Insets h4;
            WindowInsetsAnimationController windowInsetsAnimationController = this.f13230a;
            if (e4 == null) {
                h4 = null;
            } else {
                h4 = e4.h();
            }
            windowInsetsAnimationController.setInsetsAndAlpha(h4, f4, f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        void a(boolean z3) {
        }

        public float b() {
            return 0.0f;
        }

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        public float c() {
            return 0.0f;
        }

        @androidx.annotation.N
        public androidx.core.graphics.E d() {
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.N
        public androidx.core.graphics.E e() {
            return androidx.core.graphics.E.f12398e;
        }

        @androidx.annotation.N
        public androidx.core.graphics.E f() {
            return androidx.core.graphics.E.f12398e;
        }

        public int g() {
            return 0;
        }

        boolean h() {
            return true;
        }

        boolean i() {
            return false;
        }

        public void j(@androidx.annotation.P androidx.core.graphics.E e4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(30)
    public X0(@androidx.annotation.N WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f13229a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z3) {
        this.f13229a.a(z3);
    }

    public float b() {
        return this.f13229a.b();
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    public float c() {
        return this.f13229a.c();
    }

    @androidx.annotation.N
    public androidx.core.graphics.E d() {
        return this.f13229a.d();
    }

    @androidx.annotation.N
    public androidx.core.graphics.E e() {
        return this.f13229a.e();
    }

    @androidx.annotation.N
    public androidx.core.graphics.E f() {
        return this.f13229a.f();
    }

    public int g() {
        return this.f13229a.g();
    }

    public boolean h() {
        return this.f13229a.h();
    }

    public boolean i() {
        return this.f13229a.i();
    }

    public boolean j() {
        if (!i() && !h()) {
            return true;
        }
        return false;
    }

    public void k(@androidx.annotation.P androidx.core.graphics.E e4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f5) {
        this.f13229a.j(e4, f4, f5);
    }
}

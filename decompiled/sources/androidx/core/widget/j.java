package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final EdgeEffect f13813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(EdgeEffect edgeEffect, float f4, float f5) {
            edgeEffect.onPull(f4, f5);
        }
    }

    @W(ConstraintLayout.b.a.f9573F)
    /* loaded from: classes.dex */
    private static class b {
        private b() {
        }

        @InterfaceC0577u
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @InterfaceC0577u
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @InterfaceC0577u
        public static float c(EdgeEffect edgeEffect, float f4, float f5) {
            try {
                return edgeEffect.onPullDistance(f4, f5);
            } catch (Throwable unused) {
                edgeEffect.onPull(f4, f5);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public j(Context context) {
        this.f13813a = new EdgeEffect(context);
    }

    @N
    public static EdgeEffect a(@N Context context, @P AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float d(@N EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void g(@N EdgeEffect edgeEffect, float f4, float f5) {
        a.a(edgeEffect, f4, f5);
    }

    public static float j(@N EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f4, f5);
        }
        g(edgeEffect, f4, f5);
        return f4;
    }

    @Deprecated
    public boolean b(Canvas canvas) {
        return this.f13813a.draw(canvas);
    }

    @Deprecated
    public void c() {
        this.f13813a.finish();
    }

    @Deprecated
    public boolean e() {
        return this.f13813a.isFinished();
    }

    @Deprecated
    public boolean f(int i4) {
        this.f13813a.onAbsorb(i4);
        return true;
    }

    @Deprecated
    public boolean h(float f4) {
        this.f13813a.onPull(f4);
        return true;
    }

    @Deprecated
    public boolean i(float f4, float f5) {
        g(this.f13813a, f4, f5);
        return true;
    }

    @Deprecated
    public boolean k() {
        this.f13813a.onRelease();
        return this.f13813a.isFinished();
    }

    @Deprecated
    public void l(int i4, int i5) {
        this.f13813a.setSize(i4, i5);
    }
}

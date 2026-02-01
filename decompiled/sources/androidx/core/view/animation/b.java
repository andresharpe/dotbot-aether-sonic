package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.W;

/* loaded from: classes.dex */
public final class b {

    @W(21)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static PathInterpolator a(float f4, float f5) {
            return new PathInterpolator(f4, f5);
        }

        @InterfaceC0577u
        static PathInterpolator b(float f4, float f5, float f6, float f7) {
            return new PathInterpolator(f4, f5, f6, f7);
        }

        @InterfaceC0577u
        static PathInterpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    private b() {
    }

    @N
    public static Interpolator a(float f4, float f5) {
        return a.a(f4, f5);
    }

    @N
    public static Interpolator b(float f4, float f5, float f6, float f7) {
        return a.b(f4, f5, f6, f7);
    }

    @N
    public static Interpolator c(@N Path path) {
        return a.c(path);
    }
}

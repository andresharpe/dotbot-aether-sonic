package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C0716g;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12403a = "\udfffd";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12404b = "m";

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<androidx.core.util.q<Rect, Rect>> f12405c = new ThreadLocal<>();

    @androidx.annotation.W(23)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private G() {
    }

    public static boolean a(@androidx.annotation.N Paint paint, @androidx.annotation.N String str) {
        return a.a(paint, str);
    }

    private static androidx.core.util.q<Rect, Rect> b() {
        ThreadLocal<androidx.core.util.q<Rect, Rect>> threadLocal = f12405c;
        androidx.core.util.q<Rect, Rect> qVar = threadLocal.get();
        if (qVar == null) {
            androidx.core.util.q<Rect, Rect> qVar2 = new androidx.core.util.q<>(new Rect(), new Rect());
            threadLocal.set(qVar2);
            return qVar2;
        }
        qVar.f13025a.setEmpty();
        qVar.f13026b.setEmpty();
        return qVar;
    }

    public static boolean c(@androidx.annotation.N Paint paint, @androidx.annotation.P BlendModeCompat blendModeCompat) {
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (blendModeCompat != null) {
                obj = C0716g.b.a(blendModeCompat);
            }
            b.a(paint, obj);
            return true;
        }
        if (blendModeCompat != null) {
            PorterDuff.Mode a4 = C0716g.a(blendModeCompat);
            if (a4 != null) {
                porterDuffXfermode = new PorterDuffXfermode(a4);
            }
            paint.setXfermode(porterDuffXfermode);
            if (a4 != null) {
                return true;
            }
            return false;
        }
        paint.setXfermode(null);
        return true;
    }
}

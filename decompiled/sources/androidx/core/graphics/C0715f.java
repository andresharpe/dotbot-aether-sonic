package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.C0716g;

/* renamed from: androidx.core.graphics.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0715f {

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.graphics.f$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static ColorFilter a(int i4, Object obj) {
            return new BlendModeColorFilter(i4, (BlendMode) obj);
        }
    }

    private C0715f() {
    }

    @androidx.annotation.P
    public static ColorFilter a(int i4, @androidx.annotation.N BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object a4 = C0716g.b.a(blendModeCompat);
            if (a4 == null) {
                return null;
            }
            return a.a(i4, a4);
        }
        PorterDuff.Mode a5 = C0716g.a(blendModeCompat);
        if (a5 == null) {
            return null;
        }
        return new PorterDuffColorFilter(i4, a5);
    }
}

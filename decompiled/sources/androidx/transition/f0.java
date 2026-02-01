package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C0823k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final s0 f20006a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f20007b = "ViewUtils";

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Float> f20008c;

    /* renamed from: d, reason: collision with root package name */
    static final Property<View, Rect> f20009d;

    /* loaded from: classes.dex */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(f0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f4) {
            f0.h(view, f4.floatValue());
        }
    }

    /* loaded from: classes.dex */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return C0823k0.P(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            C0823k0.M1(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f20006a = new r0();
        } else {
            f20006a = new q0();
        }
        f20008c = new a(Float.class, "translationAlpha");
        f20009d = new b(Rect.class, "clipBounds");
    }

    private f0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(@androidx.annotation.N View view) {
        f20006a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e0 b(@androidx.annotation.N View view) {
        return new d0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(@androidx.annotation.N View view) {
        return f20006a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x0 d(@androidx.annotation.N View view) {
        return new w0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(@androidx.annotation.N View view) {
        f20006a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(@androidx.annotation.N View view, @androidx.annotation.P Matrix matrix) {
        f20006a.e(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        f20006a.f(view, i4, i5, i6, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(@androidx.annotation.N View view, float f4) {
        f20006a.g(view, f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(@androidx.annotation.N View view, int i4) {
        f20006a.h(view, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        f20006a.i(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(@androidx.annotation.N View view, @androidx.annotation.N Matrix matrix) {
        f20006a.j(view, matrix);
    }
}

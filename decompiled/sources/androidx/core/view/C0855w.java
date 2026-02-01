package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.InterfaceC0577u;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855w {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f13657a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    /* renamed from: androidx.core.view.w$a */
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @InterfaceC0577u
        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @InterfaceC0577u
        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @InterfaceC0577u
        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @InterfaceC0577u
        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @InterfaceC0577u
        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* renamed from: androidx.core.view.w$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(30)
    /* renamed from: androidx.core.view.w$c */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @InterfaceC0577u
        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public C0855w(@androidx.annotation.P Rect rect, @androidx.annotation.P List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private static DisplayCutout a(@androidx.annotation.N androidx.core.graphics.E e4, @androidx.annotation.P Rect rect, @androidx.annotation.P Rect rect2, @androidx.annotation.P Rect rect3, @androidx.annotation.P Rect rect4, @androidx.annotation.N androidx.core.graphics.E e5) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            return c.a(e4.h(), rect, rect2, rect3, rect4, e5.h());
        }
        if (i4 >= 29) {
            return b.a(e4.h(), rect, rect2, rect3, rect4);
        }
        if (i4 >= 28) {
            Rect rect5 = new Rect(e4.f12399a, e4.f12400b, e4.f12401c, e4.f12402d);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return a.a(rect5, arrayList);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0855w i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0855w(displayCutout);
    }

    @androidx.annotation.N
    public List<Rect> b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f13657a);
        }
        return Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f13657a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f13657a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f13657a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0855w.class == obj.getClass()) {
            return androidx.core.util.p.a(this.f13657a, ((C0855w) obj).f13657a);
        }
        return false;
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f13657a);
        }
        return 0;
    }

    @androidx.annotation.N
    public androidx.core.graphics.E g() {
        if (Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.E.g(c.b(this.f13657a));
        }
        return androidx.core.graphics.E.f12398e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(28)
    public DisplayCutout h() {
        return this.f13657a;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f13657a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    @androidx.annotation.N
    public String toString() {
        return "DisplayCutoutCompat{" + this.f13657a + "}";
    }

    public C0855w(@androidx.annotation.N androidx.core.graphics.E e4, @androidx.annotation.P Rect rect, @androidx.annotation.P Rect rect2, @androidx.annotation.P Rect rect3, @androidx.annotation.P Rect rect4, @androidx.annotation.N androidx.core.graphics.E e5) {
        this(a(e4, rect, rect2, rect3, rect4, e5));
    }

    private C0855w(DisplayCutout displayCutout) {
        this.f13657a = displayCutout;
    }
}

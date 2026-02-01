package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.N
    public static final E f12398e = new E(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f12399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12401c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12402d;

    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Insets a(int i4, int i5, int i6, int i7) {
            return Insets.of(i4, i5, i6, i7);
        }
    }

    private E(int i4, int i5, int i6, int i7) {
        this.f12399a = i4;
        this.f12400b = i5;
        this.f12401c = i6;
        this.f12402d = i7;
    }

    @androidx.annotation.N
    public static E a(@androidx.annotation.N E e4, @androidx.annotation.N E e5) {
        return d(e4.f12399a + e5.f12399a, e4.f12400b + e5.f12400b, e4.f12401c + e5.f12401c, e4.f12402d + e5.f12402d);
    }

    @androidx.annotation.N
    public static E b(@androidx.annotation.N E e4, @androidx.annotation.N E e5) {
        return d(Math.max(e4.f12399a, e5.f12399a), Math.max(e4.f12400b, e5.f12400b), Math.max(e4.f12401c, e5.f12401c), Math.max(e4.f12402d, e5.f12402d));
    }

    @androidx.annotation.N
    public static E c(@androidx.annotation.N E e4, @androidx.annotation.N E e5) {
        return d(Math.min(e4.f12399a, e5.f12399a), Math.min(e4.f12400b, e5.f12400b), Math.min(e4.f12401c, e5.f12401c), Math.min(e4.f12402d, e5.f12402d));
    }

    @androidx.annotation.N
    public static E d(int i4, int i5, int i6, int i7) {
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return f12398e;
        }
        return new E(i4, i5, i6, i7);
    }

    @androidx.annotation.N
    public static E e(@androidx.annotation.N Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @androidx.annotation.N
    public static E f(@androidx.annotation.N E e4, @androidx.annotation.N E e5) {
        return d(e4.f12399a - e5.f12399a, e4.f12400b - e5.f12400b, e4.f12401c - e5.f12401c, e4.f12402d - e5.f12402d);
    }

    @androidx.annotation.N
    @androidx.annotation.W(api = ConstraintLayout.b.a.f9571D)
    public static E g(@androidx.annotation.N Insets insets) {
        int i4;
        int i5;
        int i6;
        int i7;
        i4 = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return d(i4, i5, i6, i7);
    }

    @androidx.annotation.N
    @androidx.annotation.W(api = ConstraintLayout.b.a.f9571D)
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static E i(@androidx.annotation.N Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e4 = (E) obj;
        if (this.f12402d == e4.f12402d && this.f12399a == e4.f12399a && this.f12401c == e4.f12401c && this.f12400b == e4.f12400b) {
            return true;
        }
        return false;
    }

    @androidx.annotation.N
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    public Insets h() {
        return a.a(this.f12399a, this.f12400b, this.f12401c, this.f12402d);
    }

    public int hashCode() {
        return (((((this.f12399a * 31) + this.f12400b) * 31) + this.f12401c) * 31) + this.f12402d;
    }

    @androidx.annotation.N
    public String toString() {
        return "Insets{left=" + this.f12399a + ", top=" + this.f12400b + ", right=" + this.f12401c + ", bottom=" + this.f12402d + '}';
    }
}

package androidx.window.core;

import android.graphics.Rect;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f20725a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20726b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20727c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20728d;

    public b(int i4, int i5, int i6, int i7) {
        this.f20725a = i4;
        this.f20726b = i5;
        this.f20727c = i6;
        this.f20728d = i7;
    }

    public final int a() {
        return this.f20728d;
    }

    public final int b() {
        return this.f20728d - this.f20726b;
    }

    public final int c() {
        return this.f20725a;
    }

    public final int d() {
        return this.f20727c;
    }

    public final int e() {
        return this.f20726b;
    }

    public boolean equals(@l3.e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!F.g(b.class, cls)) {
            return false;
        }
        if (obj != null) {
            b bVar = (b) obj;
            if (this.f20725a == bVar.f20725a && this.f20726b == bVar.f20726b && this.f20727c == bVar.f20727c && this.f20728d == bVar.f20728d) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    public final int f() {
        return this.f20727c - this.f20725a;
    }

    public final boolean g() {
        if (b() != 0 && f() != 0) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        if (b() == 0 && f() == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f20725a * 31) + this.f20726b) * 31) + this.f20727c) * 31) + this.f20728d;
    }

    @l3.d
    public final Rect i() {
        return new Rect(this.f20725a, this.f20726b, this.f20727c, this.f20728d);
    }

    @l3.d
    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f20725a + ',' + this.f20726b + ',' + this.f20727c + ',' + this.f20728d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(@l3.d Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        F.p(rect, "rect");
    }
}

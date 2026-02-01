package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final androidx.window.core.b f20818a;

    public C(@l3.d androidx.window.core.b _bounds) {
        kotlin.jvm.internal.F.p(_bounds, "_bounds");
        this.f20818a = _bounds;
    }

    @l3.d
    public final Rect a() {
        return this.f20818a.i();
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.F.g(C.class, obj.getClass())) {
            return kotlin.jvm.internal.F.g(this.f20818a, ((C) obj).f20818a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20818a.hashCode();
    }

    @l3.d
    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public C(@l3.d Rect bounds) {
        this(new androidx.window.core.b(bounds));
        kotlin.jvm.internal.F.p(bounds, "bounds");
    }
}

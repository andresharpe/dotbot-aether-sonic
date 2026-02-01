package androidx.window.layout;

import androidx.annotation.RestrictTo;
import java.util.List;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final List<l> f20817a;

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public B(@l3.d List<? extends l> displayFeatures) {
        kotlin.jvm.internal.F.p(displayFeatures, "displayFeatures");
        this.f20817a = displayFeatures;
    }

    @l3.d
    public final List<l> a() {
        return this.f20817a;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kotlin.jvm.internal.F.g(B.class, obj.getClass())) {
            return kotlin.jvm.internal.F.g(this.f20817a, ((B) obj).f20817a);
        }
        return false;
    }

    public int hashCode() {
        return this.f20817a.hashCode();
    }

    @l3.d
    public String toString() {
        String m32;
        m32 = kotlin.collections.D.m3(this.f20817a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return m32;
    }
}

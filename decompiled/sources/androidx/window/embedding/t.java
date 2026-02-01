package androidx.window.embedding;

import android.app.Activity;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final c f20799a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final c f20800b;

    /* renamed from: c, reason: collision with root package name */
    private final float f20801c;

    public t(@l3.d c primaryActivityStack, @l3.d c secondaryActivityStack, float f4) {
        F.p(primaryActivityStack, "primaryActivityStack");
        F.p(secondaryActivityStack, "secondaryActivityStack");
        this.f20799a = primaryActivityStack;
        this.f20800b = secondaryActivityStack;
        this.f20801c = f4;
    }

    public final boolean a(@l3.d Activity activity) {
        F.p(activity, "activity");
        if (!this.f20799a.a(activity) && !this.f20800b.a(activity)) {
            return false;
        }
        return true;
    }

    @l3.d
    public final c b() {
        return this.f20799a;
    }

    @l3.d
    public final c c() {
        return this.f20800b;
    }

    public final float d() {
        return this.f20801c;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (F.g(this.f20799a, tVar.f20799a) && F.g(this.f20800b, tVar.f20800b) && this.f20801c == tVar.f20801c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20799a.hashCode() * 31) + this.f20800b.hashCode()) * 31) + Float.hashCode(this.f20801c);
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + b() + ',');
        sb.append("secondaryActivityStack=" + c() + ',');
        sb.append("splitRatio=" + d() + '}');
        String sb2 = sb.toString();
        F.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

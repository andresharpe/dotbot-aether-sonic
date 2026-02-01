package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final List<Activity> f20758a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20759b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l3.d List<? extends Activity> activities, boolean z3) {
        F.p(activities, "activities");
        this.f20758a = activities;
        this.f20759b = z3;
    }

    public final boolean a(@l3.d Activity activity) {
        F.p(activity, "activity");
        return this.f20758a.contains(activity);
    }

    @l3.d
    public final List<Activity> b() {
        return this.f20758a;
    }

    public final boolean c() {
        return this.f20759b;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!F.g(this.f20758a, cVar.f20758a) && this.f20759b != cVar.f20759b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f20759b ? 1 : 0) * 31) + this.f20758a.hashCode();
    }

    @l3.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityStack{");
        sb.append(F.C("activities=", b()));
        sb.append("isEmpty=" + this.f20759b + '}');
        String sb2 = sb.toString();
        F.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ c(List list, boolean z3, int i4, C2197u c2197u) {
        this(list, (i4 & 2) != 0 ? false : z3);
    }
}

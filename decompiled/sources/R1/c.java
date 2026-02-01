package R1;

import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.F;
import l3.d;

/* loaded from: classes2.dex */
public final class c implements Comparator<b> {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final List<Class<? extends b>> f1732a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@d List<? extends Class<? extends b>> priorities) {
        F.p(priorities, "priorities");
        this.f1732a = priorities;
    }

    private final int b(int i4) {
        if (i4 == -1) {
            return Integer.MAX_VALUE;
        }
        return i4;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@d b first, @d b second) {
        F.p(first, "first");
        F.p(second, "second");
        return F.t(b(this.f1732a.indexOf(first.getClass())), b(this.f1732a.indexOf(second.getClass())));
    }
}

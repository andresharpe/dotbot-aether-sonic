package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class l<T> implements Comparator<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Comparator<T> f52030a;

    public l(@l3.d Comparator<T> comparator) {
        F.p(comparator, "comparator");
        this.f52030a = comparator;
    }

    @l3.d
    public final Comparator<T> a() {
        return this.f52030a;
    }

    @Override // java.util.Comparator
    public int compare(T t3, T t4) {
        return this.f52030a.compare(t4, t3);
    }

    @Override // java.util.Comparator
    @l3.d
    public final Comparator<T> reversed() {
        return this.f52030a;
    }
}

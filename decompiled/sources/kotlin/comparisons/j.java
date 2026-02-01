package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class j implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final j f52028a = new j();

    private j() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@l3.d Comparable<Object> a4, @l3.d Comparable<Object> b4) {
        F.p(a4, "a");
        F.p(b4, "b");
        return a4.compareTo(b4);
    }

    @Override // java.util.Comparator
    @l3.d
    public final Comparator<Comparable<? super Object>> reversed() {
        return k.f52029a;
    }
}

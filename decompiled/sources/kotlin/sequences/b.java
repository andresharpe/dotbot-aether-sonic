package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.AbstractC2087b;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
final class b<T, K> extends AbstractC2087b<T> {

    /* renamed from: G, reason: collision with root package name */
    @l3.d
    private final Iterator<T> f52593G;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final X2.l<T, K> f52594H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final HashSet<K> f52595I;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l3.d Iterator<? extends T> source, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(source, "source");
        F.p(keySelector, "keySelector");
        this.f52593G = source;
        this.f52594H = keySelector;
        this.f52595I = new HashSet<>();
    }

    @Override // kotlin.collections.AbstractC2087b
    protected void b() {
        while (this.f52593G.hasNext()) {
            T next = this.f52593G.next();
            if (this.f52595I.add(this.f52594H.C(next))) {
                d(next);
                return;
            }
        }
        c();
    }
}

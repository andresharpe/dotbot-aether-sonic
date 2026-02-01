package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c<T, K> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final m<T> f52596a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final X2.l<T, K> f52597b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l3.d m<? extends T> source, @l3.d X2.l<? super T, ? extends K> keySelector) {
        F.p(source, "source");
        F.p(keySelector, "keySelector");
        this.f52596a = source;
        this.f52597b = keySelector;
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        return new b(this.f52596a.iterator(), this.f52597b);
    }
}

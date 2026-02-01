package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.F;

/* renamed from: kotlin.sequences.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2217a<T> implements m<T> {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final AtomicReference<m<T>> f52592a;

    public C2217a(@l3.d m<? extends T> sequence) {
        F.p(sequence, "sequence");
        this.f52592a = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.m
    @l3.d
    public Iterator<T> iterator() {
        m<T> andSet = this.f52592a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

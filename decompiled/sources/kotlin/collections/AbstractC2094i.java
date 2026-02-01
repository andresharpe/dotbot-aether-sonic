package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C2197u;

@kotlin.Y(version = "1.1")
/* renamed from: kotlin.collections.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2094i<E> extends AbstractC2086a<E> implements Set<E>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    public static final a f51932E = new a(null);

    /* renamed from: kotlin.collections.i$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        public final boolean a(@l3.d Set<?> c4, @l3.d Set<?> other) {
            kotlin.jvm.internal.F.p(c4, "c");
            kotlin.jvm.internal.F.p(other, "other");
            if (c4.size() != other.size()) {
                return false;
            }
            return c4.containsAll(other);
        }

        public final int b(@l3.d Collection<?> c4) {
            int i4;
            kotlin.jvm.internal.F.p(c4, "c");
            int i5 = 0;
            for (Object obj : c4) {
                if (obj != null) {
                    i4 = obj.hashCode();
                } else {
                    i4 = 0;
                }
                i5 += i4;
            }
            return i5;
        }

        private a() {
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@l3.e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f51932E.a(this, (Set) obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f51932E.b(this);
    }

    @Override // kotlin.collections.AbstractC2086a, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

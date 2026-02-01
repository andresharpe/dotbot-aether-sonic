package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2110x extends C2109w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: kotlin.collections.x$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Iterator<T>, Y2.a {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Enumeration<T> f52002E;

        a(Enumeration<T> enumeration) {
            this.f52002E = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f52002E.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f52002E.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @l3.d
    public static <T> Iterator<T> f0(@l3.d Enumeration<T> enumeration) {
        kotlin.jvm.internal.F.p(enumeration, "<this>");
        return new a(enumeration);
    }
}

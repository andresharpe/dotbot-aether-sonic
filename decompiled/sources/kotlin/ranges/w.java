package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.t0;

@Y(version = "1.3")
/* loaded from: classes2.dex */
final class w implements Iterator<t0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    private final int f52493E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f52494F;

    /* renamed from: G, reason: collision with root package name */
    private final int f52495G;

    /* renamed from: H, reason: collision with root package name */
    private int f52496H;

    public /* synthetic */ w(int i4, int i5, int i6, C2197u c2197u) {
        this(i4, i5, i6);
    }

    public int b() {
        int i4 = this.f52496H;
        if (i4 == this.f52493E) {
            if (this.f52494F) {
                this.f52494F = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f52496H = t0.l(this.f52495G + i4);
        }
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52494F;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ t0 next() {
        return t0.e(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private w(int i4, int i5, int i6) {
        int compare;
        this.f52493E = i5;
        boolean z3 = true;
        compare = Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE);
        if (i6 <= 0 ? compare < 0 : compare > 0) {
            z3 = false;
        }
        this.f52494F = z3;
        this.f52495G = t0.l(i6);
        this.f52496H = this.f52494F ? i4 : i5;
    }
}

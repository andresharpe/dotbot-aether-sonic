package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2087b<T> implements Iterator<T>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    @l3.d
    private n0 f51843E = n0.NotReady;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private T f51844F;

    /* renamed from: kotlin.collections.b$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51845a;

        static {
            int[] iArr = new int[n0.values().length];
            try {
                iArr[n0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51845a = iArr;
        }
    }

    private final boolean e() {
        this.f51843E = n0.Failed;
        b();
        if (this.f51843E == n0.Ready) {
            return true;
        }
        return false;
    }

    protected abstract void b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f51843E = n0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(T t3) {
        this.f51844F = t3;
        this.f51843E = n0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        n0 n0Var = this.f51843E;
        if (n0Var != n0.Failed) {
            int i4 = a.f51845a[n0Var.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return true;
                }
                return e();
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f51843E = n0.NotReady;
            return this.f51844F;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n<T> extends o<T> implements Iterator<T>, kotlin.coroutines.c<H0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    private int f52636E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private T f52637F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private Iterator<? extends T> f52638G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private kotlin.coroutines.c<? super H0> f52639H;

    private final Throwable k() {
        int i4 = this.f52636E;
        if (i4 != 4) {
            if (i4 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f52636E);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final T n() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.o
    @l3.e
    public Object b(T t3, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object l5;
        Object l6;
        this.f52637F = t3;
        this.f52636E = 3;
        this.f52639H = cVar;
        l4 = kotlin.coroutines.intrinsics.b.l();
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l5) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l6 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l6) {
            return l4;
        }
        return H0.f51801a;
    }

    @Override // kotlin.coroutines.c
    @l3.d
    public kotlin.coroutines.f e() {
        return EmptyCoroutineContext.f52041E;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i4 = this.f52636E;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw k();
                }
                Iterator<? extends T> it = this.f52638G;
                F.m(it);
                if (it.hasNext()) {
                    this.f52636E = 2;
                    return true;
                }
                this.f52638G = null;
            }
            this.f52636E = 5;
            kotlin.coroutines.c<? super H0> cVar = this.f52639H;
            F.m(cVar);
            this.f52639H = null;
            Result.a aVar = Result.f51807F;
            cVar.x(Result.b(H0.f51801a));
        }
    }

    @Override // kotlin.sequences.o
    @l3.e
    public Object i(@l3.d Iterator<? extends T> it, @l3.d kotlin.coroutines.c<? super H0> cVar) {
        Object l4;
        Object l5;
        Object l6;
        if (!it.hasNext()) {
            return H0.f51801a;
        }
        this.f52638G = it;
        this.f52636E = 2;
        this.f52639H = cVar;
        l4 = kotlin.coroutines.intrinsics.b.l();
        l5 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l5) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        l6 = kotlin.coroutines.intrinsics.b.l();
        if (l4 == l6) {
            return l4;
        }
        return H0.f51801a;
    }

    @l3.e
    public final kotlin.coroutines.c<H0> l() {
        return this.f52639H;
    }

    @Override // java.util.Iterator
    public T next() {
        int i4 = this.f52636E;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.f52636E = 0;
                    T t3 = this.f52637F;
                    this.f52637F = null;
                    return t3;
                }
                throw k();
            }
            this.f52636E = 1;
            Iterator<? extends T> it = this.f52638G;
            F.m(it);
            return it.next();
        }
        return n();
    }

    public final void p(@l3.e kotlin.coroutines.c<? super H0> cVar) {
        this.f52639H = cVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.c
    public void x(@l3.d Object obj) {
        W.n(obj);
        this.f52636E = 4;
    }
}

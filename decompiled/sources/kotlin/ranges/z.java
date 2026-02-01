package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.x0;

@Y(version = "1.3")
/* loaded from: classes2.dex */
final class z implements Iterator<x0>, Y2.a {

    /* renamed from: E, reason: collision with root package name */
    private final long f52503E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f52504F;

    /* renamed from: G, reason: collision with root package name */
    private final long f52505G;

    /* renamed from: H, reason: collision with root package name */
    private long f52506H;

    public /* synthetic */ z(long j4, long j5, long j6, C2197u c2197u) {
        this(j4, j5, j6);
    }

    public long b() {
        long j4 = this.f52506H;
        if (j4 == this.f52503E) {
            if (this.f52504F) {
                this.f52504F = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f52506H = x0.l(this.f52505G + j4);
        }
        return j4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52504F;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ x0 next() {
        return x0.e(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private z(long r4, long r6, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.f52503E = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L16
            int r0 = kotlin.n0.a(r4, r6)
            if (r0 > 0) goto L14
            goto L1c
        L14:
            r1 = r2
            goto L1c
        L16:
            int r0 = kotlin.n0.a(r4, r6)
            if (r0 < 0) goto L14
        L1c:
            r3.f52504F = r1
            long r8 = kotlin.x0.l(r8)
            r3.f52505G = r8
            boolean r8 = r3.f52504F
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.f52506H = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.z.<init>(long, long, long):void");
    }
}

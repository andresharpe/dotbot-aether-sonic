package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.Q;

/* loaded from: classes2.dex */
public final class n extends Q {

    /* renamed from: E, reason: collision with root package name */
    private final long f52479E;

    /* renamed from: F, reason: collision with root package name */
    private final long f52480F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f52481G;

    /* renamed from: H, reason: collision with root package name */
    private long f52482H;

    public n(long j4, long j5, long j6) {
        this.f52479E = j6;
        this.f52480F = j5;
        boolean z3 = true;
        if (j6 <= 0 ? j4 < j5 : j4 > j5) {
            z3 = false;
        }
        this.f52481G = z3;
        this.f52482H = z3 ? j4 : j5;
    }

    @Override // kotlin.collections.Q
    public long c() {
        long j4 = this.f52482H;
        if (j4 == this.f52480F) {
            if (this.f52481G) {
                this.f52481G = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f52482H = this.f52479E + j4;
        }
        return j4;
    }

    public final long d() {
        return this.f52479E;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f52481G;
    }
}

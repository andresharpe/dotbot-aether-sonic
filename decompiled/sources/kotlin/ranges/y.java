package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.x0;

@K0(markerClass = {InterfaceC2218t.class})
@Y(version = "1.5")
/* loaded from: classes2.dex */
public class y implements Iterable<x0>, Y2.a {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f52499H = new a(null);

    /* renamed from: E, reason: collision with root package name */
    private final long f52500E;

    /* renamed from: F, reason: collision with root package name */
    private final long f52501F;

    /* renamed from: G, reason: collision with root package name */
    private final long f52502G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final y a(long j4, long j5, long j6) {
            return new y(j4, j5, j6, null);
        }

        private a() {
        }
    }

    public /* synthetic */ y(long j4, long j5, long j6, C2197u c2197u) {
        this(j4, j5, j6);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof y) {
            if (!isEmpty() || !((y) obj).isEmpty()) {
                y yVar = (y) obj;
                if (this.f52500E != yVar.f52500E || this.f52501F != yVar.f52501F || this.f52502G != yVar.f52502G) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j4 = this.f52500E;
        int l4 = ((int) x0.l(j4 ^ x0.l(j4 >>> 32))) * 31;
        long j5 = this.f52501F;
        int l5 = (l4 + ((int) x0.l(j5 ^ x0.l(j5 >>> 32)))) * 31;
        long j6 = this.f52502G;
        return l5 + ((int) ((j6 >>> 32) ^ j6));
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        long j4 = this.f52502G;
        long j5 = this.f52500E;
        long j6 = this.f52501F;
        if (j4 > 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @l3.d
    public final Iterator<x0> iterator() {
        return new z(this.f52500E, this.f52501F, this.f52502G, null);
    }

    public final long l() {
        return this.f52500E;
    }

    public final long m() {
        return this.f52501F;
    }

    public final long n() {
        return this.f52502G;
    }

    @l3.d
    public String toString() {
        StringBuilder sb;
        long j4;
        if (this.f52502G > 0) {
            sb = new StringBuilder();
            sb.append((Object) x0.g0(this.f52500E));
            sb.append("..");
            sb.append((Object) x0.g0(this.f52501F));
            sb.append(" step ");
            j4 = this.f52502G;
        } else {
            sb = new StringBuilder();
            sb.append((Object) x0.g0(this.f52500E));
            sb.append(" downTo ");
            sb.append((Object) x0.g0(this.f52501F));
            sb.append(" step ");
            j4 = -this.f52502G;
        }
        sb.append(j4);
        return sb.toString();
    }

    private y(long j4, long j5, long j6) {
        if (j6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j6 != Long.MIN_VALUE) {
            this.f52500E = j4;
            this.f52501F = kotlin.internal.q.c(j4, j5, j6);
            this.f52502G = j6;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
}

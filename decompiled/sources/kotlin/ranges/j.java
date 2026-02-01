package kotlin.ranges;

import kotlin.collections.P;
import kotlin.jvm.internal.C2197u;

/* loaded from: classes2.dex */
public class j implements Iterable<Integer>, Y2.a {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f52465H = new a(null);

    /* renamed from: E, reason: collision with root package name */
    private final int f52466E;

    /* renamed from: F, reason: collision with root package name */
    private final int f52467F;

    /* renamed from: G, reason: collision with root package name */
    private final int f52468G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final j a(int i4, int i5, int i6) {
            return new j(i4, i5, i6);
        }

        private a() {
        }
    }

    public j(int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 != Integer.MIN_VALUE) {
                this.f52466E = i4;
                this.f52467F = kotlin.internal.n.c(i4, i5, i6);
                this.f52468G = i6;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof j) {
            if (!isEmpty() || !((j) obj).isEmpty()) {
                j jVar = (j) obj;
                if (this.f52466E != jVar.f52466E || this.f52467F != jVar.f52467F || this.f52468G != jVar.f52468G) {
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
        return (((this.f52466E * 31) + this.f52467F) * 31) + this.f52468G;
    }

    public boolean isEmpty() {
        if (this.f52468G > 0) {
            if (this.f52466E <= this.f52467F) {
                return false;
            }
        } else if (this.f52466E >= this.f52467F) {
            return false;
        }
        return true;
    }

    public final int l() {
        return this.f52466E;
    }

    public final int m() {
        return this.f52467F;
    }

    public final int n() {
        return this.f52468G;
    }

    @Override // java.lang.Iterable
    @l3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public P iterator() {
        return new k(this.f52466E, this.f52467F, this.f52468G);
    }

    @l3.d
    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f52468G > 0) {
            sb = new StringBuilder();
            sb.append(this.f52466E);
            sb.append("..");
            sb.append(this.f52467F);
            sb.append(" step ");
            i4 = this.f52468G;
        } else {
            sb = new StringBuilder();
            sb.append(this.f52466E);
            sb.append(" downTo ");
            sb.append(this.f52467F);
            sb.append(" step ");
            i4 = -this.f52468G;
        }
        sb.append(i4);
        return sb.toString();
    }
}

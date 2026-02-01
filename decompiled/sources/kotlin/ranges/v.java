package kotlin.ranges;

import java.util.Iterator;
import kotlin.InterfaceC2218t;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.t0;

@K0(markerClass = {InterfaceC2218t.class})
@Y(version = "1.5")
/* loaded from: classes2.dex */
public class v implements Iterable<t0>, Y2.a {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final a f52489H = new a(null);

    /* renamed from: E, reason: collision with root package name */
    private final int f52490E;

    /* renamed from: F, reason: collision with root package name */
    private final int f52491F;

    /* renamed from: G, reason: collision with root package name */
    private final int f52492G;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final v a(int i4, int i5, int i6) {
            return new v(i4, i5, i6, null);
        }

        private a() {
        }
    }

    public /* synthetic */ v(int i4, int i5, int i6, C2197u c2197u) {
        this(i4, i5, i6);
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof v) {
            if (!isEmpty() || !((v) obj).isEmpty()) {
                v vVar = (v) obj;
                if (this.f52490E != vVar.f52490E || this.f52491F != vVar.f52491F || this.f52492G != vVar.f52492G) {
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
        return (((this.f52490E * 31) + this.f52491F) * 31) + this.f52492G;
    }

    public boolean isEmpty() {
        int compare;
        int compare2;
        if (this.f52492G > 0) {
            compare2 = Integer.compare(this.f52490E ^ Integer.MIN_VALUE, this.f52491F ^ Integer.MIN_VALUE);
            if (compare2 <= 0) {
                return false;
            }
        } else {
            compare = Integer.compare(this.f52490E ^ Integer.MIN_VALUE, this.f52491F ^ Integer.MIN_VALUE);
            if (compare >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @l3.d
    public final Iterator<t0> iterator() {
        return new w(this.f52490E, this.f52491F, this.f52492G, null);
    }

    public final int l() {
        return this.f52490E;
    }

    public final int m() {
        return this.f52491F;
    }

    public final int n() {
        return this.f52492G;
    }

    @l3.d
    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f52492G > 0) {
            sb = new StringBuilder();
            sb.append((Object) t0.g0(this.f52490E));
            sb.append("..");
            sb.append((Object) t0.g0(this.f52491F));
            sb.append(" step ");
            i4 = this.f52492G;
        } else {
            sb = new StringBuilder();
            sb.append((Object) t0.g0(this.f52490E));
            sb.append(" downTo ");
            sb.append((Object) t0.g0(this.f52491F));
            sb.append(" step ");
            i4 = -this.f52492G;
        }
        sb.append(i4);
        return sb.toString();
    }

    private v(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f52490E = i4;
            this.f52491F = kotlin.internal.q.d(i4, i5, i6);
            this.f52492G = i6;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
}

package kotlin.ranges;

import kotlin.collections.AbstractC2106t;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* renamed from: kotlin.ranges.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2212a implements Iterable<Character>, Y2.a {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    public static final C0469a f52447H = new C0469a(null);

    /* renamed from: E, reason: collision with root package name */
    private final char f52448E;

    /* renamed from: F, reason: collision with root package name */
    private final char f52449F;

    /* renamed from: G, reason: collision with root package name */
    private final int f52450G;

    /* renamed from: kotlin.ranges.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0469a {
        public /* synthetic */ C0469a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final C2212a a(char c4, char c5, int i4) {
            return new C2212a(c4, c5, i4);
        }

        private C0469a() {
        }
    }

    public C2212a(char c4, char c5, int i4) {
        if (i4 != 0) {
            if (i4 != Integer.MIN_VALUE) {
                this.f52448E = c4;
                this.f52449F = (char) kotlin.internal.n.c(c4, c5, i4);
                this.f52450G = i4;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@l3.e Object obj) {
        if (obj instanceof C2212a) {
            if (!isEmpty() || !((C2212a) obj).isEmpty()) {
                C2212a c2212a = (C2212a) obj;
                if (this.f52448E != c2212a.f52448E || this.f52449F != c2212a.f52449F || this.f52450G != c2212a.f52450G) {
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
        return (((this.f52448E * 31) + this.f52449F) * 31) + this.f52450G;
    }

    public boolean isEmpty() {
        if (this.f52450G > 0) {
            if (F.t(this.f52448E, this.f52449F) <= 0) {
                return false;
            }
        } else if (F.t(this.f52448E, this.f52449F) >= 0) {
            return false;
        }
        return true;
    }

    public final char l() {
        return this.f52448E;
    }

    public final char m() {
        return this.f52449F;
    }

    public final int n() {
        return this.f52450G;
    }

    @Override // java.lang.Iterable
    @l3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC2106t iterator() {
        return new C2213b(this.f52448E, this.f52449F, this.f52450G);
    }

    @l3.d
    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f52450G > 0) {
            sb = new StringBuilder();
            sb.append(this.f52448E);
            sb.append("..");
            sb.append(this.f52449F);
            sb.append(" step ");
            i4 = this.f52450G;
        } else {
            sb = new StringBuilder();
            sb.append(this.f52448E);
            sb.append(" downTo ");
            sb.append(this.f52449F);
            sb.append(" step ");
            i4 = -this.f52450G;
        }
        sb.append(i4);
        return sb.toString();
    }
}

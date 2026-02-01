package kotlin.ranges;

import kotlin.InterfaceC2205l;
import kotlin.K0;
import kotlin.Y;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* renamed from: kotlin.ranges.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2214c extends C2212a implements g<Character>, r<Character> {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    public static final a f52455I = new a(null);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final C2214c f52456J = new C2214c(1, 0);

    /* renamed from: kotlin.ranges.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final C2214c a() {
            return C2214c.f52456J;
        }

        private a() {
        }
    }

    public C2214c(char c4, char c5) {
        super(c4, c5, 1);
    }

    @K0(markerClass = {kotlin.r.class})
    @InterfaceC2205l(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @Y(version = "1.9")
    public static /* synthetic */ void s() {
    }

    @Override // kotlin.ranges.g
    public /* bridge */ /* synthetic */ boolean b(Character ch) {
        return q(ch.charValue());
    }

    @Override // kotlin.ranges.C2212a
    public boolean equals(@l3.e Object obj) {
        if (obj instanceof C2214c) {
            if (!isEmpty() || !((C2214c) obj).isEmpty()) {
                C2214c c2214c = (C2214c) obj;
                if (l() != c2214c.l() || m() != c2214c.m()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.C2212a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (l() * 31) + m();
    }

    @Override // kotlin.ranges.C2212a, kotlin.ranges.g
    public boolean isEmpty() {
        if (F.t(l(), m()) > 0) {
            return true;
        }
        return false;
    }

    public boolean q(char c4) {
        if (F.t(l(), c4) <= 0 && F.t(c4, m()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.r
    @l3.d
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Character j() {
        if (m() != 65535) {
            return Character.valueOf((char) (m() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Character k() {
        return Character.valueOf(m());
    }

    @Override // kotlin.ranges.C2212a
    @l3.d
    public String toString() {
        return l() + ".." + m();
    }

    @Override // kotlin.ranges.g
    @l3.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Character c() {
        return Character.valueOf(l());
    }
}

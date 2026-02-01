package V1;

import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final Y1.a f3758a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3759b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3760c;

    public a(@d Y1.a djSound, boolean z3, int i4) {
        F.p(djSound, "djSound");
        this.f3758a = djSound;
        this.f3759b = z3;
        this.f3760c = i4;
    }

    public static /* synthetic */ a e(a aVar, Y1.a aVar2, boolean z3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar2 = aVar.f3758a;
        }
        if ((i5 & 2) != 0) {
            z3 = aVar.f3759b;
        }
        if ((i5 & 4) != 0) {
            i4 = aVar.f3760c;
        }
        return aVar.d(aVar2, z3, i4);
    }

    @d
    public final Y1.a a() {
        return this.f3758a;
    }

    public final boolean b() {
        return this.f3759b;
    }

    public final int c() {
        return this.f3760c;
    }

    @d
    public final a d(@d Y1.a djSound, boolean z3, int i4) {
        F.p(djSound, "djSound");
        return new a(djSound, z3, i4);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (F.g(this.f3758a, aVar.f3758a) && this.f3759b == aVar.f3759b && this.f3760c == aVar.f3760c) {
            return true;
        }
        return false;
    }

    @d
    public final Y1.a f() {
        return this.f3758a;
    }

    public final int g() {
        return this.f3760c;
    }

    public final boolean h() {
        return this.f3759b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f3758a.hashCode() * 31;
        boolean z3 = this.f3759b;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return ((hashCode + i4) * 31) + Integer.hashCode(this.f3760c);
    }

    @d
    public String toString() {
        return "DjButton(djSound=" + this.f3758a + ", isSelected=" + this.f3759b + ", position=" + this.f3760c + ")";
    }
}

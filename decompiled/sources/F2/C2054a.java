package f2;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import com.harman.sdk.utils.LightPattern;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2054a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final LightPattern f50374a;

    /* renamed from: b, reason: collision with root package name */
    private final int f50375b;

    /* renamed from: c, reason: collision with root package name */
    private final int f50376c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f50377d;

    public C2054a(@d LightPattern patternID, @c0 int i4, @InterfaceC0578v int i5, boolean z3) {
        F.p(patternID, "patternID");
        this.f50374a = patternID;
        this.f50375b = i4;
        this.f50376c = i5;
        this.f50377d = z3;
    }

    public static /* synthetic */ C2054a f(C2054a c2054a, LightPattern lightPattern, int i4, int i5, boolean z3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            lightPattern = c2054a.f50374a;
        }
        if ((i6 & 2) != 0) {
            i4 = c2054a.f50375b;
        }
        if ((i6 & 4) != 0) {
            i5 = c2054a.f50376c;
        }
        if ((i6 & 8) != 0) {
            z3 = c2054a.f50377d;
        }
        return c2054a.e(lightPattern, i4, i5, z3);
    }

    @d
    public final LightPattern a() {
        return this.f50374a;
    }

    public final int b() {
        return this.f50375b;
    }

    public final int c() {
        return this.f50376c;
    }

    public final boolean d() {
        return this.f50377d;
    }

    @d
    public final C2054a e(@d LightPattern patternID, @c0 int i4, @InterfaceC0578v int i5, boolean z3) {
        F.p(patternID, "patternID");
        return new C2054a(patternID, i4, i5, z3);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2054a)) {
            return false;
        }
        C2054a c2054a = (C2054a) obj;
        if (this.f50374a == c2054a.f50374a && this.f50375b == c2054a.f50375b && this.f50376c == c2054a.f50376c && this.f50377d == c2054a.f50377d) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return this.f50377d;
    }

    @d
    public final LightPattern h() {
        return this.f50374a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f50374a.hashCode() * 31) + Integer.hashCode(this.f50375b)) * 31) + Integer.hashCode(this.f50376c)) * 31;
        boolean z3 = this.f50377d;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        return hashCode + i4;
    }

    public final int i() {
        return this.f50376c;
    }

    public final int j() {
        return this.f50375b;
    }

    public final void k(boolean z3) {
        this.f50377d = z3;
    }

    @d
    public String toString() {
        return "LightShowButton(patternID=" + this.f50374a + ", patternName=" + this.f50375b + ", patternImage=" + this.f50376c + ", activeStatus=" + this.f50377d + ")";
    }
}

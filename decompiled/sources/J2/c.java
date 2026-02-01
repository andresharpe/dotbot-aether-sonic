package j2;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f51047a;

    /* renamed from: b, reason: collision with root package name */
    private final int f51048b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f51049c;

    public c() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ c e(c cVar, int i4, int i5, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = cVar.f51047a;
        }
        if ((i6 & 2) != 0) {
            i5 = cVar.f51048b;
        }
        if ((i6 & 4) != 0) {
            str = cVar.f51049c;
        }
        return cVar.d(i4, i5, str);
    }

    public final int a() {
        return this.f51047a;
    }

    public final int b() {
        return this.f51048b;
    }

    @l3.d
    public final String c() {
        return this.f51049c;
    }

    @l3.d
    public final c d(int i4, int i5, @l3.d String quickStartGuideWebUrl) {
        F.p(quickStartGuideWebUrl, "quickStartGuideWebUrl");
        return new c(i4, i5, quickStartGuideWebUrl);
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f51047a == cVar.f51047a && this.f51048b == cVar.f51048b && F.g(this.f51049c, cVar.f51049c)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f51047a;
    }

    @l3.d
    public final String g() {
        return this.f51049c;
    }

    public final int h() {
        return this.f51048b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f51047a) * 31) + Integer.hashCode(this.f51048b)) * 31) + this.f51049c.hashCode();
    }

    @l3.d
    public String toString() {
        return "ProductSource(bigIcon=" + this.f51047a + ", smallIcon=" + this.f51048b + ", quickStartGuideWebUrl=" + this.f51049c + ")";
    }

    public c(int i4, int i5, @l3.d String quickStartGuideWebUrl) {
        F.p(quickStartGuideWebUrl, "quickStartGuideWebUrl");
        this.f51047a = i4;
        this.f51048b = i5;
        this.f51049c = quickStartGuideWebUrl;
    }

    public /* synthetic */ c(int i4, int i5, String str, int i6, C2197u c2197u) {
        this((i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? 0 : i5, (i6 & 4) != 0 ? "" : str);
    }
}

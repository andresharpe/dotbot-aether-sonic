package A2;

import kotlin.jvm.internal.F;
import kotlin.text.s;
import l3.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final String f25a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26b;

    public a(@d String version, int i4) {
        F.p(version, "version");
        this.f25a = version;
        this.f26b = i4;
    }

    public final int a() {
        return this.f26b;
    }

    @d
    public final String b() {
        return this.f25a;
    }

    @d
    public String toString() {
        String p4;
        p4 = s.p("\n            OTADfuInfo{\n            mVer='" + this.f25a + "'\n            mBp=" + this.f26b + "}\n            ");
        return p4;
    }
}

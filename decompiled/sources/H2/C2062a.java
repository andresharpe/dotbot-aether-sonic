package h2;

import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2062a {

    /* renamed from: a, reason: collision with root package name */
    @e
    private final String f50734a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2062a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C2062a c(C2062a c2062a, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = c2062a.f50734a;
        }
        return c2062a.b(str);
    }

    @e
    public final String a() {
        return this.f50734a;
    }

    @d
    public final C2062a b(@e String str) {
        return new C2062a(str);
    }

    @e
    public final String d() {
        return this.f50734a;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2062a) && F.g(this.f50734a, ((C2062a) obj).f50734a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f50734a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @d
    public String toString() {
        return "AssignSpeakerBundle(speakerMacAddress=" + this.f50734a + ")";
    }

    public /* synthetic */ C2062a(String str, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? null : str);
    }

    public C2062a(@e String str) {
        this.f50734a = str;
    }
}

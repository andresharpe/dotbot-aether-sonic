package a2;

import com.harman.sdk.utils.LightElements;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class c extends AbstractC0557b {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final LightElements f3838a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3839b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@d LightElements id, int i4, boolean z3) {
        super(null);
        F.p(id, "id");
        this.f3838a = id;
        this.f3839b = i4;
        this.f3840c = z3;
    }

    public static /* synthetic */ c e(c cVar, LightElements lightElements, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            lightElements = cVar.f3838a;
        }
        if ((i5 & 2) != 0) {
            i4 = cVar.f3839b;
        }
        if ((i5 & 4) != 0) {
            z3 = cVar.f3840c;
        }
        return cVar.d(lightElements, i4, z3);
    }

    @d
    public final LightElements a() {
        return this.f3838a;
    }

    public final int b() {
        return this.f3839b;
    }

    public final boolean c() {
        return this.f3840c;
    }

    @d
    public final c d(@d LightElements id, int i4, boolean z3) {
        F.p(id, "id");
        return new c(id, i4, z3);
    }

    public boolean equals(@e Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f3838a == cVar.f3838a && this.f3839b == cVar.f3839b && this.f3840c == cVar.f3840c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @d
    public final LightElements f() {
        return this.f3838a;
    }

    public final int g() {
        return this.f3839b;
    }

    public final boolean h() {
        return this.f3840c;
    }

    public int hashCode() {
        return (((this.f3838a.hashCode() * 31) + this.f3839b) * 31) + Boolean.hashCode(this.f3840c);
    }

    public final void i(boolean z3) {
        this.f3840c = z3;
    }

    @d
    public String toString() {
        return "ValidStatus(id=" + this.f3838a + ", image=" + this.f3839b + ", isEnabled=" + this.f3840c + ")";
    }
}

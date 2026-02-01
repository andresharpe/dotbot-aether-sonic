package l2;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.V;
import androidx.annotation.c0;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import java.util.Arrays;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2355a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final LightInfo.Pattern f54836a;

    /* renamed from: b, reason: collision with root package name */
    private final int f54837b;

    /* renamed from: c, reason: collision with root package name */
    private final int f54838c;

    /* renamed from: d, reason: collision with root package name */
    private final int f54839d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final int[] f54840e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54841f;

    public C2355a(@d LightInfo.Pattern id, @c0 int i4, @InterfaceC0578v int i5, @V int i6, @d int[] backgroundColor, boolean z3) {
        F.p(id, "id");
        F.p(backgroundColor, "backgroundColor");
        this.f54836a = id;
        this.f54837b = i4;
        this.f54838c = i5;
        this.f54839d = i6;
        this.f54840e = backgroundColor;
        this.f54841f = z3;
    }

    public static /* synthetic */ C2355a h(C2355a c2355a, LightInfo.Pattern pattern, int i4, int i5, int i6, int[] iArr, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            pattern = c2355a.f54836a;
        }
        if ((i7 & 2) != 0) {
            i4 = c2355a.f54837b;
        }
        int i8 = i4;
        if ((i7 & 4) != 0) {
            i5 = c2355a.f54838c;
        }
        int i9 = i5;
        if ((i7 & 8) != 0) {
            i6 = c2355a.f54839d;
        }
        int i10 = i6;
        if ((i7 & 16) != 0) {
            iArr = c2355a.f54840e;
        }
        int[] iArr2 = iArr;
        if ((i7 & 32) != 0) {
            z3 = c2355a.f54841f;
        }
        return c2355a.g(pattern, i8, i9, i10, iArr2, z3);
    }

    @d
    public final LightInfo.Pattern a() {
        return this.f54836a;
    }

    public final int b() {
        return this.f54837b;
    }

    public final int c() {
        return this.f54838c;
    }

    public final int d() {
        return this.f54839d;
    }

    @d
    public final int[] e() {
        return this.f54840e;
    }

    public boolean equals(@e Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!F.g(C2355a.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partylight.lib.dashboard.lightshow.model.LightShowCard");
        C2355a c2355a = (C2355a) obj;
        if (this.f54837b == c2355a.f54837b && this.f54838c == c2355a.f54838c && this.f54839d == c2355a.f54839d && Arrays.equals(this.f54840e, c2355a.f54840e) && this.f54841f == c2355a.f54841f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f54841f;
    }

    @d
    public final C2355a g(@d LightInfo.Pattern id, @c0 int i4, @InterfaceC0578v int i5, @V int i6, @d int[] backgroundColor, boolean z3) {
        F.p(id, "id");
        F.p(backgroundColor, "backgroundColor");
        return new C2355a(id, i4, i5, i6, backgroundColor, z3);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f54837b) * 31) + this.f54838c) * 31) + this.f54839d) * 31) + Arrays.hashCode(this.f54840e)) * 31) + (this.f54841f ? 1 : 0);
    }

    @d
    public final int[] i() {
        return this.f54840e;
    }

    @d
    public final LightInfo.Pattern j() {
        return this.f54836a;
    }

    public final int k() {
        return this.f54839d;
    }

    public final int l() {
        return this.f54838c;
    }

    public final int m() {
        return this.f54837b;
    }

    public final boolean n() {
        return this.f54841f;
    }

    public final void o(boolean z3) {
        this.f54841f = z3;
    }

    @d
    public String toString() {
        return "LightShowCard(id=" + this.f54836a + ", patternName=" + this.f54837b + ", patternImage=" + this.f54838c + ", patternAnimation=" + this.f54839d + ", backgroundColor=" + Arrays.toString(this.f54840e) + ", isSelected=" + this.f54841f + ")";
    }

    public /* synthetic */ C2355a(LightInfo.Pattern pattern, int i4, int i5, int i6, int[] iArr, boolean z3, int i7, C2197u c2197u) {
        this(pattern, i4, i5, i6, iArr, (i7 & 32) != 0 ? false : z3);
    }
}

package c2;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.V;
import androidx.annotation.c0;
import com.harman.sdk.utils.LightPattern;
import java.util.Arrays;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1008a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final LightPattern f21162a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21163b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21164c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21165d;

    /* renamed from: e, reason: collision with root package name */
    @d
    private final int[] f21166e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f21167f;

    public C1008a(@d LightPattern id, @c0 int i4, @InterfaceC0578v int i5, @V int i6, @d int[] backgroundColor, boolean z3) {
        F.p(id, "id");
        F.p(backgroundColor, "backgroundColor");
        this.f21162a = id;
        this.f21163b = i4;
        this.f21164c = i5;
        this.f21165d = i6;
        this.f21166e = backgroundColor;
        this.f21167f = z3;
    }

    public static /* synthetic */ C1008a h(C1008a c1008a, LightPattern lightPattern, int i4, int i5, int i6, int[] iArr, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            lightPattern = c1008a.f21162a;
        }
        if ((i7 & 2) != 0) {
            i4 = c1008a.f21163b;
        }
        int i8 = i4;
        if ((i7 & 4) != 0) {
            i5 = c1008a.f21164c;
        }
        int i9 = i5;
        if ((i7 & 8) != 0) {
            i6 = c1008a.f21165d;
        }
        int i10 = i6;
        if ((i7 & 16) != 0) {
            iArr = c1008a.f21166e;
        }
        int[] iArr2 = iArr;
        if ((i7 & 32) != 0) {
            z3 = c1008a.f21167f;
        }
        return c1008a.g(lightPattern, i8, i9, i10, iArr2, z3);
    }

    @d
    public final LightPattern a() {
        return this.f21162a;
    }

    public final int b() {
        return this.f21163b;
    }

    public final int c() {
        return this.f21164c;
    }

    public final int d() {
        return this.f21165d;
    }

    @d
    public final int[] e() {
        return this.f21166e;
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
        if (!F.g(C1008a.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.lightshow.model.LightShowCard");
        C1008a c1008a = (C1008a) obj;
        if (this.f21163b == c1008a.f21163b && this.f21164c == c1008a.f21164c && this.f21165d == c1008a.f21165d && Arrays.equals(this.f21166e, c1008a.f21166e) && this.f21167f == c1008a.f21167f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f21167f;
    }

    @d
    public final C1008a g(@d LightPattern id, @c0 int i4, @InterfaceC0578v int i5, @V int i6, @d int[] backgroundColor, boolean z3) {
        F.p(id, "id");
        F.p(backgroundColor, "backgroundColor");
        return new C1008a(id, i4, i5, i6, backgroundColor, z3);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f21163b) * 31) + this.f21164c) * 31) + this.f21165d) * 31) + Arrays.hashCode(this.f21166e)) * 31) + (this.f21167f ? 1 : 0);
    }

    @d
    public final int[] i() {
        return this.f21166e;
    }

    @d
    public final LightPattern j() {
        return this.f21162a;
    }

    public final int k() {
        return this.f21165d;
    }

    public final int l() {
        return this.f21164c;
    }

    public final int m() {
        return this.f21163b;
    }

    public final boolean n() {
        return this.f21167f;
    }

    @d
    public String toString() {
        return "LightShowCard(id=" + this.f21162a + ", patternName=" + this.f21163b + ", patternImage=" + this.f21164c + ", patternAnimation=" + this.f21165d + ", backgroundColor=" + Arrays.toString(this.f21166e) + ", isSelected=" + this.f21167f + ")";
    }

    public /* synthetic */ C1008a(LightPattern lightPattern, int i4, int i5, int i6, int[] iArr, boolean z3, int i7, C2197u c2197u) {
        this(lightPattern, i4, i5, i6, iArr, (i7 & 32) != 0 ? false : z3);
    }
}

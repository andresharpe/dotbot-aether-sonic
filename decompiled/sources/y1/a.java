package Y1;

import androidx.annotation.InterfaceC0578v;
import androidx.annotation.c0;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import java.util.Arrays;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    private final DjEffectToneId f3819a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3820b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3821c;

    /* renamed from: d, reason: collision with root package name */
    @d
    private final int[] f3822d;

    public a(@d DjEffectToneId toneId, @c0 int i4, @InterfaceC0578v int i5, @d int[] backgroundColor) {
        F.p(toneId, "toneId");
        F.p(backgroundColor, "backgroundColor");
        this.f3819a = toneId;
        this.f3820b = i4;
        this.f3821c = i5;
        this.f3822d = backgroundColor;
    }

    public static /* synthetic */ a f(a aVar, DjEffectToneId djEffectToneId, int i4, int i5, int[] iArr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            djEffectToneId = aVar.f3819a;
        }
        if ((i6 & 2) != 0) {
            i4 = aVar.f3820b;
        }
        if ((i6 & 4) != 0) {
            i5 = aVar.f3821c;
        }
        if ((i6 & 8) != 0) {
            iArr = aVar.f3822d;
        }
        return aVar.e(djEffectToneId, i4, i5, iArr);
    }

    @d
    public final DjEffectToneId a() {
        return this.f3819a;
    }

    public final int b() {
        return this.f3820b;
    }

    public final int c() {
        return this.f3821c;
    }

    @d
    public final int[] d() {
        return this.f3822d;
    }

    @d
    public final a e(@d DjEffectToneId toneId, @c0 int i4, @InterfaceC0578v int i5, @d int[] backgroundColor) {
        F.p(toneId, "toneId");
        F.p(backgroundColor, "backgroundColor");
        return new a(toneId, i4, i5, backgroundColor);
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
        if (!F.g(a.class, cls)) {
            return false;
        }
        F.n(obj, "null cannot be cast to non-null type com.harman.jbl.partybox.ui.djeffects.model.DjSound");
        a aVar = (a) obj;
        if (this.f3819a == aVar.f3819a && this.f3820b == aVar.f3820b && this.f3821c == aVar.f3821c && Arrays.equals(this.f3822d, aVar.f3822d)) {
            return true;
        }
        return false;
    }

    @d
    public final int[] g() {
        return this.f3822d;
    }

    public final int h() {
        return this.f3821c;
    }

    public int hashCode() {
        return (((((this.f3819a.g() * 31) + this.f3820b) * 31) + this.f3821c) * 31) + Arrays.hashCode(this.f3822d);
    }

    public final int i() {
        return this.f3820b;
    }

    @d
    public final DjEffectToneId j() {
        return this.f3819a;
    }

    @d
    public String toString() {
        return "DjSound(toneId=" + this.f3819a + ", name=" + this.f3820b + ", image=" + this.f3821c + ", backgroundColor=" + Arrays.toString(this.f3822d) + ")";
    }
}

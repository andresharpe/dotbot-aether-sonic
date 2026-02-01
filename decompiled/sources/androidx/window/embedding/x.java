package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@androidx.window.core.d
/* loaded from: classes.dex */
public class x extends m {

    /* renamed from: a, reason: collision with root package name */
    private final int f20811a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20812b;

    /* renamed from: c, reason: collision with root package name */
    private final float f20813c;

    /* renamed from: d, reason: collision with root package name */
    private final int f20814d;

    @W(30)
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l3.d
        public static final a f20815a = new a();

        private a() {
        }

        @InterfaceC0577u
        @l3.d
        public final Rect a(@l3.d WindowMetrics windowMetrics) {
            F.p(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            F.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    @P2.c(AnnotationRetention.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public x() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean a(@l3.d WindowMetrics parentMetrics) {
        boolean z3;
        boolean z4;
        F.p(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect a4 = a.f20815a.a(parentMetrics);
        if (this.f20811a != 0 && a4.width() < this.f20811a) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f20812b != 0 && Math.min(a4.width(), a4.height()) < this.f20812b) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }

    public final int b() {
        return this.f20814d;
    }

    public final int c() {
        return this.f20812b;
    }

    public final int d() {
        return this.f20811a;
    }

    public final float e() {
        return this.f20813c;
    }

    public boolean equals(@l3.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f20811a == xVar.f20811a && this.f20812b == xVar.f20812b && this.f20813c == xVar.f20813c && this.f20814d == xVar.f20814d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f20811a * 31) + this.f20812b) * 31) + Float.hashCode(this.f20813c)) * 31) + this.f20814d;
    }

    public /* synthetic */ x(int i4, int i5, float f4, int i6, int i7, C2197u c2197u) {
        this((i7 & 1) != 0 ? 0 : i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? 0.5f : f4, (i7 & 8) != 0 ? 3 : i6);
    }

    public x(int i4, int i5, float f4, int i6) {
        this.f20811a = i4;
        this.f20812b = i5;
        this.f20813c = f4;
        this.f20814d = i6;
    }
}

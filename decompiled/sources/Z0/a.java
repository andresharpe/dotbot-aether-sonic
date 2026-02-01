package Z0;

import T0.a;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.core.graphics.C0734z;
import com.google.android.material.color.s;
import com.google.android.material.internal.E;
import com.google.android.material.resources.b;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final float f3823f = 4.5f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f3824g = 2.0f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f3825h = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3826a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3827b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3828c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3829d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3830e;

    public a(@N Context context) {
        this(b.b(context, a.c.s5, false), s.b(context, a.c.r5, 0), s.b(context, a.c.q5, 0), s.b(context, a.c.f1979o3, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean m(@InterfaceC0569l int i4) {
        if (C0734z.B(i4, 255) == this.f3829d) {
            return true;
        }
        return false;
    }

    public int a(float f4) {
        return Math.round(b(f4) * 255.0f);
    }

    public float b(float f4) {
        if (this.f3830e <= 0.0f || f4 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f4 / r0)) * f3823f) + 2.0f) / 100.0f, 1.0f);
    }

    @InterfaceC0569l
    public int c(@InterfaceC0569l int i4, float f4) {
        int i5;
        float b4 = b(f4);
        int alpha = Color.alpha(i4);
        int m4 = s.m(C0734z.B(i4, 255), this.f3827b, b4);
        if (b4 > 0.0f && (i5 = this.f3828c) != 0) {
            m4 = s.l(m4, C0734z.B(i5, f3825h));
        }
        return C0734z.B(m4, alpha);
    }

    @InterfaceC0569l
    public int d(@InterfaceC0569l int i4, float f4, @N View view) {
        return c(i4, f4 + i(view));
    }

    @InterfaceC0569l
    public int e(@InterfaceC0569l int i4, float f4) {
        if (this.f3826a && m(i4)) {
            return c(i4, f4);
        }
        return i4;
    }

    @InterfaceC0569l
    public int f(@InterfaceC0569l int i4, float f4, @N View view) {
        return e(i4, f4 + i(view));
    }

    @InterfaceC0569l
    public int g(float f4) {
        return e(this.f3829d, f4);
    }

    @InterfaceC0569l
    public int h(float f4, @N View view) {
        return g(f4 + i(view));
    }

    public float i(@N View view) {
        return E.j(view);
    }

    @InterfaceC0569l
    public int j() {
        return this.f3827b;
    }

    @InterfaceC0569l
    public int k() {
        return this.f3829d;
    }

    public boolean l() {
        return this.f3826a;
    }

    public a(boolean z3, @InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0569l int i6, float f4) {
        this.f3826a = z3;
        this.f3827b = i4;
        this.f3828c = i5;
        this.f3829d = i6;
        this.f3830e = f4;
    }
}

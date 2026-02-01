package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class r extends RecyclerView.B {

    /* renamed from: q, reason: collision with root package name */
    private static final boolean f18297q = false;

    /* renamed from: r, reason: collision with root package name */
    private static final float f18298r = 25.0f;

    /* renamed from: s, reason: collision with root package name */
    private static final int f18299s = 10000;

    /* renamed from: t, reason: collision with root package name */
    public static final int f18300t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f18301u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f18302v = 0;

    /* renamed from: w, reason: collision with root package name */
    private static final float f18303w = 1.2f;

    /* renamed from: k, reason: collision with root package name */
    protected PointF f18306k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f18307l;

    /* renamed from: n, reason: collision with root package name */
    private float f18309n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f18304i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f18305j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f18308m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f18310o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f18311p = 0;

    public r(Context context) {
        this.f18307l = context.getResources().getDisplayMetrics();
    }

    private float B() {
        if (!this.f18308m) {
            this.f18309n = w(this.f18307l);
            this.f18308m = true;
        }
        return this.f18309n;
    }

    private int z(int i4, int i5) {
        int i6 = i4 - i5;
        if (i4 * i6 <= 0) {
            return 0;
        }
        return i6;
    }

    protected int A() {
        PointF pointF = this.f18306k;
        if (pointF != null) {
            float f4 = pointF.x;
            if (f4 != 0.0f) {
                if (f4 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    protected int C() {
        PointF pointF = this.f18306k;
        if (pointF != null) {
            float f4 = pointF.y;
            if (f4 != 0.0f) {
                if (f4 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    protected void D(RecyclerView.B.a aVar) {
        PointF a4 = a(f());
        if (a4 != null && (a4.x != 0.0f || a4.y != 0.0f)) {
            j(a4);
            this.f18306k = a4;
            this.f18310o = (int) (a4.x * 10000.0f);
            this.f18311p = (int) (a4.y * 10000.0f);
            aVar.l((int) (this.f18310o * f18303w), (int) (this.f18311p * f18303w), (int) (y(10000) * f18303w), this.f18304i);
            return;
        }
        aVar.f(f());
        s();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void m(int i4, int i5, RecyclerView.C c4, RecyclerView.B.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.f18310o = z(this.f18310o, i4);
        int z3 = z(this.f18311p, i5);
        this.f18311p = z3;
        if (this.f18310o == 0 && z3 == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void o() {
        this.f18311p = 0;
        this.f18310o = 0;
        this.f18306k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.B
    protected void p(View view, RecyclerView.C c4, RecyclerView.B.a aVar) {
        int u3 = u(view, A());
        int v3 = v(view, C());
        int x3 = x((int) Math.sqrt((u3 * u3) + (v3 * v3)));
        if (x3 > 0) {
            aVar.l(-u3, -v3, x3, this.f18305j);
        }
    }

    public int t(int i4, int i5, int i6, int i7, int i8) {
        if (i8 != -1) {
            if (i8 != 0) {
                if (i8 == 1) {
                    return i7 - i5;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i9 = i6 - i4;
            if (i9 > 0) {
                return i9;
            }
            int i10 = i7 - i5;
            if (i10 < 0) {
                return i10;
            }
            return 0;
        }
        return i6 - i4;
    }

    public int u(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 != null && e4.n()) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return t(e4.Y(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e4.b0(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e4.o0(), e4.z0() - e4.p0(), i4);
        }
        return 0;
    }

    public int v(View view, int i4) {
        RecyclerView.o e4 = e();
        if (e4 != null && e4.o()) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return t(e4.c0(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e4.W(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e4.r0(), e4.e0() - e4.m0(), i4);
        }
        return 0;
    }

    protected float w(DisplayMetrics displayMetrics) {
        return f18298r / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int x(int i4) {
        return (int) Math.ceil(y(i4) / 0.3356d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int y(int i4) {
        return (int) Math.ceil(Math.abs(i4) * B());
    }
}

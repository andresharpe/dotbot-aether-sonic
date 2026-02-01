package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0574q;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.V;
import androidx.core.graphics.C0734z;
import d.C2042a;
import e.C2046a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599l {

    /* renamed from: b, reason: collision with root package name */
    private static final String f6253b = "AppCompatDrawableManag";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f6254c = false;

    /* renamed from: d, reason: collision with root package name */
    private static final PorterDuff.Mode f6255d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e, reason: collision with root package name */
    private static C0599l f6256e;

    /* renamed from: a, reason: collision with root package name */
    private V f6257a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.l$a */
    /* loaded from: classes.dex */
    public class a implements V.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f6258a = {C2042a.f.f49587y0, C2042a.f.f49583w0, C2042a.f.f49538a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f6259b = {C2042a.f.f49586y, C2042a.f.f49553h0, C2042a.f.f49511F, C2042a.f.f49501A, C2042a.f.f49503B, C2042a.f.f49509E, C2042a.f.f49507D};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f6260c = {C2042a.f.f49581v0, C2042a.f.f49585x0, C2042a.f.f49572r, C2042a.f.f49573r0, C2042a.f.f49575s0, C2042a.f.f49577t0, C2042a.f.f49579u0};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f6261d = {C2042a.f.f49535X, C2042a.f.f49568p, C2042a.f.f49534W};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f6262e = {C2042a.f.f49569p0, C2042a.f.f49589z0};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f6263f = {C2042a.f.f49544d, C2042a.f.f49556j, C2042a.f.f49546e, C2042a.f.f49558k};

        a() {
        }

        private boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(@androidx.annotation.N Context context) {
            return h(context, 0);
        }

        private ColorStateList h(@androidx.annotation.N Context context, @InterfaceC0569l int i4) {
            int d4 = b0.d(context, C2042a.b.f49116G0);
            return new ColorStateList(new int[][]{b0.f6101c, b0.f6104f, b0.f6102d, b0.f6108j}, new int[]{b0.c(context, C2042a.b.f49108E0), C0734z.t(d4, i4), C0734z.t(d4, i4), i4});
        }

        private ColorStateList i(@androidx.annotation.N Context context) {
            return h(context, b0.d(context, C2042a.b.f49100C0));
        }

        private ColorStateList j(@androidx.annotation.N Context context) {
            return h(context, b0.d(context, C2042a.b.f49108E0));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList f4 = b0.f(context, C2042a.b.f49136L0);
            if (f4 != null && f4.isStateful()) {
                int[] iArr3 = b0.f6101c;
                iArr[0] = iArr3;
                iArr2[0] = f4.getColorForState(iArr3, 0);
                iArr[1] = b0.f6105g;
                iArr2[1] = b0.d(context, C2042a.b.f49112F0);
                iArr[2] = b0.f6108j;
                iArr2[2] = f4.getDefaultColor();
            } else {
                iArr[0] = b0.f6101c;
                iArr2[0] = b0.c(context, C2042a.b.f49136L0);
                iArr[1] = b0.f6105g;
                iArr2[1] = b0.d(context, C2042a.b.f49112F0);
                iArr[2] = b0.f6108j;
                iArr2[2] = b0.d(context, C2042a.b.f49136L0);
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(@androidx.annotation.N V v3, @androidx.annotation.N Context context, @InterfaceC0574q int i4) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
            Drawable j4 = v3.j(context, C2042a.f.f49561l0);
            Drawable j5 = v3.j(context, C2042a.f.f49563m0);
            if ((j4 instanceof BitmapDrawable) && j4.getIntrinsicWidth() == dimensionPixelSize && j4.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j4;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j4.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j5 instanceof BitmapDrawable) && j5.getIntrinsicWidth() == dimensionPixelSize && j5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j5;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j5.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (L.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0599l.f6255d;
            }
            drawable.setColorFilter(C0599l.e(i4, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
        @Override // androidx.appcompat.widget.V.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(@androidx.annotation.N android.content.Context r8, int r9, @androidx.annotation.N android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0599l.a()
                int[] r1 = r7.f6258a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = d.C2042a.b.f49120H0
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f6260c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = d.C2042a.b.f49112F0
                goto L11
            L20:
                int[] r1 = r7.f6261d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = d.C2042a.f.f49523L
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = d.C2042a.f.f49576t
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.L.a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.b0.d(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0599l.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0599l.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.V.f
        public PorterDuff.Mode b(int i4) {
            if (i4 == C2042a.f.f49565n0) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.V.f
        public Drawable c(@androidx.annotation.N V v3, @androidx.annotation.N Context context, int i4) {
            if (i4 == C2042a.f.f49570q) {
                return new LayerDrawable(new Drawable[]{v3.j(context, C2042a.f.f49568p), v3.j(context, C2042a.f.f49572r)});
            }
            if (i4 == C2042a.f.f49537Z) {
                return l(v3, context, C2042a.e.f49464h0);
            }
            if (i4 == C2042a.f.f49536Y) {
                return l(v3, context, C2042a.e.f49466i0);
            }
            if (i4 == C2042a.f.f49539a0) {
                return l(v3, context, C2042a.e.f49468j0);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.V.f
        public ColorStateList d(@androidx.annotation.N Context context, int i4) {
            if (i4 == C2042a.f.f49578u) {
                return C2046a.a(context, C2042a.d.f49393v);
            }
            if (i4 == C2042a.f.f49567o0) {
                return C2046a.a(context, C2042a.d.f49399y);
            }
            if (i4 == C2042a.f.f49565n0) {
                return k(context);
            }
            if (i4 == C2042a.f.f49554i) {
                return j(context);
            }
            if (i4 == C2042a.f.f49542c) {
                return g(context);
            }
            if (i4 == C2042a.f.f49552h) {
                return i(context);
            }
            if (i4 != C2042a.f.f49557j0 && i4 != C2042a.f.f49559k0) {
                if (f(this.f6259b, i4)) {
                    return b0.f(context, C2042a.b.f49120H0);
                }
                if (f(this.f6262e, i4)) {
                    return C2046a.a(context, C2042a.d.f49391u);
                }
                if (f(this.f6263f, i4)) {
                    return C2046a.a(context, C2042a.d.f49389t);
                }
                if (i4 == C2042a.f.f49551g0) {
                    return C2046a.a(context, C2042a.d.f49395w);
                }
                return null;
            }
            return C2046a.a(context, C2042a.d.f49397x);
        }

        @Override // androidx.appcompat.widget.V.f
        public boolean e(@androidx.annotation.N Context context, int i4, @androidx.annotation.N Drawable drawable) {
            if (i4 == C2042a.f.f49555i0) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), b0.d(context, C2042a.b.f49120H0), C0599l.f6255d);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), b0.d(context, C2042a.b.f49120H0), C0599l.f6255d);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), b0.d(context, C2042a.b.f49112F0), C0599l.f6255d);
                return true;
            }
            if (i4 != C2042a.f.f49537Z && i4 != C2042a.f.f49536Y && i4 != C2042a.f.f49539a0) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), b0.c(context, C2042a.b.f49120H0), C0599l.f6255d);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), b0.d(context, C2042a.b.f49112F0), C0599l.f6255d);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), b0.d(context, C2042a.b.f49112F0), C0599l.f6255d);
            return true;
        }
    }

    public static synchronized C0599l b() {
        C0599l c0599l;
        synchronized (C0599l.class) {
            try {
                if (f6256e == null) {
                    i();
                }
                c0599l = f6256e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0599l;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter l4;
        synchronized (C0599l.class) {
            l4 = V.l(i4, mode);
        }
        return l4;
    }

    public static synchronized void i() {
        synchronized (C0599l.class) {
            if (f6256e == null) {
                C0599l c0599l = new C0599l();
                f6256e = c0599l;
                c0599l.f6257a = V.h();
                f6256e.f6257a.u(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(Drawable drawable, e0 e0Var, int[] iArr) {
        V.w(drawable, e0Var, iArr);
    }

    public synchronized Drawable c(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        return this.f6257a.j(context, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable d(@androidx.annotation.N Context context, @InterfaceC0578v int i4, boolean z3) {
        return this.f6257a.k(context, i4, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList f(@androidx.annotation.N Context context, @InterfaceC0578v int i4) {
        return this.f6257a.m(context, i4);
    }

    public synchronized void g(@androidx.annotation.N Context context) {
        this.f6257a.s(context);
    }

    synchronized Drawable h(@androidx.annotation.N Context context, @androidx.annotation.N p0 p0Var, @InterfaceC0578v int i4) {
        return this.f6257a.t(context, p0Var, i4);
    }

    boolean k(@androidx.annotation.N Context context, @InterfaceC0578v int i4, @androidx.annotation.N Drawable drawable) {
        return this.f6257a.x(context, i4, drawable);
    }
}

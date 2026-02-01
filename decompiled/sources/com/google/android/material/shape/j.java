package com.google.android.material.shape;

import T0.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class j extends Drawable implements androidx.core.graphics.drawable.k, s {

    /* renamed from: b0, reason: collision with root package name */
    private static final String f33103b0 = "j";

    /* renamed from: c0, reason: collision with root package name */
    private static final float f33104c0 = 0.75f;

    /* renamed from: d0, reason: collision with root package name */
    private static final float f33105d0 = 0.25f;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f33106e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public static final int f33107f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public static final int f33108g0 = 2;

    /* renamed from: h0, reason: collision with root package name */
    private static final Paint f33109h0;

    /* renamed from: E, reason: collision with root package name */
    private d f33110E;

    /* renamed from: F, reason: collision with root package name */
    private final q.i[] f33111F;

    /* renamed from: G, reason: collision with root package name */
    private final q.i[] f33112G;

    /* renamed from: H, reason: collision with root package name */
    private final BitSet f33113H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f33114I;

    /* renamed from: J, reason: collision with root package name */
    private final Matrix f33115J;

    /* renamed from: K, reason: collision with root package name */
    private final Path f33116K;

    /* renamed from: L, reason: collision with root package name */
    private final Path f33117L;

    /* renamed from: M, reason: collision with root package name */
    private final RectF f33118M;

    /* renamed from: N, reason: collision with root package name */
    private final RectF f33119N;

    /* renamed from: O, reason: collision with root package name */
    private final Region f33120O;

    /* renamed from: P, reason: collision with root package name */
    private final Region f33121P;

    /* renamed from: Q, reason: collision with root package name */
    private o f33122Q;

    /* renamed from: R, reason: collision with root package name */
    private final Paint f33123R;

    /* renamed from: S, reason: collision with root package name */
    private final Paint f33124S;

    /* renamed from: T, reason: collision with root package name */
    private final com.google.android.material.shadow.b f33125T;

    /* renamed from: U, reason: collision with root package name */
    @N
    private final p.b f33126U;

    /* renamed from: V, reason: collision with root package name */
    private final p f33127V;

    /* renamed from: W, reason: collision with root package name */
    @P
    private PorterDuffColorFilter f33128W;

    /* renamed from: X, reason: collision with root package name */
    @P
    private PorterDuffColorFilter f33129X;

    /* renamed from: Y, reason: collision with root package name */
    private int f33130Y;

    /* renamed from: Z, reason: collision with root package name */
    @N
    private final RectF f33131Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f33132a0;

    /* loaded from: classes2.dex */
    class a implements p.b {
        a() {
        }

        @Override // com.google.android.material.shape.p.b
        public void a(@N q qVar, Matrix matrix, int i4) {
            j.this.f33113H.set(i4, qVar.e());
            j.this.f33111F[i4] = qVar.f(matrix);
        }

        @Override // com.google.android.material.shape.p.b
        public void b(@N q qVar, Matrix matrix, int i4) {
            j.this.f33113H.set(i4 + 4, qVar.e());
            j.this.f33112G[i4] = qVar.f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f33134a;

        b(float f4) {
            this.f33134a = f4;
        }

        @Override // com.google.android.material.shape.o.c
        @N
        public com.google.android.material.shape.d a(@N com.google.android.material.shape.d dVar) {
            if (!(dVar instanceof m)) {
                return new com.google.android.material.shape.b(this.f33134a, dVar);
            }
            return dVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    static {
        Paint paint = new Paint(1);
        f33109h0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ j(d dVar, a aVar) {
        this(dVar);
    }

    private boolean M0(int[] iArr) {
        boolean z3;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f33110E.f33139d != null && color2 != (colorForState2 = this.f33110E.f33139d.getColorForState(iArr, (color2 = this.f33123R.getColor())))) {
            this.f33123R.setColor(colorForState2);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f33110E.f33140e != null && color != (colorForState = this.f33110E.f33140e.getColorForState(iArr, (color = this.f33124S.getColor())))) {
            this.f33124S.setColor(colorForState);
            return true;
        }
        return z3;
    }

    private boolean N0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f33128W;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f33129X;
        d dVar = this.f33110E;
        this.f33128W = k(dVar.f33142g, dVar.f33143h, this.f33123R, true);
        d dVar2 = this.f33110E;
        this.f33129X = k(dVar2.f33141f, dVar2.f33143h, this.f33124S, false);
        d dVar3 = this.f33110E;
        if (dVar3.f33156u) {
            this.f33125T.d(dVar3.f33142g.getColorForState(getState(), 0));
        }
        if (!androidx.core.util.p.a(porterDuffColorFilter, this.f33128W) || !androidx.core.util.p.a(porterDuffColorFilter2, this.f33129X)) {
            return true;
        }
        return false;
    }

    private float O() {
        if (Y()) {
            return this.f33124S.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void O0() {
        float V3 = V();
        this.f33110E.f33153r = (int) Math.ceil(0.75f * V3);
        this.f33110E.f33154s = (int) Math.ceil(V3 * f33105d0);
        N0();
        a0();
    }

    private boolean W() {
        d dVar = this.f33110E;
        int i4 = dVar.f33152q;
        if (i4 != 1 && dVar.f33153r > 0 && (i4 == 2 || j0())) {
            return true;
        }
        return false;
    }

    private boolean X() {
        Paint.Style style = this.f33110E.f33157v;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    private boolean Y() {
        Paint.Style style = this.f33110E.f33157v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f33124S.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    private void a0() {
        super.invalidateSelf();
    }

    @P
    private PorterDuffColorFilter f(@N Paint paint, boolean z3) {
        if (z3) {
            int color = paint.getColor();
            int l4 = l(color);
            this.f33130Y = l4;
            if (l4 != color) {
                return new PorterDuffColorFilter(l4, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    private void g(@N RectF rectF, @N Path path) {
        h(rectF, path);
        if (this.f33110E.f33145j != 1.0f) {
            this.f33115J.reset();
            Matrix matrix = this.f33115J;
            float f4 = this.f33110E.f33145j;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f33115J);
        }
        path.computeBounds(this.f33131Z, true);
    }

    private void g0(@N Canvas canvas) {
        if (!W()) {
            return;
        }
        canvas.save();
        i0(canvas);
        if (!this.f33132a0) {
            o(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f33131Z.width() - getBounds().width());
        int height = (int) (this.f33131Z.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f33131Z.width()) + (this.f33110E.f33153r * 2) + width, ((int) this.f33131Z.height()) + (this.f33110E.f33153r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f4 = (getBounds().left - this.f33110E.f33153r) - width;
            float f5 = (getBounds().top - this.f33110E.f33153r) - height;
            canvas2.translate(-f4, -f5);
            o(canvas2);
            canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private static int h0(int i4, int i5) {
        return (i4 * (i5 + (i5 >>> 7))) >>> 8;
    }

    private void i() {
        o y3 = getShapeAppearanceModel().y(new b(-O()));
        this.f33122Q = y3;
        this.f33127V.d(y3, this.f33110E.f33146k, w(), this.f33117L);
    }

    private void i0(@N Canvas canvas) {
        canvas.translate(I(), J());
    }

    @N
    private PorterDuffColorFilter j(@N ColorStateList colorStateList, @N PorterDuff.Mode mode, boolean z3) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z3) {
            colorForState = l(colorForState);
        }
        this.f33130Y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @N
    private PorterDuffColorFilter k(@P ColorStateList colorStateList, @P PorterDuff.Mode mode, @N Paint paint, boolean z3) {
        if (colorStateList != null && mode != null) {
            return j(colorStateList, mode, z3);
        }
        return f(paint, z3);
    }

    @N
    public static j m(Context context) {
        return n(context, 0.0f);
    }

    @N
    public static j n(Context context, float f4) {
        int c4 = com.google.android.material.color.s.c(context, a.c.f1979o3, j.class.getSimpleName());
        j jVar = new j();
        jVar.Z(context);
        jVar.o0(ColorStateList.valueOf(c4));
        jVar.n0(f4);
        return jVar;
    }

    private void o(@N Canvas canvas) {
        if (this.f33113H.cardinality() > 0) {
            Log.w(f33103b0, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f33110E.f33154s != 0) {
            canvas.drawPath(this.f33116K, this.f33125T.c());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.f33111F[i4].b(this.f33125T, this.f33110E.f33153r, canvas);
            this.f33112G[i4].b(this.f33125T, this.f33110E.f33153r, canvas);
        }
        if (this.f33132a0) {
            int I3 = I();
            int J3 = J();
            canvas.translate(-I3, -J3);
            canvas.drawPath(this.f33116K, f33109h0);
            canvas.translate(I3, J3);
        }
    }

    private void p(@N Canvas canvas) {
        r(canvas, this.f33123R, this.f33116K, this.f33110E.f33136a, v());
    }

    private void r(@N Canvas canvas, @N Paint paint, @N Path path, @N o oVar, @N RectF rectF) {
        if (oVar.u(rectF)) {
            float a4 = oVar.t().a(rectF) * this.f33110E.f33146k;
            canvas.drawRoundRect(rectF, a4, a4, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    @N
    private RectF w() {
        this.f33119N.set(v());
        float O3 = O();
        this.f33119N.inset(O3, O3);
        return this.f33119N;
    }

    public Paint.Style A() {
        return this.f33110E.f33157v;
    }

    @Deprecated
    public void A0(int i4) {
        this.f33110E.f33153r = i4;
    }

    public float B() {
        return this.f33110E.f33149n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void B0(int i4) {
        d dVar = this.f33110E;
        if (dVar.f33154s != i4) {
            dVar.f33154s = i4;
            a0();
        }
    }

    @Deprecated
    public void C(int i4, int i5, @N Path path) {
        h(new RectF(0.0f, 0.0f, i4, i5), path);
    }

    @Deprecated
    public void C0(@N r rVar) {
        setShapeAppearanceModel(rVar);
    }

    @InterfaceC0569l
    public int D() {
        return this.f33130Y;
    }

    public void D0(float f4, @InterfaceC0569l int i4) {
        I0(f4);
        F0(ColorStateList.valueOf(i4));
    }

    public float E() {
        return this.f33110E.f33145j;
    }

    public void E0(float f4, @P ColorStateList colorStateList) {
        I0(f4);
        F0(colorStateList);
    }

    public int F() {
        return this.f33110E.f33155t;
    }

    public void F0(@P ColorStateList colorStateList) {
        d dVar = this.f33110E;
        if (dVar.f33140e != colorStateList) {
            dVar.f33140e = colorStateList;
            onStateChange(getState());
        }
    }

    public int G() {
        return this.f33110E.f33152q;
    }

    public void G0(@InterfaceC0569l int i4) {
        H0(ColorStateList.valueOf(i4));
    }

    @Deprecated
    public int H() {
        return (int) x();
    }

    public void H0(ColorStateList colorStateList) {
        this.f33110E.f33141f = colorStateList;
        N0();
        a0();
    }

    public int I() {
        d dVar = this.f33110E;
        return (int) (dVar.f33154s * Math.sin(Math.toRadians(dVar.f33155t)));
    }

    public void I0(float f4) {
        this.f33110E.f33147l = f4;
        invalidateSelf();
    }

    public int J() {
        d dVar = this.f33110E;
        return (int) (dVar.f33154s * Math.cos(Math.toRadians(dVar.f33155t)));
    }

    public void J0(float f4) {
        d dVar = this.f33110E;
        if (dVar.f33151p != f4) {
            dVar.f33151p = f4;
            O0();
        }
    }

    public int K() {
        return this.f33110E.f33153r;
    }

    public void K0(boolean z3) {
        d dVar = this.f33110E;
        if (dVar.f33156u != z3) {
            dVar.f33156u = z3;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int L() {
        return this.f33110E.f33154s;
    }

    public void L0(float f4) {
        J0(f4 - x());
    }

    @P
    @Deprecated
    public r M() {
        o shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof r) {
            return (r) shapeAppearanceModel;
        }
        return null;
    }

    @P
    public ColorStateList N() {
        return this.f33110E.f33140e;
    }

    @P
    public ColorStateList P() {
        return this.f33110E.f33141f;
    }

    public float Q() {
        return this.f33110E.f33147l;
    }

    @P
    public ColorStateList R() {
        return this.f33110E.f33142g;
    }

    public float S() {
        return this.f33110E.f33136a.r().a(v());
    }

    public float T() {
        return this.f33110E.f33136a.t().a(v());
    }

    public float U() {
        return this.f33110E.f33151p;
    }

    public float V() {
        return x() + U();
    }

    public void Z(Context context) {
        this.f33110E.f33137b = new Z0.a(context);
        O0();
    }

    public boolean b0() {
        Z0.a aVar = this.f33110E.f33137b;
        if (aVar != null && aVar.l()) {
            return true;
        }
        return false;
    }

    public boolean c0() {
        if (this.f33110E.f33137b != null) {
            return true;
        }
        return false;
    }

    public boolean d0(int i4, int i5) {
        return getTransparentRegion().contains(i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        this.f33123R.setColorFilter(this.f33128W);
        int alpha = this.f33123R.getAlpha();
        this.f33123R.setAlpha(h0(alpha, this.f33110E.f33148m));
        this.f33124S.setColorFilter(this.f33129X);
        this.f33124S.setStrokeWidth(this.f33110E.f33147l);
        int alpha2 = this.f33124S.getAlpha();
        this.f33124S.setAlpha(h0(alpha2, this.f33110E.f33148m));
        if (this.f33114I) {
            i();
            g(v(), this.f33116K);
            this.f33114I = false;
        }
        g0(canvas);
        if (X()) {
            p(canvas);
        }
        if (Y()) {
            s(canvas);
        }
        this.f33123R.setAlpha(alpha);
        this.f33124S.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean e0() {
        return this.f33110E.f33136a.u(v());
    }

    @Deprecated
    public boolean f0() {
        int i4 = this.f33110E.f33152q;
        if (i4 != 0 && i4 != 2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33110E.f33148m;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public Drawable.ConstantState getConstantState() {
        return this.f33110E;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@N Outline outline) {
        if (this.f33110E.f33152q == 2) {
            return;
        }
        if (e0()) {
            outline.setRoundRect(getBounds(), S() * this.f33110E.f33146k);
            return;
        }
        g(v(), this.f33116K);
        if (this.f33116K.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f33116K);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@N Rect rect) {
        Rect rect2 = this.f33110E.f33144i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // com.google.android.material.shape.s
    @N
    public o getShapeAppearanceModel() {
        return this.f33110E.f33136a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f33120O.set(getBounds());
        g(v(), this.f33116K);
        this.f33121P.setPath(this.f33116K, this.f33120O);
        this.f33120O.op(this.f33121P, Region.Op.DIFFERENCE);
        return this.f33120O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void h(@N RectF rectF, @N Path path) {
        p pVar = this.f33127V;
        d dVar = this.f33110E;
        pVar.e(dVar.f33136a, dVar.f33146k, rectF, this.f33126U, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f33114I = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f33110E.f33142g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f33110E.f33141f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f33110E.f33140e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f33110E.f33139d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public boolean j0() {
        int i4 = Build.VERSION.SDK_INT;
        if (!e0() && !this.f33116K.isConvex() && i4 < 29) {
            return true;
        }
        return false;
    }

    public void k0(float f4) {
        setShapeAppearanceModel(this.f33110E.f33136a.w(f4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @InterfaceC0569l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int l(@InterfaceC0569l int i4) {
        float V3 = V() + B();
        Z0.a aVar = this.f33110E.f33137b;
        if (aVar != null) {
            return aVar.e(i4, V3);
        }
        return i4;
    }

    public void l0(@N com.google.android.material.shape.d dVar) {
        setShapeAppearanceModel(this.f33110E.f33136a.x(dVar));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void m0(boolean z3) {
        this.f33127V.n(z3);
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable mutate() {
        this.f33110E = new d(this.f33110E);
        return this;
    }

    public void n0(float f4) {
        d dVar = this.f33110E;
        if (dVar.f33150o != f4) {
            dVar.f33150o = f4;
            O0();
        }
    }

    public void o0(@P ColorStateList colorStateList) {
        d dVar = this.f33110E;
        if (dVar.f33139d != colorStateList) {
            dVar.f33139d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f33114I = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.t.b
    public boolean onStateChange(int[] iArr) {
        boolean z3;
        boolean M02 = M0(iArr);
        boolean N02 = N0();
        if (!M02 && !N02) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public void p0(float f4) {
        d dVar = this.f33110E;
        if (dVar.f33146k != f4) {
            dVar.f33146k = f4;
            this.f33114I = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(@N Canvas canvas, @N Paint paint, @N Path path, @N RectF rectF) {
        r(canvas, paint, path, this.f33110E.f33136a, rectF);
    }

    public void q0(int i4, int i5, int i6, int i7) {
        d dVar = this.f33110E;
        if (dVar.f33144i == null) {
            dVar.f33144i = new Rect();
        }
        this.f33110E.f33144i.set(i4, i5, i6, i7);
        invalidateSelf();
    }

    public void r0(Paint.Style style) {
        this.f33110E.f33157v = style;
        a0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void s(@N Canvas canvas) {
        r(canvas, this.f33124S, this.f33117L, this.f33122Q, w());
    }

    public void s0(float f4) {
        d dVar = this.f33110E;
        if (dVar.f33149n != f4) {
            dVar.f33149n = f4;
            O0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@F(from = 0, to = 255) int i4) {
        d dVar = this.f33110E;
        if (dVar.f33148m != i4) {
            dVar.f33148m = i4;
            a0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@P ColorFilter colorFilter) {
        this.f33110E.f33138c = colorFilter;
        a0();
    }

    @Override // com.google.android.material.shape.s
    public void setShapeAppearanceModel(@N o oVar) {
        this.f33110E.f33136a = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(@InterfaceC0569l int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(@P ColorStateList colorStateList) {
        this.f33110E.f33142g = colorStateList;
        N0();
        a0();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@P PorterDuff.Mode mode) {
        d dVar = this.f33110E;
        if (dVar.f33143h != mode) {
            dVar.f33143h = mode;
            N0();
            a0();
        }
    }

    public float t() {
        return this.f33110E.f33136a.j().a(v());
    }

    public void t0(float f4) {
        d dVar = this.f33110E;
        if (dVar.f33145j != f4) {
            dVar.f33145j = f4;
            invalidateSelf();
        }
    }

    public float u() {
        return this.f33110E.f33136a.l().a(v());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void u0(boolean z3) {
        this.f33132a0 = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @N
    public RectF v() {
        this.f33118M.set(getBounds());
        return this.f33118M;
    }

    public void v0(int i4) {
        this.f33125T.d(i4);
        this.f33110E.f33156u = false;
        a0();
    }

    public void w0(int i4) {
        d dVar = this.f33110E;
        if (dVar.f33155t != i4) {
            dVar.f33155t = i4;
            a0();
        }
    }

    public float x() {
        return this.f33110E.f33150o;
    }

    public void x0(int i4) {
        d dVar = this.f33110E;
        if (dVar.f33152q != i4) {
            dVar.f33152q = i4;
            a0();
        }
    }

    @P
    public ColorStateList y() {
        return this.f33110E.f33139d;
    }

    @Deprecated
    public void y0(int i4) {
        n0(i4);
    }

    public float z() {
        return this.f33110E.f33146k;
    }

    @Deprecated
    public void z0(boolean z3) {
        x0(!z3 ? 1 : 0);
    }

    public j() {
        this(new o());
    }

    public j(@N Context context, @P AttributeSet attributeSet, @InterfaceC0563f int i4, @d0 int i5) {
        this(o.e(context, attributeSet, i4, i5).m());
    }

    @Deprecated
    public j(@N r rVar) {
        this((o) rVar);
    }

    public j(@N o oVar) {
        this(new d(oVar, null));
    }

    private j(@N d dVar) {
        p pVar;
        this.f33111F = new q.i[4];
        this.f33112G = new q.i[4];
        this.f33113H = new BitSet(8);
        this.f33115J = new Matrix();
        this.f33116K = new Path();
        this.f33117L = new Path();
        this.f33118M = new RectF();
        this.f33119N = new RectF();
        this.f33120O = new Region();
        this.f33121P = new Region();
        Paint paint = new Paint(1);
        this.f33123R = paint;
        Paint paint2 = new Paint(1);
        this.f33124S = paint2;
        this.f33125T = new com.google.android.material.shadow.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = p.k();
        } else {
            pVar = new p();
        }
        this.f33127V = pVar;
        this.f33131Z = new RectF();
        this.f33132a0 = true;
        this.f33110E = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        N0();
        M0(getState());
        this.f33126U = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @N
        public o f33136a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Z0.a f33137b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public ColorFilter f33138c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public ColorStateList f33139d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public ColorStateList f33140e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public ColorStateList f33141f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public ColorStateList f33142g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public PorterDuff.Mode f33143h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public Rect f33144i;

        /* renamed from: j, reason: collision with root package name */
        public float f33145j;

        /* renamed from: k, reason: collision with root package name */
        public float f33146k;

        /* renamed from: l, reason: collision with root package name */
        public float f33147l;

        /* renamed from: m, reason: collision with root package name */
        public int f33148m;

        /* renamed from: n, reason: collision with root package name */
        public float f33149n;

        /* renamed from: o, reason: collision with root package name */
        public float f33150o;

        /* renamed from: p, reason: collision with root package name */
        public float f33151p;

        /* renamed from: q, reason: collision with root package name */
        public int f33152q;

        /* renamed from: r, reason: collision with root package name */
        public int f33153r;

        /* renamed from: s, reason: collision with root package name */
        public int f33154s;

        /* renamed from: t, reason: collision with root package name */
        public int f33155t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f33156u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f33157v;

        public d(o oVar, Z0.a aVar) {
            this.f33139d = null;
            this.f33140e = null;
            this.f33141f = null;
            this.f33142g = null;
            this.f33143h = PorterDuff.Mode.SRC_IN;
            this.f33144i = null;
            this.f33145j = 1.0f;
            this.f33146k = 1.0f;
            this.f33148m = 255;
            this.f33149n = 0.0f;
            this.f33150o = 0.0f;
            this.f33151p = 0.0f;
            this.f33152q = 0;
            this.f33153r = 0;
            this.f33154s = 0;
            this.f33155t = 0;
            this.f33156u = false;
            this.f33157v = Paint.Style.FILL_AND_STROKE;
            this.f33136a = oVar;
            this.f33137b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            j jVar = new j(this, null);
            jVar.f33114I = true;
            return jVar;
        }

        public d(@N d dVar) {
            this.f33139d = null;
            this.f33140e = null;
            this.f33141f = null;
            this.f33142g = null;
            this.f33143h = PorterDuff.Mode.SRC_IN;
            this.f33144i = null;
            this.f33145j = 1.0f;
            this.f33146k = 1.0f;
            this.f33148m = 255;
            this.f33149n = 0.0f;
            this.f33150o = 0.0f;
            this.f33151p = 0.0f;
            this.f33152q = 0;
            this.f33153r = 0;
            this.f33154s = 0;
            this.f33155t = 0;
            this.f33156u = false;
            this.f33157v = Paint.Style.FILL_AND_STROKE;
            this.f33136a = dVar.f33136a;
            this.f33137b = dVar.f33137b;
            this.f33147l = dVar.f33147l;
            this.f33138c = dVar.f33138c;
            this.f33139d = dVar.f33139d;
            this.f33140e = dVar.f33140e;
            this.f33143h = dVar.f33143h;
            this.f33142g = dVar.f33142g;
            this.f33148m = dVar.f33148m;
            this.f33145j = dVar.f33145j;
            this.f33154s = dVar.f33154s;
            this.f33152q = dVar.f33152q;
            this.f33156u = dVar.f33156u;
            this.f33146k = dVar.f33146k;
            this.f33149n = dVar.f33149n;
            this.f33150o = dVar.f33150o;
            this.f33151p = dVar.f33151p;
            this.f33153r = dVar.f33153r;
            this.f33155t = dVar.f33155t;
            this.f33141f = dVar.f33141f;
            this.f33157v = dVar.f33157v;
            if (dVar.f33144i != null) {
                this.f33144i = new Rect(dVar.f33144i);
            }
        }
    }
}

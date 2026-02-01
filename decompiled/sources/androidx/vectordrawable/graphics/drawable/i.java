package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.content.res.n;
import androidx.core.graphics.J;
import androidx.core.view.C0823k0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: O, reason: collision with root package name */
    static final String f20312O = "VectorDrawableCompat";

    /* renamed from: P, reason: collision with root package name */
    static final PorterDuff.Mode f20313P = PorterDuff.Mode.SRC_IN;

    /* renamed from: Q, reason: collision with root package name */
    private static final String f20314Q = "clip-path";

    /* renamed from: R, reason: collision with root package name */
    private static final String f20315R = "group";

    /* renamed from: S, reason: collision with root package name */
    private static final String f20316S = "path";

    /* renamed from: T, reason: collision with root package name */
    private static final String f20317T = "vector";

    /* renamed from: U, reason: collision with root package name */
    private static final int f20318U = 0;

    /* renamed from: V, reason: collision with root package name */
    private static final int f20319V = 1;

    /* renamed from: W, reason: collision with root package name */
    private static final int f20320W = 2;

    /* renamed from: X, reason: collision with root package name */
    private static final int f20321X = 0;

    /* renamed from: Y, reason: collision with root package name */
    private static final int f20322Y = 1;

    /* renamed from: Z, reason: collision with root package name */
    private static final int f20323Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    private static final int f20324a0 = 2048;

    /* renamed from: b0, reason: collision with root package name */
    private static final boolean f20325b0 = false;

    /* renamed from: F, reason: collision with root package name */
    private h f20326F;

    /* renamed from: G, reason: collision with root package name */
    private PorterDuffColorFilter f20327G;

    /* renamed from: H, reason: collision with root package name */
    private ColorFilter f20328H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f20329I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f20330J;

    /* renamed from: K, reason: collision with root package name */
    private Drawable.ConstantState f20331K;

    /* renamed from: L, reason: collision with root package name */
    private final float[] f20332L;

    /* renamed from: M, reason: collision with root package name */
    private final Matrix f20333M;

    /* renamed from: N, reason: collision with root package name */
    private final Rect f20334N;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        private void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f20362b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f20361a = J.d(string2);
            }
            this.f20363c = n.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!n.r(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20204I);
            j(s4, xmlPullParser);
            s4.recycle();
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f20382a;

        /* renamed from: b, reason: collision with root package name */
        g f20383b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f20384c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f20385d;

        /* renamed from: e, reason: collision with root package name */
        boolean f20386e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f20387f;

        /* renamed from: g, reason: collision with root package name */
        int[] f20388g;

        /* renamed from: h, reason: collision with root package name */
        ColorStateList f20389h;

        /* renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f20390i;

        /* renamed from: j, reason: collision with root package name */
        int f20391j;

        /* renamed from: k, reason: collision with root package name */
        boolean f20392k;

        /* renamed from: l, reason: collision with root package name */
        boolean f20393l;

        /* renamed from: m, reason: collision with root package name */
        Paint f20394m;

        public h(h hVar) {
            this.f20384c = null;
            this.f20385d = i.f20313P;
            if (hVar != null) {
                this.f20382a = hVar.f20382a;
                g gVar = new g(hVar.f20383b);
                this.f20383b = gVar;
                if (hVar.f20383b.f20370e != null) {
                    gVar.f20370e = new Paint(hVar.f20383b.f20370e);
                }
                if (hVar.f20383b.f20369d != null) {
                    this.f20383b.f20369d = new Paint(hVar.f20383b.f20369d);
                }
                this.f20384c = hVar.f20384c;
                this.f20385d = hVar.f20385d;
                this.f20386e = hVar.f20386e;
            }
        }

        public boolean a(int i4, int i5) {
            if (i4 == this.f20387f.getWidth() && i5 == this.f20387f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.f20393l && this.f20389h == this.f20384c && this.f20390i == this.f20385d && this.f20392k == this.f20386e && this.f20391j == this.f20383b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void c(int i4, int i5) {
            if (this.f20387f == null || !a(i4, i5)) {
                this.f20387f = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                this.f20393l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f20387f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f20394m == null) {
                Paint paint = new Paint();
                this.f20394m = paint;
                paint.setFilterBitmap(true);
            }
            this.f20394m.setAlpha(this.f20383b.getRootAlpha());
            this.f20394m.setColorFilter(colorFilter);
            return this.f20394m;
        }

        public boolean f() {
            if (this.f20383b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public boolean g() {
            return this.f20383b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f20382a;
        }

        public boolean h(int[] iArr) {
            boolean g4 = this.f20383b.g(iArr);
            this.f20393l |= g4;
            return g4;
        }

        public void i() {
            this.f20389h = this.f20384c;
            this.f20390i = this.f20385d;
            this.f20391j = this.f20383b.getRootAlpha();
            this.f20392k = this.f20386e;
            this.f20393l = false;
        }

        public void j(int i4, int i5) {
            this.f20387f.eraseColor(0);
            this.f20383b.b(new Canvas(this.f20387f), i4, i5, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f20384c = null;
            this.f20385d = i.f20313P;
            this.f20383b = new g();
        }
    }

    i() {
        this.f20330J = true;
        this.f20332L = new float[9];
        this.f20333M = new Matrix();
        this.f20334N = new Rect();
        this.f20326F = new h();
    }

    static int a(int i4, float f4) {
        return (i4 & C0823k0.f13588s) | (((int) (Color.alpha(i4) * f4)) << 24);
    }

    @P
    public static i e(@N Resources resources, @InterfaceC0578v int i4, @P Resources.Theme theme) {
        i iVar = new i();
        iVar.f20311E = androidx.core.content.res.i.g(resources, i4, theme);
        iVar.f20331K = new C0184i(iVar.f20311E.getConstantState());
        return iVar;
    }

    public static i f(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void i(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f20326F;
        g gVar = hVar.f20383b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f20373h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z3 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (f20316S.equals(name)) {
                    c cVar = new c();
                    cVar.k(resources, attributeSet, theme, xmlPullParser);
                    dVar.f20348b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f20381p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f20382a = cVar.f20364d | hVar.f20382a;
                    z3 = false;
                } else if (f20314Q.equals(name)) {
                    b bVar = new b();
                    bVar.i(resources, attributeSet, theme, xmlPullParser);
                    dVar.f20348b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f20381p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f20382a = bVar.f20364d | hVar.f20382a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f20348b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f20381p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f20382a = dVar2.f20357k | hVar.f20382a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z3) {
        } else {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean j() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1) {
            return true;
        }
        return false;
    }

    private static PorterDuff.Mode k(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void l(d dVar, int i4) {
        String str = "";
        for (int i5 = 0; i5 < i4; i5++) {
            str = str + "    ";
        }
        Log.v(f20312O, str + "current group is :" + dVar.getGroupName() + " rotation is " + dVar.f20349c);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(dVar.getLocalMatrix().toString());
        Log.v(f20312O, sb.toString());
        for (int i6 = 0; i6 < dVar.f20348b.size(); i6++) {
            e eVar = dVar.f20348b.get(i6);
            if (eVar instanceof d) {
                l((d) eVar, i4 + 1);
            } else {
                ((f) eVar).g(i4 + 1);
            }
        }
    }

    private void n(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f20326F;
        g gVar = hVar.f20383b;
        hVar.f20385d = k(n.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g4 = n.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g4 != null) {
            hVar.f20384c = g4;
        }
        hVar.f20386e = n.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f20386e);
        gVar.f20376k = n.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f20376k);
        float j4 = n.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f20377l);
        gVar.f20377l = j4;
        if (gVar.f20376k > 0.0f) {
            if (j4 > 0.0f) {
                gVar.f20374i = typedArray.getDimension(3, gVar.f20374i);
                float dimension = typedArray.getDimension(2, gVar.f20375j);
                gVar.f20375j = dimension;
                if (gVar.f20374i > 0.0f) {
                    if (dimension > 0.0f) {
                        gVar.setAlpha(n.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            gVar.f20379n = string;
                            gVar.f20381p.put(string, gVar);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f20334N);
        if (this.f20334N.width() > 0 && this.f20334N.height() > 0) {
            ColorFilter colorFilter = this.f20328H;
            if (colorFilter == null) {
                colorFilter = this.f20327G;
            }
            canvas.getMatrix(this.f20333M);
            this.f20333M.getValues(this.f20332L);
            float abs = Math.abs(this.f20332L[0]);
            float abs2 = Math.abs(this.f20332L[4]);
            float abs3 = Math.abs(this.f20332L[1]);
            float abs4 = Math.abs(this.f20332L[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.f20334N.width() * abs));
            int min2 = Math.min(2048, (int) (this.f20334N.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f20334N;
                canvas.translate(rect.left, rect.top);
                if (j()) {
                    canvas.translate(this.f20334N.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f20334N.offsetTo(0, 0);
                this.f20326F.c(min, min2);
                if (!this.f20330J) {
                    this.f20326F.j(min, min2);
                } else if (!this.f20326F.b()) {
                    this.f20326F.j(min, min2);
                    this.f20326F.i();
                }
                this.f20326F.d(canvas, colorFilter, this.f20334N);
                canvas.restoreToCount(save);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public float g() {
        g gVar;
        h hVar = this.f20326F;
        if (hVar != null && (gVar = hVar.f20383b) != null) {
            float f4 = gVar.f20374i;
            if (f4 != 0.0f) {
                float f5 = gVar.f20375j;
                if (f5 != 0.0f) {
                    float f6 = gVar.f20377l;
                    if (f6 != 0.0f) {
                        float f7 = gVar.f20376k;
                        if (f7 != 0.0f) {
                            return Math.min(f7 / f4, f6 / f5);
                        }
                        return 1.0f;
                    }
                    return 1.0f;
                }
                return 1.0f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.d(drawable);
        }
        return this.f20326F.f20383b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f20326F.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.e(drawable);
        }
        return this.f20328H;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f20311E != null) {
            return new C0184i(this.f20311E.getConstantState());
        }
        this.f20326F.f20382a = getChangingConfigurations();
        return this.f20326F;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f20326F.f20383b.f20375j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f20326F.f20383b.f20374i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object h(String str) {
        return this.f20326F.f20383b.f20381p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return androidx.core.graphics.drawable.d.h(drawable);
        }
        return this.f20326F.f20386e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((hVar = this.f20326F) == null || (!hVar.g() && ((colorStateList = this.f20326F.f20384c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z3) {
        this.f20330J = z3;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f20329I && super.mutate() == this) {
            this.f20326F = new h(this.f20326F);
            this.f20329I = true;
        }
        return this;
    }

    PorterDuffColorFilter o(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f20326F;
        ColorStateList colorStateList = hVar.f20384c;
        if (colorStateList != null && (mode = hVar.f20385d) != null) {
            this.f20327G = o(this.f20327G, colorStateList, mode);
            invalidateSelf();
            z3 = true;
        } else {
            z3 = false;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setAlpha(i4);
        } else if (this.f20326F.f20383b.getRootAlpha() != i4) {
            this.f20326F.f20383b.setRootAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.j(drawable, z3);
        } else {
            this.f20326F.f20386e = z3;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
        super.setChangingConfigurations(i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i4, PorterDuff.Mode mode) {
        super.setColorFilter(i4, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
        super.setFilterBitmap(z3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
        super.setHotspot(f4, f5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
        super.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.n(drawable, i4);
        } else {
            setTintList(ColorStateList.valueOf(i4));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f20326F;
        if (hVar.f20384c != colorStateList) {
            hVar.f20384c = colorStateList;
            this.f20327G = o(this.f20327G, colorStateList, hVar.f20385d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.p(drawable, mode);
            return;
        }
        h hVar = this.f20326F;
        if (hVar.f20385d != mode) {
            hVar.f20385d = mode;
            this.f20327G = o(this.f20327G, hVar.f20384c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(24)
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0184i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f20395a;

        public C0184i(Drawable.ConstantState constantState) {
            this.f20395a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f20395a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f20395a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f20311E = (VectorDrawable) this.f20395a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f20311E = (VectorDrawable) this.f20395a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f20311E = (VectorDrawable) this.f20395a.newDrawable(resources, theme);
            return iVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20328H = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: e, reason: collision with root package name */
        protected static final int f20360e = 0;

        /* renamed from: a, reason: collision with root package name */
        protected J.b[] f20361a;

        /* renamed from: b, reason: collision with root package name */
        String f20362b;

        /* renamed from: c, reason: collision with root package name */
        int f20363c;

        /* renamed from: d, reason: collision with root package name */
        int f20364d;

        public f() {
            super();
            this.f20361a = null;
            this.f20363c = 0;
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(J.b[] bVarArr) {
            String str = " ";
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                str = str + bVarArr[i4].f12409a + ":";
                for (float f4 : bVarArr[i4].f12410b) {
                    str = str + f4 + ",";
                }
            }
            return str;
        }

        public void g(int i4) {
            String str = "";
            for (int i5 = 0; i5 < i4; i5++) {
                str = str + "    ";
            }
            Log.v(i.f20312O, str + "current path is :" + this.f20362b + " pathData is " + f(this.f20361a));
        }

        public J.b[] getPathData() {
            return this.f20361a;
        }

        public String getPathName() {
            return this.f20362b;
        }

        public void h(Path path) {
            path.reset();
            J.b[] bVarArr = this.f20361a;
            if (bVarArr != null) {
                J.b.e(bVarArr, path);
            }
        }

        public void setPathData(J.b[] bVarArr) {
            if (!J.b(this.f20361a, bVarArr)) {
                this.f20361a = J.f(bVarArr);
            } else {
                J.k(this.f20361a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f20361a = null;
            this.f20363c = 0;
            this.f20362b = fVar.f20362b;
            this.f20364d = fVar.f20364d;
            this.f20361a = J.f(fVar.f20361a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20311E;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f20326F;
        hVar.f20383b = new g();
        TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20222a);
        n(s4, xmlPullParser, theme);
        s4.recycle();
        hVar.f20382a = getChangingConfigurations();
        hVar.f20393l = true;
        i(resources, xmlPullParser, attributeSet, theme);
        this.f20327G = o(this.f20327G, hVar.f20384c, hVar.f20385d);
    }

    i(@N h hVar) {
        this.f20330J = true;
        this.f20332L = new float[9];
        this.f20333M = new Matrix();
        this.f20334N = new Rect();
        this.f20326F = hVar;
        this.f20327G = o(this.f20327G, hVar.f20384c, hVar.f20385d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: f, reason: collision with root package name */
        private int[] f20335f;

        /* renamed from: g, reason: collision with root package name */
        androidx.core.content.res.d f20336g;

        /* renamed from: h, reason: collision with root package name */
        float f20337h;

        /* renamed from: i, reason: collision with root package name */
        androidx.core.content.res.d f20338i;

        /* renamed from: j, reason: collision with root package name */
        float f20339j;

        /* renamed from: k, reason: collision with root package name */
        float f20340k;

        /* renamed from: l, reason: collision with root package name */
        float f20341l;

        /* renamed from: m, reason: collision with root package name */
        float f20342m;

        /* renamed from: n, reason: collision with root package name */
        float f20343n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Cap f20344o;

        /* renamed from: p, reason: collision with root package name */
        Paint.Join f20345p;

        /* renamed from: q, reason: collision with root package name */
        float f20346q;

        c() {
            this.f20337h = 0.0f;
            this.f20339j = 1.0f;
            this.f20340k = 1.0f;
            this.f20341l = 0.0f;
            this.f20342m = 1.0f;
            this.f20343n = 0.0f;
            this.f20344o = Paint.Cap.BUTT;
            this.f20345p = Paint.Join.MITER;
            this.f20346q = 4.0f;
        }

        private Paint.Cap i(int i4, Paint.Cap cap) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join j(int i4, Paint.Join join) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f20335f = null;
            if (!n.r(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f20362b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f20361a = J.d(string2);
            }
            this.f20338i = n.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f20340k = n.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f20340k);
            this.f20344o = i(n.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f20344o);
            this.f20345p = j(n.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f20345p);
            this.f20346q = n.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f20346q);
            this.f20336g = n.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f20339j = n.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f20339j);
            this.f20337h = n.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f20337h);
            this.f20342m = n.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f20342m);
            this.f20343n = n.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f20343n);
            this.f20341l = n.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f20341l);
            this.f20363c = n.k(typedArray, xmlPullParser, "fillType", 13, this.f20363c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            if (!this.f20338i.i() && !this.f20336g.i()) {
                return false;
            }
            return true;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f20336g.j(iArr) | this.f20338i.j(iArr);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public void c(Resources.Theme theme) {
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean d() {
            if (this.f20335f != null) {
                return true;
            }
            return false;
        }

        float getFillAlpha() {
            return this.f20340k;
        }

        @InterfaceC0569l
        int getFillColor() {
            return this.f20338i.e();
        }

        float getStrokeAlpha() {
            return this.f20339j;
        }

        @InterfaceC0569l
        int getStrokeColor() {
            return this.f20336g.e();
        }

        float getStrokeWidth() {
            return this.f20337h;
        }

        float getTrimPathEnd() {
            return this.f20342m;
        }

        float getTrimPathOffset() {
            return this.f20343n;
        }

        float getTrimPathStart() {
            return this.f20341l;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20260t);
            l(s4, xmlPullParser, theme);
            s4.recycle();
        }

        void setFillAlpha(float f4) {
            this.f20340k = f4;
        }

        void setFillColor(int i4) {
            this.f20338i.k(i4);
        }

        void setStrokeAlpha(float f4) {
            this.f20339j = f4;
        }

        void setStrokeColor(int i4) {
            this.f20336g.k(i4);
        }

        void setStrokeWidth(float f4) {
            this.f20337h = f4;
        }

        void setTrimPathEnd(float f4) {
            this.f20342m = f4;
        }

        void setTrimPathOffset(float f4) {
            this.f20343n = f4;
        }

        void setTrimPathStart(float f4) {
            this.f20341l = f4;
        }

        c(c cVar) {
            super(cVar);
            this.f20337h = 0.0f;
            this.f20339j = 1.0f;
            this.f20340k = 1.0f;
            this.f20341l = 0.0f;
            this.f20342m = 1.0f;
            this.f20343n = 0.0f;
            this.f20344o = Paint.Cap.BUTT;
            this.f20345p = Paint.Join.MITER;
            this.f20346q = 4.0f;
            this.f20335f = cVar.f20335f;
            this.f20336g = cVar.f20336g;
            this.f20337h = cVar.f20337h;
            this.f20339j = cVar.f20339j;
            this.f20338i = cVar.f20338i;
            this.f20363c = cVar.f20363c;
            this.f20340k = cVar.f20340k;
            this.f20341l = cVar.f20341l;
            this.f20342m = cVar.f20342m;
            this.f20343n = cVar.f20343n;
            this.f20344o = cVar.f20344o;
            this.f20345p = cVar.f20345p;
            this.f20346q = cVar.f20346q;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f20365q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f20366a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f20367b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f20368c;

        /* renamed from: d, reason: collision with root package name */
        Paint f20369d;

        /* renamed from: e, reason: collision with root package name */
        Paint f20370e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f20371f;

        /* renamed from: g, reason: collision with root package name */
        private int f20372g;

        /* renamed from: h, reason: collision with root package name */
        final d f20373h;

        /* renamed from: i, reason: collision with root package name */
        float f20374i;

        /* renamed from: j, reason: collision with root package name */
        float f20375j;

        /* renamed from: k, reason: collision with root package name */
        float f20376k;

        /* renamed from: l, reason: collision with root package name */
        float f20377l;

        /* renamed from: m, reason: collision with root package name */
        int f20378m;

        /* renamed from: n, reason: collision with root package name */
        String f20379n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f20380o;

        /* renamed from: p, reason: collision with root package name */
        final androidx.collection.a<String, Object> f20381p;

        public g() {
            this.f20368c = new Matrix();
            this.f20374i = 0.0f;
            this.f20375j = 0.0f;
            this.f20376k = 0.0f;
            this.f20377l = 0.0f;
            this.f20378m = 255;
            this.f20379n = null;
            this.f20380o = null;
            this.f20381p = new androidx.collection.a<>();
            this.f20373h = new d();
            this.f20366a = new Path();
            this.f20367b = new Path();
        }

        private static float a(float f4, float f5, float f6, float f7) {
            return (f4 * f7) - (f5 * f6);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            dVar.f20347a.set(matrix);
            dVar.f20347a.preConcat(dVar.f20356j);
            canvas.save();
            for (int i6 = 0; i6 < dVar.f20348b.size(); i6++) {
                e eVar = dVar.f20348b.get(i6);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f20347a, canvas, i4, i5, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i4, i5, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f4 = i4 / this.f20376k;
            float f5 = i5 / this.f20377l;
            float min = Math.min(f4, f5);
            Matrix matrix = dVar.f20347a;
            this.f20368c.set(matrix);
            this.f20368c.postScale(f4, f5);
            float e4 = e(matrix);
            if (e4 == 0.0f) {
                return;
            }
            fVar.h(this.f20366a);
            Path path = this.f20366a;
            this.f20367b.reset();
            if (fVar.e()) {
                Path path2 = this.f20367b;
                if (fVar.f20363c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f20367b.addPath(path, this.f20368c);
                canvas.clipPath(this.f20367b);
                return;
            }
            c cVar = (c) fVar;
            float f6 = cVar.f20341l;
            if (f6 != 0.0f || cVar.f20342m != 1.0f) {
                float f7 = cVar.f20343n;
                float f8 = (f6 + f7) % 1.0f;
                float f9 = (cVar.f20342m + f7) % 1.0f;
                if (this.f20371f == null) {
                    this.f20371f = new PathMeasure();
                }
                this.f20371f.setPath(this.f20366a, false);
                float length = this.f20371f.getLength();
                float f10 = f8 * length;
                float f11 = f9 * length;
                path.reset();
                if (f10 > f11) {
                    this.f20371f.getSegment(f10, length, path, true);
                    this.f20371f.getSegment(0.0f, f11, path, true);
                } else {
                    this.f20371f.getSegment(f10, f11, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f20367b.addPath(path, this.f20368c);
            if (cVar.f20338i.l()) {
                androidx.core.content.res.d dVar2 = cVar.f20338i;
                if (this.f20370e == null) {
                    Paint paint = new Paint(1);
                    this.f20370e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f20370e;
                if (dVar2.h()) {
                    Shader f12 = dVar2.f();
                    f12.setLocalMatrix(this.f20368c);
                    paint2.setShader(f12);
                    paint2.setAlpha(Math.round(cVar.f20340k * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f20340k));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f20367b;
                if (cVar.f20363c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f20367b, paint2);
            }
            if (cVar.f20336g.l()) {
                androidx.core.content.res.d dVar3 = cVar.f20336g;
                if (this.f20369d == null) {
                    Paint paint3 = new Paint(1);
                    this.f20369d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f20369d;
                Paint.Join join = cVar.f20345p;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f20344o;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f20346q);
                if (dVar3.h()) {
                    Shader f13 = dVar3.f();
                    f13.setLocalMatrix(this.f20368c);
                    paint4.setShader(f13);
                    paint4.setAlpha(Math.round(cVar.f20339j * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f20339j));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f20337h * min * e4);
                canvas.drawPath(this.f20367b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a4 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(a4) / max;
        }

        public void b(Canvas canvas, int i4, int i5, ColorFilter colorFilter) {
            c(this.f20373h, f20365q, canvas, i4, i5, colorFilter);
        }

        public boolean f() {
            if (this.f20380o == null) {
                this.f20380o = Boolean.valueOf(this.f20373h.a());
            }
            return this.f20380o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f20373h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f20378m;
        }

        public void setAlpha(float f4) {
            setRootAlpha((int) (f4 * 255.0f));
        }

        public void setRootAlpha(int i4) {
            this.f20378m = i4;
        }

        public g(g gVar) {
            this.f20368c = new Matrix();
            this.f20374i = 0.0f;
            this.f20375j = 0.0f;
            this.f20376k = 0.0f;
            this.f20377l = 0.0f;
            this.f20378m = 255;
            this.f20379n = null;
            this.f20380o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f20381p = aVar;
            this.f20373h = new d(gVar.f20373h, aVar);
            this.f20366a = new Path(gVar.f20366a);
            this.f20367b = new Path(gVar.f20367b);
            this.f20374i = gVar.f20374i;
            this.f20375j = gVar.f20375j;
            this.f20376k = gVar.f20376k;
            this.f20377l = gVar.f20377l;
            this.f20372g = gVar.f20372g;
            this.f20378m = gVar.f20378m;
            this.f20379n = gVar.f20379n;
            String str = gVar.f20379n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f20380o = gVar.f20380o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f20347a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f20348b;

        /* renamed from: c, reason: collision with root package name */
        float f20349c;

        /* renamed from: d, reason: collision with root package name */
        private float f20350d;

        /* renamed from: e, reason: collision with root package name */
        private float f20351e;

        /* renamed from: f, reason: collision with root package name */
        private float f20352f;

        /* renamed from: g, reason: collision with root package name */
        private float f20353g;

        /* renamed from: h, reason: collision with root package name */
        private float f20354h;

        /* renamed from: i, reason: collision with root package name */
        private float f20355i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f20356j;

        /* renamed from: k, reason: collision with root package name */
        int f20357k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f20358l;

        /* renamed from: m, reason: collision with root package name */
        private String f20359m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f20347a = new Matrix();
            this.f20348b = new ArrayList<>();
            this.f20349c = 0.0f;
            this.f20350d = 0.0f;
            this.f20351e = 0.0f;
            this.f20352f = 1.0f;
            this.f20353g = 1.0f;
            this.f20354h = 0.0f;
            this.f20355i = 0.0f;
            Matrix matrix = new Matrix();
            this.f20356j = matrix;
            this.f20359m = null;
            this.f20349c = dVar.f20349c;
            this.f20350d = dVar.f20350d;
            this.f20351e = dVar.f20351e;
            this.f20352f = dVar.f20352f;
            this.f20353g = dVar.f20353g;
            this.f20354h = dVar.f20354h;
            this.f20355i = dVar.f20355i;
            this.f20358l = dVar.f20358l;
            String str = dVar.f20359m;
            this.f20359m = str;
            this.f20357k = dVar.f20357k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f20356j);
            ArrayList<e> arrayList = dVar.f20348b;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                e eVar = arrayList.get(i4);
                if (eVar instanceof d) {
                    this.f20348b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f20348b.add(bVar);
                    String str2 = bVar.f20362b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f20356j.reset();
            this.f20356j.postTranslate(-this.f20350d, -this.f20351e);
            this.f20356j.postScale(this.f20352f, this.f20353g);
            this.f20356j.postRotate(this.f20349c, 0.0f, 0.0f);
            this.f20356j.postTranslate(this.f20354h + this.f20350d, this.f20355i + this.f20351e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f20358l = null;
            this.f20349c = n.j(typedArray, xmlPullParser, androidx.constraintlayout.motion.widget.f.f8538i, 5, this.f20349c);
            this.f20350d = typedArray.getFloat(1, this.f20350d);
            this.f20351e = typedArray.getFloat(2, this.f20351e);
            this.f20352f = n.j(typedArray, xmlPullParser, "scaleX", 3, this.f20352f);
            this.f20353g = n.j(typedArray, xmlPullParser, "scaleY", 4, this.f20353g);
            this.f20354h = n.j(typedArray, xmlPullParser, "translateX", 6, this.f20354h);
            this.f20355i = n.j(typedArray, xmlPullParser, "translateY", 7, this.f20355i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f20359m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i4 = 0; i4 < this.f20348b.size(); i4++) {
                if (this.f20348b.get(i4).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z3 = false;
            for (int i4 = 0; i4 < this.f20348b.size(); i4++) {
                z3 |= this.f20348b.get(i4).b(iArr);
            }
            return z3;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s4 = n.s(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f20242k);
            e(s4, xmlPullParser);
            s4.recycle();
        }

        public String getGroupName() {
            return this.f20359m;
        }

        public Matrix getLocalMatrix() {
            return this.f20356j;
        }

        public float getPivotX() {
            return this.f20350d;
        }

        public float getPivotY() {
            return this.f20351e;
        }

        public float getRotation() {
            return this.f20349c;
        }

        public float getScaleX() {
            return this.f20352f;
        }

        public float getScaleY() {
            return this.f20353g;
        }

        public float getTranslateX() {
            return this.f20354h;
        }

        public float getTranslateY() {
            return this.f20355i;
        }

        public void setPivotX(float f4) {
            if (f4 != this.f20350d) {
                this.f20350d = f4;
                d();
            }
        }

        public void setPivotY(float f4) {
            if (f4 != this.f20351e) {
                this.f20351e = f4;
                d();
            }
        }

        public void setRotation(float f4) {
            if (f4 != this.f20349c) {
                this.f20349c = f4;
                d();
            }
        }

        public void setScaleX(float f4) {
            if (f4 != this.f20352f) {
                this.f20352f = f4;
                d();
            }
        }

        public void setScaleY(float f4) {
            if (f4 != this.f20353g) {
                this.f20353g = f4;
                d();
            }
        }

        public void setTranslateX(float f4) {
            if (f4 != this.f20354h) {
                this.f20354h = f4;
                d();
            }
        }

        public void setTranslateY(float f4) {
            if (f4 != this.f20355i) {
                this.f20355i = f4;
                d();
            }
        }

        public d() {
            super();
            this.f20347a = new Matrix();
            this.f20348b = new ArrayList<>();
            this.f20349c = 0.0f;
            this.f20350d = 0.0f;
            this.f20351e = 0.0f;
            this.f20352f = 1.0f;
            this.f20353g = 1.0f;
            this.f20354h = 0.0f;
            this.f20355i = 0.0f;
            this.f20356j = new Matrix();
            this.f20359m = null;
        }
    }
}

package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import com.harman.sdk.message.GestureInfo;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: Q, reason: collision with root package name */
    private static final boolean f5035Q = false;

    /* renamed from: R, reason: collision with root package name */
    private static final String f5036R = "DrawableContainerCompat";

    /* renamed from: S, reason: collision with root package name */
    private static final boolean f5037S = true;

    /* renamed from: E, reason: collision with root package name */
    private d f5038E;

    /* renamed from: F, reason: collision with root package name */
    private Rect f5039F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f5040G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f5041H;

    /* renamed from: J, reason: collision with root package name */
    private boolean f5043J;

    /* renamed from: L, reason: collision with root package name */
    private boolean f5045L;

    /* renamed from: M, reason: collision with root package name */
    private Runnable f5046M;

    /* renamed from: N, reason: collision with root package name */
    private long f5047N;

    /* renamed from: O, reason: collision with root package name */
    private long f5048O;

    /* renamed from: P, reason: collision with root package name */
    private c f5049P;

    /* renamed from: I, reason: collision with root package name */
    private int f5042I = 255;

    /* renamed from: K, reason: collision with root package name */
    private int f5044K = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(21)
    /* renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0046b {
        private C0046b() {
        }

        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: E, reason: collision with root package name */
        private Drawable.Callback f5051E;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f5051E;
            this.f5051E = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f5051E = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@N Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j4) {
            Drawable.Callback callback = this.f5051E;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j4);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
            Drawable.Callback callback = this.f5051E;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {

        /* renamed from: A, reason: collision with root package name */
        int f5052A;

        /* renamed from: B, reason: collision with root package name */
        int f5053B;

        /* renamed from: C, reason: collision with root package name */
        boolean f5054C;

        /* renamed from: D, reason: collision with root package name */
        ColorFilter f5055D;

        /* renamed from: E, reason: collision with root package name */
        boolean f5056E;

        /* renamed from: F, reason: collision with root package name */
        ColorStateList f5057F;

        /* renamed from: G, reason: collision with root package name */
        PorterDuff.Mode f5058G;

        /* renamed from: H, reason: collision with root package name */
        boolean f5059H;

        /* renamed from: I, reason: collision with root package name */
        boolean f5060I;

        /* renamed from: a, reason: collision with root package name */
        final b f5061a;

        /* renamed from: b, reason: collision with root package name */
        Resources f5062b;

        /* renamed from: c, reason: collision with root package name */
        int f5063c;

        /* renamed from: d, reason: collision with root package name */
        int f5064d;

        /* renamed from: e, reason: collision with root package name */
        int f5065e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f5066f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f5067g;

        /* renamed from: h, reason: collision with root package name */
        int f5068h;

        /* renamed from: i, reason: collision with root package name */
        boolean f5069i;

        /* renamed from: j, reason: collision with root package name */
        boolean f5070j;

        /* renamed from: k, reason: collision with root package name */
        Rect f5071k;

        /* renamed from: l, reason: collision with root package name */
        boolean f5072l;

        /* renamed from: m, reason: collision with root package name */
        boolean f5073m;

        /* renamed from: n, reason: collision with root package name */
        int f5074n;

        /* renamed from: o, reason: collision with root package name */
        int f5075o;

        /* renamed from: p, reason: collision with root package name */
        int f5076p;

        /* renamed from: q, reason: collision with root package name */
        int f5077q;

        /* renamed from: r, reason: collision with root package name */
        boolean f5078r;

        /* renamed from: s, reason: collision with root package name */
        int f5079s;

        /* renamed from: t, reason: collision with root package name */
        boolean f5080t;

        /* renamed from: u, reason: collision with root package name */
        boolean f5081u;

        /* renamed from: v, reason: collision with root package name */
        boolean f5082v;

        /* renamed from: w, reason: collision with root package name */
        boolean f5083w;

        /* renamed from: x, reason: collision with root package name */
        boolean f5084x;

        /* renamed from: y, reason: collision with root package name */
        boolean f5085y;

        /* renamed from: z, reason: collision with root package name */
        int f5086z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            Resources resources2;
            int i4;
            this.f5069i = false;
            this.f5072l = false;
            this.f5084x = true;
            this.f5052A = 0;
            this.f5053B = 0;
            this.f5061a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (dVar != null) {
                resources2 = dVar.f5062b;
            } else {
                resources2 = null;
            }
            this.f5062b = resources2;
            if (dVar != null) {
                i4 = dVar.f5063c;
            } else {
                i4 = 0;
            }
            int g4 = b.g(resources, i4);
            this.f5063c = g4;
            if (dVar != null) {
                this.f5064d = dVar.f5064d;
                this.f5065e = dVar.f5065e;
                this.f5082v = true;
                this.f5083w = true;
                this.f5069i = dVar.f5069i;
                this.f5072l = dVar.f5072l;
                this.f5084x = dVar.f5084x;
                this.f5085y = dVar.f5085y;
                this.f5086z = dVar.f5086z;
                this.f5052A = dVar.f5052A;
                this.f5053B = dVar.f5053B;
                this.f5054C = dVar.f5054C;
                this.f5055D = dVar.f5055D;
                this.f5056E = dVar.f5056E;
                this.f5057F = dVar.f5057F;
                this.f5058G = dVar.f5058G;
                this.f5059H = dVar.f5059H;
                this.f5060I = dVar.f5060I;
                if (dVar.f5063c == g4) {
                    if (dVar.f5070j) {
                        this.f5071k = dVar.f5071k != null ? new Rect(dVar.f5071k) : null;
                        this.f5070j = true;
                    }
                    if (dVar.f5073m) {
                        this.f5074n = dVar.f5074n;
                        this.f5075o = dVar.f5075o;
                        this.f5076p = dVar.f5076p;
                        this.f5077q = dVar.f5077q;
                        this.f5073m = true;
                    }
                }
                if (dVar.f5078r) {
                    this.f5079s = dVar.f5079s;
                    this.f5078r = true;
                }
                if (dVar.f5080t) {
                    this.f5081u = dVar.f5081u;
                    this.f5080t = true;
                }
                Drawable[] drawableArr = dVar.f5067g;
                this.f5067g = new Drawable[drawableArr.length];
                this.f5068h = dVar.f5068h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f5066f;
                if (sparseArray != null) {
                    this.f5066f = sparseArray.clone();
                } else {
                    this.f5066f = new SparseArray<>(this.f5068h);
                }
                int i5 = this.f5068h;
                for (int i6 = 0; i6 < i5; i6++) {
                    Drawable drawable = drawableArr[i6];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f5066f.put(i6, constantState);
                        } else {
                            this.f5067g[i6] = drawableArr[i6];
                        }
                    }
                }
                return;
            }
            this.f5067g = new Drawable[10];
            this.f5068h = 0;
        }

        private void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f5066f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f5067g[this.f5066f.keyAt(i4)] = w(this.f5066f.valueAt(i4).newDrawable(this.f5062b));
                }
                this.f5066f = null;
            }
        }

        private Drawable w(Drawable drawable) {
            androidx.core.graphics.drawable.d.m(drawable, this.f5086z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f5061a);
            return mutate;
        }

        final boolean A(int i4, int i5) {
            int i6 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            boolean z3 = false;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    boolean m4 = androidx.core.graphics.drawable.d.m(drawable, i4);
                    if (i7 == i5) {
                        z3 = m4;
                    }
                }
            }
            this.f5086z = i4;
            return z3;
        }

        public final void B(boolean z3) {
            this.f5069i = z3;
        }

        final void C(Resources resources) {
            if (resources != null) {
                this.f5062b = resources;
                int g4 = b.g(resources, this.f5063c);
                int i4 = this.f5063c;
                this.f5063c = g4;
                if (i4 != g4) {
                    this.f5073m = false;
                    this.f5070j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i4 = this.f5068h;
            if (i4 >= this.f5067g.length) {
                r(i4, i4 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f5061a);
            this.f5067g[i4] = drawable;
            this.f5068h++;
            this.f5065e = drawable.getChangingConfigurations() | this.f5065e;
            s();
            this.f5071k = null;
            this.f5070j = false;
            this.f5073m = false;
            this.f5082v = false;
            return i4;
        }

        @W(21)
        final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i4 = this.f5068h;
                Drawable[] drawableArr = this.f5067g;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null && androidx.core.graphics.drawable.d.b(drawable)) {
                        androidx.core.graphics.drawable.d.a(drawableArr[i5], theme);
                        this.f5065e |= drawableArr[i5].getChangingConfigurations();
                    }
                }
                C(C0046b.c(theme));
            }
        }

        public boolean c() {
            if (this.f5082v) {
                return this.f5083w;
            }
            f();
            this.f5082v = true;
            int i4 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5].getConstantState() == null) {
                    this.f5083w = false;
                    return false;
                }
            }
            this.f5083w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @W(21)
        public boolean canApplyTheme() {
            int i4 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    if (androidx.core.graphics.drawable.d.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f5066f.get(i5);
                    if (constantState != null && C0046b.a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        final void d() {
            this.f5085y = false;
        }

        protected void e() {
            this.f5073m = true;
            f();
            int i4 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            this.f5075o = -1;
            this.f5074n = -1;
            this.f5077q = 0;
            this.f5076p = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f5074n) {
                    this.f5074n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f5075o) {
                    this.f5075o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f5076p) {
                    this.f5076p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f5077q) {
                    this.f5077q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int g() {
            return this.f5067g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5064d | this.f5065e;
        }

        public final Drawable h(int i4) {
            int indexOfKey;
            Drawable drawable = this.f5067g[i4];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f5066f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i4)) < 0) {
                return null;
            }
            Drawable w3 = w(this.f5066f.valueAt(indexOfKey).newDrawable(this.f5062b));
            this.f5067g[i4] = w3;
            this.f5066f.removeAt(indexOfKey);
            if (this.f5066f.size() == 0) {
                this.f5066f = null;
            }
            return w3;
        }

        public final int i() {
            return this.f5068h;
        }

        public final int j() {
            if (!this.f5073m) {
                e();
            }
            return this.f5075o;
        }

        public final int k() {
            if (!this.f5073m) {
                e();
            }
            return this.f5077q;
        }

        public final int l() {
            if (!this.f5073m) {
                e();
            }
            return this.f5076p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f5069i) {
                return null;
            }
            Rect rect2 = this.f5071k;
            if (rect2 == null && !this.f5070j) {
                f();
                Rect rect3 = new Rect();
                int i4 = this.f5068h;
                Drawable[] drawableArr = this.f5067g;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i6 = rect3.left;
                        if (i6 > rect.left) {
                            rect.left = i6;
                        }
                        int i7 = rect3.top;
                        if (i7 > rect.top) {
                            rect.top = i7;
                        }
                        int i8 = rect3.right;
                        if (i8 > rect.right) {
                            rect.right = i8;
                        }
                        int i9 = rect3.bottom;
                        if (i9 > rect.bottom) {
                            rect.bottom = i9;
                        }
                    }
                }
                this.f5070j = true;
                this.f5071k = rect;
                return rect;
            }
            return rect2;
        }

        public final int n() {
            if (!this.f5073m) {
                e();
            }
            return this.f5074n;
        }

        public final int o() {
            return this.f5052A;
        }

        public final int p() {
            return this.f5053B;
        }

        public final int q() {
            int i4;
            if (this.f5078r) {
                return this.f5079s;
            }
            f();
            int i5 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            if (i5 > 0) {
                i4 = drawableArr[0].getOpacity();
            } else {
                i4 = -2;
            }
            for (int i6 = 1; i6 < i5; i6++) {
                i4 = Drawable.resolveOpacity(i4, drawableArr[i6].getOpacity());
            }
            this.f5079s = i4;
            this.f5078r = true;
            return i4;
        }

        public void r(int i4, int i5) {
            Drawable[] drawableArr = new Drawable[i5];
            Drawable[] drawableArr2 = this.f5067g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i4);
            }
            this.f5067g = drawableArr;
        }

        void s() {
            this.f5078r = false;
            this.f5080t = false;
        }

        public final boolean t() {
            return this.f5072l;
        }

        public final boolean u() {
            if (this.f5080t) {
                return this.f5081u;
            }
            f();
            int i4 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            boolean z3 = false;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                if (drawableArr[i5].isStateful()) {
                    z3 = true;
                    break;
                }
                i5++;
            }
            this.f5081u = z3;
            this.f5080t = true;
            return z3;
        }

        void v() {
            int i4 = this.f5068h;
            Drawable[] drawableArr = this.f5067g;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f5085y = true;
        }

        public final void x(boolean z3) {
            this.f5072l = z3;
        }

        public final void y(int i4) {
            this.f5052A = i4;
        }

        public final void z(int i4) {
            this.f5053B = i4;
        }
    }

    private void e(Drawable drawable) {
        if (this.f5049P == null) {
            this.f5049P = new c();
        }
        drawable.setCallback(this.f5049P.b(drawable.getCallback()));
        try {
            if (this.f5038E.f5052A <= 0 && this.f5043J) {
                drawable.setAlpha(this.f5042I);
            }
            d dVar = this.f5038E;
            if (dVar.f5056E) {
                drawable.setColorFilter(dVar.f5055D);
            } else {
                if (dVar.f5059H) {
                    androidx.core.graphics.drawable.d.o(drawable, dVar.f5057F);
                }
                d dVar2 = this.f5038E;
                if (dVar2.f5060I) {
                    androidx.core.graphics.drawable.d.p(drawable, dVar2.f5058G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f5038E.f5084x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.d.m(drawable, androidx.core.graphics.drawable.d.f(this));
            androidx.core.graphics.drawable.d.j(drawable, this.f5038E.f5054C);
            Rect rect = this.f5039F;
            if (rect != null) {
                androidx.core.graphics.drawable.d.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f5049P.a());
        } catch (Throwable th) {
            drawable.setCallback(this.f5049P.a());
            throw th;
        }
    }

    private boolean f() {
        if (isAutoMirrored() && androidx.core.graphics.drawable.d.f(this) == 1) {
            return true;
        }
        return false;
    }

    static int g(@P Resources resources, int i4) {
        if (resources != null) {
            i4 = resources.getDisplayMetrics().densityDpi;
        }
        if (i4 == 0) {
            return GestureInfo.f48257q0;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f5043J = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f5040G
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f5047N
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f5042I
            r3.setAlpha(r9)
            r13.f5047N = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r10 = r13.f5038E
            int r10 = r10.f5052A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f5042I
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f5047N = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f5041H
            if (r9 == 0) goto L61
            long r10 = r13.f5048O
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f5041H = r0
            r13.f5048O = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f5038E
            int r4 = r4.f5053B
            int r3 = r3 / r4
            int r4 = r13.f5042I
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f5048O = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f5046M
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @W(21)
    public void applyTheme(@N Resources.Theme theme) {
        this.f5038E.b(theme);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f5038E.d();
        this.f5045L = false;
    }

    d c() {
        return this.f5038E;
    }

    @Override // android.graphics.drawable.Drawable
    @W(21)
    public boolean canApplyTheme() {
        return this.f5038E.canApplyTheme();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f5044K;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f5041H;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5042I;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f5038E.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f5038E.c()) {
            this.f5038E.f5064d = getChangingConfigurations();
            return this.f5038E;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @N
    public Drawable getCurrent() {
        return this.f5040G;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@N Rect rect) {
        Rect rect2 = this.f5039F;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f5038E.t()) {
            return this.f5038E.j();
        }
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f5038E.t()) {
            return this.f5038E.n();
        }
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f5038E.t()) {
            return this.f5038E.k();
        }
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f5038E.t()) {
            return this.f5038E.l();
        }
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5040G;
        if (drawable != null && drawable.isVisible()) {
            return this.f5038E.q();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @W(21)
    public void getOutline(@N Outline outline) {
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            C0046b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@N Rect rect) {
        boolean padding;
        Rect m4 = this.f5038E.m();
        if (m4 != null) {
            rect.set(m4);
            if ((m4.right | m4.left | m4.top | m4.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f5040G;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (f()) {
            int i4 = rect.left;
            rect.left = rect.right;
            rect.right = i4;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f5044K
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f5038E
            int r0 = r0.f5053B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f5041H
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f5040G
            if (r0 == 0) goto L29
            r9.f5041H = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f5038E
            int r0 = r0.f5053B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f5048O = r0
            goto L35
        L29:
            r9.f5041H = r4
            r9.f5048O = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f5040G
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f5038E
            int r1 = r0.f5068h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.f5040G = r0
            r9.f5044K = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f5038E
            int r10 = r10.f5052A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f5047N = r2
        L51:
            r9.e(r0)
            goto L5a
        L55:
            r9.f5040G = r4
            r10 = -1
            r9.f5044K = r10
        L5a:
            long r0 = r9.f5047N
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f5048O
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f5046M
            if (r10 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r10 = new androidx.appcompat.graphics.drawable.b$a
            r10.<init>()
            r9.f5046M = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.h(int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(d dVar) {
        this.f5038E = dVar;
        int i4 = this.f5044K;
        if (i4 >= 0) {
            Drawable h4 = dVar.h(i4);
            this.f5040G = h4;
            if (h4 != null) {
                e(h4);
            }
        }
        this.f5041H = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@N Drawable drawable) {
        d dVar = this.f5038E;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable == this.f5040G && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f5038E.f5054C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f5038E.u();
    }

    void j(int i4) {
        h(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f5041H;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f5041H = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f5040G;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f5043J) {
                this.f5040G.setAlpha(this.f5042I);
            }
        }
        if (this.f5048O != 0) {
            this.f5048O = 0L;
        } else {
            z4 = z3;
        }
        if (this.f5047N != 0) {
            this.f5047N = 0L;
        } else if (!z4) {
            return;
        }
        invalidateSelf();
    }

    public void k(int i4) {
        this.f5038E.f5052A = i4;
    }

    public void l(int i4) {
        this.f5038E.f5053B = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(Resources resources) {
        this.f5038E.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5045L && super.mutate() == this) {
            d c4 = c();
            c4.v();
            i(c4);
            this.f5045L = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5041H;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f5040G;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        return this.f5038E.A(i4, d());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f5041H;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f5040G;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@N int[] iArr) {
        Drawable drawable = this.f5041H;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f5040G;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j4) {
        if (drawable == this.f5040G && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (!this.f5043J || this.f5042I != i4) {
            this.f5043J = true;
            this.f5042I = i4;
            Drawable drawable = this.f5040G;
            if (drawable != null) {
                if (this.f5047N == 0) {
                    drawable.setAlpha(i4);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        d dVar = this.f5038E;
        if (dVar.f5054C != z3) {
            dVar.f5054C = z3;
            Drawable drawable = this.f5040G;
            if (drawable != null) {
                androidx.core.graphics.drawable.d.j(drawable, z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f5038E;
        dVar.f5056E = true;
        if (dVar.f5055D != colorFilter) {
            dVar.f5055D = colorFilter;
            Drawable drawable = this.f5040G;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        d dVar = this.f5038E;
        if (dVar.f5084x != z3) {
            dVar.f5084x = z3;
            Drawable drawable = this.f5040G;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.k(drawable, f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f5039F;
        if (rect == null) {
            this.f5039F = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f5040G;
        if (drawable != null) {
            androidx.core.graphics.drawable.d.l(drawable, i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@InterfaceC0569l int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f5038E;
        dVar.f5059H = true;
        if (dVar.f5057F != colorStateList) {
            dVar.f5057F = colorStateList;
            androidx.core.graphics.drawable.d.o(this.f5040G, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@N PorterDuff.Mode mode) {
        d dVar = this.f5038E;
        dVar.f5060I = true;
        if (dVar.f5058G != mode) {
            dVar.f5058G = mode;
            androidx.core.graphics.drawable.d.p(this.f5040G, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f5041H;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f5040G;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
        if (drawable == this.f5040G && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}

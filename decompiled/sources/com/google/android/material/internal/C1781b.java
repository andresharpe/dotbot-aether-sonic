package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.view.C0823k0;
import com.google.android.material.internal.s;
import com.google.android.material.resources.a;
import q.C2394a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1781b {

    /* renamed from: u0, reason: collision with root package name */
    private static final String f32539u0 = "CollapsingTextHelper";

    /* renamed from: v0, reason: collision with root package name */
    private static final String f32540v0 = "…";

    /* renamed from: w0, reason: collision with root package name */
    private static final float f32541w0 = 0.5f;

    /* renamed from: x0, reason: collision with root package name */
    private static final boolean f32542x0 = false;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f32544A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f32545B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f32546C;

    /* renamed from: D, reason: collision with root package name */
    private Typeface f32547D;

    /* renamed from: E, reason: collision with root package name */
    private com.google.android.material.resources.a f32548E;

    /* renamed from: F, reason: collision with root package name */
    private com.google.android.material.resources.a f32549F;

    /* renamed from: G, reason: collision with root package name */
    @P
    private CharSequence f32550G;

    /* renamed from: H, reason: collision with root package name */
    @P
    private CharSequence f32551H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f32552I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f32554K;

    /* renamed from: L, reason: collision with root package name */
    @P
    private Bitmap f32555L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f32556M;

    /* renamed from: N, reason: collision with root package name */
    private float f32557N;

    /* renamed from: O, reason: collision with root package name */
    private float f32558O;

    /* renamed from: P, reason: collision with root package name */
    private float f32559P;

    /* renamed from: Q, reason: collision with root package name */
    private float f32560Q;

    /* renamed from: R, reason: collision with root package name */
    private float f32561R;

    /* renamed from: S, reason: collision with root package name */
    private int f32562S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f32563T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f32564U;

    /* renamed from: V, reason: collision with root package name */
    @N
    private final TextPaint f32565V;

    /* renamed from: W, reason: collision with root package name */
    @N
    private final TextPaint f32566W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f32567X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f32568Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f32569Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f32570a;

    /* renamed from: a0, reason: collision with root package name */
    private float f32571a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f32572b;

    /* renamed from: b0, reason: collision with root package name */
    private float f32573b0;

    /* renamed from: c, reason: collision with root package name */
    private float f32574c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f32575c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f32576d;

    /* renamed from: d0, reason: collision with root package name */
    private float f32577d0;

    /* renamed from: e, reason: collision with root package name */
    private float f32578e;

    /* renamed from: e0, reason: collision with root package name */
    private float f32579e0;

    /* renamed from: f, reason: collision with root package name */
    private float f32580f;

    /* renamed from: f0, reason: collision with root package name */
    private float f32581f0;

    /* renamed from: g, reason: collision with root package name */
    private int f32582g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f32583g0;

    /* renamed from: h, reason: collision with root package name */
    @N
    private final Rect f32584h;

    /* renamed from: h0, reason: collision with root package name */
    private float f32585h0;

    /* renamed from: i, reason: collision with root package name */
    @N
    private final Rect f32586i;

    /* renamed from: i0, reason: collision with root package name */
    private float f32587i0;

    /* renamed from: j, reason: collision with root package name */
    @N
    private final RectF f32588j;

    /* renamed from: j0, reason: collision with root package name */
    private float f32589j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f32591k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f32593l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f32595m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f32597n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f32598o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f32599o0;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f32600p;

    /* renamed from: q, reason: collision with root package name */
    private int f32602q;

    /* renamed from: r, reason: collision with root package name */
    private float f32604r;

    /* renamed from: s, reason: collision with root package name */
    private float f32606s;

    /* renamed from: t, reason: collision with root package name */
    private float f32608t;

    /* renamed from: u, reason: collision with root package name */
    private float f32609u;

    /* renamed from: v, reason: collision with root package name */
    private float f32610v;

    /* renamed from: w, reason: collision with root package name */
    private float f32611w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f32612x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f32613y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f32614z;

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f32538t0 = false;

    /* renamed from: y0, reason: collision with root package name */
    @N
    private static final Paint f32543y0 = null;

    /* renamed from: k, reason: collision with root package name */
    private int f32590k = 16;

    /* renamed from: l, reason: collision with root package name */
    private int f32592l = 16;

    /* renamed from: m, reason: collision with root package name */
    private float f32594m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    private float f32596n = 15.0f;

    /* renamed from: J, reason: collision with root package name */
    private boolean f32553J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f32601p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f32603q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f32605r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f32607s0 = s.f32695n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.b$a */
    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0294a {
        a() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0294a
        public void a(Typeface typeface) {
            C1781b.this.m0(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0288b implements a.InterfaceC0294a {
        C0288b() {
        }

        @Override // com.google.android.material.resources.a.InterfaceC0294a
        public void a(Typeface typeface) {
            C1781b.this.x0(typeface);
        }
    }

    public C1781b(View view) {
        this.f32570a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f32565V = textPaint;
        this.f32566W = new TextPaint(textPaint);
        this.f32586i = new Rect();
        this.f32584h = new Rect();
        this.f32588j = new RectF();
        this.f32580f = e();
        Z(view.getContext().getResources().getConfiguration());
    }

    private void D0(float f4) {
        boolean z3;
        h(f4);
        if (f32538t0 && this.f32557N != 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f32554K = z3;
        if (z3) {
            n();
        }
        C0823k0.n1(this.f32570a);
    }

    private Layout.Alignment N() {
        int d4 = androidx.core.view.C.d(this.f32590k, this.f32552I ? 1 : 0) & 7;
        if (d4 != 1) {
            if (d4 != 5) {
                if (this.f32552I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            }
            if (this.f32552I) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private boolean N0() {
        if (this.f32601p0 > 1 && ((!this.f32552I || this.f32576d) && !this.f32554K)) {
            return true;
        }
        return false;
    }

    private void Q(@N TextPaint textPaint) {
        textPaint.setTextSize(this.f32596n);
        textPaint.setTypeface(this.f32612x);
        textPaint.setLetterSpacing(this.f32585h0);
    }

    private void R(@N TextPaint textPaint) {
        textPaint.setTextSize(this.f32594m);
        textPaint.setTypeface(this.f32544A);
        textPaint.setLetterSpacing(this.f32587i0);
    }

    private void S(float f4) {
        Rect rect;
        if (this.f32576d) {
            RectF rectF = this.f32588j;
            if (f4 < this.f32580f) {
                rect = this.f32584h;
            } else {
                rect = this.f32586i;
            }
            rectF.set(rect);
            return;
        }
        this.f32588j.left = Y(this.f32584h.left, this.f32586i.left, f4, this.f32567X);
        this.f32588j.top = Y(this.f32604r, this.f32606s, f4, this.f32567X);
        this.f32588j.right = Y(this.f32584h.right, this.f32586i.right, f4, this.f32567X);
        this.f32588j.bottom = Y(this.f32584h.bottom, this.f32586i.bottom, f4, this.f32567X);
    }

    private static boolean T(float f4, float f5) {
        if (Math.abs(f4 - f5) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private boolean U() {
        if (C0823k0.Z(this.f32570a) == 1) {
            return true;
        }
        return false;
    }

    private boolean X(@N CharSequence charSequence, boolean z3) {
        androidx.core.text.E e4;
        if (z3) {
            e4 = androidx.core.text.F.f12859d;
        } else {
            e4 = androidx.core.text.F.f12858c;
        }
        return e4.b(charSequence, 0, charSequence.length());
    }

    private static float Y(float f4, float f5, float f6, @P TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return com.google.android.material.animation.a.a(f4, f5, f6);
    }

    @InterfaceC0569l
    private static int a(@InterfaceC0569l int i4, @InterfaceC0569l int i5, @InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Math.round((Color.alpha(i4) * f5) + (Color.alpha(i5) * f4)), Math.round((Color.red(i4) * f5) + (Color.red(i5) * f4)), Math.round((Color.green(i4) * f5) + (Color.green(i5) * f4)), Math.round((Color.blue(i4) * f5) + (Color.blue(i5) * f4)));
    }

    private float a0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void b(boolean z3) {
        float f4;
        int i4;
        StaticLayout staticLayout;
        i(1.0f, z3);
        CharSequence charSequence = this.f32551H;
        if (charSequence != null && (staticLayout = this.f32591k0) != null) {
            this.f32599o0 = TextUtils.ellipsize(charSequence, this.f32565V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f32599o0;
        float f5 = 0.0f;
        if (charSequence2 != null) {
            this.f32593l0 = a0(this.f32565V, charSequence2);
        } else {
            this.f32593l0 = 0.0f;
        }
        int d4 = androidx.core.view.C.d(this.f32592l, this.f32552I ? 1 : 0);
        int i5 = d4 & 112;
        if (i5 != 48) {
            if (i5 != 80) {
                this.f32606s = this.f32586i.centerY() - ((this.f32565V.descent() - this.f32565V.ascent()) / 2.0f);
            } else {
                this.f32606s = this.f32586i.bottom + this.f32565V.ascent();
            }
        } else {
            this.f32606s = this.f32586i.top;
        }
        int i6 = d4 & androidx.core.view.C.f13103d;
        if (i6 != 1) {
            if (i6 != 5) {
                this.f32609u = this.f32586i.left;
            } else {
                this.f32609u = this.f32586i.right - this.f32593l0;
            }
        } else {
            this.f32609u = this.f32586i.centerX() - (this.f32593l0 / 2.0f);
        }
        i(0.0f, z3);
        StaticLayout staticLayout2 = this.f32591k0;
        if (staticLayout2 != null) {
            f4 = staticLayout2.getHeight();
        } else {
            f4 = 0.0f;
        }
        StaticLayout staticLayout3 = this.f32591k0;
        if (staticLayout3 != null && this.f32601p0 > 1) {
            f5 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.f32551H;
            if (charSequence3 != null) {
                f5 = a0(this.f32565V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f32591k0;
        if (staticLayout4 != null) {
            i4 = staticLayout4.getLineCount();
        } else {
            i4 = 0;
        }
        this.f32602q = i4;
        int d5 = androidx.core.view.C.d(this.f32590k, this.f32552I ? 1 : 0);
        int i7 = d5 & 112;
        if (i7 != 48) {
            if (i7 != 80) {
                this.f32604r = this.f32584h.centerY() - (f4 / 2.0f);
            } else {
                this.f32604r = (this.f32584h.bottom - f4) + this.f32565V.descent();
            }
        } else {
            this.f32604r = this.f32584h.top;
        }
        int i8 = d5 & androidx.core.view.C.f13103d;
        if (i8 != 1) {
            if (i8 != 5) {
                this.f32608t = this.f32584h.left;
            } else {
                this.f32608t = this.f32584h.right - f5;
            }
        } else {
            this.f32608t = this.f32584h.centerX() - (f5 / 2.0f);
        }
        j();
        D0(this.f32574c);
    }

    private void c() {
        g(this.f32574c);
    }

    private float d(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        float f5 = this.f32580f;
        if (f4 <= f5) {
            return com.google.android.material.animation.a.b(1.0f, 0.0f, this.f32578e, f5, f4);
        }
        return com.google.android.material.animation.a.b(0.0f, 1.0f, f5, 1.0f, f4);
    }

    private float e() {
        float f4 = this.f32578e;
        return f4 + ((1.0f - f4) * 0.5f);
    }

    private static boolean e0(@N Rect rect, int i4, int i5, int i6, int i7) {
        if (rect.left == i4 && rect.top == i5 && rect.right == i6 && rect.bottom == i7) {
            return true;
        }
        return false;
    }

    private boolean f(@N CharSequence charSequence) {
        boolean U3 = U();
        if (this.f32553J) {
            return X(charSequence, U3);
        }
        return U3;
    }

    private void g(float f4) {
        float f5;
        S(f4);
        if (this.f32576d) {
            if (f4 < this.f32580f) {
                this.f32610v = this.f32608t;
                this.f32611w = this.f32604r;
                D0(0.0f);
                f5 = 0.0f;
            } else {
                this.f32610v = this.f32609u;
                this.f32611w = this.f32606s - Math.max(0, this.f32582g);
                D0(1.0f);
                f5 = 1.0f;
            }
        } else {
            this.f32610v = Y(this.f32608t, this.f32609u, f4, this.f32567X);
            this.f32611w = Y(this.f32604r, this.f32606s, f4, this.f32567X);
            D0(f4);
            f5 = f4;
        }
        TimeInterpolator timeInterpolator = com.google.android.material.animation.a.f31208b;
        i0(1.0f - Y(0.0f, 1.0f, 1.0f - f4, timeInterpolator));
        t0(Y(1.0f, 0.0f, f4, timeInterpolator));
        if (this.f32600p != this.f32598o) {
            this.f32565V.setColor(a(y(), w(), f5));
        } else {
            this.f32565V.setColor(w());
        }
        float f6 = this.f32585h0;
        float f7 = this.f32587i0;
        if (f6 != f7) {
            this.f32565V.setLetterSpacing(Y(f7, f6, f4, timeInterpolator));
        } else {
            this.f32565V.setLetterSpacing(f6);
        }
        this.f32559P = Y(this.f32577d0, this.f32569Z, f4, null);
        this.f32560Q = Y(this.f32579e0, this.f32571a0, f4, null);
        this.f32561R = Y(this.f32581f0, this.f32573b0, f4, null);
        int a4 = a(x(this.f32583g0), x(this.f32575c0), f4);
        this.f32562S = a4;
        this.f32565V.setShadowLayer(this.f32559P, this.f32560Q, this.f32561R, a4);
        if (this.f32576d) {
            this.f32565V.setAlpha((int) (d(f4) * this.f32565V.getAlpha()));
        }
        C0823k0.n1(this.f32570a);
    }

    private void h(float f4) {
        i(f4, false);
    }

    private void i(float f4, boolean z3) {
        boolean z4;
        float f5;
        float f6;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this.f32550G == null) {
            return;
        }
        float width = this.f32586i.width();
        float width2 = this.f32584h.width();
        boolean z8 = false;
        int i4 = 1;
        if (T(f4, 1.0f)) {
            f5 = this.f32596n;
            f6 = this.f32585h0;
            this.f32557N = 1.0f;
            Typeface typeface = this.f32547D;
            Typeface typeface2 = this.f32612x;
            if (typeface != typeface2) {
                this.f32547D = typeface2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            float f7 = this.f32594m;
            float f8 = this.f32587i0;
            Typeface typeface3 = this.f32547D;
            Typeface typeface4 = this.f32544A;
            if (typeface3 != typeface4) {
                this.f32547D = typeface4;
                z4 = true;
            } else {
                z4 = false;
            }
            if (T(f4, 0.0f)) {
                this.f32557N = 1.0f;
            } else {
                this.f32557N = Y(this.f32594m, this.f32596n, f4, this.f32568Y) / this.f32594m;
            }
            float f9 = this.f32596n / this.f32594m;
            float f10 = width2 * f9;
            if (z3 || f10 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f9, width2);
            }
            f5 = f7;
            f6 = f8;
            z5 = z4;
        }
        if (width > 0.0f) {
            if (this.f32558O != f5) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (this.f32589j0 != f6) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z6 && !z7 && !this.f32564U && !z5) {
                z5 = false;
            } else {
                z5 = true;
            }
            this.f32558O = f5;
            this.f32589j0 = f6;
            this.f32564U = false;
        }
        if (this.f32551H == null || z5) {
            this.f32565V.setTextSize(this.f32558O);
            this.f32565V.setTypeface(this.f32547D);
            this.f32565V.setLetterSpacing(this.f32589j0);
            TextPaint textPaint = this.f32565V;
            if (this.f32557N != 1.0f) {
                z8 = true;
            }
            textPaint.setLinearText(z8);
            this.f32552I = f(this.f32550G);
            if (N0()) {
                i4 = this.f32601p0;
            }
            StaticLayout k4 = k(i4, width, this.f32552I);
            this.f32591k0 = k4;
            this.f32551H = k4.getText();
        }
    }

    private void i0(float f4) {
        this.f32595m0 = f4;
        C0823k0.n1(this.f32570a);
    }

    private void j() {
        Bitmap bitmap = this.f32555L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32555L = null;
        }
    }

    private StaticLayout k(int i4, float f4, boolean z3) {
        StaticLayout staticLayout;
        Layout.Alignment N3;
        try {
            if (i4 == 1) {
                N3 = Layout.Alignment.ALIGN_NORMAL;
            } else {
                N3 = N();
            }
            staticLayout = s.c(this.f32550G, this.f32565V, (int) f4).e(TextUtils.TruncateAt.END).i(z3).d(N3).h(false).k(i4).j(this.f32603q0, this.f32605r0).g(this.f32607s0).a();
        } catch (s.a e4) {
            Log.e(f32539u0, e4.getCause().getMessage(), e4);
            staticLayout = null;
        }
        return (StaticLayout) androidx.core.util.u.l(staticLayout);
    }

    private void m(@N Canvas canvas, float f4, float f5) {
        int alpha = this.f32565V.getAlpha();
        canvas.translate(f4, f5);
        float f6 = alpha;
        this.f32565V.setAlpha((int) (this.f32597n0 * f6));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            TextPaint textPaint = this.f32565V;
            textPaint.setShadowLayer(this.f32559P, this.f32560Q, this.f32561R, com.google.android.material.color.s.a(this.f32562S, textPaint.getAlpha()));
        }
        this.f32591k0.draw(canvas);
        this.f32565V.setAlpha((int) (this.f32595m0 * f6));
        if (i4 >= 31) {
            TextPaint textPaint2 = this.f32565V;
            textPaint2.setShadowLayer(this.f32559P, this.f32560Q, this.f32561R, com.google.android.material.color.s.a(this.f32562S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f32591k0.getLineBaseline(0);
        CharSequence charSequence = this.f32599o0;
        float f7 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, this.f32565V);
        if (i4 >= 31) {
            this.f32565V.setShadowLayer(this.f32559P, this.f32560Q, this.f32561R, this.f32562S);
        }
        if (!this.f32576d) {
            String trim = this.f32599o0.toString().trim();
            if (trim.endsWith(f32540v0)) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f32565V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f32591k0.getLineEnd(0), str.length()), 0.0f, f7, (Paint) this.f32565V);
        }
    }

    private void n() {
        if (this.f32555L == null && !this.f32584h.isEmpty() && !TextUtils.isEmpty(this.f32551H)) {
            g(0.0f);
            int width = this.f32591k0.getWidth();
            int height = this.f32591k0.getHeight();
            if (width > 0 && height > 0) {
                this.f32555L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f32591k0.draw(new Canvas(this.f32555L));
                if (this.f32556M == null) {
                    this.f32556M = new Paint(3);
                }
            }
        }
    }

    private boolean n0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f32549F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f32614z != typeface) {
            this.f32614z = typeface;
            Typeface b4 = com.google.android.material.resources.j.b(this.f32570a.getContext().getResources().getConfiguration(), typeface);
            this.f32613y = b4;
            if (b4 == null) {
                b4 = this.f32614z;
            }
            this.f32612x = b4;
            return true;
        }
        return false;
    }

    private float s(int i4, int i5) {
        if (i5 != 17 && (i5 & 7) != 1) {
            if ((i5 & androidx.core.view.C.f13102c) != 8388613 && (i5 & 5) != 5) {
                if (this.f32552I) {
                    return this.f32586i.right - this.f32593l0;
                }
                return this.f32586i.left;
            }
            if (this.f32552I) {
                return this.f32586i.left;
            }
            return this.f32586i.right - this.f32593l0;
        }
        return (i4 / 2.0f) - (this.f32593l0 / 2.0f);
    }

    private float t(@N RectF rectF, int i4, int i5) {
        if (i5 != 17 && (i5 & 7) != 1) {
            if ((i5 & androidx.core.view.C.f13102c) != 8388613 && (i5 & 5) != 5) {
                if (this.f32552I) {
                    return this.f32586i.right;
                }
                return rectF.left + this.f32593l0;
            }
            if (this.f32552I) {
                return rectF.left + this.f32593l0;
            }
            return this.f32586i.right;
        }
        return (i4 / 2.0f) + (this.f32593l0 / 2.0f);
    }

    private void t0(float f4) {
        this.f32597n0 = f4;
        C0823k0.n1(this.f32570a);
    }

    @InterfaceC0569l
    private int x(@P ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f32563T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    @InterfaceC0569l
    private int y() {
        return x(this.f32598o);
    }

    private boolean y0(Typeface typeface) {
        com.google.android.material.resources.a aVar = this.f32548E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f32546C != typeface) {
            this.f32546C = typeface;
            Typeface b4 = com.google.android.material.resources.j.b(this.f32570a.getContext().getResources().getConfiguration(), typeface);
            this.f32545B = b4;
            if (b4 == null) {
                b4 = this.f32546C;
            }
            this.f32544A = b4;
            return true;
        }
        return false;
    }

    public ColorStateList A() {
        return this.f32598o;
    }

    public void A0(boolean z3) {
        this.f32576d = z3;
    }

    public float B() {
        R(this.f32566W);
        return (-this.f32566W.ascent()) + this.f32566W.descent();
    }

    public void B0(float f4) {
        this.f32578e = f4;
        this.f32580f = e();
    }

    public int C() {
        return this.f32590k;
    }

    @W(23)
    public void C0(int i4) {
        this.f32607s0 = i4;
    }

    public float D() {
        R(this.f32566W);
        return -this.f32566W.ascent();
    }

    public float E() {
        return this.f32594m;
    }

    @W(23)
    public void E0(float f4) {
        this.f32603q0 = f4;
    }

    public Typeface F() {
        Typeface typeface = this.f32544A;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    @W(23)
    public void F0(@InterfaceC0580x(from = 0.0d) float f4) {
        this.f32605r0 = f4;
    }

    public float G() {
        return this.f32574c;
    }

    public void G0(int i4) {
        if (i4 != this.f32601p0) {
            this.f32601p0 = i4;
            j();
            c0();
        }
    }

    public float H() {
        return this.f32580f;
    }

    public void H0(TimeInterpolator timeInterpolator) {
        this.f32567X = timeInterpolator;
        c0();
    }

    @W(23)
    public int I() {
        return this.f32607s0;
    }

    public void I0(boolean z3) {
        this.f32553J = z3;
    }

    public int J() {
        StaticLayout staticLayout = this.f32591k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean J0(int[] iArr) {
        this.f32563T = iArr;
        if (W()) {
            c0();
            return true;
        }
        return false;
    }

    @W(23)
    public float K() {
        return this.f32591k0.getSpacingAdd();
    }

    public void K0(@P CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f32550G, charSequence)) {
            this.f32550G = charSequence;
            this.f32551H = null;
            j();
            c0();
        }
    }

    @W(23)
    public float L() {
        return this.f32591k0.getSpacingMultiplier();
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.f32568Y = timeInterpolator;
        c0();
    }

    public int M() {
        return this.f32601p0;
    }

    public void M0(Typeface typeface) {
        boolean n02 = n0(typeface);
        boolean y02 = y0(typeface);
        if (n02 || y02) {
            c0();
        }
    }

    @P
    public TimeInterpolator O() {
        return this.f32567X;
    }

    @P
    public CharSequence P() {
        return this.f32550G;
    }

    public boolean V() {
        return this.f32553J;
    }

    public final boolean W() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f32600p;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f32598o) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    public void Z(@N Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f32614z;
            if (typeface != null) {
                this.f32613y = com.google.android.material.resources.j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f32546C;
            if (typeface2 != null) {
                this.f32545B = com.google.android.material.resources.j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f32613y;
            if (typeface3 == null) {
                typeface3 = this.f32614z;
            }
            this.f32612x = typeface3;
            Typeface typeface4 = this.f32545B;
            if (typeface4 == null) {
                typeface4 = this.f32546C;
            }
            this.f32544A = typeface4;
            d0(true);
        }
    }

    void b0() {
        boolean z3;
        if (this.f32586i.width() > 0 && this.f32586i.height() > 0 && this.f32584h.width() > 0 && this.f32584h.height() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f32572b = z3;
    }

    public void c0() {
        d0(false);
    }

    public void d0(boolean z3) {
        if ((this.f32570a.getHeight() > 0 && this.f32570a.getWidth() > 0) || z3) {
            b(z3);
            c();
        }
    }

    public void f0(int i4, int i5, int i6, int i7) {
        if (!e0(this.f32586i, i4, i5, i6, i7)) {
            this.f32586i.set(i4, i5, i6, i7);
            this.f32564U = true;
            b0();
        }
    }

    public void g0(@N Rect rect) {
        f0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void h0(int i4) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f32570a.getContext(), i4);
        if (dVar.i() != null) {
            this.f32600p = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f32596n = dVar.j();
        }
        ColorStateList colorStateList = dVar.f33015c;
        if (colorStateList != null) {
            this.f32575c0 = colorStateList;
        }
        this.f32571a0 = dVar.f33020h;
        this.f32573b0 = dVar.f33021i;
        this.f32569Z = dVar.f33022j;
        this.f32585h0 = dVar.f33024l;
        com.google.android.material.resources.a aVar = this.f32549F;
        if (aVar != null) {
            aVar.c();
        }
        this.f32549F = new com.google.android.material.resources.a(new a(), dVar.e());
        dVar.h(this.f32570a.getContext(), this.f32549F);
        c0();
    }

    public void j0(ColorStateList colorStateList) {
        if (this.f32600p != colorStateList) {
            this.f32600p = colorStateList;
            c0();
        }
    }

    public void k0(int i4) {
        if (this.f32592l != i4) {
            this.f32592l = i4;
            c0();
        }
    }

    public void l(@N Canvas canvas) {
        boolean z3;
        int save = canvas.save();
        if (this.f32551H != null && this.f32572b) {
            this.f32565V.setTextSize(this.f32558O);
            float f4 = this.f32610v;
            float f5 = this.f32611w;
            if (this.f32554K && this.f32555L != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            float f6 = this.f32557N;
            if (f6 != 1.0f && !this.f32576d) {
                canvas.scale(f6, f6, f4, f5);
            }
            if (z3) {
                canvas.drawBitmap(this.f32555L, f4, f5, this.f32556M);
                canvas.restoreToCount(save);
                return;
            }
            if (N0() && (!this.f32576d || this.f32574c > this.f32580f)) {
                m(canvas, this.f32610v - this.f32591k0.getLineStart(0), f5);
            } else {
                canvas.translate(f4, f5);
                this.f32591k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void l0(float f4) {
        if (this.f32596n != f4) {
            this.f32596n = f4;
            c0();
        }
    }

    public void m0(Typeface typeface) {
        if (n0(typeface)) {
            c0();
        }
    }

    public void o(@N RectF rectF, int i4, int i5) {
        this.f32552I = f(this.f32550G);
        rectF.left = s(i4, i5);
        rectF.top = this.f32586i.top;
        rectF.right = t(rectF, i4, i5);
        rectF.bottom = this.f32586i.top + r();
    }

    public void o0(int i4) {
        this.f32582g = i4;
    }

    public ColorStateList p() {
        return this.f32600p;
    }

    public void p0(int i4, int i5, int i6, int i7) {
        if (!e0(this.f32584h, i4, i5, i6, i7)) {
            this.f32584h.set(i4, i5, i6, i7);
            this.f32564U = true;
            b0();
        }
    }

    public int q() {
        return this.f32592l;
    }

    public void q0(@N Rect rect) {
        p0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public float r() {
        Q(this.f32566W);
        return -this.f32566W.ascent();
    }

    public void r0(float f4) {
        if (this.f32587i0 != f4) {
            this.f32587i0 = f4;
            c0();
        }
    }

    public void s0(int i4) {
        com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(this.f32570a.getContext(), i4);
        if (dVar.i() != null) {
            this.f32598o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f32594m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f33015c;
        if (colorStateList != null) {
            this.f32583g0 = colorStateList;
        }
        this.f32579e0 = dVar.f33020h;
        this.f32581f0 = dVar.f33021i;
        this.f32577d0 = dVar.f33022j;
        this.f32587i0 = dVar.f33024l;
        com.google.android.material.resources.a aVar = this.f32548E;
        if (aVar != null) {
            aVar.c();
        }
        this.f32548E = new com.google.android.material.resources.a(new C0288b(), dVar.e());
        dVar.h(this.f32570a.getContext(), this.f32548E);
        c0();
    }

    public float u() {
        return this.f32596n;
    }

    public void u0(ColorStateList colorStateList) {
        if (this.f32598o != colorStateList) {
            this.f32598o = colorStateList;
            c0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f32612x;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public void v0(int i4) {
        if (this.f32590k != i4) {
            this.f32590k = i4;
            c0();
        }
    }

    @InterfaceC0569l
    public int w() {
        return x(this.f32600p);
    }

    public void w0(float f4) {
        if (this.f32594m != f4) {
            this.f32594m = f4;
            c0();
        }
    }

    public void x0(Typeface typeface) {
        if (y0(typeface)) {
            c0();
        }
    }

    public int z() {
        return this.f32602q;
    }

    public void z0(float f4) {
        float d4 = C2394a.d(f4, 0.0f, 1.0f);
        if (d4 != this.f32574c) {
            this.f32574c = d4;
            c();
        }
    }
}

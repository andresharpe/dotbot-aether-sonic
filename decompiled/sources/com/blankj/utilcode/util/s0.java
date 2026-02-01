package com.blankj.utilcode.util;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import androidx.core.view.C0823k0;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25112a = -16;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: i, reason: collision with root package name */
        private static final int f25113i = 1140850688;

        /* renamed from: j, reason: collision with root package name */
        private static final int f25114j = H0.w(8.0f);

        /* renamed from: a, reason: collision with root package name */
        private float f25115a = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private float f25116b = -1.0f;

        /* renamed from: c, reason: collision with root package name */
        private float f25117c = -1.0f;

        /* renamed from: d, reason: collision with root package name */
        private float f25118d = -1.0f;

        /* renamed from: e, reason: collision with root package name */
        private float f25119e = -1.0f;

        /* renamed from: f, reason: collision with root package name */
        private int f25120f = f25113i;

        /* renamed from: g, reason: collision with root package name */
        private int f25121g = f25113i;

        /* renamed from: h, reason: collision with root package name */
        private boolean f25122h = false;

        private float b() {
            if (this.f25118d == -1.0f) {
                this.f25118d = e();
            }
            return this.f25118d;
        }

        private float c() {
            if (this.f25119e == -1.0f) {
                this.f25119e = f();
            }
            return this.f25119e;
        }

        private float d() {
            if (this.f25115a < 0.0f) {
                this.f25115a = 0.0f;
            }
            return this.f25115a;
        }

        private float e() {
            if (this.f25116b == -1.0f) {
                this.f25116b = f25114j;
            }
            return this.f25116b;
        }

        private float f() {
            if (this.f25117c == -1.0f) {
                this.f25117c = e();
            }
            return this.f25117c;
        }

        Drawable a(Drawable drawable) {
            if (drawable == null) {
                drawable = new ColorDrawable(0);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = drawable;
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, new c(drawable2, d(), e(), b(), this.f25121g, this.f25122h));
            stateListDrawable.addState(StateSet.WILD_CARD, new c(drawable2, d(), f(), c(), this.f25120f, this.f25122h));
            return stateListDrawable;
        }

        public a g() {
            this.f25122h = true;
            if (this.f25115a == -1.0f) {
                return this;
            }
            throw new IllegalArgumentException("Set circle needn't set radius.");
        }

        public a h(int i4) {
            return i(i4, i4);
        }

        public a i(int i4, int i5) {
            this.f25120f = i4;
            this.f25121g = i5;
            return this;
        }

        public a j(int i4) {
            return k(i4, i4);
        }

        public a k(int i4, int i5) {
            this.f25118d = i4;
            this.f25119e = i5;
            return this;
        }

        public a l(float f4) {
            this.f25115a = f4;
            if (!this.f25122h) {
                return this;
            }
            throw new IllegalArgumentException("Set circle needn't set radius.");
        }

        public a m(int i4) {
            return n(i4, i4);
        }

        public a n(int i4, int i5) {
            this.f25116b = i4;
            this.f25117c = i5;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends Drawable implements Drawable.Callback {

        /* renamed from: E, reason: collision with root package name */
        private Drawable f25123E;

        public b(Drawable drawable) {
            b(drawable);
        }

        public Drawable a() {
            return this.f25123E;
        }

        public void b(Drawable drawable) {
            Drawable drawable2 = this.f25123E;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.f25123E = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            this.f25123E.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getChangingConfigurations() {
            return this.f25123E.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable
        public Drawable getCurrent() {
            return this.f25123E.getCurrent();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.f25123E.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.f25123E.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return this.f25123E.getMinimumHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return this.f25123E.getMinimumWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.f25123E.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return this.f25123E.getPadding(rect);
        }

        @Override // android.graphics.drawable.Drawable
        public int[] getState() {
            return this.f25123E.getState();
        }

        @Override // android.graphics.drawable.Drawable
        public Region getTransparentRegion() {
            return this.f25123E.getTransparentRegion();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isAutoMirrored() {
            return androidx.core.graphics.drawable.d.h(this.f25123E);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean isStateful() {
            return this.f25123E.isStateful();
        }

        @Override // android.graphics.drawable.Drawable
        public void jumpToCurrentState() {
            androidx.core.graphics.drawable.d.i(this.f25123E);
        }

        @Override // android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            this.f25123E.setBounds(rect);
        }

        @Override // android.graphics.drawable.Drawable
        protected boolean onLevelChange(int i4) {
            return this.f25123E.setLevel(i4);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            scheduleSelf(runnable, j4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            this.f25123E.setAlpha(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAutoMirrored(boolean z3) {
            androidx.core.graphics.drawable.d.j(this.f25123E, z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setChangingConfigurations(int i4) {
            this.f25123E.setChangingConfigurations(i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            this.f25123E.setColorFilter(colorFilter);
        }

        @Override // android.graphics.drawable.Drawable
        public void setDither(boolean z3) {
            this.f25123E.setDither(z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setFilterBitmap(boolean z3) {
            this.f25123E.setFilterBitmap(z3);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            androidx.core.graphics.drawable.d.k(this.f25123E, f4, f5);
        }

        @Override // android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            androidx.core.graphics.drawable.d.l(this.f25123E, i4, i5, i6, i7);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            return this.f25123E.setState(iArr);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTint(int i4) {
            androidx.core.graphics.drawable.d.n(this.f25123E, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintList(ColorStateList colorStateList) {
            androidx.core.graphics.drawable.d.o(this.f25123E, colorStateList);
        }

        @Override // android.graphics.drawable.Drawable
        public void setTintMode(PorterDuff.Mode mode) {
            androidx.core.graphics.drawable.d.p(this.f25123E, mode);
        }

        @Override // android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            if (!super.setVisible(z3, z4) && !this.f25123E.setVisible(z3, z4)) {
                return false;
            }
            return true;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: Y, reason: collision with root package name */
        private static final double f25124Y = Math.cos(Math.toRadians(45.0d));

        /* renamed from: F, reason: collision with root package name */
        private float f25125F;

        /* renamed from: G, reason: collision with root package name */
        private float f25126G;

        /* renamed from: H, reason: collision with root package name */
        private float f25127H;

        /* renamed from: I, reason: collision with root package name */
        private float f25128I;

        /* renamed from: J, reason: collision with root package name */
        private Paint f25129J;

        /* renamed from: K, reason: collision with root package name */
        private Paint f25130K;

        /* renamed from: L, reason: collision with root package name */
        private RectF f25131L;

        /* renamed from: M, reason: collision with root package name */
        private float f25132M;

        /* renamed from: N, reason: collision with root package name */
        private Path f25133N;

        /* renamed from: O, reason: collision with root package name */
        private float f25134O;

        /* renamed from: P, reason: collision with root package name */
        private float f25135P;

        /* renamed from: Q, reason: collision with root package name */
        private float f25136Q;

        /* renamed from: R, reason: collision with root package name */
        private float f25137R;

        /* renamed from: S, reason: collision with root package name */
        private boolean f25138S;

        /* renamed from: T, reason: collision with root package name */
        private final int f25139T;

        /* renamed from: U, reason: collision with root package name */
        private final int f25140U;

        /* renamed from: V, reason: collision with root package name */
        private boolean f25141V;

        /* renamed from: W, reason: collision with root package name */
        private float f25142W;

        /* renamed from: X, reason: collision with root package name */
        private boolean f25143X;

        public c(Drawable drawable, float f4, float f5, float f6, int i4, boolean z3) {
            super(drawable);
            this.f25125F = 1.0f;
            this.f25126G = 1.0f;
            this.f25127H = 1.0f;
            this.f25128I = 1.0f;
            this.f25138S = true;
            this.f25141V = false;
            this.f25139T = i4;
            this.f25140U = i4 & C0823k0.f13588s;
            this.f25143X = z3;
            if (z3) {
                this.f25125F = 1.0f;
                this.f25126G = 1.0f;
                this.f25127H = 1.0f;
                this.f25128I = 1.0f;
            }
            Paint paint = new Paint(5);
            this.f25129J = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f25132M = Math.round(f4);
            this.f25131L = new RectF();
            Paint paint2 = new Paint(this.f25129J);
            this.f25130K = paint2;
            paint2.setAntiAlias(false);
            r(f5, f6);
        }

        private void c(Rect rect) {
            if (this.f25143X) {
                this.f25132M = rect.width() / 2;
            }
            float f4 = this.f25135P;
            float f5 = this.f25125F * f4;
            this.f25131L.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
            Drawable a4 = a();
            RectF rectF = this.f25131L;
            a4.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            d();
        }

        private void d() {
            if (this.f25143X) {
                float width = (this.f25131L.width() / 2.0f) - 1.0f;
                float f4 = -width;
                RectF rectF = new RectF(f4, f4, width, width);
                RectF rectF2 = new RectF(rectF);
                float f5 = this.f25136Q;
                rectF2.inset(-f5, -f5);
                Path path = this.f25133N;
                if (path == null) {
                    this.f25133N = new Path();
                } else {
                    path.reset();
                }
                this.f25133N.setFillType(Path.FillType.EVEN_ODD);
                this.f25133N.moveTo(f4, 0.0f);
                this.f25133N.rLineTo(-this.f25136Q, 0.0f);
                this.f25133N.arcTo(rectF2, 180.0f, 180.0f, false);
                this.f25133N.arcTo(rectF2, 0.0f, 180.0f, false);
                this.f25133N.arcTo(rectF, 180.0f, 180.0f, false);
                this.f25133N.arcTo(rectF, 0.0f, 180.0f, false);
                this.f25133N.close();
                float f6 = -rectF2.top;
                if (f6 > 0.0f) {
                    this.f25129J.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{0, this.f25139T, this.f25140U}, new float[]{0.0f, width / f6, 1.0f}, Shader.TileMode.CLAMP));
                    return;
                }
                return;
            }
            float f7 = this.f25132M;
            RectF rectF3 = new RectF(-f7, -f7, f7, f7);
            RectF rectF4 = new RectF(rectF3);
            float f8 = this.f25136Q;
            rectF4.inset(-f8, -f8);
            Path path2 = this.f25133N;
            if (path2 == null) {
                this.f25133N = new Path();
            } else {
                path2.reset();
            }
            this.f25133N.setFillType(Path.FillType.EVEN_ODD);
            this.f25133N.moveTo(-this.f25132M, 0.0f);
            this.f25133N.rLineTo(-this.f25136Q, 0.0f);
            this.f25133N.arcTo(rectF4, 180.0f, 90.0f, false);
            this.f25133N.arcTo(rectF3, 270.0f, -90.0f, false);
            this.f25133N.close();
            float f9 = -rectF4.top;
            if (f9 > 0.0f) {
                this.f25129J.setShader(new RadialGradient(0.0f, 0.0f, f9, new int[]{0, this.f25139T, this.f25140U}, new float[]{0.0f, this.f25132M / f9, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.f25130K.setShader(new LinearGradient(0.0f, rectF3.top, 0.0f, rectF4.top, this.f25139T, this.f25140U, Shader.TileMode.CLAMP));
            this.f25130K.setAntiAlias(false);
        }

        private static float e(float f4, float f5, boolean z3) {
            if (z3) {
                return (float) (f4 + ((1.0d - f25124Y) * f5));
            }
            return f4;
        }

        private float f(float f4, float f5, boolean z3) {
            if (z3) {
                return (float) ((f4 * this.f25125F) + ((1.0d - f25124Y) * f5));
            }
            return f4 * this.f25125F;
        }

        private void g(Canvas canvas) {
            boolean z3;
            boolean z4;
            float f4;
            float f5;
            float f6;
            int i4;
            float f7;
            int i5;
            float f8;
            float f9;
            float f10;
            if (this.f25143X) {
                int save = canvas.save();
                canvas.translate(this.f25131L.centerX(), this.f25131L.centerY());
                canvas.drawPath(this.f25133N, this.f25129J);
                canvas.restoreToCount(save);
                return;
            }
            int save2 = canvas.save();
            canvas.rotate(this.f25142W, this.f25131L.centerX(), this.f25131L.centerY());
            float f11 = this.f25132M;
            float f12 = (-f11) - this.f25136Q;
            float f13 = f11 * 2.0f;
            if (this.f25131L.width() - f13 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f25131L.height() - f13 > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            float f14 = this.f25137R;
            float f15 = f14 - (this.f25126G * f14);
            float f16 = f14 - (this.f25127H * f14);
            float f17 = f14 - (this.f25128I * f14);
            if (f11 == 0.0f) {
                f4 = 1.0f;
            } else {
                f4 = f11 / (f16 + f11);
            }
            if (f11 == 0.0f) {
                f5 = 1.0f;
            } else {
                f5 = f11 / (f15 + f11);
            }
            if (f11 == 0.0f) {
                f6 = 1.0f;
            } else {
                f6 = f11 / (f17 + f11);
            }
            int save3 = canvas.save();
            RectF rectF = this.f25131L;
            canvas.translate(rectF.left + f11, rectF.top + f11);
            canvas.scale(f4, f5);
            canvas.drawPath(this.f25133N, this.f25129J);
            if (z3) {
                canvas.scale(1.0f / f4, 1.0f);
                i4 = save3;
                f7 = f6;
                i5 = save2;
                f8 = f5;
                canvas.drawRect(0.0f, f12, this.f25131L.width() - f13, -this.f25132M, this.f25130K);
            } else {
                i4 = save3;
                f7 = f6;
                i5 = save2;
                f8 = f5;
            }
            canvas.restoreToCount(i4);
            int save4 = canvas.save();
            RectF rectF2 = this.f25131L;
            canvas.translate(rectF2.right - f11, rectF2.bottom - f11);
            float f18 = f7;
            canvas.scale(f4, f18);
            canvas.rotate(180.0f);
            canvas.drawPath(this.f25133N, this.f25129J);
            if (z3) {
                canvas.scale(1.0f / f4, 1.0f);
                f9 = f8;
                f10 = f18;
                canvas.drawRect(0.0f, f12, this.f25131L.width() - f13, -this.f25132M, this.f25130K);
            } else {
                f9 = f8;
                f10 = f18;
            }
            canvas.restoreToCount(save4);
            int save5 = canvas.save();
            RectF rectF3 = this.f25131L;
            canvas.translate(rectF3.left + f11, rectF3.bottom - f11);
            canvas.scale(f4, f10);
            canvas.rotate(270.0f);
            canvas.drawPath(this.f25133N, this.f25129J);
            if (z4) {
                canvas.scale(1.0f / f10, 1.0f);
                canvas.drawRect(0.0f, f12, this.f25131L.height() - f13, -this.f25132M, this.f25130K);
            }
            canvas.restoreToCount(save5);
            int save6 = canvas.save();
            RectF rectF4 = this.f25131L;
            canvas.translate(rectF4.right - f11, rectF4.top + f11);
            float f19 = f9;
            canvas.scale(f4, f19);
            canvas.rotate(90.0f);
            canvas.drawPath(this.f25133N, this.f25129J);
            if (z4) {
                canvas.scale(1.0f / f19, 1.0f);
                canvas.drawRect(0.0f, f12, this.f25131L.height() - f13, -this.f25132M, this.f25130K);
            }
            canvas.restoreToCount(save6);
            canvas.restoreToCount(i5);
        }

        private static int s(float f4) {
            int round = Math.round(f4);
            if (round % 2 == 1) {
                return round - 1;
            }
            return round;
        }

        @Override // com.blankj.utilcode.util.s0.b
        public /* bridge */ /* synthetic */ Drawable a() {
            return super.a();
        }

        @Override // com.blankj.utilcode.util.s0.b
        public /* bridge */ /* synthetic */ void b(Drawable drawable) {
            super.b(drawable);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f25138S) {
                c(getBounds());
                this.f25138S = false;
            }
            g(canvas);
            super.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getChangingConfigurations() {
            return super.getChangingConfigurations();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Drawable getCurrent() {
            return super.getCurrent();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
            return super.getIntrinsicHeight();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
            return super.getIntrinsicWidth();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumHeight() {
            return super.getMinimumHeight();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int getMinimumWidth() {
            return super.getMinimumWidth();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            int ceil = (int) Math.ceil(f(this.f25135P, this.f25132M, this.f25141V));
            int ceil2 = (int) Math.ceil(e(this.f25135P, this.f25132M, this.f25141V));
            rect.set(ceil2, ceil, ceil2, ceil);
            return true;
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ int[] getState() {
            return super.getState();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ Region getTransparentRegion() {
            return super.getTransparentRegion();
        }

        public float h() {
            return this.f25132M;
        }

        public float i() {
            return this.f25135P;
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
            super.invalidateDrawable(drawable);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
            return super.isAutoMirrored();
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean isStateful() {
            return super.isStateful();
        }

        public float j() {
            float f4 = this.f25135P;
            return (Math.max(f4, this.f25132M + ((this.f25125F * f4) / 2.0f)) * 2.0f) + (this.f25135P * this.f25125F * 2.0f);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            super.jumpToCurrentState();
        }

        public float k() {
            float f4 = this.f25135P;
            return (Math.max(f4, this.f25132M + (f4 / 2.0f)) * 2.0f) + (this.f25135P * 2.0f);
        }

        public float l() {
            return this.f25137R;
        }

        public void m(boolean z3) {
            this.f25141V = z3;
            invalidateSelf();
        }

        public void n(float f4) {
            float round = Math.round(f4);
            if (this.f25132M == round) {
                return;
            }
            this.f25132M = round;
            this.f25138S = true;
            invalidateSelf();
        }

        public void o(float f4) {
            r(this.f25137R, f4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        protected void onBoundsChange(Rect rect) {
            this.f25138S = true;
        }

        final void p(float f4) {
            if (this.f25142W != f4) {
                this.f25142W = f4;
                invalidateSelf();
            }
        }

        public void q(float f4) {
            r(f4, this.f25135P);
        }

        void r(float f4, float f5) {
            if (f4 >= 0.0f && f5 >= 0.0f) {
                float s4 = s(f4);
                float s5 = s(f5);
                if (s4 > s5) {
                    s4 = s5;
                }
                if (this.f25137R == s4 && this.f25135P == s5) {
                    return;
                }
                this.f25137R = s4;
                this.f25135P = s5;
                this.f25136Q = Math.round(s4 * this.f25125F);
                this.f25134O = s5;
                this.f25138S = true;
                invalidateSelf();
                return;
            }
            throw new IllegalArgumentException("invalid shadow size");
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
            super.scheduleDrawable(drawable, runnable, j4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            super.setAlpha(i4);
            this.f25129J.setAlpha(i4);
            this.f25130K.setAlpha(i4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z3) {
            super.setAutoMirrored(z3);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setChangingConfigurations(int i4) {
            super.setChangingConfigurations(i4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setDither(boolean z3) {
            super.setDither(z3);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z3) {
            super.setFilterBitmap(z3);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspot(float f4, float f5) {
            super.setHotspot(f4, f5);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setHotspotBounds(int i4, int i5, int i6, int i7) {
            super.setHotspotBounds(i4, i5, i6, i7);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
            return super.setState(iArr);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTint(int i4) {
            super.setTint(i4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
            super.setTintList(colorStateList);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
            super.setTintMode(mode);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public /* bridge */ /* synthetic */ boolean setVisible(boolean z3, boolean z4) {
            return super.setVisible(z3, z4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable.Callback
        public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            super.unscheduleDrawable(drawable, runnable);
        }
    }

    public static void a(View view, a aVar) {
        if (view != null && aVar != null) {
            Drawable background = view.getBackground();
            Object tag = view.getTag(f25112a);
            if (tag instanceof Drawable) {
                C0823k0.I1(view, (Drawable) tag);
                return;
            }
            Drawable a4 = aVar.a(background);
            C0823k0.I1(view, a4);
            view.setTag(f25112a, a4);
        }
    }

    public static void b(View... viewArr) {
        if (viewArr == null) {
            return;
        }
        for (View view : viewArr) {
            a(view, new a());
        }
    }
}

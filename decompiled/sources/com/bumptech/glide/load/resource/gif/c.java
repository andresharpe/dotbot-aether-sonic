package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.N;
import androidx.annotation.i0;
import androidx.vectordrawable.graphics.drawable.b;
import com.bumptech.glide.load.resource.gif.g;
import com.bumptech.glide.util.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: P, reason: collision with root package name */
    public static final int f26582P = -1;

    /* renamed from: Q, reason: collision with root package name */
    public static final int f26583Q = 0;

    /* renamed from: R, reason: collision with root package name */
    private static final int f26584R = 119;

    /* renamed from: E, reason: collision with root package name */
    private final a f26585E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f26586F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f26587G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f26588H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f26589I;

    /* renamed from: J, reason: collision with root package name */
    private int f26590J;

    /* renamed from: K, reason: collision with root package name */
    private int f26591K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f26592L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f26593M;

    /* renamed from: N, reason: collision with root package name */
    private Rect f26594N;

    /* renamed from: O, reason: collision with root package name */
    private List<b.a> f26595O;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @i0
        final g f26596a;

        a(g gVar) {
            this.f26596a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @N
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.i<Bitmap> iVar, int i4, int i5, Bitmap bitmap) {
        this(context, aVar, iVar, i4, i5, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback e() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect g() {
        if (this.f26594N == null) {
            this.f26594N = new Rect();
        }
        return this.f26594N;
    }

    private Paint l() {
        if (this.f26593M == null) {
            this.f26593M = new Paint(2);
        }
        return this.f26593M;
    }

    private void o() {
        List<b.a> list = this.f26595O;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f26595O.get(i4).b(this);
            }
        }
    }

    private void q() {
        this.f26590J = 0;
    }

    private void v() {
        l.a(!this.f26588H, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f26585E.f26596a.f() == 1) {
            invalidateSelf();
        } else if (!this.f26586F) {
            this.f26586F = true;
            this.f26585E.f26596a.v(this);
            invalidateSelf();
        }
    }

    private void w() {
        this.f26586F = false;
        this.f26585E.f26596a.w(this);
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public void a() {
        if (e() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (j() == i() - 1) {
            this.f26590J++;
        }
        int i4 = this.f26591K;
        if (i4 != -1 && this.f26590J >= i4) {
            o();
            stop();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@N b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f26595O == null) {
            this.f26595O = new ArrayList();
        }
        this.f26595O.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void c() {
        List<b.a> list = this.f26595O;
        if (list != null) {
            list.clear();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean d(@N b.a aVar) {
        List<b.a> list = this.f26595O;
        if (list != null && aVar != null) {
            return list.remove(aVar);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@N Canvas canvas) {
        if (this.f26588H) {
            return;
        }
        if (this.f26592L) {
            Gravity.apply(f26584R, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), g());
            this.f26592L = false;
        }
        canvas.drawBitmap(this.f26585E.f26596a.c(), (Rect) null, g(), l());
    }

    public ByteBuffer f() {
        return this.f26585E.f26596a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f26585E;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26585E.f26596a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26585E.f26596a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap h() {
        return this.f26585E.f26596a.e();
    }

    public int i() {
        return this.f26585E.f26596a.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f26586F;
    }

    public int j() {
        return this.f26585E.f26596a.d();
    }

    public com.bumptech.glide.load.i<Bitmap> k() {
        return this.f26585E.f26596a.h();
    }

    public int m() {
        return this.f26585E.f26596a.l();
    }

    boolean n() {
        return this.f26588H;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26592L = true;
    }

    public void p() {
        this.f26588H = true;
        this.f26585E.f26596a.a();
    }

    public void r(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this.f26585E.f26596a.q(iVar, bitmap);
    }

    void s(boolean z3) {
        this.f26586F = z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        l().setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        l().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        l.a(!this.f26588H, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f26589I = z3;
        if (!z3) {
            w();
        } else if (this.f26587G) {
            v();
        }
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f26587G = true;
        q();
        if (this.f26589I) {
            v();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f26587G = false;
        w();
    }

    public void t(int i4) {
        int i5 = -1;
        if (i4 <= 0 && i4 != -1 && i4 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i4 == 0) {
            int j4 = this.f26585E.f26596a.j();
            if (j4 != 0) {
                i5 = j4;
            }
            this.f26591K = i5;
            return;
        }
        this.f26591K = i4;
    }

    public void u() {
        l.a(!this.f26586F, "You cannot restart a currently running animation.");
        this.f26585E.f26596a.r();
        start();
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.i<Bitmap> iVar, int i4, int i5, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.e(context), aVar, i4, i5, iVar, bitmap)));
    }

    c(a aVar) {
        this.f26589I = true;
        this.f26591K = -1;
        this.f26585E = (a) l.d(aVar);
    }

    @i0
    c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f26593M = paint;
    }
}

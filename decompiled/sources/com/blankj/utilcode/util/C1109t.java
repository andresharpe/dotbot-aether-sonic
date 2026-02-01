package com.blankj.utilcode.util;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.util.Log;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import androidx.core.view.C0823k0;
import com.blankj.utilcode.util.s0;

/* renamed from: com.blankj.utilcode.util.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1109t {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25144a = -1;

    /* renamed from: b, reason: collision with root package name */
    private static final float f25145b = -0.06f;

    /* renamed from: c, reason: collision with root package name */
    private static final int f25146c = -2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f25147d = -3;

    /* renamed from: e, reason: collision with root package name */
    private static final float f25148e = 0.8f;

    /* renamed from: f, reason: collision with root package name */
    private static final int f25149f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final float f25150g = 0.9f;

    /* renamed from: h, reason: collision with root package name */
    private static final int f25151h = 5;

    /* renamed from: i, reason: collision with root package name */
    private static final float f25152i = 0.9f;

    /* renamed from: j, reason: collision with root package name */
    private static final long f25153j = 1000;

    /* renamed from: k, reason: collision with root package name */
    private static final long f25154k = 2000;

    /* renamed from: l, reason: collision with root package name */
    private static long f25155l;

    /* renamed from: m, reason: collision with root package name */
    private static int f25156m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.blankj.utilcode.util.t$a */
    /* loaded from: classes.dex */
    public class a extends e {

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f25157I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z3, long j4, View.OnClickListener onClickListener) {
            super(z3, j4);
            this.f25157I = onClickListener;
        }

        @Override // com.blankj.utilcode.util.C1109t.e
        public void c(View view) {
            this.f25157I.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.blankj.utilcode.util.t$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f25158E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f25159F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f25160G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f25161H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f25162I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ View f25163J;

        b(View view, int i4, int i5, int i6, int i7, View view2) {
            this.f25158E = view;
            this.f25159F = i4;
            this.f25160G = i5;
            this.f25161H = i6;
            this.f25162I = i7;
            this.f25163J = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f25158E.getHitRect(rect);
            rect.top -= this.f25159F;
            rect.bottom += this.f25160G;
            rect.left -= this.f25161H;
            rect.right += this.f25162I;
            this.f25163J.setTouchDelegate(new TouchDelegate(rect, this.f25158E));
        }
    }

    /* renamed from: com.blankj.utilcode.util.t$c */
    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f25164a = new a();

        /* renamed from: com.blankj.utilcode.util.t$c$a */
        /* loaded from: classes.dex */
        class a implements c {
            a() {
            }

            @Override // com.blankj.utilcode.util.C1109t.c
            public void a(CharSequence charSequence, long j4) {
                H0.d1(charSequence);
            }

            @Override // com.blankj.utilcode.util.C1109t.c
            public void dismiss() {
                H0.c1();
            }
        }

        void a(CharSequence charSequence, long j4);

        void dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.blankj.utilcode.util.t$d */
    /* loaded from: classes.dex */
    public static class d extends s0.b {

        /* renamed from: F, reason: collision with root package name */
        private BitmapDrawable f25165F;

        /* renamed from: G, reason: collision with root package name */
        private Paint f25166G;

        public d(Drawable drawable) {
            super(drawable);
            this.f25165F = null;
            this.f25166G = null;
            if (drawable instanceof ColorDrawable) {
                Paint paint = new Paint(5);
                this.f25166G = paint;
                paint.setColor(((ColorDrawable) drawable).getColor());
            }
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f25165F == null) {
                Bitmap createBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                if (this.f25166G != null) {
                    canvas2.drawRect(getBounds(), this.f25166G);
                } else {
                    super.draw(canvas2);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), createBitmap);
                this.f25165F = bitmapDrawable;
                bitmapDrawable.setBounds(getBounds());
            }
            this.f25165F.draw(canvas);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public void setAlpha(int i4) {
            super.setAlpha(i4);
        }

        @Override // com.blankj.utilcode.util.s0.b, android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            super.setColorFilter(colorFilter);
        }
    }

    /* renamed from: com.blankj.utilcode.util.t$e */
    /* loaded from: classes.dex */
    public static abstract class e implements View.OnClickListener {

        /* renamed from: G, reason: collision with root package name */
        private static boolean f25167G = true;

        /* renamed from: H, reason: collision with root package name */
        private static final Runnable f25168H = new a();

        /* renamed from: E, reason: collision with root package name */
        private long f25169E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f25170F;

        /* renamed from: com.blankj.utilcode.util.t$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean unused = e.f25167G = true;
            }
        }

        public e() {
            this(true, 1000L);
        }

        private static boolean b(@androidx.annotation.N View view, long j4) {
            return H0.E0(view, j4);
        }

        public abstract void c(View view);

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.f25170F) {
                if (f25167G) {
                    f25167G = false;
                    view.postDelayed(f25168H, this.f25169E);
                    c(view);
                    return;
                }
                return;
            }
            if (b(view, this.f25169E)) {
                c(view);
            }
        }

        public e(boolean z3) {
            this(z3, 1000L);
        }

        public e(long j4) {
            this(true, j4);
        }

        public e(boolean z3, long j4) {
            this.f25170F = z3;
            this.f25169E = j4;
        }
    }

    /* renamed from: com.blankj.utilcode.util.t$f */
    /* loaded from: classes.dex */
    public static abstract class f implements View.OnClickListener {

        /* renamed from: I, reason: collision with root package name */
        private static final long f25171I = 666;

        /* renamed from: E, reason: collision with root package name */
        private final int f25172E;

        /* renamed from: F, reason: collision with root package name */
        private final long f25173F;

        /* renamed from: G, reason: collision with root package name */
        private long f25174G;

        /* renamed from: H, reason: collision with root package name */
        private int f25175H;

        public f(int i4) {
            this(i4, f25171I);
        }

        public abstract void a(View view, int i4);

        public abstract void b(View view);

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f25172E <= 1) {
                b(view);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f25174G < this.f25173F) {
                int i4 = this.f25175H + 1;
                this.f25175H = i4;
                int i5 = this.f25172E;
                if (i4 == i5) {
                    b(view);
                } else if (i4 < i5) {
                    a(view, i4);
                } else {
                    this.f25175H = 1;
                    a(view, 1);
                }
            } else {
                this.f25175H = 1;
                a(view, 1);
            }
            this.f25174G = currentTimeMillis;
        }

        public f(int i4, long j4) {
            this.f25172E = i4;
            this.f25173F = j4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.blankj.utilcode.util.t$g */
    /* loaded from: classes.dex */
    public static class g implements View.OnTouchListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.blankj.utilcode.util.t$g$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final g f25176a = new g(null);

            private a() {
            }
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        public static g a() {
            return a.f25176a;
        }

        private void b(View view, boolean z3) {
            int i4;
            if (z3) {
                i4 = -2;
            } else {
                i4 = -3;
            }
            Object tag = view.getTag(i4);
            if (!(tag instanceof Float)) {
                return;
            }
            view.setAlpha(((Float) tag).floatValue());
        }

        private void c(View view, boolean z3) {
            Object tag = view.getTag(-1);
            if (!(tag instanceof Float)) {
                return;
            }
            float f4 = 1.0f;
            if (z3) {
                f4 = 1.0f + ((Float) tag).floatValue();
            }
            view.animate().scaleX(f4).scaleY(f4).setDuration(200L).start();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                c(view, true);
                b(view, true);
            } else if (action == 1 || action == 3) {
                c(view, false);
                b(view, false);
            }
            return false;
        }

        private g() {
        }
    }

    private C1109t() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void A(@androidx.annotation.N View view, int i4, int i5, int i6, int i7) {
        View view2 = (View) view.getParent();
        if (view2 == null) {
            Log.e("ClickUtils", "expandClickArea must have parent view.");
        } else {
            view2.post(new b(view, i4, i7, i5, i6, view2));
        }
    }

    private static ColorMatrixColorFilter B(float f4) {
        return new ColorMatrixColorFilter(new ColorMatrix(new float[]{f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f}));
    }

    private static void a(View[] viewArr, boolean z3, @androidx.annotation.F(from = 0) long j4, View.OnClickListener onClickListener) {
        if (viewArr != null && viewArr.length != 0 && onClickListener != null) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setOnClickListener(new a(z3, j4, onClickListener));
                }
            }
        }
    }

    public static void b(View view, @androidx.annotation.F(from = 0) long j4, View.OnClickListener onClickListener) {
        d(new View[]{view}, j4, onClickListener);
    }

    public static void c(View view, View.OnClickListener onClickListener) {
        e(new View[]{view}, onClickListener);
    }

    public static void d(View[] viewArr, @androidx.annotation.F(from = 0) long j4, View.OnClickListener onClickListener) {
        a(viewArr, true, j4, onClickListener);
    }

    public static void e(View[] viewArr, View.OnClickListener onClickListener) {
        d(viewArr, 1000L, onClickListener);
    }

    public static void f(View view) {
        g(view, 0.9f);
    }

    public static void g(View view, float f4) {
        j(view, 4, f4);
    }

    public static void h(View view) {
        i(view, 0.9f);
    }

    public static void i(View view, float f4) {
        j(view, 5, f4);
    }

    private static void j(View view, int i4, float f4) {
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        int i5 = -i4;
        Object tag = view.getTag(i5);
        if (tag instanceof Drawable) {
            C0823k0.I1(view, (Drawable) tag);
            return;
        }
        Drawable y3 = y(background, i4, f4);
        C0823k0.I1(view, y3);
        view.setTag(i5, y3);
    }

    public static void k(View view, float f4) {
        if (view == null) {
            return;
        }
        view.setTag(-2, Float.valueOf(f4));
        view.setTag(-3, Float.valueOf(view.getAlpha()));
        view.setClickable(true);
        view.setOnTouchListener(g.a());
    }

    public static void l(View... viewArr) {
        m(viewArr, null);
    }

    public static void m(View[] viewArr, float[] fArr) {
        if (viewArr != null && viewArr.length != 0) {
            for (int i4 = 0; i4 < viewArr.length; i4++) {
                if (fArr != null && i4 < fArr.length) {
                    k(viewArr[i4], fArr[i4]);
                } else {
                    k(viewArr[i4], f25148e);
                }
            }
        }
    }

    public static void n(View view, float f4) {
        if (view == null) {
            return;
        }
        view.setTag(-1, Float.valueOf(f4));
        view.setClickable(true);
        view.setOnTouchListener(g.a());
    }

    public static void o(View... viewArr) {
        p(viewArr, null);
    }

    public static void p(View[] viewArr, float[] fArr) {
        if (viewArr != null && viewArr.length != 0) {
            for (int i4 = 0; i4 < viewArr.length; i4++) {
                if (fArr != null && i4 < fArr.length) {
                    n(viewArr[i4], fArr[i4]);
                } else {
                    n(viewArr[i4], f25145b);
                }
            }
        }
    }

    public static void q(View view, @androidx.annotation.F(from = 0) long j4, View.OnClickListener onClickListener) {
        s(new View[]{view}, j4, onClickListener);
    }

    public static void r(View view, View.OnClickListener onClickListener) {
        t(new View[]{view}, onClickListener);
    }

    public static void s(View[] viewArr, @androidx.annotation.F(from = 0) long j4, View.OnClickListener onClickListener) {
        a(viewArr, false, j4, onClickListener);
    }

    public static void t(View[] viewArr, View.OnClickListener onClickListener) {
        s(viewArr, 1000L, onClickListener);
    }

    public static void u(CharSequence charSequence) {
        v(charSequence, f25154k, c.f25164a);
    }

    public static void v(@androidx.annotation.N CharSequence charSequence, long j4, @androidx.annotation.N c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - f25155l) < j4) {
            int i4 = f25156m + 1;
            f25156m = i4;
            if (i4 == 2) {
                H0.Z0();
                cVar.dismiss();
                f25155l = 0L;
                return;
            }
            return;
        }
        f25156m = 1;
        cVar.a(charSequence, j4);
        f25155l = elapsedRealtime;
    }

    private static Drawable w(Drawable drawable, float f4) {
        d dVar = new d(drawable);
        dVar.setAlpha((int) (f4 * 255.0f));
        return dVar;
    }

    private static Drawable x(Drawable drawable, float f4) {
        d dVar = new d(drawable);
        dVar.setColorFilter(B(f4));
        return dVar;
    }

    private static Drawable y(Drawable drawable, int i4, float f4) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        if (drawable.getConstantState() == null) {
            return drawable;
        }
        Drawable mutate = drawable.getConstantState().newDrawable().mutate();
        if (i4 == 4) {
            mutate = w(mutate, f4);
        } else if (i4 == 5) {
            mutate = x(mutate, f4);
        }
        Drawable w3 = w(drawable.getConstantState().newDrawable().mutate(), 0.5f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, mutate);
        stateListDrawable.addState(new int[]{-16842910}, w3);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    public static void z(@androidx.annotation.N View view, int i4) {
        A(view, i4, i4, i4, i4);
    }
}

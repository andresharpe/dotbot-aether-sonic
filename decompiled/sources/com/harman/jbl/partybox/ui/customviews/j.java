package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class j extends View {

    /* renamed from: a0, reason: collision with root package name */
    private static final String f42724a0 = "j";

    /* renamed from: E, reason: collision with root package name */
    private int f42725E;

    /* renamed from: F, reason: collision with root package name */
    private int f42726F;

    /* renamed from: G, reason: collision with root package name */
    private int f42727G;

    /* renamed from: H, reason: collision with root package name */
    private int f42728H;

    /* renamed from: I, reason: collision with root package name */
    private int f42729I;

    /* renamed from: J, reason: collision with root package name */
    private Paint f42730J;

    /* renamed from: K, reason: collision with root package name */
    private Paint f42731K;

    /* renamed from: L, reason: collision with root package name */
    private Paint f42732L;

    /* renamed from: M, reason: collision with root package name */
    private Rect f42733M;

    /* renamed from: N, reason: collision with root package name */
    private Bitmap f42734N;

    /* renamed from: O, reason: collision with root package name */
    private float f42735O;

    /* renamed from: P, reason: collision with root package name */
    private float f42736P;

    /* renamed from: Q, reason: collision with root package name */
    private int f42737Q;

    /* renamed from: R, reason: collision with root package name */
    private int f42738R;

    /* renamed from: S, reason: collision with root package name */
    private Bitmap f42739S;

    /* renamed from: T, reason: collision with root package name */
    private b f42740T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f42741U;

    /* renamed from: V, reason: collision with root package name */
    private int f42742V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f42743W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f42734N = BitmapFactory.decodeResource(jVar.getResources(), j.f.f41117w0);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(int i4, float f4, float f5, int i5);
    }

    public j(Context context) {
        super(context);
        this.f42727G = 60;
        this.f42728H = 15;
        this.f42735O = -1.0f;
        this.f42736P = -1.0f;
        this.f42741U = true;
        this.f42742V = 0;
        this.f42743W = false;
        d();
    }

    private boolean b(float f4, float f5) {
        if (((float) Math.sqrt(Math.pow(f4 - (this.f42725E / 2), 2.0d) + Math.pow(f5 - (this.f42726F / 2), 2.0d))) > this.f42729I - 10) {
            return true;
        }
        return false;
    }

    private void c(Canvas canvas) {
        canvas.drawColor(0);
        canvas.drawBitmap(this.f42734N, (Rect) null, this.f42733M, this.f42732L);
        float f4 = this.f42735O;
        if (f4 >= 0.0f) {
            float f5 = this.f42736P;
            if (f5 >= 0.0f) {
                canvas.drawCircle(f4, f5, this.f42727G + this.f42728H, this.f42730J);
                canvas.drawCircle(this.f42735O, this.f42736P, this.f42727G, this.f42731K);
            }
        }
        Bitmap bitmap = this.f42739S;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f42739S = getDrawingCache(true);
        }
    }

    private void d() {
        setDrawingCacheEnabled(true);
        this.f42730J = new Paint();
        this.f42731K = new Paint();
        this.f42732L = new Paint();
        this.f42730J.setAntiAlias(true);
        this.f42730J.setColor(C0669d.f(getContext(), j.d.f40749f1));
        this.f42731K.setAntiAlias(true);
        this.f42732L.setAntiAlias(true);
        this.f42733M = new Rect();
        new Handler().postDelayed(new a(), 300L);
    }

    public void e() {
        Bitmap bitmap = this.f42734N;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f42734N.recycle();
            this.f42734N = null;
        }
    }

    public void f() {
        this.f42735O = this.f42737Q;
        this.f42736P = this.f42738R;
        Bitmap bitmap = this.f42739S;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f42731K.setColor(0);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        c(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f42725E = View.MeasureSpec.getSize(i4);
        int size = View.MeasureSpec.getSize(i5);
        this.f42726F = size;
        Rect rect = this.f42733M;
        int i6 = this.f42727G;
        int i7 = this.f42728H;
        rect.left = i6 + i7;
        rect.top = i6 + i7;
        rect.right = this.f42725E - (i6 + i7);
        rect.bottom = size - (i6 + i7);
        this.f42729I = rect.width() / 2;
        this.f42737Q = this.f42725E / 2;
        this.f42738R = this.f42726F / 2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        boolean z3 = false;
        if (!this.f42741U) {
            return false;
        }
        int action = motionEvent.getAction();
        float f4 = 0.0f;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
            } else {
                if (!this.f42743W && (bVar = this.f42740T) != null) {
                    bVar.b(this.f42742V, this.f42735O, this.f42736P, this.f42729I);
                }
                this.f42743W = false;
                return true;
            }
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (x3 < 0.0f) {
                x3 = 0.0f;
            }
            if (y3 < 0.0f) {
                y3 = 0.0f;
            }
            if (b(x3, y3)) {
                this.f42743W = true;
                b bVar2 = this.f42740T;
                if (bVar2 != null) {
                    bVar2.a();
                }
                return true;
            }
        }
        if (this.f42743W) {
            return true;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        if (x4 < 0.0f) {
            x4 = 0.0f;
        }
        if (y4 >= 0.0f) {
            f4 = y4;
        }
        if (b(x4, f4)) {
            StringBuilder sb = new StringBuilder();
            String str = f42724a0;
            sb.append(str);
            sb.append(" touched out of range by x = ");
            sb.append(x4);
            sb.append(" y = ");
            sb.append(f4);
            sb.append(" isVisibleGone = ");
            if (getVisibility() == 8) {
                z3 = true;
            }
            sb.append(z3);
            T1.a.a(sb.toString());
            float atan2 = (float) Math.atan2(f4 - (this.f42726F / 2), x4 - (this.f42725E / 2));
            double d4 = atan2;
            x4 = (float) (((this.f42729I - 10) * Math.cos(d4)) + this.f42737Q);
            f4 = (float) (((this.f42729I - 10) * Math.sin(d4)) + this.f42738R);
            T1.a.a(str + " touched out of range by after x = " + x4 + "after y = " + f4 + " radians = " + atan2 + "");
        }
        this.f42735O = x4;
        this.f42736P = f4;
        Bitmap bitmap = this.f42739S;
        if (bitmap != null && !bitmap.isRecycled()) {
            int pixel = this.f42739S.getPixel((int) this.f42735O, (int) this.f42736P);
            this.f42742V = pixel;
            this.f42731K.setColor(pixel);
        }
        invalidate();
        return true;
    }

    public void setOnColorSelectedListener(b bVar) {
        this.f42740T = bVar;
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42727G = 60;
        this.f42728H = 15;
        this.f42735O = -1.0f;
        this.f42736P = -1.0f;
        this.f42741U = true;
        this.f42742V = 0;
        this.f42743W = false;
        d();
    }

    public j(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42727G = 60;
        this.f42728H = 15;
        this.f42735O = -1.0f;
        this.f42736P = -1.0f;
        this.f42741U = true;
        this.f42742V = 0;
        this.f42743W = false;
        d();
    }
}

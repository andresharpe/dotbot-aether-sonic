package com.harman.jbl.partybox.ui.widget.eq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.annotation.P;
import androidx.core.content.C0669d;
import com.harman.jbl.partybox.j;
import e.C2046a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.scheduling.q;

/* loaded from: classes2.dex */
public class b extends View {

    /* renamed from: F0, reason: collision with root package name */
    public static final int f46009F0 = Color.parseColor("#FF5901");

    /* renamed from: G0, reason: collision with root package name */
    public static final int f46010G0 = Color.parseColor("#FF5901");

    /* renamed from: A0, reason: collision with root package name */
    private Context f46011A0;

    /* renamed from: B0, reason: collision with root package name */
    private float f46012B0;

    /* renamed from: C0, reason: collision with root package name */
    private ViewParent f46013C0;

    /* renamed from: D0, reason: collision with root package name */
    int f46014D0;

    /* renamed from: E, reason: collision with root package name */
    String f46015E;

    /* renamed from: E0, reason: collision with root package name */
    private a f46016E0;

    /* renamed from: F, reason: collision with root package name */
    private Paint f46017F;

    /* renamed from: G, reason: collision with root package name */
    private int f46018G;

    /* renamed from: H, reason: collision with root package name */
    private float f46019H;

    /* renamed from: I, reason: collision with root package name */
    private float f46020I;

    /* renamed from: J, reason: collision with root package name */
    private float f46021J;

    /* renamed from: K, reason: collision with root package name */
    private float f46022K;

    /* renamed from: L, reason: collision with root package name */
    private int f46023L;

    /* renamed from: M, reason: collision with root package name */
    private int f46024M;

    /* renamed from: N, reason: collision with root package name */
    private int f46025N;

    /* renamed from: O, reason: collision with root package name */
    private int f46026O;

    /* renamed from: P, reason: collision with root package name */
    private float f46027P;

    /* renamed from: Q, reason: collision with root package name */
    private float f46028Q;

    /* renamed from: R, reason: collision with root package name */
    private float f46029R;

    /* renamed from: S, reason: collision with root package name */
    private float f46030S;

    /* renamed from: T, reason: collision with root package name */
    private float f46031T;

    /* renamed from: U, reason: collision with root package name */
    private float f46032U;

    /* renamed from: V, reason: collision with root package name */
    private Bitmap f46033V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f46034W;

    /* renamed from: a0, reason: collision with root package name */
    private Bitmap f46035a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f46036b0;

    /* renamed from: c0, reason: collision with root package name */
    private String[] f46037c0;

    /* renamed from: d0, reason: collision with root package name */
    private String[] f46038d0;

    /* renamed from: e0, reason: collision with root package name */
    private int[] f46039e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f46040f0;

    /* renamed from: g0, reason: collision with root package name */
    private List<C0405b> f46041g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f46042h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f46043i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f46044j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f46045k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f46046l0;

    /* renamed from: m0, reason: collision with root package name */
    private Path f46047m0;

    /* renamed from: n0, reason: collision with root package name */
    private Paint f46048n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f46049o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f46050p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f46051q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f46052r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f46053s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f46054t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f46055u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f46056v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f46057w0;

    /* renamed from: x0, reason: collision with root package name */
    private float f46058x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f46059y0;

    /* renamed from: z0, reason: collision with root package name */
    private int[] f46060z0;

    /* loaded from: classes2.dex */
    public interface a {
        void onProgressChanged(int[] iArr, boolean z3);

        void onSeekBlock();

        void onStartTrackingTouch();

        void onStopTrackingTouch(int i4, int[] iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.harman.jbl.partybox.ui.widget.eq.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0405b {

        /* renamed from: a, reason: collision with root package name */
        float f46061a;

        /* renamed from: b, reason: collision with root package name */
        float f46062b;

        C0405b(float f4, float f5) {
            this.f46061a = f4;
            this.f46062b = f5;
        }
    }

    public b(Context context) {
        this(context, null);
        this.f46011A0 = context;
    }

    private int a(float f4) {
        Log.d(this.f46015E, "getValueBY y = " + f4);
        Log.d(this.f46015E, "getValueBY mPaddingTop = " + this.f46019H);
        Log.d(this.f46015E, "getValueBY mHLineMarginTop = " + this.f46020I);
        Log.d(this.f46015E, "getValueBY mSpaceBetweenHLine = " + this.f46021J);
        float f5 = this.f46019H;
        float f6 = this.f46020I;
        float f7 = this.f46021J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        int i5 = (int) (((f4 - f5) - f6) % f7);
        Log.d(this.f46015E, "getValueBY a = " + i4);
        Log.d(this.f46015E, "getValueBY c = " + i5);
        if (i5 > this.f46057w0 * this.f46021J) {
            i4++;
            Log.d(this.f46015E, "getValueBY  d = a + 1 and d = " + i4);
        } else {
            Log.d(this.f46015E, "getValueBY  d = a and d = " + i4);
        }
        int i6 = (this.f46040f0 / 2) - i4;
        Log.d(this.f46015E, "getValueBY yLevelValue = " + i6);
        int i7 = this.f46059y0;
        if (i7 >= 0) {
            float height = this.f46041g0.get(i7).f46062b - this.f46034W.getHeight();
            float height2 = this.f46041g0.get(this.f46059y0).f46062b + this.f46034W.getHeight();
            Log.d(this.f46015E, "y from PointList  = " + this.f46041g0.get(this.f46059y0).f46062b);
            Log.d(this.f46015E, "y range start = " + height);
            Log.d(this.f46015E, "y range end = " + height2);
            Log.d(this.f46015E, "mTune.getHeight() = " + this.f46034W.getHeight());
            Log.d(this.f46015E, "extra  = " + ((this.f46020I * 2.0f) + this.f46019H + (this.f46057w0 * this.f46021J)));
            if (f4 >= height && f4 <= height2) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    private float b(float f4) {
        return TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics());
    }

    private double c(float f4, float f5, C0405b c0405b) {
        return Math.sqrt(Math.pow(f4 - c0405b.f46061a, 2.0d) + Math.pow(f5 - c0405b.f46062b, 2.0d));
    }

    private void d(Canvas canvas) {
        int size = this.f46041g0.size();
        C0405b c0405b = this.f46041g0.get(0);
        this.f46047m0.reset();
        this.f46047m0.moveTo(c0405b.f46061a, c0405b.f46062b);
        float f4 = c0405b.f46061a;
        float f5 = c0405b.f46062b;
        for (int i4 = 1; i4 < size; i4++) {
            C0405b c0405b2 = this.f46041g0.get(i4);
            float f6 = c0405b2.f46061a;
            float f7 = (f4 + f6) / 2.0f;
            Path path = this.f46047m0;
            float f8 = c0405b2.f46062b;
            path.cubicTo(f7, f5, f7, f8, f6, f8);
            f4 = c0405b2.f46061a;
            f5 = c0405b2.f46062b;
        }
        this.f46048n0.setStyle(Paint.Style.STROKE);
        this.f46048n0.setStrokeWidth(this.f46055u0);
        this.f46048n0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f46052r0, this.f46053s0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f46047m0, this.f46048n0);
        h(canvas);
    }

    private void e(Canvas canvas) {
        int size = this.f46041g0.size();
        C0405b c0405b = this.f46041g0.get(0);
        this.f46047m0.reset();
        this.f46047m0.moveTo(c0405b.f46061a, c0405b.f46062b);
        float f4 = c0405b.f46061a;
        float f5 = c0405b.f46062b;
        for (int i4 = 1; i4 < size; i4++) {
            C0405b c0405b2 = this.f46041g0.get(i4);
            float f6 = c0405b2.f46061a;
            float f7 = (f4 + f6) / 2.0f;
            this.f46047m0.quadTo((f4 + f7) / 2.0f, f5, f7, (c0405b2.f46062b + f5) / 2.0f);
            Path path = this.f46047m0;
            float f8 = c0405b2.f46062b;
            path.quadTo((f6 + f7) / 2.0f, f8, c0405b2.f46061a, f8);
            f4 = c0405b2.f46061a;
            f5 = c0405b2.f46062b;
        }
        this.f46048n0.setStyle(Paint.Style.STROKE);
        this.f46048n0.setStrokeWidth(this.f46055u0);
        this.f46048n0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f46052r0, this.f46053s0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f46047m0, this.f46048n0);
    }

    private void f(Canvas canvas) {
        for (int i4 = 0; i4 < this.f46038d0.length; i4++) {
            this.f46017F.setColor(this.f46043i0);
            this.f46017F.setTextSize(this.f46045k0);
            this.f46017F.setTypeface(Typeface.DEFAULT_BOLD);
            if (i4 == 0) {
                canvas.drawText(this.f46038d0[i4].toUpperCase(Locale.ROOT), this.f46030S + ((i4 + 1) * (this.f46031T / 2.0f)), canvas.getHeight(), this.f46017F);
            } else if (i4 == 1) {
                canvas.drawText(this.f46038d0[i4].toUpperCase(Locale.ROOT), this.f46030S + ((i4 + 3) * (this.f46031T / 2.0f)), canvas.getHeight(), this.f46017F);
            } else if (i4 == 2) {
                canvas.drawText(this.f46038d0[i4].toUpperCase(Locale.ROOT), this.f46030S + ((i4 + 5) * (this.f46031T / 2.0f)), canvas.getHeight(), this.f46017F);
            }
        }
    }

    private void g(Canvas canvas, float f4) {
        for (int i4 = 0; i4 < this.f46040f0; i4++) {
            Paint paint = new Paint();
            paint.setColor(this.f46024M);
            paint.setStrokeWidth(b(1.0f));
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 0.0f));
            if (i4 == 0) {
                float f5 = i4;
                canvas.drawLine(0.0f, this.f46019H + this.f46020I + (this.f46021J * f5) + (this.f46034W.getHeight() / 2), canvas.getWidth(), this.f46019H + this.f46020I + (this.f46021J * f5) + (this.f46034W.getHeight() / 2), paint);
            } else if (i4 == 4) {
                float f6 = i4;
                canvas.drawLine(0.0f, ((this.f46019H + this.f46020I) + (this.f46021J * f6)) - (this.f46034W.getHeight() / 2), canvas.getWidth(), ((this.f46019H + this.f46020I) + (this.f46021J * f6)) - (this.f46034W.getHeight() / 2), paint);
            } else {
                float f7 = i4;
                canvas.drawLine(0.0f, this.f46019H + this.f46020I + (this.f46021J * f7), canvas.getWidth(), (this.f46021J * f7) + this.f46019H + this.f46020I, paint);
            }
        }
    }

    private float[] getPositionsDown() {
        return new float[]{0.0f, 1.0f};
    }

    private int[] getValueByPoints() {
        int[] iArr = new int[this.f46041g0.size()];
        for (int i4 = 0; i4 < this.f46041g0.size(); i4++) {
            iArr[i4] = q(this.f46041g0.get(i4).f46062b);
        }
        return iArr;
    }

    private void h(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f46047m0);
        path.lineTo(r(4.0f), s(-6.0f));
        path.lineTo(r(0.0f), s(-6.0f));
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        LinearGradient linearGradient = new LinearGradient(0.0f, this.f46020I, 0.0f, s(-6.0f), getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(r(0.0f), this.f46020I, r(4.0f), s(-6.0f), paint);
        canvas.restoreToCount(save);
    }

    private void i(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f46047m0);
        path.lineTo(this.f46018G - this.f46030S, this.f46020I);
        path.lineTo(this.f46030S, this.f46020I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(this.f46018G - this.f46030S, this.f46033V.getHeight() - this.f46020I, this.f46018G - this.f46030S, (this.f46033V.getHeight() / 2) - this.f46020I, getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP));
        float f4 = this.f46030S;
        canvas.drawRect(f4, this.f46020I, this.f46018G - f4, this.f46033V.getHeight() - this.f46020I, paint);
        int height = this.f46033V.getHeight() / this.f46014D0;
        for (int i4 = 0; i4 < this.f46014D0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f46018G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private void j(Canvas canvas) {
        for (int i4 = 0; i4 < this.f46037c0.length; i4++) {
            if (getValueByPoints()[i4] != 0) {
                this.f46017F.setColor(this.f46049o0);
            } else {
                this.f46017F.setColor(this.f46043i0);
            }
            canvas.drawText(String.valueOf(getValueByPoints()[i4]), this.f46030S + (i4 * this.f46031T), this.f46046l0, this.f46017F);
        }
    }

    private void k(Canvas canvas, int i4, float f4, float f5) {
        this.f46017F.setStrokeCap(Paint.Cap.ROUND);
        this.f46017F.setColor(this.f46054t0);
        float f6 = i4;
        float width = this.f46030S + (this.f46031T * f6) + (this.f46033V.getWidth() / 2.0f);
        float width2 = (this.f46033V.getWidth() / 2.0f) + this.f46030S + (f6 * this.f46031T);
        float height = this.f46030S + (this.f46031T * 2.4f) + (this.f46033V.getHeight() / 2.0f);
        this.f46017F.setShader(new LinearGradient(width, f5, width2, height, this.f46050p0, this.f46051q0, Shader.TileMode.CLAMP));
        canvas.drawLine(width, f5, width2, height, this.f46017F);
        this.f46017F.setShader(null);
    }

    private void l(Canvas canvas, int i4) {
        this.f46017F.setStrokeCap(Paint.Cap.ROUND);
        float f4 = i4;
        canvas.drawLine(this.f46030S + (this.f46031T * f4) + (this.f46033V.getWidth() / 2.0f), this.f46019H, this.f46030S + (f4 * this.f46031T) + (this.f46033V.getWidth() / 2.0f), this.f46030S + (this.f46031T * 2.4f) + (this.f46033V.getHeight() / 2.0f), this.f46017F);
    }

    private Bitmap m(int i4) {
        Drawable i5 = C0669d.i(getContext(), i4);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), (int) this.f46012B0, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), (int) this.f46012B0);
        i5.draw(canvas);
        return createBitmap;
    }

    private int o(float f4) {
        Log.d(this.f46015E, "getIndexByX mVLineMarginLeft = " + this.f46030S);
        Log.d(this.f46015E, "getIndexByX mSpaceBetweenVLine = " + this.f46031T);
        float f5 = this.f46030S;
        float f6 = this.f46031T;
        int i4 = (int) ((f4 - f5) / f6);
        int i5 = (int) ((f4 - f5) % f6);
        Log.d(this.f46015E, "getIndexByX a = " + i4);
        Log.d(this.f46015E, "getIndexByX c = " + i5);
        if (i5 > this.f46057w0 * this.f46031T) {
            i4++;
            Log.d(this.f46015E, "d = a + 1 and  d = " + i4);
        } else {
            Log.d(this.f46015E, "d = a; and  d = " + i4);
        }
        if (i4 < 0) {
            Log.d(this.f46015E, "d < 0 and  d = 0");
            i4 = 0;
        }
        String[] strArr = this.f46037c0;
        if (i4 > strArr.length - 1) {
            i4 = strArr.length - 1;
            Log.d(this.f46015E, "d > mTitles.length - 1 and  d = " + i4);
        }
        if (i4 != -1) {
            float width = this.f46041g0.get(i4).f46061a - this.f46034W.getWidth();
            float width2 = this.f46041g0.get(i4).f46061a + this.f46034W.getWidth();
            Log.d(this.f46015E, "x range start = " + width);
            Log.d(this.f46015E, "x range end = " + width2);
            Log.d(this.f46015E, "mTune.getWidth() = " + this.f46034W.getWidth());
            if (f4 >= width && f4 <= width2) {
                return i4;
            }
        }
        return -1;
    }

    private float p(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    private int q(float f4) {
        float f5 = this.f46019H;
        float f6 = this.f46020I;
        float f7 = this.f46021J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        if (((int) (((f4 - f5) - f6) % f7)) > this.f46057w0 * f7) {
            i4++;
        }
        return (this.f46040f0 / 2) - i4;
    }

    private float r(float f4) {
        return this.f46030S + (f4 * this.f46031T) + (this.f46033V.getWidth() / 2);
    }

    private float s(float f4) {
        int i4 = this.f46040f0;
        if (f4 < (-(i4 / 2))) {
            f4 = -(i4 / 2);
        }
        if (f4 > i4 / 2) {
            f4 = i4 / 2;
        }
        return this.f46019H + this.f46020I + (this.f46021J * ((i4 / 2) - ((int) f4)));
    }

    private void t() {
        z();
        this.f46028Q = this.f46019H + this.f46020I;
        this.f46029R = this.f46033V.getHeight() + this.f46020I;
        this.f46037c0 = new String[]{"Number", "Number", "Number", "Number", "Number"};
        this.f46038d0 = new String[]{getResources().getString(j.m.f41842y1), getResources().getString(j.m.f41635D1), getResources().getString(j.m.f41678O0)};
    }

    private void u() {
        int[] iArr = this.f46039e0;
        if (iArr != null && iArr.length > 0) {
            List<C0405b> list = this.f46041g0;
            if (list == null) {
                this.f46041g0 = new ArrayList();
            } else {
                list.clear();
            }
            for (int i4 = 0; i4 < this.f46039e0.length; i4++) {
                this.f46041g0.add(new C0405b(this.f46030S + (i4 * this.f46031T) + (this.f46033V.getWidth() / 2), s(this.f46039e0[i4])));
            }
        }
    }

    private boolean v(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length <= 0 || iArr2 == null || iArr2.length <= 0 || iArr.length != iArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    private boolean w(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        Iterator<C0405b> it = this.f46041g0.iterator();
        while (it.hasNext()) {
            double c4 = c(x3, y3, it.next());
            Log.d(this.f46015E, "isTouchOnSlider dis = " + c4);
            if (c4 < this.f46032U) {
                return true;
            }
        }
        return false;
    }

    private int x(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        Log.e("EqualizerView Height", "---speSize = " + size + "");
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    Log.e("EqualizerView Height", "---speSize = EXACTLY");
                }
            } else {
                Math.max(i4, size);
                Log.e("EqualizerView Height", "---speSize = UNSPECIFIED");
            }
        } else {
            this.f46033V.getHeight();
            this.f46017F.ascent();
            this.f46017F.descent();
            Log.e("EqualizerView Height", "---speMode = AT_MOST");
        }
        return (int) ((((this.f46019H + this.f46033V.getHeight()) + (this.f46046l0 * 2.0f)) - this.f46017F.ascent()) + this.f46017F.descent());
    }

    private int y(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        Log.e("EqualizerView Width", "---speSize = " + size + "");
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    Log.e("EqualizerView Width", "---speMode = EXACTLY");
                } else {
                    return i4;
                }
            } else {
                Log.e("EqualizerView Width", "---speMode = UNSPECIFIED");
                return Math.max(i4, size);
            }
        } else {
            Log.e("EqualizerView Width", "---speMode = AT_MOST");
        }
        return size;
    }

    private void z() {
        this.f46033V = n(C2046a.b(this.f46011A0, j.f.f41082o2));
        this.f46035a0 = m(j.f.f40967P1);
        if (this.f46036b0) {
            this.f46034W = n(C2046a.b(this.f46011A0, j.f.f41067l2));
            this.f46052r0 = getResources().getColor(j.d.f40699J0, getContext().getTheme());
            this.f46053s0 = getResources().getColor(j.d.f40699J0, getContext().getTheme());
        } else {
            this.f46034W = n(C2046a.b(this.f46011A0, j.f.f41062k2));
            this.f46052r0 = getResources().getColor(j.d.f40699J0, getContext().getTheme());
            this.f46053s0 = getResources().getColor(j.d.f40699J0, getContext().getTheme());
        }
    }

    public int[] getColorsDown() {
        int i4 = f46009F0;
        return new int[]{Color.argb(q.f54649c, Color.red(i4), Color.green(i4), Color.blue(i4)), Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4))};
    }

    public Bitmap n(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f46056v0) {
            u();
        }
        this.f46017F.setColor(this.f46023L);
        this.f46017F.setStrokeWidth(b(this.f46022K));
        String[] strArr = this.f46037c0;
        if (strArr != null && strArr.length > 0) {
            this.f46031T = (this.f46018G - (this.f46030S * 2.0f)) / (strArr.length - 1);
            this.f46021J = (this.f46033V.getHeight() - (this.f46020I * 2.0f)) / (this.f46040f0 - 1);
            for (int i4 = 0; i4 < this.f46037c0.length; i4++) {
            }
            this.f46017F.setColor(this.f46042h0);
            this.f46017F.setTextAlign(Paint.Align.CENTER);
            this.f46017F.setTextSize(this.f46044j0);
            this.f46017F.setAntiAlias(true);
            if (!this.f46056v0) {
                u();
            }
            List<C0405b> list = this.f46041g0;
            if (list != null && list.size() > 0) {
                for (int i5 = 0; i5 < this.f46041g0.size(); i5++) {
                }
            }
            List<C0405b> list2 = this.f46041g0;
            if (list2 != null && list2.size() > 0) {
                d(canvas);
                for (int i6 = 0; i6 < this.f46041g0.size(); i6++) {
                    this.f46041g0.get(i6);
                    this.f46017F.setColor(this.f46049o0);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f46018G = View.MeasureSpec.getSize(i4);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        Log.e("EqualizerView", "---minimumWidth = " + suggestedMinimumWidth + "");
        Log.e("EqualizerView", "---minimumHeight = " + suggestedMinimumHeight + "");
        int y3 = y(suggestedMinimumWidth, i4);
        int x3 = x(suggestedMinimumHeight, i5);
        Log.e("EqualizerView", "---width = " + y3 + "");
        Log.e("EqualizerView", "---height = " + x3 + "");
        setMeasuredDimension(y3, x3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f46036b0) {
            this.f46056v0 = true;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 4) {
                            return false;
                        }
                    } else {
                        float y3 = motionEvent.getY();
                        if (this.f46059y0 != -1) {
                            float f4 = this.f46029R;
                            if (y3 > f4) {
                                y3 = f4;
                            }
                            float f5 = this.f46028Q;
                            if (y3 < f5) {
                                y3 = f5;
                            }
                            if (a(y3) != -1) {
                                int q4 = q(y3);
                                Log.d(this.f46015E, "ACTION_MOVE index = " + this.f46059y0 + " , value = " + q4);
                                this.f46041g0.remove(this.f46059y0);
                                List<C0405b> list = this.f46041g0;
                                int i4 = this.f46059y0;
                                list.add(i4, new C0405b(r((float) i4), y3));
                                invalidate();
                                int[] valueByPoints = getValueByPoints();
                                if (!v(valueByPoints, this.f46060z0) && (aVar = this.f46016E0) != null) {
                                    aVar.onProgressChanged(getValueByPoints(), true);
                                }
                                this.f46060z0 = valueByPoints;
                            } else {
                                Log.e(this.f46015E, "ACTION_MOVE index = " + this.f46059y0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f46028Q + " , mMaxY = " + this.f46029R);
                                int q5 = q(this.f46041g0.get(this.f46059y0).f46062b);
                                float s4 = s((float) q5);
                                String str = this.f46015E;
                                StringBuilder sb = new StringBuilder();
                                sb.append("ACTION_MOVE current Y value = ");
                                sb.append(this.f46041g0.get(this.f46059y0).f46062b);
                                Log.d(str, sb.toString());
                                Log.d(this.f46015E, "ACTION_MOVE Level based on current Y = " + q5);
                                Log.d(this.f46015E, "ACTION_MOVE yValue based on Level = " + s4);
                                Log.d(this.f46015E, "Its a fling while selection, so just update it to the nearest level");
                                Log.d(this.f46015E, "ACTION_MOVE index = " + this.f46059y0 + " , value = " + s4);
                                this.f46041g0.remove(this.f46059y0);
                                List<C0405b> list2 = this.f46041g0;
                                int i5 = this.f46059y0;
                                list2.add(i5, new C0405b(r((float) i5), s4));
                                invalidate();
                                a aVar2 = this.f46016E0;
                                if (aVar2 != null) {
                                    aVar2.onStopTrackingTouch(this.f46059y0, getValueByPoints());
                                }
                            }
                        } else {
                            Log.e(this.f46015E, "ACTION_MOVE index = " + this.f46059y0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f46028Q + " , mMaxY = " + this.f46029R);
                            ViewParent viewParent = this.f46013C0;
                            if (viewParent != null) {
                                viewParent.requestDisallowInterceptTouchEvent(false);
                            }
                            return false;
                        }
                    }
                } else {
                    float y4 = motionEvent.getY();
                    int q6 = q(y4);
                    if (this.f46059y0 != -1) {
                        float f6 = this.f46029R;
                        if (y4 > f6) {
                            y4 = f6;
                        }
                        float f7 = this.f46028Q;
                        if (y4 < f7) {
                            y4 = f7;
                        }
                        if (a(y4) != -1) {
                            int q7 = q(y4);
                            Log.d(this.f46015E, "ACTION_UP index = " + this.f46059y0 + " , value = " + q7);
                            this.f46041g0.remove(this.f46059y0);
                            List<C0405b> list3 = this.f46041g0;
                            int i6 = this.f46059y0;
                            list3.add(i6, new C0405b(r((float) i6), s((float) q7)));
                            invalidate();
                            a aVar3 = this.f46016E0;
                            if (aVar3 != null) {
                                aVar3.onStopTrackingTouch(this.f46059y0, getValueByPoints());
                            }
                        } else {
                            Log.e(this.f46015E, "ACTION_UP index = " + this.f46059y0 + " , value = " + q6 + " , y = " + y4 + " , mMinY = " + this.f46028Q + " , mMaxY = " + this.f46029R);
                            ViewParent viewParent2 = this.f46013C0;
                            if (viewParent2 != null) {
                                viewParent2.requestDisallowInterceptTouchEvent(false);
                            }
                            return false;
                        }
                    } else {
                        Log.e(this.f46015E, "ACTION_UP index = " + this.f46059y0 + " , value = " + q6 + " , y = " + y4 + " , mMinY = " + this.f46028Q + " , mMaxY = " + this.f46029R);
                        ViewParent viewParent3 = this.f46013C0;
                        if (viewParent3 != null) {
                            viewParent3.requestDisallowInterceptTouchEvent(false);
                        }
                        return false;
                    }
                }
            } else {
                Log.d(this.f46015E, "ACTION_DOWN index = " + this.f46059y0);
                ViewParent viewParent4 = this.f46013C0;
                if (viewParent4 != null) {
                    viewParent4.requestDisallowInterceptTouchEvent(true);
                } else {
                    ViewParent parent = getParent();
                    while (true) {
                        if (parent instanceof ScrollView) {
                            this.f46013C0 = parent;
                            parent.requestDisallowInterceptTouchEvent(true);
                            break;
                        }
                        parent = parent.getParent();
                        if (parent == null) {
                            break;
                        }
                    }
                }
                float x3 = motionEvent.getX();
                this.f46058x0 = x3;
                this.f46059y0 = o(x3);
                Log.d(this.f46015E, "ACTION_DOWN mDownX = " + this.f46058x0);
                Log.d(this.f46015E, "ACTION_DOWN getIndexByX mCurrentIndex = " + this.f46059y0);
            }
        }
        return true;
    }

    public void setCustomGraphEdit(boolean z3) {
        this.f46036b0 = z3;
        z();
        invalidate();
    }

    public void setLevel(int i4) {
        this.f46056v0 = false;
        this.f46040f0 = i4;
        invalidate();
    }

    public void setListener(a aVar) {
        this.f46016E0 = aVar;
    }

    public void setSeekable(boolean z3) {
        this.f46036b0 = z3;
    }

    public void setTitles(String[] strArr) {
        this.f46037c0 = strArr;
        invalidate();
    }

    public void setValues(int[] iArr) {
        this.f46039e0 = iArr;
        invalidate();
    }

    public b(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f46011A0 = context;
    }

    public b(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46015E = "EqualizerView BLE_LOG";
        this.f46017F = new Paint();
        this.f46019H = 100.0f;
        this.f46020I = b(15.0f);
        this.f46021J = b(30.0f);
        this.f46022K = 6.0f;
        this.f46023L = Color.parseColor("#FFFFFF");
        this.f46024M = getResources().getColor(j.d.f40772o0, getContext().getTheme());
        this.f46025N = Color.parseColor("#E6E6E6");
        this.f46026O = 2;
        this.f46027P = 2.5f;
        this.f46028Q = 0.0f;
        this.f46029R = 0.0f;
        this.f46030S = b(10.0f);
        this.f46031T = 0.0f;
        this.f46032U = b(25.0f);
        this.f46036b0 = false;
        this.f46039e0 = new int[]{0, 0, 0, 0, 0};
        this.f46040f0 = 5;
        this.f46042h0 = Color.parseColor("#4C596B");
        this.f46043i0 = Color.parseColor("#8CFFFFFF");
        this.f46044j0 = b(14.0f);
        this.f46045k0 = b(18.0f);
        this.f46046l0 = 40.0f;
        this.f46047m0 = new Path();
        this.f46048n0 = new Paint();
        this.f46049o0 = getResources().getColor(j.d.f40749f1, getContext().getTheme());
        this.f46050p0 = Color.parseColor("#FFF0BC");
        this.f46051q0 = Color.parseColor("#FFBD71");
        this.f46052r0 = Color.parseColor("#FF6BA1");
        this.f46053s0 = Color.parseColor("#FE5762");
        this.f46054t0 = Color.parseColor("#2855a6");
        this.f46055u0 = b(3.0f);
        this.f46056v0 = false;
        this.f46057w0 = 0.5f;
        this.f46058x0 = -1.0f;
        this.f46059y0 = -1;
        this.f46060z0 = null;
        this.f46012B0 = b(136.0f);
        this.f46014D0 = 20;
        this.f46011A0 = context;
        t();
    }
}

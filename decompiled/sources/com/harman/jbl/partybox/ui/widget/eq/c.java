package com.harman.jbl.partybox.ui.widget.eq;

import android.content.Context;
import android.content.res.Resources;
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
public class c extends View {

    /* renamed from: G0, reason: collision with root package name */
    public static final int f46063G0 = Color.parseColor("#FF5901");

    /* renamed from: H0, reason: collision with root package name */
    public static final int f46064H0 = Color.parseColor("#FF5901");

    /* renamed from: A0, reason: collision with root package name */
    private Context f46065A0;

    /* renamed from: B0, reason: collision with root package name */
    private float f46066B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f46067C0;

    /* renamed from: D0, reason: collision with root package name */
    private ViewParent f46068D0;

    /* renamed from: E, reason: collision with root package name */
    String f46069E;

    /* renamed from: E0, reason: collision with root package name */
    int f46070E0;

    /* renamed from: F, reason: collision with root package name */
    private Paint f46071F;

    /* renamed from: F0, reason: collision with root package name */
    private a f46072F0;

    /* renamed from: G, reason: collision with root package name */
    private int f46073G;

    /* renamed from: H, reason: collision with root package name */
    private float f46074H;

    /* renamed from: I, reason: collision with root package name */
    private float f46075I;

    /* renamed from: J, reason: collision with root package name */
    private float f46076J;

    /* renamed from: K, reason: collision with root package name */
    private float f46077K;

    /* renamed from: L, reason: collision with root package name */
    private int f46078L;

    /* renamed from: M, reason: collision with root package name */
    private int f46079M;

    /* renamed from: N, reason: collision with root package name */
    private int f46080N;

    /* renamed from: O, reason: collision with root package name */
    private int f46081O;

    /* renamed from: P, reason: collision with root package name */
    private float f46082P;

    /* renamed from: Q, reason: collision with root package name */
    private float f46083Q;

    /* renamed from: R, reason: collision with root package name */
    private float f46084R;

    /* renamed from: S, reason: collision with root package name */
    private float f46085S;

    /* renamed from: T, reason: collision with root package name */
    private float f46086T;

    /* renamed from: U, reason: collision with root package name */
    private float f46087U;

    /* renamed from: V, reason: collision with root package name */
    private Bitmap f46088V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f46089W;

    /* renamed from: a0, reason: collision with root package name */
    private Bitmap f46090a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f46091b0;

    /* renamed from: c0, reason: collision with root package name */
    private String[] f46092c0;

    /* renamed from: d0, reason: collision with root package name */
    private String[] f46093d0;

    /* renamed from: e0, reason: collision with root package name */
    private int[] f46094e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f46095f0;

    /* renamed from: g0, reason: collision with root package name */
    private List<b> f46096g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f46097h0;

    /* renamed from: i0, reason: collision with root package name */
    private int f46098i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f46099j0;

    /* renamed from: k0, reason: collision with root package name */
    private float f46100k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f46101l0;

    /* renamed from: m0, reason: collision with root package name */
    private Path f46102m0;

    /* renamed from: n0, reason: collision with root package name */
    private Paint f46103n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f46104o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f46105p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f46106q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f46107r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f46108s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f46109t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f46110u0;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f46111v0;

    /* renamed from: w0, reason: collision with root package name */
    private float f46112w0;

    /* renamed from: x0, reason: collision with root package name */
    private float f46113x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f46114y0;

    /* renamed from: z0, reason: collision with root package name */
    private int[] f46115z0;

    /* loaded from: classes2.dex */
    public interface a {
        void onProgressChanged(int[] iArr, boolean z3);

        void onSeekBlock();

        void onStartTrackingTouch();

        void onStopTrackingTouch(int i4, int[] iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        float f46116a;

        /* renamed from: b, reason: collision with root package name */
        float f46117b;

        b(float f4, float f5) {
            this.f46116a = f4;
            this.f46117b = f5;
        }
    }

    public c(Context context) {
        this(context, null);
        this.f46065A0 = context;
    }

    private int a(float f4) {
        Log.d(this.f46069E, "getValueBY y = " + f4);
        Log.d(this.f46069E, "getValueBY mPaddingTop = " + this.f46074H);
        Log.d(this.f46069E, "getValueBY mHLineMarginTop = " + this.f46075I);
        Log.d(this.f46069E, "getValueBY mSpaceBetweenHLine = " + this.f46076J);
        float f5 = this.f46074H;
        float f6 = this.f46075I;
        float f7 = this.f46076J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        int i5 = (int) (((f4 - f5) - f6) % f7);
        Log.d(this.f46069E, "getValueBY a = " + i4);
        Log.d(this.f46069E, "getValueBY c = " + i5);
        if (i5 > this.f46112w0 * this.f46076J) {
            i4++;
            Log.d(this.f46069E, "getValueBY  d = a + 1 and d = " + i4);
        } else {
            Log.d(this.f46069E, "getValueBY  d = a and d = " + i4);
        }
        int i6 = (this.f46095f0 / 2) - i4;
        Log.d(this.f46069E, "getValueBY yLevelValue = " + i6);
        int i7 = this.f46114y0;
        if (i7 >= 0) {
            float height = this.f46096g0.get(i7).f46117b - this.f46089W.getHeight();
            float height2 = this.f46096g0.get(this.f46114y0).f46117b + this.f46089W.getHeight();
            Log.d(this.f46069E, "y from PointList  = " + this.f46096g0.get(this.f46114y0).f46117b);
            Log.d(this.f46069E, "y range start = " + height);
            Log.d(this.f46069E, "y range end = " + height2);
            Log.d(this.f46069E, "mTune.getHeight() = " + this.f46089W.getHeight());
            Log.d(this.f46069E, "extra  = " + ((this.f46075I * 2.0f) + this.f46074H + (this.f46112w0 * this.f46076J)));
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

    private double c(float f4, float f5, b bVar) {
        return Math.sqrt(Math.pow(f4 - bVar.f46116a, 2.0d) + Math.pow(f5 - bVar.f46117b, 2.0d));
    }

    private void d(Canvas canvas) {
        int size = this.f46096g0.size();
        b bVar = this.f46096g0.get(0);
        this.f46102m0.reset();
        this.f46102m0.moveTo(bVar.f46116a, bVar.f46117b);
        float f4 = bVar.f46116a;
        float f5 = bVar.f46117b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f46096g0.get(i4);
            float f6 = bVar2.f46116a;
            float f7 = (f4 + f6) / 2.0f;
            Path path = this.f46102m0;
            float f8 = bVar2.f46117b;
            path.cubicTo(f7, f5, f7, f8, f6, f8);
            f4 = bVar2.f46116a;
            f5 = bVar2.f46117b;
        }
        this.f46103n0.setStyle(Paint.Style.STROKE);
        this.f46103n0.setStrokeWidth(this.f46110u0);
        this.f46103n0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f46107r0, this.f46108s0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f46102m0, this.f46103n0);
    }

    private void e(Canvas canvas) {
        int size = this.f46096g0.size();
        b bVar = this.f46096g0.get(0);
        this.f46102m0.reset();
        this.f46102m0.moveTo(bVar.f46116a, bVar.f46117b);
        float f4 = bVar.f46116a;
        float f5 = bVar.f46117b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f46096g0.get(i4);
            float f6 = bVar2.f46116a;
            float f7 = (f4 + f6) / 2.0f;
            this.f46102m0.quadTo((f4 + f7) / 2.0f, f5, f7, (bVar2.f46117b + f5) / 2.0f);
            Path path = this.f46102m0;
            float f8 = bVar2.f46117b;
            path.quadTo((f6 + f7) / 2.0f, f8, bVar2.f46116a, f8);
            f4 = bVar2.f46116a;
            f5 = bVar2.f46117b;
        }
        this.f46103n0.setStyle(Paint.Style.STROKE);
        this.f46103n0.setStrokeWidth(this.f46110u0);
        this.f46103n0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f46107r0, this.f46108s0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f46102m0, this.f46103n0);
    }

    private void f(Canvas canvas) {
        for (int i4 = 0; i4 < this.f46093d0.length; i4++) {
            this.f46071F.setColor(this.f46098i0);
            this.f46071F.setTextSize(this.f46100k0);
            this.f46071F.setTypeface(Typeface.DEFAULT_BOLD);
            if (i4 == 0) {
                canvas.drawText(this.f46093d0[i4].toUpperCase(Locale.ROOT), this.f46085S + ((i4 + 1) * (this.f46086T / 2.0f)), canvas.getHeight(), this.f46071F);
            } else if (i4 == 1) {
                canvas.drawText(this.f46093d0[i4].toUpperCase(Locale.ROOT), this.f46085S + ((i4 + 3) * (this.f46086T / 2.0f)), canvas.getHeight(), this.f46071F);
            } else if (i4 == 2) {
                canvas.drawText(this.f46093d0[i4].toUpperCase(Locale.ROOT), this.f46085S + ((i4 + 5) * (this.f46086T / 2.0f)), canvas.getHeight(), this.f46071F);
            }
        }
    }

    private void g(Canvas canvas, float f4) {
        for (int i4 = 0; i4 < this.f46095f0; i4++) {
            Paint paint = new Paint();
            paint.setColor(this.f46079M);
            paint.setStrokeWidth(b(1.0f));
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 0.0f));
            if (i4 == 0) {
                float f5 = i4;
                canvas.drawLine(0.0f, this.f46074H + this.f46075I + (this.f46076J * f5) + (this.f46089W.getHeight() / 2), canvas.getWidth(), this.f46074H + this.f46075I + (this.f46076J * f5) + (this.f46089W.getHeight() / 2), paint);
            } else if (i4 == 4) {
                float f6 = i4;
                canvas.drawLine(0.0f, ((this.f46074H + this.f46075I) + (this.f46076J * f6)) - (this.f46089W.getHeight() / 2), canvas.getWidth(), ((this.f46074H + this.f46075I) + (this.f46076J * f6)) - (this.f46089W.getHeight() / 2), paint);
            } else {
                float f7 = i4;
                canvas.drawLine(0.0f, this.f46074H + this.f46075I + (this.f46076J * f7), canvas.getWidth(), (this.f46076J * f7) + this.f46074H + this.f46075I, paint);
            }
        }
    }

    private float[] getPositionsDown() {
        return new float[]{0.0f, 1.0f};
    }

    private int[] getValueByPoints() {
        int[] iArr = new int[this.f46096g0.size()];
        for (int i4 = 0; i4 < this.f46096g0.size(); i4++) {
            iArr[i4] = q(this.f46096g0.get(i4).f46117b);
        }
        return iArr;
    }

    private void h(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f46102m0);
        path.lineTo(r(4.0f), s(-6.0f));
        path.lineTo(r(0.0f), s(-6.0f));
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        LinearGradient linearGradient = new LinearGradient(0.0f, this.f46075I, 0.0f, s(-6.0f), getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(r(0.0f), this.f46075I, r(4.0f), s(-6.0f), paint);
        canvas.restoreToCount(save);
    }

    private void i(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f46102m0);
        path.lineTo(this.f46073G - this.f46085S, this.f46075I);
        path.lineTo(this.f46085S, this.f46075I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(this.f46073G - this.f46085S, this.f46088V.getHeight() - this.f46075I, this.f46073G - this.f46085S, (this.f46088V.getHeight() / 2) - this.f46075I, getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP));
        float f4 = this.f46085S;
        canvas.drawRect(f4, this.f46075I, this.f46073G - f4, this.f46088V.getHeight() - this.f46075I, paint);
        int height = this.f46088V.getHeight() / this.f46070E0;
        for (int i4 = 0; i4 < this.f46070E0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f46073G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private void j(Canvas canvas) {
        for (int i4 = 0; i4 < this.f46092c0.length; i4++) {
            if (getValueByPoints()[i4] != 0) {
                this.f46071F.setColor(this.f46104o0);
            } else {
                this.f46071F.setColor(this.f46098i0);
            }
            canvas.drawText(String.valueOf(getValueByPoints()[i4]), this.f46085S + (i4 * this.f46086T), this.f46101l0, this.f46071F);
        }
    }

    private void k(Canvas canvas, int i4, float f4, float f5) {
        this.f46071F.setStrokeCap(Paint.Cap.ROUND);
        this.f46071F.setColor(this.f46109t0);
        float f6 = i4;
        float width = this.f46085S + (this.f46086T * f6) + (this.f46088V.getWidth() / 2.0f);
        float width2 = (this.f46088V.getWidth() / 2.0f) + this.f46085S + (f6 * this.f46086T);
        float height = this.f46085S + (this.f46086T * 2.4f) + (this.f46088V.getHeight() / 2.0f);
        this.f46071F.setShader(new LinearGradient(width, f5, width2, height, this.f46105p0, this.f46106q0, Shader.TileMode.CLAMP));
        canvas.drawLine(width, f5, width2, height, this.f46071F);
        this.f46071F.setShader(null);
    }

    private void l(Canvas canvas, int i4) {
        this.f46071F.setStrokeCap(Paint.Cap.ROUND);
        float f4 = i4;
        canvas.drawLine(this.f46085S + (this.f46086T * f4) + (this.f46088V.getWidth() / 2.0f), this.f46074H, this.f46085S + (f4 * this.f46086T) + (this.f46088V.getWidth() / 2.0f), this.f46085S + (this.f46086T * 2.4f) + (this.f46088V.getHeight() / 2.0f), this.f46071F);
    }

    private Bitmap m(int i4) {
        Drawable i5 = C0669d.i(getContext(), i4);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), (int) this.f46066B0, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), (int) this.f46066B0);
        i5.draw(canvas);
        return createBitmap;
    }

    private int o(float f4) {
        Log.d(this.f46069E, "getIndexByX mVLineMarginLeft = " + this.f46085S);
        Log.d(this.f46069E, "getIndexByX mSpaceBetweenVLine = " + this.f46086T);
        float f5 = this.f46085S;
        float f6 = this.f46086T;
        int i4 = (int) ((f4 - f5) / f6);
        int i5 = (int) ((f4 - f5) % f6);
        Log.d(this.f46069E, "getIndexByX a = " + i4);
        Log.d(this.f46069E, "getIndexByX c = " + i5);
        if (i5 > this.f46112w0 * this.f46086T) {
            i4++;
            Log.d(this.f46069E, "d = a + 1 and  d = " + i4);
        } else {
            Log.d(this.f46069E, "d = a; and  d = " + i4);
        }
        if (i4 < 0) {
            Log.d(this.f46069E, "d < 0 and  d = 0");
            i4 = 0;
        }
        String[] strArr = this.f46092c0;
        if (i4 > strArr.length - 1) {
            i4 = strArr.length - 1;
            Log.d(this.f46069E, "d > mTitles.length - 1 and  d = " + i4);
        }
        if (i4 != -1) {
            float width = this.f46096g0.get(i4).f46116a - this.f46089W.getWidth();
            float width2 = this.f46096g0.get(i4).f46116a + this.f46089W.getWidth();
            Log.d(this.f46069E, "x range start = " + width);
            Log.d(this.f46069E, "x range end = " + width2);
            Log.d(this.f46069E, "mTune.getWidth() = " + this.f46089W.getWidth());
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
        float f5 = this.f46074H;
        float f6 = this.f46075I;
        float f7 = this.f46076J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        if (((int) (((f4 - f5) - f6) % f7)) > this.f46112w0 * f7) {
            i4++;
        }
        return (this.f46095f0 / 2) - i4;
    }

    private float r(float f4) {
        return this.f46085S + (f4 * this.f46086T) + (this.f46088V.getWidth() / 2);
    }

    private float s(float f4) {
        int i4 = this.f46095f0;
        if (f4 < (-(i4 / 2))) {
            f4 = -(i4 / 2);
        }
        if (f4 > i4 / 2) {
            f4 = i4 / 2;
        }
        return this.f46074H + this.f46075I + (this.f46076J * ((i4 / 2) - ((int) f4)));
    }

    private void t() {
        z();
        this.f46083Q = this.f46074H + this.f46075I;
        this.f46084R = this.f46088V.getHeight() + this.f46075I;
        this.f46092c0 = new String[]{"Number", "Number", "Number", "Number", "Number"};
        this.f46093d0 = new String[]{getResources().getString(j.m.f41842y1), getResources().getString(j.m.f41635D1), getResources().getString(j.m.f41678O0)};
    }

    private void u() {
        int[] iArr = this.f46094e0;
        if (iArr != null && iArr.length > 0) {
            List<b> list = this.f46096g0;
            if (list == null) {
                this.f46096g0 = new ArrayList();
            } else {
                list.clear();
            }
            for (int i4 = 0; i4 < this.f46094e0.length; i4++) {
                this.f46096g0.add(new b(this.f46085S + (i4 * this.f46086T) + (this.f46088V.getWidth() / 2), s(this.f46094e0[i4])));
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
        Iterator<b> it = this.f46096g0.iterator();
        while (it.hasNext()) {
            double c4 = c(x3, y3, it.next());
            Log.d(this.f46069E, "isTouchOnSlider dis = " + c4);
            if (c4 < this.f46087U) {
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
            this.f46088V.getHeight();
            this.f46071F.ascent();
            this.f46071F.descent();
            Log.e("EqualizerView Height", "---speMode = AT_MOST");
        }
        return (int) ((((this.f46074H + this.f46088V.getHeight()) + (this.f46101l0 * 2.0f)) - this.f46071F.ascent()) + this.f46071F.descent());
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
        Resources resources;
        int i4;
        Resources resources2;
        int i5;
        Resources resources3;
        int i6;
        Resources resources4;
        int i7;
        this.f46088V = n(C2046a.b(this.f46065A0, j.f.f41077n2));
        this.f46090a0 = m(j.f.f40967P1);
        if (this.f46091b0) {
            this.f46089W = n(C2046a.b(this.f46065A0, j.f.f41067l2));
            if (!this.f46067C0) {
                resources3 = getResources();
                i6 = j.d.f40690F;
            } else {
                resources3 = getResources();
                i6 = j.d.f40749f1;
            }
            this.f46107r0 = resources3.getColor(i6, getContext().getTheme());
            if (!this.f46067C0) {
                resources4 = getResources();
                i7 = j.d.f40690F;
            } else {
                resources4 = getResources();
                i7 = j.d.f40749f1;
            }
            this.f46108s0 = resources4.getColor(i7, getContext().getTheme());
            return;
        }
        this.f46089W = n(C2046a.b(this.f46065A0, j.f.f41062k2));
        if (!this.f46067C0) {
            resources = getResources();
            i4 = j.d.f40690F;
        } else {
            resources = getResources();
            i4 = j.d.f40749f1;
        }
        this.f46107r0 = resources.getColor(i4, getContext().getTheme());
        if (!this.f46067C0) {
            resources2 = getResources();
            i5 = j.d.f40690F;
        } else {
            resources2 = getResources();
            i5 = j.d.f40749f1;
        }
        this.f46108s0 = resources2.getColor(i5, getContext().getTheme());
    }

    public int[] getColorsDown() {
        int i4 = f46063G0;
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
        if (!this.f46111v0) {
            u();
        }
        this.f46071F.setColor(this.f46078L);
        this.f46071F.setStrokeWidth(b(this.f46077K));
        String[] strArr = this.f46092c0;
        if (strArr != null && strArr.length > 0) {
            this.f46086T = (this.f46073G - (this.f46085S * 2.0f)) / (strArr.length - 1);
            this.f46076J = (this.f46088V.getHeight() - (this.f46075I * 2.0f)) / (this.f46095f0 - 1);
            for (int i4 = 0; i4 < this.f46092c0.length; i4++) {
            }
            this.f46071F.setColor(this.f46097h0);
            this.f46071F.setTextAlign(Paint.Align.CENTER);
            this.f46071F.setTextSize(this.f46099j0);
            this.f46071F.setAntiAlias(true);
            if (!this.f46111v0) {
                u();
            }
            List<b> list = this.f46096g0;
            if (list != null && list.size() > 0) {
                for (int i5 = 0; i5 < this.f46096g0.size(); i5++) {
                }
            }
            List<b> list2 = this.f46096g0;
            if (list2 != null && list2.size() > 0) {
                d(canvas);
                for (int i6 = 0; i6 < this.f46096g0.size(); i6++) {
                    this.f46096g0.get(i6);
                    this.f46071F.setColor(this.f46104o0);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f46073G = View.MeasureSpec.getSize(i4);
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

    public void setChecked(Boolean bool) {
        this.f46067C0 = bool.booleanValue();
        z();
    }

    public void setCustomGraphEdit(boolean z3) {
        this.f46091b0 = z3;
        z();
        invalidate();
    }

    public void setLevel(int i4) {
        this.f46111v0 = false;
        this.f46095f0 = i4;
        invalidate();
    }

    public void setListener(a aVar) {
        this.f46072F0 = aVar;
    }

    public void setSeekable(boolean z3) {
        this.f46091b0 = z3;
    }

    public void setTitles(String[] strArr) {
        this.f46092c0 = strArr;
        invalidate();
    }

    public void setValues(int[] iArr) {
        this.f46094e0 = iArr;
        invalidate();
    }

    public c(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f46065A0 = context;
    }

    public c(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46069E = "EqualizerView BLE_LOG";
        this.f46071F = new Paint();
        this.f46074H = 20.0f;
        this.f46075I = b(15.0f);
        this.f46076J = b(30.0f);
        this.f46077K = 6.0f;
        this.f46078L = Color.parseColor("#FFFFFF");
        this.f46079M = getResources().getColor(j.d.f40772o0, getContext().getTheme());
        this.f46080N = Color.parseColor("#E6E6E6");
        this.f46081O = 2;
        this.f46082P = 2.5f;
        this.f46083Q = 0.0f;
        this.f46084R = 0.0f;
        this.f46085S = b(5.0f);
        this.f46086T = 0.0f;
        this.f46087U = b(25.0f);
        this.f46091b0 = false;
        this.f46094e0 = new int[]{0, 0, 0, 0, 0};
        this.f46095f0 = 5;
        this.f46097h0 = Color.parseColor("#4C596B");
        this.f46098i0 = Color.parseColor("#8CFFFFFF");
        this.f46099j0 = b(14.0f);
        this.f46100k0 = b(18.0f);
        this.f46101l0 = 2.0f;
        this.f46102m0 = new Path();
        this.f46103n0 = new Paint();
        this.f46104o0 = getResources().getColor(j.d.f40749f1, getContext().getTheme());
        this.f46105p0 = Color.parseColor("#FFF0BC");
        this.f46106q0 = Color.parseColor("#FFBD71");
        this.f46107r0 = Color.parseColor("#FF6BA1");
        this.f46108s0 = Color.parseColor("#FE5762");
        this.f46109t0 = Color.parseColor("#2855a6");
        this.f46110u0 = b(2.0f);
        this.f46111v0 = false;
        this.f46112w0 = 0.5f;
        this.f46113x0 = -1.0f;
        this.f46114y0 = -1;
        this.f46115z0 = null;
        this.f46066B0 = b(23.0f);
        this.f46067C0 = false;
        this.f46070E0 = 20;
        this.f46065A0 = context;
        t();
    }
}

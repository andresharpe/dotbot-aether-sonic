package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
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

/* loaded from: classes2.dex */
public class c extends View {

    /* renamed from: x0, reason: collision with root package name */
    public static final int f42647x0 = Color.parseColor("#FF5901");

    /* renamed from: y0, reason: collision with root package name */
    public static final int f42648y0 = Color.parseColor("#FF5901");

    /* renamed from: E, reason: collision with root package name */
    String f42649E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f42650F;

    /* renamed from: G, reason: collision with root package name */
    private int f42651G;

    /* renamed from: H, reason: collision with root package name */
    private float f42652H;

    /* renamed from: I, reason: collision with root package name */
    private float f42653I;

    /* renamed from: J, reason: collision with root package name */
    private float f42654J;

    /* renamed from: K, reason: collision with root package name */
    private float f42655K;

    /* renamed from: L, reason: collision with root package name */
    private int f42656L;

    /* renamed from: M, reason: collision with root package name */
    private int f42657M;

    /* renamed from: N, reason: collision with root package name */
    private int f42658N;

    /* renamed from: O, reason: collision with root package name */
    private float f42659O;

    /* renamed from: P, reason: collision with root package name */
    private float f42660P;

    /* renamed from: Q, reason: collision with root package name */
    private float f42661Q;

    /* renamed from: R, reason: collision with root package name */
    private float f42662R;

    /* renamed from: S, reason: collision with root package name */
    private float f42663S;

    /* renamed from: T, reason: collision with root package name */
    private float f42664T;

    /* renamed from: U, reason: collision with root package name */
    private Bitmap f42665U;

    /* renamed from: V, reason: collision with root package name */
    private Bitmap f42666V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f42667W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f42668a0;

    /* renamed from: b0, reason: collision with root package name */
    private String[] f42669b0;

    /* renamed from: c0, reason: collision with root package name */
    private int[] f42670c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f42671d0;

    /* renamed from: e0, reason: collision with root package name */
    private List<b> f42672e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f42673f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f42674g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f42675h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f42676i0;

    /* renamed from: j0, reason: collision with root package name */
    private Path f42677j0;

    /* renamed from: k0, reason: collision with root package name */
    private Paint f42678k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f42679l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f42680m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f42681n0;

    /* renamed from: o0, reason: collision with root package name */
    private float f42682o0;

    /* renamed from: p0, reason: collision with root package name */
    private float f42683p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f42684q0;

    /* renamed from: r0, reason: collision with root package name */
    private int[] f42685r0;

    /* renamed from: s0, reason: collision with root package name */
    private Context f42686s0;

    /* renamed from: t0, reason: collision with root package name */
    private float f42687t0;

    /* renamed from: u0, reason: collision with root package name */
    private ViewParent f42688u0;

    /* renamed from: v0, reason: collision with root package name */
    int f42689v0;

    /* renamed from: w0, reason: collision with root package name */
    private a f42690w0;

    /* loaded from: classes2.dex */
    public interface a {
        void onProgressChanged(int[] iArr, boolean z3);

        void onStartTrackingTouch();

        void onStopTrackingTouch(int[] iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        float f42691a;

        /* renamed from: b, reason: collision with root package name */
        float f42692b;

        b(float f4, float f5) {
            this.f42691a = f4;
            this.f42692b = f5;
        }
    }

    public c(Context context) {
        this(context, null);
        this.f42686s0 = context;
    }

    private float a(float f4) {
        return TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics());
    }

    private double b(float f4, float f5, b bVar) {
        return Math.sqrt(Math.pow(f4 - bVar.f42691a, 2.0d) + Math.pow(f5 - bVar.f42692b, 2.0d));
    }

    private void c(Canvas canvas) {
        int size = this.f42672e0.size();
        b bVar = this.f42672e0.get(0);
        this.f42677j0.reset();
        this.f42677j0.moveTo(bVar.f42691a, bVar.f42692b);
        float f4 = bVar.f42691a;
        float f5 = bVar.f42692b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f42672e0.get(i4);
            float f6 = bVar2.f42691a;
            float f7 = (f4 + f6) / 2.0f;
            Path path = this.f42677j0;
            float f8 = bVar2.f42692b;
            path.cubicTo(f7, f5, f7, f8, f6, f8);
            f4 = bVar2.f42691a;
            f5 = bVar2.f42692b;
        }
        this.f42678k0.setStyle(Paint.Style.STROKE);
        this.f42678k0.setStrokeWidth(this.f42680m0);
        this.f42678k0.setColor(this.f42679l0);
        canvas.drawPath(this.f42677j0, this.f42678k0);
    }

    private void d(Canvas canvas) {
        int size = this.f42672e0.size();
        b bVar = this.f42672e0.get(0);
        this.f42677j0.reset();
        this.f42677j0.moveTo(bVar.f42691a, bVar.f42692b);
        float f4 = bVar.f42691a;
        float f5 = bVar.f42692b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f42672e0.get(i4);
            float f6 = bVar2.f42691a;
            float f7 = (f4 + f6) / 2.0f;
            float f8 = (bVar2.f42692b + f5) / 2.0f;
            this.f42677j0.quadTo((f4 + f7) / 2.0f, f5, f7, f8);
            Path path = this.f42677j0;
            float f9 = bVar2.f42692b;
            path.quadTo((f6 + f7) / 2.0f, f9, bVar2.f42691a, f9);
            f4 = bVar2.f42691a;
            f5 = bVar2.f42692b;
        }
        this.f42678k0.setStyle(Paint.Style.STROKE);
        this.f42678k0.setStrokeWidth(this.f42680m0);
        this.f42678k0.setColor(this.f42679l0);
        canvas.drawPath(this.f42677j0, this.f42678k0);
    }

    private void e(Canvas canvas, float f4) {
        int i4 = 0;
        while (true) {
            int i5 = this.f42671d0;
            if (i4 < i5) {
                if (i4 == i5 / 2) {
                    this.f42650F.setColor(this.f42657M);
                    this.f42650F.setStrokeWidth(a(this.f42659O));
                    float f5 = i4;
                    canvas.drawLine(f4 - a(this.f42658N), this.f42652H + this.f42653I + (this.f42654J * f5), f4 - a(2.0f), this.f42652H + this.f42653I + (this.f42654J * f5), this.f42650F);
                    canvas.drawLine(this.f42665U.getWidth() + f4 + a(2.0f), this.f42652H + this.f42653I + (this.f42654J * f5), this.f42665U.getWidth() + f4 + a(this.f42658N), this.f42652H + this.f42653I + (this.f42654J * f5), this.f42650F);
                } else {
                    this.f42650F.setColor(this.f42656L);
                    this.f42650F.setStrokeWidth(a(this.f42655K));
                    float f6 = i4;
                    canvas.drawLine(f4 - a(12.0f), this.f42652H + this.f42653I + (this.f42654J * f6), f4 - a(2.0f), this.f42652H + this.f42653I + (this.f42654J * f6), this.f42650F);
                    canvas.drawLine(this.f42665U.getWidth() + f4 + a(2.0f), this.f42652H + this.f42653I + (this.f42654J * f6), this.f42665U.getWidth() + f4 + a(12.0f), this.f42652H + this.f42653I + (this.f42654J * f6), this.f42650F);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    private void f(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f42677j0);
        path.lineTo(this.f42651G - this.f42662R, this.f42665U.getHeight() - this.f42653I);
        path.lineTo(this.f42662R, this.f42665U.getHeight() - this.f42653I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        LinearGradient linearGradient = new LinearGradient(0.0f, this.f42653I, 0.0f, this.f42653I + (this.f42665U.getHeight() / 2), getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP);
        int height = this.f42665U.getHeight() / this.f42689v0;
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        float f4 = this.f42662R;
        canvas.drawRect(f4, this.f42653I, this.f42651G - f4, this.f42665U.getHeight() - this.f42653I, paint);
        for (int i4 = 0; i4 < this.f42689v0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f42651G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private void g(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f42677j0);
        path.lineTo(this.f42651G - this.f42662R, this.f42653I);
        path.lineTo(this.f42662R, this.f42653I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(this.f42651G - this.f42662R, this.f42665U.getHeight() - this.f42653I, this.f42651G - this.f42662R, (this.f42665U.getHeight() / 2) - this.f42653I, getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP));
        float f4 = this.f42662R;
        canvas.drawRect(f4, this.f42653I, this.f42651G - f4, this.f42665U.getHeight() - this.f42653I, paint);
        int height = this.f42665U.getHeight() / this.f42689v0;
        for (int i4 = 0; i4 < this.f42689v0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f42651G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private float[] getPositionsDown() {
        return new float[]{0.0f, 1.0f};
    }

    private int[] getValueByPoints() {
        int[] iArr = new int[this.f42672e0.size()];
        for (int i4 = 0; i4 < this.f42672e0.size(); i4++) {
            iArr[i4] = l(this.f42672e0.get(i4).f42692b);
        }
        return iArr;
    }

    private Bitmap h(int i4) {
        Drawable i5 = C0669d.i(getContext(), i4);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), (int) this.f42687t0, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), (int) this.f42687t0);
        i5.draw(canvas);
        return createBitmap;
    }

    private int j(float f4) {
        float f5 = this.f42662R;
        float f6 = this.f42663S;
        int i4 = (int) ((f4 - f5) / f6);
        if (((int) ((f4 - f5) % f6)) > this.f42682o0 * f6) {
            i4++;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        String[] strArr = this.f42669b0;
        if (i4 > strArr.length - 1) {
            return strArr.length - 1;
        }
        return i4;
    }

    private float k(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    private int l(float f4) {
        float f5 = this.f42652H;
        float f6 = this.f42653I;
        float f7 = this.f42654J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        if (((int) (((f4 - f5) - f6) % f7)) > this.f42682o0 * f7) {
            i4++;
        }
        return (this.f42671d0 / 2) - i4;
    }

    private float m(float f4) {
        return this.f42662R + (f4 * this.f42663S) + (this.f42665U.getWidth() / 2);
    }

    private float n(float f4) {
        int i4 = this.f42671d0;
        if (f4 < (-(i4 / 2))) {
            f4 = -(i4 / 2);
        }
        if (f4 > i4 / 2) {
            f4 = i4 / 2;
        }
        return this.f42652H + this.f42653I + (this.f42654J * ((i4 / 2) - ((int) f4)));
    }

    private void o() {
        v(j.f.f41061k1);
        this.f42660P = this.f42652H + this.f42653I;
        this.f42661Q = this.f42665U.getHeight() - this.f42653I;
        this.f42669b0 = new String[]{getResources().getString(j.m.f41805q), "", getResources().getString(j.m.f41635D1), "", getResources().getString(j.m.Ca)};
    }

    private void p() {
        int[] iArr = this.f42670c0;
        if (iArr != null && iArr.length > 0) {
            List<b> list = this.f42672e0;
            if (list == null) {
                this.f42672e0 = new ArrayList();
            } else {
                list.clear();
            }
            for (int i4 = 0; i4 < this.f42670c0.length; i4++) {
                this.f42672e0.add(new b(this.f42662R + (i4 * this.f42663S) + (this.f42665U.getWidth() / 2), n(this.f42670c0[i4])));
            }
        }
    }

    private boolean q(int[] iArr, int[] iArr2) {
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

    private boolean r(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        Iterator<b> it = this.f42672e0.iterator();
        while (it.hasNext()) {
            double b4 = b(x3, y3, it.next());
            Log.d(this.f42649E, "isTouchOnSlider dis = " + b4);
            if (b4 < this.f42664T) {
                return true;
            }
        }
        return false;
    }

    private int s(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        Log.e("EqPresetView Height", "---speSize = " + size + "");
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    Log.e("EqPresetView Height", "---speSize = EXACTLY");
                }
            } else {
                Math.max(i4, size);
                Log.e("EqPresetView Height", "---speSize = UNSPECIFIED");
            }
        } else {
            this.f42665U.getHeight();
            this.f42650F.ascent();
            this.f42650F.descent();
            Log.e("EqPresetView Height", "---speMode = AT_MOST");
        }
        return (int) ((((this.f42652H + this.f42665U.getHeight()) + this.f42676i0) - this.f42650F.ascent()) + this.f42650F.descent());
    }

    private int t(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        Log.e("EqPresetView Width", "---speSize = " + size + "");
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    Log.e("EqPresetView Width", "---speMode = EXACTLY");
                } else {
                    return i4;
                }
            } else {
                Log.e("EqPresetView Width", "---speMode = UNSPECIFIED");
                return Math.max(i4, size);
            }
        } else {
            Log.e("EqPresetView Width", "---speMode = AT_MOST");
        }
        return size;
    }

    private void v(int i4) {
        this.f42666V = i(C2046a.b(this.f42686s0, i4));
        this.f42667W = h(j.f.f40970Q0);
        this.f42665U = i(C2046a.b(this.f42686s0, j.f.f40967P1));
        if (this.f42668a0) {
            this.f42679l0 = getResources().getColor(j.d.f40745e0);
        } else {
            this.f42679l0 = getResources().getColor(j.d.f40774p0);
        }
    }

    public int[] getColorsDown() {
        int i4 = f42647x0;
        return new int[]{Color.argb(kotlinx.coroutines.scheduling.q.f54649c, Color.red(i4), Color.green(i4), Color.blue(i4)), Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4))};
    }

    public Bitmap i(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f42650F.setColor(this.f42656L);
        this.f42650F.setStrokeWidth(a(this.f42655K));
        String[] strArr = this.f42669b0;
        if (strArr != null && strArr.length > 0) {
            this.f42663S = (this.f42651G - (this.f42662R * 2.0f)) / (strArr.length - 1);
            this.f42654J = (this.f42665U.getHeight() - (this.f42653I * 2.0f)) / (this.f42671d0 - 1);
            for (int i4 = 0; i4 < this.f42669b0.length; i4++) {
                canvas.drawBitmap(this.f42665U, this.f42662R + (i4 * this.f42663S), this.f42652H, this.f42650F);
            }
            canvas.drawBitmap(this.f42667W, this.f42662R + ((this.f42663S / 2.0f) * 1.0f), this.f42652H, this.f42650F);
            canvas.drawBitmap(this.f42667W, this.f42662R + ((this.f42663S / 2.0f) * 3.0f), this.f42652H, this.f42650F);
            canvas.drawBitmap(this.f42666V, 0.0f, 0.0f, this.f42650F);
            this.f42650F.setColor(this.f42673f0);
            this.f42650F.setTextAlign(Paint.Align.CENTER);
            this.f42650F.setTextSize(this.f42675h0);
            this.f42650F.setAntiAlias(true);
            for (int i5 = 0; i5 < this.f42669b0.length; i5++) {
                Paint paint = new Paint();
                paint.setColor(this.f42674g0);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(this.f42675h0);
                paint.setAntiAlias(true);
                canvas.drawText(this.f42669b0[i5], this.f42662R + (i5 * this.f42663S), this.f42652H + this.f42665U.getHeight() + this.f42676i0, paint);
            }
            if (!this.f42681n0) {
                p();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f42651G = View.MeasureSpec.getSize(i4);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        Log.e("EqualizerPresetView", "---minimumWidth = " + suggestedMinimumWidth + "");
        Log.e("EqualizerPresetView", "---minimumHeight = " + suggestedMinimumHeight + "");
        int t3 = t(suggestedMinimumWidth, i4);
        int s4 = s(suggestedMinimumHeight, i5);
        Log.e("EqualizerPresetView", "---width = " + t3 + "");
        Log.e("EqualizerPresetView", "---height = " + s4 + "");
        setMeasuredDimension(t3, s4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f42668a0) {
            this.f42681n0 = true;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 4) {
                            return false;
                        }
                    } else {
                        float y3 = motionEvent.getY();
                        if (this.f42684q0 != -1) {
                            float f4 = this.f42661Q;
                            if (y3 > f4) {
                                y3 = f4;
                            }
                            float f5 = this.f42660P;
                            if (y3 < f5) {
                                y3 = f5;
                            }
                            int l4 = l(y3);
                            Log.d(this.f42649E, "ACTION_MOVE index = " + this.f42684q0 + " , value = " + l4);
                            this.f42672e0.remove(this.f42684q0);
                            List<b> list = this.f42672e0;
                            int i4 = this.f42684q0;
                            list.add(i4, new b(m((float) i4), y3));
                            invalidate();
                            int[] valueByPoints = getValueByPoints();
                            if (!q(valueByPoints, this.f42685r0) && (aVar = this.f42690w0) != null) {
                                aVar.onProgressChanged(getValueByPoints(), true);
                            }
                            this.f42685r0 = valueByPoints;
                        } else {
                            Log.e(this.f42649E, "ACTION_MOVE index = " + this.f42684q0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f42660P + " , mMaxY = " + this.f42661Q);
                        }
                    }
                } else {
                    float y4 = motionEvent.getY();
                    int l5 = l(y4);
                    if (this.f42684q0 != -1) {
                        float f6 = this.f42661Q;
                        if (y4 > f6) {
                            y4 = f6;
                        }
                        float f7 = this.f42660P;
                        if (y4 < f7) {
                            y4 = f7;
                        }
                        int l6 = l(y4);
                        Log.d(this.f42649E, "ACTION_UP index = " + this.f42684q0 + " , value = " + l6);
                        this.f42672e0.remove(this.f42684q0);
                        List<b> list2 = this.f42672e0;
                        int i5 = this.f42684q0;
                        list2.add(i5, new b(m((float) i5), n((float) l6)));
                        invalidate();
                        a aVar2 = this.f42690w0;
                        if (aVar2 != null) {
                            aVar2.onStopTrackingTouch(getValueByPoints());
                        }
                    } else {
                        Log.e(this.f42649E, "ACTION_UP index = " + this.f42684q0 + " , value = " + l5 + " , y = " + y4 + " , mMinY = " + this.f42660P + " , mMaxY = " + this.f42661Q);
                    }
                }
            } else {
                ViewParent viewParent = this.f42688u0;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(true);
                } else {
                    ViewParent parent = getParent();
                    while (true) {
                        if (parent instanceof ScrollView) {
                            this.f42688u0 = parent;
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
                this.f42683p0 = x3;
                int j4 = j(x3);
                this.f42684q0 = j4;
                if (j4 == -1) {
                    return true;
                }
                if (!r(motionEvent)) {
                    Log.d(this.f42649E, "isTouchOnSlider false ");
                    this.f42688u0.requestDisallowInterceptTouchEvent(false);
                    return false;
                }
                Log.d(this.f42649E, "isTouchOnSlider true rang = " + this.f42664T);
            }
        }
        return true;
    }

    public void setLevel(int i4) {
        this.f42681n0 = false;
        this.f42671d0 = i4;
        invalidate();
    }

    public void setListener(a aVar) {
    }

    public void setTitles(String[] strArr) {
        this.f42669b0 = strArr;
        invalidate();
    }

    public void setValues(int[] iArr) {
        this.f42670c0 = iArr;
        invalidate();
    }

    public void u(boolean z3, int i4) {
        this.f42668a0 = z3;
        v(i4);
        invalidate();
    }

    public c(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f42686s0 = context;
    }

    public c(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42649E = "EqualizerPresetView BLE_LOG";
        this.f42650F = new Paint();
        this.f42652H = 0.0f;
        this.f42653I = a(22.0f);
        this.f42654J = a(30.0f);
        this.f42655K = 1.5f;
        this.f42656L = Color.parseColor("#ccd2d8");
        this.f42657M = Color.parseColor("#ccd2d8");
        this.f42658N = 18;
        this.f42659O = 2.5f;
        this.f42660P = 0.0f;
        this.f42661Q = 0.0f;
        this.f42662R = a(41.0f);
        this.f42663S = 0.0f;
        this.f42664T = a(25.0f);
        this.f42668a0 = true;
        this.f42670c0 = new int[]{0, 0, 0};
        this.f42671d0 = 5;
        this.f42673f0 = Color.parseColor("#4C596B");
        this.f42674g0 = Color.parseColor("#4DFFFFFF");
        this.f42675h0 = a(14.0f);
        this.f42676i0 = a(19.0f);
        this.f42677j0 = new Path();
        this.f42678k0 = new Paint();
        this.f42679l0 = Color.parseColor("#FF5901");
        this.f42680m0 = a(3.0f);
        this.f42681n0 = false;
        this.f42682o0 = 0.5f;
        this.f42683p0 = -1.0f;
        this.f42684q0 = -1;
        this.f42685r0 = null;
        this.f42687t0 = a(136.0f);
        this.f42689v0 = 20;
        this.f42686s0 = context;
        o();
    }
}

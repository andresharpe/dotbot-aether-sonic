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
public class EqualizerView extends View {

    /* renamed from: y0, reason: collision with root package name */
    public static final int f42438y0 = Color.parseColor("#FF5901");

    /* renamed from: z0, reason: collision with root package name */
    public static final int f42439z0 = Color.parseColor("#FF5901");

    /* renamed from: E, reason: collision with root package name */
    String f42440E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f42441F;

    /* renamed from: G, reason: collision with root package name */
    private int f42442G;

    /* renamed from: H, reason: collision with root package name */
    private float f42443H;

    /* renamed from: I, reason: collision with root package name */
    private float f42444I;

    /* renamed from: J, reason: collision with root package name */
    private float f42445J;

    /* renamed from: K, reason: collision with root package name */
    private float f42446K;

    /* renamed from: L, reason: collision with root package name */
    private int f42447L;

    /* renamed from: M, reason: collision with root package name */
    private int f42448M;

    /* renamed from: N, reason: collision with root package name */
    private int f42449N;

    /* renamed from: O, reason: collision with root package name */
    private float f42450O;

    /* renamed from: P, reason: collision with root package name */
    private float f42451P;

    /* renamed from: Q, reason: collision with root package name */
    private float f42452Q;

    /* renamed from: R, reason: collision with root package name */
    private float f42453R;

    /* renamed from: S, reason: collision with root package name */
    private float f42454S;

    /* renamed from: T, reason: collision with root package name */
    private float f42455T;

    /* renamed from: U, reason: collision with root package name */
    private Bitmap f42456U;

    /* renamed from: V, reason: collision with root package name */
    private Bitmap f42457V;

    /* renamed from: W, reason: collision with root package name */
    private Bitmap f42458W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f42459a0;

    /* renamed from: b0, reason: collision with root package name */
    private String[] f42460b0;

    /* renamed from: c0, reason: collision with root package name */
    private int[] f42461c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f42462d0;

    /* renamed from: e0, reason: collision with root package name */
    private List<b> f42463e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f42464f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f42465g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f42466h0;

    /* renamed from: i0, reason: collision with root package name */
    private float f42467i0;

    /* renamed from: j0, reason: collision with root package name */
    private Path f42468j0;

    /* renamed from: k0, reason: collision with root package name */
    private Paint f42469k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f42470l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f42471m0;

    /* renamed from: n0, reason: collision with root package name */
    private float f42472n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f42473o0;

    /* renamed from: p0, reason: collision with root package name */
    private float f42474p0;

    /* renamed from: q0, reason: collision with root package name */
    private float f42475q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f42476r0;

    /* renamed from: s0, reason: collision with root package name */
    private int[] f42477s0;

    /* renamed from: t0, reason: collision with root package name */
    private Context f42478t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f42479u0;

    /* renamed from: v0, reason: collision with root package name */
    private ViewParent f42480v0;

    /* renamed from: w0, reason: collision with root package name */
    int f42481w0;

    /* renamed from: x0, reason: collision with root package name */
    private a f42482x0;

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
        float f42483a;

        /* renamed from: b, reason: collision with root package name */
        float f42484b;

        b(float f4, float f5) {
            this.f42483a = f4;
            this.f42484b = f5;
        }
    }

    public EqualizerView(Context context) {
        this(context, null);
        this.f42478t0 = context;
    }

    private int a(float f4) {
        Log.d(this.f42440E, "getValueBY y = " + f4);
        Log.d(this.f42440E, "getValueBY mPaddingTop = " + this.f42443H);
        Log.d(this.f42440E, "getValueBY mHLineMarginTop = " + this.f42444I);
        Log.d(this.f42440E, "getValueBY mSpaceBetweenHLine = " + this.f42445J);
        float f5 = this.f42443H;
        float f6 = this.f42444I;
        float f7 = this.f42445J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        int i5 = (int) (((f4 - f5) - f6) % f7);
        Log.d(this.f42440E, "getValueBY a = " + i4);
        Log.d(this.f42440E, "getValueBY c = " + i5);
        if (i5 > this.f42474p0 * this.f42445J) {
            i4++;
            Log.d(this.f42440E, "getValueBY  d = a + 1 and d = " + i4);
        } else {
            Log.d(this.f42440E, "getValueBY  d = a and d = " + i4);
        }
        int i6 = (this.f42462d0 / 2) - i4;
        Log.d(this.f42440E, "getValueBY yLevelValue = " + i6);
        int i7 = this.f42476r0;
        if (i7 >= 0) {
            float height = this.f42463e0.get(i7).f42484b - this.f42457V.getHeight();
            float height2 = this.f42463e0.get(this.f42476r0).f42484b + this.f42457V.getHeight();
            Log.d(this.f42440E, "y from PointList  = " + this.f42463e0.get(this.f42476r0).f42484b);
            Log.d(this.f42440E, "y range start = " + height);
            Log.d(this.f42440E, "y range end = " + height2);
            Log.d(this.f42440E, "mTune.getHeight() = " + this.f42457V.getHeight());
            Log.d(this.f42440E, "extra  = " + ((this.f42444I * 2.0f) + this.f42443H + (this.f42474p0 * this.f42445J)));
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
        return Math.sqrt(Math.pow(f4 - bVar.f42483a, 2.0d) + Math.pow(f5 - bVar.f42484b, 2.0d));
    }

    private void d(Canvas canvas) {
        int size = this.f42463e0.size();
        b bVar = this.f42463e0.get(0);
        this.f42468j0.reset();
        this.f42468j0.moveTo(bVar.f42483a, bVar.f42484b);
        float f4 = bVar.f42483a;
        float f5 = bVar.f42484b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f42463e0.get(i4);
            float f6 = bVar2.f42483a;
            float f7 = (f4 + f6) / 2.0f;
            Path path = this.f42468j0;
            float f8 = bVar2.f42484b;
            path.cubicTo(f7, f5, f7, f8, f6, f8);
            f4 = bVar2.f42483a;
            f5 = bVar2.f42484b;
        }
        this.f42469k0.setStyle(Paint.Style.STROKE);
        this.f42469k0.setStrokeWidth(this.f42472n0);
        this.f42469k0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f42470l0, this.f42471m0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f42468j0, this.f42469k0);
    }

    private void e(Canvas canvas) {
        int size = this.f42463e0.size();
        b bVar = this.f42463e0.get(0);
        this.f42468j0.reset();
        this.f42468j0.moveTo(bVar.f42483a, bVar.f42484b);
        float f4 = bVar.f42483a;
        float f5 = bVar.f42484b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f42463e0.get(i4);
            float f6 = bVar2.f42483a;
            float f7 = (f4 + f6) / 2.0f;
            this.f42468j0.quadTo((f4 + f7) / 2.0f, f5, f7, (bVar2.f42484b + f5) / 2.0f);
            Path path = this.f42468j0;
            float f8 = bVar2.f42484b;
            path.quadTo((f6 + f7) / 2.0f, f8, bVar2.f42483a, f8);
            f4 = bVar2.f42483a;
            f5 = bVar2.f42484b;
        }
        this.f42469k0.setStyle(Paint.Style.STROKE);
        this.f42469k0.setStrokeWidth(this.f42472n0);
        this.f42469k0.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, this.f42470l0, this.f42471m0, Shader.TileMode.CLAMP));
        canvas.drawPath(this.f42468j0, this.f42469k0);
    }

    private void f(Canvas canvas, float f4) {
        for (int i4 = 0; i4 < this.f42462d0; i4++) {
            this.f42441F.setColor(this.f42447L);
            this.f42441F.setStrokeWidth(b(2.0f));
            float f5 = i4;
            canvas.drawLine(f4, this.f42443H + this.f42444I + (this.f42445J * f5), f4 + b(6.0f), this.f42443H + this.f42444I + (this.f42445J * f5), this.f42441F);
        }
    }

    private void g(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f42468j0);
        path.lineTo(this.f42442G - this.f42453R, this.f42456U.getHeight() - this.f42444I);
        path.lineTo(this.f42453R, this.f42456U.getHeight() - this.f42444I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        LinearGradient linearGradient = new LinearGradient(0.0f, this.f42444I, 0.0f, this.f42444I + (this.f42456U.getHeight() / 2), getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP);
        int height = this.f42456U.getHeight() / this.f42481w0;
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        float f4 = this.f42453R;
        canvas.drawRect(f4, this.f42444I, this.f42442G - f4, this.f42456U.getHeight() - this.f42444I, paint);
        for (int i4 = 0; i4 < this.f42481w0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f42442G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private float[] getPositionsDown() {
        return new float[]{0.0f, 1.0f};
    }

    private int[] getValueByPoints() {
        int[] iArr = new int[this.f42463e0.size()];
        for (int i4 = 0; i4 < this.f42463e0.size(); i4++) {
            iArr[i4] = m(this.f42463e0.get(i4).f42484b);
        }
        return iArr;
    }

    private void h(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f42468j0);
        path.lineTo(this.f42442G - this.f42453R, this.f42444I);
        path.lineTo(this.f42453R, this.f42444I);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(this.f42442G - this.f42453R, this.f42456U.getHeight() - this.f42444I, this.f42442G - this.f42453R, (this.f42456U.getHeight() / 2) - this.f42444I, getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP));
        float f4 = this.f42453R;
        canvas.drawRect(f4, this.f42444I, this.f42442G - f4, this.f42456U.getHeight() - this.f42444I, paint);
        int height = this.f42456U.getHeight() / this.f42481w0;
        for (int i4 = 0; i4 < this.f42481w0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f42442G, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private Bitmap i(int i4) {
        Drawable i5 = C0669d.i(getContext(), i4);
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), (int) this.f42479u0, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), (int) this.f42479u0);
        i5.draw(canvas);
        return createBitmap;
    }

    private int k(float f4) {
        Log.d(this.f42440E, "getIndexByX mVLineMarginLeft = " + this.f42453R);
        Log.d(this.f42440E, "getIndexByX mSpaceBetweenVLine = " + this.f42454S);
        float f5 = this.f42453R;
        float f6 = this.f42454S;
        int i4 = (int) ((f4 - f5) / f6);
        int i5 = (int) ((f4 - f5) % f6);
        Log.d(this.f42440E, "getIndexByX a = " + i4);
        Log.d(this.f42440E, "getIndexByX c = " + i5);
        if (i5 > this.f42474p0 * this.f42454S) {
            i4++;
            Log.d(this.f42440E, "d = a + 1 and  d = " + i4);
        } else {
            Log.d(this.f42440E, "d = a; and  d = " + i4);
        }
        if (i4 < 0) {
            Log.d(this.f42440E, "d < 0 and  d = 0");
            i4 = 0;
        }
        String[] strArr = this.f42460b0;
        if (i4 > strArr.length - 1) {
            i4 = strArr.length - 1;
            Log.d(this.f42440E, "d > mTitles.length - 1 and  d = " + i4);
        }
        if (i4 != -1) {
            float width = this.f42463e0.get(i4).f42483a - this.f42457V.getWidth();
            float width2 = this.f42463e0.get(i4).f42483a + this.f42457V.getWidth();
            Log.d(this.f42440E, "x range start = " + width);
            Log.d(this.f42440E, "x range end = " + width2);
            Log.d(this.f42440E, "mTune.getWidth() = " + this.f42457V.getWidth());
            if (f4 >= width && f4 <= width2) {
                return i4;
            }
        }
        return -1;
    }

    private float l(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    private int m(float f4) {
        float f5 = this.f42443H;
        float f6 = this.f42444I;
        float f7 = this.f42445J;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        if (((int) (((f4 - f5) - f6) % f7)) > this.f42474p0 * f7) {
            i4++;
        }
        return (this.f42462d0 / 2) - i4;
    }

    private float n(float f4) {
        return this.f42453R + (f4 * this.f42454S) + (this.f42456U.getWidth() / 2);
    }

    private float o(float f4) {
        int i4 = this.f42462d0;
        if (f4 < (-(i4 / 2))) {
            f4 = -(i4 / 2);
        }
        if (f4 > i4 / 2) {
            f4 = i4 / 2;
        }
        return this.f42443H + this.f42444I + (this.f42445J * ((i4 / 2) - ((int) f4)));
    }

    private void p() {
        v();
        this.f42451P = this.f42443H + this.f42444I;
        this.f42452Q = this.f42456U.getHeight() - this.f42444I;
        this.f42460b0 = new String[]{getResources().getString(j.m.f41805q), getResources().getString(j.m.f41635D1), getResources().getString(j.m.Ca)};
    }

    private void q() {
        int[] iArr = this.f42461c0;
        if (iArr != null && iArr.length > 0) {
            List<b> list = this.f42463e0;
            if (list == null) {
                this.f42463e0 = new ArrayList();
            } else {
                list.clear();
            }
            for (int i4 = 0; i4 < this.f42461c0.length; i4++) {
                this.f42463e0.add(new b(this.f42453R + (i4 * this.f42454S) + (this.f42456U.getWidth() / 2), o(this.f42461c0[i4])));
            }
        }
    }

    private boolean r(int[] iArr, int[] iArr2) {
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

    private boolean s(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        Iterator<b> it = this.f42463e0.iterator();
        while (it.hasNext()) {
            double c4 = c(x3, y3, it.next());
            Log.d(this.f42440E, "isTouchOnSlider dis = " + c4);
            if (c4 < this.f42455T) {
                return true;
            }
        }
        return false;
    }

    private int t(int i4, int i5) {
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
            this.f42456U.getHeight();
            this.f42441F.ascent();
            this.f42441F.descent();
            Log.e("EqualizerView Height", "---speMode = AT_MOST");
        }
        return (int) ((((this.f42443H + this.f42456U.getHeight()) + this.f42467i0) - this.f42441F.ascent()) + this.f42441F.descent());
    }

    private int u(int i4, int i5) {
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

    private void v() {
        this.f42456U = j(C2046a.b(this.f42478t0, j.f.f41072m2));
        this.f42458W = i(j.f.f40970Q0);
        if (this.f42459a0) {
            this.f42457V = j(C2046a.b(this.f42478t0, j.f.f41067l2));
            this.f42470l0 = getResources().getColor(j.d.f40701K0, getContext().getTheme());
            this.f42471m0 = getResources().getColor(j.d.f40766l0, getContext().getTheme());
        } else {
            this.f42457V = j(C2046a.b(this.f42478t0, j.f.f41062k2));
            this.f42470l0 = getResources().getColor(j.d.f40774p0, getContext().getTheme());
            this.f42471m0 = getResources().getColor(j.d.f40774p0, getContext().getTheme());
        }
    }

    public int[] getColorsDown() {
        int i4 = f42438y0;
        return new int[]{Color.argb(kotlinx.coroutines.scheduling.q.f54649c, Color.red(i4), Color.green(i4), Color.blue(i4)), Color.argb(0, Color.red(i4), Color.green(i4), Color.blue(i4))};
    }

    public Bitmap j(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f42441F.setColor(this.f42447L);
        this.f42441F.setStrokeWidth(b(this.f42446K));
        String[] strArr = this.f42460b0;
        if (strArr != null && strArr.length > 0) {
            this.f42454S = (this.f42442G - (this.f42453R * 2.0f)) / (strArr.length - 1);
            this.f42445J = (this.f42456U.getHeight() - (this.f42444I * 2.0f)) / (this.f42462d0 - 1);
            for (int i4 = 0; i4 < this.f42460b0.length; i4++) {
                float f4 = i4;
                canvas.drawBitmap(this.f42456U, this.f42453R + (this.f42454S * f4), this.f42443H, this.f42441F);
                f(canvas, this.f42453R + (f4 * this.f42454S));
            }
            canvas.drawBitmap(this.f42458W, this.f42453R + ((this.f42454S / 2.0f) * 1.0f), this.f42443H, this.f42441F);
            canvas.drawBitmap(this.f42458W, this.f42453R + ((this.f42454S / 2.0f) * 3.0f), this.f42443H, this.f42441F);
            this.f42441F.setColor(this.f42464f0);
            this.f42441F.setTextAlign(Paint.Align.CENTER);
            this.f42441F.setTextSize(this.f42466h0);
            this.f42441F.setAntiAlias(true);
            for (int i5 = 0; i5 < this.f42460b0.length; i5++) {
                Paint paint = new Paint();
                paint.setColor(this.f42465g0);
                paint.setTextAlign(Paint.Align.CENTER);
                paint.setTextSize(this.f42466h0);
                paint.setAntiAlias(true);
                canvas.drawText(this.f42460b0[i5], this.f42453R + (i5 * this.f42454S), this.f42443H + this.f42456U.getHeight() + this.f42467i0, paint);
            }
            if (!this.f42473o0) {
                q();
            }
            List<b> list = this.f42463e0;
            if (list != null && list.size() > 0) {
                d(canvas);
                for (int i6 = 0; i6 < this.f42463e0.size(); i6++) {
                    b bVar = this.f42463e0.get(i6);
                    canvas.drawBitmap(this.f42457V, bVar.f42483a - (r2.getWidth() / 2), bVar.f42484b - (this.f42457V.getHeight() / 2), this.f42441F);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f42442G = View.MeasureSpec.getSize(i4);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        Log.e("EqualizerView", "---minimumWidth = " + suggestedMinimumWidth + "");
        Log.e("EqualizerView", "---minimumHeight = " + suggestedMinimumHeight + "");
        int u3 = u(suggestedMinimumWidth, i4);
        int t3 = t(suggestedMinimumHeight, i5);
        Log.e("EqualizerView", "---width = " + u3 + "");
        Log.e("EqualizerView", "---height = " + t3 + "");
        setMeasuredDimension(u3, t3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f42459a0) {
            this.f42473o0 = true;
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 4) {
                            return false;
                        }
                    } else {
                        float y3 = motionEvent.getY();
                        if (this.f42476r0 != -1) {
                            float f4 = this.f42452Q;
                            if (y3 > f4) {
                                y3 = f4;
                            }
                            float f5 = this.f42451P;
                            if (y3 < f5) {
                                y3 = f5;
                            }
                            if (a(y3) != -1) {
                                int m4 = m(y3);
                                Log.d(this.f42440E, "ACTION_MOVE index = " + this.f42476r0 + " , value = " + m4);
                                this.f42463e0.remove(this.f42476r0);
                                List<b> list = this.f42463e0;
                                int i4 = this.f42476r0;
                                list.add(i4, new b(n((float) i4), y3));
                                invalidate();
                                int[] valueByPoints = getValueByPoints();
                                if (!r(valueByPoints, this.f42477s0) && (aVar = this.f42482x0) != null) {
                                    aVar.onProgressChanged(getValueByPoints(), true);
                                }
                                this.f42477s0 = valueByPoints;
                            } else {
                                Log.e(this.f42440E, "ACTION_MOVE index = " + this.f42476r0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f42451P + " , mMaxY = " + this.f42452Q);
                                int m5 = m(this.f42463e0.get(this.f42476r0).f42484b);
                                float o4 = o((float) m5);
                                String str = this.f42440E;
                                StringBuilder sb = new StringBuilder();
                                sb.append("ACTION_MOVE current Y value = ");
                                sb.append(this.f42463e0.get(this.f42476r0).f42484b);
                                Log.d(str, sb.toString());
                                Log.d(this.f42440E, "ACTION_MOVE Level based on current Y = " + m5);
                                Log.d(this.f42440E, "ACTION_MOVE yValue based on Level = " + o4);
                                Log.d(this.f42440E, "Its a fling while selection, so just update it to the nearest level");
                                Log.d(this.f42440E, "ACTION_MOVE index = " + this.f42476r0 + " , value = " + o4);
                                this.f42463e0.remove(this.f42476r0);
                                List<b> list2 = this.f42463e0;
                                int i5 = this.f42476r0;
                                list2.add(i5, new b(n((float) i5), o4));
                                invalidate();
                                a aVar2 = this.f42482x0;
                                if (aVar2 != null) {
                                    aVar2.onStopTrackingTouch(getValueByPoints());
                                }
                            }
                        } else {
                            Log.e(this.f42440E, "ACTION_MOVE index = " + this.f42476r0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f42451P + " , mMaxY = " + this.f42452Q);
                            this.f42480v0.requestDisallowInterceptTouchEvent(false);
                            return false;
                        }
                    }
                } else {
                    float y4 = motionEvent.getY();
                    int m6 = m(y4);
                    if (this.f42476r0 != -1) {
                        float f6 = this.f42452Q;
                        if (y4 > f6) {
                            y4 = f6;
                        }
                        float f7 = this.f42451P;
                        if (y4 < f7) {
                            y4 = f7;
                        }
                        if (a(y4) != -1) {
                            int m7 = m(y4);
                            Log.d(this.f42440E, "ACTION_UP index = " + this.f42476r0 + " , value = " + m7);
                            this.f42463e0.remove(this.f42476r0);
                            List<b> list3 = this.f42463e0;
                            int i6 = this.f42476r0;
                            list3.add(i6, new b(n((float) i6), o((float) m7)));
                            invalidate();
                            a aVar3 = this.f42482x0;
                            if (aVar3 != null) {
                                aVar3.onStopTrackingTouch(getValueByPoints());
                            }
                        } else {
                            Log.e(this.f42440E, "ACTION_UP index = " + this.f42476r0 + " , value = " + m6 + " , y = " + y4 + " , mMinY = " + this.f42451P + " , mMaxY = " + this.f42452Q);
                            this.f42480v0.requestDisallowInterceptTouchEvent(false);
                            return false;
                        }
                    } else {
                        Log.e(this.f42440E, "ACTION_UP index = " + this.f42476r0 + " , value = " + m6 + " , y = " + y4 + " , mMinY = " + this.f42451P + " , mMaxY = " + this.f42452Q);
                        this.f42480v0.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
            } else {
                Log.d(this.f42440E, "ACTION_DOWN index = " + this.f42476r0);
                ViewParent viewParent = this.f42480v0;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(true);
                } else {
                    ViewParent parent = getParent();
                    while (true) {
                        if (parent instanceof ScrollView) {
                            this.f42480v0 = parent;
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
                this.f42475q0 = x3;
                this.f42476r0 = k(x3);
                Log.d(this.f42440E, "ACTION_DOWN mDownX = " + this.f42475q0);
                Log.d(this.f42440E, "ACTION_DOWN getIndexByX mCurrentIndex = " + this.f42476r0);
            }
        }
        return true;
    }

    public void setCustomGraphEdit(boolean z3) {
        this.f42459a0 = z3;
        v();
        invalidate();
    }

    public void setLevel(int i4) {
        this.f42473o0 = false;
        this.f42462d0 = i4;
        invalidate();
    }

    public void setListener(a aVar) {
        this.f42482x0 = aVar;
    }

    public void setTitles(String[] strArr) {
        this.f42460b0 = strArr;
        invalidate();
    }

    public void setValues(int[] iArr) {
        this.f42461c0 = iArr;
        invalidate();
    }

    public EqualizerView(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f42478t0 = context;
    }

    public EqualizerView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42440E = "EqualizerView BLE_LOG";
        this.f42441F = new Paint();
        this.f42443H = 0.0f;
        this.f42444I = b(10.0f);
        this.f42445J = b(30.0f);
        this.f42446K = 1.5f;
        this.f42447L = Color.parseColor("#FFFFFF");
        this.f42448M = Color.parseColor("#E6E6E6");
        this.f42449N = 2;
        this.f42450O = 2.5f;
        this.f42451P = 0.0f;
        this.f42452Q = 0.0f;
        this.f42453R = b(41.0f);
        this.f42454S = 0.0f;
        this.f42455T = b(25.0f);
        this.f42459a0 = true;
        this.f42461c0 = new int[]{0, 0, 0};
        this.f42462d0 = 5;
        this.f42464f0 = Color.parseColor("#4C596B");
        this.f42465g0 = Color.parseColor("#4DFFFFFF");
        this.f42466h0 = b(14.0f);
        this.f42467i0 = b(19.0f);
        this.f42468j0 = new Path();
        this.f42469k0 = new Paint();
        this.f42470l0 = Color.parseColor("#FF6BA1");
        this.f42471m0 = Color.parseColor("#FE5762");
        this.f42472n0 = b(3.0f);
        this.f42473o0 = false;
        this.f42474p0 = 0.5f;
        this.f42475q0 = -1.0f;
        this.f42476r0 = -1;
        this.f42477s0 = null;
        this.f42479u0 = b(136.0f);
        this.f42481w0 = 20;
        this.f42478t0 = context;
        p();
    }
}

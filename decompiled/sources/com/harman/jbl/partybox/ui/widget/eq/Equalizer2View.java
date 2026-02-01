package com.harman.jbl.partybox.ui.widget.eq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.annotation.P;
import com.harman.jbl.partybox.j;
import e.C2046a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlinx.coroutines.scheduling.q;

/* loaded from: classes2.dex */
public class Equalizer2View extends View {

    /* renamed from: M0, reason: collision with root package name */
    public static final int f45934M0 = Color.parseColor("#FF5901");

    /* renamed from: N0, reason: collision with root package name */
    public static final int f45935N0 = Color.parseColor("#FF5901");

    /* renamed from: A0, reason: collision with root package name */
    private float f45936A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f45937B0;

    /* renamed from: C0, reason: collision with root package name */
    private float f45938C0;

    /* renamed from: D0, reason: collision with root package name */
    private float f45939D0;

    /* renamed from: E, reason: collision with root package name */
    String f45940E;

    /* renamed from: E0, reason: collision with root package name */
    private int f45941E0;

    /* renamed from: F, reason: collision with root package name */
    private Paint f45942F;

    /* renamed from: F0, reason: collision with root package name */
    private int[] f45943F0;

    /* renamed from: G, reason: collision with root package name */
    private float f45944G;

    /* renamed from: G0, reason: collision with root package name */
    private Handler f45945G0;

    /* renamed from: H, reason: collision with root package name */
    private float f45946H;

    /* renamed from: H0, reason: collision with root package name */
    private Runnable f45947H0;

    /* renamed from: I, reason: collision with root package name */
    private int f45948I;

    /* renamed from: I0, reason: collision with root package name */
    private Vibrator f45949I0;

    /* renamed from: J, reason: collision with root package name */
    private float f45950J;

    /* renamed from: J0, reason: collision with root package name */
    private ViewParent f45951J0;

    /* renamed from: K, reason: collision with root package name */
    private float f45952K;

    /* renamed from: K0, reason: collision with root package name */
    int f45953K0;

    /* renamed from: L, reason: collision with root package name */
    private float f45954L;

    /* renamed from: L0, reason: collision with root package name */
    private a f45955L0;

    /* renamed from: M, reason: collision with root package name */
    private float f45956M;

    /* renamed from: N, reason: collision with root package name */
    private float f45957N;

    /* renamed from: O, reason: collision with root package name */
    private int f45958O;

    /* renamed from: P, reason: collision with root package name */
    private int f45959P;

    /* renamed from: Q, reason: collision with root package name */
    private int f45960Q;

    /* renamed from: R, reason: collision with root package name */
    private int f45961R;

    /* renamed from: S, reason: collision with root package name */
    private int f45962S;

    /* renamed from: T, reason: collision with root package name */
    private int f45963T;

    /* renamed from: U, reason: collision with root package name */
    private int f45964U;

    /* renamed from: V, reason: collision with root package name */
    private int f45965V;

    /* renamed from: W, reason: collision with root package name */
    private int f45966W;

    /* renamed from: a0, reason: collision with root package name */
    private int f45967a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f45968b0;

    /* renamed from: c0, reason: collision with root package name */
    private float f45969c0;

    /* renamed from: d0, reason: collision with root package name */
    private float f45970d0;

    /* renamed from: e0, reason: collision with root package name */
    private float f45971e0;

    /* renamed from: f0, reason: collision with root package name */
    private float f45972f0;

    /* renamed from: g0, reason: collision with root package name */
    private float f45973g0;

    /* renamed from: h0, reason: collision with root package name */
    private float f45974h0;

    /* renamed from: i0, reason: collision with root package name */
    private Bitmap f45975i0;

    /* renamed from: j0, reason: collision with root package name */
    private Bitmap f45976j0;

    /* renamed from: k0, reason: collision with root package name */
    private Bitmap f45977k0;

    /* renamed from: l0, reason: collision with root package name */
    private Bitmap f45978l0;

    /* renamed from: m0, reason: collision with root package name */
    private Bitmap f45979m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f45980n0;

    /* renamed from: o0, reason: collision with root package name */
    private String[] f45981o0;

    /* renamed from: p0, reason: collision with root package name */
    private String[] f45982p0;

    /* renamed from: q0, reason: collision with root package name */
    private int[] f45983q0;

    /* renamed from: r0, reason: collision with root package name */
    private int f45984r0;

    /* renamed from: s0, reason: collision with root package name */
    private List<b> f45985s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f45986t0;

    /* renamed from: u0, reason: collision with root package name */
    private float f45987u0;

    /* renamed from: v0, reason: collision with root package name */
    private float f45988v0;

    /* renamed from: w0, reason: collision with root package name */
    private Path f45989w0;

    /* renamed from: x0, reason: collision with root package name */
    private Paint f45990x0;

    /* renamed from: y0, reason: collision with root package name */
    private int f45991y0;

    /* renamed from: z0, reason: collision with root package name */
    private int f45992z0;

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
        float f45993a;

        /* renamed from: b, reason: collision with root package name */
        float f45994b;

        b(float f4, float f5) {
            this.f45993a = f4;
            this.f45994b = f5;
        }
    }

    public Equalizer2View(Context context) {
        this(context, null);
    }

    private boolean A(int[] iArr, int[] iArr2) {
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

    private boolean B(MotionEvent motionEvent) {
        List<b> list = this.f45985s0;
        if (list != null && list.size() != 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            Iterator<b> it = this.f45985s0.iterator();
            while (it.hasNext()) {
                double c4 = c(x3, y3, it.next());
                Log.d(this.f45940E, "isTouchOnSlider dis = " + c4);
                if (c4 < this.f45974h0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.f45941E0 = -1;
        invalidate();
    }

    private int D(int i4, int i5) {
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
            this.f45977k0.getHeight();
            this.f45942F.ascent();
            this.f45942F.descent();
            Log.e("EqualizerView Height", "---speMode = AT_MOST");
        }
        return (int) ((((this.f45950J + this.f45977k0.getHeight()) + (this.f45988v0 * 2.0f)) - this.f45942F.ascent()) + this.f45942F.descent());
    }

    private int E(int i4, int i5) {
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

    private float b(float f4) {
        return TypedValue.applyDimension(1, f4, getResources().getDisplayMetrics());
    }

    private double c(float f4, float f5, b bVar) {
        return Math.sqrt(Math.pow(f4 - bVar.f45993a, 2.0d) + Math.pow(f5 - bVar.f45994b, 2.0d));
    }

    private void d(Canvas canvas) {
        int size = this.f45985s0.size();
        b bVar = this.f45985s0.get(0);
        this.f45989w0.reset();
        this.f45989w0.moveTo(bVar.f45993a, bVar.f45994b);
        float f4 = bVar.f45993a;
        float f5 = bVar.f45994b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f45985s0.get(i4);
            float f6 = bVar2.f45993a;
            float f7 = (f4 + f6) / 2.0f;
            Path path = this.f45989w0;
            float f8 = bVar2.f45994b;
            path.cubicTo(f7, f5, f7, f8, f6, f8);
            f4 = bVar2.f45993a;
            f5 = bVar2.f45994b;
        }
        this.f45990x0.setStyle(Paint.Style.STROKE);
        this.f45990x0.setStrokeWidth(this.f45936A0);
        if (z()) {
            this.f45990x0.setColor(this.f45992z0);
        } else {
            this.f45990x0.setColor(this.f45991y0);
        }
        canvas.drawPath(this.f45989w0, this.f45990x0);
    }

    private void e(Canvas canvas) {
        int size = this.f45985s0.size();
        b bVar = this.f45985s0.get(0);
        this.f45989w0.reset();
        this.f45989w0.moveTo(bVar.f45993a, bVar.f45994b);
        float f4 = bVar.f45993a;
        float f5 = bVar.f45994b;
        for (int i4 = 1; i4 < size; i4++) {
            b bVar2 = this.f45985s0.get(i4);
            float f6 = bVar2.f45993a;
            float f7 = (f4 + f6) / 2.0f;
            float f8 = (bVar2.f45994b + f5) / 2.0f;
            this.f45989w0.quadTo((f4 + f7) / 2.0f, f5, f7, f8);
            Path path = this.f45989w0;
            float f9 = bVar2.f45994b;
            path.quadTo((f6 + f7) / 2.0f, f9, bVar2.f45993a, f9);
            f4 = bVar2.f45993a;
            f5 = bVar2.f45994b;
        }
        this.f45990x0.setStyle(Paint.Style.STROKE);
        this.f45990x0.setStrokeWidth(this.f45936A0);
        this.f45990x0.setColor(this.f45991y0);
        canvas.drawPath(this.f45989w0, this.f45990x0);
    }

    private void f(Canvas canvas) {
        this.f45942F.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Semibold.ttf"));
        for (int i4 = 0; i4 < this.f45982p0.length; i4++) {
            this.f45942F.setColor(this.f45962S);
            this.f45942F.setTextSize(this.f45944G);
            if (i4 == 0) {
                canvas.drawText(this.f45982p0[i4].toUpperCase(Locale.ROOT), this.f45972f0 + ((i4 + 1) * (this.f45973g0 / 2.0f)), canvas.getHeight() - (this.f45944G / 2.0f), this.f45942F);
            } else if (i4 == 1) {
                if (this.f45983q0.length == 7) {
                    canvas.drawText(this.f45982p0[i4].toUpperCase(Locale.ROOT), this.f45972f0 + ((i4 + 5) * (this.f45973g0 / 2.0f)), canvas.getHeight() - (this.f45944G / 2.0f), this.f45942F);
                } else {
                    canvas.drawText(this.f45982p0[i4].toUpperCase(Locale.ROOT), this.f45972f0 + ((i4 + 3) * (this.f45973g0 / 2.0f)), canvas.getHeight() - (this.f45944G / 2.0f), this.f45942F);
                }
            } else if (i4 == 2) {
                if (this.f45983q0.length == 7) {
                    canvas.drawText(this.f45982p0[i4].toUpperCase(Locale.ROOT), this.f45972f0 + ((i4 + 9) * (this.f45973g0 / 2.0f)), canvas.getHeight() - (this.f45944G / 2.0f), this.f45942F);
                } else {
                    canvas.drawText(this.f45982p0[i4].toUpperCase(Locale.ROOT), this.f45972f0 + ((i4 + 5) * (this.f45973g0 / 2.0f)), canvas.getHeight() - (this.f45944G / 2.0f), this.f45942F);
                }
            }
        }
    }

    private void g(Canvas canvas, float f4) {
        Paint paint = new Paint();
        paint.setColor(this.f45960Q);
        paint.setStrokeWidth(b(this.f45969c0));
        if (this.f45984r0 > 20) {
            int i4 = 0;
            while (true) {
                int i5 = this.f45984r0;
                if (i4 < i5) {
                    if (i4 != 0 && i4 != i5 - 1) {
                        if (i4 == i5 / 2) {
                            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 0.0f));
                            float f5 = i4;
                            canvas.drawLine(0.0f, (this.f45954L * f5) + this.f45950J + this.f45952K, canvas.getWidth(), (this.f45954L * f5) + this.f45950J + this.f45952K, paint);
                        } else {
                            paint.setPathEffect(null);
                            if (i4 % 2 == 0) {
                                float f6 = i4;
                                canvas.drawLine(f4 - b(15.0f), (this.f45954L * f6) + this.f45950J + this.f45952K, f4 - b(1.0f), (this.f45954L * f6) + this.f45950J + this.f45952K, paint);
                                canvas.drawLine(b(1.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f6) + this.f45950J + this.f45952K, b(15.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f6) + this.f45950J + this.f45952K, paint);
                            }
                        }
                    }
                    i4++;
                } else {
                    return;
                }
            }
        } else {
            int i6 = 0;
            while (true) {
                int i7 = this.f45984r0;
                if (i6 < i7) {
                    if (i6 != 0 && i6 != i7 - 1) {
                        if (i6 == i7 / 2) {
                            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f, 10.0f, 10.0f}, 0.0f));
                            float f7 = i6;
                            canvas.drawLine(0.0f, (this.f45954L * f7) + this.f45950J + this.f45952K, canvas.getWidth(), (this.f45954L * f7) + this.f45950J + this.f45952K, paint);
                        } else {
                            paint.setPathEffect(null);
                            if (i6 % 2 != 0) {
                                float f8 = i6;
                                canvas.drawLine(f4 - b(8.0f), (this.f45954L * f8) + this.f45950J + this.f45952K, f4 - b(1.0f), (this.f45954L * f8) + this.f45950J + this.f45952K, paint);
                                canvas.drawLine(b(1.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f8) + this.f45950J + this.f45952K, b(8.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f8) + this.f45950J + this.f45952K, paint);
                            } else {
                                float f9 = i6;
                                canvas.drawLine(f4 - b(15.0f), (this.f45954L * f9) + this.f45950J + this.f45952K, f4 - b(1.0f), (this.f45954L * f9) + this.f45950J + this.f45952K, paint);
                                canvas.drawLine(b(1.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f9) + this.f45950J + this.f45952K, b(15.0f) + f4 + this.f45977k0.getWidth(), (this.f45954L * f9) + this.f45950J + this.f45952K, paint);
                            }
                        }
                    }
                    i6++;
                } else {
                    return;
                }
            }
        }
    }

    private float[] getPositionsDown() {
        return new float[]{0.0f, 1.0f};
    }

    private int[] getValueByPoints() {
        List<b> list = this.f45985s0;
        if (list != null && list.size() > 0) {
            int[] iArr = new int[this.f45985s0.size()];
            for (int i4 = 0; i4 < this.f45985s0.size(); i4++) {
                iArr[i4] = r(this.f45985s0.get(i4).f45994b);
            }
            return iArr;
        }
        return null;
    }

    private void h(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f45989w0);
        path.lineTo(this.f45948I - this.f45972f0, this.f45977k0.getHeight() - this.f45952K);
        path.lineTo(this.f45972f0, this.f45977k0.getHeight() - this.f45952K);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        LinearGradient linearGradient = new LinearGradient(0.0f, this.f45952K, 0.0f, this.f45952K + (this.f45977k0.getHeight() / 2), getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP);
        int height = this.f45977k0.getHeight() / this.f45953K0;
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        float f4 = this.f45972f0;
        canvas.drawRect(f4, this.f45952K, this.f45948I - f4, this.f45977k0.getHeight() - this.f45952K, paint);
        for (int i4 = 0; i4 < this.f45953K0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f45948I, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private void i(Canvas canvas) {
        Path path = new Path();
        path.reset();
        path.addPath(this.f45989w0);
        path.lineTo(this.f45948I - this.f45972f0, this.f45952K);
        path.lineTo(this.f45972f0, this.f45952K);
        path.close();
        int save = canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(this.f45948I - this.f45972f0, this.f45977k0.getHeight() - this.f45952K, this.f45948I - this.f45972f0, (this.f45977k0.getHeight() / 2) - this.f45952K, getColorsDown(), getPositionsDown(), Shader.TileMode.CLAMP));
        float f4 = this.f45972f0;
        canvas.drawRect(f4, this.f45952K, this.f45948I - f4, this.f45977k0.getHeight() - this.f45952K, paint);
        int height = this.f45977k0.getHeight() / this.f45953K0;
        for (int i4 = 0; i4 < this.f45953K0; i4++) {
            float f5 = height * i4;
            canvas.drawLine(0.0f, f5, this.f45948I, f5, paint);
        }
        canvas.restoreToCount(save);
    }

    private void j(Canvas canvas) {
        this.f45942F.setColor(this.f45961R);
        this.f45942F.setTextSize(this.f45987u0);
        int i4 = this.f45941E0;
        if (i4 != -1) {
            b bVar = this.f45985s0.get(i4);
            canvas.drawBitmap(this.f45979m0, bVar.f45993a - (r1.getWidth() / 2), bVar.f45994b - ((this.f45956M + this.f45979m0.getWidth()) + (this.f45975i0.getHeight() / 2)), this.f45942F);
            canvas.drawText(String.valueOf(getValueByPoints()[this.f45941E0]), bVar.f45993a, bVar.f45994b - ((this.f45979m0.getWidth() / 2) + (this.f45975i0.getHeight() / 2)), this.f45942F);
        }
    }

    private void k(Canvas canvas) {
        this.f45942F.setTextSize(this.f45946H);
        for (int i4 = 0; i4 < this.f45981o0.length; i4++) {
            if (getValueByPoints() != null && getValueByPoints()[i4] != 0) {
                this.f45942F.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Regular.ttf"));
                this.f45942F.setColor(this.f45963T);
            } else {
                this.f45942F.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Regular.ttf"));
                this.f45942F.setColor(this.f45963T);
            }
            canvas.drawText(this.f45981o0[i4], this.f45972f0 + (i4 * this.f45973g0), this.f45988v0 + (this.f45944G / 2.0f), this.f45942F);
        }
    }

    private void l(Canvas canvas, int i4, float f4, float f5) {
        this.f45942F.setStrokeCap(Paint.Cap.ROUND);
        this.f45942F.setColor(this.f45967a0);
        float f6 = i4;
        float width = this.f45972f0 + (this.f45973g0 * f6) + (this.f45977k0.getWidth() / 2.0f);
        float width2 = (this.f45977k0.getWidth() / 2.0f) + this.f45972f0 + (f6 * this.f45973g0);
        float f7 = this.f45950J + this.f45952K + (this.f45954L * (this.f45984r0 - 1));
        this.f45942F.setShader(new LinearGradient(width, f5, width2, f7, this.f45965V, this.f45966W, Shader.TileMode.CLAMP));
        canvas.drawLine(width, f5, width2, f7, this.f45942F);
        this.f45942F.setShader(null);
    }

    private void m(Canvas canvas, int i4) {
        this.f45942F.setStrokeCap(Paint.Cap.ROUND);
        this.f45942F.setColor(this.f45964U);
        float f4 = i4;
        canvas.drawLine(this.f45972f0 + (this.f45973g0 * f4) + (this.f45977k0.getWidth() / 2.0f), this.f45950J, this.f45972f0 + (f4 * this.f45973g0) + (this.f45977k0.getWidth() / 2.0f), this.f45950J + this.f45952K + (this.f45954L * (this.f45984r0 - 1)), this.f45942F);
    }

    private int o(float f4) {
        float f5 = this.f45972f0;
        float f6 = this.f45973g0;
        int i4 = (int) ((f4 - f5) / f6);
        if (((int) ((f4 - f5) % f6)) > this.f45938C0 * f6) {
            i4++;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        String[] strArr = this.f45981o0;
        if (i4 > strArr.length - 1) {
            return strArr.length - 1;
        }
        return i4;
    }

    private boolean p(MotionEvent motionEvent, int i4) {
        List<b> list = this.f45985s0;
        if (list != null && list.size() != 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            b bVar = new b(this.f45985s0.get(i4).f45993a, u((-this.f45984r0) / 2));
            if (t(x3, bVar) < this.f45974h0 && y3 > this.f45950J && y3 < bVar.f45994b) {
                return true;
            }
        }
        return false;
    }

    private float q(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.bottom - fontMetrics.top;
    }

    private int r(float f4) {
        float f5 = this.f45950J;
        float f6 = this.f45952K;
        float f7 = this.f45954L;
        int i4 = (int) (((f4 - f5) - f6) / f7);
        if (((int) (((f4 - f5) - f6) % f7)) > this.f45938C0 * f7) {
            i4++;
        }
        int i5 = this.f45984r0;
        int i6 = (i5 / 2) - i4;
        if (i6 < (-(i5 / 2))) {
            i6 = -(i5 / 2);
        }
        if (i6 > i5 / 2) {
            return i5 / 2;
        }
        return i6;
    }

    private float s(float f4) {
        return this.f45972f0 + (f4 * this.f45973g0) + (this.f45977k0.getWidth() / 2);
    }

    private double t(float f4, b bVar) {
        return Math.sqrt(Math.pow(f4 - bVar.f45993a, 2.0d));
    }

    private float u(float f4) {
        int i4 = this.f45984r0;
        if (f4 < (-(i4 / 2))) {
            f4 = -(i4 / 2);
        }
        if (f4 > i4 / 2) {
            f4 = i4 / 2;
        }
        return this.f45950J + this.f45952K + (this.f45954L * ((i4 / 2) - ((int) f4)));
    }

    private double v(float f4, b bVar) {
        return Math.sqrt(Math.pow(f4 - bVar.f45994b, 2.0d));
    }

    private void w() {
        this.f45945G0.removeCallbacks(this.f45947H0);
        Runnable runnable = new Runnable() { // from class: com.harman.jbl.partybox.ui.widget.eq.a
            @Override // java.lang.Runnable
            public final void run() {
                Equalizer2View.this.C();
            }
        };
        this.f45947H0 = runnable;
        this.f45945G0.postDelayed(runnable, 20L);
    }

    private void x() {
        this.f45949I0 = (Vibrator) getContext().getSystemService("vibrator");
        Drawable b4 = C2046a.b(getContext(), j.f.f40967P1);
        Objects.requireNonNull(b4);
        this.f45977k0 = n(b4);
        Drawable b5 = C2046a.b(getContext(), j.f.f40982T0);
        Objects.requireNonNull(b5);
        this.f45979m0 = n(b5);
        Drawable b6 = C2046a.b(getContext(), j.f.U3);
        Objects.requireNonNull(b6);
        this.f45975i0 = n(b6);
        this.f45978l0 = this.f45977k0;
        this.f45976j0 = BitmapFactory.decodeResource(getResources(), j.f.f41075n0);
        this.f45970d0 = this.f45950J + this.f45952K;
        this.f45971e0 = (this.f45977k0.getHeight() + this.f45950J) - this.f45952K;
        this.f45981o0 = new String[]{getResources().getString(j.m.f41805q), getResources().getString(j.m.f41635D1), getResources().getString(j.m.Ca)};
        this.f45982p0 = new String[]{getResources().getString(j.m.f41842y1), getResources().getString(j.m.f41635D1), getResources().getString(j.m.f41678O0)};
    }

    private void y() {
        int[] iArr = this.f45983q0;
        if (iArr != null && iArr.length > 0) {
            List<b> list = this.f45985s0;
            if (list == null) {
                this.f45985s0 = new ArrayList();
            } else {
                list.clear();
            }
            for (int i4 = 0; i4 < this.f45983q0.length; i4++) {
                this.f45985s0.add(new b(this.f45972f0 + (i4 * this.f45973g0) + (this.f45977k0.getWidth() / 2), u(this.f45983q0[i4])));
            }
        }
    }

    private boolean z() {
        for (int i4 = 0; i4 < this.f45985s0.size(); i4++) {
            if (r(this.f45985s0.get(i4).f45994b) != 0) {
                return false;
            }
        }
        return true;
    }

    public int[] getColorsDown() {
        int i4 = f45934M0;
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
        this.f45942F.setColor(this.f45958O);
        this.f45942F.setStrokeWidth(b(this.f45957N));
        String[] strArr = this.f45981o0;
        if (strArr != null && strArr.length > 0) {
            this.f45973g0 = (this.f45948I - (this.f45972f0 * 2.0f)) / (strArr.length - 1);
            this.f45954L = (this.f45977k0.getHeight() - (this.f45952K * 2.0f)) / (this.f45984r0 - 1);
            for (int i4 = 0; i4 < this.f45981o0.length; i4++) {
                g(canvas, this.f45972f0 + (i4 * this.f45973g0));
                m(canvas, i4);
            }
            this.f45942F.setColor(this.f45986t0);
            this.f45942F.setTextAlign(Paint.Align.CENTER);
            this.f45942F.setTextSize(this.f45987u0);
            this.f45942F.setAntiAlias(true);
            f(canvas);
            if (!this.f45937B0) {
                y();
            }
            List<b> list = this.f45985s0;
            if (list != null && list.size() > 0) {
                for (int i5 = 0; i5 < this.f45985s0.size(); i5++) {
                    b bVar = this.f45985s0.get(i5);
                    l(canvas, i5, this.f45985s0.get(i5).f45993a, this.f45985s0.get(i5).f45994b);
                    canvas.drawBitmap(this.f45975i0, bVar.f45993a - (r2.getWidth() / 2), bVar.f45994b - (this.f45975i0.getHeight() / 2), this.f45942F);
                }
            }
            k(canvas);
            j(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        this.f45948I = View.MeasureSpec.getSize(i4);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        Log.e("EqualizerView", "---minimumWidth = " + suggestedMinimumWidth + "");
        Log.e("EqualizerView", "---minimumHeight = " + suggestedMinimumHeight + "");
        int E3 = E(suggestedMinimumWidth, i4);
        int D3 = D(suggestedMinimumHeight, i5);
        Log.e("EqualizerView", "---width = " + E3 + "");
        Log.e("EqualizerView", "---height = " + D3 + "");
        setMeasuredDimension(E3, D3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f45980n0) {
            ViewParent parent = getParent();
            while (true) {
                if (parent instanceof ScrollView) {
                    this.f45951J0 = parent;
                    break;
                }
                parent = parent.getParent();
                if (parent == null) {
                    break;
                }
            }
            if (!B(motionEvent)) {
                Log.d(this.f45940E, "can not seek on parent scroll");
                this.f45951J0.requestDisallowInterceptTouchEvent(false);
                return false;
            }
            Log.d(this.f45940E, "can not seek on seek block");
            this.f45951J0.requestDisallowInterceptTouchEvent(true);
            a aVar2 = this.f45955L0;
            if (aVar2 != null) {
                aVar2.onSeekBlock();
            }
            return true;
        }
        this.f45937B0 = true;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 4) {
                        return false;
                    }
                } else {
                    float y3 = motionEvent.getY();
                    if (this.f45941E0 != -1) {
                        float f4 = this.f45971e0;
                        if (y3 > f4) {
                            y3 = f4;
                        }
                        float f5 = this.f45970d0;
                        if (y3 < f5) {
                            y3 = f5;
                        }
                        int r4 = r(y3);
                        Log.d(this.f45940E, "ACTION_MOVE index = " + this.f45941E0 + " , value = " + r4);
                        List<b> list = this.f45985s0;
                        if (list != null) {
                            list.remove(this.f45941E0);
                            List<b> list2 = this.f45985s0;
                            int i4 = this.f45941E0;
                            list2.add(i4, new b(s(i4), y3));
                        }
                        invalidate();
                        int[] valueByPoints = getValueByPoints();
                        if (!A(valueByPoints, this.f45943F0) && (aVar = this.f45955L0) != null) {
                            aVar.onProgressChanged(getValueByPoints(), true);
                            this.f45949I0.vibrate(10L);
                        }
                        this.f45943F0 = valueByPoints;
                    } else {
                        Log.e(this.f45940E, "ACTION_MOVE index = " + this.f45941E0 + " , value = -1 , y = " + y3 + " , mMinY = " + this.f45970d0 + " , mMaxY = " + this.f45971e0);
                    }
                }
            } else {
                float y4 = motionEvent.getY();
                int r5 = r(y4);
                if (this.f45941E0 != -1) {
                    float f6 = this.f45971e0;
                    if (y4 > f6) {
                        y4 = f6;
                    }
                    float f7 = this.f45970d0;
                    if (y4 < f7) {
                        y4 = f7;
                    }
                    int r6 = r(y4);
                    Log.d(this.f45940E, "ACTION_UP index = " + this.f45941E0 + " , value = " + r6);
                    List<b> list3 = this.f45985s0;
                    if (list3 != null) {
                        list3.remove(this.f45941E0);
                        List<b> list4 = this.f45985s0;
                        int i5 = this.f45941E0;
                        list4.add(i5, new b(s(i5), u(r6)));
                        invalidate();
                        a aVar3 = this.f45955L0;
                        if (aVar3 != null) {
                            aVar3.onStopTrackingTouch(this.f45941E0, getValueByPoints());
                        }
                        w();
                    }
                } else {
                    Log.e(this.f45940E, "ACTION_UP index = " + this.f45941E0 + " , value = " + r5 + " , y = " + y4 + " , mMinY = " + this.f45970d0 + " , mMaxY = " + this.f45971e0);
                }
            }
        } else {
            ViewParent viewParent = this.f45951J0;
            if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
            } else {
                ViewParent parent2 = getParent();
                while (true) {
                    if (parent2 instanceof ScrollView) {
                        this.f45951J0 = parent2;
                        parent2.requestDisallowInterceptTouchEvent(true);
                        break;
                    }
                    parent2 = parent2.getParent();
                    if (parent2 == null) {
                        break;
                    }
                }
            }
            float x3 = motionEvent.getX();
            this.f45939D0 = x3;
            int o4 = o(x3);
            this.f45941E0 = o4;
            if (o4 == -1) {
                return true;
            }
            if (!B(motionEvent)) {
                Log.d(this.f45940E, "isTouchOnSlider false ");
                if (p(motionEvent, this.f45941E0) && this.f45949I0.hasVibrator()) {
                    invalidate();
                    w();
                }
                ViewParent viewParent2 = this.f45951J0;
                if (viewParent2 != null) {
                    viewParent2.requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
            Log.d(this.f45940E, "isTouchOnSlider true rang = " + this.f45974h0);
        }
        return true;
    }

    public void setLevel(int i4) {
        this.f45937B0 = false;
        this.f45984r0 = i4;
        invalidate();
    }

    public void setListener(a aVar) {
        this.f45955L0 = aVar;
    }

    public void setSeekable(boolean z3) {
        this.f45980n0 = z3;
    }

    public void setTitles(String[] strArr) {
        this.f45981o0 = strArr;
        invalidate();
    }

    public void setValues(int[] iArr) {
        this.f45983q0 = iArr;
        invalidate();
    }

    public Equalizer2View(Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Equalizer2View(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f45940E = "Equalizer2View";
        this.f45942F = new Paint();
        this.f45944G = b(18.0f);
        this.f45946H = b(12.0f);
        this.f45950J = b(62.0f);
        this.f45952K = b(1.0f);
        this.f45954L = b(60.0f);
        this.f45956M = b(5.0f);
        this.f45957N = 6.0f;
        this.f45958O = Color.parseColor("#ccd2d8");
        this.f45959P = Color.parseColor("#ccd2d8");
        this.f45960Q = getResources().getColor(j.d.f40772o0, getContext().getTheme());
        this.f45961R = getResources().getColor(j.d.f40753h, getContext().getTheme());
        this.f45962S = getResources().getColor(j.d.f40749f1, getContext().getTheme());
        this.f45963T = Color.parseColor("#D9FFFFFF");
        this.f45964U = getResources().getColor(j.d.f40770n0, getContext().getTheme());
        this.f45965V = Color.parseColor("#5EECFF");
        this.f45966W = Color.parseColor("#6034DC");
        this.f45967a0 = Color.parseColor("#2855a6");
        this.f45968b0 = 18;
        this.f45969c0 = 2.0f;
        this.f45970d0 = 0.0f;
        this.f45971e0 = 0.0f;
        this.f45972f0 = b(40.0f);
        this.f45973g0 = 0.0f;
        this.f45974h0 = b(25.0f);
        this.f45980n0 = true;
        this.f45983q0 = new int[]{0, 0, 0};
        this.f45984r0 = 5;
        this.f45986t0 = this.f45962S;
        this.f45987u0 = b(18.0f);
        this.f45988v0 = b(25.0f);
        this.f45989w0 = new Path();
        this.f45990x0 = new Paint();
        this.f45991y0 = Color.parseColor("#FF5901");
        this.f45992z0 = Color.parseColor("#617087");
        this.f45936A0 = b(2.0f);
        this.f45937B0 = false;
        this.f45938C0 = 0.5f;
        this.f45939D0 = -1.0f;
        this.f45941E0 = -1;
        this.f45943F0 = null;
        this.f45945G0 = new Handler(Looper.getMainLooper());
        this.f45953K0 = 20;
        x();
    }
}

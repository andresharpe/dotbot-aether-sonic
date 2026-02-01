package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0734z;
import androidx.core.view.C0823k0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    private static final int f33074i = 68;

    /* renamed from: j, reason: collision with root package name */
    private static final int f33075j = 20;

    /* renamed from: k, reason: collision with root package name */
    private static final int f33076k = 0;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f33077l = new int[3];

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f33078m = {0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f33079n = new int[4];

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f33080o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Paint f33081a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Paint f33082b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final Paint f33083c;

    /* renamed from: d, reason: collision with root package name */
    private int f33084d;

    /* renamed from: e, reason: collision with root package name */
    private int f33085e;

    /* renamed from: f, reason: collision with root package name */
    private int f33086f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f33087g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f33088h;

    public b() {
        this(C0823k0.f13589t);
    }

    public void a(@N Canvas canvas, @P Matrix matrix, @N RectF rectF, int i4, float f4, float f5) {
        boolean z3;
        if (f5 < 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        Path path = this.f33087g;
        if (z3) {
            int[] iArr = f33079n;
            iArr[0] = 0;
            iArr[1] = this.f33086f;
            iArr[2] = this.f33085e;
            iArr[3] = this.f33084d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f5);
            path.close();
            float f6 = -i4;
            rectF.inset(f6, f6);
            int[] iArr2 = f33079n;
            iArr2[0] = 0;
            iArr2[1] = this.f33084d;
            iArr2[2] = this.f33085e;
            iArr2[3] = this.f33086f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i4 / width);
        float[] fArr = f33080o;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.f33082b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f33079n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f33088h);
        }
        canvas.drawArc(rectF, f4, f5, true, this.f33082b);
        canvas.restore();
    }

    public void b(@N Canvas canvas, @P Matrix matrix, @N RectF rectF, int i4) {
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int[] iArr = f33077l;
        iArr[0] = this.f33086f;
        iArr[1] = this.f33085e;
        iArr[2] = this.f33084d;
        Paint paint = this.f33083c;
        float f4 = rectF.left;
        paint.setShader(new LinearGradient(f4, rectF.top, f4, rectF.bottom, iArr, f33078m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f33083c);
        canvas.restore();
    }

    @N
    public Paint c() {
        return this.f33081a;
    }

    public void d(int i4) {
        this.f33084d = C0734z.B(i4, f33074i);
        this.f33085e = C0734z.B(i4, 20);
        this.f33086f = C0734z.B(i4, 0);
        this.f33081a.setColor(this.f33084d);
    }

    public b(int i4) {
        this.f33087g = new Path();
        this.f33088h = new Paint();
        this.f33081a = new Paint();
        d(i4);
        this.f33088h.setColor(0);
        Paint paint = new Paint(4);
        this.f33082b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33083c = new Paint(paint);
    }
}

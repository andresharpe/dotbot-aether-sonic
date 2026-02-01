package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.i0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26481a = "TransformationUtils";

    /* renamed from: b, reason: collision with root package name */
    public static final int f26482b = 6;

    /* renamed from: d, reason: collision with root package name */
    private static final int f26484d = 7;

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f26486f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f26487g;

    /* renamed from: h, reason: collision with root package name */
    private static final Lock f26488h;

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f26483c = new Paint(6);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f26485e = new Paint(7);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f26489a;

        a(int i4) {
            this.f26489a = i4;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i4 = this.f26489a;
            canvas.drawRoundRect(rectF, i4, i4, paint);
        }
    }

    /* loaded from: classes.dex */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f26490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f26491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f26492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f26493d;

        b(float f4, float f5, float f6, float f7) {
            this.f26490a = f4;
            this.f26491b = f5;
            this.f26492c = f6;
            this.f26493d = f7;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.K.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f4 = this.f26490a;
            float f5 = this.f26491b;
            float f6 = this.f26492c;
            float f7 = this.f26493d;
            path.addRoundRect(rectF, new float[]{f4, f4, f5, f5, f6, f6, f7, f7}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* loaded from: classes.dex */
    private static final class d implements Lock {
        d() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @androidx.annotation.N
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, @androidx.annotation.N TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        Lock dVar;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f26487g = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            dVar = new ReentrantLock();
        } else {
            dVar = new d();
        }
        f26488h = dVar;
        Paint paint = new Paint(7);
        f26486f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private K() {
    }

    private static void a(@androidx.annotation.N Bitmap bitmap, @androidx.annotation.N Bitmap bitmap2, Matrix matrix) {
        Lock lock = f26488h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f26483c);
            e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f26488h.unlock();
            throw th;
        }
    }

    public static Bitmap b(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        float width;
        float height;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f4 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i4) {
            width = i5 / bitmap.getHeight();
            f4 = (i4 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i4 / bitmap.getWidth();
            height = (i5 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f4 + 0.5f), (int) (height + 0.5f));
        Bitmap f5 = eVar.f(i4, i5, k(bitmap));
        t(bitmap, f5);
        a(bitmap, f5, matrix);
        return f5;
    }

    public static Bitmap c(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() <= i4 && bitmap.getHeight() <= i5) {
            if (Log.isLoggable(f26481a, 2)) {
                Log.v(f26481a, "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable(f26481a, 2)) {
            Log.v(f26481a, "requested target size too big for input, fit centering instead");
        }
        return f(eVar, bitmap, i4, i5);
    }

    public static Bitmap d(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        int min = Math.min(i4, i5);
        float f4 = min;
        float f5 = f4 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f4 / width, f4 / height);
        float f6 = width * max;
        float f7 = max * height;
        float f8 = (f4 - f6) / 2.0f;
        float f9 = (f4 - f7) / 2.0f;
        RectF rectF = new RectF(f8, f9, f6 + f8, f7 + f9);
        Bitmap g4 = g(eVar, bitmap);
        Bitmap f10 = eVar.f(min, min, h(bitmap));
        f10.setHasAlpha(true);
        Lock lock = f26488h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f10);
            canvas.drawCircle(f5, f5, f5, f26485e);
            canvas.drawBitmap(g4, (Rect) null, rectF, f26486f);
            e(canvas);
            lock.unlock();
            if (!g4.equals(bitmap)) {
                eVar.d(g4);
            }
            return f10;
        } catch (Throwable th) {
            f26488h.unlock();
            throw th;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            if (Log.isLoggable(f26481a, 2)) {
                Log.v(f26481a, "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i4 / bitmap.getWidth(), i5 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(f26481a, 2)) {
                Log.v(f26481a, "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap f4 = eVar.f((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        t(bitmap, f4);
        if (Log.isLoggable(f26481a, 2)) {
            Log.v(f26481a, "request: " + i4 + "x" + i5);
            Log.v(f26481a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v(f26481a, "toReuse: " + f4.getWidth() + "x" + f4.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v(f26481a, sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, f4, matrix);
        return f4;
    }

    private static Bitmap g(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap) {
        Bitmap.Config h4 = h(bitmap);
        if (h4.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f4 = eVar.f(bitmap.getWidth(), bitmap.getHeight(), h4);
        new Canvas(f4).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f4;
    }

    @androidx.annotation.N
    private static Bitmap.Config h(@androidx.annotation.N Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f26488h;
    }

    public static int j(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @androidx.annotation.N
    private static Bitmap.Config k(@androidx.annotation.N Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    @i0
    static void l(int i4, Matrix matrix) {
        switch (i4) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean m(int i4) {
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@androidx.annotation.N Bitmap bitmap, int i4) {
        if (i4 != 0) {
            try {
                Matrix matrix = new Matrix();
                matrix.setRotate(i4);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e4) {
                if (Log.isLoggable(f26481a, 6)) {
                    Log.e(f26481a, "Exception when trying to orient image", e4);
                    return bitmap;
                }
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap o(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4) {
        if (!m(i4)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i4, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap f4 = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        f4.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, f4, matrix);
        return f4;
    }

    public static Bitmap p(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, float f4, float f5, float f6, float f7) {
        return s(eVar, bitmap, new b(f4, f5, f6, f7));
    }

    public static Bitmap q(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4) {
        boolean z3;
        if (i4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        com.bumptech.glide.util.l.a(z3, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i4));
    }

    @Deprecated
    public static Bitmap r(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, int i4, int i5, int i6) {
        return q(eVar, bitmap, i6);
    }

    private static Bitmap s(@androidx.annotation.N com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.N Bitmap bitmap, c cVar) {
        Bitmap.Config h4 = h(bitmap);
        Bitmap g4 = g(eVar, bitmap);
        Bitmap f4 = eVar.f(g4.getWidth(), g4.getHeight(), h4);
        f4.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g4, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f4.getWidth(), f4.getHeight());
        Lock lock = f26488h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f4);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!g4.equals(bitmap)) {
                eVar.d(g4);
            }
            return f4;
        } catch (Throwable th) {
            f26488h.unlock();
            throw th;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}

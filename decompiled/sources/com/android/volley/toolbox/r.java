package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.p;

/* loaded from: classes.dex */
public class r extends Request<Bitmap> {

    /* renamed from: c0, reason: collision with root package name */
    public static final int f24652c0 = 1000;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f24653d0 = 2;

    /* renamed from: e0, reason: collision with root package name */
    public static final float f24654e0 = 2.0f;

    /* renamed from: f0, reason: collision with root package name */
    private static final Object f24655f0 = new Object();

    /* renamed from: W, reason: collision with root package name */
    private final Object f24656W;

    /* renamed from: X, reason: collision with root package name */
    @P
    @androidx.annotation.B("mLock")
    private p.b<Bitmap> f24657X;

    /* renamed from: Y, reason: collision with root package name */
    private final Bitmap.Config f24658Y;

    /* renamed from: Z, reason: collision with root package name */
    private final int f24659Z;

    /* renamed from: a0, reason: collision with root package name */
    private final int f24660a0;

    /* renamed from: b0, reason: collision with root package name */
    private final ImageView.ScaleType f24661b0;

    public r(String str, p.b<Bitmap> bVar, int i4, int i5, ImageView.ScaleType scaleType, Bitmap.Config config, @P p.a aVar) {
        super(0, str, aVar);
        this.f24656W = new Object();
        S(new com.android.volley.g(1000, 2, 2.0f));
        this.f24657X = bVar;
        this.f24658Y = config;
        this.f24659Z = i4;
        this.f24660a0 = i5;
        this.f24661b0 = scaleType;
    }

    private com.android.volley.p<Bitmap> c0(com.android.volley.l lVar) {
        Bitmap decodeByteArray;
        byte[] bArr = lVar.f24494b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f24659Z == 0 && this.f24660a0 == 0) {
            options.inPreferredConfig = this.f24658Y;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int e02 = e0(this.f24659Z, this.f24660a0, i4, i5, this.f24661b0);
            int e03 = e0(this.f24660a0, this.f24659Z, i5, i4, this.f24661b0);
            options.inJustDecodeBounds = false;
            options.inSampleSize = d0(i4, i5, e02, e03);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > e02 || decodeByteArray.getHeight() > e03)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, e02, e03, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return com.android.volley.p.a(new ParseError(lVar));
        }
        return com.android.volley.p.c(decodeByteArray, m.e(lVar));
    }

    @i0
    static int d0(int i4, int i5, int i6, int i7) {
        double min = Math.min(i4 / i6, i5 / i7);
        float f4 = 1.0f;
        while (true) {
            float f5 = 2.0f * f4;
            if (f5 <= min) {
                f4 = f5;
            } else {
                return (int) f4;
            }
        }
    }

    private static int e0(int i4, int i5, int i6, int i7, ImageView.ScaleType scaleType) {
        if (i4 == 0 && i5 == 0) {
            return i6;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i4 == 0) {
                return i6;
            }
            return i4;
        }
        if (i4 == 0) {
            return (int) (i6 * (i5 / i7));
        }
        if (i5 == 0) {
            return i4;
        }
        double d4 = i7 / i6;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d5 = i5;
            if (i4 * d4 < d5) {
                return (int) (d5 / d4);
            }
            return i4;
        }
        double d6 = i5;
        if (i4 * d4 > d6) {
            return (int) (d6 / d4);
        }
        return i4;
    }

    @Override // com.android.volley.Request
    public Request.Priority A() {
        return Request.Priority.LOW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public com.android.volley.p<Bitmap> N(com.android.volley.l lVar) {
        com.android.volley.p<Bitmap> c02;
        synchronized (f24655f0) {
            try {
                try {
                    c02 = c0(lVar);
                } catch (OutOfMemoryError e4) {
                    com.android.volley.s.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(lVar.f24494b.length), G());
                    return com.android.volley.p.a(new ParseError(e4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void j(Bitmap bitmap) {
        p.b<Bitmap> bVar;
        synchronized (this.f24656W) {
            bVar = this.f24657X;
        }
        if (bVar != null) {
            bVar.b(bitmap);
        }
    }

    @Override // com.android.volley.Request
    public void f() {
        super.f();
        synchronized (this.f24656W) {
            this.f24657X = null;
        }
    }

    @Deprecated
    public r(String str, p.b<Bitmap> bVar, int i4, int i5, Bitmap.Config config, p.a aVar) {
        this(str, bVar, i4, i5, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}

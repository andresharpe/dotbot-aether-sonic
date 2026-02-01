package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.P;
import androidx.annotation.W;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    static final String f26532f = "Downsampler";

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<DecodeFormat> f26533g = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<PreferredColorSpace> f26534h = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.e<DownsampleStrategy> f26535i = DownsampleStrategy.f26459h;

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Boolean> f26536j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.load.e<Boolean> f26537k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f26538l = "image/vnd.wap.wbmp";

    /* renamed from: m, reason: collision with root package name */
    private static final String f26539m = "image/x-ico";

    /* renamed from: n, reason: collision with root package name */
    private static final Set<String> f26540n;

    /* renamed from: o, reason: collision with root package name */
    private static final b f26541o;

    /* renamed from: p, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f26542p;

    /* renamed from: q, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f26543q;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26544a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f26545b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26546c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f26547d;

    /* renamed from: e, reason: collision with root package name */
    private final A f26548e = A.d();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.u.b
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f26536j = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f26537k = com.bumptech.glide.load.e.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f26540n = Collections.unmodifiableSet(new HashSet(Arrays.asList(f26538l, f26539m)));
        f26541o = new a();
        f26542p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f26543q = com.bumptech.glide.util.n.f(0);
    }

    public u(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26547d = list;
        this.f26545b = (DisplayMetrics) com.bumptech.glide.util.l.d(displayMetrics);
        this.f26544a = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.l.d(eVar);
        this.f26546c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
    }

    private static int a(double d4) {
        return x((d4 / (r1 / r0)) * x(l(d4) * d4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.bumptech.glide.load.resource.bitmap.B r7, com.bumptech.glide.load.DecodeFormat r8, boolean r9, boolean r10, android.graphics.BitmapFactory.Options r11, int r12, int r13) {
        /*
            r6 = this;
            com.bumptech.glide.load.resource.bitmap.A r0 = r6.f26548e
            r1 = r12
            r2 = r13
            r3 = r11
            r4 = r9
            r5 = r10
            boolean r9 = r0.k(r1, r2, r3, r4, r5)
            if (r9 == 0) goto Le
            return
        Le:
            com.bumptech.glide.load.DecodeFormat r9 = com.bumptech.glide.load.DecodeFormat.PREFER_ARGB_8888
            if (r8 == r9) goto L49
            com.bumptech.glide.load.ImageHeaderParser$ImageType r7 = r7.d()     // Catch: java.io.IOException -> L1f
            boolean r7 = r7.hasAlpha()     // Catch: java.io.IOException -> L1f
            if (r7 == 0) goto L3d
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            goto L3f
        L1f:
            r7 = move-exception
            r9 = 3
            java.lang.String r10 = "Downsampler"
            boolean r9 = android.util.Log.isLoggable(r10, r9)
            if (r9 == 0) goto L3d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "Cannot determine whether the image has alpha or not from header, format "
            r9.append(r12)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r10, r8, r7)
        L3d:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
        L3f:
            r11.inPreferredConfig = r7
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r7 != r8) goto L48
            r7 = 1
            r11.inDither = r7
        L48:
            return
        L49:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.u.b(com.bumptech.glide.load.resource.bitmap.B, com.bumptech.glide.load.DecodeFormat, boolean, boolean, android.graphics.BitmapFactory$Options, int, int):void");
    }

    private static void c(ImageHeaderParser.ImageType imageType, B b4, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, DownsampleStrategy downsampleStrategy, int i4, int i5, int i6, int i7, int i8, BitmapFactory.Options options) throws IOException {
        int i9;
        int i10;
        int min;
        int floor;
        int floor2;
        if (i5 > 0 && i6 > 0) {
            if (r(i4)) {
                i10 = i5;
                i9 = i6;
            } else {
                i9 = i5;
                i10 = i6;
            }
            float b5 = downsampleStrategy.b(i9, i10, i7, i8);
            if (b5 <= 0.0f) {
                throw new IllegalArgumentException("Cannot scale with factor: " + b5 + " from: " + downsampleStrategy + ", source: [" + i5 + "x" + i6 + "], target: [" + i7 + "x" + i8 + "]");
            }
            DownsampleStrategy.SampleSizeRounding a4 = downsampleStrategy.a(i9, i10, i7, i8);
            if (a4 != null) {
                float f4 = i9;
                float f5 = i10;
                int x3 = i9 / x(b5 * f4);
                int x4 = i10 / x(b5 * f5);
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                if (a4 == sampleSizeRounding) {
                    min = Math.max(x3, x4);
                } else {
                    min = Math.min(x3, x4);
                }
                int max = Math.max(1, Integer.highestOneBit(min));
                if (a4 == sampleSizeRounding && max < 1.0f / b5) {
                    max <<= 1;
                }
                options.inSampleSize = max;
                if (imageType == ImageHeaderParser.ImageType.JPEG) {
                    float min2 = Math.min(max, 8);
                    floor = (int) Math.ceil(f4 / min2);
                    floor2 = (int) Math.ceil(f5 / min2);
                    int i11 = max / 8;
                    if (i11 > 0) {
                        floor /= i11;
                        floor2 /= i11;
                    }
                } else if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                    if (imageType != ImageHeaderParser.ImageType.WEBP && imageType != ImageHeaderParser.ImageType.WEBP_A) {
                        if (i9 % max == 0 && i10 % max == 0) {
                            floor = i9 / max;
                            floor2 = i10 / max;
                        } else {
                            int[] m4 = m(b4, options, bVar, eVar);
                            floor = m4[0];
                            floor2 = m4[1];
                        }
                    } else {
                        float f6 = max;
                        floor = Math.round(f4 / f6);
                        floor2 = Math.round(f5 / f6);
                    }
                } else {
                    float f7 = max;
                    floor = (int) Math.floor(f4 / f7);
                    floor2 = (int) Math.floor(f5 / f7);
                }
                double b6 = downsampleStrategy.b(floor, floor2, i7, i8);
                options.inTargetDensity = a(b6);
                options.inDensity = l(b6);
                if (s(options)) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                if (Log.isLoggable(f26532f, 2)) {
                    Log.v(f26532f, "Calculate scaling, source: [" + i5 + "x" + i6 + "], degreesToRotate: " + i4 + ", target: [" + i7 + "x" + i8 + "], power of two scaled: [" + floor + "x" + floor2 + "], exact scale factor: " + b5 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b6 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        if (Log.isLoggable(f26532f, 3)) {
            Log.d(f26532f, "Unable to determine dimensions for: " + imageType + " with target [" + i7 + "x" + i8 + "]");
        }
    }

    private com.bumptech.glide.load.engine.u<Bitmap> e(B b4, int i4, int i5, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        boolean z3;
        byte[] bArr = (byte[]) this.f26546c.e(65536, byte[].class);
        BitmapFactory.Options k4 = k();
        k4.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) fVar.c(f26533g);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar.c(f26534h);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.c(DownsampleStrategy.f26459h);
        boolean booleanValue = ((Boolean) fVar.c(f26536j)).booleanValue();
        com.bumptech.glide.load.e<Boolean> eVar = f26537k;
        if (fVar.c(eVar) != null && ((Boolean) fVar.c(eVar)).booleanValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        try {
            return C1122g.f(h(b4, k4, downsampleStrategy, decodeFormat, preferredColorSpace, z3, i4, i5, booleanValue, bVar), this.f26544a);
        } finally {
            v(k4);
            this.f26546c.put(bArr);
        }
    }

    private Bitmap h(B b4, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z3, int i4, int i5, boolean z4, b bVar) throws IOException {
        boolean z5;
        int i6;
        int i7;
        int i8;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        int i9;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        float f4;
        int round;
        int round2;
        long b5 = com.bumptech.glide.util.h.b();
        int[] m4 = m(b4, options, bVar, this.f26544a);
        int i10 = m4[0];
        int i11 = m4[1];
        String str2 = options.outMimeType;
        if (i10 != -1 && i11 != -1) {
            z5 = z3;
        } else {
            z5 = false;
        }
        int a4 = b4.a();
        int j4 = K.j(a4);
        boolean m5 = K.m(a4);
        if (i4 == Integer.MIN_VALUE) {
            i6 = i5;
            if (r(j4)) {
                i7 = i11;
            } else {
                i7 = i10;
            }
        } else {
            i6 = i5;
            i7 = i4;
        }
        if (i6 == Integer.MIN_VALUE) {
            if (r(j4)) {
                i8 = i10;
            } else {
                i8 = i11;
            }
        } else {
            i8 = i6;
        }
        ImageHeaderParser.ImageType d4 = b4.d();
        c(d4, b4, bVar, this.f26544a, downsampleStrategy, j4, i10, i11, i7, i8, options);
        b(b4, decodeFormat, z5, m5, options, i7, i8);
        int i12 = Build.VERSION.SDK_INT;
        if (z(d4)) {
            if (i10 >= 0 && i11 >= 0 && z4) {
                str = f26532f;
                round = i7;
                round2 = i8;
            } else {
                if (s(options)) {
                    f4 = options.inTargetDensity / options.inDensity;
                } else {
                    f4 = 1.0f;
                }
                int i13 = options.inSampleSize;
                float f5 = i13;
                int ceil = (int) Math.ceil(i10 / f5);
                int ceil2 = (int) Math.ceil(i11 / f5);
                round = Math.round(ceil * f4);
                round2 = Math.round(ceil2 * f4);
                str = f26532f;
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + round + "x" + round2 + "] for source [" + i10 + "x" + i11 + "], sampleSize: " + i13 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f4);
                }
            }
            if (round > 0 && round2 > 0) {
                y(options, this.f26544a, round, round2);
            }
        } else {
            str = f26532f;
        }
        if (i12 >= 28) {
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                colorSpace3 = options.outColorSpace;
                if (colorSpace3 != null) {
                    colorSpace4 = options.outColorSpace;
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        named2 = ColorSpace.Named.DISPLAY_P3;
                        colorSpace2 = ColorSpace.get(named2);
                        options.inPreferredColorSpace = colorSpace2;
                    }
                }
            }
            named2 = ColorSpace.Named.SRGB;
            colorSpace2 = ColorSpace.get(named2);
            options.inPreferredColorSpace = colorSpace2;
        } else if (i12 >= 26) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            options.inPreferredColorSpace = colorSpace;
        }
        Bitmap i14 = i(b4, options, bVar, this.f26544a);
        bVar.a(this.f26544a, i14);
        if (Log.isLoggable(str, 2)) {
            i9 = a4;
            t(i10, i11, str2, options, i14, i4, i5, b5);
        } else {
            i9 = a4;
        }
        if (i14 != null) {
            i14.setDensity(this.f26545b.densityDpi);
            Bitmap o4 = K.o(this.f26544a, i14, i9);
            if (!i14.equals(o4)) {
                this.f26544a.d(i14);
                return o4;
            }
            return o4;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.B r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.u.b r7, com.bumptech.glide.load.engine.bitmap_recycle.e r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.K.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.K.i()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.d(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.K.i()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.K.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.u.i(com.bumptech.glide.load.resource.bitmap.B, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.u$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @P
    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (u.class) {
            Queue<BitmapFactory.Options> queue = f26543q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d4) {
        if (d4 > 1.0d) {
            d4 = 1.0d / d4;
        }
        return (int) Math.round(d4 * 2.147483647E9d);
    }

    private static int[] m(B b4, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(b4, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i4) {
        return i4 == 90 || i4 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i4;
        int i5 = options.inTargetDensity;
        if (i5 > 0 && (i4 = options.inDensity) > 0 && i5 != i4) {
            return true;
        }
        return false;
    }

    private static void t(int i4, int i5, String str, BitmapFactory.Options options, Bitmap bitmap, int i6, int i7, long j4) {
        Log.v(f26532f, "Decoded " + j(bitmap) + " from [" + i4 + "x" + i5 + "] " + str + " with inBitmap " + n(options) + " for [" + i6 + "x" + i7 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + com.bumptech.glide.util.h.a(j4));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i4, int i5, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i4 + ", outHeight: " + i5 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f26543q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d4) {
        return (int) (d4 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i4, int i5) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 != config2) {
                config = options.outConfig;
            } else {
                return;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.g(i4, i5, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @W(21)
    public com.bumptech.glide.load.engine.u<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, com.bumptech.glide.load.f fVar) throws IOException {
        return e(new B.b(parcelFileDescriptor, this.f26547d, this.f26546c), i4, i5, fVar, f26541o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> f(InputStream inputStream, int i4, int i5, com.bumptech.glide.load.f fVar) throws IOException {
        return g(inputStream, i4, i5, fVar, f26541o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> g(InputStream inputStream, int i4, int i5, com.bumptech.glide.load.f fVar, b bVar) throws IOException {
        return e(new B.a(inputStream, this.f26547d, this.f26546c), i4, i5, fVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}

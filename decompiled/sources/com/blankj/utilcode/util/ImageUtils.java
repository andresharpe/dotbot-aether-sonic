package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.view.View;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.core.content.C0669d;
import androidx.core.os.C0745h;
import androidx.core.view.C0823k0;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class ImageUtils {

    /* loaded from: classes.dex */
    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN(C0745h.f12738b);

        String value;

        ImageType(String str) {
            this.value = str;
        }

        public String b() {
            return this.value;
        }
    }

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Bitmap A(Bitmap bitmap, int i4) {
        return D(bitmap, i4, false);
    }

    public static boolean A0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4, boolean z3) {
        return w0(bitmap, H0.P(str), compressFormat, i4, z3);
    }

    public static Bitmap B(Bitmap bitmap, int i4, int i5) {
        return C(bitmap, i4, i5, false);
    }

    public static boolean B0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z3) {
        return A0(bitmap, str, compressFormat, 100, z3);
    }

    public static Bitmap C(Bitmap bitmap, int i4, int i5, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = t(options, i4, i5);
        options.inJustDecodeBounds = false;
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    @androidx.annotation.P
    public static File C0(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return I0(bitmap, "", compressFormat, 100, false);
    }

    public static Bitmap D(Bitmap bitmap, int i4, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    @androidx.annotation.P
    public static File D0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4) {
        return I0(bitmap, "", compressFormat, i4, false);
    }

    public static Bitmap E(Bitmap bitmap, float f4, float f5) {
        return L0(bitmap, f4, f5, false);
    }

    @androidx.annotation.P
    public static File E0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4, boolean z3) {
        return I0(bitmap, "", compressFormat, i4, z3);
    }

    public static Bitmap F(Bitmap bitmap, float f4, float f5, boolean z3) {
        return L0(bitmap, f4, f5, z3);
    }

    @androidx.annotation.P
    public static File F0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z3) {
        return I0(bitmap, "", compressFormat, 100, z3);
    }

    public static Bitmap G(Bitmap bitmap, int i4, int i5) {
        return N0(bitmap, i4, i5, false);
    }

    @androidx.annotation.P
    public static File G0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return I0(bitmap, str, compressFormat, 100, false);
    }

    public static Bitmap H(Bitmap bitmap, int i4, int i5, boolean z3) {
        return N0(bitmap, i4, i5, z3);
    }

    @androidx.annotation.P
    public static File H0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4) {
        return I0(bitmap, str, compressFormat, i4, false);
    }

    public static Bitmap I(@androidx.annotation.N Bitmap bitmap, @InterfaceC0569l int i4) {
        return J(bitmap, i4, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File I0(android.graphics.Bitmap r6, java.lang.String r7, android.graphics.Bitmap.CompressFormat r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ImageUtils.I0(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int, boolean):java.io.File");
    }

    public static Bitmap J(@androidx.annotation.N Bitmap bitmap, @InterfaceC0569l int i4, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i4, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    @androidx.annotation.P
    public static File J0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z3) {
        return I0(bitmap, str, compressFormat, 100, z3);
    }

    public static Bitmap K(@androidx.annotation.P Drawable drawable) {
        Bitmap.Config config;
        Bitmap createBitmap;
        Bitmap.Config config2;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (drawable.getOpacity() != -1) {
                config2 = Bitmap.Config.ARGB_8888;
            } else {
                config2 = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config2);
        } else {
            if (drawable.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            createBitmap = Bitmap.createBitmap(1, 1, config);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap K0(Bitmap bitmap, float f4, float f5) {
        return L0(bitmap, f4, f5, false);
    }

    public static byte[] L(@androidx.annotation.P Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return o(K(drawable));
    }

    public static Bitmap L0(Bitmap bitmap, float f4, float f5, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f5);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static byte[] M(Drawable drawable, Bitmap.CompressFormat compressFormat, int i4) {
        if (drawable == null) {
            return null;
        }
        return p(K(drawable), compressFormat, i4);
    }

    public static Bitmap M0(Bitmap bitmap, int i4, int i5) {
        return N0(bitmap, i4, i5, false);
    }

    public static Bitmap N(Bitmap bitmap, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 25.0d) float f5) {
        return P(bitmap, f4, f5, false, false);
    }

    public static Bitmap N0(Bitmap bitmap, int i4, int i5, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
        if (z3 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap O(Bitmap bitmap, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 25.0d) float f5, boolean z3) {
        return P(bitmap, f4, f5, z3, false);
    }

    public static Bitmap O0(Bitmap bitmap, float f4, float f5) {
        return Q0(bitmap, f4, f5, 0.0f, 0.0f, false);
    }

    public static Bitmap P(Bitmap bitmap, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 1.0d) float f4, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 25.0d) float f5, boolean z3, boolean z4) {
        if (k0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f4, f4);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        Bitmap r02 = r0(createBitmap, f5, z3);
        if (f4 != 1.0f && !z4) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(r02, width, height, true);
            if (!r02.isRecycled()) {
                r02.recycle();
            }
            if (z3 && !bitmap.isRecycled() && createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
        if (z3 && !bitmap.isRecycled() && r02 != bitmap) {
            bitmap.recycle();
        }
        return r02;
    }

    public static Bitmap P0(Bitmap bitmap, float f4, float f5, float f6, float f7) {
        return Q0(bitmap, f4, f5, f6, f7, false);
    }

    public static Bitmap Q(@InterfaceC0578v int i4) {
        Drawable i5 = C0669d.i(E0.a(), i4);
        if (i5 == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(i5.getIntrinsicWidth(), i5.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        i5.setBounds(0, 0, i5.getIntrinsicWidth(), i5.getIntrinsicHeight());
        i5.draw(canvas);
        return createBitmap;
    }

    public static Bitmap Q0(Bitmap bitmap, float f4, float f5, float f6, float f7, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f4, f5, f6, f7);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap R(@InterfaceC0578v int i4, int i5, int i6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = E0.a().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i4, options);
        options.inSampleSize = t(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i4, options);
    }

    public static Bitmap R0(Bitmap bitmap, float f4, float f5, boolean z3) {
        return Q0(bitmap, f4, f5, 0.0f, 0.0f, z3);
    }

    public static Bitmap S(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static Bitmap S0(Bitmap bitmap, int i4) {
        return T0(bitmap, i4, false);
    }

    public static Bitmap T(File file, int i4, int i5) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = t(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static Bitmap T0(Bitmap bitmap, int i4, boolean z3) {
        int[] iArr;
        Bitmap copy = z3 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i5 = i4 < 1 ? 1 : i4;
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i6 = width * height;
        int[] iArr2 = new int[i6];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i7 = width - 1;
        int i8 = height - 1;
        int i9 = i5 + i5;
        int i10 = i9 + 1;
        int[] iArr3 = new int[i6];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[Math.max(width, height)];
        int i11 = (i9 + 2) >> 1;
        int i12 = i11 * i11;
        int i13 = i12 * 256;
        int[] iArr7 = new int[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            iArr7[i14] = i14 / i12;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 3);
        int i15 = i5 + 1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < height) {
            Bitmap bitmap2 = copy;
            int i19 = height;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = -i5;
            int i29 = 0;
            while (i28 <= i5) {
                int i30 = i8;
                int[] iArr9 = iArr6;
                int i31 = iArr2[i17 + Math.min(i7, Math.max(i28, 0))];
                int[] iArr10 = iArr8[i28 + i5];
                iArr10[0] = (i31 & 16711680) >> 16;
                iArr10[1] = (i31 & androidx.core.view.Q.f13201f) >> 8;
                iArr10[2] = i31 & 255;
                int abs = i15 - Math.abs(i28);
                int i32 = iArr10[0];
                i29 += i32 * abs;
                int i33 = iArr10[1];
                i20 += i33 * abs;
                int i34 = iArr10[2];
                i21 += abs * i34;
                if (i28 > 0) {
                    i25 += i32;
                    i26 += i33;
                    i27 += i34;
                } else {
                    i22 += i32;
                    i23 += i33;
                    i24 += i34;
                }
                i28++;
                i8 = i30;
                iArr6 = iArr9;
            }
            int i35 = i8;
            int[] iArr11 = iArr6;
            int i36 = i29;
            int i37 = i5;
            int i38 = 0;
            while (i38 < width) {
                iArr3[i17] = iArr7[i36];
                iArr4[i17] = iArr7[i20];
                iArr5[i17] = iArr7[i21];
                int i39 = i36 - i22;
                int i40 = i20 - i23;
                int i41 = i21 - i24;
                int[] iArr12 = iArr8[((i37 - i5) + i10) % i10];
                int i42 = i22 - iArr12[0];
                int i43 = i23 - iArr12[1];
                int i44 = i24 - iArr12[2];
                if (i16 == 0) {
                    iArr = iArr7;
                    iArr11[i38] = Math.min(i38 + i5 + 1, i7);
                } else {
                    iArr = iArr7;
                }
                int i45 = iArr2[i18 + iArr11[i38]];
                int i46 = (i45 & 16711680) >> 16;
                iArr12[0] = i46;
                int i47 = (i45 & androidx.core.view.Q.f13201f) >> 8;
                iArr12[1] = i47;
                int i48 = i45 & 255;
                iArr12[2] = i48;
                int i49 = i25 + i46;
                int i50 = i26 + i47;
                int i51 = i27 + i48;
                i36 = i39 + i49;
                i20 = i40 + i50;
                i21 = i41 + i51;
                i37 = (i37 + 1) % i10;
                int[] iArr13 = iArr8[i37 % i10];
                int i52 = iArr13[0];
                i22 = i42 + i52;
                int i53 = iArr13[1];
                i23 = i43 + i53;
                int i54 = iArr13[2];
                i24 = i44 + i54;
                i25 = i49 - i52;
                i26 = i50 - i53;
                i27 = i51 - i54;
                i17++;
                i38++;
                iArr7 = iArr;
            }
            i18 += width;
            i16++;
            copy = bitmap2;
            height = i19;
            i8 = i35;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = copy;
        int i55 = i8;
        int[] iArr14 = iArr6;
        int i56 = height;
        int[] iArr15 = iArr7;
        int i57 = 0;
        while (i57 < width) {
            int i58 = -i5;
            int i59 = i10;
            int[] iArr16 = iArr2;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = i58;
            int i68 = i58 * width;
            int i69 = 0;
            int i70 = 0;
            while (i67 <= i5) {
                int i71 = width;
                int max = Math.max(0, i68) + i57;
                int[] iArr17 = iArr8[i67 + i5];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i15 - Math.abs(i67);
                i69 += iArr3[max] * abs2;
                i70 += iArr4[max] * abs2;
                i60 += iArr5[max] * abs2;
                if (i67 > 0) {
                    i64 += iArr17[0];
                    i65 += iArr17[1];
                    i66 += iArr17[2];
                } else {
                    i61 += iArr17[0];
                    i62 += iArr17[1];
                    i63 += iArr17[2];
                }
                int i72 = i55;
                if (i67 < i72) {
                    i68 += i71;
                }
                i67++;
                i55 = i72;
                width = i71;
            }
            int i73 = width;
            int i74 = i55;
            int i75 = i57;
            int i76 = i5;
            int i77 = i56;
            int i78 = 0;
            while (i78 < i77) {
                iArr16[i75] = (iArr16[i75] & C0823k0.f13589t) | (iArr15[i69] << 16) | (iArr15[i70] << 8) | iArr15[i60];
                int i79 = i69 - i61;
                int i80 = i70 - i62;
                int i81 = i60 - i63;
                int[] iArr18 = iArr8[((i76 - i5) + i59) % i59];
                int i82 = i61 - iArr18[0];
                int i83 = i62 - iArr18[1];
                int i84 = i63 - iArr18[2];
                int i85 = i5;
                if (i57 == 0) {
                    iArr14[i78] = Math.min(i78 + i15, i74) * i73;
                }
                int i86 = iArr14[i78] + i57;
                int i87 = iArr3[i86];
                iArr18[0] = i87;
                int i88 = iArr4[i86];
                iArr18[1] = i88;
                int i89 = iArr5[i86];
                iArr18[2] = i89;
                int i90 = i64 + i87;
                int i91 = i65 + i88;
                int i92 = i66 + i89;
                i69 = i79 + i90;
                i70 = i80 + i91;
                i60 = i81 + i92;
                i76 = (i76 + 1) % i59;
                int[] iArr19 = iArr8[i76];
                int i93 = iArr19[0];
                i61 = i82 + i93;
                int i94 = iArr19[1];
                i62 = i83 + i94;
                int i95 = iArr19[2];
                i63 = i84 + i95;
                i64 = i90 - i93;
                i65 = i91 - i94;
                i66 = i92 - i95;
                i75 += i73;
                i78++;
                i5 = i85;
            }
            i57++;
            i55 = i74;
            i56 = i77;
            i10 = i59;
            iArr2 = iArr16;
            width = i73;
        }
        int i96 = width;
        bitmap3.setPixels(iArr2, 0, i96, 0, 0, i96, i56);
        return bitmap3;
    }

    public static Bitmap U(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap U0(Bitmap bitmap) {
        return V0(bitmap, Boolean.FALSE);
    }

    public static Bitmap V(FileDescriptor fileDescriptor, int i4, int i5) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = t(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    public static Bitmap V0(Bitmap bitmap, Boolean bool) {
        if (k0(bitmap)) {
            return null;
        }
        Bitmap extractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled() && extractAlpha != bitmap) {
            bitmap.recycle();
        }
        return extractAlpha;
    }

    public static Bitmap W(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap W0(Bitmap bitmap) {
        return X0(bitmap, false);
    }

    public static Bitmap X(InputStream inputStream, int i4, int i5) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = t(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap X0(Bitmap bitmap, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap Y(String str) {
        if (H0.D0(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap Y0(Bitmap bitmap) {
        return a1(bitmap, 0, 0, false);
    }

    public static Bitmap Z(String str, int i4, int i5) {
        if (H0.D0(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = t(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap Z0(Bitmap bitmap, @androidx.annotation.F(from = 0) int i4, @InterfaceC0569l int i5) {
        return a1(bitmap, i4, i5, false);
    }

    private static Bitmap a(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, boolean z3, float f5, boolean z4) {
        return b(bitmap, f4, i4, z3, new float[]{f5, f5, f5, f5, f5, f5, f5, f5}, z4);
    }

    public static Bitmap a0(byte[] bArr, int i4) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i4, bArr.length);
    }

    public static Bitmap a1(Bitmap bitmap, @androidx.annotation.F(from = 0) int i4, @InterfaceC0569l int i5, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int min = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f4 = min;
        float f5 = f4 / 2.0f;
        float f6 = width;
        float f7 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f6, f7);
        rectF.inset((width - min) / 2.0f, (height - min) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        if (width != height) {
            matrix.preScale(f4 / f6, f4 / f7);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (i4 > 0) {
            paint.setShader(null);
            paint.setColor(i5);
            paint.setStyle(Paint.Style.STROKE);
            float f8 = i4;
            paint.setStrokeWidth(f8);
            canvas.drawCircle(f6 / 2.0f, f7 / 2.0f, f5 - (f8 / 2.0f), paint);
        }
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    private static Bitmap b(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, boolean z3, float[] fArr, boolean z4) {
        if (k0(bitmap)) {
            return null;
        }
        if (!z4) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i4);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        if (z3) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f4 / 2.0f), paint);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f5 = f4 / 2.0f;
            rectF.inset(f5, f5);
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        return bitmap;
    }

    public static Bitmap b0(byte[] bArr, int i4, int i5, int i6) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i4, bArr.length, options);
        options.inSampleSize = t(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i4, bArr.length, options);
    }

    public static Bitmap b1(Bitmap bitmap, boolean z3) {
        return a1(bitmap, 0, 0, z3);
    }

    public static Bitmap c(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4) {
        return a(bitmap, f4, i4, true, 0.0f, false);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x001d -> B:12:0x0032). Please report as a decompilation issue!!! */
    public static ImageType c0(File file) {
        FileInputStream fileInputStream;
        ImageType d02;
        FileInputStream fileInputStream2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                d02 = d0(fileInputStream);
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        if (d02 != null) {
            try {
                fileInputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            return d02;
        }
        fileInputStream.close();
        return null;
    }

    public static Bitmap c1(Bitmap bitmap, float f4) {
        return e1(bitmap, f4, 0.0f, 0, false);
    }

    public static Bitmap d(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, boolean z3) {
        return a(bitmap, f4, i4, true, 0.0f, z3);
    }

    private static ImageType d0(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            if (inputStream.read(bArr) == -1) {
                return null;
            }
            return f0(bArr);
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static Bitmap d1(Bitmap bitmap, float f4, @InterfaceC0580x(from = 0.0d) float f5, @InterfaceC0569l int i4) {
        return e1(bitmap, f4, f5, i4, false);
    }

    public static Bitmap e(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d) float f5) {
        return a(bitmap, f4, i4, false, f5, false);
    }

    public static ImageType e0(String str) {
        return c0(H0.P(str));
    }

    public static Bitmap e1(Bitmap bitmap, float f4, @InterfaceC0580x(from = 0.0d) float f5, @InterfaceC0569l int i4, boolean z3) {
        return h1(bitmap, new float[]{f4, f4, f4, f4, f4, f4, f4, f4}, f5, i4, z3);
    }

    public static Bitmap f(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, @InterfaceC0580x(from = 0.0d) float f5, boolean z3) {
        return a(bitmap, f4, i4, false, f5, z3);
    }

    private static ImageType f0(byte[] bArr) {
        String upperCase = H0.l(bArr).toUpperCase();
        if (upperCase.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (upperCase.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (upperCase.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (!upperCase.contains("49492A00") && !upperCase.contains("4D4D002A")) {
            if (upperCase.contains("424D")) {
                return ImageType.TYPE_BMP;
            }
            if (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) {
                return ImageType.TYPE_WEBP;
            }
            if (!upperCase.contains("00000100") && !upperCase.contains("00000200")) {
                return ImageType.TYPE_UNKNOWN;
            }
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_TIFF;
    }

    public static Bitmap f1(Bitmap bitmap, float f4, boolean z3) {
        return e1(bitmap, f4, 0.0f, 0, z3);
    }

    public static Bitmap g(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, float[] fArr) {
        return b(bitmap, f4, i4, false, fArr, false);
    }

    public static int g0(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.a.f14612E, 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static Bitmap g1(Bitmap bitmap, float[] fArr, @InterfaceC0580x(from = 0.0d) float f4, @InterfaceC0569l int i4) {
        return h1(bitmap, fArr, f4, i4, false);
    }

    public static Bitmap h(Bitmap bitmap, @InterfaceC0580x(from = 1.0d) float f4, @InterfaceC0569l int i4, float[] fArr, boolean z3) {
        return b(bitmap, f4, i4, false, fArr, z3);
    }

    public static int[] h0(File file) {
        if (file == null) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static Bitmap h1(Bitmap bitmap, float[] fArr, @InterfaceC0580x(from = 0.0d) float f4, @InterfaceC0569l int i4, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f5 = f4 / 2.0f;
        rectF.inset(f5, f5);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f4 > 0.0f) {
            paint.setShader(null);
            paint.setColor(i4);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f4);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap i(Bitmap bitmap, Bitmap bitmap2, int i4, int i5, int i6) {
        return j(bitmap, bitmap2, i4, i5, i6, false);
    }

    public static int[] i0(String str) {
        return h0(H0.P(str));
    }

    public static Bitmap i1(View view) {
        Bitmap createBitmap;
        if (view == null) {
            return null;
        }
        boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean willNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null && !drawingCache.isRecycled()) {
            createBitmap = Bitmap.createBitmap(drawingCache);
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 != null && !drawingCache2.isRecycled()) {
                createBitmap = Bitmap.createBitmap(drawingCache2);
            } else {
                createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
            }
        }
        view.setWillNotCacheDrawing(willNotCacheDrawing);
        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        return createBitmap;
    }

    public static Bitmap j(Bitmap bitmap, Bitmap bitmap2, int i4, int i5, int i6, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        if (!k0(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(copy);
            paint.setAlpha(i6);
            canvas.drawBitmap(bitmap2, i4, i5, paint);
        }
        if (z3 && !bitmap.isRecycled() && copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    private static boolean j0(byte[] bArr) {
        if (bArr.length < 2 || bArr[0] != 66 || bArr[1] != 77) {
            return false;
        }
        return true;
    }

    public static Bitmap k(Bitmap bitmap, int i4) {
        return l(bitmap, i4, false);
    }

    private static boolean k0(Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            return false;
        }
        return true;
    }

    public static Bitmap l(Bitmap bitmap, int i4, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, height - i4, width, i4, matrix, false);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height + i4, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f4 = height;
        canvas.drawBitmap(createBitmap, 0.0f, f4, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, createBitmap2.getHeight(), 1895825407, C0823k0.f13588s, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f4, width, createBitmap2.getHeight(), paint);
        if (!createBitmap.isRecycled()) {
            createBitmap.recycle();
        }
        if (z3 && !bitmap.isRecycled() && createBitmap2 != bitmap) {
            bitmap.recycle();
        }
        return createBitmap2;
    }

    private static boolean l0(byte[] bArr) {
        if (bArr.length < 6 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 56) {
            return false;
        }
        byte b4 = bArr[4];
        if ((b4 != 55 && b4 != 57) || bArr[5] != 97) {
            return false;
        }
        return true;
    }

    public static Bitmap m(Bitmap bitmap, String str, float f4, @InterfaceC0569l int i4, float f5, float f6, boolean z3) {
        if (!k0(bitmap) && str != null) {
            Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(copy);
            paint.setColor(i4);
            paint.setTextSize(f4);
            paint.getTextBounds(str, 0, str.length(), new Rect());
            canvas.drawText(str, f5, f6 + f4, paint);
            if (z3 && !bitmap.isRecycled() && copy != bitmap) {
                bitmap.recycle();
            }
            return copy;
        }
        return null;
    }

    public static boolean m0(File file) {
        if (file != null && file.exists()) {
            return n0(file.getPath());
        }
        return false;
    }

    public static Bitmap n(Bitmap bitmap, String str, int i4, @InterfaceC0569l int i5, float f4, float f5) {
        return m(bitmap, str, i4, i5, f4, f5, false);
    }

    public static boolean n0(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth <= 0) {
                return false;
            }
            if (options.outHeight <= 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static byte[] o(Bitmap bitmap) {
        return p(bitmap, Bitmap.CompressFormat.PNG, 100);
    }

    private static boolean o0(byte[] bArr) {
        if (bArr.length < 2 || bArr[0] != -1 || bArr[1] != -40) {
            return false;
        }
        return true;
    }

    public static byte[] p(@androidx.annotation.P Bitmap bitmap, @androidx.annotation.N Bitmap.CompressFormat compressFormat, int i4) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i4, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static boolean p0(byte[] bArr) {
        if (bArr.length < 8 || bArr[0] != -119 || bArr[1] != 80 || bArr[2] != 78 || bArr[3] != 71 || bArr[4] != 13 || bArr[5] != 10 || bArr[6] != 26 || bArr[7] != 10) {
            return false;
        }
        return true;
    }

    public static Drawable q(@androidx.annotation.P Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(E0.a().getResources(), bitmap);
    }

    @androidx.annotation.W(17)
    public static Bitmap q0(Bitmap bitmap, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 25.0d) float f4) {
        return r0(bitmap, f4, false);
    }

    public static Bitmap r(@androidx.annotation.P byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    @androidx.annotation.W(17)
    public static Bitmap r0(Bitmap bitmap, @InterfaceC0580x(from = 0.0d, fromInclusive = false, to = 25.0d) float f4, boolean z3) {
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScript = null;
        try {
            renderScript = RenderScript.create(E0.a());
            renderScript.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            create.setInput(createFromBitmap);
            create.setRadius(f4);
            create.forEach(createTyped);
            createTyped.copyTo(bitmap);
            renderScript.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScript != null) {
                renderScript.destroy();
            }
            throw th;
        }
    }

    public static Drawable s(byte[] bArr) {
        return q(r(bArr));
    }

    public static Bitmap s0(Bitmap bitmap, int i4, float f4, float f5) {
        return t0(bitmap, i4, f4, f5, false);
    }

    public static int t(BitmapFactory.Options options, int i4, int i5) {
        int i6 = options.outHeight;
        int i7 = options.outWidth;
        int i8 = 1;
        while (true) {
            if (i6 <= i5 && i7 <= i4) {
                return i8;
            }
            i6 >>= 1;
            i7 >>= 1;
            i8 <<= 1;
        }
    }

    public static Bitmap t0(Bitmap bitmap, int i4, float f4, float f5, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        if (i4 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i4, f4, f5);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap u(Bitmap bitmap, int i4, int i5, int i6, int i7) {
        return v(bitmap, i4, i5, i6, i7, false);
    }

    public static boolean u0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return w0(bitmap, file, compressFormat, 100, false);
    }

    public static Bitmap v(Bitmap bitmap, int i4, int i5, int i6, int i7, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i4, i5, i6, i7);
        if (z3 && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static boolean v0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i4) {
        return w0(bitmap, file, compressFormat, i4, false);
    }

    public static byte[] w(Bitmap bitmap, @androidx.annotation.F(from = 0, to = 100) int i4) {
        return x(bitmap, i4, false);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0061 -> B:27:0x0070). Please report as a decompilation issue!!! */
    public static boolean w0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i4, boolean z3) {
        BufferedOutputStream bufferedOutputStream;
        boolean z4 = false;
        if (k0(bitmap)) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        if (!H0.r(file)) {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            z4 = bitmap.compress(compressFormat, i4, bufferedOutputStream);
            if (z3 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bufferedOutputStream.close();
        } catch (IOException e6) {
            e = e6;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            return z4;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        return z4;
    }

    public static byte[] x(Bitmap bitmap, @androidx.annotation.F(from = 0, to = 100) int i4, boolean z3) {
        if (k0(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static boolean x0(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z3) {
        return w0(bitmap, file, compressFormat, 100, z3);
    }

    public static byte[] y(Bitmap bitmap, long j4) {
        return z(bitmap, j4, false);
    }

    public static boolean y0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return A0(bitmap, str, compressFormat, 100, false);
    }

    public static byte[] z(Bitmap bitmap, long j4, boolean z3) {
        byte[] byteArray;
        int i4 = 0;
        if (!k0(bitmap) && j4 > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            int i5 = 100;
            bitmap.compress(compressFormat, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() <= j4) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                byteArrayOutputStream.reset();
                bitmap.compress(compressFormat, 0, byteArrayOutputStream);
                if (byteArrayOutputStream.size() >= j4) {
                    byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    int i6 = 0;
                    while (i4 < i5) {
                        i6 = (i4 + i5) / 2;
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i6, byteArrayOutputStream);
                        long size = byteArrayOutputStream.size();
                        if (size == j4) {
                            break;
                        }
                        if (size > j4) {
                            i5 = i6 - 1;
                        } else {
                            i4 = i6 + 1;
                        }
                    }
                    if (i5 == i6 - 1) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                }
            }
            if (z3 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return byteArray;
        }
        return new byte[0];
    }

    public static boolean z0(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4) {
        return w0(bitmap, H0.P(str), compressFormat, i4, false);
    }
}

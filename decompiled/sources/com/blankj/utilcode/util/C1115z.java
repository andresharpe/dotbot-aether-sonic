package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115z {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25350a = 8192;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f25351b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f25352c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private C1115z() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String A(String str) {
        if (H0.D0(str) || !Charset.isSupported(str)) {
            return "UTF-8";
        }
        return str;
    }

    private static int B(char c4) {
        if (c4 >= '0' && c4 <= '9') {
            return c4 - '0';
        }
        if (c4 >= 'A' && c4 <= 'F') {
            return c4 - '7';
        }
        throw new IllegalArgumentException();
    }

    public static byte[] C(String str) {
        if (H0.D0(str)) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = com.harman.jbl.partybox.ui.effectlab.a.f43472q + str;
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i4 = 0; i4 < length; i4 += 2) {
            bArr[i4 >> 1] = (byte) ((B(charArray[i4]) << 4) | B(charArray[i4 + 1]));
        }
        return bArr;
    }

    public static int D(String str) {
        return Integer.parseInt(str, 16);
    }

    public static ByteArrayOutputStream E(InputStream inputStream) {
        try {
            if (inputStream == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr, 0, 8192);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                inputStream.close();
                return byteArrayOutputStream;
            } catch (IOException e5) {
                e5.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    public static byte[] F(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return E(inputStream).toByteArray();
    }

    public static List<String> G(InputStream inputStream) {
        return H(inputStream, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> H(java.io.InputStream r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            java.lang.String r5 = A(r5)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
        L14:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            if (r4 == 0) goto L23
            r1.add(r4)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            goto L14
        L1e:
            r4 = move-exception
            r0 = r2
            goto L3e
        L21:
            r4 = move-exception
            goto L30
        L23:
            r2.close()     // Catch: java.io.IOException -> L27
            goto L2b
        L27:
            r4 = move-exception
            r4.printStackTrace()
        L2b:
            return r1
        L2c:
            r4 = move-exception
            goto L3e
        L2e:
            r4 = move-exception
            r2 = r0
        L30:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r4 = move-exception
            r4.printStackTrace()
        L3d:
            return r0
        L3e:
            if (r0 == 0) goto L48
            r0.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r5 = move-exception
            r5.printStackTrace()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.C1115z.H(java.io.InputStream, java.lang.String):java.util.List");
    }

    public static String I(InputStream inputStream, String str) {
        if (inputStream == null) {
            return "";
        }
        try {
            ByteArrayOutputStream E3 = E(inputStream);
            if (E3 == null) {
                return "";
            }
            return E3.toString(A(str));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static String J(int i4) {
        return Integer.toHexString(i4);
    }

    public static byte[] K(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toString().getBytes();
    }

    public static byte[] L(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString().getBytes();
    }

    public static long M(long j4, int i4) {
        if (j4 < 0) {
            return -1L;
        }
        return j4 * i4;
    }

    public static String N(long j4, int i4) {
        return H0.I0(j4, i4);
    }

    public static long O(long j4, int i4) {
        return j4 / i4;
    }

    public static ByteArrayInputStream P(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return new ByteArrayInputStream(((ByteArrayOutputStream) outputStream).toByteArray());
    }

    public static byte[] Q(OutputStream outputStream) {
        if (outputStream == null) {
            return null;
        }
        return ((ByteArrayOutputStream) outputStream).toByteArray();
    }

    public static String R(OutputStream outputStream, String str) {
        if (outputStream == null) {
            return "";
        }
        try {
            return new String(Q(outputStream), A(str));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return "";
        }
    }

    public static byte[] S(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static int T(float f4) {
        return H0.N0(f4);
    }

    public static int U(float f4) {
        return H0.O0(f4);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x001f: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:32), block:B:38:0x001f */
    public static byte[] V(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2;
        ObjectOutputStream objectOutputStream3 = null;
        try {
            if (serializable == null) {
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return byteArray;
                } catch (Exception e5) {
                    e = e5;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e7) {
                e = e7;
                objectOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (objectOutputStream3 != null) {
                    try {
                        objectOutputStream3.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream3 = objectOutputStream;
        }
    }

    public static int W(float f4) {
        return H0.Y0(f4);
    }

    public static byte[] X(String str) {
        return Y(str, "");
    }

    public static byte[] Y(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(A(str2));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return str.getBytes();
        }
    }

    public static InputStream Z(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new ByteArrayInputStream(str.getBytes(A(str2)));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Bitmap bitmap) {
        return H0.f(bitmap);
    }

    public static OutputStream a0(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return r(str.getBytes(A(str2)));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static byte[] b(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4) {
        return H0.g(bitmap, compressFormat, i4);
    }

    public static long b0(long j4, int i4) {
        return j4 * i4;
    }

    public static Drawable c(Bitmap bitmap) {
        return H0.h(bitmap);
    }

    public static Bitmap c0(View view) {
        return H0.g1(view);
    }

    public static byte[] d(String str) {
        int length = str.length() % 8;
        int length2 = str.length() / 8;
        if (length != 0) {
            while (length < 8) {
                str = com.harman.jbl.partybox.ui.effectlab.a.f43472q + str;
                length++;
            }
            length2++;
        }
        byte[] bArr = new byte[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte b4 = (byte) (bArr[i4] << 1);
                bArr[i4] = b4;
                bArr[i4] = (byte) (b4 | (str.charAt((i4 * 8) + i5) - '0'));
            }
        }
        return bArr;
    }

    @SuppressLint({"DefaultLocale"})
    public static String e(long j4) {
        return f(j4, 3);
    }

    @SuppressLint({"DefaultLocale"})
    public static String f(long j4, int i4) {
        if (i4 >= 0) {
            if (j4 >= 0) {
                if (j4 < PlaybackStateCompat.f4286a0) {
                    return String.format("%." + i4 + "fB", Double.valueOf(j4));
                }
                if (j4 < PlaybackStateCompat.f4296k0) {
                    return String.format("%." + i4 + "fKB", Double.valueOf(j4 / 1024.0d));
                }
                if (j4 < 1073741824) {
                    return String.format("%." + i4 + "fMB", Double.valueOf(j4 / 1048576.0d));
                }
                return String.format("%." + i4 + "fGB", Double.valueOf(j4 / 1.073741824E9d));
            }
            throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
        }
        throw new IllegalArgumentException("precision shouldn't be less than zero!");
    }

    public static double g(long j4, int i4) {
        if (j4 < 0) {
            return -1.0d;
        }
        return j4 / i4;
    }

    public static Bitmap h(byte[] bArr) {
        return H0.j(bArr);
    }

    public static String i(byte[] bArr) {
        char c4;
        if (bArr != null && bArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (byte b4 : bArr) {
                for (int i4 = 7; i4 >= 0; i4--) {
                    if (((b4 >> i4) & 1) == 0) {
                        c4 = '0';
                    } else {
                        c4 = '1';
                    }
                    sb.append(c4);
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static char[] j(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = (char) (bArr[i4] & 255);
        }
        return cArr;
    }

    public static Drawable k(byte[] bArr) {
        return H0.k(bArr);
    }

    public static String l(byte[] bArr) {
        return m(bArr, true);
    }

    public static String m(byte[] bArr, boolean z3) {
        char[] cArr;
        if (bArr == null) {
            return "";
        }
        if (z3) {
            cArr = f25351b;
        } else {
            cArr = f25352c;
        }
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b4 >> 4) & 15];
            i4 += 2;
            cArr2[i5] = cArr[b4 & 15];
        }
        return new String(cArr2);
    }

    public static InputStream n(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            return new ByteArrayInputStream(bArr);
        }
        return null;
    }

    public static JSONArray o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONArray(new String(bArr));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static JSONObject p(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new JSONObject(new String(bArr));
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(byte[] r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r3 = r1.readObject()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1e
            r1.close()     // Catch: java.io.IOException -> L16
            goto L1a
        L16:
            r0 = move-exception
            r0.printStackTrace()
        L1a:
            return r3
        L1b:
            r3 = move-exception
            r0 = r1
            goto L32
        L1e:
            r3 = move-exception
            goto L24
        L20:
            r3 = move-exception
            goto L32
        L22:
            r3 = move-exception
            r1 = r0
        L24:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L2d
            goto L31
        L2d:
            r3 = move-exception
            r3.printStackTrace()
        L31:
            return r0
        L32:
            if (r0 == 0) goto L3c
            r0.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r0 = move-exception
            r0.printStackTrace()
        L3c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.C1115z.q(byte[]):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    public static OutputStream r(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        if (bArr != null) {
            ?? length = bArr.length;
            try {
                if (length > 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byteArrayOutputStream.write(bArr);
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                            return byteArrayOutputStream;
                        } catch (IOException e5) {
                            e = e5;
                            e.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            return null;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        byteArrayOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = length;
            }
        }
        return null;
    }

    public static <T> T s(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static String t(byte[] bArr) {
        return u(bArr, "");
    }

    public static String u(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, A(str));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return new String(bArr);
        }
    }

    public static byte[] v(char[] cArr) {
        if (cArr != null && cArr.length > 0) {
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i4 = 0; i4 < length; i4++) {
                bArr[i4] = (byte) cArr[i4];
            }
            return bArr;
        }
        return null;
    }

    public static int w(float f4) {
        return H0.w(f4);
    }

    public static Bitmap x(Drawable drawable) {
        return H0.x(drawable);
    }

    public static byte[] y(Drawable drawable) {
        return H0.y(drawable);
    }

    public static byte[] z(Drawable drawable, Bitmap.CompressFormat compressFormat, int i4) {
        return H0.z(drawable, compressFormat, i4);
    }
}

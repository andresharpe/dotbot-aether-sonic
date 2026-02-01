package com.blankj.utilcode.util;

import android.os.Build;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class E {
    private E() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String A(byte[] bArr, byte[] bArr2) {
        return H0.l(y(bArr, bArr2));
    }

    public static byte[] B(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacSHA224");
    }

    public static String C(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return D(str.getBytes(), str2.getBytes());
        }
        return "";
    }

    public static String D(byte[] bArr, byte[] bArr2) {
        return H0.l(B(bArr, bArr2));
    }

    public static byte[] E(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacSHA256");
    }

    public static String F(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return G(str.getBytes(), str2.getBytes());
        }
        return "";
    }

    public static String G(byte[] bArr, byte[] bArr2) {
        return H0.l(E(bArr, bArr2));
    }

    public static byte[] H(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacSHA384");
    }

    public static String I(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return J(str.getBytes(), str2.getBytes());
        }
        return "";
    }

    public static String J(byte[] bArr, byte[] bArr2) {
        return H0.l(H(bArr, bArr2));
    }

    public static byte[] K(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacSHA512");
    }

    public static String L(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return M(str.getBytes(), str2.getBytes());
        }
        return "";
    }

    public static String M(byte[] bArr, byte[] bArr2) {
        return H0.l(K(bArr, bArr2));
    }

    public static byte[] N(byte[] bArr) {
        return r0(bArr, "MD2");
    }

    public static String O(String str) {
        if (str != null && str.length() != 0) {
            return P(str.getBytes());
        }
        return "";
    }

    public static String P(byte[] bArr) {
        return H0.l(N(bArr));
    }

    public static byte[] Q(byte[] bArr) {
        return r0(bArr, "MD5");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0030: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:49), block:B:45:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] R(java.io.File r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L38 java.security.NoSuchAlgorithmException -> L3b
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            java.security.DigestInputStream r2 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r4 = 262144(0x40000, float:3.67342E-40)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
        L18:
            int r3 = r2.read(r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            if (r3 > 0) goto L18
            java.security.MessageDigest r4 = r2.getMessageDigest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            byte[] r4 = r4.digest()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32 java.security.NoSuchAlgorithmException -> L34
            r1.close()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return r4
        L2f:
            r4 = move-exception
            r0 = r1
            goto L4b
        L32:
            r4 = move-exception
            goto L3d
        L34:
            r4 = move-exception
            goto L3d
        L36:
            r4 = move-exception
            goto L4b
        L38:
            r4 = move-exception
        L39:
            r1 = r0
            goto L3d
        L3b:
            r4 = move-exception
            goto L39
        L3d:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r4 = move-exception
            r4.printStackTrace()
        L4a:
            return r0
        L4b:
            if (r0 == 0) goto L55
            r0.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r0 = move-exception
            r0.printStackTrace()
        L55:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.E.R(java.io.File):byte[]");
    }

    public static byte[] S(String str) {
        File file;
        if (H0.D0(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        return R(file);
    }

    public static String T(File file) {
        return H0.l(R(file));
    }

    public static String U(String str) {
        File file;
        if (H0.D0(str)) {
            file = null;
        } else {
            file = new File(str);
        }
        return T(file);
    }

    public static String V(String str) {
        if (str != null && str.length() != 0) {
            return X(str.getBytes());
        }
        return "";
    }

    public static String W(String str, String str2) {
        if (str == null && str2 == null) {
            return "";
        }
        if (str2 == null) {
            return H0.l(Q(str.getBytes()));
        }
        if (str == null) {
            return H0.l(Q(str2.getBytes()));
        }
        return H0.l(Q((str + str2).getBytes()));
    }

    public static String X(byte[] bArr) {
        return H0.l(Q(bArr));
    }

    public static String Y(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return "";
        }
        if (bArr2 == null) {
            return H0.l(Q(bArr));
        }
        if (bArr == null) {
            return H0.l(Q(bArr2));
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return H0.l(Q(bArr3));
    }

    public static byte[] Z(byte[] bArr, byte[] bArr2, int i4, String str) {
        return v0(bArr, bArr2, i4, str, true);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "DESede", str, bArr3, false);
    }

    public static byte[] a0(byte[] bArr, byte[] bArr2, int i4, String str) {
        return H0.e(Z(bArr, bArr2, i4, str));
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "AES", str, bArr3, false);
    }

    public static String b0(byte[] bArr, byte[] bArr2, int i4, String str) {
        return H0.l(Z(bArr, bArr2, i4, str));
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return b(H0.d(bArr), bArr2, str, bArr3);
    }

    public static byte[] c0(byte[] bArr) {
        return r0(bArr, "SHA-1");
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return g(H0.d(bArr), bArr2, str, bArr3);
    }

    public static String d0(String str) {
        if (str != null && str.length() != 0) {
            return e0(str.getBytes());
        }
        return "";
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, int i4, String str) {
        return l(H0.d(bArr), bArr2, i4, str);
    }

    public static String e0(byte[] bArr) {
        return H0.l(c0(bArr));
    }

    public static byte[] f(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return a(H0.d(bArr), bArr2, str, bArr3);
    }

    public static byte[] f0(byte[] bArr) {
        return r0(bArr, "SHA224");
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "DES", str, bArr3, false);
    }

    public static String g0(String str) {
        if (str != null && str.length() != 0) {
            return h0(str.getBytes());
        }
        return "";
    }

    public static byte[] h(String str, byte[] bArr, String str2, byte[] bArr2) {
        return a(H0.k0(str), bArr, str2, bArr2);
    }

    public static String h0(byte[] bArr) {
        return H0.l(f0(bArr));
    }

    public static byte[] i(String str, byte[] bArr, String str2, byte[] bArr2) {
        return b(H0.k0(str), bArr, str2, bArr2);
    }

    public static byte[] i0(byte[] bArr) {
        return r0(bArr, "SHA-256");
    }

    public static byte[] j(String str, byte[] bArr, String str2, byte[] bArr2) {
        return g(H0.k0(str), bArr, str2, bArr2);
    }

    public static String j0(String str) {
        if (str != null && str.length() != 0) {
            return k0(str.getBytes());
        }
        return "";
    }

    public static byte[] k(String str, byte[] bArr, int i4, String str2) {
        return l(H0.k0(str), bArr, i4, str2);
    }

    public static String k0(byte[] bArr) {
        return H0.l(i0(bArr));
    }

    public static byte[] l(byte[] bArr, byte[] bArr2, int i4, String str) {
        return v0(bArr, bArr2, i4, str, false);
    }

    public static byte[] l0(byte[] bArr) {
        return r0(bArr, "SHA-384");
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "DESede", str, bArr3, true);
    }

    public static String m0(String str) {
        if (str != null && str.length() != 0) {
            return n0(str.getBytes());
        }
        return "";
    }

    public static byte[] n(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.e(m(bArr, bArr2, str, bArr3));
    }

    public static String n0(byte[] bArr) {
        return H0.l(l0(bArr));
    }

    public static String o(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.l(m(bArr, bArr2, str, bArr3));
    }

    public static byte[] o0(byte[] bArr) {
        return r0(bArr, "SHA-512");
    }

    public static byte[] p(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "AES", str, bArr3, true);
    }

    public static String p0(String str) {
        if (str != null && str.length() != 0) {
            return q0(str.getBytes());
        }
        return "";
    }

    public static byte[] q(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.e(p(bArr, bArr2, str, bArr3));
    }

    public static String q0(byte[] bArr) {
        return H0.l(o0(bArr));
    }

    public static String r(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.l(p(bArr, bArr2, str, bArr3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] r0(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] s(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return w0(bArr, bArr2, "DES", str, bArr3, true);
    }

    private static byte[] s0(byte[] bArr, byte[] bArr2, String str) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
                Mac mac = Mac.getInstance(str);
                mac.init(secretKeySpec);
                return mac.doFinal(bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    public static byte[] t(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.e(s(bArr, bArr2, str, bArr3));
    }

    private static byte[] t0(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String u(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return H0.l(s(bArr, bArr2, str, bArr3));
    }

    public static byte[] u0(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null) {
            if (bArr2.length >= 1 && bArr2.length <= 256) {
                byte[] bArr3 = new byte[256];
                byte[] bArr4 = new byte[256];
                int length = bArr2.length;
                for (int i4 = 0; i4 < 256; i4++) {
                    bArr3[i4] = (byte) i4;
                    bArr4[i4] = bArr2[i4 % length];
                }
                int i5 = 0;
                for (int i6 = 0; i6 < 256; i6++) {
                    byte b4 = bArr3[i6];
                    i5 = (i5 + b4 + bArr4[i6]) & 255;
                    byte b5 = bArr3[i5];
                    bArr3[i5] = b4;
                    bArr3[i6] = b5;
                }
                byte[] bArr5 = new byte[bArr.length];
                int i7 = 0;
                for (int i8 = 0; i8 < bArr.length; i8++) {
                    i7 = (i7 + 1) & 255;
                    byte b6 = bArr3[i7];
                    i5 = (i5 + b6) & 255;
                    byte b7 = bArr3[i5];
                    bArr3[i5] = b6;
                    bArr3[i7] = b7;
                    bArr5[i8] = (byte) (bArr3[(b7 + bArr3[i5]) & 255] ^ bArr[i8]);
                }
                return bArr5;
            }
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        return null;
    }

    public static byte[] v(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacMD5");
    }

    private static byte[] v0(byte[] bArr, byte[] bArr2, int i4, String str, boolean z3) {
        KeyFactory keyFactory;
        Key generatePrivate;
        int i5;
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                if (Build.VERSION.SDK_INT < 28) {
                    keyFactory = KeyFactory.getInstance("RSA", "BC");
                } else {
                    keyFactory = KeyFactory.getInstance("RSA");
                }
                if (z3) {
                    generatePrivate = keyFactory.generatePublic(new X509EncodedKeySpec(bArr2));
                } else {
                    generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                }
                if (generatePrivate == null) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance(str);
                if (z3) {
                    i5 = 1;
                } else {
                    i5 = 2;
                }
                cipher.init(i5, generatePrivate);
                int length = bArr.length;
                int i6 = i4 / 8;
                if (z3 && str.toLowerCase().endsWith("pkcs1padding")) {
                    i6 -= 11;
                }
                int i7 = length / i6;
                if (i7 > 0) {
                    byte[] bArr3 = new byte[0];
                    byte[] bArr4 = new byte[i6];
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        System.arraycopy(bArr, i8, bArr4, 0, i6);
                        bArr3 = t0(bArr3, cipher.doFinal(bArr4));
                        i8 += i6;
                    }
                    if (i8 != length) {
                        int i10 = length - i8;
                        byte[] bArr5 = new byte[i10];
                        System.arraycopy(bArr, i8, bArr5, 0, i10);
                        return t0(bArr3, cipher.doFinal(bArr5));
                    }
                    return bArr3;
                }
                return cipher.doFinal(bArr);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return null;
    }

    public static String w(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return x(str.getBytes(), str2.getBytes());
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] w0(byte[] r3, byte[] r4, java.lang.String r5, java.lang.String r6, byte[] r7, boolean r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L50
            int r1 = r3.length
            if (r1 == 0) goto L50
            if (r4 == 0) goto L50
            int r1 = r4.length
            if (r1 != 0) goto Lc
            goto L50
        Lc:
            java.lang.String r1 = "DES"
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L24
            javax.crypto.spec.DESKeySpec r1 = new javax.crypto.spec.DESKeySpec     // Catch: java.lang.Throwable -> L22
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L22
            javax.crypto.SecretKeyFactory r4 = javax.crypto.SecretKeyFactory.getInstance(r5)     // Catch: java.lang.Throwable -> L22
            javax.crypto.SecretKey r4 = r4.generateSecret(r1)     // Catch: java.lang.Throwable -> L22
            goto L2a
        L22:
            r3 = move-exception
            goto L4d
        L24:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L22
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L22
            r4 = r1
        L2a:
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r6)     // Catch: java.lang.Throwable -> L22
            r6 = 2
            r1 = 1
            if (r7 == 0) goto L42
            int r2 = r7.length     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L36
            goto L42
        L36:
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L22
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L3e
            r6 = r1
        L3e:
            r5.init(r6, r4, r2)     // Catch: java.lang.Throwable -> L22
            goto L48
        L42:
            if (r8 == 0) goto L45
            r6 = r1
        L45:
            r5.init(r6, r4)     // Catch: java.lang.Throwable -> L22
        L48:
            byte[] r3 = r5.doFinal(r3)     // Catch: java.lang.Throwable -> L22
            return r3
        L4d:
            r3.printStackTrace()
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.E.w0(byte[], byte[], java.lang.String, java.lang.String, byte[], boolean):byte[]");
    }

    public static String x(byte[] bArr, byte[] bArr2) {
        return H0.l(v(bArr, bArr2));
    }

    public static byte[] y(byte[] bArr, byte[] bArr2) {
        return s0(bArr, bArr2, "HmacSHA1");
    }

    public static String z(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return A(str.getBytes(), str2.getBytes());
        }
        return "";
    }
}

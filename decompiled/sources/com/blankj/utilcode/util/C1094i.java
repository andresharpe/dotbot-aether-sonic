package com.blankj.utilcode.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.blankj.utilcode.util.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1094i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25024a = -1;

    /* renamed from: com.blankj.utilcode.util.i$a */
    /* loaded from: classes.dex */
    public interface a<E> {
        void a(int i4, E e4);
    }

    private C1094i() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @androidx.annotation.N
    public static <T> T[] A(@androidx.annotation.P T[] tArr, @androidx.annotation.P T t3) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else if (t3 != null) {
            cls = t3.getClass();
        } else {
            cls = Object.class;
        }
        return (T[]) ((Object[]) v1(tArr, t3, cls));
    }

    public static int A0(@androidx.annotation.P double[] dArr, double d4, int i4, double d5) {
        if (N0(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        double d6 = d4 - d5;
        double d7 = d4 + d5;
        while (i4 < dArr.length) {
            double d8 = dArr[i4];
            if (d8 >= d6 && d8 <= d7) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static char[] A1(@androidx.annotation.P char[] cArr, int i4) {
        if (cArr == null) {
            return null;
        }
        return (char[]) y1(cArr, i4);
    }

    @androidx.annotation.P
    public static byte[] A2(@androidx.annotation.P Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = bArr[i4].byteValue();
        }
        return bArr2;
    }

    @androidx.annotation.P
    public static <T> T[] B(@androidx.annotation.P T[] tArr, @androidx.annotation.P T[] tArr2) {
        return (T[]) ((Object[]) u1(tArr, tArr2));
    }

    public static int B0(@androidx.annotation.P float[] fArr, float f4) {
        return C0(fArr, f4, 0);
    }

    @androidx.annotation.P
    public static double[] B1(@androidx.annotation.P double[] dArr, int i4) {
        if (dArr == null) {
            return null;
        }
        return (double[]) y1(dArr, i4);
    }

    @androidx.annotation.P
    public static byte[] B2(@androidx.annotation.P Byte[] bArr, byte b4) {
        byte byteValue;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            Byte b5 = bArr[i4];
            if (b5 == null) {
                byteValue = b4;
            } else {
                byteValue = b5.byteValue();
            }
            bArr2[i4] = byteValue;
        }
        return bArr2;
    }

    @androidx.annotation.N
    public static short[] C(@androidx.annotation.P short[] sArr, int i4, short s4) {
        return (short[]) s1(sArr, i4, Short.valueOf(s4), Short.TYPE);
    }

    public static int C0(@androidx.annotation.P float[] fArr, float f4, int i4) {
        if (N0(fArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < fArr.length) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static float[] C1(@androidx.annotation.P float[] fArr, int i4) {
        if (fArr == null) {
            return null;
        }
        return (float[]) y1(fArr, i4);
    }

    @androidx.annotation.P
    public static char[] C2(@androidx.annotation.P Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            cArr[i4] = chArr[i4].charValue();
        }
        return cArr;
    }

    @androidx.annotation.P
    public static short[] D(@androidx.annotation.P short[] sArr, int i4, @androidx.annotation.P short[] sArr2) {
        Object t12 = t1(sArr, i4, sArr2, Short.TYPE);
        if (t12 == null) {
            return null;
        }
        return (short[]) t12;
    }

    public static int D0(@androidx.annotation.P int[] iArr, int i4) {
        return E0(iArr, i4, 0);
    }

    @androidx.annotation.P
    public static int[] D1(@androidx.annotation.P int[] iArr, int i4) {
        if (iArr == null) {
            return null;
        }
        return (int[]) y1(iArr, i4);
    }

    @androidx.annotation.P
    public static char[] D2(@androidx.annotation.P Character[] chArr, char c4) {
        char charValue;
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int i4 = 0; i4 < chArr.length; i4++) {
            Character ch = chArr[i4];
            if (ch == null) {
                charValue = c4;
            } else {
                charValue = ch.charValue();
            }
            cArr[i4] = charValue;
        }
        return cArr;
    }

    @androidx.annotation.N
    public static short[] E(@androidx.annotation.P short[] sArr, short s4) {
        return (short[]) v1(sArr, Short.valueOf(s4), Short.TYPE);
    }

    public static int E0(@androidx.annotation.P int[] iArr, int i4, int i5) {
        if (iArr == null) {
            return -1;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < iArr.length) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static long[] E1(@androidx.annotation.P long[] jArr, int i4) {
        if (jArr == null) {
            return null;
        }
        return (long[]) y1(jArr, i4);
    }

    @androidx.annotation.P
    public static double[] E2(@androidx.annotation.P Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = dArr[i4].doubleValue();
        }
        return dArr2;
    }

    @androidx.annotation.P
    public static short[] F(@androidx.annotation.P short[] sArr, @androidx.annotation.P short[] sArr2) {
        return (short[]) u1(sArr, sArr2);
    }

    public static int F0(@androidx.annotation.P long[] jArr, long j4) {
        return G0(jArr, j4, 0);
    }

    @androidx.annotation.P
    public static Object[] F1(@androidx.annotation.P Object[] objArr, int i4) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) y1(objArr, i4);
    }

    @androidx.annotation.P
    public static double[] F2(@androidx.annotation.P Double[] dArr, double d4) {
        double doubleValue;
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            Double d5 = dArr[i4];
            if (d5 == null) {
                doubleValue = d4;
            } else {
                doubleValue = d5.doubleValue();
            }
            dArr2[i4] = doubleValue;
        }
        return dArr2;
    }

    @androidx.annotation.N
    public static boolean[] G(@androidx.annotation.P boolean[] zArr, int i4, boolean z3) {
        return (boolean[]) s1(zArr, i4, Boolean.valueOf(z3), Boolean.TYPE);
    }

    public static int G0(@androidx.annotation.P long[] jArr, long j4, int i4) {
        if (jArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < jArr.length) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static short[] G1(@androidx.annotation.P short[] sArr, int i4) {
        if (sArr == null) {
            return null;
        }
        return (short[]) y1(sArr, i4);
    }

    @androidx.annotation.P
    public static float[] G2(@androidx.annotation.P Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = fArr[i4].floatValue();
        }
        return fArr2;
    }

    @androidx.annotation.P
    public static boolean[] H(@androidx.annotation.P boolean[] zArr, int i4, @androidx.annotation.P boolean[] zArr2) {
        Object t12 = t1(zArr, i4, zArr2, Boolean.TYPE);
        if (t12 == null) {
            return null;
        }
        return (boolean[]) t12;
    }

    public static int H0(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj) {
        return I0(objArr, obj, 0);
    }

    @androidx.annotation.P
    public static boolean[] H1(@androidx.annotation.P boolean[] zArr, int i4) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) y1(zArr, i4);
    }

    @androidx.annotation.P
    public static float[] H2(@androidx.annotation.P Float[] fArr, float f4) {
        float floatValue;
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            Float f5 = fArr[i4];
            if (f5 == null) {
                floatValue = f4;
            } else {
                floatValue = f5.floatValue();
            }
            fArr2[i4] = floatValue;
        }
        return fArr2;
    }

    @androidx.annotation.N
    public static boolean[] I(@androidx.annotation.P boolean[] zArr, boolean z3) {
        return (boolean[]) v1(zArr, Boolean.valueOf(z3), Boolean.TYPE);
    }

    public static int I0(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj, int i4) {
        if (objArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (obj == null) {
            while (i4 < objArr.length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
        } else {
            while (i4 < objArr.length) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    @androidx.annotation.P
    public static byte[] I1(@androidx.annotation.P byte[] bArr, byte b4) {
        int t02 = t0(bArr, b4);
        if (t02 == -1) {
            return Y(bArr);
        }
        return z1(bArr, t02);
    }

    @androidx.annotation.P
    public static int[] I2(@androidx.annotation.P Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i4 = 0; i4 < numArr.length; i4++) {
            iArr[i4] = numArr[i4].intValue();
        }
        return iArr;
    }

    @androidx.annotation.P
    public static boolean[] J(@androidx.annotation.P boolean[] zArr, @androidx.annotation.P boolean[] zArr2) {
        return (boolean[]) u1(zArr, zArr2);
    }

    public static int J0(@androidx.annotation.P short[] sArr, short s4) {
        return K0(sArr, s4, 0);
    }

    @androidx.annotation.P
    public static char[] J1(@androidx.annotation.P char[] cArr, char c4) {
        int v02 = v0(cArr, c4);
        if (v02 == -1) {
            return Z(cArr);
        }
        return A1(cArr, v02);
    }

    @androidx.annotation.P
    public static int[] J2(@androidx.annotation.P Integer[] numArr, int i4) {
        int intValue;
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] iArr = new int[numArr.length];
        for (int i5 = 0; i5 < numArr.length; i5++) {
            Integer num = numArr[i5];
            if (num == null) {
                intValue = i4;
            } else {
                intValue = num.intValue();
            }
            iArr[i5] = intValue;
        }
        return iArr;
    }

    @androidx.annotation.N
    public static <T> List<T> K(@androidx.annotation.P T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    public static int K0(@androidx.annotation.P short[] sArr, short s4, int i4) {
        if (sArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < sArr.length) {
            if (s4 == sArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static double[] K1(@androidx.annotation.P double[] dArr, double d4) {
        int x02 = x0(dArr, d4);
        if (x02 == -1) {
            return a0(dArr);
        }
        return B1(dArr, x02);
    }

    @androidx.annotation.P
    public static long[] K2(@androidx.annotation.P Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            jArr[i4] = lArr[i4].longValue();
        }
        return jArr;
    }

    @androidx.annotation.N
    public static <T> List<T> L(@androidx.annotation.P T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    public static int L0(@androidx.annotation.P boolean[] zArr, boolean z3) {
        return M0(zArr, z3, 0);
    }

    @androidx.annotation.P
    public static float[] L1(@androidx.annotation.P float[] fArr, float f4) {
        int B02 = B0(fArr, f4);
        if (B02 == -1) {
            return b0(fArr);
        }
        return C1(fArr, B02);
    }

    @androidx.annotation.P
    public static long[] L2(@androidx.annotation.P Long[] lArr, long j4) {
        long longValue;
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int i4 = 0; i4 < lArr.length; i4++) {
            Long l4 = lArr[i4];
            if (l4 == null) {
                longValue = j4;
            } else {
                longValue = l4.longValue();
            }
            jArr[i4] = longValue;
        }
        return jArr;
    }

    @androidx.annotation.N
    public static <T> List<T> M(@androidx.annotation.P T... tArr) {
        if (tArr != null && tArr.length != 0) {
            return Arrays.asList(tArr);
        }
        return Collections.emptyList();
    }

    public static int M0(@androidx.annotation.P boolean[] zArr, boolean z3, int i4) {
        if (N0(zArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < zArr.length) {
            if (z3 == zArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static int[] M1(@androidx.annotation.P int[] iArr, int i4) {
        int D02 = D0(iArr, i4);
        if (D02 == -1) {
            return c0(iArr);
        }
        return D1(iArr, D02);
    }

    @androidx.annotation.P
    public static short[] M2(@androidx.annotation.P Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            sArr[i4] = shArr[i4].shortValue();
        }
        return sArr;
    }

    @androidx.annotation.N
    public static <T> List<T> N(@androidx.annotation.P T... tArr) {
        return Collections.unmodifiableList(M(tArr));
    }

    public static boolean N0(@androidx.annotation.P Object obj) {
        if (s0(obj) == 0) {
            return true;
        }
        return false;
    }

    @androidx.annotation.P
    public static long[] N1(@androidx.annotation.P long[] jArr, long j4) {
        int F02 = F0(jArr, j4);
        if (F02 == -1) {
            return d0(jArr);
        }
        return E1(jArr, F02);
    }

    @androidx.annotation.P
    public static short[] N2(@androidx.annotation.P Short[] shArr, short s4) {
        short shortValue;
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int i4 = 0; i4 < shArr.length; i4++) {
            Short sh = shArr[i4];
            if (sh == null) {
                shortValue = s4;
            } else {
                shortValue = sh.shortValue();
            }
            sArr[i4] = shortValue;
        }
        return sArr;
    }

    public static boolean O(@androidx.annotation.P byte[] bArr, byte b4) {
        if (t0(bArr, b4) != -1) {
            return true;
        }
        return false;
    }

    public static boolean O0(@androidx.annotation.P Object obj, @androidx.annotation.P Object obj2) {
        if (s0(obj) == s0(obj2)) {
            return true;
        }
        return false;
    }

    @androidx.annotation.P
    public static Object[] O1(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj) {
        int H02 = H0(objArr, obj);
        if (H02 == -1) {
            return e0(objArr);
        }
        return F1(objArr, H02);
    }

    @androidx.annotation.P
    public static boolean[] O2(@androidx.annotation.P Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            zArr[i4] = boolArr[i4].booleanValue();
        }
        return zArr;
    }

    public static boolean P(@androidx.annotation.P char[] cArr, char c4) {
        if (v0(cArr, c4) != -1) {
            return true;
        }
        return false;
    }

    public static int P0(@androidx.annotation.P byte[] bArr, byte b4) {
        return Q0(bArr, b4, Integer.MAX_VALUE);
    }

    @androidx.annotation.P
    public static short[] P1(@androidx.annotation.P short[] sArr, short s4) {
        int J02 = J0(sArr, s4);
        if (J02 == -1) {
            return f0(sArr);
        }
        return G1(sArr, J02);
    }

    @androidx.annotation.P
    public static boolean[] P2(@androidx.annotation.P Boolean[] boolArr, boolean z3) {
        boolean booleanValue;
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int i4 = 0; i4 < boolArr.length; i4++) {
            Boolean bool = boolArr[i4];
            if (bool == null) {
                booleanValue = z3;
            } else {
                booleanValue = bool.booleanValue();
            }
            zArr[i4] = booleanValue;
        }
        return zArr;
    }

    public static boolean Q(@androidx.annotation.P double[] dArr, double d4) {
        if (x0(dArr, d4) != -1) {
            return true;
        }
        return false;
    }

    public static int Q0(@androidx.annotation.P byte[] bArr, byte b4, int i4) {
        if (bArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= bArr.length) {
            i4 = bArr.length - 1;
        }
        while (i4 >= 0) {
            if (b4 == bArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    @androidx.annotation.P
    public static boolean[] Q1(@androidx.annotation.P boolean[] zArr, boolean z3) {
        int L02 = L0(zArr, z3);
        if (L02 == -1) {
            return g0(zArr);
        }
        return H1(zArr, L02);
    }

    @androidx.annotation.N
    public static String Q2(@androidx.annotation.P Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }

    public static boolean R(@androidx.annotation.P double[] dArr, double d4, double d5) {
        if (A0(dArr, d4, 0, d5) != -1) {
            return true;
        }
        return false;
    }

    public static int R0(@androidx.annotation.P char[] cArr, char c4) {
        return S0(cArr, c4, Integer.MAX_VALUE);
    }

    public static void R1(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            byte b4 = bArr[length];
            bArr[length] = bArr[i4];
            bArr[i4] = b4;
            length--;
        }
    }

    public static boolean S(@androidx.annotation.P float[] fArr, float f4) {
        if (B0(fArr, f4) != -1) {
            return true;
        }
        return false;
    }

    public static int S0(@androidx.annotation.P char[] cArr, char c4, int i4) {
        if (cArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= cArr.length) {
            i4 = cArr.length - 1;
        }
        while (i4 >= 0) {
            if (c4 == cArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void S1(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            char c4 = cArr[length];
            cArr[length] = cArr[i4];
            cArr[i4] = c4;
            length--;
        }
    }

    public static boolean T(@androidx.annotation.P int[] iArr, int i4) {
        if (D0(iArr, i4) != -1) {
            return true;
        }
        return false;
    }

    public static int T0(@androidx.annotation.P double[] dArr, double d4) {
        return V0(dArr, d4, Integer.MAX_VALUE);
    }

    public static void T1(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            double d4 = dArr[length];
            dArr[length] = dArr[i4];
            dArr[i4] = d4;
            length--;
        }
    }

    public static boolean U(@androidx.annotation.P long[] jArr, long j4) {
        if (F0(jArr, j4) != -1) {
            return true;
        }
        return false;
    }

    public static int U0(@androidx.annotation.P double[] dArr, double d4, double d5) {
        return W0(dArr, d4, Integer.MAX_VALUE, d5);
    }

    public static void U1(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            float f4 = fArr[length];
            fArr[length] = fArr[i4];
            fArr[i4] = f4;
            length--;
        }
    }

    public static boolean V(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj) {
        if (H0(objArr, obj) != -1) {
            return true;
        }
        return false;
    }

    public static int V0(@androidx.annotation.P double[] dArr, double d4, int i4) {
        if (N0(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        while (i4 >= 0) {
            if (d4 == dArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void V1(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int length = iArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            int i5 = iArr[length];
            iArr[length] = iArr[i4];
            iArr[i4] = i5;
            length--;
        }
    }

    public static boolean W(@androidx.annotation.P short[] sArr, short s4) {
        if (J0(sArr, s4) != -1) {
            return true;
        }
        return false;
    }

    public static int W0(@androidx.annotation.P double[] dArr, double d4, int i4, double d5) {
        if (N0(dArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= dArr.length) {
            i4 = dArr.length - 1;
        }
        double d6 = d4 - d5;
        double d7 = d4 + d5;
        while (i4 >= 0) {
            double d8 = dArr[i4];
            if (d8 >= d6 && d8 <= d7) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void W1(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            long j4 = jArr[length];
            jArr[length] = jArr[i4];
            jArr[i4] = j4;
            length--;
        }
    }

    public static boolean X(@androidx.annotation.P boolean[] zArr, boolean z3) {
        if (L0(zArr, z3) != -1) {
            return true;
        }
        return false;
    }

    public static int X0(@androidx.annotation.P float[] fArr, float f4) {
        return Y0(fArr, f4, Integer.MAX_VALUE);
    }

    public static <T> void X1(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            T t3 = tArr[length];
            tArr[length] = tArr[i4];
            tArr[i4] = t3;
            length--;
        }
    }

    @androidx.annotation.P
    public static byte[] Y(@androidx.annotation.P byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return j2(bArr, 0, bArr.length);
    }

    public static int Y0(@androidx.annotation.P float[] fArr, float f4, int i4) {
        if (N0(fArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= fArr.length) {
            i4 = fArr.length - 1;
        }
        while (i4 >= 0) {
            if (f4 == fArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void Y1(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            short s4 = sArr[length];
            sArr[length] = sArr[i4];
            sArr[i4] = s4;
            length--;
        }
    }

    @androidx.annotation.P
    public static char[] Z(@androidx.annotation.P char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return k2(cArr, 0, cArr.length);
    }

    public static int Z0(@androidx.annotation.P int[] iArr, int i4) {
        return a1(iArr, i4, Integer.MAX_VALUE);
    }

    public static void Z1(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int i4 = 0; length > i4; i4++) {
            boolean z3 = zArr[length];
            zArr[length] = zArr[i4];
            zArr[i4] = z3;
            length--;
        }
    }

    @androidx.annotation.N
    public static byte[] a(@androidx.annotation.P byte[] bArr, byte b4) {
        return (byte[]) v1(bArr, Byte.valueOf(b4), Byte.TYPE);
    }

    @androidx.annotation.P
    public static double[] a0(@androidx.annotation.P double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return l2(dArr, 0, dArr.length);
    }

    public static int a1(@androidx.annotation.P int[] iArr, int i4, int i5) {
        if (iArr == null || i5 < 0) {
            return -1;
        }
        if (i5 >= iArr.length) {
            i5 = iArr.length - 1;
        }
        while (i5 >= 0) {
            if (i4 == iArr[i5]) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static void a2(@androidx.annotation.P Object obj, int i4, @androidx.annotation.P Object obj2) {
        if (obj == null) {
            return;
        }
        Array.set(obj, i4, obj2);
    }

    @androidx.annotation.N
    public static byte[] b(@androidx.annotation.P byte[] bArr, int i4, byte b4) {
        return (byte[]) s1(bArr, i4, Byte.valueOf(b4), Byte.TYPE);
    }

    @androidx.annotation.P
    public static float[] b0(@androidx.annotation.P float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return m2(fArr, 0, fArr.length);
    }

    public static int b1(@androidx.annotation.P long[] jArr, long j4) {
        return c1(jArr, j4, Integer.MAX_VALUE);
    }

    public static void b2(@androidx.annotation.P byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            Arrays.sort(bArr);
        }
    }

    @androidx.annotation.P
    public static byte[] c(@androidx.annotation.P byte[] bArr, int i4, @androidx.annotation.P byte[] bArr2) {
        Object t12 = t1(bArr, i4, bArr2, Byte.TYPE);
        if (t12 == null) {
            return null;
        }
        return (byte[]) t12;
    }

    @androidx.annotation.P
    public static int[] c0(@androidx.annotation.P int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return n2(iArr, 0, iArr.length);
    }

    public static int c1(@androidx.annotation.P long[] jArr, long j4, int i4) {
        if (jArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= jArr.length) {
            i4 = jArr.length - 1;
        }
        while (i4 >= 0) {
            if (j4 == jArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void c2(@androidx.annotation.P char[] cArr) {
        if (cArr != null && cArr.length >= 2) {
            Arrays.sort(cArr);
        }
    }

    @androidx.annotation.P
    public static byte[] d(@androidx.annotation.P byte[] bArr, @androidx.annotation.P byte[] bArr2) {
        return (byte[]) u1(bArr, bArr2);
    }

    @androidx.annotation.P
    public static long[] d0(@androidx.annotation.P long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return o2(jArr, 0, jArr.length);
    }

    public static int d1(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj) {
        return e1(objArr, obj, Integer.MAX_VALUE);
    }

    public static void d2(@androidx.annotation.P double[] dArr) {
        if (dArr != null && dArr.length >= 2) {
            Arrays.sort(dArr);
        }
    }

    @androidx.annotation.N
    public static char[] e(@androidx.annotation.P char[] cArr, char c4) {
        return (char[]) v1(cArr, Character.valueOf(c4), Character.TYPE);
    }

    @androidx.annotation.P
    public static <T> T[] e0(@androidx.annotation.P T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) p2(tArr, 0, tArr.length);
    }

    public static int e1(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object obj, int i4) {
        if (objArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= objArr.length) {
            i4 = objArr.length - 1;
        }
        if (obj == null) {
            while (i4 >= 0) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4--;
            }
        } else {
            while (i4 >= 0) {
                if (obj.equals(objArr[i4])) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    public static void e2(@androidx.annotation.P float[] fArr) {
        if (fArr != null && fArr.length >= 2) {
            Arrays.sort(fArr);
        }
    }

    @androidx.annotation.N
    public static char[] f(@androidx.annotation.P char[] cArr, int i4, char c4) {
        return (char[]) s1(cArr, i4, Character.valueOf(c4), Character.TYPE);
    }

    @androidx.annotation.P
    public static short[] f0(@androidx.annotation.P short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return q2(sArr, 0, sArr.length);
    }

    public static int f1(@androidx.annotation.P short[] sArr, short s4) {
        return g1(sArr, s4, Integer.MAX_VALUE);
    }

    public static void f2(@androidx.annotation.P int[] iArr) {
        if (iArr != null && iArr.length >= 2) {
            Arrays.sort(iArr);
        }
    }

    public static char[] g(@androidx.annotation.P char[] cArr, int i4, @androidx.annotation.P char[] cArr2) {
        Object t12 = t1(cArr, i4, cArr2, Character.TYPE);
        if (t12 == null) {
            return null;
        }
        return (char[]) t12;
    }

    @androidx.annotation.P
    public static boolean[] g0(@androidx.annotation.P boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return r2(zArr, 0, zArr.length);
    }

    public static int g1(@androidx.annotation.P short[] sArr, short s4, int i4) {
        if (sArr == null || i4 < 0) {
            return -1;
        }
        if (i4 >= sArr.length) {
            i4 = sArr.length - 1;
        }
        while (i4 >= 0) {
            if (s4 == sArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void g2(@androidx.annotation.P long[] jArr) {
        if (jArr != null && jArr.length >= 2) {
            Arrays.sort(jArr);
        }
    }

    @androidx.annotation.P
    public static char[] h(@androidx.annotation.P char[] cArr, @androidx.annotation.P char[] cArr2) {
        return (char[]) u1(cArr, cArr2);
    }

    public static boolean h0(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static int h1(@androidx.annotation.P boolean[] zArr, boolean z3) {
        return i1(zArr, z3, Integer.MAX_VALUE);
    }

    public static <T> void h2(@androidx.annotation.P T[] tArr, Comparator<? super T> comparator) {
        if (tArr != null && tArr.length >= 2) {
            Arrays.sort(tArr, comparator);
        }
    }

    @androidx.annotation.N
    public static double[] i(@androidx.annotation.P double[] dArr, double d4) {
        return (double[]) v1(dArr, Double.valueOf(d4), Double.TYPE);
    }

    public static boolean i0(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static int i1(@androidx.annotation.P boolean[] zArr, boolean z3, int i4) {
        if (N0(zArr) || i4 < 0) {
            return -1;
        }
        if (i4 >= zArr.length) {
            i4 = zArr.length - 1;
        }
        while (i4 >= 0) {
            if (z3 == zArr[i4]) {
                return i4;
            }
            i4--;
        }
        return -1;
    }

    public static void i2(@androidx.annotation.P short[] sArr) {
        if (sArr != null && sArr.length >= 2) {
            Arrays.sort(sArr);
        }
    }

    @androidx.annotation.N
    public static double[] j(@androidx.annotation.P double[] dArr, int i4, double d4) {
        return (double[]) s1(dArr, i4, Double.valueOf(d4), Double.TYPE);
    }

    public static boolean j0(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @androidx.annotation.N
    public static <T> T[] j1(T... tArr) {
        return tArr;
    }

    @androidx.annotation.P
    public static byte[] j2(@androidx.annotation.P byte[] bArr, int i4, int i5) {
        return (byte[]) x1(bArr, i4, i5);
    }

    @androidx.annotation.P
    public static double[] k(@androidx.annotation.P double[] dArr, int i4, @androidx.annotation.P double[] dArr2) {
        Object t12 = t1(dArr, i4, dArr2, Double.TYPE);
        if (t12 == null) {
            return null;
        }
        return (double[]) t12;
    }

    public static boolean k0(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @androidx.annotation.N
    public static boolean[] k1(boolean... zArr) {
        return zArr;
    }

    @androidx.annotation.P
    public static char[] k2(@androidx.annotation.P char[] cArr, int i4, int i5) {
        return (char[]) x1(cArr, i4, i5);
    }

    @androidx.annotation.P
    public static double[] l(@androidx.annotation.P double[] dArr, @androidx.annotation.P double[] dArr2) {
        return (double[]) u1(dArr, dArr2);
    }

    public static boolean l0(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @androidx.annotation.N
    public static byte[] l1(byte... bArr) {
        return bArr;
    }

    @androidx.annotation.P
    public static double[] l2(@androidx.annotation.P double[] dArr, int i4, int i5) {
        return (double[]) x1(dArr, i4, i5);
    }

    @androidx.annotation.N
    public static float[] m(@androidx.annotation.P float[] fArr, float f4) {
        return (float[]) v1(fArr, Float.valueOf(f4), Float.TYPE);
    }

    public static boolean m0(@androidx.annotation.P Object[] objArr, @androidx.annotation.P Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    @androidx.annotation.N
    public static char[] m1(char... cArr) {
        return cArr;
    }

    @androidx.annotation.P
    public static float[] m2(@androidx.annotation.P float[] fArr, int i4, int i5) {
        return (float[]) x1(fArr, i4, i5);
    }

    @androidx.annotation.N
    public static float[] n(@androidx.annotation.P float[] fArr, int i4, float f4) {
        return (float[]) s1(fArr, i4, Float.valueOf(f4), Float.TYPE);
    }

    public static boolean n0(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @androidx.annotation.N
    public static double[] n1(double... dArr) {
        return dArr;
    }

    @androidx.annotation.P
    public static int[] n2(@androidx.annotation.P int[] iArr, int i4, int i5) {
        return (int[]) x1(iArr, i4, i5);
    }

    @androidx.annotation.P
    public static float[] o(@androidx.annotation.P float[] fArr, int i4, @androidx.annotation.P float[] fArr2) {
        Object t12 = t1(fArr, i4, fArr2, Float.TYPE);
        if (t12 == null) {
            return null;
        }
        return (float[]) t12;
    }

    public static boolean o0(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @androidx.annotation.N
    public static float[] o1(float... fArr) {
        return fArr;
    }

    @androidx.annotation.P
    public static long[] o2(@androidx.annotation.P long[] jArr, int i4, int i5) {
        return (long[]) x1(jArr, i4, i5);
    }

    @androidx.annotation.P
    public static float[] p(@androidx.annotation.P float[] fArr, @androidx.annotation.P float[] fArr2) {
        return (float[]) u1(fArr, fArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void p0(@androidx.annotation.P Object obj, @androidx.annotation.P a<E> aVar) {
        Boolean bool;
        if (obj != null && aVar != 0) {
            int i4 = 0;
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                while (i4 < length) {
                    aVar.a(i4, objArr[i4]);
                    i4++;
                }
                return;
            }
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length2 = zArr.length;
                while (i4 < length2) {
                    if (zArr[i4]) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    aVar.a(i4, bool);
                    i4++;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length3 = bArr.length;
                while (i4 < length3) {
                    aVar.a(i4, Byte.valueOf(bArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i4 < length4) {
                    aVar.a(i4, Character.valueOf(cArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length5 = sArr.length;
                while (i4 < length5) {
                    aVar.a(i4, Short.valueOf(sArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length6 = iArr.length;
                while (i4 < length6) {
                    aVar.a(i4, Integer.valueOf(iArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length7 = jArr.length;
                while (i4 < length7) {
                    aVar.a(i4, Long.valueOf(jArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length8 = fArr.length;
                while (i4 < length8) {
                    aVar.a(i4, Float.valueOf(fArr[i4]));
                    i4++;
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length9 = dArr.length;
                while (i4 < length9) {
                    aVar.a(i4, Double.valueOf(dArr[i4]));
                    i4++;
                }
                return;
            }
            throw new IllegalArgumentException("Not an array: " + obj.getClass());
        }
    }

    @androidx.annotation.N
    public static int[] p1(int... iArr) {
        return iArr;
    }

    @androidx.annotation.P
    public static <T> T[] p2(@androidx.annotation.P T[] tArr, int i4, int i5) {
        return (T[]) ((Object[]) x1(tArr, i4, i5));
    }

    @androidx.annotation.N
    public static int[] q(@androidx.annotation.P int[] iArr, int i4) {
        return (int[]) v1(iArr, Integer.valueOf(i4), Integer.TYPE);
    }

    @androidx.annotation.P
    public static Object q0(@androidx.annotation.P Object obj, int i4) {
        return r0(obj, i4, null);
    }

    @androidx.annotation.N
    public static long[] q1(long... jArr) {
        return jArr;
    }

    @androidx.annotation.P
    public static short[] q2(@androidx.annotation.P short[] sArr, int i4, int i5) {
        return (short[]) x1(sArr, i4, i5);
    }

    @androidx.annotation.N
    public static int[] r(@androidx.annotation.P int[] iArr, int i4, int i5) {
        return (int[]) s1(iArr, i4, Integer.valueOf(i5), Integer.TYPE);
    }

    @androidx.annotation.P
    public static Object r0(@androidx.annotation.P Object obj, int i4, @androidx.annotation.P Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, i4);
        } catch (Exception unused) {
            return obj2;
        }
    }

    @androidx.annotation.N
    public static short[] r1(short... sArr) {
        return sArr;
    }

    @androidx.annotation.P
    public static boolean[] r2(@androidx.annotation.P boolean[] zArr, int i4, int i5) {
        return (boolean[]) x1(zArr, i4, i5);
    }

    @androidx.annotation.P
    public static int[] s(@androidx.annotation.P int[] iArr, int i4, @androidx.annotation.P int[] iArr2) {
        Object t12 = t1(iArr, i4, iArr2, Integer.TYPE);
        if (t12 == null) {
            return null;
        }
        return (int[]) t12;
    }

    public static int s0(@androidx.annotation.P Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    @androidx.annotation.N
    private static Object s1(@androidx.annotation.P Object obj, int i4, @androidx.annotation.P Object obj2, Class cls) {
        if (obj == null) {
            if (i4 == 0) {
                Object newInstance = Array.newInstance((Class<?>) cls, 1);
                Array.set(newInstance, 0, obj2);
                return newInstance;
            }
            throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: 0");
        }
        int length = Array.getLength(obj);
        if (i4 <= length && i4 >= 0) {
            Object newInstance2 = Array.newInstance((Class<?>) cls, length + 1);
            System.arraycopy(obj, 0, newInstance2, 0, i4);
            Array.set(newInstance2, i4, obj2);
            if (i4 < length) {
                System.arraycopy(obj, i4, newInstance2, i4 + 1, length - i4);
            }
            return newInstance2;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + length);
    }

    @androidx.annotation.P
    public static Boolean[] s2(@androidx.annotation.P boolean[] zArr) {
        Boolean bool;
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (zArr[i4]) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            boolArr[i4] = bool;
        }
        return boolArr;
    }

    @androidx.annotation.P
    public static int[] t(@androidx.annotation.P int[] iArr, @androidx.annotation.P int[] iArr2) {
        return (int[]) u1(iArr, iArr2);
    }

    public static int t0(@androidx.annotation.P byte[] bArr, byte b4) {
        return u0(bArr, b4, 0);
    }

    @androidx.annotation.P
    private static Object t1(@androidx.annotation.P Object obj, int i4, @androidx.annotation.P Object obj2, Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int s02 = s0(obj);
        int s03 = s0(obj2);
        if (s02 == 0) {
            if (i4 == 0) {
                return w1(obj2);
            }
            throw new IndexOutOfBoundsException("Index: " + i4 + ", array1 Length: 0");
        }
        if (s03 == 0) {
            return w1(obj);
        }
        if (i4 <= s02 && i4 >= 0) {
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), s02 + s03);
            if (i4 == s02) {
                System.arraycopy(obj, 0, newInstance, 0, s02);
                System.arraycopy(obj2, 0, newInstance, s02, s03);
            } else if (i4 == 0) {
                System.arraycopy(obj2, 0, newInstance, 0, s03);
                System.arraycopy(obj, 0, newInstance, s03, s02);
            } else {
                System.arraycopy(obj, 0, newInstance, 0, i4);
                System.arraycopy(obj2, 0, newInstance, i4, s03);
                System.arraycopy(obj, i4, newInstance, s03 + i4, s02 - i4);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", array1 Length: " + s02);
    }

    @androidx.annotation.P
    public static Byte[] t2(@androidx.annotation.P byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr2[i4] = new Byte(bArr[i4]);
        }
        return bArr2;
    }

    @androidx.annotation.N
    public static long[] u(@androidx.annotation.P long[] jArr, int i4, long j4) {
        return (long[]) s1(jArr, i4, Long.valueOf(j4), Long.TYPE);
    }

    public static int u0(@androidx.annotation.P byte[] bArr, byte b4, int i4) {
        if (bArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < bArr.length) {
            if (b4 == bArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private static Object u1(@androidx.annotation.P Object obj, @androidx.annotation.P Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return w1(obj2);
        }
        if (obj2 == null) {
            return w1(obj);
        }
        int s02 = s0(obj);
        int s03 = s0(obj2);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), s02 + s03);
        System.arraycopy(obj, 0, newInstance, 0, s02);
        System.arraycopy(obj2, 0, newInstance, s02, s03);
        return newInstance;
    }

    @androidx.annotation.P
    public static Character[] u2(@androidx.annotation.P char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int i4 = 0; i4 < cArr.length; i4++) {
            chArr[i4] = new Character(cArr[i4]);
        }
        return chArr;
    }

    @androidx.annotation.P
    public static long[] v(@androidx.annotation.P long[] jArr, int i4, @androidx.annotation.P long[] jArr2) {
        Object t12 = t1(jArr, i4, jArr2, Long.TYPE);
        if (t12 == null) {
            return null;
        }
        return (long[]) t12;
    }

    public static int v0(@androidx.annotation.P char[] cArr, char c4) {
        return w0(cArr, c4, 0);
    }

    @androidx.annotation.N
    private static Object v1(@androidx.annotation.P Object obj, @androidx.annotation.P Object obj2, Class cls) {
        Object newInstance;
        int i4 = 0;
        if (obj != null) {
            int s02 = s0(obj);
            newInstance = Array.newInstance(obj.getClass().getComponentType(), s02 + 1);
            System.arraycopy(obj, 0, newInstance, 0, s02);
            i4 = s02;
        } else {
            newInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(newInstance, i4, obj2);
        return newInstance;
    }

    @androidx.annotation.P
    public static Double[] v2(@androidx.annotation.P double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            dArr2[i4] = new Double(dArr[i4]);
        }
        return dArr2;
    }

    @androidx.annotation.N
    public static long[] w(@androidx.annotation.P long[] jArr, long j4) {
        return (long[]) v1(jArr, Long.valueOf(j4), Long.TYPE);
    }

    public static int w0(@androidx.annotation.P char[] cArr, char c4, int i4) {
        if (cArr == null) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < cArr.length) {
            if (c4 == cArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    private static Object w1(@androidx.annotation.P Object obj) {
        if (obj == null) {
            return null;
        }
        return x1(obj, 0, s0(obj));
    }

    @androidx.annotation.P
    public static Float[] w2(@androidx.annotation.P float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            fArr2[i4] = new Float(fArr[i4]);
        }
        return fArr2;
    }

    @androidx.annotation.P
    public static long[] x(@androidx.annotation.P long[] jArr, @androidx.annotation.P long[] jArr2) {
        return (long[]) u1(jArr, jArr2);
    }

    public static int x0(@androidx.annotation.P double[] dArr, double d4) {
        return z0(dArr, d4, 0);
    }

    @androidx.annotation.P
    private static Object x1(@androidx.annotation.P Object obj, int i4, int i5) {
        if (obj == null) {
            return null;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int s02 = s0(obj);
        if (i5 > s02) {
            i5 = s02;
        }
        int i6 = i5 - i4;
        Class<?> componentType = obj.getClass().getComponentType();
        if (i6 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object newInstance = Array.newInstance(componentType, i6);
        System.arraycopy(obj, i4, newInstance, 0, i6);
        return newInstance;
    }

    @androidx.annotation.P
    public static Integer[] x2(@androidx.annotation.P int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i4] = new Integer(iArr[i4]);
        }
        return numArr;
    }

    @androidx.annotation.N
    public static <T> T[] y(@androidx.annotation.P T[] tArr, int i4, @androidx.annotation.P T t3) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t3 != null) {
            cls = t3.getClass();
        } else {
            return (T[]) new Object[]{null};
        }
        return (T[]) ((Object[]) s1(tArr, i4, t3, cls));
    }

    public static int y0(@androidx.annotation.P double[] dArr, double d4, double d5) {
        return A0(dArr, d4, 0, d5);
    }

    @androidx.annotation.N
    private static Object y1(@androidx.annotation.N Object obj, int i4) {
        int s02 = s0(obj);
        if (i4 >= 0 && i4 < s02) {
            int i5 = s02 - 1;
            Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i5);
            System.arraycopy(obj, 0, newInstance, 0, i4);
            if (i4 < i5) {
                System.arraycopy(obj, i4 + 1, newInstance, i4, (s02 - i4) - 1);
            }
            return newInstance;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Length: " + s02);
    }

    @androidx.annotation.P
    public static Long[] y2(@androidx.annotation.P long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i4] = new Long(jArr[i4]);
        }
        return lArr;
    }

    @androidx.annotation.P
    public static <T> T[] z(@androidx.annotation.P T[] tArr, int i4, @androidx.annotation.P T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (tArr2 != null) {
            componentType = tArr2.getClass().getComponentType();
        } else {
            return null;
        }
        return (T[]) ((Object[]) t1(tArr, i4, tArr2, componentType));
    }

    public static int z0(@androidx.annotation.P double[] dArr, double d4, int i4) {
        if (N0(dArr)) {
            return -1;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < dArr.length) {
            if (d4 == dArr[i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @androidx.annotation.P
    public static byte[] z1(@androidx.annotation.P byte[] bArr, int i4) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) y1(bArr, i4);
    }

    @androidx.annotation.P
    public static Short[] z2(@androidx.annotation.P short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int i4 = 0; i4 < sArr.length; i4++) {
            shArr[i4] = new Short(sArr[i4]);
        }
        return shArr;
    }
}

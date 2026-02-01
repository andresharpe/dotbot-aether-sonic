package com.google.android.gms.common.util;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@I0.a
@D
/* renamed from: com.google.android.gms.common.util.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301b {
    private C1301b() {
    }

    @I0.a
    @N
    public static <T> T[] a(@N T[]... tArr) {
        if (tArr.length != 0) {
            int i4 = 0;
            for (T[] tArr2 : tArr) {
                i4 += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i4);
            int length = tArr[0].length;
            for (int i5 = 1; i5 < tArr.length; i5++) {
                T[] tArr4 = tArr[i5];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    @I0.a
    @N
    public static byte[] b(@N byte[]... bArr) {
        if (bArr.length != 0) {
            int i4 = 0;
            for (byte[] bArr2 : bArr) {
                i4 += bArr2.length;
            }
            byte[] copyOf = Arrays.copyOf(bArr[0], i4);
            int length = bArr[0].length;
            for (int i5 = 1; i5 < bArr.length; i5++) {
                byte[] bArr3 = bArr[i5];
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return new byte[0];
    }

    @I0.a
    public static boolean c(@N int[] iArr, int i4) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    @I0.a
    public static <T> boolean d(@N T[] tArr, @N T t3) {
        int i4;
        if (tArr != null) {
            i4 = tArr.length;
        } else {
            i4 = 0;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            if (C1281w.b(tArr[i5], t3)) {
                if (i5 >= 0) {
                    return true;
                }
            } else {
                i5++;
            }
        }
        return false;
    }

    @I0.a
    @N
    public static <T> ArrayList<T> e() {
        return new ArrayList<>();
    }

    @P
    @I0.a
    public static <T> T[] f(@N T[] tArr, @N T... tArr2) {
        int length;
        int i4;
        if (tArr == null) {
            return null;
        }
        if (tArr2 != null && (length = tArr2.length) != 0) {
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
            if (length == 1) {
                i4 = 0;
                for (T t3 : tArr) {
                    if (!C1281w.b(tArr2[0], t3)) {
                        tArr3[i4] = t3;
                        i4++;
                    }
                }
            } else {
                int i5 = 0;
                for (T t4 : tArr) {
                    if (!d(tArr2, t4)) {
                        tArr3[i5] = t4;
                        i5++;
                    }
                }
                i4 = i5;
            }
            if (tArr3 == null) {
                return null;
            }
            if (i4 == tArr3.length) {
                return tArr3;
            }
            return (T[]) Arrays.copyOf(tArr3, i4);
        }
        return (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    @I0.a
    @N
    public static <T> ArrayList<T> g(@N T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t3 : tArr) {
            arrayList.add(t3);
        }
        return arrayList;
    }

    @I0.a
    @N
    public static int[] h(@N Collection<Integer> collection) {
        int i4 = 0;
        if (collection != null && !collection.isEmpty()) {
            int[] iArr = new int[collection.size()];
            Iterator<Integer> it = collection.iterator();
            while (it.hasNext()) {
                iArr[i4] = it.next().intValue();
                i4++;
            }
            return iArr;
        }
        return new int[0];
    }

    @P
    @I0.a
    public static Integer[] i(@N int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i4 = 0; i4 < length; i4++) {
            numArr[i4] = Integer.valueOf(iArr[i4]);
        }
        return numArr;
    }

    @I0.a
    public static void j(@N StringBuilder sb, @N double[] dArr) {
        int length = dArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i4]));
        }
    }

    @I0.a
    public static void k(@N StringBuilder sb, @N float[] fArr) {
        int length = fArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i4]));
        }
    }

    @I0.a
    public static void l(@N StringBuilder sb, @N int[] iArr) {
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i4]));
        }
    }

    @I0.a
    public static void m(@N StringBuilder sb, @N long[] jArr) {
        int length = jArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i4]));
        }
    }

    @I0.a
    public static <T> void n(@N StringBuilder sb, @N T[] tArr) {
        int length = tArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(tArr[i4]);
        }
    }

    @I0.a
    public static void o(@N StringBuilder sb, @N boolean[] zArr) {
        int length = zArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i4]));
        }
    }

    @I0.a
    public static void p(@N StringBuilder sb, @N String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i4]);
            sb.append("\"");
        }
    }
}

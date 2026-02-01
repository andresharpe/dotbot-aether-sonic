package K0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.annotation.N;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public class b {
    private b() {
    }

    public static void A(@N Parcel parcel, int i4, @N SparseArray<Float> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeFloat(sparseArray.valueAt(i5).floatValue());
        }
        g0(parcel, f02);
    }

    public static void B(@N Parcel parcel, int i4, @N IBinder iBinder, boolean z3) {
        if (iBinder == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            g0(parcel, f02);
        }
    }

    public static void C(@N Parcel parcel, int i4, @N IBinder[] iBinderArr, boolean z3) {
        if (iBinderArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeBinderArray(iBinderArr);
            g0(parcel, f02);
        }
    }

    public static void D(@N Parcel parcel, int i4, @N List<IBinder> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeBinderList(list);
            g0(parcel, f02);
        }
    }

    public static void E(@N Parcel parcel, int i4, @N SparseArray<IBinder> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeStrongBinder(sparseArray.valueAt(i5));
        }
        g0(parcel, f02);
    }

    public static void F(@N Parcel parcel, int i4, int i5) {
        h0(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void G(@N Parcel parcel, int i4, @N int[] iArr, boolean z3) {
        if (iArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeIntArray(iArr);
            g0(parcel, f02);
        }
    }

    public static void H(@N Parcel parcel, int i4, @N List<Integer> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).intValue());
        }
        g0(parcel, f02);
    }

    public static void I(@N Parcel parcel, int i4, @N Integer num, boolean z3) {
        if (num == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            h0(parcel, i4, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void J(@N Parcel parcel, int i4, @N List list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeList(list);
            g0(parcel, f02);
        }
    }

    public static void K(@N Parcel parcel, int i4, long j4) {
        h0(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void L(@N Parcel parcel, int i4, @N long[] jArr, boolean z3) {
        if (jArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeLongArray(jArr);
            g0(parcel, f02);
        }
    }

    public static void M(@N Parcel parcel, int i4, @N List<Long> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeLong(list.get(i5).longValue());
        }
        g0(parcel, f02);
    }

    public static void N(@N Parcel parcel, int i4, @N Long l4, boolean z3) {
        if (l4 == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            h0(parcel, i4, 8);
            parcel.writeLong(l4.longValue());
        }
    }

    public static void O(@N Parcel parcel, int i4, @N Parcel parcel2, boolean z3) {
        if (parcel2 == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            g0(parcel, f02);
        }
    }

    public static void P(@N Parcel parcel, int i4, @N Parcel[] parcelArr, boolean z3) {
        if (parcelArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f02);
    }

    public static void Q(@N Parcel parcel, int i4, @N List<Parcel> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcel parcel2 = list.get(i5);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f02);
    }

    public static void R(@N Parcel parcel, int i4, @N SparseArray<Parcel> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            Parcel valueAt = sparseArray.valueAt(i5);
            if (valueAt != null) {
                parcel.writeInt(valueAt.dataSize());
                parcel.appendFrom(valueAt, 0, valueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        g0(parcel, f02);
    }

    public static void S(@N Parcel parcel, int i4, @N Parcelable parcelable, int i5, boolean z3) {
        if (parcelable == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            g0(parcel, f02);
        }
    }

    public static void T(@N Parcel parcel, int i4, @N PendingIntent pendingIntent, boolean z3) {
        if (pendingIntent == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            g0(parcel, f02);
        }
    }

    public static void U(@N Parcel parcel, int i4, short s4) {
        h0(parcel, i4, 4);
        parcel.writeInt(s4);
    }

    public static void V(@N Parcel parcel, int i4, @N SparseBooleanArray sparseBooleanArray, boolean z3) {
        if (sparseBooleanArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            g0(parcel, f02);
        }
    }

    public static void W(@N Parcel parcel, int i4, @N SparseIntArray sparseIntArray, boolean z3) {
        if (sparseIntArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseIntArray.keyAt(i5));
            parcel.writeInt(sparseIntArray.valueAt(i5));
        }
        g0(parcel, f02);
    }

    public static void X(@N Parcel parcel, int i4, @N SparseLongArray sparseLongArray, boolean z3) {
        if (sparseLongArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseLongArray.keyAt(i5));
            parcel.writeLong(sparseLongArray.valueAt(i5));
        }
        g0(parcel, f02);
    }

    public static void Y(@N Parcel parcel, int i4, @N String str, boolean z3) {
        if (str == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeString(str);
            g0(parcel, f02);
        }
    }

    public static void Z(@N Parcel parcel, int i4, @N String[] strArr, boolean z3) {
        if (strArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeStringArray(strArr);
            g0(parcel, f02);
        }
    }

    public static int a(@N Parcel parcel) {
        return f0(parcel, 20293);
    }

    public static void a0(@N Parcel parcel, int i4, @N List<String> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeStringList(list);
            g0(parcel, f02);
        }
    }

    public static void b(@N Parcel parcel, int i4) {
        g0(parcel, i4);
    }

    public static void b0(@N Parcel parcel, int i4, @N SparseArray<String> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeString(sparseArray.valueAt(i5));
        }
        g0(parcel, f02);
    }

    public static void c(@N Parcel parcel, int i4, @N BigDecimal bigDecimal, boolean z3) {
        if (bigDecimal == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            g0(parcel, f02);
        }
    }

    public static <T extends Parcelable> void c0(@N Parcel parcel, int i4, @N T[] tArr, int i5, boolean z3) {
        if (tArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        parcel.writeInt(tArr.length);
        for (T t3 : tArr) {
            if (t3 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t3, i5);
            }
        }
        g0(parcel, f02);
    }

    public static void d(@N Parcel parcel, int i4, @N BigDecimal[] bigDecimalArr, boolean z3) {
        if (bigDecimalArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            parcel.writeByteArray(bigDecimalArr[i5].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i5].scale());
        }
        g0(parcel, f02);
    }

    public static <T extends Parcelable> void d0(@N Parcel parcel, int i4, @N List<T> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            T t3 = list.get(i5);
            if (t3 == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, t3, 0);
            }
        }
        g0(parcel, f02);
    }

    public static void e(@N Parcel parcel, int i4, @N BigInteger bigInteger, boolean z3) {
        if (bigInteger == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeByteArray(bigInteger.toByteArray());
            g0(parcel, f02);
        }
    }

    public static <T extends Parcelable> void e0(@N Parcel parcel, int i4, @N SparseArray<T> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            T valueAt = sparseArray.valueAt(i5);
            if (valueAt == null) {
                parcel.writeInt(0);
            } else {
                i0(parcel, valueAt, 0);
            }
        }
        g0(parcel, f02);
    }

    public static void f(@N Parcel parcel, int i4, @N BigInteger[] bigIntegerArr, boolean z3) {
        if (bigIntegerArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        g0(parcel, f02);
    }

    private static int f0(Parcel parcel, int i4) {
        parcel.writeInt(i4 | InterfaceMenuC2377a.f55290c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(@N Parcel parcel, int i4, boolean z3) {
        h0(parcel, i4, 4);
        parcel.writeInt(z3 ? 1 : 0);
    }

    private static void g0(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void h(@N Parcel parcel, int i4, @N boolean[] zArr, boolean z3) {
        if (zArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeBooleanArray(zArr);
            g0(parcel, f02);
        }
    }

    private static void h0(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static void i(@N Parcel parcel, int i4, @N List<Boolean> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).booleanValue() ? 1 : 0);
        }
        g0(parcel, f02);
    }

    private static void i0(Parcel parcel, Parcelable parcelable, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i4);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void j(@N Parcel parcel, int i4, @N Boolean bool, boolean z3) {
        if (bool == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            h0(parcel, i4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void k(@N Parcel parcel, int i4, @N Bundle bundle, boolean z3) {
        if (bundle == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeBundle(bundle);
            g0(parcel, f02);
        }
    }

    public static void l(@N Parcel parcel, int i4, byte b4) {
        h0(parcel, i4, 4);
        parcel.writeInt(b4);
    }

    public static void m(@N Parcel parcel, int i4, @N byte[] bArr, boolean z3) {
        if (bArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeByteArray(bArr);
            g0(parcel, f02);
        }
    }

    public static void n(@N Parcel parcel, int i4, @N byte[][] bArr, boolean z3) {
        if (bArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        g0(parcel, f02);
    }

    public static void o(@N Parcel parcel, int i4, @N SparseArray<byte[]> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeByteArray(sparseArray.valueAt(i5));
        }
        g0(parcel, f02);
    }

    public static void p(@N Parcel parcel, int i4, char c4) {
        h0(parcel, i4, 4);
        parcel.writeInt(c4);
    }

    public static void q(@N Parcel parcel, int i4, @N char[] cArr, boolean z3) {
        if (cArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeCharArray(cArr);
            g0(parcel, f02);
        }
    }

    public static void r(@N Parcel parcel, int i4, double d4) {
        h0(parcel, i4, 8);
        parcel.writeDouble(d4);
    }

    public static void s(@N Parcel parcel, int i4, @N double[] dArr, boolean z3) {
        if (dArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeDoubleArray(dArr);
            g0(parcel, f02);
        }
    }

    public static void t(@N Parcel parcel, int i4, @N List<Double> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeDouble(list.get(i5).doubleValue());
        }
        g0(parcel, f02);
    }

    public static void u(@N Parcel parcel, int i4, @N Double d4, boolean z3) {
        if (d4 == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            h0(parcel, i4, 8);
            parcel.writeDouble(d4.doubleValue());
        }
    }

    public static void v(@N Parcel parcel, int i4, @N SparseArray<Double> sparseArray, boolean z3) {
        if (sparseArray == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeDouble(sparseArray.valueAt(i5).doubleValue());
        }
        g0(parcel, f02);
    }

    public static void w(@N Parcel parcel, int i4, float f4) {
        h0(parcel, i4, 4);
        parcel.writeFloat(f4);
    }

    public static void x(@N Parcel parcel, int i4, @N float[] fArr, boolean z3) {
        if (fArr == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            int f02 = f0(parcel, i4);
            parcel.writeFloatArray(fArr);
            g0(parcel, f02);
        }
    }

    public static void y(@N Parcel parcel, int i4, @N List<Float> list, boolean z3) {
        if (list == null) {
            if (z3) {
                h0(parcel, i4, 0);
                return;
            }
            return;
        }
        int f02 = f0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeFloat(list.get(i5).floatValue());
        }
        g0(parcel, f02);
    }

    public static void z(@N Parcel parcel, int i4, @N Float f4, boolean z3) {
        if (f4 == null) {
            if (z3) {
                h0(parcel, i4, 0);
            }
        } else {
            h0(parcel, i4, 4);
            parcel.writeFloat(f4.floatValue());
        }
    }
}

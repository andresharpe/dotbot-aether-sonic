package com.google.android.gms.common.internal.safeparcel;

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
import java.util.ArrayList;
import java.util.List;
import o.InterfaceMenuC2377a;

/* loaded from: classes.dex */
public class SafeParcelReader {

    /* loaded from: classes.dex */
    public static class ParseException extends RuntimeException {
        public ParseException(@N String str, @N Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    @N
    public static ArrayList<Parcel> A(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add(null);
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @N
    public static SparseArray<Parcel> B(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, null);
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @N
    public static <T extends Parcelable> T C(@N Parcel parcel, int i4, @N Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g02);
        return createFromParcel;
    }

    @N
    public static SparseBooleanArray D(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + g02);
        return readSparseBooleanArray;
    }

    @N
    public static SparseIntArray E(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseIntArray;
    }

    @N
    public static SparseLongArray F(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseLongArray;
    }

    @N
    public static String G(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g02);
        return readString;
    }

    @N
    public static String[] H(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g02);
        return createStringArray;
    }

    @N
    public static ArrayList<String> I(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g02);
        return createStringArrayList;
    }

    @N
    public static SparseArray<String> J(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @N
    public static <T> T[] K(@N Parcel parcel, int i4, @N Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g02);
        return tArr;
    }

    @N
    public static <T> ArrayList<T> L(@N Parcel parcel, int i4, @N Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g02);
        return createTypedArrayList;
    }

    @N
    public static <T> SparseArray<T> M(@N Parcel parcel, int i4, @N Parcelable.Creator<T> creator) {
        T t3;
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                t3 = creator.createFromParcel(parcel);
            } else {
                t3 = null;
            }
            sparseArray.append(readInt2, t3);
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    public static void N(@N Parcel parcel, int i4) {
        if (parcel.dataPosition() == i4) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i4, parcel);
    }

    public static int O(int i4) {
        return (char) i4;
    }

    public static boolean P(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    @N
    public static Boolean Q(@N Parcel parcel, int i4) {
        boolean z3;
        int g02 = g0(parcel, i4);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i4, g02, 4);
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    public static byte R(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        return (byte) parcel.readInt();
    }

    public static char S(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        return (char) parcel.readInt();
    }

    public static double T(@N Parcel parcel, int i4) {
        k0(parcel, i4, 8);
        return parcel.readDouble();
    }

    @N
    public static Double U(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i4, g02, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float V(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        return parcel.readFloat();
    }

    @N
    public static Float W(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i4, g02, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int X(@N Parcel parcel) {
        return parcel.readInt();
    }

    @N
    public static IBinder Y(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g02);
        return readStrongBinder;
    }

    public static int Z(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        return parcel.readInt();
    }

    @N
    public static BigDecimal a(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + g02);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @N
    public static Integer a0(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i4, g02, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @N
    public static BigDecimal[] b(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i5] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g02);
        return bigDecimalArr;
    }

    public static void b0(@N Parcel parcel, int i4, @N List list, @N ClassLoader classLoader) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + g02);
    }

    @N
    public static BigInteger c(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g02);
        return new BigInteger(createByteArray);
    }

    public static long c0(@N Parcel parcel, int i4) {
        k0(parcel, i4, 8);
        return parcel.readLong();
    }

    @N
    public static BigInteger[] d(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            bigIntegerArr[i5] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g02);
        return bigIntegerArr;
    }

    @N
    public static Long d0(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i4, g02, 8);
        return Long.valueOf(parcel.readLong());
    }

    @N
    public static boolean[] e(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + g02);
        return createBooleanArray;
    }

    @N
    public static PendingIntent e0(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g02);
        return readPendingIntentOrNullFromParcel;
    }

    @N
    public static ArrayList<Boolean> f(@N Parcel parcel, int i4) {
        boolean z3;
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList.add(Boolean.valueOf(z3));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    public static short f0(@N Parcel parcel, int i4) {
        k0(parcel, i4, 4);
        return (short) parcel.readInt();
    }

    @N
    public static Bundle g(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g02);
        return readBundle;
    }

    public static int g0(@N Parcel parcel, int i4) {
        if ((i4 & InterfaceMenuC2377a.f55290c) != -65536) {
            return (char) (i4 >> 16);
        }
        return parcel.readInt();
    }

    @N
    public static byte[] h(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g02);
        return createByteArray;
    }

    public static void h0(@N Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + g0(parcel, i4));
    }

    @N
    public static byte[][] i(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            bArr[i5] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g02);
        return bArr;
    }

    public static int i0(@N Parcel parcel) {
        int X3 = X(parcel);
        int g02 = g0(parcel, X3);
        int dataPosition = parcel.dataPosition();
        if (O(X3) == 20293) {
            int i4 = g02 + dataPosition;
            if (i4 >= dataPosition && i4 <= parcel.dataSize()) {
                return i4;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i4, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(X3))), parcel);
    }

    @N
    public static SparseArray<byte[]> j(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    private static void j0(Parcel parcel, int i4, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        throw new ParseException("Expected size " + i6 + " got " + i5 + " (0x" + Integer.toHexString(i5) + ")", parcel);
    }

    @N
    public static char[] k(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + g02);
        return createCharArray;
    }

    private static void k0(Parcel parcel, int i4, int i5) {
        int g02 = g0(parcel, i4);
        if (g02 == i5) {
            return;
        }
        throw new ParseException("Expected size " + i5 + " got " + g02 + " (0x" + Integer.toHexString(g02) + ")", parcel);
    }

    @N
    public static double[] l(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + g02);
        return createDoubleArray;
    }

    @N
    public static ArrayList<Double> m(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @N
    public static SparseArray<Double> n(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @N
    public static float[] o(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + g02);
        return createFloatArray;
    }

    @N
    public static ArrayList<Float> p(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @N
    public static SparseArray<Float> q(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @N
    public static IBinder[] r(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + g02);
        return createBinderArray;
    }

    @N
    public static ArrayList<IBinder> s(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + g02);
        return createBinderArrayList;
    }

    @N
    public static SparseArray<IBinder> t(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i5 = 0; i5 < readInt; i5++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @N
    public static int[] u(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g02);
        return createIntArray;
    }

    @N
    public static ArrayList<Integer> v(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @N
    public static long[] w(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g02);
        return createLongArray;
    }

    @N
    public static ArrayList<Long> x(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i5 = 0; i5 < readInt; i5++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @N
    public static Parcel y(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, g02);
        parcel.setDataPosition(dataPosition + g02);
        return obtain;
    }

    @N
    public static Parcel[] z(@N Parcel parcel, int i4) {
        int g02 = g0(parcel, i4);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i5] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i5] = null;
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return parcelArr;
    }
}

package K0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.C1302c;
import com.google.android.gms.common.util.D;
import com.google.android.gms.internal.common.zzag;
import java.util.ArrayList;
import java.util.Iterator;

@I0.a
@D
/* loaded from: classes.dex */
public final class d {
    private d() {
    }

    @I0.a
    @N
    public static <T extends c> T a(@N byte[] bArr, @N Parcelable.Creator<T> creator) {
        C1285y.l(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    @P
    @I0.a
    public static <T extends c> T b(@N Intent intent, @N String str, @N Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    @I0.a
    @N
    public static <T extends c> T c(@N String str, @N Parcelable.Creator<T> creator) {
        return (T) a(C1302c.b(str), creator);
    }

    @P
    @Deprecated
    public static <T extends c> ArrayList<T> d(@N Bundle bundle, @N String str, @N Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) bundle.getSerializable(str);
        if (arrayList == null) {
            return null;
        }
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            listWithAutoConstructFlag.add(a((byte[]) arrayList.get(i4), creator));
        }
        return listWithAutoConstructFlag;
    }

    @P
    @I0.a
    public static <T extends c> ArrayList<T> e(@N Bundle bundle, @N String str, @N Parcelable.Creator<T> creator) {
        return f(bundle.getByteArray(str), creator);
    }

    @P
    public static <T extends c> ArrayList<T> f(@P byte[] bArr, @N Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, length);
        obtain.setDataPosition(0);
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            obtain.readTypedList(arrayList, creator);
            return arrayList;
        } finally {
            obtain.recycle();
        }
    }

    @P
    @I0.a
    @Deprecated
    public static <T extends c> ArrayList<T> g(@N Intent intent, @N String str, @N Parcelable.Creator<T> creator) {
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(str);
        if (arrayList == null) {
            return null;
        }
        ListWithAutoConstructFlag listWithAutoConstructFlag = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            listWithAutoConstructFlag.add(a((byte[]) arrayList.get(i4), creator));
        }
        return listWithAutoConstructFlag;
    }

    @P
    @I0.a
    public static <T extends c> ArrayList<T> h(@N Intent intent, @N String str, @N Parcelable.Creator<T> creator) {
        return f(intent.getByteArrayExtra(str), creator);
    }

    @Deprecated
    public static <T extends c> void i(@N Iterable<T> iterable, @N Bundle bundle, @N String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m(it.next()));
        }
        bundle.putSerializable(str, arrayList);
    }

    public static <T extends c> void j(@N Iterable<T> iterable, @N Bundle bundle, @N String str) {
        bundle.putByteArray(str, p(iterable));
    }

    @I0.a
    @Deprecated
    public static <T extends c> void k(@N Iterable<T> iterable, @N Intent intent, @N String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m(it.next()));
        }
        intent.putExtra(str, arrayList);
    }

    @I0.a
    public static <T extends c> void l(@N Iterable<T> iterable, @N Intent intent, @N String str) {
        intent.putExtra(str, p(iterable));
    }

    @I0.a
    @N
    public static <T extends c> byte[] m(@N T t3) {
        Parcel obtain = Parcel.obtain();
        t3.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @I0.a
    public static <T extends c> void n(@N T t3, @N Intent intent, @N String str) {
        intent.putExtra(str, m(t3));
    }

    @I0.a
    @N
    public static <T extends c> String o(@N T t3) {
        return C1302c.e(m(t3));
    }

    private static byte[] p(Iterable iterable) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeTypedList(zzag.n(iterable));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }
}

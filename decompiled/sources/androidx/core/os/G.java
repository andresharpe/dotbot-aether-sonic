package androidx.core.os;

import android.os.Parcel;

@Deprecated
/* loaded from: classes.dex */
public interface G<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i4);
}

package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class n extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* loaded from: classes2.dex */
    class a implements Parcelable.ClassLoaderCreator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @P
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(@N Parcel parcel) {
            return new n(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
            return new n(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i4) {
            return new n[i4];
        }
    }

    public n() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = keyAt(i5);
            parcelableArr[i5] = valueAt(i5);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i4);
    }

    public n(@N Parcel parcel, @P ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i4 = 0; i4 < readInt; i4++) {
            put(iArr[i4], readParcelableArray[i4]);
        }
    }
}

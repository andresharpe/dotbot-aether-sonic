package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class o extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(@N Parcel parcel) {
            int readInt = parcel.readInt();
            o oVar = new o(readInt);
            int[] iArr = new int[readInt];
            boolean[] zArr = new boolean[readInt];
            parcel.readIntArray(iArr);
            parcel.readBooleanArray(zArr);
            for (int i4 = 0; i4 < readInt; i4++) {
                oVar.put(iArr[i4], zArr[i4]);
            }
            return oVar;
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i4) {
            return new o[i4];
        }
    }

    public o() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int[] iArr = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int i5 = 0; i5 < size(); i5++) {
            iArr[i5] = keyAt(i5);
            zArr[i5] = valueAt(i5);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeBooleanArray(zArr);
    }

    public o(int i4) {
        super(i4);
    }

    public o(@N SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int i4 = 0; i4 < sparseBooleanArray.size(); i4++) {
            put(sparseBooleanArray.keyAt(i4), sparseBooleanArray.valueAt(i4));
        }
    }
}

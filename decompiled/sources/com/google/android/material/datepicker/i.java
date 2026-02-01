package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class i implements a.c {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    private final long f32216E;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(@N Parcel parcel) {
            return new i(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i4) {
            return new i[i4];
        }
    }

    /* synthetic */ i(long j4, a aVar) {
        this(j4);
    }

    @N
    public static i a(long j4) {
        return new i(j4);
    }

    @N
    public static i b() {
        return a(v.t().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean D(long j4) {
        if (j4 >= this.f32216E) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && this.f32216E == ((i) obj).f32216E) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32216E)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeLong(this.f32216E);
    }

    private i(long j4) {
        this.f32216E = j4;
    }
}

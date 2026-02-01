package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class h implements a.c {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    private final long f32215E;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(@N Parcel parcel) {
            return new h(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i4) {
            return new h[i4];
        }
    }

    /* synthetic */ h(long j4, a aVar) {
        this(j4);
    }

    @N
    public static h a(long j4) {
        return new h(j4);
    }

    @N
    public static h b() {
        return a(v.t().getTimeInMillis());
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean D(long j4) {
        if (j4 <= this.f32215E) {
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
        if ((obj instanceof h) && this.f32215E == ((h) obj).f32215E) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32215E)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeLong(this.f32215E);
    }

    private h(long j4) {
        this.f32215E = j4;
    }
}

package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements Comparable<m>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    @N
    private final Calendar f32226E;

    /* renamed from: F, reason: collision with root package name */
    final int f32227F;

    /* renamed from: G, reason: collision with root package name */
    final int f32228G;

    /* renamed from: H, reason: collision with root package name */
    final int f32229H;

    /* renamed from: I, reason: collision with root package name */
    final int f32230I;

    /* renamed from: J, reason: collision with root package name */
    final long f32231J;

    /* renamed from: K, reason: collision with root package name */
    @P
    private String f32232K;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(@N Parcel parcel) {
            return m.e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @N
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i4) {
            return new m[i4];
        }
    }

    private m(@N Calendar calendar) {
        calendar.set(5, 1);
        Calendar f4 = v.f(calendar);
        this.f32226E = f4;
        this.f32227F = f4.get(2);
        this.f32228G = f4.get(1);
        this.f32229H = f4.getMaximum(7);
        this.f32230I = f4.getActualMaximum(5);
        this.f32231J = f4.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static m e(int i4, int i5) {
        Calendar v3 = v.v();
        v3.set(1, i4);
        v3.set(2, i5);
        return new m(v3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static m g(long j4) {
        Calendar v3 = v.v();
        v3.setTimeInMillis(j4);
        return new m(v3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public static m i() {
        return new m(v.t());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@N m mVar) {
        return this.f32226E.compareTo(mVar.f32226E);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f32227F == mVar.f32227F && this.f32228G == mVar.f32228G) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32227F), Integer.valueOf(this.f32228G)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        int firstDayOfWeek = this.f32226E.get(7) - this.f32226E.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f32229H;
        }
        return firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m(int i4) {
        Calendar f4 = v.f(this.f32226E);
        f4.set(5, i4);
        return f4.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n(long j4) {
        Calendar f4 = v.f(this.f32226E);
        f4.setTimeInMillis(j4);
        return f4.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public String o() {
        if (this.f32232K == null) {
            this.f32232K = g.i(this.f32226E.getTimeInMillis());
        }
        return this.f32232K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long q() {
        return this.f32226E.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    public m r(int i4) {
        Calendar f4 = v.f(this.f32226E);
        f4.add(2, i4);
        return new m(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int s(@N m mVar) {
        if (this.f32226E instanceof GregorianCalendar) {
            return ((mVar.f32228G - this.f32228G) * 12) + (mVar.f32227F - this.f32227F);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeInt(this.f32228G);
        parcel.writeInt(this.f32227F);
    }
}

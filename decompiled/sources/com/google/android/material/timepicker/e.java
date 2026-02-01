package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.F;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: L, reason: collision with root package name */
    public static final String f33925L = "%02d";

    /* renamed from: M, reason: collision with root package name */
    public static final String f33926M = "%d";

    /* renamed from: E, reason: collision with root package name */
    private final b f33927E;

    /* renamed from: F, reason: collision with root package name */
    private final b f33928F;

    /* renamed from: G, reason: collision with root package name */
    final int f33929G;

    /* renamed from: H, reason: collision with root package name */
    int f33930H;

    /* renamed from: I, reason: collision with root package name */
    int f33931I;

    /* renamed from: J, reason: collision with root package name */
    int f33932J;

    /* renamed from: K, reason: collision with root package name */
    int f33933K;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i4) {
            return new e[i4];
        }
    }

    public e() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, f33925L);
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int g(int i4) {
        return i4 >= 12 ? 1 : 0;
    }

    public int c() {
        if (this.f33929G == 1) {
            return this.f33930H % 24;
        }
        int i4 = this.f33930H;
        if (i4 % 12 == 0) {
            return 12;
        }
        if (this.f33933K == 1) {
            return i4 - 12;
        }
        return i4;
    }

    public b d() {
        return this.f33928F;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e() {
        return this.f33927E;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f33930H == eVar.f33930H && this.f33931I == eVar.f33931I && this.f33929G == eVar.f33929G && this.f33932J == eVar.f33932J) {
            return true;
        }
        return false;
    }

    public void h(int i4) {
        if (this.f33929G == 1) {
            this.f33930H = i4;
            return;
        }
        int i5 = 12;
        int i6 = i4 % 12;
        if (this.f33933K != 1) {
            i5 = 0;
        }
        this.f33930H = i6 + i5;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f33929G), Integer.valueOf(this.f33930H), Integer.valueOf(this.f33931I), Integer.valueOf(this.f33932J)});
    }

    public void i(int i4) {
        this.f33933K = g(i4);
        this.f33930H = i4;
    }

    public void l(@F(from = 0, to = 59) int i4) {
        this.f33931I = i4 % 60;
    }

    public void m(int i4) {
        if (i4 != this.f33933K) {
            this.f33933K = i4;
            int i5 = this.f33930H;
            if (i5 < 12 && i4 == 1) {
                this.f33930H = i5 + 12;
            } else if (i5 >= 12 && i4 == 0) {
                this.f33930H = i5 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f33930H);
        parcel.writeInt(this.f33931I);
        parcel.writeInt(this.f33932J);
        parcel.writeInt(this.f33929G);
    }

    public e(int i4) {
        this(0, 0, 10, i4);
    }

    public e(int i4, int i5, int i6, int i7) {
        this.f33930H = i4;
        this.f33931I = i5;
        this.f33932J = i6;
        this.f33929G = i7;
        this.f33933K = g(i4);
        this.f33927E = new b(59);
        this.f33928F = new b(i7 == 1 ? 24 : 12);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

package com.google.android.material.badge;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.T;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.e0;
import androidx.annotation.k0;
import androidx.annotation.r;
import com.google.android.material.internal.w;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    private static final int f31402f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final String f31403g = "badge";

    /* renamed from: a, reason: collision with root package name */
    private final a f31404a;

    /* renamed from: b, reason: collision with root package name */
    private final a f31405b;

    /* renamed from: c, reason: collision with root package name */
    final float f31406c;

    /* renamed from: d, reason: collision with root package name */
    final float f31407d;

    /* renamed from: e, reason: collision with root package name */
    final float f31408e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, @k0 int i4, @InterfaceC0563f int i5, @d0 int i6, @P a aVar) {
        CharSequence charSequence;
        int i7;
        int i8;
        int i9;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        a aVar2 = new a();
        this.f31405b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i4 != 0) {
            aVar.f31411E = i4;
        }
        TypedArray b4 = b(context, aVar.f31411E, i5, i6);
        Resources resources = context.getResources();
        this.f31406c = b4.getDimensionPixelSize(a.o.Z3, resources.getDimensionPixelSize(a.f.Y5));
        this.f31408e = b4.getDimensionPixelSize(a.o.b4, resources.getDimensionPixelSize(a.f.X5));
        this.f31407d = b4.getDimensionPixelSize(a.o.c4, resources.getDimensionPixelSize(a.f.d6));
        aVar2.f31414H = aVar.f31414H == -2 ? 255 : aVar.f31414H;
        if (aVar.f31418L != null) {
            charSequence = aVar.f31418L;
        } else {
            charSequence = context.getString(a.m.f3038A0);
        }
        aVar2.f31418L = charSequence;
        if (aVar.f31419M != 0) {
            i7 = aVar.f31419M;
        } else {
            i7 = a.l.f3036a;
        }
        aVar2.f31419M = i7;
        if (aVar.f31420N != 0) {
            i8 = aVar.f31420N;
        } else {
            i8 = a.m.f3042C0;
        }
        aVar2.f31420N = i8;
        aVar2.f31422P = Boolean.valueOf(aVar.f31422P == null || aVar.f31422P.booleanValue());
        if (aVar.f31416J != -2) {
            i9 = aVar.f31416J;
        } else {
            i9 = b4.getInt(a.o.f4, 4);
        }
        aVar2.f31416J = i9;
        if (aVar.f31415I != -2) {
            aVar2.f31415I = aVar.f31415I;
        } else if (b4.hasValue(a.o.g4)) {
            aVar2.f31415I = b4.getInt(a.o.g4, 0);
        } else {
            aVar2.f31415I = -1;
        }
        if (aVar.f31412F != null) {
            intValue = aVar.f31412F.intValue();
        } else {
            intValue = v(context, b4, a.o.X3);
        }
        aVar2.f31412F = Integer.valueOf(intValue);
        if (aVar.f31413G != null) {
            aVar2.f31413G = aVar.f31413G;
        } else if (b4.hasValue(a.o.a4)) {
            aVar2.f31413G = Integer.valueOf(v(context, b4, a.o.a4));
        } else {
            aVar2.f31413G = Integer.valueOf(new com.google.android.material.resources.d(context, a.n.n8).i().getDefaultColor());
        }
        if (aVar.f31421O != null) {
            intValue2 = aVar.f31421O.intValue();
        } else {
            intValue2 = b4.getInt(a.o.Y3, 8388661);
        }
        aVar2.f31421O = Integer.valueOf(intValue2);
        if (aVar.f31423Q != null) {
            intValue3 = aVar.f31423Q.intValue();
        } else {
            intValue3 = b4.getDimensionPixelOffset(a.o.d4, 0);
        }
        aVar2.f31423Q = Integer.valueOf(intValue3);
        if (aVar.f31423Q != null) {
            intValue4 = aVar.f31424R.intValue();
        } else {
            intValue4 = b4.getDimensionPixelOffset(a.o.h4, 0);
        }
        aVar2.f31424R = Integer.valueOf(intValue4);
        if (aVar.f31425S != null) {
            intValue5 = aVar.f31425S.intValue();
        } else {
            intValue5 = b4.getDimensionPixelOffset(a.o.e4, aVar2.f31423Q.intValue());
        }
        aVar2.f31425S = Integer.valueOf(intValue5);
        if (aVar.f31426T != null) {
            intValue6 = aVar.f31426T.intValue();
        } else {
            intValue6 = b4.getDimensionPixelOffset(a.o.i4, aVar2.f31424R.intValue());
        }
        aVar2.f31426T = Integer.valueOf(intValue6);
        aVar2.f31427U = Integer.valueOf(aVar.f31427U == null ? 0 : aVar.f31427U.intValue());
        aVar2.f31428V = Integer.valueOf(aVar.f31428V != null ? aVar.f31428V.intValue() : 0);
        b4.recycle();
        if (aVar.f31417K == null) {
            aVar2.f31417K = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f31417K = aVar.f31417K;
        }
        this.f31404a = aVar;
    }

    private TypedArray b(Context context, @k0 int i4, @InterfaceC0563f int i5, @d0 int i6) {
        AttributeSet attributeSet;
        int i7;
        int i8;
        if (i4 != 0) {
            AttributeSet a4 = Y0.a.a(context, i4, f31403g);
            i7 = a4.getStyleAttribute();
            attributeSet = a4;
        } else {
            attributeSet = null;
            i7 = 0;
        }
        if (i7 == 0) {
            i8 = i6;
        } else {
            i8 = i7;
        }
        return w.j(context, attributeSet, a.o.W3, i5, i8, new int[0]);
    }

    private static int v(Context context, @N TypedArray typedArray, @e0 int i4) {
        return com.google.android.material.resources.c.a(context, typedArray, i4).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(int i4) {
        this.f31404a.f31421O = Integer.valueOf(i4);
        this.f31405b.f31421O = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(@InterfaceC0569l int i4) {
        this.f31404a.f31413G = Integer.valueOf(i4);
        this.f31405b.f31413G = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(@c0 int i4) {
        this.f31404a.f31420N = i4;
        this.f31405b.f31420N = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        this.f31404a.f31418L = charSequence;
        this.f31405b.f31418L = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(@T int i4) {
        this.f31404a.f31419M = i4;
        this.f31405b.f31419M = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(@r(unit = 1) int i4) {
        this.f31404a.f31425S = Integer.valueOf(i4);
        this.f31405b.f31425S = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(@r(unit = 1) int i4) {
        this.f31404a.f31423Q = Integer.valueOf(i4);
        this.f31405b.f31423Q = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i4) {
        this.f31404a.f31416J = i4;
        this.f31405b.f31416J = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(int i4) {
        this.f31404a.f31415I = i4;
        this.f31405b.f31415I = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(Locale locale) {
        this.f31404a.f31417K = locale;
        this.f31405b.f31417K = locale;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(@r(unit = 1) int i4) {
        this.f31404a.f31426T = Integer.valueOf(i4);
        this.f31405b.f31426T = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(@r(unit = 1) int i4) {
        this.f31404a.f31424R = Integer.valueOf(i4);
        this.f31405b.f31424R = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z3) {
        this.f31404a.f31422P = Boolean.valueOf(z3);
        this.f31405b.f31422P = Boolean.valueOf(z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        I(-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int c() {
        return this.f31405b.f31427U.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int d() {
        return this.f31405b.f31428V.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f31405b.f31414H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public int f() {
        return this.f31405b.f31412F.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f31405b.f31421O.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0569l
    public int h() {
        return this.f31405b.f31413G.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c0
    public int i() {
        return this.f31405b.f31420N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence j() {
        return this.f31405b.f31418L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @T
    public int k() {
        return this.f31405b.f31419M;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int l() {
        return this.f31405b.f31425S.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int m() {
        return this.f31405b.f31423Q.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f31405b.f31416J;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f31405b.f31415I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale p() {
        return this.f31405b.f31417K;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a q() {
        return this.f31404a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int r() {
        return this.f31405b.f31426T.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @r(unit = 1)
    public int s() {
        return this.f31405b.f31424R.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        if (this.f31405b.f31415I != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u() {
        return this.f31405b.f31422P.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(@r(unit = 1) int i4) {
        this.f31404a.f31427U = Integer.valueOf(i4);
        this.f31405b.f31427U = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(@r(unit = 1) int i4) {
        this.f31404a.f31428V = Integer.valueOf(i4);
        this.f31405b.f31428V = Integer.valueOf(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(int i4) {
        this.f31404a.f31414H = i4;
        this.f31405b.f31414H = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(@InterfaceC0569l int i4) {
        this.f31404a.f31412F = Integer.valueOf(i4);
        this.f31405b.f31412F = Integer.valueOf(i4);
    }

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0275a();

        /* renamed from: W, reason: collision with root package name */
        private static final int f31409W = -1;

        /* renamed from: X, reason: collision with root package name */
        private static final int f31410X = -2;

        /* renamed from: E, reason: collision with root package name */
        @k0
        private int f31411E;

        /* renamed from: F, reason: collision with root package name */
        @InterfaceC0569l
        private Integer f31412F;

        /* renamed from: G, reason: collision with root package name */
        @InterfaceC0569l
        private Integer f31413G;

        /* renamed from: H, reason: collision with root package name */
        private int f31414H;

        /* renamed from: I, reason: collision with root package name */
        private int f31415I;

        /* renamed from: J, reason: collision with root package name */
        private int f31416J;

        /* renamed from: K, reason: collision with root package name */
        private Locale f31417K;

        /* renamed from: L, reason: collision with root package name */
        @P
        private CharSequence f31418L;

        /* renamed from: M, reason: collision with root package name */
        @T
        private int f31419M;

        /* renamed from: N, reason: collision with root package name */
        @c0
        private int f31420N;

        /* renamed from: O, reason: collision with root package name */
        private Integer f31421O;

        /* renamed from: P, reason: collision with root package name */
        private Boolean f31422P;

        /* renamed from: Q, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31423Q;

        /* renamed from: R, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31424R;

        /* renamed from: S, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31425S;

        /* renamed from: T, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31426T;

        /* renamed from: U, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31427U;

        /* renamed from: V, reason: collision with root package name */
        @r(unit = 1)
        private Integer f31428V;

        /* renamed from: com.google.android.material.badge.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0275a implements Parcelable.Creator<a> {
            C0275a() {
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(@N Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @N
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i4) {
                return new a[i4];
            }
        }

        public a() {
            this.f31414H = 255;
            this.f31415I = -2;
            this.f31416J = -2;
            this.f31422P = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@N Parcel parcel, int i4) {
            String charSequence;
            parcel.writeInt(this.f31411E);
            parcel.writeSerializable(this.f31412F);
            parcel.writeSerializable(this.f31413G);
            parcel.writeInt(this.f31414H);
            parcel.writeInt(this.f31415I);
            parcel.writeInt(this.f31416J);
            CharSequence charSequence2 = this.f31418L;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.f31419M);
            parcel.writeSerializable(this.f31421O);
            parcel.writeSerializable(this.f31423Q);
            parcel.writeSerializable(this.f31424R);
            parcel.writeSerializable(this.f31425S);
            parcel.writeSerializable(this.f31426T);
            parcel.writeSerializable(this.f31427U);
            parcel.writeSerializable(this.f31428V);
            parcel.writeSerializable(this.f31422P);
            parcel.writeSerializable(this.f31417K);
        }

        a(@N Parcel parcel) {
            this.f31414H = 255;
            this.f31415I = -2;
            this.f31416J = -2;
            this.f31422P = Boolean.TRUE;
            this.f31411E = parcel.readInt();
            this.f31412F = (Integer) parcel.readSerializable();
            this.f31413G = (Integer) parcel.readSerializable();
            this.f31414H = parcel.readInt();
            this.f31415I = parcel.readInt();
            this.f31416J = parcel.readInt();
            this.f31418L = parcel.readString();
            this.f31419M = parcel.readInt();
            this.f31421O = (Integer) parcel.readSerializable();
            this.f31423Q = (Integer) parcel.readSerializable();
            this.f31424R = (Integer) parcel.readSerializable();
            this.f31425S = (Integer) parcel.readSerializable();
            this.f31426T = (Integer) parcel.readSerializable();
            this.f31427U = (Integer) parcel.readSerializable();
            this.f31428V = (Integer) parcel.readSerializable();
            this.f31422P = (Boolean) parcel.readSerializable();
            this.f31417K = (Locale) parcel.readSerializable();
        }
    }
}

package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    final String f14845E;

    /* renamed from: F, reason: collision with root package name */
    final String f14846F;

    /* renamed from: G, reason: collision with root package name */
    final boolean f14847G;

    /* renamed from: H, reason: collision with root package name */
    final int f14848H;

    /* renamed from: I, reason: collision with root package name */
    final int f14849I;

    /* renamed from: J, reason: collision with root package name */
    final String f14850J;

    /* renamed from: K, reason: collision with root package name */
    final boolean f14851K;

    /* renamed from: L, reason: collision with root package name */
    final boolean f14852L;

    /* renamed from: M, reason: collision with root package name */
    final boolean f14853M;

    /* renamed from: N, reason: collision with root package name */
    final Bundle f14854N;

    /* renamed from: O, reason: collision with root package name */
    final boolean f14855O;

    /* renamed from: P, reason: collision with root package name */
    final int f14856P;

    /* renamed from: Q, reason: collision with root package name */
    Bundle f14857Q;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<A> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A createFromParcel(Parcel parcel) {
            return new A(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public A[] newArray(int i4) {
            return new A[i4];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(Fragment fragment) {
        this.f14845E = fragment.getClass().getName();
        this.f14846F = fragment.f14997J;
        this.f14847G = fragment.f15006S;
        this.f14848H = fragment.f15015b0;
        this.f14849I = fragment.f15016c0;
        this.f14850J = fragment.f15017d0;
        this.f14851K = fragment.f15020g0;
        this.f14852L = fragment.f15004Q;
        this.f14853M = fragment.f15019f0;
        this.f14854N = fragment.f14998K;
        this.f14855O = fragment.f15018e0;
        this.f14856P = fragment.f15034u0.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.N
    public Fragment a(@androidx.annotation.N C0893k c0893k, @androidx.annotation.N ClassLoader classLoader) {
        Fragment a4 = c0893k.a(classLoader, this.f14845E);
        Bundle bundle = this.f14854N;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a4.setArguments(this.f14854N);
        a4.f14997J = this.f14846F;
        a4.f15006S = this.f14847G;
        a4.f15008U = true;
        a4.f15015b0 = this.f14848H;
        a4.f15016c0 = this.f14849I;
        a4.f15017d0 = this.f14850J;
        a4.f15020g0 = this.f14851K;
        a4.f15004Q = this.f14852L;
        a4.f15019f0 = this.f14853M;
        a4.f15018e0 = this.f14855O;
        a4.f15034u0 = Lifecycle.State.values()[this.f14856P];
        Bundle bundle2 = this.f14857Q;
        if (bundle2 != null) {
            a4.f14993F = bundle2;
        } else {
            a4.f14993F = new Bundle();
        }
        return a4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @androidx.annotation.N
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f14845E);
        sb.append(" (");
        sb.append(this.f14846F);
        sb.append(")}:");
        if (this.f14847G) {
            sb.append(" fromLayout");
        }
        if (this.f14849I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f14849I));
        }
        String str = this.f14850J;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f14850J);
        }
        if (this.f14851K) {
            sb.append(" retainInstance");
        }
        if (this.f14852L) {
            sb.append(" removing");
        }
        if (this.f14853M) {
            sb.append(" detached");
        }
        if (this.f14855O) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f14845E);
        parcel.writeString(this.f14846F);
        parcel.writeInt(this.f14847G ? 1 : 0);
        parcel.writeInt(this.f14848H);
        parcel.writeInt(this.f14849I);
        parcel.writeString(this.f14850J);
        parcel.writeInt(this.f14851K ? 1 : 0);
        parcel.writeInt(this.f14852L ? 1 : 0);
        parcel.writeInt(this.f14853M ? 1 : 0);
        parcel.writeBundle(this.f14854N);
        parcel.writeInt(this.f14855O ? 1 : 0);
        parcel.writeBundle(this.f14857Q);
        parcel.writeInt(this.f14856P);
    }

    A(Parcel parcel) {
        this.f14845E = parcel.readString();
        this.f14846F = parcel.readString();
        this.f14847G = parcel.readInt() != 0;
        this.f14848H = parcel.readInt();
        this.f14849I = parcel.readInt();
        this.f14850J = parcel.readString();
        this.f14851K = parcel.readInt() != 0;
        this.f14852L = parcel.readInt() != 0;
        this.f14853M = parcel.readInt() != 0;
        this.f14854N = parcel.readBundle();
        this.f14855O = parcel.readInt() != 0;
        this.f14857Q = parcel.readBundle();
        this.f14856P = parcel.readInt();
    }
}

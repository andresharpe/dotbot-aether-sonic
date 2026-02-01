package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    ArrayList<A> f15353E;

    /* renamed from: F, reason: collision with root package name */
    ArrayList<String> f15354F;

    /* renamed from: G, reason: collision with root package name */
    ArrayList<String> f15355G;

    /* renamed from: H, reason: collision with root package name */
    C0884b[] f15356H;

    /* renamed from: I, reason: collision with root package name */
    int f15357I;

    /* renamed from: J, reason: collision with root package name */
    String f15358J;

    /* renamed from: K, reason: collision with root package name */
    ArrayList<String> f15359K;

    /* renamed from: L, reason: collision with root package name */
    ArrayList<C0885c> f15360L;

    /* renamed from: M, reason: collision with root package name */
    ArrayList<String> f15361M;

    /* renamed from: N, reason: collision with root package name */
    ArrayList<Bundle> f15362N;

    /* renamed from: O, reason: collision with root package name */
    ArrayList<FragmentManager.m> f15363O;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<u> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u[] newArray(int i4) {
            return new u[i4];
        }
    }

    public u() {
        this.f15358J = null;
        this.f15359K = new ArrayList<>();
        this.f15360L = new ArrayList<>();
        this.f15361M = new ArrayList<>();
        this.f15362N = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f15353E);
        parcel.writeStringList(this.f15354F);
        parcel.writeStringList(this.f15355G);
        parcel.writeTypedArray(this.f15356H, i4);
        parcel.writeInt(this.f15357I);
        parcel.writeString(this.f15358J);
        parcel.writeStringList(this.f15359K);
        parcel.writeTypedList(this.f15360L);
        parcel.writeStringList(this.f15361M);
        parcel.writeTypedList(this.f15362N);
        parcel.writeTypedList(this.f15363O);
    }

    public u(Parcel parcel) {
        this.f15358J = null;
        this.f15359K = new ArrayList<>();
        this.f15360L = new ArrayList<>();
        this.f15361M = new ArrayList<>();
        this.f15362N = new ArrayList<>();
        this.f15353E = parcel.createTypedArrayList(A.CREATOR);
        this.f15354F = parcel.createStringArrayList();
        this.f15355G = parcel.createStringArrayList();
        this.f15356H = (C0884b[]) parcel.createTypedArray(C0884b.CREATOR);
        this.f15357I = parcel.readInt();
        this.f15358J = parcel.readString();
        this.f15359K = parcel.createStringArrayList();
        this.f15360L = parcel.createTypedArrayList(C0885c.CREATOR);
        this.f15361M = parcel.createStringArrayList();
        this.f15362N = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f15363O = parcel.createTypedArrayList(FragmentManager.m.CREATOR);
    }
}

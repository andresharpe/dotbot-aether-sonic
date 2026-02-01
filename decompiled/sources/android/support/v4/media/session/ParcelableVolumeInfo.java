package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    public int f4249E;

    /* renamed from: F, reason: collision with root package name */
    public int f4250F;

    /* renamed from: G, reason: collision with root package name */
    public int f4251G;

    /* renamed from: H, reason: collision with root package name */
    public int f4252H;

    /* renamed from: I, reason: collision with root package name */
    public int f4253I;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i4) {
            return new ParcelableVolumeInfo[i4];
        }
    }

    public ParcelableVolumeInfo(int i4, int i5, int i6, int i7, int i8) {
        this.f4249E = i4;
        this.f4250F = i5;
        this.f4251G = i6;
        this.f4252H = i7;
        this.f4253I = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f4249E);
        parcel.writeInt(this.f4251G);
        parcel.writeInt(this.f4252H);
        parcel.writeInt(this.f4253I);
        parcel.writeInt(this.f4250F);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f4249E = parcel.readInt();
        this.f4251G = parcel.readInt();
        this.f4252H = parcel.readInt();
        this.f4253I = parcel.readInt();
        this.f4250F = parcel.readInt();
    }
}

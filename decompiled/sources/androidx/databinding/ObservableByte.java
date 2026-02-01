package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableByte extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13961G = 1;

    /* renamed from: F, reason: collision with root package name */
    private byte f13962F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableByte> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i4) {
            return new ObservableByte[i4];
        }
    }

    public ObservableByte(byte b4) {
        this.f13962F = b4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte h() {
        return this.f13962F;
    }

    public void i(byte b4) {
        if (b4 != this.f13962F) {
            this.f13962F = b4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f13962F);
    }

    public ObservableByte() {
    }

    public ObservableByte(u... uVarArr) {
        super(uVarArr);
    }
}

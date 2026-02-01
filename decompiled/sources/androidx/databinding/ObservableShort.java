package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableShort extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13976G = 1;

    /* renamed from: F, reason: collision with root package name */
    private short f13977F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableShort> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i4) {
            return new ObservableShort[i4];
        }
    }

    public ObservableShort(short s4) {
        this.f13977F = s4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public short h() {
        return this.f13977F;
    }

    public void i(short s4) {
        if (s4 != this.f13977F) {
            this.f13977F = s4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13977F);
    }

    public ObservableShort() {
    }

    public ObservableShort(u... uVarArr) {
        super(uVarArr);
    }
}

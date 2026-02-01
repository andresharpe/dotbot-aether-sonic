package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableInt extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13971G = 1;

    /* renamed from: F, reason: collision with root package name */
    private int f13972F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableInt> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i4) {
            return new ObservableInt[i4];
        }
    }

    public ObservableInt(int i4) {
        this.f13972F = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int h() {
        return this.f13972F;
    }

    public void i(int i4) {
        if (i4 != this.f13972F) {
            this.f13972F = i4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13972F);
    }

    public ObservableInt() {
    }

    public ObservableInt(u... uVarArr) {
        super(uVarArr);
    }
}

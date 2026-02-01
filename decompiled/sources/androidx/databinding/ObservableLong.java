package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableLong extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13973G = 1;

    /* renamed from: F, reason: collision with root package name */
    private long f13974F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableLong> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i4) {
            return new ObservableLong[i4];
        }
    }

    public ObservableLong(long j4) {
        this.f13974F = j4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long h() {
        return this.f13974F;
    }

    public void i(long j4) {
        if (j4 != this.f13974F) {
            this.f13974F = j4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f13974F);
    }

    public ObservableLong() {
    }

    public ObservableLong(u... uVarArr) {
        super(uVarArr);
    }
}

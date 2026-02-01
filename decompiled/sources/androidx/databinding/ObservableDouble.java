package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableDouble extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13965G = 1;

    /* renamed from: F, reason: collision with root package name */
    private double f13966F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableDouble> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i4) {
            return new ObservableDouble[i4];
        }
    }

    public ObservableDouble(double d4) {
        this.f13966F = d4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double h() {
        return this.f13966F;
    }

    public void i(double d4) {
        if (d4 != this.f13966F) {
            this.f13966F = d4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeDouble(this.f13966F);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(u... uVarArr) {
        super(uVarArr);
    }
}

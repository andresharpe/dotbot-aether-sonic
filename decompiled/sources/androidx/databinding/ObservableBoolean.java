package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableBoolean extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13959G = 1;

    /* renamed from: F, reason: collision with root package name */
    private boolean f13960F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableBoolean> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z3 = true;
            if (parcel.readInt() != 1) {
                z3 = false;
            }
            return new ObservableBoolean(z3);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i4) {
            return new ObservableBoolean[i4];
        }
    }

    public ObservableBoolean(boolean z3) {
        this.f13960F = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean h() {
        return this.f13960F;
    }

    public void i(boolean z3) {
        if (z3 != this.f13960F) {
            this.f13960F = z3;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13960F ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(u... uVarArr) {
        super(uVarArr);
    }
}

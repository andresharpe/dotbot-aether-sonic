package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableFloat extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13969G = 1;

    /* renamed from: F, reason: collision with root package name */
    private float f13970F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableFloat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i4) {
            return new ObservableFloat[i4];
        }
    }

    public ObservableFloat(float f4) {
        this.f13970F = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float h() {
        return this.f13970F;
    }

    public void i(float f4) {
        if (f4 != this.f13970F) {
            this.f13970F = f4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f13970F);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(u... uVarArr) {
        super(uVarArr);
    }
}

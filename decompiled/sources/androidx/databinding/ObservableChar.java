package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableChar extends AbstractC0877b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();

    /* renamed from: G, reason: collision with root package name */
    static final long f13963G = 1;

    /* renamed from: F, reason: collision with root package name */
    private char f13964F;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ObservableChar> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i4) {
            return new ObservableChar[i4];
        }
    }

    public ObservableChar(char c4) {
        this.f13964F = c4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public char h() {
        return this.f13964F;
    }

    public void i(char c4) {
        if (c4 != this.f13964F) {
            this.f13964F = c4;
            e();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f13964F);
    }

    public ObservableChar() {
    }

    public ObservableChar(u... uVarArr) {
        super(uVarArr);
    }
}

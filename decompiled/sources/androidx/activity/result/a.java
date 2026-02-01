package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @N
    public static final Parcelable.Creator<a> CREATOR = new C0039a();

    /* renamed from: E, reason: collision with root package name */
    private final int f4550E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private final Intent f4551F;

    /* renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0039a implements Parcelable.Creator<a> {
        C0039a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@N Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public a(int i4, @P Intent intent) {
        this.f4550E = i4;
        this.f4551F = intent;
    }

    @N
    public static String c(int i4) {
        if (i4 != -1) {
            if (i4 != 0) {
                return String.valueOf(i4);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @P
    public Intent a() {
        return this.f4551F;
    }

    public int b() {
        return this.f4550E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f4550E) + ", data=" + this.f4551F + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int i5;
        parcel.writeInt(this.f4550E);
        if (this.f4551F == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        parcel.writeInt(i5);
        Intent intent = this.f4551F;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    a(Parcel parcel) {
        this.f4550E = parcel.readInt();
        this.f4551F = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}

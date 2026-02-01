package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class l implements Parcelable {

    @N
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    @N
    private final IntentSender f4560E;

    /* renamed from: F, reason: collision with root package name */
    @P
    private final Intent f4561F;

    /* renamed from: G, reason: collision with root package name */
    private final int f4562G;

    /* renamed from: H, reason: collision with root package name */
    private final int f4563H;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i4) {
            return new l[i4];
        }
    }

    l(@N IntentSender intentSender, @P Intent intent, int i4, int i5) {
        this.f4560E = intentSender;
        this.f4561F = intent;
        this.f4562G = i4;
        this.f4563H = i5;
    }

    @P
    public Intent a() {
        return this.f4561F;
    }

    public int b() {
        return this.f4562G;
    }

    public int c() {
        return this.f4563H;
    }

    @N
    public IntentSender d() {
        return this.f4560E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        parcel.writeParcelable(this.f4560E, i4);
        parcel.writeParcelable(this.f4561F, i4);
        parcel.writeInt(this.f4562G);
        parcel.writeInt(this.f4563H);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private IntentSender f4564a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f4565b;

        /* renamed from: c, reason: collision with root package name */
        private int f4566c;

        /* renamed from: d, reason: collision with root package name */
        private int f4567d;

        public b(@N IntentSender intentSender) {
            this.f4564a = intentSender;
        }

        @N
        public l a() {
            return new l(this.f4564a, this.f4565b, this.f4566c, this.f4567d);
        }

        @N
        public b b(@P Intent intent) {
            this.f4565b = intent;
            return this;
        }

        @N
        public b c(int i4, int i5) {
            this.f4567d = i4;
            this.f4566c = i5;
            return this;
        }

        public b(@N PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }
    }

    l(@N Parcel parcel) {
        this.f4560E = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f4561F = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f4562G = parcel.readInt();
        this.f4563H = parcel.readInt();
    }
}

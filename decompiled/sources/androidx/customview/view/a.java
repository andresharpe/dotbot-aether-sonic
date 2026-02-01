package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: E, reason: collision with root package name */
    private final Parcelable f13867E;

    /* renamed from: F, reason: collision with root package name */
    public static final a f13866F = new C0114a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: androidx.customview.view.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0114a extends a {
        C0114a() {
            super((C0114a) null);
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f13866F;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    /* synthetic */ a(C0114a c0114a) {
        this();
    }

    @P
    public final Parcelable a() {
        return this.f13867E;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f13867E, i4);
    }

    private a() {
        this.f13867E = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(@N Parcelable parcelable) {
        if (parcelable != null) {
            this.f13867E = parcelable == f13866F ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(@N Parcel parcel) {
        this(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(@N Parcel parcel, @P ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f13867E = readParcelable == null ? f13866F : readParcelable;
    }
}

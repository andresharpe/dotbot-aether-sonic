package androidx.core.os;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public final class F {

    /* loaded from: classes.dex */
    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final G<T> f12713a;

        a(G<T> g4) {
            this.f12713a = g4;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f12713a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i4) {
            return this.f12713a.newArray(i4);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f12713a.createFromParcel(parcel, classLoader);
        }
    }

    private F() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(G<T> g4) {
        return new a(g4);
    }
}

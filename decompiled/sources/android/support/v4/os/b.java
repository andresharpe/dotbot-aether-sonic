package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    final boolean f4420E;

    /* renamed from: F, reason: collision with root package name */
    final Handler f4421F;

    /* renamed from: G, reason: collision with root package name */
    android.support.v4.os.a f4422G;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i4) {
            return new b[i4];
        }
    }

    /* renamed from: android.support.v4.os.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0036b extends a.b {
        BinderC0036b() {
        }

        @Override // android.support.v4.os.a
        public void K1(int i4, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4421F;
            if (handler != null) {
                handler.post(new c(i4, bundle));
            } else {
                bVar.a(i4, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final int f4424E;

        /* renamed from: F, reason: collision with root package name */
        final Bundle f4425F;

        c(int i4, Bundle bundle) {
            this.f4424E = i4;
            this.f4425F = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f4424E, this.f4425F);
        }
    }

    public b(Handler handler) {
        this.f4420E = true;
        this.f4421F = handler;
    }

    protected void a(int i4, Bundle bundle) {
    }

    public void b(int i4, Bundle bundle) {
        if (this.f4420E) {
            Handler handler = this.f4421F;
            if (handler != null) {
                handler.post(new c(i4, bundle));
                return;
            } else {
                a(i4, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.f4422G;
        if (aVar != null) {
            try {
                aVar.K1(i4, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        synchronized (this) {
            try {
                if (this.f4422G == null) {
                    this.f4422G = new BinderC0036b();
                }
                parcel.writeStrongBinder(this.f4422G.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    b(Parcel parcel) {
        this.f4420E = false;
        this.f4421F = null;
        this.f4422G = a.b.v(parcel.readStrongBinder());
    }
}

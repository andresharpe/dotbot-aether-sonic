package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: b, reason: collision with root package name */
    public static final String f4417b = "android.support.v4.os.IResultReceiver";

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0034a implements a {
        @Override // android.support.v4.os.a
        public void K1(int i4, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: i, reason: collision with root package name */
        static final int f4418i = 1;

        /* renamed from: android.support.v4.os.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0035a implements a {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f4419i;

            C0035a(IBinder iBinder) {
                this.f4419i = iBinder;
            }

            @Override // android.support.v4.os.a
            public void K1(int i4, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f4417b);
                    obtain.writeInt(i4);
                    c.d(obtain, bundle, 0);
                    this.f4419i.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4419i;
            }

            public String v() {
                return a.f4417b;
            }
        }

        public b() {
            attachInterface(this, a.f4417b);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f4417b);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0035a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(a.f4417b);
            }
            if (i4 != 1598968902) {
                if (i4 != 1) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                K1(parcel.readInt(), (Bundle) c.c(parcel, Bundle.CREATOR));
                return true;
            }
            parcel2.writeString(a.f4417b);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void d(Parcel parcel, T t3, int i4) {
            if (t3 != null) {
                parcel.writeInt(1);
                t3.writeToParcel(parcel, i4);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    void K1(int i4, Bundle bundle) throws RemoteException;
}

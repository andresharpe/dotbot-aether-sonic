package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3841a = "android.support.v4.app.INotificationSideChannel";

    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022a implements a {
        @Override // android.support.v4.app.a
        public void E1(String str, int i4, String str2, Notification notification) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.a
        public void f1(String str, int i4, String str2) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void s0(String str) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: i, reason: collision with root package name */
        static final int f3842i = 1;

        /* renamed from: j, reason: collision with root package name */
        static final int f3843j = 2;

        /* renamed from: k, reason: collision with root package name */
        static final int f3844k = 3;

        /* renamed from: android.support.v4.app.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0023a implements a {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f3845i;

            C0023a(IBinder iBinder) {
                this.f3845i = iBinder;
            }

            @Override // android.support.v4.app.a
            public void E1(String str, int i4, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3841a);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    c.d(obtain, notification, 0);
                    this.f3845i.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3845i;
            }

            @Override // android.support.v4.app.a
            public void f1(String str, int i4, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3841a);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    this.f3845i.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void s0(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f3841a);
                    obtain.writeString(str);
                    this.f3845i.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String v() {
                return a.f3841a;
            }
        }

        public b() {
            attachInterface(this, a.f3841a);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f3841a);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0023a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(a.f3841a);
            }
            if (i4 != 1598968902) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return super.onTransact(i4, parcel, parcel2, i5);
                        }
                        s0(parcel.readString());
                    } else {
                        f1(parcel.readString(), parcel.readInt(), parcel.readString());
                    }
                } else {
                    E1(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) c.c(parcel, Notification.CREATOR));
                }
                return true;
            }
            parcel2.writeString(a.f3841a);
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

    void E1(String str, int i4, String str2, Notification notification) throws RemoteException;

    void f1(String str, int i4, String str2) throws RemoteException;

    void s0(String str) throws RemoteException;
}

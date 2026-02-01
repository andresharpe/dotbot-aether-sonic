package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.a;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: d, reason: collision with root package name */
    public static final String f12102d = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.b
        public void u0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
        }
    }

    /* renamed from: androidx.core.app.unusedapprestrictions.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0080b extends Binder implements b {

        /* renamed from: i, reason: collision with root package name */
        static final int f12103i = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.b$b$a */
        /* loaded from: classes.dex */
        private static class a implements b {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f12104i;

            a(IBinder iBinder) {
                this.f12104i = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12104i;
            }

            @Override // androidx.core.app.unusedapprestrictions.b
            public void u0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f12102d);
                    obtain.writeStrongInterface(aVar);
                    this.f12104i.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String v() {
                return b.f12102d;
            }
        }

        public AbstractBinderC0080b() {
            attachInterface(this, b.f12102d);
        }

        public static b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(b.f12102d);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(b.f12102d);
            }
            if (i4 != 1598968902) {
                if (i4 != 1) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                u0(a.b.v(parcel.readStrongBinder()));
                return true;
            }
            parcel2.writeString(b.f12102d);
            return true;
        }
    }

    void u0(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException;
}

package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String f12099c = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

    /* renamed from: androidx.core.app.unusedapprestrictions.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0078a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.a
        public void v1(boolean z3, boolean z4) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: i, reason: collision with root package name */
        static final int f12100i = 1;

        /* renamed from: androidx.core.app.unusedapprestrictions.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0079a implements a {

            /* renamed from: i, reason: collision with root package name */
            private IBinder f12101i;

            C0079a(IBinder iBinder) {
                this.f12101i = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12101i;
            }

            public String v() {
                return a.f12099c;
            }

            @Override // androidx.core.app.unusedapprestrictions.a
            public void v1(boolean z3, boolean z4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f12099c);
                    obtain.writeInt(z3 ? 1 : 0);
                    obtain.writeInt(z4 ? 1 : 0);
                    this.f12101i.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f12099c);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f12099c);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0079a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            boolean z3;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(a.f12099c);
            }
            if (i4 != 1598968902) {
                if (i4 != 1) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                v1(z3, z4);
                return true;
            }
            parcel2.writeString(a.f12099c);
            return true;
        }
    }

    void v1(boolean z3, boolean z4) throws RemoteException;
}

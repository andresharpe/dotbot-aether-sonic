package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import l1.InterfaceC2354a;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1273s extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.s$a */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements InterfaceC1273s {
        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @I0.a
        @InterfaceC2354a
        @androidx.annotation.N
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i4, @androidx.annotation.N Parcel parcel, @androidx.annotation.P Parcel parcel2, int i5) throws RemoteException {
            r c1271q0;
            if (i4 > 16777215) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            C1258k c1258k = null;
            if (readStrongBinder == null) {
                c1271q0 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof r) {
                    c1271q0 = (r) queryLocalInterface;
                } else {
                    c1271q0 = new C1271q0(readStrongBinder);
                }
            }
            if (i4 == 46) {
                if (parcel.readInt() != 0) {
                    c1258k = C1258k.CREATOR.createFromParcel(parcel);
                }
                l0(c1271q0, c1258k);
                C1285y.l(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i4 == 47) {
                if (parcel.readInt() != 0) {
                    C1288z0.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i4 != 4) {
                parcel.readString();
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 23 && i4 != 25 && i4 != 27) {
                        if (i4 != 30) {
                            if (i4 != 34) {
                                if (i4 != 41 && i4 != 43 && i4 != 37 && i4 != 38) {
                                    switch (i4) {
                                        case 9:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            parcel.readString();
                                            parcel.readStrongBinder();
                                            parcel.readString();
                                            if (parcel.readInt() != 0) {
                                                break;
                                            }
                                            break;
                                        case 10:
                                            parcel.readString();
                                            parcel.createStringArray();
                                            break;
                                        case 19:
                                            parcel.readStrongBinder();
                                            if (parcel.readInt() != 0) {
                                                break;
                                            }
                                            break;
                                    }
                                }
                            } else {
                                parcel.readString();
                            }
                        }
                        parcel.createStringArray();
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                        }
                    }
                    if (parcel.readInt() != 0) {
                    }
                } else {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    @I0.a
    void l0(@androidx.annotation.N r rVar, @androidx.annotation.P C1258k c1258k) throws RemoteException;
}

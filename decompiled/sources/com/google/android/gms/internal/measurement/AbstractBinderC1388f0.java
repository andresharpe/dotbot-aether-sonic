package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.d;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1388f0 extends P implements InterfaceC1396g0 {
    public AbstractBinderC1388f0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC1396g0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC1396g0) {
            return (InterfaceC1396g0) queryLocalInterface;
        }
        return new C1380e0(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean v(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        InterfaceC1420j0 c1404h0;
        InterfaceC1420j0 interfaceC1420j0;
        InterfaceC1420j0 interfaceC1420j02 = null;
        InterfaceC1420j0 interfaceC1420j03 = null;
        InterfaceC1420j0 interfaceC1420j04 = null;
        InterfaceC1444m0 interfaceC1444m0 = null;
        InterfaceC1444m0 interfaceC1444m02 = null;
        InterfaceC1444m0 interfaceC1444m03 = null;
        InterfaceC1420j0 interfaceC1420j05 = null;
        InterfaceC1420j0 interfaceC1420j06 = null;
        InterfaceC1420j0 interfaceC1420j07 = null;
        InterfaceC1420j0 interfaceC1420j08 = null;
        InterfaceC1420j0 interfaceC1420j09 = null;
        InterfaceC1420j0 interfaceC1420j010 = null;
        InterfaceC1460o0 interfaceC1460o0 = null;
        InterfaceC1420j0 interfaceC1420j011 = null;
        InterfaceC1420j0 interfaceC1420j012 = null;
        InterfaceC1420j0 interfaceC1420j013 = null;
        InterfaceC1420j0 interfaceC1420j014 = null;
        switch (i4) {
            case 1:
                com.google.android.gms.dynamic.d A3 = d.a.A(parcel.readStrongBinder());
                C1468p0 c1468p0 = (C1468p0) Q.a(parcel, C1468p0.CREATOR);
                long readLong = parcel.readLong();
                Q.c(parcel);
                initialize(A3, c1468p0, readLong);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) Q.a(parcel, Bundle.CREATOR);
                boolean g4 = Q.g(parcel);
                boolean g5 = Q.g(parcel);
                long readLong2 = parcel.readLong();
                Q.c(parcel);
                logEvent(readString, readString2, bundle, g4, g5, readLong2);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    interfaceC1420j0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof InterfaceC1420j0) {
                        c1404h0 = (InterfaceC1420j0) queryLocalInterface;
                    } else {
                        c1404h0 = new C1404h0(readStrongBinder);
                    }
                    interfaceC1420j0 = c1404h0;
                }
                long readLong3 = parcel.readLong();
                Q.c(parcel);
                logEventAndBundle(readString3, readString4, bundle2, interfaceC1420j0, readLong3);
                parcel2.writeNoException();
                return true;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.dynamic.d A4 = d.a.A(parcel.readStrongBinder());
                boolean g6 = Q.g(parcel);
                long readLong4 = parcel.readLong();
                Q.c(parcel);
                setUserProperty(readString5, readString6, A4, g6, readLong4);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean g7 = Q.g(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof InterfaceC1420j0) {
                        interfaceC1420j02 = (InterfaceC1420j0) queryLocalInterface2;
                    } else {
                        interfaceC1420j02 = new C1404h0(readStrongBinder2);
                    }
                }
                Q.c(parcel);
                getUserProperties(readString7, readString8, g7, interfaceC1420j02);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof InterfaceC1420j0) {
                        interfaceC1420j014 = (InterfaceC1420j0) queryLocalInterface3;
                    } else {
                        interfaceC1420j014 = new C1404h0(readStrongBinder3);
                    }
                }
                Q.c(parcel);
                getMaxUserProperties(readString9, interfaceC1420j014);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                Q.c(parcel);
                setUserId(readString10, readLong5);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle3 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                Q.c(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                Q.c(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                parcel2.writeNoException();
                return true;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof InterfaceC1420j0) {
                        interfaceC1420j013 = (InterfaceC1420j0) queryLocalInterface4;
                    } else {
                        interfaceC1420j013 = new C1404h0(readStrongBinder4);
                    }
                }
                Q.c(parcel);
                getConditionalUserProperties(readString13, readString14, interfaceC1420j013);
                parcel2.writeNoException();
                return true;
            case 11:
                boolean g8 = Q.g(parcel);
                long readLong7 = parcel.readLong();
                Q.c(parcel);
                setMeasurementEnabled(g8, readLong7);
                parcel2.writeNoException();
                return true;
            case 12:
                long readLong8 = parcel.readLong();
                Q.c(parcel);
                resetAnalyticsData(readLong8);
                parcel2.writeNoException();
                return true;
            case 13:
                long readLong9 = parcel.readLong();
                Q.c(parcel);
                setMinimumSessionDuration(readLong9);
                parcel2.writeNoException();
                return true;
            case 14:
                long readLong10 = parcel.readLong();
                Q.c(parcel);
                setSessionTimeoutDuration(readLong10);
                parcel2.writeNoException();
                return true;
            case 15:
                com.google.android.gms.dynamic.d A5 = d.a.A(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                Q.c(parcel);
                setCurrentScreen(A5, readString15, readString16, readLong11);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof InterfaceC1420j0) {
                        interfaceC1420j012 = (InterfaceC1420j0) queryLocalInterface5;
                    } else {
                        interfaceC1420j012 = new C1404h0(readStrongBinder5);
                    }
                }
                Q.c(parcel);
                getCurrentScreenName(interfaceC1420j012);
                parcel2.writeNoException();
                return true;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof InterfaceC1420j0) {
                        interfaceC1420j011 = (InterfaceC1420j0) queryLocalInterface6;
                    } else {
                        interfaceC1420j011 = new C1404h0(readStrongBinder6);
                    }
                }
                Q.c(parcel);
                getCurrentScreenClass(interfaceC1420j011);
                parcel2.writeNoException();
                return true;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof InterfaceC1460o0) {
                        interfaceC1460o0 = (InterfaceC1460o0) queryLocalInterface7;
                    } else {
                        interfaceC1460o0 = new C1452n0(readStrongBinder7);
                    }
                }
                Q.c(parcel);
                setInstanceIdProvider(interfaceC1460o0);
                parcel2.writeNoException();
                return true;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof InterfaceC1420j0) {
                        interfaceC1420j010 = (InterfaceC1420j0) queryLocalInterface8;
                    } else {
                        interfaceC1420j010 = new C1404h0(readStrongBinder8);
                    }
                }
                Q.c(parcel);
                getCachedAppInstanceId(interfaceC1420j010);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof InterfaceC1420j0) {
                        interfaceC1420j09 = (InterfaceC1420j0) queryLocalInterface9;
                    } else {
                        interfaceC1420j09 = new C1404h0(readStrongBinder9);
                    }
                }
                Q.c(parcel);
                getAppInstanceId(interfaceC1420j09);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof InterfaceC1420j0) {
                        interfaceC1420j08 = (InterfaceC1420j0) queryLocalInterface10;
                    } else {
                        interfaceC1420j08 = new C1404h0(readStrongBinder10);
                    }
                }
                Q.c(parcel);
                getGmpAppId(interfaceC1420j08);
                parcel2.writeNoException();
                return true;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof InterfaceC1420j0) {
                        interfaceC1420j07 = (InterfaceC1420j0) queryLocalInterface11;
                    } else {
                        interfaceC1420j07 = new C1404h0(readStrongBinder11);
                    }
                }
                Q.c(parcel);
                generateEventId(interfaceC1420j07);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                Q.c(parcel);
                beginAdUnitExposure(readString17, readLong12);
                parcel2.writeNoException();
                return true;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                Q.c(parcel);
                endAdUnitExposure(readString18, readLong13);
                parcel2.writeNoException();
                return true;
            case 25:
                com.google.android.gms.dynamic.d A6 = d.a.A(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                Q.c(parcel);
                onActivityStarted(A6, readLong14);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.dynamic.d A7 = d.a.A(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                Q.c(parcel);
                onActivityStopped(A7, readLong15);
                parcel2.writeNoException();
                return true;
            case 27:
                com.google.android.gms.dynamic.d A8 = d.a.A(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                Q.c(parcel);
                onActivityCreated(A8, bundle5, readLong16);
                parcel2.writeNoException();
                return true;
            case 28:
                com.google.android.gms.dynamic.d A9 = d.a.A(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                Q.c(parcel);
                onActivityDestroyed(A9, readLong17);
                parcel2.writeNoException();
                return true;
            case ConstraintLayout.b.a.f9571D /* 29 */:
                com.google.android.gms.dynamic.d A10 = d.a.A(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                Q.c(parcel);
                onActivityPaused(A10, readLong18);
                parcel2.writeNoException();
                return true;
            case 30:
                com.google.android.gms.dynamic.d A11 = d.a.A(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                Q.c(parcel);
                onActivityResumed(A11, readLong19);
                parcel2.writeNoException();
                return true;
            case ConstraintLayout.b.a.f9573F /* 31 */:
                com.google.android.gms.dynamic.d A12 = d.a.A(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof InterfaceC1420j0) {
                        interfaceC1420j06 = (InterfaceC1420j0) queryLocalInterface12;
                    } else {
                        interfaceC1420j06 = new C1404h0(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                Q.c(parcel);
                onActivitySaveInstanceState(A12, interfaceC1420j06, readLong20);
                parcel2.writeNoException();
                return true;
            case 32:
                Bundle bundle6 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof InterfaceC1420j0) {
                        interfaceC1420j05 = (InterfaceC1420j0) queryLocalInterface13;
                    } else {
                        interfaceC1420j05 = new C1404h0(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                Q.c(parcel);
                performAction(bundle6, interfaceC1420j05, readLong21);
                parcel2.writeNoException();
                return true;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                com.google.android.gms.dynamic.d A13 = d.a.A(parcel.readStrongBinder());
                com.google.android.gms.dynamic.d A14 = d.a.A(parcel.readStrongBinder());
                com.google.android.gms.dynamic.d A15 = d.a.A(parcel.readStrongBinder());
                Q.c(parcel);
                logHealthData(readInt, readString19, A13, A14, A15);
                parcel2.writeNoException();
                return true;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof InterfaceC1444m0) {
                        interfaceC1444m03 = (InterfaceC1444m0) queryLocalInterface14;
                    } else {
                        interfaceC1444m03 = new C1428k0(readStrongBinder14);
                    }
                }
                Q.c(parcel);
                setEventInterceptor(interfaceC1444m03);
                parcel2.writeNoException();
                return true;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof InterfaceC1444m0) {
                        interfaceC1444m02 = (InterfaceC1444m0) queryLocalInterface15;
                    } else {
                        interfaceC1444m02 = new C1428k0(readStrongBinder15);
                    }
                }
                Q.c(parcel);
                registerOnMeasurementEventListener(interfaceC1444m02);
                parcel2.writeNoException();
                return true;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof InterfaceC1444m0) {
                        interfaceC1444m0 = (InterfaceC1444m0) queryLocalInterface16;
                    } else {
                        interfaceC1444m0 = new C1428k0(readStrongBinder16);
                    }
                }
                Q.c(parcel);
                unregisterOnMeasurementEventListener(interfaceC1444m0);
                parcel2.writeNoException();
                return true;
            case 37:
                HashMap b4 = Q.b(parcel);
                Q.c(parcel);
                initForTests(b4);
                parcel2.writeNoException();
                return true;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof InterfaceC1420j0) {
                        interfaceC1420j04 = (InterfaceC1420j0) queryLocalInterface17;
                    } else {
                        interfaceC1420j04 = new C1404h0(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                Q.c(parcel);
                getTestFlag(interfaceC1420j04, readInt2);
                parcel2.writeNoException();
                return true;
            case 39:
                boolean g9 = Q.g(parcel);
                Q.c(parcel);
                setDataCollectionEnabled(g9);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof InterfaceC1420j0) {
                        interfaceC1420j03 = (InterfaceC1420j0) queryLocalInterface18;
                    } else {
                        interfaceC1420j03 = new C1404h0(readStrongBinder18);
                    }
                }
                Q.c(parcel);
                isDataCollectionEnabled(interfaceC1420j03);
                parcel2.writeNoException();
                return true;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                Q.c(parcel);
                setDefaultEventParameters(bundle7);
                parcel2.writeNoException();
                return true;
            case 43:
                long readLong22 = parcel.readLong();
                Q.c(parcel);
                clearMeasurementEnabled(readLong22);
                parcel2.writeNoException();
                return true;
            case 44:
                Bundle bundle8 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                Q.c(parcel);
                setConsent(bundle8, readLong23);
                parcel2.writeNoException();
                return true;
            case 45:
                Bundle bundle9 = (Bundle) Q.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                Q.c(parcel);
                setConsentThirdParty(bundle9, readLong24);
                parcel2.writeNoException();
                return true;
        }
    }
}

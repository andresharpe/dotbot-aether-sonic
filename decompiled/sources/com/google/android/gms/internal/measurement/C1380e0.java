package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1380e0 extends O implements InterfaceC1396g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1380e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void beginAdUnitExposure(String str, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeLong(j4);
        G(23, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.e(v3, bundle);
        G(9, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void clearMeasurementEnabled(long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeLong(j4);
        G(43, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void endAdUnitExposure(String str, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeLong(j4);
        G(24, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void generateEventId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(22, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(20, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getCachedAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(19, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.f(v3, interfaceC1420j0);
        G(10, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getCurrentScreenClass(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(17, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getCurrentScreenName(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(16, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getGmpAppId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        G(21, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getMaxUserProperties(String str, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        Q.f(v3, interfaceC1420j0);
        G(6, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getTestFlag(InterfaceC1420j0 interfaceC1420j0, int i4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1420j0);
        v3.writeInt(i4);
        G(38, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void getUserProperties(String str, String str2, boolean z3, InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.d(v3, z3);
        Q.f(v3, interfaceC1420j0);
        G(5, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void initialize(com.google.android.gms.dynamic.d dVar, C1468p0 c1468p0, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        Q.e(v3, c1468p0);
        v3.writeLong(j4);
        G(1, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void isDataCollectionEnabled(InterfaceC1420j0 interfaceC1420j0) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.e(v3, bundle);
        Q.d(v3, z3);
        Q.d(v3, z4);
        v3.writeLong(j4);
        G(2, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void logHealthData(int i4, String str, com.google.android.gms.dynamic.d dVar, com.google.android.gms.dynamic.d dVar2, com.google.android.gms.dynamic.d dVar3) throws RemoteException {
        Parcel v3 = v();
        v3.writeInt(5);
        v3.writeString(str);
        Q.f(v3, dVar);
        Q.f(v3, dVar2);
        Q.f(v3, dVar3);
        G(33, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityCreated(com.google.android.gms.dynamic.d dVar, Bundle bundle, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        Q.e(v3, bundle);
        v3.writeLong(j4);
        G(27, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityDestroyed(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeLong(j4);
        G(28, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityPaused(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeLong(j4);
        G(29, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityResumed(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeLong(j4);
        G(30, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        Q.f(v3, interfaceC1420j0);
        v3.writeLong(j4);
        G(31, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityStarted(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeLong(j4);
        G(25, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void onActivityStopped(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeLong(j4);
        G(26, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void performAction(Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        Q.f(v3, interfaceC1420j0);
        v3.writeLong(j4);
        G(32, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void registerOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1444m0);
        G(35, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void resetAnalyticsData(long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeLong(j4);
        G(12, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setConditionalUserProperty(Bundle bundle, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        v3.writeLong(j4);
        G(8, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setConsent(Bundle bundle, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        v3.writeLong(j4);
        G(44, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setConsentThirdParty(Bundle bundle, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        v3.writeLong(j4);
        G(45, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setCurrentScreen(com.google.android.gms.dynamic.d dVar, String str, String str2, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, dVar);
        v3.writeString(str);
        v3.writeString(str2);
        v3.writeLong(j4);
        G(15, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setDataCollectionEnabled(boolean z3) throws RemoteException {
        Parcel v3 = v();
        Q.d(v3, z3);
        G(39, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel v3 = v();
        Q.e(v3, bundle);
        G(42, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setEventInterceptor(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1444m0);
        G(34, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setInstanceIdProvider(InterfaceC1460o0 interfaceC1460o0) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setMeasurementEnabled(boolean z3, long j4) throws RemoteException {
        Parcel v3 = v();
        Q.d(v3, z3);
        v3.writeLong(j4);
        G(11, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setMinimumSessionDuration(long j4) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setSessionTimeoutDuration(long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeLong(j4);
        G(14, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setUserId(String str, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeLong(j4);
        G(7, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.d dVar, boolean z3, long j4) throws RemoteException {
        Parcel v3 = v();
        v3.writeString(str);
        v3.writeString(str2);
        Q.f(v3, dVar);
        Q.d(v3, z3);
        v3.writeLong(j4);
        G(4, v3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1396g0
    public final void unregisterOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException {
        Parcel v3 = v();
        Q.f(v3, interfaceC1444m0);
        G(36, v3);
    }
}

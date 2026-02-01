package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1396g0 extends IInterface {
    void beginAdUnitExposure(String str, long j4) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j4) throws RemoteException;

    void endAdUnitExposure(String str, long j4) throws RemoteException;

    void generateEventId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getCurrentScreenClass(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getCurrentScreenName(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getGmpAppId(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void getTestFlag(InterfaceC1420j0 interfaceC1420j0, int i4) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z3, InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(com.google.android.gms.dynamic.d dVar, C1468p0 c1468p0, long j4) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC1420j0 interfaceC1420j0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException;

    void logHealthData(int i4, String str, com.google.android.gms.dynamic.d dVar, com.google.android.gms.dynamic.d dVar2, com.google.android.gms.dynamic.d dVar3) throws RemoteException;

    void onActivityCreated(com.google.android.gms.dynamic.d dVar, Bundle bundle, long j4) throws RemoteException;

    void onActivityDestroyed(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException;

    void onActivityPaused(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException;

    void onActivityResumed(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException;

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.d dVar, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException;

    void onActivityStarted(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException;

    void onActivityStopped(com.google.android.gms.dynamic.d dVar, long j4) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC1420j0 interfaceC1420j0, long j4) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException;

    void resetAnalyticsData(long j4) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j4) throws RemoteException;

    void setConsent(Bundle bundle, long j4) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j4) throws RemoteException;

    void setCurrentScreen(com.google.android.gms.dynamic.d dVar, String str, String str2, long j4) throws RemoteException;

    void setDataCollectionEnabled(boolean z3) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC1444m0 interfaceC1444m0) throws RemoteException;

    void setInstanceIdProvider(InterfaceC1460o0 interfaceC1460o0) throws RemoteException;

    void setMeasurementEnabled(boolean z3, long j4) throws RemoteException;

    void setMinimumSessionDuration(long j4) throws RemoteException;

    void setSessionTimeoutDuration(long j4) throws RemoteException;

    void setUserId(String str, long j4) throws RemoteException;

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.d dVar, boolean z3, long j4) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC1444m0 interfaceC1444m0) throws RemoteException;
}

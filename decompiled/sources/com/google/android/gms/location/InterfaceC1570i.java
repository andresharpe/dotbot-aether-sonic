package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1570i {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    @Deprecated
    public static final String f30008a = "com.google.android.location.LOCATION";

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.N
    public static final String f30009b = "mockLocation";

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> a(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N PendingIntent pendingIntent);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    Location b(@androidx.annotation.N com.google.android.gms.common.api.i iVar);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> c(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N AbstractC1586q abstractC1586q);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> d(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N AbstractC1586q abstractC1586q, @androidx.annotation.N Looper looper);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> e(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N PendingIntent pendingIntent);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> f(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N r rVar);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> g(@androidx.annotation.N com.google.android.gms.common.api.i iVar, boolean z3);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> h(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N r rVar);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> i(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N LocationRequest locationRequest, @androidx.annotation.N r rVar, @androidx.annotation.N Looper looper);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    LocationAvailability j(@androidx.annotation.N com.google.android.gms.common.api.i iVar);

    @androidx.annotation.Y(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> k(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N Location location);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> l(@androidx.annotation.N com.google.android.gms.common.api.i iVar);
}

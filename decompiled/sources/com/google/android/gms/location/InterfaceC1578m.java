package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.location.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1578m {
    @androidx.annotation.Y("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.N
    @Deprecated
    com.google.android.gms.common.api.l<Status> a(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N List<InterfaceC1574k> list, @androidx.annotation.N PendingIntent pendingIntent);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> b(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N PendingIntent pendingIntent);

    @androidx.annotation.Y("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> c(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N C1584p c1584p, @androidx.annotation.N PendingIntent pendingIntent);

    @androidx.annotation.N
    com.google.android.gms.common.api.l<Status> d(@androidx.annotation.N com.google.android.gms.common.api.i iVar, @androidx.annotation.N List<String> list);
}

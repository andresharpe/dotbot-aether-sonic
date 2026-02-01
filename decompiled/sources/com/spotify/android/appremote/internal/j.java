package com.spotify.android.appremote.internal;

import android.content.ServiceConnection;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public interface j extends ServiceConnection, com.spotify.protocol.client.b {
    void n(@Nullable com.spotify.protocol.client.h listener);
}

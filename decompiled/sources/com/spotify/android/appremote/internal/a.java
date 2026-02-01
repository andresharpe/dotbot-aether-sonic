package com.spotify.android.appremote.internal;

import android.util.Log;
import com.spotify.protocol.client.f;

/* loaded from: classes2.dex */
public class a implements f.b, f.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f48797a = "SPOTIFY_APP_REMOTE";

    @Override // com.spotify.protocol.client.f.b
    @l1.h
    public void a(String format, Object... args) {
        c(null, format, args);
    }

    @Override // com.spotify.protocol.client.f.a
    public void b(boolean expression, String message) {
        if (com.spotify.android.appremote.api.j.l() && !expression) {
            throw new AssertionError(message);
        }
    }

    @Override // com.spotify.protocol.client.f.b
    @l1.h
    public void c(Throwable e4, String format, Object... args) {
        if (com.spotify.android.appremote.api.j.l()) {
            Log.d(f48797a, String.format(format, args), e4);
        }
    }

    @Override // com.spotify.protocol.client.f.b
    @l1.h
    public void d(String format, Object... args) {
        e(null, format, args);
    }

    @Override // com.spotify.protocol.client.f.b
    @l1.h
    public void e(Throwable e4, String format, Object... args) {
        Log.e(f48797a, String.format(format, args), e4);
    }
}

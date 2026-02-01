package com.spotify.protocol.client.error;

import com.spotify.protocol.error.SpotifyAppRemoteException;

/* loaded from: classes2.dex */
public class RemoteClientException extends SpotifyAppRemoteException {

    /* renamed from: G, reason: collision with root package name */
    private static final long f48871G = -2168285044517789333L;

    /* renamed from: F, reason: collision with root package name */
    private final String f48872F;

    public RemoteClientException(String detailMessage, String reasonUri) {
        super(detailMessage);
        this.f48872F = reasonUri;
    }

    public String a() {
        return this.f48872F;
    }
}

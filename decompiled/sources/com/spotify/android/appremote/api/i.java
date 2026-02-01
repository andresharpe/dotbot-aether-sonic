package com.spotify.android.appremote.api;

import G2.a;
import android.content.Context;
import com.spotify.android.appremote.api.c;
import com.spotify.android.appremote.api.error.AuthenticationFailedException;
import com.spotify.android.appremote.api.error.CouldNotFindSpotifyApp;
import com.spotify.android.appremote.api.error.NotLoggedInException;
import com.spotify.android.appremote.api.error.OfflineModeException;
import com.spotify.android.appremote.api.error.SpotifyConnectionTerminatedException;
import com.spotify.android.appremote.api.error.SpotifyRemoteServiceException;
import com.spotify.android.appremote.api.error.UnsupportedFeatureVersionException;
import com.spotify.android.appremote.api.error.UserNotAuthorizedException;
import com.spotify.android.appremote.api.i;
import com.spotify.android.appremote.internal.m;
import com.spotify.android.appremote.internal.n;
import com.spotify.android.appremote.internal.o;
import com.spotify.android.appremote.internal.p;
import com.spotify.android.appremote.internal.q;
import com.spotify.protocol.client.error.RemoteClientException;
import com.spotify.protocol.client.l;
import com.spotify.protocol.client.q;
import com.spotify.protocol.error.SpotifyAppRemoteException;
import com.spotify.protocol.types.UserStatus;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    private final o f48777a;

    /* renamed from: b, reason: collision with root package name */
    private final m f48778b;

    /* loaded from: classes2.dex */
    class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.spotify.android.appremote.internal.l f48779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.a f48780b;

        a(final com.spotify.android.appremote.internal.l val$remoteClientConnector, final c.a val$connectionListener) {
            this.f48779a = val$remoteClientConnector;
            this.f48780b = val$connectionListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(j jVar, c.a aVar) {
            jVar.k();
            aVar.b(new SpotifyConnectionTerminatedException());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f(c.a aVar, j jVar, UserStatus userStatus) {
            com.spotify.protocol.client.f.b("LoggedIn:%s", Boolean.valueOf(userStatus.isLoggedIn()));
            if (userStatus.isLoggedIn()) {
                aVar.a(jVar);
            } else {
                aVar.b(new NotLoggedInException("The user must go to the Spotify and log-in", new Throwable("The user must go to the Spotify and log-in")));
            }
        }

        @Override // com.spotify.protocol.client.l.a
        public void a(Throwable reason) {
            com.spotify.protocol.client.f.c(reason, "Connection failed.", new Object[0]);
            this.f48779a.c();
            this.f48780b.b(i.d(reason));
        }

        @Override // com.spotify.protocol.client.l.a
        public void b(com.spotify.protocol.client.k client) {
            p pVar = new p(client);
            final j jVar = new j(pVar, new com.spotify.android.appremote.internal.i(pVar), new com.spotify.android.appremote.internal.f(pVar), new q(pVar), new com.spotify.android.appremote.internal.c(pVar), new com.spotify.android.appremote.internal.b(pVar), this.f48779a);
            jVar.n(true);
            pVar.g(new n(jVar));
            com.spotify.android.appremote.internal.l lVar = this.f48779a;
            final c.a aVar = this.f48780b;
            lVar.m(new com.spotify.protocol.client.h() { // from class: com.spotify.android.appremote.api.f
                @Override // com.spotify.protocol.client.h
                public final void a() {
                    i.a.e(j.this, aVar);
                }
            });
            com.spotify.protocol.client.q<UserStatus> a4 = jVar.f().a();
            final c.a aVar2 = this.f48780b;
            a4.k(new q.a() { // from class: com.spotify.android.appremote.api.g
                @Override // com.spotify.protocol.client.q.a
                public final void a(Object obj) {
                    i.a.f(c.a.this, jVar, (UserStatus) obj);
                }
            });
            final c.a aVar3 = this.f48780b;
            Objects.requireNonNull(aVar3);
            a4.a(new com.spotify.protocol.client.g() { // from class: com.spotify.android.appremote.api.h
                @Override // com.spotify.protocol.client.g
                public final void onError(Throwable th) {
                    c.a.this.b(th);
                }
            });
        }
    }

    public i(o spotifyLocator, m sdkRemoteClientConnectorFactory) {
        this.f48777a = spotifyLocator;
        this.f48778b = sdkRemoteClientConnectorFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable d(Throwable reason) {
        String str;
        if (reason instanceof RemoteClientException) {
            str = ((RemoteClientException) reason).a();
        } else {
            str = null;
        }
        String message = reason.getMessage();
        if (reason instanceof SpotifyRemoteServiceException) {
            return reason;
        }
        if (a.b.f615i.equals(str)) {
            return new AuthenticationFailedException(message, reason);
        }
        if (a.b.f613g.equals(str)) {
            return new UnsupportedFeatureVersionException(message, reason);
        }
        if (a.b.f616j.equals(str)) {
            return new OfflineModeException(message, reason);
        }
        if (a.b.f614h.equals(str)) {
            return new UserNotAuthorizedException(message, reason);
        }
        if (a.b.f612f.equals(str)) {
            return new NotLoggedInException(message, reason);
        }
        return new SpotifyAppRemoteException(message, reason);
    }

    @Override // com.spotify.android.appremote.api.c
    public void a(j spotifyAppRemote) {
        if (spotifyAppRemote != null) {
            spotifyAppRemote.k();
        }
    }

    @Override // com.spotify.android.appremote.api.c
    public void b(@Nullable Context context, @Nullable ConnectionParams params, @Nullable c.a connectionListener) {
        if (!this.f48777a.e(context)) {
            connectionListener.b(new CouldNotFindSpotifyApp());
            return;
        }
        try {
            com.spotify.android.appremote.internal.l lVar = (com.spotify.android.appremote.internal.l) com.spotify.protocol.client.d.a(this.f48778b.a(context, params, this.f48777a.c(context)));
            lVar.a(new a(lVar, connectionListener));
        } catch (CouldNotFindSpotifyApp e4) {
            connectionListener.b(e4);
        }
    }
}

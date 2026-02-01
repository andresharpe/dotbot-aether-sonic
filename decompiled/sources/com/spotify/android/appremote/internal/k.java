package com.spotify.android.appremote.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.spotify.android.appremote.api.error.SpotifyConnectionTerminatedException;
import com.spotify.android.appremote.api.error.SpotifyDisconnectedException;
import com.spotify.android.appremote.api.error.SpotifyRemoteServiceException;
import com.spotify.protocol.client.b;
import com.spotify.protocol.error.SpotifyAppRemoteException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class k implements j {

    /* renamed from: k, reason: collision with root package name */
    private static final String f48806k = "com.spotify.mobile.appprotocol.action.START_APP_PROTOCOL_SERVICE";

    /* renamed from: l, reason: collision with root package name */
    private static final int f48807l = 1;

    /* renamed from: m, reason: collision with root package name */
    private static final int f48808m = 2;

    /* renamed from: n, reason: collision with root package name */
    private static final String f48809n = "MESSAGE_BODY";

    /* renamed from: c, reason: collision with root package name */
    private final String f48810c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f48811d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f48812e;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f48813f;

    /* renamed from: h, reason: collision with root package name */
    private h f48815h;

    /* renamed from: i, reason: collision with root package name */
    private com.spotify.protocol.client.h f48816i;

    /* renamed from: g, reason: collision with root package name */
    private final Messenger f48814g = new Messenger(new a(this));

    /* renamed from: j, reason: collision with root package name */
    private b f48817j = b.DISCONNECTED;

    /* loaded from: classes2.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<k> f48818a;

        public a(k context) {
            this.f48818a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            k kVar = this.f48818a.get();
            if (kVar != null) {
                kVar.h(msg);
            }
        }
    }

    /* loaded from: classes2.dex */
    private enum b {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        TERMINATED
    }

    public k(String spotifyPackageName, Context context) {
        this.f48810c = spotifyPackageName;
        this.f48811d = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message msg) {
        int i4 = msg.what;
        if (i4 != 1) {
            if (i4 != 2) {
                com.spotify.protocol.client.f.d("Unknown message: %d", Integer.valueOf(i4));
                return;
            }
            byte[] byteArray = msg.getData().getByteArray(f48809n);
            com.spotify.protocol.client.f.b("Message from Spotify: %s", new String(byteArray, Charset.forName("UTF-8")));
            this.f48812e.b(byteArray, byteArray.length);
            return;
        }
        Messenger messenger = msg.replyTo;
        if (messenger != null) {
            this.f48813f = messenger;
            this.f48815h.k();
        } else {
            this.f48815h.j(new SpotifyAppRemoteException("Can't connect to Spotify service"));
        }
    }

    private ComponentName i(Intent intent) {
        ComponentName startForegroundService;
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService = this.f48811d.getApplicationContext().startForegroundService(intent);
            return startForegroundService;
        }
        return this.f48811d.startService(intent);
    }

    @Override // com.spotify.protocol.client.b
    public boolean a() {
        if (this.f48817j == b.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.protocol.client.b
    public void b(b.a dataInput) {
        this.f48812e = dataInput;
    }

    @Override // com.spotify.protocol.client.b
    public void c() {
        com.spotify.protocol.client.f.b("Stop remote client", new Object[0]);
        try {
            this.f48811d.getApplicationContext().unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f48817j = b.TERMINATED;
        this.f48813f = null;
    }

    @Override // com.spotify.protocol.client.b
    public void d(byte[] message, int length) throws SpotifyAppRemoteException {
        b bVar = this.f48817j;
        if (bVar != b.TERMINATED) {
            if (bVar != b.DISCONNECTED) {
                if (this.f48813f != null) {
                    Bundle bundle = new Bundle();
                    bundle.putByteArray(f48809n, message);
                    Message obtain = Message.obtain();
                    obtain.setData(bundle);
                    try {
                        this.f48813f.send(obtain);
                        return;
                    } catch (RemoteException e4) {
                        com.spotify.protocol.client.f.d("Couldn't send message to Spotify App: %s", e4.getMessage());
                        return;
                    }
                }
                com.spotify.protocol.client.f.d("No outgoing messenger", new Object[0]);
                return;
            }
            throw new SpotifyDisconnectedException();
        }
        throw new SpotifyConnectionTerminatedException();
    }

    @Override // com.spotify.protocol.client.b
    public boolean e() {
        if (this.f48817j == b.CONNECTING) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.protocol.client.b
    public com.spotify.protocol.client.i<Void> f() {
        com.spotify.protocol.client.f.b("Start remote client", new Object[0]);
        this.f48815h = new h();
        try {
            Intent intent = new Intent(f48806k);
            intent.setPackage(this.f48810c);
            i(intent);
            if (this.f48811d.getApplicationContext().bindService(intent, this, 65)) {
                com.spotify.protocol.client.f.b("Connecting to Spotify service", new Object[0]);
                this.f48817j = b.CONNECTING;
                return this.f48815h;
            }
            throw new IllegalStateException("Can't connect to Spotify service with package " + this.f48810c);
        } catch (Exception e4) {
            com.spotify.protocol.client.f.d("Can't connect to Spotify service", new Object[0]);
            this.f48815h.j(new SpotifyRemoteServiceException("Unable to connect to Spotify service", e4));
            return this.f48815h;
        }
    }

    @Override // com.spotify.android.appremote.internal.j
    public void n(com.spotify.protocol.client.h listener) {
        this.f48816i = listener;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        com.spotify.protocol.client.f.b("Spotify service connected", new Object[0]);
        Messenger messenger = new Messenger(service);
        Message obtain = Message.obtain();
        obtain.replyTo = this.f48814g;
        try {
            messenger.send(obtain);
        } catch (RemoteException unused) {
            com.spotify.protocol.client.f.d("Could not send message to Spotify", new Object[0]);
        }
        this.f48817j = b.CONNECTED;
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        com.spotify.protocol.client.f.d("Spotify service disconnected", new Object[0]);
        this.f48813f = null;
        this.f48817j = b.TERMINATED;
        com.spotify.protocol.client.h hVar = this.f48816i;
        if (hVar != null) {
            hVar.a();
        }
    }
}

package com.spotify.android.appremote.api;

import android.content.Context;
import com.spotify.android.appremote.api.c;
import com.spotify.android.appremote.internal.m;
import com.spotify.android.appremote.internal.o;
import com.spotify.protocol.client.l;
import com.spotify.protocol.client.q;
import com.spotify.protocol.types.Item;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class j implements a {

    /* renamed from: i, reason: collision with root package name */
    private static boolean f48782i;

    /* renamed from: j, reason: collision with root package name */
    private static final o f48783j;

    /* renamed from: k, reason: collision with root package name */
    private static final c f48784k;

    /* renamed from: a, reason: collision with root package name */
    private final com.spotify.protocol.client.k f48785a;

    /* renamed from: b, reason: collision with root package name */
    private final PlayerApi f48786b;

    /* renamed from: c, reason: collision with root package name */
    private final e f48787c;

    /* renamed from: d, reason: collision with root package name */
    private final k f48788d;

    /* renamed from: e, reason: collision with root package name */
    private final d f48789e;

    /* renamed from: f, reason: collision with root package name */
    private final b f48790f;

    /* renamed from: g, reason: collision with root package name */
    private final l f48791g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f48792h;

    static {
        o oVar = new o();
        f48783j = oVar;
        f48784k = new i(oVar, new m());
        com.spotify.android.appremote.internal.a aVar = new com.spotify.android.appremote.internal.a();
        com.spotify.protocol.client.f.g(aVar);
        com.spotify.protocol.client.f.f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(com.spotify.protocol.client.k remoteClient, PlayerApi playerApi, e imagesApi, k userApi, d contentApi, b connectApi, l remoteClientConnector) {
        this.f48785a = remoteClient;
        this.f48786b = playerApi;
        this.f48787c = imagesApi;
        this.f48788d = userApi;
        this.f48789e = contentApi;
        this.f48790f = connectApi;
        this.f48791g = remoteClientConnector;
    }

    public static void i(Context context, ConnectionParams params, c.a connectionListener) {
        f48784k.b(context, params, connectionListener);
    }

    public static void j(j spotifyAppRemote) {
        if (spotifyAppRemote != null && spotifyAppRemote.a()) {
            f48784k.a(spotifyAppRemote);
        }
    }

    public static boolean l() {
        return f48782i;
    }

    public static boolean m(Context context) {
        return f48783j.e(context);
    }

    public static void o(boolean isDebug) {
        f48782i = isDebug;
    }

    @Override // com.spotify.android.appremote.api.a
    public boolean a() {
        return this.f48792h;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public <T extends Item> q<T> b(@Nullable String uri, @Nullable Class<T> eventType) {
        return this.f48785a.b(uri, eventType);
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public b c() {
        return this.f48790f;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public PlayerApi d() {
        return this.f48786b;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public e e() {
        return this.f48787c;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public k f() {
        return this.f48788d;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public d g() {
        return this.f48789e;
    }

    @Override // com.spotify.android.appremote.api.a
    @Nonnull
    public <T extends Item, S extends Item> com.spotify.protocol.client.c<T> h(@Nullable String uri, @Nullable S argument, @Nullable Class<T> resultType) {
        return this.f48785a.d(uri, argument, resultType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f48792h = false;
        this.f48785a.f();
        this.f48791g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(boolean connected) {
        this.f48792h = connected;
    }
}

package com.spotify.protocol.client;

import G2.b;
import com.spotify.protocol.client.b;
import com.spotify.protocol.error.SpotifyAppRemoteException;
import com.spotify.protocol.mappers.JsonMappingException;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.HelloDetails;
import com.spotify.protocol.types.Info;
import com.spotify.protocol.types.Message;
import com.spotify.protocol.types.Roles;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements G2.b, b.a, b.d {

    /* renamed from: j, reason: collision with root package name */
    private static final String f48839j = "spotify";

    /* renamed from: k, reason: collision with root package name */
    private static final int f48840k = 1;

    /* renamed from: f, reason: collision with root package name */
    private final HelloDetails f48841f;

    /* renamed from: g, reason: collision with root package name */
    private final H2.b f48842g;

    /* renamed from: h, reason: collision with root package name */
    private final b f48843h;

    /* renamed from: i, reason: collision with root package name */
    private final b.c f48844i = new s();

    public a(e connectionDetails, H2.b mapper, b protocolIo) {
        this.f48842g = mapper;
        this.f48843h = protocolIo;
        this.f48841f = new HelloDetails(new Roles(null, null, new Empty(), new Empty()), new Info(1, connectionDetails.j(), connectionDetails.e(), connectionDetails.i(), connectionDetails.h(), connectionDetails.c(), connectionDetails.m(), null, connectionDetails.g(), connectionDetails.f(), connectionDetails.k(), connectionDetails.k()), connectionDetails.b(), connectionDetails.a(), connectionDetails.d());
        protocolIo.b(this);
    }

    private void j(Object[] wampMessage) throws SpotifyAppRemoteException {
        try {
            byte[] bytes = this.f48842g.a(Arrays.asList(wampMessage)).getBytes(Charset.forName("UTF-8"));
            this.f48843h.d(bytes, bytes.length);
        } catch (JsonMappingException e4) {
            throw new SpotifyAppRemoteException(e4);
        }
    }

    @Override // G2.b.d
    public void a(int requestId, Object options, String procedureUri) throws SpotifyAppRemoteException {
        j(new Object[]{48, Integer.valueOf(requestId), G2.a.f579a, procedureUri});
    }

    @Override // com.spotify.protocol.client.b.a
    public void b(byte[] data, int length) {
        try {
            this.f48844i.a(new G2.c(this.f48842g.b(new String(data, Charset.forName("UTF-8")))));
        } catch (JsonMappingException e4) {
            f.e(e4, "Message is not parsed.", new Object[0]);
        }
    }

    @Override // G2.b.d
    public void c() throws SpotifyAppRemoteException {
        j(new Object[]{6, new Message("The client is shutting down"), G2.b.f626d});
    }

    @Override // G2.b.d
    public void d(int requestId, Object options) {
    }

    @Override // G2.b.d
    public void e() throws SpotifyAppRemoteException {
        j(new Object[]{1, f48839j, this.f48841f});
    }

    @Override // G2.b.d
    public void f(int requestId, Object options, String topicUri) throws SpotifyAppRemoteException {
        j(new Object[]{32, Integer.valueOf(requestId), options, topicUri});
    }

    @Override // G2.b.d
    public void g(int requestId, int subscriptionId) throws SpotifyAppRemoteException {
        j(new Object[]{34, Integer.valueOf(requestId), Integer.valueOf(subscriptionId)});
    }

    @Override // G2.b.d
    public void h(int requestId, Object options, String procedureUri, List<Object> arguments) throws SpotifyAppRemoteException {
        j(new Object[]{48, Integer.valueOf(requestId), G2.a.f579a, procedureUri, arguments});
    }

    @Override // G2.b.d
    public void i(int requestId, Object options, String procedureUri, List<Object> arguments, Object item) throws SpotifyAppRemoteException {
        j(new Object[]{48, Integer.valueOf(requestId), G2.a.f579a, procedureUri, arguments, item});
    }

    public void k(b.a receiver) {
        this.f48844i.b(receiver);
    }
}

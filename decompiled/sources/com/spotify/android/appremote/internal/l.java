package com.spotify.android.appremote.internal;

import android.content.Context;
import android.os.AsyncTask;
import androidx.annotation.i0;
import com.spotify.android.appremote.api.ConnectionParams;
import com.spotify.protocol.client.e;
import com.spotify.protocol.client.l;
import com.spotify.protocol.types.WelcomeDetails;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;

/* loaded from: classes2.dex */
public class l implements com.spotify.protocol.client.l {

    /* renamed from: g, reason: collision with root package name */
    public static final String f48819g = "appid";

    /* renamed from: h, reason: collision with root package name */
    public static final String f48820h = "app-remote-control";

    /* renamed from: i, reason: collision with root package name */
    public static final String f48821i = "app";

    /* renamed from: j, reason: collision with root package name */
    public static final String f48822j = "redirect_uri";

    /* renamed from: k, reason: collision with root package name */
    public static final String f48823k = "show_auth_view";

    /* renamed from: l, reason: collision with root package name */
    public static final String f48824l = "scopes";

    /* renamed from: a, reason: collision with root package name */
    private j f48825a;

    /* renamed from: b, reason: collision with root package name */
    private com.spotify.protocol.client.m f48826b;

    /* renamed from: c, reason: collision with root package name */
    private b f48827c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f48828d;

    /* renamed from: e, reason: collision with root package name */
    private final ConnectionParams f48829e;

    /* renamed from: f, reason: collision with root package name */
    private final String f48830f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b extends AsyncTask<Void, Void, com.spotify.protocol.client.o<WelcomeDetails>> {

        /* renamed from: a, reason: collision with root package name */
        private final com.spotify.protocol.client.e f48831a;

        /* renamed from: b, reason: collision with root package name */
        private final l f48832b;

        /* renamed from: c, reason: collision with root package name */
        private final l.a f48833c;

        /* renamed from: d, reason: collision with root package name */
        private final H2.b f48834d;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.spotify.protocol.client.o<WelcomeDetails> doInBackground(Void... args) {
            com.spotify.protocol.client.o<Void> b4 = this.f48832b.f48825a.f().b(30L, TimeUnit.SECONDS);
            if (b4.l()) {
                return this.f48832b.f48826b.a(WelcomeDetails.class).b(1L, TimeUnit.HOURS);
            }
            return com.spotify.protocol.client.p.a(b4.a());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(com.spotify.protocol.client.o<WelcomeDetails> result) {
            if (result.l()) {
                this.f48833c.b(this.f48832b.f48826b);
            } else {
                this.f48833c.a(result.a());
            }
            this.f48832b.f48827c = null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            l lVar = this.f48832b;
            lVar.f48825a = new k(lVar.f48830f, this.f48832b.f48828d);
            com.spotify.protocol.client.a aVar = new com.spotify.protocol.client.a(this.f48831a, this.f48834d, this.f48832b.f48825a);
            this.f48832b.f48826b = new com.spotify.protocol.client.m(aVar, new com.spotify.protocol.client.r());
        }

        private b(l outer, ConnectionParams connectionParams, l.a connectionCallback) {
            this.f48832b = outer;
            this.f48833c = connectionCallback;
            this.f48834d = connectionParams.c();
            e.b k4 = new e.b(connectionParams.b()).j(outer.f48828d.getPackageName()).f(l.f48821i).m(F2.a.f438d).k(connectionParams.e());
            if (connectionParams.a() == ConnectionParams.AuthMethod.APP_ID) {
                HashMap hashMap = new HashMap(5);
                hashMap.put("redirect_uri", connectionParams.d());
                hashMap.put(l.f48823k, String.valueOf(connectionParams.f()));
                hashMap.put(l.f48824l, l.f48820h);
                k4.e(new String[]{l.f48819g});
                k4.d(connectionParams.b());
                k4.g(hashMap);
            }
            this.f48831a = k4.a();
        }
    }

    private l(@Nonnull Context context, @Nonnull ConnectionParams connectionParams, @Nonnull String spotifyPackagename) {
        this.f48828d = context;
        this.f48829e = connectionParams;
        this.f48830f = spotifyPackagename;
    }

    @Nonnull
    public static l j(@Nonnull Context context, @Nonnull ConnectionParams connectionParams, @Nonnull String spotifyPackagename) {
        com.spotify.protocol.client.d.a(context);
        com.spotify.protocol.client.d.a(connectionParams);
        com.spotify.protocol.client.d.a(spotifyPackagename);
        return new l(context, connectionParams, spotifyPackagename);
    }

    @Override // com.spotify.protocol.client.l
    public void a(@Nonnull l.a connectionCallback) {
        b bVar = new b(this.f48829e, connectionCallback);
        this.f48827c = bVar;
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.spotify.protocol.client.l
    public void c() {
        j jVar = this.f48825a;
        if (jVar != null) {
            jVar.c();
        }
    }

    @i0(otherwise = 5)
    @Nonnull
    public ConnectionParams k() {
        return this.f48829e;
    }

    @i0(otherwise = 5)
    @Nonnull
    public String l() {
        return this.f48830f;
    }

    public void m(@Nonnull com.spotify.protocol.client.h listener) {
        this.f48826b.l(listener);
        this.f48825a.n(listener);
    }
}

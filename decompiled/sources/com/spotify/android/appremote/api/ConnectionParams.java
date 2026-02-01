package com.spotify.android.appremote.api;

import com.spotify.protocol.client.n;
import java.util.List;

/* loaded from: classes2.dex */
public class ConnectionParams {

    /* renamed from: a, reason: collision with root package name */
    private final String f48745a;

    /* renamed from: b, reason: collision with root package name */
    private final String f48746b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f48747c;

    /* renamed from: d, reason: collision with root package name */
    private final List<String> f48748d;

    /* renamed from: e, reason: collision with root package name */
    private final H2.b f48749e;

    /* renamed from: f, reason: collision with root package name */
    private final AuthMethod f48750f;

    /* loaded from: classes2.dex */
    public enum AuthMethod {
        APP_ID,
        NONE
    }

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final String f48751a;

        /* renamed from: b, reason: collision with root package name */
        private AuthMethod f48752b;

        /* renamed from: c, reason: collision with root package name */
        private String f48753c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f48754d;

        /* renamed from: e, reason: collision with root package name */
        private List<String> f48755e;

        /* renamed from: f, reason: collision with root package name */
        private H2.b f48756f;

        public Builder(String clientId) {
            this.f48751a = clientId;
        }

        public ConnectionParams a() {
            return new ConnectionParams(this.f48751a, this.f48752b, this.f48753c, this.f48754d, this.f48755e, this.f48756f);
        }

        public Builder b(AuthMethod authMethod) {
            this.f48752b = authMethod;
            return this;
        }

        public Builder c(H2.b mapper) {
            this.f48756f = mapper;
            return this;
        }

        public Builder d(String redirectUri) {
            this.f48753c = redirectUri;
            return this;
        }

        public Builder e(List<String> requiredFeatures) {
            this.f48755e = requiredFeatures;
            return this;
        }

        public Builder f(boolean showAuthView) {
            this.f48754d = showAuthView;
            return this;
        }
    }

    public AuthMethod a() {
        return this.f48750f;
    }

    public String b() {
        return this.f48745a;
    }

    public H2.b c() {
        return this.f48749e;
    }

    public String d() {
        return this.f48746b;
    }

    public List<String> e() {
        return this.f48748d;
    }

    public boolean f() {
        return this.f48747c;
    }

    private ConnectionParams(String clientId, AuthMethod authMethod, String redirectUri, boolean showAuthView, List<String> requiredFeatures, H2.b jsonMapper) {
        this.f48745a = clientId;
        this.f48750f = authMethod == null ? AuthMethod.APP_ID : authMethod;
        this.f48747c = showAuthView;
        this.f48746b = redirectUri;
        this.f48748d = requiredFeatures == null ? n.f48891e : requiredFeatures;
        this.f48749e = jsonMapper == null ? com.spotify.protocol.mappers.gson.a.c() : jsonMapper;
    }
}

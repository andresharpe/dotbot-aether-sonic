package G2;

import com.spotify.protocol.error.SpotifyAppRemoteException;
import com.spotify.protocol.types.b;
import java.util.List;

/* loaded from: classes2.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f623a = "wamp.error.invalid_uri";

    /* renamed from: b, reason: collision with root package name */
    public static final String f624b = "wamp.error.invalid_argument";

    /* renamed from: c, reason: collision with root package name */
    public static final String f625c = "wamp.error.system_shutdown";

    /* renamed from: d, reason: collision with root package name */
    public static final String f626d = "wamp.client_request.system_shutdown";

    /* renamed from: e, reason: collision with root package name */
    public static final String f627e = "wamp.error";

    /* loaded from: classes2.dex */
    public interface a {
        void a(b.a requestId, H2.c details, String errorUri);

        void b(H2.c details, String reasonUri);

        void c(b.a requestId, H2.c details, String errorUri);

        void d(b.C0436b subscriptionId, int publicationId, H2.c data);

        void e(b.a requestId, H2.c details, H2.c arguments, H2.c argumentsKw);

        void f(int sessionId, H2.c details);

        void g(b.a requestId, b.C0436b subscriptionId);

        void h(b.a requestId);

        void i(b.a requestId, H2.c details, String errorUri);

        void j(H2.c details, String reasonUri);
    }

    /* renamed from: G2.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0009b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f628a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f629b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f630c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f631d = 6;

        /* renamed from: e, reason: collision with root package name */
        public static final int f632e = 8;

        /* renamed from: f, reason: collision with root package name */
        public static final int f633f = 32;

        /* renamed from: g, reason: collision with root package name */
        public static final int f634g = 33;

        /* renamed from: h, reason: collision with root package name */
        public static final int f635h = 34;

        /* renamed from: i, reason: collision with root package name */
        public static final int f636i = 35;

        /* renamed from: j, reason: collision with root package name */
        public static final int f637j = 36;

        /* renamed from: k, reason: collision with root package name */
        public static final int f638k = 48;

        /* renamed from: l, reason: collision with root package name */
        public static final int f639l = 49;

        /* renamed from: m, reason: collision with root package name */
        public static final int f640m = 50;
    }

    /* loaded from: classes2.dex */
    public interface c {
        boolean a(G2.c wampMessage);

        void b(a receiver);

        void c(a receiver);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(int requestId, Object options, String procedureUri) throws SpotifyAppRemoteException;

        void c() throws SpotifyAppRemoteException;

        void d(int requestId, Object options);

        void e() throws SpotifyAppRemoteException;

        void f(int requestId, Object options, String topicUri) throws SpotifyAppRemoteException;

        void g(int requestId, int subscriptionId) throws SpotifyAppRemoteException;

        void h(int requestId, Object options, String procedureUri, List<Object> arguments) throws SpotifyAppRemoteException;

        void i(int requestId, Object options, String procedureUri, List<Object> arguments, Object item) throws SpotifyAppRemoteException;
    }
}

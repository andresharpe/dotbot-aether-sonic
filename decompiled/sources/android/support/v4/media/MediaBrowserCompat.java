package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.C0635k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    static final String f3846b = "MediaBrowserCompat";

    /* renamed from: c, reason: collision with root package name */
    static final boolean f3847c = Log.isLoggable(f3846b, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3848d = "android.media.browse.extra.PAGE";

    /* renamed from: e, reason: collision with root package name */
    public static final String f3849e = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: f, reason: collision with root package name */
    public static final String f3850f = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f3851g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: h, reason: collision with root package name */
    public static final String f3852h = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: i, reason: collision with root package name */
    public static final String f3853i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a, reason: collision with root package name */
    private final e f3854a;

    /* loaded from: classes.dex */
    private static class CustomActionResultReceiver extends android.support.v4.os.b {

        /* renamed from: H, reason: collision with root package name */
        private final String f3855H;

        /* renamed from: I, reason: collision with root package name */
        private final Bundle f3856I;

        /* renamed from: J, reason: collision with root package name */
        private final c f3857J;

        CustomActionResultReceiver(String str, Bundle bundle, c cVar, Handler handler) {
            super(handler);
            this.f3855H = str;
            this.f3856I = bundle;
            this.f3857J = cVar;
        }

        @Override // android.support.v4.os.b
        protected void a(int i4, Bundle bundle) {
            if (this.f3857J == null) {
                return;
            }
            MediaSessionCompat.b(bundle);
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        Log.w(MediaBrowserCompat.f3846b, "Unknown result code: " + i4 + " (extras=" + this.f3856I + ", resultData=" + bundle + ")");
                        return;
                    }
                    this.f3857J.b(this.f3855H, this.f3856I, bundle);
                    return;
                }
                this.f3857J.c(this.f3855H, this.f3856I, bundle);
                return;
            }
            this.f3857J.a(this.f3855H, this.f3856I, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ItemReceiver extends android.support.v4.os.b {

        /* renamed from: H, reason: collision with root package name */
        private final String f3858H;

        /* renamed from: I, reason: collision with root package name */
        private final d f3859I;

        ItemReceiver(String str, d dVar, Handler handler) {
            super(handler);
            this.f3858H = str;
            this.f3859I = dVar;
        }

        @Override // android.support.v4.os.b
        protected void a(int i4, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i4 == 0 && bundle != null && bundle.containsKey(androidx.media.d.f15941N)) {
                Parcelable parcelable = bundle.getParcelable(androidx.media.d.f15941N);
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.f3859I.a(this.f3858H);
                    return;
                } else {
                    this.f3859I.b((MediaItem) parcelable);
                    return;
                }
            }
            this.f3859I.a(this.f3858H);
        }
    }

    /* loaded from: classes.dex */
    private static class SearchResultReceiver extends android.support.v4.os.b {

        /* renamed from: H, reason: collision with root package name */
        private final String f3864H;

        /* renamed from: I, reason: collision with root package name */
        private final Bundle f3865I;

        /* renamed from: J, reason: collision with root package name */
        private final k f3866J;

        SearchResultReceiver(String str, Bundle bundle, k kVar, Handler handler) {
            super(handler);
            this.f3864H = str;
            this.f3865I = bundle;
            this.f3866J = kVar;
        }

        @Override // android.support.v4.os.b
        protected void a(int i4, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.b(bundle);
            if (i4 == 0 && bundle != null && bundle.containsKey(androidx.media.d.f15942O)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(androidx.media.d.f15942O);
                if (parcelableArray != null) {
                    arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                } else {
                    arrayList = null;
                }
                this.f3866J.b(this.f3864H, this.f3865I, arrayList);
                return;
            }
            this.f3866J.a(this.f3864H, this.f3865I);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<j> f3867a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<Messenger> f3868b;

        a(j jVar) {
            this.f3867a = new WeakReference<>(jVar);
        }

        void a(Messenger messenger) {
            this.f3868b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f3868b;
            if (weakReference != null && weakReference.get() != null && this.f3867a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j jVar = this.f3867a.get();
                Messenger messenger = this.f3868b.get();
                try {
                    int i4 = message.what;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                Log.w(MediaBrowserCompat.f3846b, "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            } else {
                                Bundle bundle = data.getBundle(androidx.media.c.f15917g);
                                MediaSessionCompat.b(bundle);
                                Bundle bundle2 = data.getBundle(androidx.media.c.f15918h);
                                MediaSessionCompat.b(bundle2);
                                jVar.l(messenger, data.getString(androidx.media.c.f15914d), data.getParcelableArrayList(androidx.media.c.f15915e), bundle, bundle2);
                            }
                        } else {
                            jVar.o(messenger);
                        }
                    } else {
                        Bundle bundle3 = data.getBundle(androidx.media.c.f15921k);
                        MediaSessionCompat.b(bundle3);
                        jVar.j(messenger, data.getString(androidx.media.c.f15914d), (MediaSessionCompat.Token) data.getParcelable(androidx.media.c.f15916f), bundle3);
                    }
                } catch (BadParcelableException unused) {
                    Log.e(MediaBrowserCompat.f3846b, "Could not unparcel the data.");
                    if (message.what == 1) {
                        jVar.o(messenger);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f3869a = android.support.v4.media.a.c(new C0024b());

        /* renamed from: b, reason: collision with root package name */
        a f3870b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            void e();

            void g();

            void h();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0024b implements a.InterfaceC0026a {
            C0024b() {
            }

            @Override // android.support.v4.media.a.InterfaceC0026a
            public void e() {
                a aVar = b.this.f3870b;
                if (aVar != null) {
                    aVar.e();
                }
                b.this.c();
            }

            @Override // android.support.v4.media.a.InterfaceC0026a
            public void g() {
                a aVar = b.this.f3870b;
                if (aVar != null) {
                    aVar.g();
                }
                b.this.a();
            }

            @Override // android.support.v4.media.a.InterfaceC0026a
            public void h() {
                a aVar = b.this.f3870b;
                if (aVar != null) {
                    aVar.h();
                }
                b.this.b();
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        void d(a aVar) {
            this.f3870b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f3872a = android.support.v4.media.b.a(new a());

        /* loaded from: classes.dex */
        private class a implements b.a {
            a() {
            }

            @Override // android.support.v4.media.b.a
            public void a(@N String str) {
                d.this.a(str);
            }

            @Override // android.support.v4.media.b.a
            public void b(Parcel parcel) {
                if (parcel == null) {
                    d.this.b(null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem createFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                d.this.b(createFromParcel);
            }
        }

        public void a(@N String str) {
        }

        public void b(MediaItem mediaItem) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        boolean a();

        @N
        MediaSessionCompat.Token b();

        void c();

        @N
        String d();

        void f();

        @P
        Bundle getExtras();

        void i(@N String str, Bundle bundle, @P c cVar);

        ComponentName k();

        void m(@N String str, @N d dVar);

        void n(@N String str, @P Bundle bundle, @N n nVar);

        void p(@N String str, n nVar);

        void q(@N String str, Bundle bundle, @N k kVar);

        @P
        Bundle r();
    }

    @W(21)
    /* loaded from: classes.dex */
    static class f implements e, j, b.a {

        /* renamed from: a, reason: collision with root package name */
        final Context f3874a;

        /* renamed from: b, reason: collision with root package name */
        protected final Object f3875b;

        /* renamed from: c, reason: collision with root package name */
        protected final Bundle f3876c;

        /* renamed from: d, reason: collision with root package name */
        protected final a f3877d = new a(this);

        /* renamed from: e, reason: collision with root package name */
        private final androidx.collection.a<String, m> f3878e = new androidx.collection.a<>();

        /* renamed from: f, reason: collision with root package name */
        protected int f3879f;

        /* renamed from: g, reason: collision with root package name */
        protected l f3880g;

        /* renamed from: h, reason: collision with root package name */
        protected Messenger f3881h;

        /* renamed from: i, reason: collision with root package name */
        private MediaSessionCompat.Token f3882i;

        /* renamed from: j, reason: collision with root package name */
        private Bundle f3883j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f3884E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3885F;

            a(d dVar, String str) {
                this.f3884E = dVar;
                this.f3885F = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3884E.a(this.f3885F);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f3887E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3888F;

            b(d dVar, String str) {
                this.f3887E = dVar;
                this.f3888F = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3887E.a(this.f3888F);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f3890E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3891F;

            c(d dVar, String str) {
                this.f3890E = dVar;
                this.f3891F = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3890E.a(this.f3891F);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ k f3893E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3894F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3895G;

            d(k kVar, String str, Bundle bundle) {
                this.f3893E = kVar;
                this.f3894F = str;
                this.f3895G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3893E.a(this.f3894F, this.f3895G);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ k f3897E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3898F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3899G;

            e(k kVar, String str, Bundle bundle) {
                this.f3897E = kVar;
                this.f3898F = str;
                this.f3899G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3897E.a(this.f3898F, this.f3899G);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0025f implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ c f3901E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3902F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3903G;

            RunnableC0025f(c cVar, String str, Bundle bundle) {
                this.f3901E = cVar;
                this.f3902F = str;
                this.f3903G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3901E.a(this.f3902F, this.f3903G, null);
            }
        }

        /* loaded from: classes.dex */
        class g implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ c f3905E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3906F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3907G;

            g(c cVar, String str, Bundle bundle) {
                this.f3905E = cVar;
                this.f3906F = str;
                this.f3907G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3905E.a(this.f3906F, this.f3907G, null);
            }
        }

        f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f3874a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f3876c = bundle2;
            bundle2.putInt(androidx.media.c.f15926p, 1);
            bVar.d(this);
            this.f3875b = android.support.v4.media.a.b(context, componentName, bVar.f3869a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean a() {
            return android.support.v4.media.a.j(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @N
        public MediaSessionCompat.Token b() {
            if (this.f3882i == null) {
                this.f3882i = MediaSessionCompat.Token.b(android.support.v4.media.a.i(this.f3875b));
            }
            return this.f3882i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void c() {
            Messenger messenger;
            l lVar = this.f3880g;
            if (lVar != null && (messenger = this.f3881h) != null) {
                try {
                    lVar.j(messenger);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error unregistering client messenger.");
                }
            }
            android.support.v4.media.a.e(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @N
        public String d() {
            return android.support.v4.media.a.g(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void e() {
            this.f3880g = null;
            this.f3881h = null;
            this.f3882i = null;
            this.f3877d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f() {
            android.support.v4.media.a.a(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void g() {
            Bundle f4 = android.support.v4.media.a.f(this.f3875b);
            if (f4 == null) {
                return;
            }
            this.f3879f = f4.getInt(androidx.media.c.f15927q, 0);
            IBinder a4 = C0635k.a(f4, androidx.media.c.f15928r);
            if (a4 != null) {
                this.f3880g = new l(a4, this.f3876c);
                Messenger messenger = new Messenger(this.f3877d);
                this.f3881h = messenger;
                this.f3877d.a(messenger);
                try {
                    this.f3880g.e(this.f3874a, this.f3881h);
                } catch (RemoteException unused) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error registering client messenger.");
                }
            }
            android.support.v4.media.session.b v3 = b.a.v(C0635k.a(f4, androidx.media.c.f15929s));
            if (v3 != null) {
                this.f3882i = MediaSessionCompat.Token.c(android.support.v4.media.a.i(this.f3875b), v3);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @P
        public Bundle getExtras() {
            return android.support.v4.media.a.f(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b.a
        public void h() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void i(@N String str, Bundle bundle, @P c cVar) {
            if (a()) {
                if (this.f3880g == null) {
                    Log.i(MediaBrowserCompat.f3846b, "The connected service doesn't support sendCustomAction.");
                    if (cVar != null) {
                        this.f3877d.post(new RunnableC0025f(cVar, str, bundle));
                    }
                }
                try {
                    this.f3880g.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f3877d), this.f3881h);
                    return;
                } catch (RemoteException e4) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e4);
                    if (cVar != null) {
                        this.f3877d.post(new g(cVar, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public ComponentName k() {
            return android.support.v4.media.a.h(this.f3875b);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void l(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f3881h != messenger) {
                return;
            }
            m mVar = this.f3878e.get(str);
            if (mVar == null) {
                if (MediaBrowserCompat.f3847c) {
                    Log.d(MediaBrowserCompat.f3846b, "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            n a4 = mVar.a(bundle);
            if (a4 != null) {
                if (bundle == null) {
                    if (list == null) {
                        a4.c(str);
                        return;
                    }
                    this.f3883j = bundle2;
                    a4.a(str, list);
                    this.f3883j = null;
                    return;
                }
                if (list == null) {
                    a4.d(str, bundle);
                    return;
                }
                this.f3883j = bundle2;
                a4.b(str, list, bundle);
                this.f3883j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void m(@N String str, @N d dVar) {
            if (!TextUtils.isEmpty(str)) {
                if (dVar != null) {
                    if (!android.support.v4.media.a.j(this.f3875b)) {
                        Log.i(MediaBrowserCompat.f3846b, "Not connected, unable to retrieve the MediaItem.");
                        this.f3877d.post(new a(dVar, str));
                        return;
                    }
                    if (this.f3880g == null) {
                        this.f3877d.post(new b(dVar, str));
                        return;
                    }
                    try {
                        this.f3880g.d(str, new ItemReceiver(str, dVar, this.f3877d), this.f3881h);
                        return;
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.f3846b, "Remote error getting media item: " + str);
                        this.f3877d.post(new c(dVar, str));
                        return;
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void n(@N String str, Bundle bundle, @N n nVar) {
            Bundle bundle2;
            m mVar = this.f3878e.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f3878e.put(str, mVar);
            }
            nVar.e(mVar);
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.e(bundle2, nVar);
            l lVar = this.f3880g;
            if (lVar == null) {
                android.support.v4.media.a.k(this.f3875b, str, nVar.f3954a);
                return;
            }
            try {
                lVar.a(str, nVar.f3955b, bundle2, this.f3881h);
            } catch (RemoteException unused) {
                Log.i(MediaBrowserCompat.f3846b, "Remote error subscribing media item: " + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void o(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void p(@N String str, n nVar) {
            m mVar = this.f3878e.get(str);
            if (mVar == null) {
                return;
            }
            l lVar = this.f3880g;
            if (lVar == null) {
                if (nVar == null) {
                    android.support.v4.media.a.l(this.f3875b, str);
                } else {
                    List<n> b4 = mVar.b();
                    List<Bundle> c4 = mVar.c();
                    for (int size = b4.size() - 1; size >= 0; size--) {
                        if (b4.get(size) == nVar) {
                            b4.remove(size);
                            c4.remove(size);
                        }
                    }
                    if (b4.size() == 0) {
                        android.support.v4.media.a.l(this.f3875b, str);
                    }
                }
            } else {
                try {
                    if (nVar == null) {
                        lVar.f(str, null, this.f3881h);
                    } else {
                        List<n> b5 = mVar.b();
                        List<Bundle> c5 = mVar.c();
                        for (int size2 = b5.size() - 1; size2 >= 0; size2--) {
                            if (b5.get(size2) == nVar) {
                                this.f3880g.f(str, nVar.f3955b, this.f3881h);
                                b5.remove(size2);
                                c5.remove(size2);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f3846b, "removeSubscription failed with RemoteException parentId=" + str);
                }
            }
            if (mVar.d() || nVar == null) {
                this.f3878e.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void q(@N String str, Bundle bundle, @N k kVar) {
            if (a()) {
                if (this.f3880g == null) {
                    Log.i(MediaBrowserCompat.f3846b, "The connected service doesn't support search.");
                    this.f3877d.post(new d(kVar, str, bundle));
                    return;
                }
                try {
                    this.f3880g.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f3877d), this.f3881h);
                    return;
                } catch (RemoteException e4) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error searching items with query: " + str, e4);
                    this.f3877d.post(new e(kVar, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle r() {
            return this.f3883j;
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    static class g extends f {
        g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void m(@N String str, @N d dVar) {
            if (this.f3880g == null) {
                android.support.v4.media.b.b(this.f3875b, str, dVar.f3872a);
            } else {
                super.m(str, dVar);
            }
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    static class h extends g {
        h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void n(@N String str, @P Bundle bundle, @N n nVar) {
            if (this.f3880g != null && this.f3879f >= 2) {
                super.n(str, bundle, nVar);
            } else if (bundle == null) {
                android.support.v4.media.a.k(this.f3875b, str, nVar.f3954a);
            } else {
                android.support.v4.media.c.b(this.f3875b, str, bundle, nVar.f3954a);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.f, android.support.v4.media.MediaBrowserCompat.e
        public void p(@N String str, n nVar) {
            if (this.f3880g != null && this.f3879f >= 2) {
                super.p(str, nVar);
            } else if (nVar == null) {
                android.support.v4.media.a.l(this.f3875b, str);
            } else {
                android.support.v4.media.c.c(this.f3875b, str, nVar.f3954a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i implements e, j {

        /* renamed from: o, reason: collision with root package name */
        static final int f3909o = 0;

        /* renamed from: p, reason: collision with root package name */
        static final int f3910p = 1;

        /* renamed from: q, reason: collision with root package name */
        static final int f3911q = 2;

        /* renamed from: r, reason: collision with root package name */
        static final int f3912r = 3;

        /* renamed from: s, reason: collision with root package name */
        static final int f3913s = 4;

        /* renamed from: a, reason: collision with root package name */
        final Context f3914a;

        /* renamed from: b, reason: collision with root package name */
        final ComponentName f3915b;

        /* renamed from: c, reason: collision with root package name */
        final b f3916c;

        /* renamed from: d, reason: collision with root package name */
        final Bundle f3917d;

        /* renamed from: e, reason: collision with root package name */
        final a f3918e = new a(this);

        /* renamed from: f, reason: collision with root package name */
        private final androidx.collection.a<String, m> f3919f = new androidx.collection.a<>();

        /* renamed from: g, reason: collision with root package name */
        int f3920g = 1;

        /* renamed from: h, reason: collision with root package name */
        g f3921h;

        /* renamed from: i, reason: collision with root package name */
        l f3922i;

        /* renamed from: j, reason: collision with root package name */
        Messenger f3923j;

        /* renamed from: k, reason: collision with root package name */
        private String f3924k;

        /* renamed from: l, reason: collision with root package name */
        private MediaSessionCompat.Token f3925l;

        /* renamed from: m, reason: collision with root package name */
        private Bundle f3926m;

        /* renamed from: n, reason: collision with root package name */
        private Bundle f3927n;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
            
                if (r2.f3914a.bindService(r1, r2.f3921h, 1) == false) goto L21;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r5 = this;
                    java.lang.String r0 = "MediaBrowserCompat"
                    android.support.v4.media.MediaBrowserCompat$i r1 = android.support.v4.media.MediaBrowserCompat.i.this
                    int r2 = r1.f3920g
                    if (r2 != 0) goto L9
                    return
                L9:
                    r2 = 2
                    r1.f3920g = r2
                    boolean r2 = android.support.v4.media.MediaBrowserCompat.f3847c
                    if (r2 == 0) goto L30
                    android.support.v4.media.MediaBrowserCompat$i$g r2 = r1.f3921h
                    if (r2 != 0) goto L15
                    goto L30
                L15:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "mServiceConnection should be null. Instead it is "
                    r1.append(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.support.v4.media.MediaBrowserCompat$i$g r2 = r2.f3921h
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L30:
                    android.support.v4.media.MediaBrowserCompat$l r2 = r1.f3922i
                    if (r2 != 0) goto Lab
                    android.os.Messenger r1 = r1.f3923j
                    if (r1 != 0) goto L90
                    android.content.Intent r1 = new android.content.Intent
                    java.lang.String r2 = "android.media.browse.MediaBrowserService"
                    r1.<init>(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.content.ComponentName r2 = r2.f3915b
                    r1.setComponent(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.support.v4.media.MediaBrowserCompat$i$g r3 = new android.support.v4.media.MediaBrowserCompat$i$g
                    r3.<init>()
                    r2.f3921h = r3
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this     // Catch: java.lang.Exception -> L5d
                    android.content.Context r3 = r2.f3914a     // Catch: java.lang.Exception -> L5d
                    android.support.v4.media.MediaBrowserCompat$i$g r2 = r2.f3921h     // Catch: java.lang.Exception -> L5d
                    r4 = 1
                    boolean r1 = r3.bindService(r1, r2, r4)     // Catch: java.lang.Exception -> L5d
                    if (r1 != 0) goto L81
                    goto L75
                L5d:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Failed binding to service "
                    r1.append(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.content.ComponentName r2 = r2.f3915b
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    android.util.Log.e(r0, r1)
                L75:
                    android.support.v4.media.MediaBrowserCompat$i r1 = android.support.v4.media.MediaBrowserCompat.i.this
                    r1.g()
                    android.support.v4.media.MediaBrowserCompat$i r1 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.support.v4.media.MediaBrowserCompat$b r1 = r1.f3916c
                    r1.b()
                L81:
                    boolean r1 = android.support.v4.media.MediaBrowserCompat.f3847c
                    if (r1 == 0) goto L8f
                    java.lang.String r1 = "connect..."
                    android.util.Log.d(r0, r1)
                    android.support.v4.media.MediaBrowserCompat$i r0 = android.support.v4.media.MediaBrowserCompat.i.this
                    r0.e()
                L8f:
                    return
                L90:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "mCallbacksMessenger should be null. Instead it is "
                    r1.append(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.os.Messenger r2 = r2.f3923j
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                Lab:
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "mServiceBinderWrapper should be null. Instead it is "
                    r1.append(r2)
                    android.support.v4.media.MediaBrowserCompat$i r2 = android.support.v4.media.MediaBrowserCompat.i.this
                    android.support.v4.media.MediaBrowserCompat$l r2 = r2.f3922i
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.i.a.run():void");
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.f3923j;
                if (messenger != null) {
                    try {
                        iVar.f3922i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w(MediaBrowserCompat.f3846b, "RemoteException during connect for " + i.this.f3915b);
                    }
                }
                i iVar2 = i.this;
                int i4 = iVar2.f3920g;
                iVar2.g();
                if (i4 != 0) {
                    i.this.f3920g = i4;
                }
                if (MediaBrowserCompat.f3847c) {
                    Log.d(MediaBrowserCompat.f3846b, "disconnect...");
                    i.this.e();
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f3930E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3931F;

            c(d dVar, String str) {
                this.f3930E = dVar;
                this.f3931F = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3930E.a(this.f3931F);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ d f3933E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3934F;

            d(d dVar, String str) {
                this.f3933E = dVar;
                this.f3934F = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3933E.a(this.f3934F);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ k f3936E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3937F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3938G;

            e(k kVar, String str, Bundle bundle) {
                this.f3936E = kVar;
                this.f3937F = str;
                this.f3938G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3936E.a(this.f3937F, this.f3938G);
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ c f3940E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f3941F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f3942G;

            f(c cVar, String str, Bundle bundle) {
                this.f3940E = cVar;
                this.f3941F = str;
                this.f3942G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3940E.a(this.f3941F, this.f3942G, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public class g implements ServiceConnection {

            /* loaded from: classes.dex */
            class a implements Runnable {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ ComponentName f3945E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ IBinder f3946F;

                a(ComponentName componentName, IBinder iBinder) {
                    this.f3945E = componentName;
                    this.f3946F = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z3 = MediaBrowserCompat.f3847c;
                    if (z3) {
                        Log.d(MediaBrowserCompat.f3846b, "MediaServiceConnection.onServiceConnected name=" + this.f3945E + " binder=" + this.f3946F);
                        i.this.e();
                    }
                    if (!g.this.a("onServiceConnected")) {
                        return;
                    }
                    i iVar = i.this;
                    iVar.f3922i = new l(this.f3946F, iVar.f3917d);
                    i.this.f3923j = new Messenger(i.this.f3918e);
                    i iVar2 = i.this;
                    iVar2.f3918e.a(iVar2.f3923j);
                    i.this.f3920g = 2;
                    if (z3) {
                        try {
                            Log.d(MediaBrowserCompat.f3846b, "ServiceCallbacks.onConnect...");
                            i.this.e();
                        } catch (RemoteException unused) {
                            Log.w(MediaBrowserCompat.f3846b, "RemoteException during connect for " + i.this.f3915b);
                            if (MediaBrowserCompat.f3847c) {
                                Log.d(MediaBrowserCompat.f3846b, "ServiceCallbacks.onConnect...");
                                i.this.e();
                                return;
                            }
                            return;
                        }
                    }
                    i iVar3 = i.this;
                    iVar3.f3922i.b(iVar3.f3914a, iVar3.f3923j);
                }
            }

            /* loaded from: classes.dex */
            class b implements Runnable {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ ComponentName f3948E;

                b(ComponentName componentName) {
                    this.f3948E = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f3847c) {
                        Log.d(MediaBrowserCompat.f3846b, "MediaServiceConnection.onServiceDisconnected name=" + this.f3948E + " this=" + this + " mServiceConnection=" + i.this.f3921h);
                        i.this.e();
                    }
                    if (!g.this.a("onServiceDisconnected")) {
                        return;
                    }
                    i iVar = i.this;
                    iVar.f3922i = null;
                    iVar.f3923j = null;
                    iVar.f3918e.a(null);
                    i iVar2 = i.this;
                    iVar2.f3920g = 4;
                    iVar2.f3916c.c();
                }
            }

            g() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == i.this.f3918e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.f3918e.post(runnable);
                }
            }

            boolean a(String str) {
                int i4;
                i iVar = i.this;
                if (iVar.f3921h == this && (i4 = iVar.f3920g) != 0 && i4 != 1) {
                    return true;
                }
                int i5 = iVar.f3920g;
                if (i5 != 0 && i5 != 1) {
                    Log.i(MediaBrowserCompat.f3846b, str + " for " + i.this.f3915b + " with mServiceConnection=" + i.this.f3921h + " this=" + this);
                    return false;
                }
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context != null) {
                if (componentName != null) {
                    if (bVar != null) {
                        this.f3914a = context;
                        this.f3915b = componentName;
                        this.f3916c = bVar;
                        if (bundle == null) {
                            bundle2 = null;
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        this.f3917d = bundle2;
                        return;
                    }
                    throw new IllegalArgumentException("connection callback must not be null");
                }
                throw new IllegalArgumentException("service component must not be null");
            }
            throw new IllegalArgumentException("context must not be null");
        }

        private static String h(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                return "UNKNOWN/" + i4;
                            }
                            return "CONNECT_STATE_SUSPENDED";
                        }
                        return "CONNECT_STATE_CONNECTED";
                    }
                    return "CONNECT_STATE_CONNECTING";
                }
                return "CONNECT_STATE_DISCONNECTED";
            }
            return "CONNECT_STATE_DISCONNECTING";
        }

        private boolean s(Messenger messenger, String str) {
            int i4;
            if (this.f3923j == messenger && (i4 = this.f3920g) != 0 && i4 != 1) {
                return true;
            }
            int i5 = this.f3920g;
            if (i5 != 0 && i5 != 1) {
                Log.i(MediaBrowserCompat.f3846b, str + " for " + this.f3915b + " with mCallbacksMessenger=" + this.f3923j + " this=" + this);
                return false;
            }
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public boolean a() {
            if (this.f3920g == 3) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @N
        public MediaSessionCompat.Token b() {
            if (a()) {
                return this.f3925l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f3920g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void c() {
            this.f3920g = 0;
            this.f3918e.post(new b());
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @N
        public String d() {
            if (a()) {
                return this.f3924k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + h(this.f3920g) + ")");
        }

        void e() {
            Log.d(MediaBrowserCompat.f3846b, "MediaBrowserCompat...");
            Log.d(MediaBrowserCompat.f3846b, "  mServiceComponent=" + this.f3915b);
            Log.d(MediaBrowserCompat.f3846b, "  mCallback=" + this.f3916c);
            Log.d(MediaBrowserCompat.f3846b, "  mRootHints=" + this.f3917d);
            Log.d(MediaBrowserCompat.f3846b, "  mState=" + h(this.f3920g));
            Log.d(MediaBrowserCompat.f3846b, "  mServiceConnection=" + this.f3921h);
            Log.d(MediaBrowserCompat.f3846b, "  mServiceBinderWrapper=" + this.f3922i);
            Log.d(MediaBrowserCompat.f3846b, "  mCallbacksMessenger=" + this.f3923j);
            Log.d(MediaBrowserCompat.f3846b, "  mRootId=" + this.f3924k);
            Log.d(MediaBrowserCompat.f3846b, "  mMediaSessionToken=" + this.f3925l);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void f() {
            int i4 = this.f3920g;
            if (i4 != 0 && i4 != 1) {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + h(this.f3920g) + ")");
            }
            this.f3920g = 2;
            this.f3918e.post(new a());
        }

        void g() {
            g gVar = this.f3921h;
            if (gVar != null) {
                this.f3914a.unbindService(gVar);
            }
            this.f3920g = 1;
            this.f3921h = null;
            this.f3922i = null;
            this.f3923j = null;
            this.f3918e.a(null);
            this.f3924k = null;
            this.f3925l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @P
        public Bundle getExtras() {
            if (a()) {
                return this.f3926m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + h(this.f3920g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void i(@N String str, Bundle bundle, @P c cVar) {
            if (a()) {
                try {
                    this.f3922i.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f3918e), this.f3923j);
                    return;
                } catch (RemoteException e4) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error sending a custom action: action=" + str + ", extras=" + bundle, e4);
                    if (cVar != null) {
                        this.f3918e.post(new f(cVar, str, bundle));
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (!s(messenger, "onConnect")) {
                return;
            }
            if (this.f3920g != 2) {
                Log.w(MediaBrowserCompat.f3846b, "onConnect from service while mState=" + h(this.f3920g) + "... ignoring");
                return;
            }
            this.f3924k = str;
            this.f3925l = token;
            this.f3926m = bundle;
            this.f3920g = 3;
            if (MediaBrowserCompat.f3847c) {
                Log.d(MediaBrowserCompat.f3846b, "ServiceCallbacks.onConnect...");
                e();
            }
            this.f3916c.a();
            try {
                for (Map.Entry<String, m> entry : this.f3919f.entrySet()) {
                    String key = entry.getKey();
                    m value = entry.getValue();
                    List<n> b4 = value.b();
                    List<Bundle> c4 = value.c();
                    for (int i4 = 0; i4 < b4.size(); i4++) {
                        this.f3922i.a(key, b4.get(i4).f3955b, c4.get(i4), this.f3923j);
                    }
                }
            } catch (RemoteException unused) {
                Log.d(MediaBrowserCompat.f3846b, "addSubscription failed with RemoteException.");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        @N
        public ComponentName k() {
            if (a()) {
                return this.f3915b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f3920g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void l(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (!s(messenger, "onLoadChildren")) {
                return;
            }
            boolean z3 = MediaBrowserCompat.f3847c;
            if (z3) {
                Log.d(MediaBrowserCompat.f3846b, "onLoadChildren for " + this.f3915b + " id=" + str);
            }
            m mVar = this.f3919f.get(str);
            if (mVar == null) {
                if (z3) {
                    Log.d(MediaBrowserCompat.f3846b, "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            n a4 = mVar.a(bundle);
            if (a4 != null) {
                if (bundle == null) {
                    if (list == null) {
                        a4.c(str);
                        return;
                    }
                    this.f3927n = bundle2;
                    a4.a(str, list);
                    this.f3927n = null;
                    return;
                }
                if (list == null) {
                    a4.d(str, bundle);
                    return;
                }
                this.f3927n = bundle2;
                a4.b(str, list, bundle);
                this.f3927n = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void m(@N String str, @N d dVar) {
            if (!TextUtils.isEmpty(str)) {
                if (dVar != null) {
                    if (!a()) {
                        Log.i(MediaBrowserCompat.f3846b, "Not connected, unable to retrieve the MediaItem.");
                        this.f3918e.post(new c(dVar, str));
                        return;
                    }
                    try {
                        this.f3922i.d(str, new ItemReceiver(str, dVar, this.f3918e), this.f3923j);
                        return;
                    } catch (RemoteException unused) {
                        Log.i(MediaBrowserCompat.f3846b, "Remote error getting media item: " + str);
                        this.f3918e.post(new d(dVar, str));
                        return;
                    }
                }
                throw new IllegalArgumentException("cb is null");
            }
            throw new IllegalArgumentException("mediaId is empty");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void n(@N String str, Bundle bundle, @N n nVar) {
            Bundle bundle2;
            m mVar = this.f3919f.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f3919f.put(str, mVar);
            }
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            mVar.e(bundle2, nVar);
            if (a()) {
                try {
                    this.f3922i.a(str, nVar.f3955b, bundle2, this.f3923j);
                } catch (RemoteException unused) {
                    Log.d(MediaBrowserCompat.f3846b, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.j
        public void o(Messenger messenger) {
            Log.e(MediaBrowserCompat.f3846b, "onConnectFailed for " + this.f3915b);
            if (!s(messenger, "onConnectFailed")) {
                return;
            }
            if (this.f3920g != 2) {
                Log.w(MediaBrowserCompat.f3846b, "onConnect from service while mState=" + h(this.f3920g) + "... ignoring");
                return;
            }
            g();
            this.f3916c.b();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void p(@N String str, n nVar) {
            m mVar = this.f3919f.get(str);
            if (mVar == null) {
                return;
            }
            try {
                if (nVar == null) {
                    if (a()) {
                        this.f3922i.f(str, null, this.f3923j);
                    }
                } else {
                    List<n> b4 = mVar.b();
                    List<Bundle> c4 = mVar.c();
                    for (int size = b4.size() - 1; size >= 0; size--) {
                        if (b4.get(size) == nVar) {
                            if (a()) {
                                this.f3922i.f(str, nVar.f3955b, this.f3923j);
                            }
                            b4.remove(size);
                            c4.remove(size);
                        }
                    }
                }
            } catch (RemoteException unused) {
                Log.d(MediaBrowserCompat.f3846b, "removeSubscription failed with RemoteException parentId=" + str);
            }
            if (mVar.d() || nVar == null) {
                this.f3919f.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public void q(@N String str, Bundle bundle, @N k kVar) {
            if (a()) {
                try {
                    this.f3922i.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f3918e), this.f3923j);
                    return;
                } catch (RemoteException e4) {
                    Log.i(MediaBrowserCompat.f3846b, "Remote error searching items with query: " + str, e4);
                    this.f3918e.post(new e(kVar, str, bundle));
                    return;
                }
            }
            throw new IllegalStateException("search() called while not connected (state=" + h(this.f3920g) + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e
        public Bundle r() {
            return this.f3927n;
        }
    }

    /* loaded from: classes.dex */
    interface j {
        void j(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void l(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void o(Messenger messenger);
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void a(@N String str, Bundle bundle) {
        }

        public void b(@N String str, Bundle bundle, @N List<MediaItem> list) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f3950a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f3951b;

        public l(IBinder iBinder, Bundle bundle) {
            this.f3950a = new Messenger(iBinder);
            this.f3951b = bundle;
        }

        private void i(int i4, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i4;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f3950a.send(obtain);
        }

        void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f15914d, str);
            C0635k.b(bundle2, androidx.media.c.f15911a, iBinder);
            bundle2.putBundle(androidx.media.c.f15917g, bundle);
            i(3, bundle2, messenger);
        }

        void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f15919i, context.getPackageName());
            bundle.putBundle(androidx.media.c.f15921k, this.f3951b);
            i(1, bundle, messenger);
        }

        void c(Messenger messenger) throws RemoteException {
            i(2, null, messenger);
        }

        void d(String str, android.support.v4.os.b bVar, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f15914d, str);
            bundle.putParcelable(androidx.media.c.f15920j, bVar);
            i(5, bundle, messenger);
        }

        void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f15919i, context.getPackageName());
            bundle.putBundle(androidx.media.c.f15921k, this.f3951b);
            i(6, bundle, messenger);
        }

        void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f15914d, str);
            C0635k.b(bundle, androidx.media.c.f15911a, iBinder);
            i(4, bundle, messenger);
        }

        void g(String str, Bundle bundle, android.support.v4.os.b bVar, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f15923m, str);
            bundle2.putBundle(androidx.media.c.f15922l, bundle);
            bundle2.putParcelable(androidx.media.c.f15920j, bVar);
            i(8, bundle2, messenger);
        }

        void h(String str, Bundle bundle, android.support.v4.os.b bVar, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f15924n, str);
            bundle2.putBundle(androidx.media.c.f15925o, bundle);
            bundle2.putParcelable(androidx.media.c.f15920j, bVar);
            i(9, bundle2, messenger);
        }

        void j(Messenger messenger) throws RemoteException {
            i(7, null, messenger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        private final List<n> f3952a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<Bundle> f3953b = new ArrayList();

        public n a(Bundle bundle) {
            for (int i4 = 0; i4 < this.f3953b.size(); i4++) {
                if (androidx.media.b.a(this.f3953b.get(i4), bundle)) {
                    return this.f3952a.get(i4);
                }
            }
            return null;
        }

        public List<n> b() {
            return this.f3952a;
        }

        public List<Bundle> c() {
            return this.f3953b;
        }

        public boolean d() {
            return this.f3952a.isEmpty();
        }

        public void e(Bundle bundle, n nVar) {
            for (int i4 = 0; i4 < this.f3953b.size(); i4++) {
                if (androidx.media.b.a(this.f3953b.get(i4), bundle)) {
                    this.f3952a.set(i4, nVar);
                    return;
                }
            }
            this.f3952a.add(nVar);
            this.f3953b.add(bundle);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {

        /* renamed from: a, reason: collision with root package name */
        final Object f3954a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f3955b = new Binder();

        /* renamed from: c, reason: collision with root package name */
        WeakReference<m> f3956c;

        /* loaded from: classes.dex */
        private class a implements a.d {
            a() {
            }

            @Override // android.support.v4.media.a.d
            public void a(@N String str) {
                n.this.c(str);
            }

            @Override // android.support.v4.media.a.d
            public void d(@N String str, List<?> list) {
                m mVar;
                WeakReference<m> weakReference = n.this.f3956c;
                if (weakReference == null) {
                    mVar = null;
                } else {
                    mVar = weakReference.get();
                }
                if (mVar == null) {
                    n.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b4 = MediaItem.b(list);
                List<n> b5 = mVar.b();
                List<Bundle> c4 = mVar.c();
                for (int i4 = 0; i4 < b5.size(); i4++) {
                    Bundle bundle = c4.get(i4);
                    if (bundle == null) {
                        n.this.a(str, b4);
                    } else {
                        n.this.b(str, e(b4, bundle), bundle);
                    }
                }
            }

            List<MediaItem> e(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i4 = bundle.getInt(MediaBrowserCompat.f3848d, -1);
                int i5 = bundle.getInt(MediaBrowserCompat.f3849e, -1);
                if (i4 == -1 && i5 == -1) {
                    return list;
                }
                int i6 = i5 * i4;
                int i7 = i6 + i5;
                if (i4 >= 0 && i5 >= 1 && i6 < list.size()) {
                    if (i7 > list.size()) {
                        i7 = list.size();
                    }
                    return list.subList(i6, i7);
                }
                return Collections.emptyList();
            }
        }

        /* loaded from: classes.dex */
        private class b extends a implements c.a {
            b() {
                super();
            }

            @Override // android.support.v4.media.c.a
            public void b(@N String str, @N Bundle bundle) {
                n.this.d(str, bundle);
            }

            @Override // android.support.v4.media.c.a
            public void c(@N String str, List<?> list, @N Bundle bundle) {
                n.this.b(str, MediaItem.b(list), bundle);
            }
        }

        public n() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f3954a = android.support.v4.media.c.a(new b());
            } else {
                this.f3954a = android.support.v4.media.a.d(new a());
            }
        }

        public void a(@N String str, @N List<MediaItem> list) {
        }

        public void b(@N String str, @N List<MediaItem> list, @N Bundle bundle) {
        }

        public void c(@N String str) {
        }

        public void d(@N String str, @N Bundle bundle) {
        }

        void e(m mVar) {
            this.f3956c = new WeakReference<>(mVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3854a = new h(context, componentName, bVar, bundle);
        } else {
            this.f3854a = new g(context, componentName, bVar, bundle);
        }
    }

    public void a() {
        this.f3854a.f();
    }

    public void b() {
        this.f3854a.c();
    }

    @P
    public Bundle c() {
        return this.f3854a.getExtras();
    }

    public void d(@N String str, @N d dVar) {
        this.f3854a.m(str, dVar);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Bundle e() {
        return this.f3854a.r();
    }

    @N
    public String f() {
        return this.f3854a.d();
    }

    @N
    public ComponentName g() {
        return this.f3854a.k();
    }

    @N
    public MediaSessionCompat.Token h() {
        return this.f3854a.b();
    }

    public boolean i() {
        return this.f3854a.a();
    }

    public void j(@N String str, Bundle bundle, @N k kVar) {
        if (!TextUtils.isEmpty(str)) {
            if (kVar != null) {
                this.f3854a.q(str, bundle, kVar);
                return;
            }
            throw new IllegalArgumentException("callback cannot be null");
        }
        throw new IllegalArgumentException("query cannot be empty");
    }

    public void k(@N String str, Bundle bundle, @P c cVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f3854a.i(str, bundle, cVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void l(@N String str, @N Bundle bundle, @N n nVar) {
        if (!TextUtils.isEmpty(str)) {
            if (nVar != null) {
                if (bundle != null) {
                    this.f3854a.n(str, bundle, nVar);
                    return;
                }
                throw new IllegalArgumentException("options are null");
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void m(@N String str, @N n nVar) {
        if (!TextUtils.isEmpty(str)) {
            if (nVar != null) {
                this.f3854a.n(str, null, nVar);
                return;
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void n(@N String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f3854a.p(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void o(@N String str, @N n nVar) {
        if (!TextUtils.isEmpty(str)) {
            if (nVar != null) {
                this.f3854a.p(str, nVar);
                return;
            }
            throw new IllegalArgumentException("callback is null");
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        public static final int f3860G = 1;

        /* renamed from: H, reason: collision with root package name */
        public static final int f3861H = 2;

        /* renamed from: E, reason: collision with root package name */
        private final int f3862E;

        /* renamed from: F, reason: collision with root package name */
        private final MediaDescriptionCompat f3863F;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i4) {
                return new MediaItem[i4];
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface b {
        }

        public MediaItem(@N MediaDescriptionCompat mediaDescriptionCompat, int i4) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.h())) {
                    this.f3862E = i4;
                    this.f3863F = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static MediaItem a(Object obj) {
            if (obj != null) {
                return new MediaItem(MediaDescriptionCompat.a(a.c.a(obj)), a.c.b(obj));
            }
            return null;
        }

        public static List<MediaItem> b(List<?> list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<?> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @N
        public MediaDescriptionCompat c() {
            return this.f3863F;
        }

        public int d() {
            return this.f3862E;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @P
        public String e() {
            return this.f3863F.h();
        }

        public boolean g() {
            if ((this.f3862E & 1) != 0) {
                return true;
            }
            return false;
        }

        public boolean h() {
            if ((this.f3862E & 2) != 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f3862E + ", mDescription=" + this.f3863F + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f3862E);
            this.f3863F.writeToParcel(parcel, i4);
        }

        MediaItem(Parcel parcel) {
            this.f3862E = parcel.readInt();
            this.f3863F = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}

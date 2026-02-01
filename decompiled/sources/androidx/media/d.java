package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSessionManager;
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
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.C0635k;
import androidx.media.f;
import androidx.media.g;
import androidx.media.h;
import androidx.media.i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends Service {

    /* renamed from: J, reason: collision with root package name */
    static final String f15937J = "MBServiceCompat";

    /* renamed from: K, reason: collision with root package name */
    static final boolean f15938K = Log.isLoggable(f15937J, 3);

    /* renamed from: L, reason: collision with root package name */
    private static final float f15939L = 1.0E-5f;

    /* renamed from: M, reason: collision with root package name */
    public static final String f15940M = "android.media.browse.MediaBrowserService";

    /* renamed from: N, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f15941N = "media_item";

    /* renamed from: O, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f15942O = "search_results";

    /* renamed from: P, reason: collision with root package name */
    static final int f15943P = 1;

    /* renamed from: Q, reason: collision with root package name */
    static final int f15944Q = 2;

    /* renamed from: R, reason: collision with root package name */
    static final int f15945R = 4;

    /* renamed from: S, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f15946S = -1;

    /* renamed from: T, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f15947T = 0;

    /* renamed from: U, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int f15948U = 1;

    /* renamed from: E, reason: collision with root package name */
    private g f15949E;

    /* renamed from: G, reason: collision with root package name */
    f f15951G;

    /* renamed from: I, reason: collision with root package name */
    MediaSessionCompat.Token f15953I;

    /* renamed from: F, reason: collision with root package name */
    final androidx.collection.a<IBinder, f> f15950F = new androidx.collection.a<>();

    /* renamed from: H, reason: collision with root package name */
    final q f15952H = new q();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f15954g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f15955h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f15956i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Bundle f15957j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f15954g = fVar;
            this.f15955h = str;
            this.f15956i = bundle;
            this.f15957j = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if (d.this.f15950F.get(this.f15954g.f15976f.asBinder()) != this.f15954g) {
                if (d.f15938K) {
                    Log.d(d.f15937J, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f15954g.f15971a + " id=" + this.f15955h);
                    return;
                }
                return;
            }
            if ((c() & 1) != 0) {
                list = d.this.b(list, this.f15956i);
            }
            try {
                this.f15954g.f15976f.a(this.f15955h, list, this.f15956i, this.f15957j);
            } catch (RemoteException unused) {
                Log.w(d.f15937J, "Calling onLoadChildren() failed for id=" + this.f15955h + " package=" + this.f15954g.f15971a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.support.v4.os.b f15959g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, android.support.v4.os.b bVar) {
            super(obj);
            this.f15959g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.f15959g.b(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(d.f15941N, mediaItem);
            this.f15959g.b(0, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.support.v4.os.b f15961g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, android.support.v4.os.b bVar) {
            super(obj);
            this.f15961g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) == 0 && list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(d.f15942O, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                this.f15961g.b(0, bundle);
                return;
            }
            this.f15961g.b(-1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.media.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0151d extends m<Bundle> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ android.support.v4.os.b f15963g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0151d(Object obj, android.support.v4.os.b bVar) {
            super(obj);
            this.f15963g = bVar;
        }

        @Override // androidx.media.d.m
        void e(Bundle bundle) {
            this.f15963g.b(-1, bundle);
        }

        @Override // androidx.media.d.m
        void f(Bundle bundle) {
            this.f15963g.b(1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(Bundle bundle) {
            this.f15963g.b(0, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: c, reason: collision with root package name */
        public static final String f15965c = "android.service.media.extra.RECENT";

        /* renamed from: d, reason: collision with root package name */
        public static final String f15966d = "android.service.media.extra.OFFLINE";

        /* renamed from: e, reason: collision with root package name */
        public static final String f15967e = "android.service.media.extra.SUGGESTED";

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public static final String f15968f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a, reason: collision with root package name */
        private final String f15969a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f15970b;

        public e(@N String str, @P Bundle bundle) {
            if (str != null) {
                this.f15969a = str;
                this.f15970b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle a() {
            return this.f15970b;
        }

        public String b() {
            return this.f15969a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f15971a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15972b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15973c;

        /* renamed from: d, reason: collision with root package name */
        public final i.b f15974d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f15975e;

        /* renamed from: f, reason: collision with root package name */
        public final o f15976f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<androidx.core.util.q<IBinder, Bundle>>> f15977g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        public e f15978h;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                d.this.f15950F.remove(fVar.f15976f.asBinder());
            }
        }

        f(String str, int i4, int i5, Bundle bundle, o oVar) {
            this.f15971a = str;
            this.f15972b = i4;
            this.f15973c = i5;
            this.f15974d = new i.b(str, i4, i5);
            this.f15975e = bundle;
            this.f15976f = oVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d.this.f15952H.post(new a());
        }
    }

    /* loaded from: classes.dex */
    interface g {
        Bundle b();

        void c();

        void d(i.b bVar, String str, Bundle bundle);

        i.b f();

        IBinder g(Intent intent);

        void j(String str, Bundle bundle);

        void k(MediaSessionCompat.Token token);
    }

    @W(21)
    /* loaded from: classes.dex */
    class h implements g, f.d {

        /* renamed from: a, reason: collision with root package name */
        final List<Bundle> f15981a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        Object f15982b;

        /* renamed from: c, reason: collision with root package name */
        Messenger f15983c;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f15985E;

            a(MediaSessionCompat.Token token) {
                this.f15985E = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!h.this.f15981a.isEmpty()) {
                    android.support.v4.media.session.b d4 = this.f15985E.d();
                    if (d4 != null) {
                        Iterator<Bundle> it = h.this.f15981a.iterator();
                        while (it.hasNext()) {
                            C0635k.b(it.next(), androidx.media.c.f15929s, d4.asBinder());
                        }
                    }
                    h.this.f15981a.clear();
                }
                androidx.media.f.e(h.this.f15982b, this.f15985E.g());
            }
        }

        /* loaded from: classes.dex */
        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ f.c f15987g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, f.c cVar) {
                super(obj);
                this.f15987g = cVar;
            }

            @Override // androidx.media.d.m
            public void b() {
                this.f15987g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f15987g.c(arrayList);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ String f15989E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ Bundle f15990F;

            c(String str, Bundle bundle) {
                this.f15989E = str;
                this.f15990F = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = d.this.f15950F.keySet().iterator();
                while (it.hasNext()) {
                    h.this.n(d.this.f15950F.get(it.next()), this.f15989E, this.f15990F);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.d$h$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0152d implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ i.b f15992E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f15993F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f15994G;

            RunnableC0152d(i.b bVar, String str, Bundle bundle) {
                this.f15992E = bVar;
                this.f15993F = str;
                this.f15994G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i4 = 0; i4 < d.this.f15950F.size(); i4++) {
                    f q4 = d.this.f15950F.q(i4);
                    if (q4.f15974d.equals(this.f15992E)) {
                        h.this.n(q4, this.f15993F, this.f15994G);
                    }
                }
            }
        }

        h() {
        }

        @Override // androidx.media.d.g
        public Bundle b() {
            if (this.f15983c == null) {
                return null;
            }
            f fVar = d.this.f15951G;
            if (fVar != null) {
                if (fVar.f15975e == null) {
                    return null;
                }
                return new Bundle(d.this.f15951G.f15975e);
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.d.g
        public void c() {
            Object a4 = androidx.media.f.a(d.this, this);
            this.f15982b = a4;
            androidx.media.f.d(a4);
        }

        @Override // androidx.media.d.g
        public void d(i.b bVar, String str, Bundle bundle) {
            l(bVar, str, bundle);
        }

        @Override // androidx.media.f.d
        public void e(String str, f.c<List<Parcel>> cVar) {
            d.this.m(str, new b(str, cVar));
        }

        @Override // androidx.media.d.g
        public i.b f() {
            f fVar = d.this.f15951G;
            if (fVar != null) {
                return fVar.f15974d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.d.g
        public IBinder g(Intent intent) {
            return androidx.media.f.c(this.f15982b, intent);
        }

        @Override // androidx.media.f.d
        public f.a i(String str, int i4, Bundle bundle) {
            Bundle bundle2;
            IBinder asBinder;
            if (bundle != null && bundle.getInt(androidx.media.c.f15926p, 0) != 0) {
                bundle.remove(androidx.media.c.f15926p);
                this.f15983c = new Messenger(d.this.f15952H);
                bundle2 = new Bundle();
                bundle2.putInt(androidx.media.c.f15927q, 2);
                C0635k.b(bundle2, androidx.media.c.f15928r, this.f15983c.getBinder());
                MediaSessionCompat.Token token = d.this.f15953I;
                if (token != null) {
                    android.support.v4.media.session.b d4 = token.d();
                    if (d4 == null) {
                        asBinder = null;
                    } else {
                        asBinder = d4.asBinder();
                    }
                    C0635k.b(bundle2, androidx.media.c.f15929s, asBinder);
                } else {
                    this.f15981a.add(bundle2);
                }
            } else {
                bundle2 = null;
            }
            d dVar = d.this;
            dVar.f15951G = new f(str, -1, i4, bundle, null);
            e l4 = d.this.l(str, i4, bundle);
            d.this.f15951G = null;
            if (l4 == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l4.a();
            } else if (l4.a() != null) {
                bundle2.putAll(l4.a());
            }
            return new f.a(l4.b(), bundle2);
        }

        @Override // androidx.media.d.g
        public void j(String str, Bundle bundle) {
            o(str, bundle);
            m(str, bundle);
        }

        @Override // androidx.media.d.g
        public void k(MediaSessionCompat.Token token) {
            d.this.f15952H.a(new a(token));
        }

        void l(i.b bVar, String str, Bundle bundle) {
            d.this.f15952H.post(new RunnableC0152d(bVar, str, bundle));
        }

        void m(String str, Bundle bundle) {
            d.this.f15952H.post(new c(str, bundle));
        }

        void n(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.q<IBinder, Bundle>> list = fVar.f15977g.get(str);
            if (list != null) {
                for (androidx.core.util.q<IBinder, Bundle> qVar : list) {
                    if (androidx.media.b.b(bundle, qVar.f13026b)) {
                        d.this.t(str, fVar, qVar.f13026b, bundle);
                    }
                }
            }
        }

        void o(String str, Bundle bundle) {
            androidx.media.f.b(this.f15982b, str);
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    class i extends h implements g.b {

        /* loaded from: classes.dex */
        class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ f.c f15997g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, f.c cVar) {
                super(obj);
                this.f15997g = cVar;
            }

            @Override // androidx.media.d.m
            public void b() {
                this.f15997g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(MediaBrowserCompat.MediaItem mediaItem) {
                if (mediaItem == null) {
                    this.f15997g.c(null);
                    return;
                }
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f15997g.c(obtain);
            }
        }

        i() {
            super();
        }

        @Override // androidx.media.g.b
        public void a(String str, f.c<Parcel> cVar) {
            d.this.o(str, new a(str, cVar));
        }

        @Override // androidx.media.d.h, androidx.media.d.g
        public void c() {
            Object a4 = androidx.media.g.a(d.this, this);
            this.f15982b = a4;
            androidx.media.f.d(a4);
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    class j extends i implements h.c {

        /* loaded from: classes.dex */
        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.b f16000g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, h.b bVar) {
                super(obj);
                this.f16000g = bVar;
            }

            @Override // androidx.media.d.m
            public void b() {
                this.f16000g.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f16000g.c(arrayList, c());
            }
        }

        j() {
            super();
        }

        @Override // androidx.media.d.h, androidx.media.d.g
        public Bundle b() {
            f fVar = d.this.f15951G;
            if (fVar != null) {
                if (fVar.f15975e == null) {
                    return null;
                }
                return new Bundle(d.this.f15951G.f15975e);
            }
            return androidx.media.h.b(this.f15982b);
        }

        @Override // androidx.media.d.i, androidx.media.d.h, androidx.media.d.g
        public void c() {
            Object a4 = androidx.media.h.a(d.this, this);
            this.f15982b = a4;
            androidx.media.f.d(a4);
        }

        @Override // androidx.media.h.c
        public void h(String str, h.b bVar, Bundle bundle) {
            d.this.n(str, new a(str, bVar), bundle);
        }

        @Override // androidx.media.d.h
        void o(String str, Bundle bundle) {
            if (bundle != null) {
                androidx.media.h.c(this.f15982b, str, bundle);
            } else {
                super.o(str, bundle);
            }
        }
    }

    @W(28)
    /* loaded from: classes.dex */
    class k extends j {
        k() {
            super();
        }

        @Override // androidx.media.d.h, androidx.media.d.g
        public i.b f() {
            MediaSessionManager.RemoteUserInfo currentBrowserInfo;
            f fVar = d.this.f15951G;
            if (fVar == null) {
                currentBrowserInfo = ((MediaBrowserService) this.f15982b).getCurrentBrowserInfo();
                return new i.b(currentBrowserInfo);
            }
            return fVar.f15974d;
        }
    }

    /* loaded from: classes.dex */
    class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f16003a;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f16005E;

            a(MediaSessionCompat.Token token) {
                this.f16005E = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = d.this.f15950F.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f15976f.c(next.f15978h.b(), this.f16005E, next.f15978h.a());
                    } catch (RemoteException unused) {
                        Log.w(d.f15937J, "Connection for " + next.f15971a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ String f16007E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ Bundle f16008F;

            b(String str, Bundle bundle) {
                this.f16007E = str;
                this.f16008F = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = d.this.f15950F.keySet().iterator();
                while (it.hasNext()) {
                    l.this.a(d.this.f15950F.get(it.next()), this.f16007E, this.f16008F);
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ i.b f16010E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16011F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f16012G;

            c(i.b bVar, String str, Bundle bundle) {
                this.f16010E = bVar;
                this.f16011F = str;
                this.f16012G = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                for (int i4 = 0; i4 < d.this.f15950F.size(); i4++) {
                    f q4 = d.this.f15950F.q(i4);
                    if (q4.f15974d.equals(this.f16010E)) {
                        l.this.a(q4, this.f16011F, this.f16012G);
                        return;
                    }
                }
            }
        }

        l() {
        }

        void a(f fVar, String str, Bundle bundle) {
            List<androidx.core.util.q<IBinder, Bundle>> list = fVar.f15977g.get(str);
            if (list != null) {
                for (androidx.core.util.q<IBinder, Bundle> qVar : list) {
                    if (androidx.media.b.b(bundle, qVar.f13026b)) {
                        d.this.t(str, fVar, qVar.f13026b, bundle);
                    }
                }
            }
        }

        @Override // androidx.media.d.g
        public Bundle b() {
            f fVar = d.this.f15951G;
            if (fVar != null) {
                if (fVar.f15975e == null) {
                    return null;
                }
                return new Bundle(d.this.f15951G.f15975e);
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.d.g
        public void c() {
            this.f16003a = new Messenger(d.this.f15952H);
        }

        @Override // androidx.media.d.g
        public void d(@N i.b bVar, @N String str, Bundle bundle) {
            d.this.f15952H.post(new c(bVar, str, bundle));
        }

        @Override // androidx.media.d.g
        public i.b f() {
            f fVar = d.this.f15951G;
            if (fVar != null) {
                return fVar.f15974d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        @Override // androidx.media.d.g
        public IBinder g(Intent intent) {
            if (d.f15940M.equals(intent.getAction())) {
                return this.f16003a.getBinder();
            }
            return null;
        }

        @Override // androidx.media.d.g
        public void j(@N String str, Bundle bundle) {
            d.this.f15952H.post(new b(str, bundle));
        }

        @Override // androidx.media.d.g
        public void k(MediaSessionCompat.Token token) {
            d.this.f15952H.post(new a(token));
        }
    }

    /* loaded from: classes.dex */
    public static class m<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f16014a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f16015b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16016c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16017d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16018e;

        /* renamed from: f, reason: collision with root package name */
        private int f16019f;

        m(Object obj) {
            this.f16014a = obj;
        }

        private void a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.f3851g)) {
                float f4 = bundle.getFloat(MediaBrowserCompat.f3851g);
                if (f4 < -1.0E-5f || f4 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        public void b() {
            if (!this.f16015b) {
                if (!this.f16016c) {
                    if (!this.f16018e) {
                        this.f16015b = true;
                        return;
                    }
                    throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f16014a);
                }
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f16014a);
            }
            throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f16014a);
        }

        int c() {
            return this.f16019f;
        }

        boolean d() {
            if (!this.f16015b && !this.f16016c && !this.f16018e) {
                return false;
            }
            return true;
        }

        void e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f16014a);
        }

        void f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f16014a);
        }

        void g(T t3) {
        }

        public void h(Bundle bundle) {
            if (!this.f16016c && !this.f16018e) {
                this.f16018e = true;
                e(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f16014a);
            }
        }

        public void i(Bundle bundle) {
            if (!this.f16016c && !this.f16018e) {
                a(bundle);
                this.f16017d = true;
                f(bundle);
            } else {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f16014a);
            }
        }

        public void j(T t3) {
            if (!this.f16016c && !this.f16018e) {
                this.f16016c = true;
                g(t3);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f16014a);
            }
        }

        void k(int i4) {
            this.f16019f = i4;
        }
    }

    /* loaded from: classes.dex */
    private class n {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16021E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16022F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f16023G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ int f16024H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ Bundle f16025I;

            a(o oVar, String str, int i4, int i5, Bundle bundle) {
                this.f16021E = oVar;
                this.f16022F = str;
                this.f16023G = i4;
                this.f16024H = i5;
                this.f16025I = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f16021E.asBinder();
                d.this.f15950F.remove(asBinder);
                f fVar = new f(this.f16022F, this.f16023G, this.f16024H, this.f16025I, this.f16021E);
                d dVar = d.this;
                dVar.f15951G = fVar;
                e l4 = dVar.l(this.f16022F, this.f16024H, this.f16025I);
                fVar.f15978h = l4;
                d dVar2 = d.this;
                dVar2.f15951G = null;
                if (l4 == null) {
                    Log.i(d.f15937J, "No root for client " + this.f16022F + " from service " + getClass().getName());
                    try {
                        this.f16021E.b();
                        return;
                    } catch (RemoteException unused) {
                        Log.w(d.f15937J, "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f16022F);
                        return;
                    }
                }
                try {
                    dVar2.f15950F.put(asBinder, fVar);
                    asBinder.linkToDeath(fVar, 0);
                    if (d.this.f15953I != null) {
                        this.f16021E.c(fVar.f15978h.b(), d.this.f15953I, fVar.f15978h.a());
                    }
                } catch (RemoteException unused2) {
                    Log.w(d.f15937J, "Calling onConnect() failed. Dropping client. pkg=" + this.f16022F);
                    d.this.f15950F.remove(asBinder);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16027E;

            b(o oVar) {
                this.f16027E = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = d.this.f15950F.remove(this.f16027E.asBinder());
                if (remove != null) {
                    remove.f15976f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16029E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16030F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ IBinder f16031G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ Bundle f16032H;

            c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.f16029E = oVar;
                this.f16030F = str;
                this.f16031G = iBinder;
                this.f16032H = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f15950F.get(this.f16029E.asBinder());
                if (fVar == null) {
                    Log.w(d.f15937J, "addSubscription for callback that isn't registered id=" + this.f16030F);
                    return;
                }
                d.this.a(this.f16030F, fVar, this.f16031G, this.f16032H);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.media.d$n$d, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0153d implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16034E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16035F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ IBinder f16036G;

            RunnableC0153d(o oVar, String str, IBinder iBinder) {
                this.f16034E = oVar;
                this.f16035F = str;
                this.f16036G = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f15950F.get(this.f16034E.asBinder());
                if (fVar == null) {
                    Log.w(d.f15937J, "removeSubscription for callback that isn't registered id=" + this.f16035F);
                    return;
                }
                if (!d.this.w(this.f16035F, fVar, this.f16036G)) {
                    Log.w(d.f15937J, "removeSubscription called for " + this.f16035F + " which is not subscribed");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class e implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16038E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16039F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ android.support.v4.os.b f16040G;

            e(o oVar, String str, android.support.v4.os.b bVar) {
                this.f16038E = oVar;
                this.f16039F = str;
                this.f16040G = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f15950F.get(this.f16038E.asBinder());
                if (fVar == null) {
                    Log.w(d.f15937J, "getMediaItem for callback that isn't registered id=" + this.f16039F);
                    return;
                }
                d.this.u(this.f16039F, fVar, this.f16040G);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class f implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16042E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16043F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ int f16044G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ int f16045H;

            /* renamed from: I, reason: collision with root package name */
            final /* synthetic */ Bundle f16046I;

            f(o oVar, String str, int i4, int i5, Bundle bundle) {
                this.f16042E = oVar;
                this.f16043F = str;
                this.f16044G = i4;
                this.f16045H = i5;
                this.f16046I = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f16042E.asBinder();
                d.this.f15950F.remove(asBinder);
                f fVar = new f(this.f16043F, this.f16044G, this.f16045H, this.f16046I, this.f16042E);
                d.this.f15950F.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w(d.f15937J, "IBinder is already dead.");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class g implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16048E;

            g(o oVar) {
                this.f16048E = oVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f16048E.asBinder();
                f remove = d.this.f15950F.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class h implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16050E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16051F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f16052G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ android.support.v4.os.b f16053H;

            h(o oVar, String str, Bundle bundle, android.support.v4.os.b bVar) {
                this.f16050E = oVar;
                this.f16051F = str;
                this.f16052G = bundle;
                this.f16053H = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f15950F.get(this.f16050E.asBinder());
                if (fVar == null) {
                    Log.w(d.f15937J, "search for callback that isn't registered query=" + this.f16051F);
                    return;
                }
                d.this.v(this.f16051F, this.f16052G, fVar, this.f16053H);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class i implements Runnable {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ o f16055E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ String f16056F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ Bundle f16057G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ android.support.v4.os.b f16058H;

            i(o oVar, String str, Bundle bundle, android.support.v4.os.b bVar) {
                this.f16055E = oVar;
                this.f16056F = str;
                this.f16057G = bundle;
                this.f16058H = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f15950F.get(this.f16055E.asBinder());
                if (fVar == null) {
                    Log.w(d.f15937J, "sendCustomAction for callback that isn't registered action=" + this.f16056F + ", extras=" + this.f16057G);
                    return;
                }
                d.this.s(this.f16056F, this.f16057G, fVar, this.f16058H);
            }
        }

        n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            d.this.f15952H.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i4, int i5, Bundle bundle, o oVar) {
            if (d.this.g(str, i5)) {
                d.this.f15952H.a(new a(oVar, str, i4, i5, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i5 + " package=" + str);
        }

        public void c(o oVar) {
            d.this.f15952H.a(new b(oVar));
        }

        public void d(String str, android.support.v4.os.b bVar, o oVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f15952H.a(new e(oVar, str, bVar));
            }
        }

        public void e(o oVar, String str, int i4, int i5, Bundle bundle) {
            d.this.f15952H.a(new f(oVar, str, i4, i5, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            d.this.f15952H.a(new RunnableC0153d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, android.support.v4.os.b bVar, o oVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f15952H.a(new h(oVar, str, bundle, bVar));
            }
        }

        public void h(String str, Bundle bundle, android.support.v4.os.b bVar, o oVar) {
            if (!TextUtils.isEmpty(str) && bVar != null) {
                d.this.f15952H.a(new i(oVar, str, bundle, bVar));
            }
        }

        public void i(o oVar) {
            d.this.f15952H.a(new g(oVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    /* loaded from: classes.dex */
    private static class p implements o {

        /* renamed from: a, reason: collision with root package name */
        final Messenger f16060a;

        p(Messenger messenger) {
            this.f16060a = messenger;
        }

        private void d(int i4, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i4;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f16060a.send(obtain);
        }

        @Override // androidx.media.d.o
        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString(androidx.media.c.f15914d, str);
            bundle3.putBundle(androidx.media.c.f15917g, bundle);
            bundle3.putBundle(androidx.media.c.f15918h, bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList(androidx.media.c.f15915e, arrayList);
            }
            d(3, bundle3);
        }

        @Override // androidx.media.d.o
        public IBinder asBinder() {
            return this.f16060a.getBinder();
        }

        @Override // androidx.media.d.o
        public void b() throws RemoteException {
            d(2, null);
        }

        @Override // androidx.media.d.o
        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(androidx.media.c.f15927q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f15914d, str);
            bundle2.putParcelable(androidx.media.c.f15916f, token);
            bundle2.putBundle(androidx.media.c.f15921k, bundle);
            d(1, bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class q extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final n f16061a;

        q() {
            this.f16061a = new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(androidx.media.c.f15921k);
                    MediaSessionCompat.b(bundle);
                    this.f16061a.b(data.getString(androidx.media.c.f15919i), data.getInt(androidx.media.c.f15913c), data.getInt(androidx.media.c.f15912b), bundle, new p(message.replyTo));
                    return;
                case 2:
                    this.f16061a.c(new p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(androidx.media.c.f15917g);
                    MediaSessionCompat.b(bundle2);
                    this.f16061a.a(data.getString(androidx.media.c.f15914d), C0635k.a(data, androidx.media.c.f15911a), bundle2, new p(message.replyTo));
                    return;
                case 4:
                    this.f16061a.f(data.getString(androidx.media.c.f15914d), C0635k.a(data, androidx.media.c.f15911a), new p(message.replyTo));
                    return;
                case 5:
                    this.f16061a.d(data.getString(androidx.media.c.f15914d), (android.support.v4.os.b) data.getParcelable(androidx.media.c.f15920j), new p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(androidx.media.c.f15921k);
                    MediaSessionCompat.b(bundle3);
                    this.f16061a.e(new p(message.replyTo), data.getString(androidx.media.c.f15919i), data.getInt(androidx.media.c.f15913c), data.getInt(androidx.media.c.f15912b), bundle3);
                    return;
                case 7:
                    this.f16061a.i(new p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(androidx.media.c.f15922l);
                    MediaSessionCompat.b(bundle4);
                    this.f16061a.g(data.getString(androidx.media.c.f15923m), bundle4, (android.support.v4.os.b) data.getParcelable(androidx.media.c.f15920j), new p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(androidx.media.c.f15925o);
                    MediaSessionCompat.b(bundle5);
                    this.f16061a.h(data.getString(androidx.media.c.f15924n), bundle5, (android.support.v4.os.b) data.getParcelable(androidx.media.c.f15920j), new p(message.replyTo));
                    return;
                default:
                    Log.w(d.f15937J, "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j4) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt(androidx.media.c.f15912b, Binder.getCallingUid());
            data.putInt(androidx.media.c.f15913c, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j4);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<androidx.core.util.q<IBinder, Bundle>> list = fVar.f15977g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (androidx.core.util.q<IBinder, Bundle> qVar : list) {
            if (iBinder == qVar.f13025a && androidx.media.b.a(bundle, qVar.f13026b)) {
                return;
            }
        }
        list.add(new androidx.core.util.q<>(iBinder, bundle));
        fVar.f15977g.put(str, list);
        t(str, fVar, bundle, null);
        this.f15951G = fVar;
        q(str, bundle);
        this.f15951G = null;
    }

    List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.f15949E.b();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @N
    public final i.b e() {
        return this.f15949E.f();
    }

    @P
    public MediaSessionCompat.Token f() {
        return this.f15953I;
    }

    boolean g(String str, int i4) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i4)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void h(@N i.b bVar, @N String str, @N Bundle bundle) {
        if (bVar != null) {
            if (str != null) {
                if (bundle != null) {
                    this.f15949E.d(bVar, str, bundle);
                    return;
                }
                throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
            }
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
    }

    public void i(@N String str) {
        if (str != null) {
            this.f15949E.j(str, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void j(@N String str, @N Bundle bundle) {
        if (str != null) {
            if (bundle != null) {
                this.f15949E.j(str, bundle);
                return;
            }
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void k(@N String str, Bundle bundle, @N m<Bundle> mVar) {
        mVar.h(null);
    }

    @P
    public abstract e l(@N String str, int i4, @P Bundle bundle);

    public abstract void m(@N String str, @N m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void n(@N String str, @N m<List<MediaBrowserCompat.MediaItem>> mVar, @N Bundle bundle) {
        mVar.k(1);
        m(str, mVar);
    }

    public void o(String str, @N m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.k(2);
        mVar.j(null);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f15949E.g(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            this.f15949E = new k();
        } else if (i4 >= 26) {
            this.f15949E = new j();
        } else {
            this.f15949E = new i();
        }
        this.f15949E.c();
    }

    public void p(@N String str, Bundle bundle, @N m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.k(4);
        mVar.j(null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void q(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void r(String str) {
    }

    void s(String str, Bundle bundle, f fVar, android.support.v4.os.b bVar) {
        C0151d c0151d = new C0151d(str, bVar);
        this.f15951G = fVar;
        k(str, bundle, c0151d);
        this.f15951G = null;
        if (c0151d.d()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f15951G = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.f15951G = null;
        if (aVar.d()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f15971a + " id=" + str);
    }

    void u(String str, f fVar, android.support.v4.os.b bVar) {
        b bVar2 = new b(str, bVar);
        this.f15951G = fVar;
        o(str, bVar2);
        this.f15951G = null;
        if (bVar2.d()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    void v(String str, Bundle bundle, f fVar, android.support.v4.os.b bVar) {
        c cVar = new c(str, bVar);
        this.f15951G = fVar;
        p(str, bundle, cVar);
        this.f15951G = null;
        if (cVar.d()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean w(String str, f fVar, IBinder iBinder) {
        boolean z3 = false;
        try {
            if (iBinder == null) {
                if (fVar.f15977g.remove(str) != null) {
                    z3 = true;
                }
            } else {
                List<androidx.core.util.q<IBinder, Bundle>> list = fVar.f15977g.get(str);
                if (list != null) {
                    Iterator<androidx.core.util.q<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f13025a) {
                            it.remove();
                            z3 = true;
                        }
                    }
                    if (list.size() == 0) {
                        fVar.f15977g.remove(str);
                    }
                }
            }
            return z3;
        } finally {
            this.f15951G = fVar;
            r(str);
            this.f15951G = null;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token != null) {
            if (this.f15953I == null) {
                this.f15953I = token;
                this.f15949E.k(token);
                return;
            }
            throw new IllegalStateException("The session token has already been set.");
        }
        throw new IllegalArgumentException("Session token may not be null.");
    }
}

package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.support.v4.media.session.d;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.B;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.app.ActivityC0637l;
import androidx.core.app.C0635k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: d, reason: collision with root package name */
    static final String f4051d = "MediaControllerCompat";

    /* renamed from: e, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4052e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    /* renamed from: f, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4053f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    /* renamed from: g, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4054g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    /* renamed from: h, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4055h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    /* renamed from: i, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4056i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* renamed from: j, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4057j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    /* renamed from: k, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f4058k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a, reason: collision with root package name */
    private final c f4059a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f4060b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<a> f4061c = new HashSet<>();

    @W(21)
    /* loaded from: classes.dex */
    static class MediaControllerImplApi21 implements c {

        /* renamed from: a, reason: collision with root package name */
        protected final Object f4062a;

        /* renamed from: b, reason: collision with root package name */
        final Object f4063b = new Object();

        /* renamed from: c, reason: collision with root package name */
        @B("mLock")
        private final List<a> f4064c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap<a, a> f4065d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f4066e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: E, reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f4067E;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f4067E = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i4, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f4067E.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f4063b) {
                        mediaControllerImplApi21.f4066e.h(b.a.v(C0635k.a(bundle, MediaSessionCompat.f4108I)));
                        mediaControllerImplApi21.f4066e.i(bundle.getBundle(MediaSessionCompat.f4109J));
                        mediaControllerImplApi21.u();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void M1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void k(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void l(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void q(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void r() throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f4066e = token;
            Object d4 = android.support.v4.media.session.c.d(context, token.g());
            this.f4062a = d4;
            if (d4 != null) {
                if (token.d() == null) {
                    v();
                    return;
                }
                return;
            }
            throw new RemoteException();
        }

        private void v() {
            o(MediaControllerCompat.f4052e, null, new ExtraBinderRequestResultReceiver(this));
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int B() {
            if (this.f4066e.d() != null) {
                try {
                    return this.f4066e.d().B();
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in getRepeatMode.", e4);
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public long a() {
            return android.support.v4.media.session.c.f(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public g b() {
            Object j4 = android.support.v4.media.session.c.j(this.f4062a);
            if (j4 != null) {
                return new g(c.C0033c.e(j4), c.C0033c.c(j4), c.C0033c.f(j4), c.C0033c.d(j4), c.C0033c.b(j4));
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void c(int i4, int i5) {
            android.support.v4.media.session.c.a(this.f4062a, i4, i5);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void d(a aVar) {
            android.support.v4.media.session.c.v(this.f4062a, aVar.f4068a);
            synchronized (this.f4063b) {
                if (this.f4066e.d() != null) {
                    try {
                        a remove = this.f4065d.remove(aVar);
                        if (remove != null) {
                            aVar.f4070c = null;
                            this.f4066e.d().A0(remove);
                        }
                    } catch (RemoteException e4) {
                        Log.e(MediaControllerCompat.f4051d, "Dead object in unregisterCallback.", e4);
                    }
                } else {
                    this.f4064c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public MediaMetadataCompat e() {
            Object h4 = android.support.v4.media.session.c.h(this.f4062a);
            if (h4 != null) {
                return MediaMetadataCompat.b(h4);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PlaybackStateCompat f() {
            if (this.f4066e.d() != null) {
                try {
                    return this.f4066e.d().f();
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in getPlaybackState.", e4);
                }
            }
            Object k4 = android.support.v4.media.session.c.k(this.f4062a);
            if (k4 != null) {
                return PlaybackStateCompat.a(k4);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public String g() {
            return android.support.v4.media.session.c.i(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Bundle getExtras() {
            return android.support.v4.media.session.c.e(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void h(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((a() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f4057j, mediaDescriptionCompat);
                o(MediaControllerCompat.f4055h, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void i(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((a() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f4057j, mediaDescriptionCompat);
                o(MediaControllerCompat.f4053f, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int j() {
            return android.support.v4.media.session.c.n(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean k(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.c(this.f4062a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void l(int i4, int i5) {
            android.support.v4.media.session.c.u(this.f4062a, i4, i5);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public CharSequence m() {
            return android.support.v4.media.session.c.m(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void n(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
            if ((a() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f4057j, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.f4058k, i4);
                o(MediaControllerCompat.f4054g, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void o(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.s(this.f4062a, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean p() {
            if (this.f4066e.d() != null) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PendingIntent q() {
            return android.support.v4.media.session.c.o(this.f4062a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public h r() {
            Object q4 = android.support.v4.media.session.c.q(this.f4062a);
            if (q4 != null) {
                return new i(q4);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Object s() {
            return this.f4062a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void t(a aVar, Handler handler) {
            android.support.v4.media.session.c.r(this.f4062a, aVar.f4068a, handler);
            synchronized (this.f4063b) {
                if (this.f4066e.d() != null) {
                    a aVar2 = new a(aVar);
                    this.f4065d.put(aVar, aVar2);
                    aVar.f4070c = aVar2;
                    try {
                        this.f4066e.d().M(aVar2);
                        aVar.n(13, null, null);
                    } catch (RemoteException e4) {
                        Log.e(MediaControllerCompat.f4051d, "Dead object in registerCallback.", e4);
                    }
                } else {
                    aVar.f4070c = null;
                    this.f4064c.add(aVar);
                }
            }
        }

        @B("mLock")
        void u() {
            if (this.f4066e.d() == null) {
                return;
            }
            for (a aVar : this.f4064c) {
                a aVar2 = new a(aVar);
                this.f4065d.put(aVar, aVar2);
                aVar.f4070c = aVar2;
                try {
                    this.f4066e.d().M(aVar2);
                    aVar.n(13, null, null);
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in registerCallback.", e4);
                }
            }
            this.f4064c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int w() {
            if (this.f4066e.d() != null) {
                try {
                    return this.f4066e.d().w();
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in getShuffleMode.", e4);
                    return -1;
                }
            }
            return -1;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean x() {
            if (this.f4066e.d() != null) {
                try {
                    return this.f4066e.d().x();
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in isCaptioningEnabled.", e4);
                    return false;
                }
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public List<MediaSessionCompat.QueueItem> y() {
            List<Object> l4 = android.support.v4.media.session.c.l(this.f4062a);
            if (l4 != null) {
                return MediaSessionCompat.QueueItem.b(l4);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        final Object f4068a = android.support.v4.media.session.c.b(new b(this));

        /* renamed from: b, reason: collision with root package name */
        HandlerC0028a f4069b;

        /* renamed from: c, reason: collision with root package name */
        android.support.v4.media.session.a f4070c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0028a extends Handler {

            /* renamed from: c, reason: collision with root package name */
            private static final int f4071c = 1;

            /* renamed from: d, reason: collision with root package name */
            private static final int f4072d = 2;

            /* renamed from: e, reason: collision with root package name */
            private static final int f4073e = 3;

            /* renamed from: f, reason: collision with root package name */
            private static final int f4074f = 4;

            /* renamed from: g, reason: collision with root package name */
            private static final int f4075g = 5;

            /* renamed from: h, reason: collision with root package name */
            private static final int f4076h = 6;

            /* renamed from: i, reason: collision with root package name */
            private static final int f4077i = 7;

            /* renamed from: j, reason: collision with root package name */
            private static final int f4078j = 8;

            /* renamed from: k, reason: collision with root package name */
            private static final int f4079k = 9;

            /* renamed from: l, reason: collision with root package name */
            private static final int f4080l = 11;

            /* renamed from: m, reason: collision with root package name */
            private static final int f4081m = 12;

            /* renamed from: n, reason: collision with root package name */
            private static final int f4082n = 13;

            /* renamed from: a, reason: collision with root package name */
            boolean f4083a;

            HandlerC0028a(Looper looper) {
                super(looper);
                this.f4083a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (!this.f4083a) {
                    return;
                }
                switch (message.what) {
                    case 1:
                        Bundle data = message.getData();
                        MediaSessionCompat.b(data);
                        a.this.k((String) message.obj, data);
                        return;
                    case 2:
                        a.this.f((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        a.this.e((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        a.this.b((g) message.obj);
                        return;
                    case 5:
                        a.this.g((List) message.obj);
                        return;
                    case 6:
                        a.this.h((CharSequence) message.obj);
                        return;
                    case 7:
                        Bundle bundle = (Bundle) message.obj;
                        MediaSessionCompat.b(bundle);
                        a.this.d(bundle);
                        return;
                    case 8:
                        a.this.j();
                        return;
                    case 9:
                        a.this.i(((Integer) message.obj).intValue());
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        a.this.c(((Boolean) message.obj).booleanValue());
                        return;
                    case 12:
                        a.this.m(((Integer) message.obj).intValue());
                        return;
                    case 13:
                        a.this.l();
                        return;
                }
            }
        }

        /* loaded from: classes.dex */
        private static class b implements c.a {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f4085a;

            b(a aVar) {
                this.f4085a = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void a(Object obj) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.e(MediaMetadataCompat.b(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void b(int i4, int i5, int i6, int i7, int i8) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.b(new g(i4, i5, i6, i7, i8));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void c(Object obj) {
                a aVar = this.f4085a.get();
                if (aVar != null && aVar.f4070c == null) {
                    aVar.f(PlaybackStateCompat.a(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void d(String str, Bundle bundle) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.k(str, bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void k(Bundle bundle) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.d(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void l(List<?> list) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.g(MediaSessionCompat.QueueItem.b(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void q(CharSequence charSequence) {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.h(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void r() {
                a aVar = this.f4085a.get();
                if (aVar != null) {
                    aVar.j();
                }
            }
        }

        /* loaded from: classes.dex */
        private static class c extends a.AbstractBinderC0030a {

            /* renamed from: w, reason: collision with root package name */
            private final WeakReference<a> f4086w;

            c(a aVar) {
                this.f4086w = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void E(String str, Bundle bundle) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public void H1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void J0(boolean z3) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(11, Boolean.valueOf(z3), null);
                }
            }

            public void M1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                g gVar;
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        gVar = new g(parcelableVolumeInfo.f4249E, parcelableVolumeInfo.f4250F, parcelableVolumeInfo.f4251G, parcelableVolumeInfo.f4252H, parcelableVolumeInfo.f4253I);
                    } else {
                        gVar = null;
                    }
                    aVar.n(4, gVar, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void U0(boolean z3) throws RemoteException {
            }

            public void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void i1(int i4) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(9, Integer.valueOf(i4), null);
                }
            }

            public void k(Bundle bundle) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(7, bundle, null);
                }
            }

            public void l(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void o0() throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void o1(int i4) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(12, Integer.valueOf(i4), null);
                }
            }

            public void q(CharSequence charSequence) throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(6, charSequence, null);
                }
            }

            public void r() throws RemoteException {
                a aVar = this.f4086w.get();
                if (aVar != null) {
                    aVar.n(8, null, null);
                }
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public android.support.v4.media.session.a a() {
            return this.f4070c;
        }

        public void b(g gVar) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            n(8, null, null);
        }

        public void c(boolean z3) {
        }

        public void d(Bundle bundle) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
        }

        public void g(List<MediaSessionCompat.QueueItem> list) {
        }

        public void h(CharSequence charSequence) {
        }

        public void i(int i4) {
        }

        public void j() {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l() {
        }

        public void m(int i4) {
        }

        void n(int i4, Object obj, Bundle bundle) {
            HandlerC0028a handlerC0028a = this.f4069b;
            if (handlerC0028a != null) {
                Message obtainMessage = handlerC0028a.obtainMessage(i4, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        void o(Handler handler) {
            if (handler == null) {
                HandlerC0028a handlerC0028a = this.f4069b;
                if (handlerC0028a != null) {
                    handlerC0028a.f4083a = false;
                    handlerC0028a.removeCallbacksAndMessages(null);
                    this.f4069b = null;
                    return;
                }
                return;
            }
            HandlerC0028a handlerC0028a2 = new HandlerC0028a(handler.getLooper());
            this.f4069b = handlerC0028a2;
            handlerC0028a2.f4083a = true;
        }
    }

    /* loaded from: classes.dex */
    private static class b extends ActivityC0637l.a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaControllerCompat f4087a;

        b(MediaControllerCompat mediaControllerCompat) {
            this.f4087a = mediaControllerCompat;
        }

        MediaControllerCompat a() {
            return this.f4087a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface c {
        int B();

        long a();

        g b();

        void c(int i4, int i5);

        void d(a aVar);

        MediaMetadataCompat e();

        PlaybackStateCompat f();

        String g();

        Bundle getExtras();

        void h(MediaDescriptionCompat mediaDescriptionCompat);

        void i(MediaDescriptionCompat mediaDescriptionCompat);

        int j();

        boolean k(KeyEvent keyEvent);

        void l(int i4, int i5);

        CharSequence m();

        void n(MediaDescriptionCompat mediaDescriptionCompat, int i4);

        void o(String str, Bundle bundle, ResultReceiver resultReceiver);

        boolean p();

        PendingIntent q();

        h r();

        Object s();

        void t(a aVar, Handler handler);

        int w();

        boolean x();

        List<MediaSessionCompat.QueueItem> y();
    }

    @W(23)
    /* loaded from: classes.dex */
    static class d extends MediaControllerImplApi21 {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public h r() {
            Object q4 = android.support.v4.media.session.c.q(this.f4062a);
            if (q4 != null) {
                return new j(q4);
            }
            return null;
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    static class e extends d {
        public e(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.d, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public h r() {
            Object q4 = android.support.v4.media.session.c.q(this.f4062a);
            if (q4 != null) {
                return new k(q4);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        private android.support.v4.media.session.b f4088a;

        /* renamed from: b, reason: collision with root package name */
        private h f4089b;

        public f(MediaSessionCompat.Token token) {
            this.f4088a = b.a.v((IBinder) token.g());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int B() {
            try {
                return this.f4088a.B();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getRepeatMode.", e4);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public long a() {
            try {
                return this.f4088a.a();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getFlags.", e4);
                return 0L;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public g b() {
            try {
                ParcelableVolumeInfo B12 = this.f4088a.B1();
                return new g(B12.f4249E, B12.f4250F, B12.f4251G, B12.f4252H, B12.f4253I);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getPlaybackInfo.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void c(int i4, int i5) {
            try {
                this.f4088a.V0(i4, i5, null);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in adjustVolume.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void d(a aVar) {
            if (aVar != null) {
                try {
                    this.f4088a.A0((android.support.v4.media.session.a) aVar.f4068a);
                    this.f4088a.asBinder().unlinkToDeath(aVar, 0);
                    return;
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in unregisterCallback.", e4);
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public MediaMetadataCompat e() {
            try {
                return this.f4088a.e();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getMetadata.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PlaybackStateCompat f() {
            try {
                return this.f4088a.f();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getPlaybackState.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public String g() {
            try {
                return this.f4088a.g();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getPackageName.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Bundle getExtras() {
            try {
                return this.f4088a.getExtras();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getExtras.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void h(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f4088a.a() & 4) != 0) {
                    this.f4088a.h(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in removeQueueItem.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void i(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f4088a.a() & 4) != 0) {
                    this.f4088a.i(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in addQueueItem.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int j() {
            try {
                return this.f4088a.j();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getRatingType.", e4);
                return 0;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean k(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f4088a.T0(keyEvent);
                    return false;
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in dispatchMediaButtonEvent.", e4);
                    return false;
                }
            }
            throw new IllegalArgumentException("event may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void l(int i4, int i5) {
            try {
                this.f4088a.R(i4, i5, null);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setVolumeTo.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public CharSequence m() {
            try {
                return this.f4088a.m();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getQueueTitle.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void n(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
            try {
                if ((this.f4088a.a() & 4) != 0) {
                    this.f4088a.d1(mediaDescriptionCompat, i4);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in addQueueItemAt.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void o(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f4088a.r1(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in sendCommand.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean p() {
            return true;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PendingIntent q() {
            try {
                return this.f4088a.g0();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getSessionActivity.", e4);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public h r() {
            if (this.f4089b == null) {
                this.f4089b = new l(this.f4088a);
            }
            return this.f4089b;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Object s() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void t(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f4088a.asBinder().linkToDeath(aVar, 0);
                    this.f4088a.M((android.support.v4.media.session.a) aVar.f4068a);
                    aVar.n(13, null, null);
                    return;
                } catch (RemoteException e4) {
                    Log.e(MediaControllerCompat.f4051d, "Dead object in registerCallback.", e4);
                    aVar.n(8, null, null);
                    return;
                }
            }
            throw new IllegalArgumentException("callback may not be null.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int w() {
            try {
                return this.f4088a.w();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getShuffleMode.", e4);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean x() {
            try {
                return this.f4088a.x();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in isCaptioningEnabled.", e4);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public List<MediaSessionCompat.QueueItem> y() {
            try {
                return this.f4088a.y();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in getQueue.", e4);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final int f4090f = 1;

        /* renamed from: g, reason: collision with root package name */
        public static final int f4091g = 2;

        /* renamed from: a, reason: collision with root package name */
        private final int f4092a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4093b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4094c;

        /* renamed from: d, reason: collision with root package name */
        private final int f4095d;

        /* renamed from: e, reason: collision with root package name */
        private final int f4096e;

        g(int i4, int i5, int i6, int i7, int i8) {
            this.f4092a = i4;
            this.f4093b = i5;
            this.f4094c = i6;
            this.f4095d = i7;
            this.f4096e = i8;
        }

        public int a() {
            return this.f4093b;
        }

        public int b() {
            return this.f4096e;
        }

        public int c() {
            return this.f4095d;
        }

        public int d() {
            return this.f4092a;
        }

        public int e() {
            return this.f4094c;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4097a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        h() {
        }

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j4);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void n(String str, Bundle bundle);

        public abstract void o(boolean z3);

        public abstract void p(RatingCompat ratingCompat);

        public abstract void q(RatingCompat ratingCompat, Bundle bundle);

        public abstract void r(int i4);

        public abstract void s(int i4);

        public abstract void t();

        public abstract void u();

        public abstract void v(long j4);

        public abstract void w();
    }

    /* loaded from: classes.dex */
    static class i extends h {

        /* renamed from: b, reason: collision with root package name */
        protected final Object f4098b;

        public i(Object obj) {
            this.f4098b = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void a() {
            c.d.a(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void b() {
            c.d.b(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void c() {
            c.d.c(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void d(String str, Bundle bundle) {
            c.d.d(this.f4098b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void e(String str, Bundle bundle) {
            c.d.e(this.f4098b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            if (uri != null && !Uri.EMPTY.equals(uri)) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(MediaSessionCompat.f4101B, uri);
                bundle2.putBundle(MediaSessionCompat.f4103D, bundle);
                n(MediaSessionCompat.f4129q, bundle2);
                return;
            }
            throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            n(MediaSessionCompat.f4130r, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f4138z, str);
            bundle2.putBundle(MediaSessionCompat.f4103D, bundle);
            n(MediaSessionCompat.f4131s, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f4100A, str);
            bundle2.putBundle(MediaSessionCompat.f4103D, bundle);
            n(MediaSessionCompat.f4132t, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f4101B, uri);
            bundle2.putBundle(MediaSessionCompat.f4103D, bundle);
            n(MediaSessionCompat.f4133u, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void k() {
            c.d.f(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void l(long j4) {
            c.d.g(this.f4098b, j4);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.F(customAction.b(), bundle);
            c.d.h(this.f4098b, customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            c.d.h(this.f4098b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void o(boolean z3) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.f4104E, z3);
            n(MediaSessionCompat.f4134v, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void p(RatingCompat ratingCompat) {
            Object obj;
            Object obj2 = this.f4098b;
            if (ratingCompat != null) {
                obj = ratingCompat.c();
            } else {
                obj = null;
            }
            c.d.i(obj2, obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.f4102C, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.f4103D, bundle);
            n(MediaSessionCompat.f4137y, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void r(int i4) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f4105F, i4);
            n(MediaSessionCompat.f4135w, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void s(int i4) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.f4106G, i4);
            n(MediaSessionCompat.f4136x, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void t() {
            c.d.j(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void u() {
            c.d.k(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void v(long j4) {
            c.d.l(this.f4098b, j4);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void w() {
            c.d.m(this.f4098b);
        }
    }

    @W(23)
    /* loaded from: classes.dex */
    static class j extends i {
        public j(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            d.a.a(this.f4098b, uri, bundle);
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    static class k extends j {
        public k(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            e.a.a(this.f4098b);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            e.a.b(this.f4098b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            e.a.c(this.f4098b, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.i, android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            e.a.d(this.f4098b, uri, bundle);
        }
    }

    /* loaded from: classes.dex */
    static class l extends h {

        /* renamed from: b, reason: collision with root package name */
        private android.support.v4.media.session.b f4099b;

        public l(android.support.v4.media.session.b bVar) {
            this.f4099b = bVar;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void a() {
            try {
                this.f4099b.G0();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in fastForward.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void b() {
            try {
                this.f4099b.b();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in pause.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void c() {
            try {
                this.f4099b.q1();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in play.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void d(String str, Bundle bundle) {
            try {
                this.f4099b.C0(str, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in playFromMediaId.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void e(String str, Bundle bundle) {
            try {
                this.f4099b.D0(str, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in playFromSearch.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void f(Uri uri, Bundle bundle) {
            try {
                this.f4099b.I0(uri, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in playFromUri.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void g() {
            try {
                this.f4099b.m0();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in prepare.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void h(String str, Bundle bundle) {
            try {
                this.f4099b.y0(str, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in prepareFromMediaId.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void i(String str, Bundle bundle) {
            try {
                this.f4099b.i0(str, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in prepareFromSearch.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void j(Uri uri, Bundle bundle) {
            try {
                this.f4099b.T(uri, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in prepareFromUri.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void k() {
            try {
                this.f4099b.u1();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in rewind.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void l(long j4) {
            try {
                this.f4099b.p(j4);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in seekTo.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            n(customAction.b(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            try {
                this.f4099b.J(str, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in sendCustomAction.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void o(boolean z3) {
            try {
                this.f4099b.t(z3);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setCaptioningEnabled.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void p(RatingCompat ratingCompat) {
            try {
                this.f4099b.Q(ratingCompat);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setRating.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f4099b.Z0(ratingCompat, bundle);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setRating.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void r(int i4) {
            try {
                this.f4099b.z(i4);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setRepeatMode.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void s(int i4) {
            try {
                this.f4099b.D(i4);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in setShuffleMode.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void t() {
            try {
                this.f4099b.next();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in skipToNext.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void u() {
            try {
                this.f4099b.previous();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in skipToPrevious.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void v(long j4) {
            try {
                this.f4099b.z1(j4);
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in skipToQueueItem.", e4);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h
        public void w() {
            try {
                this.f4099b.stop();
            } catch (RemoteException e4) {
                Log.e(MediaControllerCompat.f4051d, "Dead object in stop.", e4);
            }
        }
    }

    public MediaControllerCompat(Context context, @N MediaSessionCompat mediaSessionCompat) {
        e eVar;
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i4 = mediaSessionCompat.i();
            this.f4060b = i4;
            try {
                eVar = new e(context, i4);
            } catch (RemoteException e4) {
                Log.w(f4051d, "Failed to create MediaControllerImpl.", e4);
                eVar = null;
            }
            this.f4059a = eVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public static void C(@N Activity activity, MediaControllerCompat mediaControllerCompat) {
        Object obj;
        if (activity instanceof ActivityC0637l) {
            ((ActivityC0637l) activity).D(new b(mediaControllerCompat));
        }
        if (mediaControllerCompat != null) {
            obj = android.support.v4.media.session.c.d(activity, mediaControllerCompat.r().g());
        } else {
            obj = null;
        }
        android.support.v4.media.session.c.t(activity, obj);
    }

    static void F(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.f4122j) || str.equals(MediaSessionCompat.f4123k)) {
            if (bundle != null && bundle.containsKey(MediaSessionCompat.f4124l)) {
                return;
            }
            throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
        }
    }

    public static MediaControllerCompat g(@N Activity activity) {
        if (activity instanceof ActivityC0637l) {
            b bVar = (b) ((ActivityC0637l) activity).C(b.class);
            if (bVar == null) {
                return null;
            }
            return bVar.a();
        }
        Object g4 = android.support.v4.media.session.c.g(activity);
        if (g4 == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.b(android.support.v4.media.session.c.p(g4)));
        } catch (RemoteException e4) {
            Log.e(f4051d, "Dead object in getMediaController.", e4);
            return null;
        }
    }

    @Deprecated
    public void A(int i4) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m4 = m();
        if (m4 != null && i4 >= 0 && i4 < m4.size() && (queueItem = m4.get(i4)) != null) {
            z(queueItem.c());
        }
    }

    public void B(@N String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f4059a.o(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public void D(int i4, int i5) {
        this.f4059a.l(i4, i5);
    }

    public void E(@N a aVar) {
        if (aVar != null) {
            try {
                this.f4061c.remove(aVar);
                this.f4059a.d(aVar);
                return;
            } finally {
                aVar.o(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f4059a.i(mediaDescriptionCompat);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat, int i4) {
        this.f4059a.n(mediaDescriptionCompat, i4);
    }

    public void c(int i4, int i5) {
        this.f4059a.c(i4, i5);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f4059a.k(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.f4059a.getExtras();
    }

    public long f() {
        return this.f4059a.a();
    }

    public Object h() {
        return this.f4059a.s();
    }

    public MediaMetadataCompat i() {
        return this.f4059a.e();
    }

    public String j() {
        return this.f4059a.g();
    }

    public g k() {
        return this.f4059a.b();
    }

    public PlaybackStateCompat l() {
        return this.f4059a.f();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.f4059a.y();
    }

    public CharSequence n() {
        return this.f4059a.m();
    }

    public int o() {
        return this.f4059a.j();
    }

    public int p() {
        return this.f4059a.B();
    }

    public PendingIntent q() {
        return this.f4059a.q();
    }

    public MediaSessionCompat.Token r() {
        return this.f4060b;
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Bundle s() {
        return this.f4060b.e();
    }

    public int t() {
        return this.f4059a.w();
    }

    public h u() {
        return this.f4059a.r();
    }

    public boolean v() {
        return this.f4059a.x();
    }

    public boolean w() {
        return this.f4059a.p();
    }

    public void x(@N a aVar) {
        y(aVar, null);
    }

    public void y(@N a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.o(handler);
            this.f4059a.t(aVar, handler);
            this.f4061c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f4059a.h(mediaDescriptionCompat);
    }

    public MediaControllerCompat(Context context, @N MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f4060b = token;
            this.f4059a = new e(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}

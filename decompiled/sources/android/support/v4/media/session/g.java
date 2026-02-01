package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.W;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@W(21)
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    static final String f4414a = "MediaSessionCompatApi21";

    /* loaded from: classes.dex */
    interface a {
        void a();

        void c();

        void d();

        void e();

        void f(String str, Bundle bundle, ResultReceiver resultReceiver);

        void g(long j4);

        void h(Object obj);

        void i();

        void j();

        boolean k(Intent intent);

        void n(Object obj, Bundle bundle);

        void o(String str, Bundle bundle);

        void p(String str, Bundle bundle);

        void q();

        void r(long j4);

        void s(String str, Bundle bundle);
    }

    /* loaded from: classes.dex */
    static class b<T extends a> extends MediaSession.Callback {

        /* renamed from: a, reason: collision with root package name */
        protected final T f4415a;

        public b(T t3) {
            this.f4415a = t3;
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.b(bundle);
            this.f4415a.f(str, bundle, resultReceiver);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f4415a.s(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
            this.f4415a.q();
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            if (!this.f4415a.k(intent) && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            this.f4415a.c();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            this.f4415a.i();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f4415a.p(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f4415a.o(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
            this.f4415a.e();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j4) {
            this.f4415a.r(j4);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(Rating rating) {
            this.f4415a.h(rating);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            this.f4415a.d();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            this.f4415a.j();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j4) {
            this.f4415a.g(j4);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            this.f4415a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        public static Object a(Object obj, long j4) {
            return new MediaSession.QueueItem((MediaDescription) obj, j4);
        }

        public static Object b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    private g() {
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static Object b(Context context, String str) {
        return new MediaSession(context, str);
    }

    public static Parcelable c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    public static boolean d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                if (declaredField.get(obj) == null) {
                    return false;
                }
                return true;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.w(f4414a, "Failed to get mCallback object.");
        }
        return false;
    }

    public static boolean e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    public static void f(Object obj) {
        ((MediaSession) obj).release();
    }

    public static void g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    public static void h(Object obj, boolean z3) {
        ((MediaSession) obj).setActive(z3);
    }

    public static void i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    public static void j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    public static void k(Object obj, int i4) {
        ((MediaSession) obj).setFlags(i4);
    }

    public static void l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    public static void m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    public static void n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    public static void o(Object obj, int i4) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i4);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    public static void p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    public static void q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    public static void r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    public static void s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    public static Object t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    public static Object u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}

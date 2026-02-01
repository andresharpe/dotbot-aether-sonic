package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.i;
import android.util.Log;
import androidx.annotation.W;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
@W(24)
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4416a = "MediaSessionCompatApi24";

    /* loaded from: classes.dex */
    public interface a extends i.a {
        void b(String str, Bundle bundle);

        void l();

        void m(Uri uri, Bundle bundle);

        void t(String str, Bundle bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<T extends a> extends i.b<T> {
        public b(T t3) {
            super(t3);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((a) this.f4415a).l();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f4415a).b(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f4415a).t(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f4415a).m(uri, bundle);
        }
    }

    private j() {
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static String b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            Log.e(f4416a, "Cannot execute MediaSession.getCallingPackage()", e4);
            return null;
        }
    }
}

package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.a;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.N;
import androidx.annotation.W;
import java.util.List;

@W(26)
/* loaded from: classes.dex */
class c {

    /* loaded from: classes.dex */
    interface a extends a.d {
        void b(@N String str, @N Bundle bundle);

        void c(@N String str, List<?> list, @N Bundle bundle);
    }

    /* loaded from: classes.dex */
    static class b<T extends a> extends a.e<T> {
        b(T t3) {
            super(t3);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onChildrenLoaded(@N String str, List<MediaBrowser.MediaItem> list, @N Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f4048a).c(str, list, bundle);
        }

        @Override // android.media.browse.MediaBrowser.SubscriptionCallback
        public void onError(@N String str, @N Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((a) this.f4048a).b(str, bundle);
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static void b(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void c(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}

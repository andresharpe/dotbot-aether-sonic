package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import androidx.annotation.N;
import androidx.annotation.W;

@W(23)
/* loaded from: classes.dex */
class b {

    /* loaded from: classes.dex */
    interface a {
        void a(@N String str);

        void b(Parcel parcel);
    }

    /* renamed from: android.support.v4.media.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0027b<T extends a> extends MediaBrowser.ItemCallback {

        /* renamed from: a, reason: collision with root package name */
        protected final T f4049a;

        public C0027b(T t3) {
            this.f4049a = t3;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(@N String str) {
            this.f4049a.a(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f4049a.b(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f4049a.b(obtain);
        }
    }

    private b() {
    }

    public static Object a(a aVar) {
        return new C0027b(aVar);
    }

    public static void b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}

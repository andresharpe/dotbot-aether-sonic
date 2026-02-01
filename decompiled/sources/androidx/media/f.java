package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.W;
import java.util.ArrayList;
import java.util.List;

@W(21)
/* loaded from: classes.dex */
class f {

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final String f16063a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f16064b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, Bundle bundle) {
            this.f16063a = str;
            this.f16064b = bundle;
        }
    }

    /* loaded from: classes.dex */
    static class b extends MediaBrowserService {

        /* renamed from: E, reason: collision with root package name */
        final d f16065E;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Context context, d dVar) {
            attachBaseContext(context);
            this.f16065E = dVar;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i4, Bundle bundle) {
            Bundle bundle2;
            MediaSessionCompat.b(bundle);
            d dVar = this.f16065E;
            if (bundle == null) {
                bundle2 = null;
            } else {
                bundle2 = new Bundle(bundle);
            }
            a i5 = dVar.i(str, i4, bundle2);
            if (i5 == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(i5.f16063a, i5.f16064b);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f16065E.e(str, new c<>(result));
        }
    }

    /* loaded from: classes.dex */
    static class c<T> {

        /* renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f16066a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(MediaBrowserService.Result result) {
            this.f16066a = result;
        }

        public void a() {
            this.f16066a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t3) {
            if (t3 instanceof List) {
                this.f16066a.sendResult(b((List) t3));
                return;
            }
            if (t3 instanceof Parcel) {
                Parcel parcel = (Parcel) t3;
                parcel.setDataPosition(0);
                this.f16066a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
                return;
            }
            this.f16066a.sendResult(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void e(String str, c<List<Parcel>> cVar);

        a i(String str, int i4, Bundle bundle);
    }

    private f() {
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void b(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }

    public static IBinder c(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void d(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static void e(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }
}

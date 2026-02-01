package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import androidx.annotation.W;
import androidx.media.f;

@W(23)
/* loaded from: classes.dex */
class g {

    /* loaded from: classes.dex */
    static class a extends f.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Context context, b bVar) {
            super(context, bVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((b) this.f16065E).a(str, new f.c<>(result));
        }
    }

    /* loaded from: classes.dex */
    public interface b extends f.d {
        void a(String str, f.c<Parcel> cVar);
    }

    private g() {
    }

    public static Object a(Context context, b bVar) {
        return new a(context, bVar);
    }
}

package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import androidx.annotation.W;

@W(23)
/* loaded from: classes.dex */
class e {

    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    private e() {
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}

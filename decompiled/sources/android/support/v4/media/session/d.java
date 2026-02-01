package android.support.v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.W;

@W(23)
/* loaded from: classes.dex */
class d {

    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static void a(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }

    private d() {
    }
}

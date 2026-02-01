package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.W;
import java.util.Iterator;
import java.util.List;

@W(21)
/* loaded from: classes.dex */
class k {

    /* loaded from: classes.dex */
    static final class a {
        private a() {
        }

        public static String a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        public static Bundle b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        public static int c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static CharSequence d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static Object e(String str, CharSequence charSequence, int i4, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i4);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    private k() {
    }

    public static long a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static long b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    public static long c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static List<Object> d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static CharSequence e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static float g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static int i(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static Object j(int i4, long j4, long j5, float f4, long j6, CharSequence charSequence, long j7, List<Object> list, long j8) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i4, j4, f4, j7);
        builder.setBufferedPosition(j5);
        builder.setActions(j6);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j8);
        return builder.build();
    }
}

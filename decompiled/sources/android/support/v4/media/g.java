package android.support.v4.media;

import android.media.browse.MediaBrowser;
import androidx.annotation.W;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@W(21)
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private static Constructor f4050a;

    static {
        try {
            f4050a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e4.printStackTrace();
        }
    }

    private g() {
    }

    static Object a(List<MediaBrowser.MediaItem> list) {
        try {
            return f4050a.newInstance(list);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}

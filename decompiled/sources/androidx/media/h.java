package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.W;
import androidx.media.g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@W(26)
/* loaded from: classes.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16067a = "MBSCompatApi26";

    /* renamed from: b, reason: collision with root package name */
    static Field f16068b;

    /* loaded from: classes.dex */
    static class a extends g.a {
        a(Context context, c cVar) {
            super(context, cVar);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            ((c) this.f16065E).h(str, new b(result), bundle);
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f16069a;

        b(MediaBrowserService.Result result) {
            this.f16069a = result;
        }

        public void a() {
            this.f16069a.detach();
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

        public void c(List<Parcel> list, int i4) {
            try {
                h.f16068b.setInt(this.f16069a, i4);
            } catch (IllegalAccessException e4) {
                Log.w(h.f16067a, e4);
            }
            this.f16069a.sendResult(b(list));
        }
    }

    /* loaded from: classes.dex */
    public interface c extends g.b {
        void h(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            Field declaredField = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f16068b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            Log.w(f16067a, e4);
        }
    }

    private h() {
    }

    public static Object a(Context context, c cVar) {
        return new a(context, cVar);
    }

    public static Bundle b(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    public static void c(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}

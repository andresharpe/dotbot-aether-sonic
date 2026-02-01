package L2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f1679a = new a();

    private a() {
    }

    @e
    public final Bitmap a(@e Activity activity) {
        Bitmap createBitmap;
        if (activity == null) {
            return null;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            F.o(decorView, "getDecorView(...)");
            decorView.setDrawingCacheEnabled(true);
            decorView.buildDrawingCache();
            Bitmap drawingCache = decorView.getDrawingCache();
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i4 = rect.top;
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i5 = point.x;
            int i6 = point.y;
            if (i6 + i4 <= drawingCache.getHeight()) {
                createBitmap = Bitmap.createBitmap(drawingCache, 0, i4, i5, i6);
                F.m(createBitmap);
            } else {
                createBitmap = Bitmap.createBitmap(drawingCache, 0, i4, i5, i6 - i4);
                F.m(createBitmap);
            }
            decorView.destroyDrawingCache();
            return c.a(activity, createBitmap);
        } catch (Exception unused) {
            return null;
        }
    }
}

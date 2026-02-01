package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public final class a {
    @l3.d
    public static final BitmapDrawable a(@l3.d Bitmap bitmap, @l3.d Resources resources) {
        F.p(bitmap, "<this>");
        F.p(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}

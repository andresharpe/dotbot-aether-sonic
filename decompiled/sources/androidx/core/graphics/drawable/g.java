package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.W;
import kotlin.jvm.internal.F;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class g {
    @l3.d
    @W(26)
    public static final Icon a(@l3.d Bitmap bitmap) {
        Icon createWithAdaptiveBitmap;
        F.p(bitmap, "<this>");
        createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        F.o(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    @l3.d
    @W(26)
    public static final Icon b(@l3.d Bitmap bitmap) {
        F.p(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        F.o(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @l3.d
    @W(26)
    public static final Icon c(@l3.d Uri uri) {
        F.p(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        F.o(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @l3.d
    @W(26)
    public static final Icon d(@l3.d byte[] bArr) {
        F.p(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        F.o(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}

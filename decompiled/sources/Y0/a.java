package Y0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class a {
    private a() {
    }

    @N
    public static AttributeSet a(@N Context context, @k0 int i4, @N CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i4);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e4) {
            e = e4;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e5) {
            e = e5;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i4));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    @TargetApi(21)
    public static void b(@P RippleDrawable rippleDrawable, int i4) {
        rippleDrawable.setRadius(i4);
    }

    @P
    public static PorterDuffColorFilter c(@N Drawable drawable, @P ColorStateList colorStateList, @P PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
        }
        return null;
    }
}

package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0571n;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static final String f12338d = "ComplexColorCompat";

    /* renamed from: a, reason: collision with root package name */
    private final Shader f12339a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f12340b;

    /* renamed from: c, reason: collision with root package name */
    private int f12341c;

    private d(Shader shader, ColorStateList colorStateList, @InterfaceC0569l int i4) {
        this.f12339a = shader;
        this.f12340b = colorStateList;
        this.f12341c = i4;
    }

    @N
    private static d a(@N Resources resources, @InterfaceC0571n int i4, @P Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return c(c.b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(g.c(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b(@InterfaceC0569l int i4) {
        return new d(null, null, i4);
    }

    static d c(@N ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(@N Shader shader) {
        return new d(shader, null, 0);
    }

    @P
    public static d g(@N Resources resources, @InterfaceC0571n int i4, @P Resources.Theme theme) {
        try {
            return a(resources, i4, theme);
        } catch (Exception e4) {
            Log.e(f12338d, "Failed to inflate ComplexColor.", e4);
            return null;
        }
    }

    @InterfaceC0569l
    public int e() {
        return this.f12341c;
    }

    @P
    public Shader f() {
        return this.f12339a;
    }

    public boolean h() {
        if (this.f12339a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (this.f12339a == null && (colorStateList = this.f12340b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f12340b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f12341c) {
                this.f12341c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(@InterfaceC0569l int i4) {
        this.f12341c = i4;
    }

    public boolean l() {
        if (!h() && this.f12341c == 0) {
            return false;
        }
        return true;
    }
}

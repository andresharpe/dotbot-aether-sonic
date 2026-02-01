package f;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2050a {

    @W(15)
    /* renamed from: f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0441a {
        private C0441a() {
        }

        @InterfaceC0577u
        public static void a(@N Resources resources, int i4, int i5, @N TypedValue typedValue, boolean z3) {
            resources.getValueForDensity(i4, i5, typedValue, z3);
        }
    }

    @W(18)
    /* renamed from: f.a$b */
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        public static void a(@N ObjectAnimator objectAnimator, boolean z3) {
            objectAnimator.setAutoCancel(z3);
        }
    }

    @W(21)
    /* renamed from: f.a$c */
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @InterfaceC0577u
        @N
        public static Drawable a(@N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }

        @InterfaceC0577u
        public static int b(@N TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @InterfaceC0577u
        public static void c(@N Drawable drawable, @N Resources resources, @N XmlPullParser xmlPullParser, @N AttributeSet attributeSet, @P Resources.Theme theme) throws IOException, XmlPullParserException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    private C2050a() {
    }
}

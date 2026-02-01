package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m.C2356a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12342a = 400;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12343b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f12344c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f12345d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f12346e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f12347f = 500;

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final e[] f12348a;

        public d(@N e[] eVarArr) {
            this.f12348a = eVarArr;
        }

        @N
        public e[] a() {
            return this.f12348a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final String f12349a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12350b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12351c;

        /* renamed from: d, reason: collision with root package name */
        private final String f12352d;

        /* renamed from: e, reason: collision with root package name */
        private final int f12353e;

        /* renamed from: f, reason: collision with root package name */
        private final int f12354f;

        public e(@N String str, int i4, boolean z3, @P String str2, int i5, int i6) {
            this.f12349a = str;
            this.f12350b = i4;
            this.f12351c = z3;
            this.f12352d = str2;
            this.f12353e = i5;
            this.f12354f = i6;
        }

        @N
        public String a() {
            return this.f12349a;
        }

        public int b() {
            return this.f12354f;
        }

        public int c() {
            return this.f12353e;
        }

        @P
        public String d() {
            return this.f12352d;
        }

        public int e() {
            return this.f12350b;
        }

        public boolean f() {
            return this.f12351c;
        }
    }

    private f() {
    }

    private static int a(TypedArray typedArray, int i4) {
        return a.a(typedArray, i4);
    }

    @P
    public static b b(@N XmlPullParser xmlPullParser, @N Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @N
    public static List<List<byte[]>> c(@N Resources resources, @InterfaceC0562e int i4) {
        if (i4 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                    int resourceId = obtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i4)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @P
    private static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @P
    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2356a.j.f55012j);
        String string = obtainAttributes.getString(C2356a.j.f55013k);
        String string2 = obtainAttributes.getString(C2356a.j.f55017o);
        String string3 = obtainAttributes.getString(C2356a.j.f55018p);
        int resourceId = obtainAttributes.getResourceId(C2356a.j.f55014l, 0);
        int integer = obtainAttributes.getInteger(C2356a.j.f55015m, 1);
        int integer2 = obtainAttributes.getInteger(C2356a.j.f55016n, 500);
        String string4 = obtainAttributes.getString(C2356a.j.f55019q);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0083f(new androidx.core.provider.f(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    private static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C2356a.j.f55020r);
        if (obtainAttributes.hasValue(C2356a.j.f54985A)) {
            i4 = C2356a.j.f54985A;
        } else {
            i4 = C2356a.j.f55022t;
        }
        int i9 = obtainAttributes.getInt(i4, f12342a);
        if (obtainAttributes.hasValue(C2356a.j.f55027y)) {
            i5 = C2356a.j.f55027y;
        } else {
            i5 = C2356a.j.f55023u;
        }
        if (1 == obtainAttributes.getInt(i5, 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (obtainAttributes.hasValue(C2356a.j.f54986B)) {
            i6 = C2356a.j.f54986B;
        } else {
            i6 = C2356a.j.f55024v;
        }
        if (obtainAttributes.hasValue(C2356a.j.f55028z)) {
            i7 = C2356a.j.f55028z;
        } else {
            i7 = C2356a.j.f55025w;
        }
        String string = obtainAttributes.getString(i7);
        int i10 = obtainAttributes.getInt(i6, 0);
        if (obtainAttributes.hasValue(C2356a.j.f55026x)) {
            i8 = C2356a.j.f55026x;
        } else {
            i8 = C2356a.j.f55021s;
        }
        int resourceId = obtainAttributes.getResourceId(i8, 0);
        String string2 = obtainAttributes.getString(i8);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i9, z3, string, i10, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i4--;
                }
            } else {
                i4++;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* renamed from: androidx.core.content.res.f$f, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0083f implements b {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final androidx.core.provider.f f12355a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12356b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12357c;

        /* renamed from: d, reason: collision with root package name */
        @P
        private final String f12358d;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0083f(@N androidx.core.provider.f fVar, int i4, int i5, @P String str) {
            this.f12355a = fVar;
            this.f12357c = i4;
            this.f12356b = i5;
            this.f12358d = str;
        }

        public int a() {
            return this.f12357c;
        }

        @N
        public androidx.core.provider.f b() {
            return this.f12355a;
        }

        @P
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String c() {
            return this.f12358d;
        }

        public int d() {
            return this.f12356b;
        }

        public C0083f(@N androidx.core.provider.f fVar, int i4, int i5) {
            this(fVar, i4, i5, null);
        }
    }
}

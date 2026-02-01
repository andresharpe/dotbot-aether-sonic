package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    private static final Class<?>[] f16937e = {Context.class, AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor<?>> f16938f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static final String f16939g = "intent";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16940h = "extra";

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Context f16941a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f16942b = new Object[2];

    /* renamed from: c, reason: collision with root package name */
    private n f16943c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f16944d;

    public m(@N Context context, n nVar) {
        this.f16941a = context;
        g(nVar);
    }

    private Preference a(@N String str, @P String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException, InflateException {
        Class<?> cls;
        Constructor<?> constructor = f16938f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f16941a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e4 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e5) {
                                e4 = e5;
                            }
                        }
                        if (cls == null) {
                            if (e4 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e4;
                        }
                        constructor = cls.getConstructor(f16937e);
                        constructor.setAccessible(true);
                        f16938f.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f16937e);
                    constructor.setAccessible(true);
                    f16938f.put(str, constructor);
                } catch (Exception e6) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e6);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e7) {
                throw e7;
            }
        }
        Object[] objArr = this.f16942b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return h(str, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e4) {
            throw e4;
        } catch (ClassNotFoundException e5) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e5);
            throw inflateException;
        } catch (Exception e6) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e6);
            throw inflateException2;
        }
    }

    private void g(n nVar) {
        this.f16943c = nVar;
        k(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    @N
    private PreferenceGroup i(PreferenceGroup preferenceGroup, @N PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.b0(this.f16943c);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    private void j(@N XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (f16939g.equals(name)) {
                        try {
                            preference.M0(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e4) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e4);
                            throw xmlPullParserException;
                        }
                    } else if (f16940h.equals(name)) {
                        c().getResources().parseBundleExtra(f16940h, attributeSet, preference.o());
                        try {
                            l(xmlPullParser);
                        } catch (IOException e5) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e5);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b4 = b(name, attributeSet);
                        ((PreferenceGroup) preference).m1(b4);
                        j(xmlPullParser, b4, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    private static void l(@N XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @N
    public Context c() {
        return this.f16941a;
    }

    public String[] d() {
        return this.f16944d;
    }

    @N
    public Preference e(int i4, @P PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i4);
        try {
            return f(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    @N
    public Preference f(XmlPullParser xmlPullParser, @P PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup i4;
        synchronized (this.f16942b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f16942b[0] = this.f16941a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e4) {
                    throw e4;
                } catch (IOException e5) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e5.getMessage());
                    inflateException.initCause(e5);
                    throw inflateException;
                } catch (XmlPullParserException e6) {
                    InflateException inflateException2 = new InflateException(e6.getMessage());
                    inflateException2.initCause(e6);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                i4 = i(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet));
                j(xmlPullParser, i4, asAttributeSet);
            } else {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return i4;
    }

    protected Preference h(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return a(str, this.f16944d, attributeSet);
    }

    public void k(String[] strArr) {
        this.f16944d = strArr;
    }
}

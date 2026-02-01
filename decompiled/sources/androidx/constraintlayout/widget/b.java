package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.h;
import com.spotify.sdk.android.auth.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: h, reason: collision with root package name */
    public static final String f9648h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f9649i = false;

    /* renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f9650a;

    /* renamed from: b, reason: collision with root package name */
    d f9651b;

    /* renamed from: c, reason: collision with root package name */
    int f9652c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f9653d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f9654e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f9655f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private f f9656g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f9657a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<C0069b> f9658b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f9659c;

        /* renamed from: d, reason: collision with root package name */
        d f9660d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f9659c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Tl);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Ul) {
                    this.f9657a = obtainStyledAttributes.getResourceId(index, this.f9657a);
                } else if (index == h.m.Vl) {
                    this.f9659c = obtainStyledAttributes.getResourceId(index, this.f9659c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9659c);
                    context.getResources().getResourceName(this.f9659c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f9660d = dVar;
                        dVar.G(context, this.f9659c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(C0069b c0069b) {
            this.f9658b.add(c0069b);
        }

        public int b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f9658b.size(); i4++) {
                if (this.f9658b.get(i4).a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0069b {

        /* renamed from: a, reason: collision with root package name */
        int f9661a;

        /* renamed from: b, reason: collision with root package name */
        float f9662b;

        /* renamed from: c, reason: collision with root package name */
        float f9663c;

        /* renamed from: d, reason: collision with root package name */
        float f9664d;

        /* renamed from: e, reason: collision with root package name */
        float f9665e;

        /* renamed from: f, reason: collision with root package name */
        int f9666f;

        /* renamed from: g, reason: collision with root package name */
        d f9667g;

        C0069b(Context context, XmlPullParser xmlPullParser) {
            this.f9662b = Float.NaN;
            this.f9663c = Float.NaN;
            this.f9664d = Float.NaN;
            this.f9665e = Float.NaN;
            this.f9666f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.go);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.ho) {
                    this.f9666f = obtainStyledAttributes.getResourceId(index, this.f9666f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9666f);
                    context.getResources().getResourceName(this.f9666f);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f9667g = dVar;
                        dVar.G(context, this.f9666f);
                    }
                } else if (index == h.m.io) {
                    this.f9665e = obtainStyledAttributes.getDimension(index, this.f9665e);
                } else if (index == h.m.jo) {
                    this.f9663c = obtainStyledAttributes.getDimension(index, this.f9663c);
                } else if (index == h.m.ko) {
                    this.f9664d = obtainStyledAttributes.getDimension(index, this.f9664d);
                } else if (index == h.m.lo) {
                    this.f9662b = obtainStyledAttributes.getDimension(index, this.f9662b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f4, float f5) {
            if (!Float.isNaN(this.f9662b) && f4 < this.f9662b) {
                return false;
            }
            if (!Float.isNaN(this.f9663c) && f5 < this.f9663c) {
                return false;
            }
            if (!Float.isNaN(this.f9664d) && f4 > this.f9664d) {
                return false;
            }
            if (!Float.isNaN(this.f9665e) && f5 > this.f9665e) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, ConstraintLayout constraintLayout, int i4) {
        this.f9650a = constraintLayout;
        a(context, i4);
    }

    private void a(Context context, int i4) {
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c4 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c4 = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c4 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c4 = 65535;
                            if (c4 != 2) {
                                if (c4 != 3) {
                                    if (c4 == 4) {
                                        c(context, xml);
                                    }
                                } else {
                                    C0069b c0069b = new C0069b(context, xml);
                                    if (aVar != null) {
                                        aVar.a(c0069b);
                                    }
                                }
                            } else {
                                aVar = new a(context, xml);
                                this.f9654e.put(aVar.f9657a, aVar);
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    private void c(Context context, XmlPullParser xmlPullParser) {
        int i4;
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeName = xmlPullParser.getAttributeName(i5);
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            if (attributeName != null && attributeValue != null && b.c.f48986a.equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i4 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), b.c.f48986a, context.getPackageName());
                } else {
                    i4 = -1;
                }
                if (i4 == -1) {
                    if (attributeValue.length() > 1) {
                        i4 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.z0(context, xmlPullParser);
                this.f9655f.put(i4, dVar);
                return;
            }
        }
    }

    public boolean b(int i4, float f4, float f5) {
        a aVar;
        int i5 = this.f9652c;
        if (i5 != i4) {
            return true;
        }
        if (i4 == -1) {
            aVar = this.f9654e.valueAt(0);
        } else {
            aVar = this.f9654e.get(i5);
        }
        a aVar2 = aVar;
        int i6 = this.f9653d;
        if ((i6 == -1 || !aVar2.f9658b.get(i6).a(f4, f5)) && this.f9653d != aVar2.b(f4, f5)) {
            return true;
        }
        return false;
    }

    public void d(f fVar) {
        this.f9656g = fVar;
    }

    public void e(int i4, float f4, float f5) {
        d dVar;
        int i5;
        a aVar;
        int b4;
        d dVar2;
        int i6;
        int i7 = this.f9652c;
        if (i7 == i4) {
            if (i4 == -1) {
                aVar = this.f9654e.valueAt(0);
            } else {
                aVar = this.f9654e.get(i7);
            }
            int i8 = this.f9653d;
            if ((i8 != -1 && aVar.f9658b.get(i8).a(f4, f5)) || this.f9653d == (b4 = aVar.b(f4, f5))) {
                return;
            }
            if (b4 == -1) {
                dVar2 = this.f9651b;
            } else {
                dVar2 = aVar.f9658b.get(b4).f9667g;
            }
            if (b4 == -1) {
                i6 = aVar.f9659c;
            } else {
                i6 = aVar.f9658b.get(b4).f9666f;
            }
            if (dVar2 == null) {
                return;
            }
            this.f9653d = b4;
            f fVar = this.f9656g;
            if (fVar != null) {
                fVar.b(-1, i6);
            }
            dVar2.r(this.f9650a);
            f fVar2 = this.f9656g;
            if (fVar2 != null) {
                fVar2.a(-1, i6);
                return;
            }
            return;
        }
        this.f9652c = i4;
        a aVar2 = this.f9654e.get(i4);
        int b5 = aVar2.b(f4, f5);
        if (b5 == -1) {
            dVar = aVar2.f9660d;
        } else {
            dVar = aVar2.f9658b.get(b5).f9667g;
        }
        if (b5 == -1) {
            i5 = aVar2.f9659c;
        } else {
            i5 = aVar2.f9658b.get(b5).f9666f;
        }
        if (dVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i4 + ", dim =" + f4 + ", " + f5);
            return;
        }
        this.f9653d = b5;
        f fVar3 = this.f9656g;
        if (fVar3 != null) {
            fVar3.b(i4, i5);
        }
        dVar.r(this.f9650a);
        f fVar4 = this.f9656g;
        if (fVar4 != null) {
            fVar4.a(i4, i5);
        }
    }
}

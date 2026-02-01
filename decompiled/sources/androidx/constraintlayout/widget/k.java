package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class k {

    /* renamed from: h, reason: collision with root package name */
    public static final String f11429h = "ConstraintLayoutStates";

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f11430i = false;

    /* renamed from: b, reason: collision with root package name */
    d f11432b;

    /* renamed from: a, reason: collision with root package name */
    int f11431a = -1;

    /* renamed from: c, reason: collision with root package name */
    int f11433c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f11434d = -1;

    /* renamed from: e, reason: collision with root package name */
    private SparseArray<a> f11435e = new SparseArray<>();

    /* renamed from: f, reason: collision with root package name */
    private SparseArray<d> f11436f = new SparseArray<>();

    /* renamed from: g, reason: collision with root package name */
    private f f11437g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f11438a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<b> f11439b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        int f11440c;

        /* renamed from: d, reason: collision with root package name */
        boolean f11441d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f11440c = -1;
            this.f11441d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.Tl);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.Ul) {
                    this.f11438a = obtainStyledAttributes.getResourceId(index, this.f11438a);
                } else if (index == h.m.Vl) {
                    this.f11440c = obtainStyledAttributes.getResourceId(index, this.f11440c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11440c);
                    context.getResources().getResourceName(this.f11440c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f11441d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f11439b.add(bVar);
        }

        public int b(float f4, float f5) {
            for (int i4 = 0; i4 < this.f11439b.size(); i4++) {
                if (this.f11439b.get(i4).a(f4, f5)) {
                    return i4;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f11442a;

        /* renamed from: b, reason: collision with root package name */
        float f11443b;

        /* renamed from: c, reason: collision with root package name */
        float f11444c;

        /* renamed from: d, reason: collision with root package name */
        float f11445d;

        /* renamed from: e, reason: collision with root package name */
        float f11446e;

        /* renamed from: f, reason: collision with root package name */
        int f11447f;

        /* renamed from: g, reason: collision with root package name */
        boolean f11448g;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f11443b = Float.NaN;
            this.f11444c = Float.NaN;
            this.f11445d = Float.NaN;
            this.f11446e = Float.NaN;
            this.f11447f = -1;
            this.f11448g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.go);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.ho) {
                    this.f11447f = obtainStyledAttributes.getResourceId(index, this.f11447f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f11447f);
                    context.getResources().getResourceName(this.f11447f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f11448g = true;
                    }
                } else if (index == h.m.io) {
                    this.f11446e = obtainStyledAttributes.getDimension(index, this.f11446e);
                } else if (index == h.m.jo) {
                    this.f11444c = obtainStyledAttributes.getDimension(index, this.f11444c);
                } else if (index == h.m.ko) {
                    this.f11445d = obtainStyledAttributes.getDimension(index, this.f11445d);
                } else if (index == h.m.lo) {
                    this.f11443b = obtainStyledAttributes.getDimension(index, this.f11443b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f4, float f5) {
            if (!Float.isNaN(this.f11443b) && f4 < this.f11443b) {
                return false;
            }
            if (!Float.isNaN(this.f11444c) && f5 < this.f11444c) {
                return false;
            }
            if (!Float.isNaN(this.f11445d) && f4 > this.f11445d) {
                return false;
            }
            if (!Float.isNaN(this.f11446e) && f5 > this.f11446e) {
                return false;
            }
            return true;
        }
    }

    public k(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.m.fm);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == h.m.gm) {
                this.f11431a = obtainStyledAttributes.getResourceId(index, this.f11431a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                char c4 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c4 = 2;
                                        break;
                                    }
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c4 = 0;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
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
                                if (c4 == 3) {
                                    b bVar = new b(context, xmlPullParser);
                                    if (aVar != null) {
                                        aVar.a(bVar);
                                    }
                                }
                            } else {
                                aVar = new a(context, xmlPullParser);
                                this.f11435e.put(aVar.f11438a, aVar);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
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

    public int a(int i4, int i5, float f4, float f5) {
        a aVar = this.f11435e.get(i5);
        if (aVar == null) {
            return i5;
        }
        if (f4 != -1.0f && f5 != -1.0f) {
            Iterator<b> it = aVar.f11439b.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(f4, f5)) {
                    if (i4 == next.f11447f) {
                        return i4;
                    }
                    bVar = next;
                }
            }
            if (bVar != null) {
                return bVar.f11447f;
            }
            return aVar.f11440c;
        }
        if (aVar.f11440c == i4) {
            return i4;
        }
        Iterator<b> it2 = aVar.f11439b.iterator();
        while (it2.hasNext()) {
            if (i4 == it2.next().f11447f) {
                return i4;
            }
        }
        return aVar.f11440c;
    }

    public boolean c(int i4, float f4, float f5) {
        a aVar;
        int i5 = this.f11433c;
        if (i5 != i4) {
            return true;
        }
        if (i4 == -1) {
            aVar = this.f11435e.valueAt(0);
        } else {
            aVar = this.f11435e.get(i5);
        }
        a aVar2 = aVar;
        int i6 = this.f11434d;
        if ((i6 == -1 || !aVar2.f11439b.get(i6).a(f4, f5)) && this.f11434d != aVar2.b(f4, f5)) {
            return true;
        }
        return false;
    }

    public void d(f fVar) {
        this.f11437g = fVar;
    }

    public int e(int i4, int i5, int i6) {
        return f(-1, i4, i5, i6);
    }

    public int f(int i4, int i5, float f4, float f5) {
        a aVar;
        if (i4 == i5) {
            if (i5 == -1) {
                aVar = this.f11435e.valueAt(0);
            } else {
                aVar = this.f11435e.get(this.f11433c);
            }
            if (aVar == null) {
                return -1;
            }
            if (this.f11434d != -1 && aVar.f11439b.get(i4).a(f4, f5)) {
                return i4;
            }
            int b4 = aVar.b(f4, f5);
            if (i4 == b4) {
                return i4;
            }
            if (b4 == -1) {
                return aVar.f11440c;
            }
            return aVar.f11439b.get(b4).f11447f;
        }
        a aVar2 = this.f11435e.get(i5);
        if (aVar2 == null) {
            return -1;
        }
        int b5 = aVar2.b(f4, f5);
        if (b5 == -1) {
            return aVar2.f11440c;
        }
        return aVar2.f11439b.get(b5).f11447f;
    }
}

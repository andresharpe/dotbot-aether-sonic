package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8657b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f8658c = "CustomMethod";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8659d = "CustomAttribute";

    /* renamed from: e, reason: collision with root package name */
    static HashMap<String, Constructor<? extends f>> f8660e = null;

    /* renamed from: f, reason: collision with root package name */
    private static final String f8661f = "KeyFrames";

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, ArrayList<f>> f8662a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends f>> hashMap = new HashMap<>();
        f8660e = hashMap;
        try {
            hashMap.put("KeyAttribute", g.class.getConstructor(new Class[0]));
            f8660e.put(v.g.f7518a, j.class.getConstructor(new Class[0]));
            f8660e.put(v.c.f7435a, h.class.getConstructor(new Class[0]));
            f8660e.put("KeyTimeCycle", l.class.getConstructor(new Class[0]));
            f8660e.put(v.i.f7555a, m.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e4) {
            Log.e(f8661f, "unable to load", e4);
        }
    }

    public i() {
    }

    static String f(int i4, Context context) {
        return context.getResources().getResourceEntryName(i4);
    }

    public void a(o oVar) {
        ArrayList<f> arrayList = this.f8662a.get(-1);
        if (arrayList != null) {
            oVar.b(arrayList);
        }
    }

    public void b(o oVar) {
        ArrayList<f> arrayList = this.f8662a.get(Integer.valueOf(oVar.f8880c));
        if (arrayList != null) {
            oVar.b(arrayList);
        }
        ArrayList<f> arrayList2 = this.f8662a.get(-1);
        if (arrayList2 != null) {
            Iterator<f> it = arrayList2.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next.g(((ConstraintLayout.b) oVar.f8879b.getLayoutParams()).f9524c0)) {
                    oVar.a(next);
                }
            }
        }
    }

    public void c(f fVar) {
        if (!this.f8662a.containsKey(Integer.valueOf(fVar.f8557b))) {
            this.f8662a.put(Integer.valueOf(fVar.f8557b), new ArrayList<>());
        }
        ArrayList<f> arrayList = this.f8662a.get(Integer.valueOf(fVar.f8557b));
        if (arrayList != null) {
            arrayList.add(fVar);
        }
    }

    public ArrayList<f> d(int i4) {
        return this.f8662a.get(Integer.valueOf(i4));
    }

    public Set<Integer> e() {
        return this.f8662a.keySet();
    }

    public i(Context context, XmlPullParser xmlPullParser) {
        Exception e4;
        f fVar;
        Constructor<? extends f> constructor;
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            f fVar2 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && A.f8470z.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f8660e.containsKey(name)) {
                        try {
                            constructor = f8660e.get(name);
                        } catch (Exception e5) {
                            f fVar3 = fVar2;
                            e4 = e5;
                            fVar = fVar3;
                        }
                        if (constructor != null) {
                            fVar = constructor.newInstance(new Object[0]);
                            try {
                                fVar.f(context, Xml.asAttributeSet(xmlPullParser));
                                c(fVar);
                            } catch (Exception e6) {
                                e4 = e6;
                                Log.e(f8661f, "unable to create ", e4);
                                fVar2 = fVar;
                                eventType = xmlPullParser.next();
                            }
                            fVar2 = fVar;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                            break;
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (fVar2 != null && (hashMap2 = fVar2.f8560e) != null) {
                            ConstraintAttribute.q(context, xmlPullParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && fVar2 != null && (hashMap = fVar2.f8560e) != null) {
                        ConstraintAttribute.q(context, xmlPullParser, hashMap);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }
}

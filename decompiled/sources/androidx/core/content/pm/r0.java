package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12313a = "ShortcutXmlParser";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12314b = "android.app.shortcuts";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12315c = "shortcut";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12316d = "shortcutId";

    /* renamed from: e, reason: collision with root package name */
    private static volatile ArrayList<String> f12317e;

    /* renamed from: f, reason: collision with root package name */
    private static final Object f12318f = new Object();

    private r0() {
    }

    private static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        if (attributeValue == null) {
            return xmlPullParser.getAttributeValue(null, str);
        }
        return attributeValue;
    }

    @androidx.annotation.j0
    @androidx.annotation.N
    public static List<String> b(@androidx.annotation.N Context context) {
        if (f12317e == null) {
            synchronized (f12318f) {
                try {
                    if (f12317e == null) {
                        f12317e = new ArrayList<>();
                        f12317e.addAll(e(context));
                    }
                } finally {
                }
            }
        }
        return f12317e;
    }

    @androidx.annotation.N
    private static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f12314b);
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @androidx.annotation.i0
    @androidx.annotation.N
    public static List<String> d(@androidx.annotation.N XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String a4;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f12315c.equals(name) && (a4 = a(xmlPullParser, f12316d)) != null) {
                arrayList.add(a4);
            }
        }
        return arrayList;
    }

    @androidx.annotation.N
    private static Set<String> e(@androidx.annotation.N Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f12314b)) {
                        XmlResourceParser c4 = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(c4));
                            if (c4 != null) {
                                c4.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e4) {
                Log.e(f12313a, "Failed to parse the Xml resource: ", e4);
            }
        }
        return hashSet;
    }
}

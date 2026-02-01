package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0591d extends DataSetObservable {

    /* renamed from: A, reason: collision with root package name */
    private static final Object f6144A = new Object();

    /* renamed from: B, reason: collision with root package name */
    private static final Map<String, C0591d> f6145B = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    static final boolean f6146n = false;

    /* renamed from: o, reason: collision with root package name */
    static final String f6147o = "d";

    /* renamed from: p, reason: collision with root package name */
    static final String f6148p = "historical-records";

    /* renamed from: q, reason: collision with root package name */
    static final String f6149q = "historical-record";

    /* renamed from: r, reason: collision with root package name */
    static final String f6150r = "activity";

    /* renamed from: s, reason: collision with root package name */
    static final String f6151s = "time";

    /* renamed from: t, reason: collision with root package name */
    static final String f6152t = "weight";

    /* renamed from: u, reason: collision with root package name */
    public static final String f6153u = "activity_choser_model_history.xml";

    /* renamed from: v, reason: collision with root package name */
    public static final int f6154v = 50;

    /* renamed from: w, reason: collision with root package name */
    private static final int f6155w = 5;

    /* renamed from: x, reason: collision with root package name */
    private static final float f6156x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    private static final String f6157y = ".xml";

    /* renamed from: z, reason: collision with root package name */
    private static final int f6158z = -1;

    /* renamed from: d, reason: collision with root package name */
    final Context f6162d;

    /* renamed from: e, reason: collision with root package name */
    final String f6163e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f6164f;

    /* renamed from: m, reason: collision with root package name */
    private f f6171m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f6159a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final List<b> f6160b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f6161c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private c f6165g = new C0050d();

    /* renamed from: h, reason: collision with root package name */
    private int f6166h = 50;

    /* renamed from: i, reason: collision with root package name */
    boolean f6167i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6168j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6169k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6170l = false;

    /* renamed from: androidx.appcompat.widget.d$a */
    /* loaded from: classes.dex */
    public interface a {
        void setActivityChooserModel(C0591d c0591d);
    }

    /* renamed from: androidx.appcompat.widget.d$b */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: E, reason: collision with root package name */
        public final ResolveInfo f6172E;

        /* renamed from: F, reason: collision with root package name */
        public float f6173F;

        public b(ResolveInfo resolveInfo) {
            this.f6172E = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f6173F) - Float.floatToIntBits(this.f6173F);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f6173F) == Float.floatToIntBits(((b) obj).f6173F)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f6173F) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f6172E.toString() + "; weight:" + new BigDecimal(this.f6173F) + "]";
        }
    }

    /* renamed from: androidx.appcompat.widget.d$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0050d implements c {

        /* renamed from: b, reason: collision with root package name */
        private static final float f6174b = 0.95f;

        /* renamed from: a, reason: collision with root package name */
        private final Map<ComponentName, b> f6175a = new HashMap();

        C0050d() {
        }

        @Override // androidx.appcompat.widget.C0591d.c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f6175a;
            map.clear();
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = list.get(i4);
                bVar.f6173F = 0.0f;
                ActivityInfo activityInfo = bVar.f6172E.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f4 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f6176a);
                if (bVar2 != null) {
                    bVar2.f6173F += eVar.f6178c * f4;
                    f4 *= f6174b;
                }
            }
            Collections.sort(list);
        }
    }

    /* renamed from: androidx.appcompat.widget.d$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f6176a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6177b;

        /* renamed from: c, reason: collision with root package name */
        public final float f6178c;

        public e(String str, long j4, float f4) {
            this(ComponentName.unflattenFromString(str), j4, f4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f6176a;
            if (componentName == null) {
                if (eVar.f6176a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f6176a)) {
                return false;
            }
            if (this.f6177b == eVar.f6177b && Float.floatToIntBits(this.f6178c) == Float.floatToIntBits(eVar.f6178c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ComponentName componentName = this.f6176a;
            if (componentName == null) {
                hashCode = 0;
            } else {
                hashCode = componentName.hashCode();
            }
            long j4 = this.f6177b;
            return ((((hashCode + 31) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + Float.floatToIntBits(this.f6178c);
        }

        public String toString() {
            return "[; activity:" + this.f6176a + "; time:" + this.f6177b + "; weight:" + new BigDecimal(this.f6178c) + "]";
        }

        public e(ComponentName componentName, long j4, float f4) {
            this.f6176a = componentName;
            this.f6177b = j4;
            this.f6178c = f4;
        }
    }

    /* renamed from: androidx.appcompat.widget.d$f */
    /* loaded from: classes.dex */
    public interface f {
        boolean a(C0591d c0591d, Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.d$g */
    /* loaded from: classes.dex */
    public final class g extends AsyncTask<Object, Void, Void> {
        g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
        
            if (r15 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00d7, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        
            if (r15 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        
            if (r15 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
        
            if (r15 == null) goto L33;
         */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0591d.g.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private C0591d(Context context, String str) {
        this.f6162d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(f6157y)) {
            this.f6163e = str + f6157y;
            return;
        }
        this.f6163e = str;
    }

    private boolean a(e eVar) {
        boolean add = this.f6161c.add(eVar);
        if (add) {
            this.f6169k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return add;
    }

    private void c() {
        boolean l4 = l() | o();
        n();
        if (l4) {
            v();
            notifyChanged();
        }
    }

    public static C0591d d(Context context, String str) {
        C0591d c0591d;
        synchronized (f6144A) {
            try {
                Map<String, C0591d> map = f6145B;
                c0591d = map.get(str);
                if (c0591d == null) {
                    c0591d = new C0591d(context, str);
                    map.put(str, c0591d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0591d;
    }

    private boolean l() {
        if (!this.f6170l || this.f6164f == null) {
            return false;
        }
        this.f6170l = false;
        this.f6160b.clear();
        List<ResolveInfo> queryIntentActivities = this.f6162d.getPackageManager().queryIntentActivities(this.f6164f, 0);
        int size = queryIntentActivities.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f6160b.add(new b(queryIntentActivities.get(i4)));
        }
        return true;
    }

    private void m() {
        if (this.f6168j) {
            if (!this.f6169k) {
                return;
            }
            this.f6169k = false;
            if (!TextUtils.isEmpty(this.f6163e)) {
                new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f6161c), this.f6163e);
                return;
            }
            return;
        }
        throw new IllegalStateException("No preceding call to #readHistoricalData");
    }

    private void n() {
        int size = this.f6161c.size() - this.f6166h;
        if (size <= 0) {
            return;
        }
        this.f6169k = true;
        for (int i4 = 0; i4 < size; i4++) {
            this.f6161c.remove(0);
        }
    }

    private boolean o() {
        if (!this.f6167i || !this.f6169k || TextUtils.isEmpty(this.f6163e)) {
            return false;
        }
        this.f6167i = false;
        this.f6168j = true;
        p();
        return true;
    }

    private void p() {
        FileInputStream openFileInput;
        XmlPullParser newPullParser;
        try {
            try {
                openFileInput = this.f6162d.openFileInput(this.f6163e);
                try {
                    newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i4 = 0; i4 != 1 && i4 != 2; i4 = newPullParser.next()) {
                    }
                } catch (IOException e4) {
                    Log.e(f6147o, "Error reading historical recrod file: " + this.f6163e, e4);
                    if (openFileInput == null) {
                        return;
                    }
                } catch (XmlPullParserException e5) {
                    Log.e(f6147o, "Error reading historical recrod file: " + this.f6163e, e5);
                    if (openFileInput == null) {
                        return;
                    }
                }
                if (f6148p.equals(newPullParser.getName())) {
                    List<e> list = this.f6161c;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            if (openFileInput == null) {
                                return;
                            }
                        } else if (next != 3 && next != 4) {
                            if (f6149q.equals(newPullParser.getName())) {
                                list.add(new e(newPullParser.getAttributeValue(null, f6150r), Long.parseLong(newPullParser.getAttributeValue(null, f6151s)), Float.parseFloat(newPullParser.getAttributeValue(null, f6152t))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (FileNotFoundException unused2) {
            }
        } catch (Throwable th) {
            if (openFileInput != null) {
                try {
                    openFileInput.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    private boolean v() {
        if (this.f6165g != null && this.f6164f != null && !this.f6160b.isEmpty() && !this.f6161c.isEmpty()) {
            this.f6165g.a(this.f6164f, this.f6160b, Collections.unmodifiableList(this.f6161c));
            return true;
        }
        return false;
    }

    public Intent b(int i4) {
        synchronized (this.f6159a) {
            try {
                if (this.f6164f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f6160b.get(i4).f6172E.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f6164f);
                intent.setComponent(componentName);
                if (this.f6171m != null) {
                    if (this.f6171m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo e(int i4) {
        ResolveInfo resolveInfo;
        synchronized (this.f6159a) {
            c();
            resolveInfo = this.f6160b.get(i4).f6172E;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f6159a) {
            c();
            size = this.f6160b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f6159a) {
            try {
                c();
                List<b> list = this.f6160b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (list.get(i4).f6172E == resolveInfo) {
                        return i4;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f6159a) {
            try {
                c();
                if (!this.f6160b.isEmpty()) {
                    return this.f6160b.get(0).f6172E;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int i4;
        synchronized (this.f6159a) {
            i4 = this.f6166h;
        }
        return i4;
    }

    public int j() {
        int size;
        synchronized (this.f6159a) {
            c();
            size = this.f6161c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f6159a) {
            intent = this.f6164f;
        }
        return intent;
    }

    public void q(c cVar) {
        synchronized (this.f6159a) {
            try {
                if (this.f6165g == cVar) {
                    return;
                }
                this.f6165g = cVar;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i4) {
        float f4;
        synchronized (this.f6159a) {
            try {
                c();
                b bVar = this.f6160b.get(i4);
                b bVar2 = this.f6160b.get(0);
                if (bVar2 != null) {
                    f4 = (bVar2.f6173F - bVar.f6173F) + 5.0f;
                } else {
                    f4 = 1.0f;
                }
                ActivityInfo activityInfo = bVar.f6172E.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f4));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i4) {
        synchronized (this.f6159a) {
            try {
                if (this.f6166h == i4) {
                    return;
                }
                this.f6166h = i4;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f6159a) {
            try {
                if (this.f6164f == intent) {
                    return;
                }
                this.f6164f = intent;
                this.f6170l = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f6159a) {
            this.f6171m = fVar;
        }
    }
}
